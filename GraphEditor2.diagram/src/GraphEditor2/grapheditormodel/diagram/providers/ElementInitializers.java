package GraphEditor2.grapheditormodel.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
