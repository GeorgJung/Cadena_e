package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class GraphicalProcessEditorModelEditPartFactory implements
		EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getVisualID(view)) {

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.NodeEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.NodeNameEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.EdgeEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.EdgeValueEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.EdgeValueEditPart(
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
