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
public class TransactionReorientCommand extends EditElementCommand {

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
	public TransactionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) {
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
		if (!(oldEnd instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Node && newEnd instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Node)) {
			return false;
		}
		GraphicalProcessEditor.graphicalprocesseditormodel.Node target = getLink()
				.getTarget();
		if (!(getLink().eContainer() instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Node)) {
			return false;
		}
		GraphicalProcessEditor.graphicalprocesseditormodel.Node container = (GraphicalProcessEditor.graphicalprocesseditormodel.Node) getLink()
				.eContainer();
		return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies.GraphicalProcessEditorModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistTransaction_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Node && newEnd instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Node)) {
			return false;
		}
		GraphicalProcessEditor.graphicalprocesseditormodel.Node source = getLink()
				.getSource();
		if (!(getLink().eContainer() instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Node)) {
			return false;
		}
		GraphicalProcessEditor.graphicalprocesseditormodel.Node container = (GraphicalProcessEditor.graphicalprocesseditormodel.Node) getLink()
				.eContainer();
		return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.policies.GraphicalProcessEditorModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistTransaction_4001(container,
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
		getLink().setSource(getNewSource());
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
	protected GraphicalProcessEditor.graphicalprocesseditormodel.Transaction getLink() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.Node getOldSource() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.Node getNewSource() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.Node getOldTarget() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.Node getNewTarget() {
		return (GraphicalProcessEditor.graphicalprocesseditormodel.Node) newEnd;
	}
}
