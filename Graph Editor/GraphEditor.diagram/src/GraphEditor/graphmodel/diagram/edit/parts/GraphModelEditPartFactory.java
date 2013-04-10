package GraphEditor.graphmodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class GraphModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
					.getVisualID(view)) {

			case GraphEditor.graphmodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
				return new GraphEditor.graphmodel.diagram.edit.parts.GraphEditPart(
						view);

			case GraphEditor.graphmodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
				return new GraphEditor.graphmodel.diagram.edit.parts.NodeEditPart(
						view);

			case GraphEditor.graphmodel.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
				return new GraphEditor.graphmodel.diagram.edit.parts.NodeNameEditPart(
						view);

			case GraphEditor.graphmodel.diagram.edit.parts.NodeEdgeEditPart.VISUAL_ID:
				return new GraphEditor.graphmodel.diagram.edit.parts.NodeEdgeEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
