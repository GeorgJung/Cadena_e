package GraphEditor.grapheditormodel.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class GraphEditorModelCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected GraphEditor.grapheditormodel.diagram.part.GraphEditorModelCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected GraphEditor.grapheditormodel.diagram.part.GraphEditorModelCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(GraphEditor.grapheditormodel.diagram.part.Messages.GraphEditorModelCreationWizardTitle);
		setDefaultPageImageDescriptor(GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewGrapheditormodelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new GraphEditor.grapheditormodel.diagram.part.GraphEditorModelCreationWizardPage(
				"DiagramModelFile", getSelection(), "grapheditormodel_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(GraphEditor.grapheditormodel.diagram.part.Messages.GraphEditorModelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(GraphEditor.grapheditormodel.diagram.part.Messages.GraphEditorModelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new GraphEditor.grapheditormodel.diagram.part.GraphEditorModelCreationWizardPage(
				"DomainModelFile", getSelection(), "grapheditormodel") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".grapheditormodel_diagram".length()); //$NON-NLS-1$
					setFileName(GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "grapheditormodel")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(GraphEditor.grapheditormodel.diagram.part.Messages.GraphEditorModelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(GraphEditor.grapheditormodel.diagram.part.Messages.GraphEditorModelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										GraphEditor.grapheditormodel.diagram.part.Messages.GraphEditorModelCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								GraphEditor.grapheditormodel.diagram.part.Messages.GraphEditorModelCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				GraphEditor.grapheditormodel.diagram.part.GraphEditorModelDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
