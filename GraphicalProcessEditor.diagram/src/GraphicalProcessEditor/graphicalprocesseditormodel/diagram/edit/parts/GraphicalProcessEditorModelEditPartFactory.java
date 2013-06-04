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

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessNameEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessNameEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPortEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessProcessFigureCompartmentEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessProcessFigureCompartmentEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionValueEditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionValueEditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPort2EditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPort2EditPart(
						view);

			case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPort2EditPart.VISUAL_ID:
				return new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPort2EditPart(
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
