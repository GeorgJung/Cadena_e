package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers;

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
public class GraphicalProcessEditorModelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser processName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getProcessName_5001Parser() {
		if (processName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
					.getProcess_Name() };
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.parsers.MessageFormatParser parser = new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.parsers.MessageFormatParser(
					features);
			processName_5001Parser = parser;
		}
		return processName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser transactionValue_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransactionValue_6001Parser() {
		if (transactionValue_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
					.getTransaction_Value() };
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.parsers.MessageFormatParser parser = new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.parsers.MessageFormatParser(
					features);
			transactionValue_6001Parser = parser;
		}
		return transactionValue_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessNameEditPart.VISUAL_ID:
			return getProcessName_5001Parser();
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionValueEditPart.VISUAL_ID:
			return getTransactionValue_6001Parser();
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
			return getParser(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
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
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes
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
