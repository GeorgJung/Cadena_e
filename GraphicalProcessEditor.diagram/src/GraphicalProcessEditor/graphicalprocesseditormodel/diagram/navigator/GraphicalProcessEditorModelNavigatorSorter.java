package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GraphicalProcessEditorModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) {
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem item = (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) element;
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
