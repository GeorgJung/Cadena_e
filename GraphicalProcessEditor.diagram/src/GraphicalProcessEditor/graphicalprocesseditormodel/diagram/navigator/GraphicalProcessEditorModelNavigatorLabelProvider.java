package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator;

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
public class GraphicalProcessEditorModelNavigatorLabelProvider extends
		LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem
				&& !isOwnView(((GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) element)
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
		if (element instanceof GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorGroup) {
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorGroup group = (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorGroup) element;
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) {
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem navigatorItem = (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) element;
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
		switch (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://graphicalprocesseditormodel/1.0?InputPort", GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.InputPort_3001); //$NON-NLS-1$
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://graphicalprocesseditormodel/1.0?Process", GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Process_2002); //$NON-NLS-1$
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://graphicalprocesseditormodel/1.0?OutputPort", GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.OutputPort_4005); //$NON-NLS-1$
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://graphicalprocesseditormodel/1.0?OutputPort", GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.OutputPort_3002); //$NON-NLS-1$
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://graphicalprocesseditormodel/1.0?Join", GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Join_2004); //$NON-NLS-1$
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://graphicalprocesseditormodel/1.0?Transaction", GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4003); //$NON-NLS-1$
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://graphicalprocesseditormodel/1.0?InputPort", GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.InputPort_4004); //$NON-NLS-1$
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://graphicalprocesseditormodel/1.0?Graph", GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Graph_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes
						.isKnownElementType(elementType)) {
			image = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes
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
		if (element instanceof GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorGroup) {
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorGroup group = (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) {
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem navigatorItem = (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.navigator.GraphicalProcessEditorModelNavigatorItem) element;
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
		switch (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getInputPort_3001Text(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getProcess_2002Text(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPort2EditPart.VISUAL_ID:
			return getOutputPort_4005Text(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3002Text(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getJoin_2004Text(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getTransaction_4003Text(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPort2EditPart.VISUAL_ID:
			return getInputPort_4004Text(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getJoin_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcess_2002Text(View view) {
		IParser parser = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelParserProvider
				.getParser(
						GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Process_2002,
						view.getElement() != null ? view.getElement() : view,
						GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
								.getType(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputPort_4005Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getInputPort_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransaction_4003Text(View view) {
		IParser parser = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelParserProvider
				.getParser(
						GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4003,
						view.getElement() != null ? view.getElement() : view,
						GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
								.getType(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputPort_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutputPort_3002Text(View view) {
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
		return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.MODEL_ID
				.equals(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
						.getModelID(view));
	}

}
