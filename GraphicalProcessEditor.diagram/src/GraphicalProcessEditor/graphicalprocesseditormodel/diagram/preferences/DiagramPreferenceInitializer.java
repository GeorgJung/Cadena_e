package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.preferences;

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
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		GraphicalProcessEditor.graphicalprocesseditormodel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
