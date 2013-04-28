package GraphEditor2.grapheditormodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EdgeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public EdgeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof GraphEditor2.grapheditormodel.Edge) {
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
		if (!(oldEnd instanceof GraphEditor2.grapheditormodel.Node && newEnd instanceof GraphEditor2.grapheditormodel.Node)) {
			return false;
		}
		GraphEditor2.grapheditormodel.Node target = getLink().getTarget();
		return GraphEditor2.grapheditormodel.diagram.edit.policies.GraphEditorModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEdge_4001(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof GraphEditor2.grapheditormodel.Node && newEnd instanceof GraphEditor2.grapheditormodel.Node)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof GraphEditor2.grapheditormodel.Node)) {
			return false;
		}
		GraphEditor2.grapheditormodel.Node source = (GraphEditor2.grapheditormodel.Node) getLink()
				.eContainer();
		return GraphEditor2.grapheditormodel.diagram.edit.policies.GraphEditorModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEdge_4001(getLink(), source,
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
		getOldSource().getOutGoingEdges().remove(getLink());
		getNewSource().getOutGoingEdges().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected GraphEditor2.grapheditormodel.Edge getLink() {
		return (GraphEditor2.grapheditormodel.Edge) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected GraphEditor2.grapheditormodel.Node getOldSource() {
		return (GraphEditor2.grapheditormodel.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GraphEditor2.grapheditormodel.Node getNewSource() {
		return (GraphEditor2.grapheditormodel.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected GraphEditor2.grapheditormodel.Node getOldTarget() {
		return (GraphEditor2.grapheditormodel.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GraphEditor2.grapheditormodel.Node getNewTarget() {
		return (GraphEditor2.grapheditormodel.Node) newEnd;
	}
}
