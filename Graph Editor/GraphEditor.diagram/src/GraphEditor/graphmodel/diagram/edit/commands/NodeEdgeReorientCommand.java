package GraphEditor.graphmodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class NodeEdgeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public NodeEdgeReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof GraphEditor.graphmodel.Node) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof GraphEditor.graphmodel.Node && newEnd instanceof GraphEditor.graphmodel.Node)) {
			return false;
		}
		return GraphEditor.graphmodel.diagram.edit.policies.GraphModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistNodeEdge_4001(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof GraphEditor.graphmodel.Node && newEnd instanceof GraphEditor.graphmodel.Node)) {
			return false;
		}
		return GraphEditor.graphmodel.diagram.edit.policies.GraphModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistNodeEdge_4001(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getEdge().remove(getOldTarget());
		getNewSource().getEdge().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getEdge().remove(getOldTarget());
		getOldSource().getEdge().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected GraphEditor.graphmodel.Node getOldSource() {
		return (GraphEditor.graphmodel.Node) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected GraphEditor.graphmodel.Node getNewSource() {
		return (GraphEditor.graphmodel.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected GraphEditor.graphmodel.Node getOldTarget() {
		return (GraphEditor.graphmodel.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GraphEditor.graphmodel.Node getNewTarget() {
		return (GraphEditor.graphmodel.Node) newEnd;
	}
}
