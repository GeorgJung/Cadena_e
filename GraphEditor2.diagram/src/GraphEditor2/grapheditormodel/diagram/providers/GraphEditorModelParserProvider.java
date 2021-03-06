package GraphEditor2.grapheditormodel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GraphEditorModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser nodeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5001Parser() {
		if (nodeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GraphEditor2.grapheditormodel.GrapheditormodelPackage.eINSTANCE
					.getNode_Name() };
			GraphEditor2.grapheditormodel.diagram.parsers.MessageFormatParser parser = new GraphEditor2.grapheditormodel.diagram.parsers.MessageFormatParser(
					features);
			nodeName_5001Parser = parser;
		}
		return nodeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser edgeValue_6001Parser;

	/**
	 * @generated
	 */
	private IParser getEdgeValue_6001Parser() {
		if (edgeValue_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { GraphEditor2.grapheditormodel.GrapheditormodelPackage.eINSTANCE
					.getEdge_Value() };
			GraphEditor2.grapheditormodel.diagram.parsers.MessageFormatParser parser = new GraphEditor2.grapheditormodel.diagram.parsers.MessageFormatParser(
					features);
			edgeValue_6001Parser = parser;
		}
		return edgeValue_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GraphEditor2.grapheditormodel.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
			return getNodeName_5001Parser();
		case GraphEditor2.grapheditormodel.diagram.edit.parts.EdgeValueEditPart.VISUAL_ID:
			return getEdgeValue_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GraphEditor2.grapheditormodel.diagram.providers.GraphEditorModelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
