package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class InputPort2ItemSemanticEditPolicy
		extends
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies.GraphicalProcessEditorModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InputPort2ItemSemanticEditPolicy() {
		super(
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.InputPort_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4003 == req
				.getElementType()) {
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.TransactionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4003 == req
				.getElementType()) {
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.TransactionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.TransactionReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
