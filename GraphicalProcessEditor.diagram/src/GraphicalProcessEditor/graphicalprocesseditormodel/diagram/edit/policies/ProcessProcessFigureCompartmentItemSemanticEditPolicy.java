package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ProcessProcessFigureCompartmentItemSemanticEditPolicy
		extends
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies.GraphicalProcessEditorModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessProcessFigureCompartmentItemSemanticEditPolicy() {
		super(
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Process_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.InputPort_3001 == req
				.getElementType()) {
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.InputPortCreateCommand(
					req));
		}
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.OutputPort_3002 == req
				.getElementType()) {
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.OutputPortCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
