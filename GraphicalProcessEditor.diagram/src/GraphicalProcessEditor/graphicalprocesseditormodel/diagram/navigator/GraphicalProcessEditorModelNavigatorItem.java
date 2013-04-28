package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GraphicalProcessEditorModelNavigatorItem
		extends
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public GraphicalProcessEditorModelNavigatorItem(View view, Object parent,
			boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
