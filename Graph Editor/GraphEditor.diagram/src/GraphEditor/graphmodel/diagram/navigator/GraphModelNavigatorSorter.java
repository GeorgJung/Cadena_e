package GraphEditor.graphmodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GraphModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem) {
			GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem item = (GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem) element;
			return GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
