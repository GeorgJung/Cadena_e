package GraphEditor.graphmodel.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class GraphModelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GraphEditor.graphmodel.diagram.part.GraphModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GraphEditor.graphmodel.diagram.part.GraphModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem
				&& !isOwnView(((GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorGroup) {
			GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorGroup group = (GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorGroup) element;
			return GraphEditor.graphmodel.diagram.part.GraphModelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem) {
			GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem navigatorItem = (GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.graphmodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://graphmodel/1.0?Node", GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.Node_2001); //$NON-NLS-1$
		case GraphEditor.graphmodel.diagram.edit.parts.NodeEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://graphmodel/1.0?Node?Edge", GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.NodeEdge_4001); //$NON-NLS-1$
		case GraphEditor.graphmodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://graphmodel/1.0?Graph", GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.Graph_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GraphEditor.graphmodel.diagram.part.GraphModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes
						.isKnownElementType(elementType)) {
			image = GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorGroup) {
			GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorGroup group = (GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem) {
			GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem navigatorItem = (GraphEditor.graphmodel.diagram.navigator.GraphModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.graphmodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001Text(view);
		case GraphEditor.graphmodel.diagram.edit.parts.NodeEdgeEditPart.VISUAL_ID:
			return getNodeEdge_4001Text(view);
		case GraphEditor.graphmodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getGraph_1000Text(View view) {
		GraphEditor.graphmodel.Graph domainModelElement = (GraphEditor.graphmodel.Graph) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			GraphEditor.graphmodel.diagram.part.GraphModelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2001Text(View view) {
		IParser parser = GraphEditor.graphmodel.diagram.providers.GraphModelParserProvider
				.getParser(
						GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.Node_2001,
						view.getElement() != null ? view.getElement() : view,
						GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
								.getType(GraphEditor.graphmodel.diagram.edit.parts.NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GraphEditor.graphmodel.diagram.part.GraphModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeEdge_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GraphEditor.graphmodel.diagram.edit.parts.GraphEditPart.MODEL_ID
				.equals(GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
						.getModelID(view));
	}

}
