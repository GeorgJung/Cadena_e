package GraphEditor.graphmodel.diagram.part;

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
public class GraphModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGraphmodel1Group());
	}

	/**
	 * Creates "graphmodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createGraphmodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				GraphEditor.graphmodel.diagram.part.Messages.Graphmodel1Group_title);
		paletteContainer.setId("createGraphmodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createNode1CreationTool());
		paletteContainer.add(createNodeEdge2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				GraphEditor.graphmodel.diagram.part.Messages.Node1CreationTool_title,
				GraphEditor.graphmodel.diagram.part.Messages.Node1CreationTool_desc,
				Collections
						.singletonList(GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.Node_2001));
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes
				.getImageDescriptor(GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.Node_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNodeEdge2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				GraphEditor.graphmodel.diagram.part.Messages.NodeEdge2CreationTool_title,
				GraphEditor.graphmodel.diagram.part.Messages.NodeEdge2CreationTool_desc,
				Collections
						.singletonList(GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.NodeEdge_4001));
		entry.setId("createNodeEdge2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes
				.getImageDescriptor(GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.NodeEdge_4001));
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
