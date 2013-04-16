package GraphEditor.grapheditormodel.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GraphEditorModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGrapheditormodel1Group());
	}

	/**
	 * Creates "grapheditormodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createGrapheditormodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				GraphEditor.grapheditormodel.diagram.part.Messages.Grapheditormodel1Group_title);
		paletteContainer.setId("createGrapheditormodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createNode1CreationTool());
		paletteContainer.add(createEdge2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				GraphEditor.grapheditormodel.diagram.part.Messages.Node1CreationTool_title,
				GraphEditor.grapheditormodel.diagram.part.Messages.Node1CreationTool_desc,
				Collections
						.singletonList(GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Node_2001));
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes
				.getImageDescriptor(GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Node_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdge2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				GraphEditor.grapheditormodel.diagram.part.Messages.Edge2CreationTool_title,
				GraphEditor.grapheditormodel.diagram.part.Messages.Edge2CreationTool_desc,
				Collections
						.singletonList(GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001));
		entry.setId("createEdge2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes
				.getImageDescriptor(GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
