package GraphEditor.graphmodel.diagram.preferences;

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
		GraphEditor.graphmodel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		GraphEditor.graphmodel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		GraphEditor.graphmodel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		GraphEditor.graphmodel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		GraphEditor.graphmodel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return GraphEditor.graphmodel.diagram.part.GraphModelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
