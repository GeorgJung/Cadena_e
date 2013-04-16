package GraphEditor.grapheditormodel.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		GraphEditor.grapheditormodel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		GraphEditor.grapheditormodel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		GraphEditor.grapheditormodel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		GraphEditor.grapheditormodel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		GraphEditor.grapheditormodel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
