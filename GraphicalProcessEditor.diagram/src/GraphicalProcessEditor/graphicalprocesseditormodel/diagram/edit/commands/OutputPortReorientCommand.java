package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.commands;

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
public class OutputPortReorientCommand extends EditElementCommand {

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
	public OutputPortReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof GraphicalProcessEditor.graphicalprocesseditormodel.OutputPort) {
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
		if (!(oldEnd instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Transaction && newEnd instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Transaction)) {
			return false;
		}
		if (getLink().getTransactions().size() != 1) {
			return false;
		}
		GraphicalProcessEditor.graphicalprocesseditormodel.Transaction target = (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) getLink()
				.getTransactions().get(0);
		if (!(getLink().eContainer() instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Process)) {
			return false;
		}
		GraphicalProcessEditor.graphicalprocesseditormodel.Process container = (GraphicalProcessEditor.graphicalprocesseditormodel.Process) getLink()
				.eContainer();
		return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies.GraphicalProcessEditorModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistOutputPort_4002(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Transaction && newEnd instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Transaction)) {
			return false;
		}
		if (getLink().getTransactions().size() != 1) {
			return false;
		}
		GraphicalProcessEditor.graphicalprocesseditormodel.Transaction source = (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) getLink()
				.getTransactions().get(0);
		if (!(getLink().eContainer() instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Process)) {
			return false;
		}
		GraphicalProcessEditor.graphicalprocesseditormodel.Process container = (GraphicalProcessEditor.graphicalprocesseditormodel.Process) getLink()
				.eContainer();
		return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies.GraphicalProcessEditorModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistOutputPort_4002(container,
						getLink(), source, getNewTarget());
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
		getLink().getTransactions().remove(getOldSource());
		getLink().getTransactions().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getTransactions().remove(getOldTarget());
		getLink().getTransactions().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.OutputPort getLink() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.OutputPort) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.Transaction getOldSource() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.Transaction getNewSource() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) newEnd;
	}

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.Transaction getOldTarget() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.Transaction getNewTarget() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) newEnd;
	}
}
