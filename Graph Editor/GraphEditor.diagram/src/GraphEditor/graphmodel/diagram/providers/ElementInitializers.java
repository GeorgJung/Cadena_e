package GraphEditor.graphmodel.diagram.providers;

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
		ElementInitializers cached = GraphEditor.graphmodel.diagram.part.GraphModelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			GraphEditor.graphmodel.diagram.part.GraphModelDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
