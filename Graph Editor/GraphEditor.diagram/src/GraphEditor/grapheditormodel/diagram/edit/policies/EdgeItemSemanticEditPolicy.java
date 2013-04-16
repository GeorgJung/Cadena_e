package GraphEditor.grapheditormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class EdgeItemSemanticEditPolicy
		extends
		GraphEditor.grapheditormodel.diagram.edit.policies.GraphEditorModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EdgeItemSemanticEditPolicy() {
		super(
				GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
