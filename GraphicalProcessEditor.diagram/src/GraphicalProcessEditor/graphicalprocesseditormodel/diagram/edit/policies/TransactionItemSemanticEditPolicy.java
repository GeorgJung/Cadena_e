package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class TransactionItemSemanticEditPolicy
		extends
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies.GraphicalProcessEditorModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransactionItemSemanticEditPolicy() {
		super(
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4003);
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
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.InputPort_4001 == req
				.getElementType()) {
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.InputPort2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.OutputPort_4002 == req
				.getElementType()) {
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.OutputPort2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.InputPort_4001 == req
				.getElementType()) {
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.InputPort2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.OutputPort_4002 == req
				.getElementType()) {
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.OutputPort2CreateCommand(
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
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPort2EditPart.VISUAL_ID:
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.InputPortReorientCommand(
					req));
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPort2EditPart.VISUAL_ID:
			return getGEFWrapper(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands.OutputPortReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
