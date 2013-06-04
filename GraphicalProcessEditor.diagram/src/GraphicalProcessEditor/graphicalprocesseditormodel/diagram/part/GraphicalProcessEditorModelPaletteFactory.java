package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part;

import java.util.ArrayList;
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
public class GraphicalProcessEditorModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGraphicalprocesseditormodel1Group());
	}

	/**
	 * Creates "graphicalprocesseditormodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createGraphicalprocesseditormodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.Graphicalprocesseditormodel1Group_title);
		paletteContainer.setId("createGraphicalprocesseditormodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createTransaction1CreationTool());
		paletteContainer.add(createJoin2CreationTool());
		paletteContainer.add(createProcess3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransaction1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4003);
		types.add(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.InputPort_4004);
		types.add(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.OutputPort_4005);
		LinkToolEntry entry = new LinkToolEntry(
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.Transaction1CreationTool_title,
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.Transaction1CreationTool_desc,
				types);
		entry.setId("createTransaction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes
				.getImageDescriptor(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoin2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.Join2CreationTool_title,
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.Join2CreationTool_desc,
				Collections
						.singletonList(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Join_2004));
		entry.setId("createJoin2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes
				.getImageDescriptor(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Join_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcess3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.Process3CreationTool_title,
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.Process3CreationTool_desc,
				Collections
						.singletonList(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Process_2002));
		entry.setId("createProcess3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes
				.getImageDescriptor(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Process_2002));
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
