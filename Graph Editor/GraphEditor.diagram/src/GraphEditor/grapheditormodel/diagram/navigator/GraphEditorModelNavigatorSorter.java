package GraphEditor.grapheditormodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GraphEditorModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem) {
			GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem item = (GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem) element;
			return GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
