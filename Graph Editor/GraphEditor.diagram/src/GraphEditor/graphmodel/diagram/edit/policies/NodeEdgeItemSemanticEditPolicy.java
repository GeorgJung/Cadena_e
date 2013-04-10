package GraphEditor.graphmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class NodeEdgeItemSemanticEditPolicy
		extends
		GraphEditor.graphmodel.diagram.edit.policies.GraphModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeEdgeItemSemanticEditPolicy() {
		super(
				GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.NodeEdge_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
