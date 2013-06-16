package behavioralmodeltranslator;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Translator {

	public boolean contains(String[] list, String elem) {
		for (String e : list) {
			if (e.equals(elem))
				return true;
		}
		return false;
	}

	public void run() {

		try {

			int startState;
			String[] endStates;
			NodeList states;
			File pml = new File("output.pml");
			pml.createNewFile();

			Writer writer = new BufferedWriter(new FileWriter(pml));
			writer.write("active proctype Graph() {\n");

			File xmlFile = new File("test.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);

			// optional, but recommended
			// read this -
			// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			states = doc.getElementsByTagName("Processes");
			startState = Integer.parseInt(""
					+ (doc.getDocumentElement().getAttribute("Start")
							.charAt(13)));

			endStates = doc.getDocumentElement().getAttribute("End").split(" ");
			for (int i = 0; i < endStates.length; i++) {
				endStates[i] = endStates[i].substring(13);
			}
			boolean loop = true;
			boolean start = true;
			int i = startState;
			int target;
			boolean putIf;

			while (loop) {

				if ((i == startState && start) || (i != startState && !start)) {
					Element state = (Element) states.item(i);
					writer.write(state.getAttribute("Name") + ":\n");
					NodeList outPorts = state
							.getElementsByTagName("OutputPorts");
					putIf = false;
					for (int j = 0; j < outPorts.getLength(); j++) {
						Element outPort = (Element) outPorts.item(j);
						NodeList transactions = outPort
								.getElementsByTagName("Transactions");

						if (transactions.getLength() != 0) {
							if (!putIf) {
								writer.write("if\n");
								putIf = true;
							}
							for (int k = 0; k < transactions.getLength(); k++) {

								Element transaction = (Element) transactions
										.item(k);
								target = Integer.parseInt(transaction
										.getAttribute("Target").substring(13));
								writer.write(":: skip -> goto "
										+ ((Element) states.item(target))
												.getAttribute("Name") + "\n");
							}
						}
					}
					if (putIf)
						writer.write("fi;\n");
					writer.write("\n");
					if (i != 0 && start) {
						i = 0;
					} else {
						i++;
					}

				}
				if (i == states.getLength() && !start)
					loop = false;
				start = false;
			}
			writer.write("}");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Translator().run();
		System.out.println("output.pml is produced");
	}

}
