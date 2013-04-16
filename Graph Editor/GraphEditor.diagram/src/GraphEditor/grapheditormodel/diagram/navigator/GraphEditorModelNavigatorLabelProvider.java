package GraphEditor.grapheditormodel.diagram.navigator;

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
public class GraphEditorModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem
				&& !isOwnView(((GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem) element)
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
		if (element instanceof GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorGroup) {
			GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorGroup group = (GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorGroup) element;
			return GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem) {
			GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem navigatorItem = (GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem) element;
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
		switch (GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.grapheditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://grapheditormodel/1.0?Graph", GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Graph_1000); //$NON-NLS-1$
		case GraphEditor.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://grapheditormodel/1.0?Node", GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Node_2001); //$NON-NLS-1$
		case GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://grapheditormodel/1.0?Edge", GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes
						.isKnownElementType(elementType)) {
			image = GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes
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
		if (element instanceof GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorGroup) {
			GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorGroup group = (GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem) {
			GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem navigatorItem = (GraphEditor.grapheditormodel.diagram.navigator.GraphEditorModelNavigatorItem) element;
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
		switch (GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.grapheditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000Text(view);
		case GraphEditor.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001Text(view);
		case GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getGraph_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNode_2001Text(View view) {
		IParser parser = GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelParserProvider
				.getParser(
						GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Node_2001,
						view.getElement() != null ? view.getElement() : view,
						GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
								.getType(GraphEditor.grapheditormodel.diagram.edit.parts.NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEdge_4001Text(View view) {
		IParser parser = GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelParserProvider
				.getParser(
						GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001,
						view.getElement() != null ? view.getElement() : view,
						GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
								.getType(GraphEditor.grapheditormodel.diagram.edit.parts.EdgeValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return GraphEditor.grapheditormodel.diagram.edit.parts.GraphEditPart.MODEL_ID
				.equals(GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
						.getModelID(view));
	}

}
