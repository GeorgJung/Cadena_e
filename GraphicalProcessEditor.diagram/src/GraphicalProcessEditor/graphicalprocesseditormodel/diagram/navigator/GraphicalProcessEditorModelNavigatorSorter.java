package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GraphicalProcessEditorModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) {
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem item = (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
