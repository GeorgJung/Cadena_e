package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part;

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
public class GraphicalProcessEditorModelCreationWizard extends Wizard implements
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
	protected GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelCreationWizardPage domainModelFilePage;

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
		setWindowTitle(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.GraphicalProcessEditorModelCreationWizardTitle);
		setDefaultPageImageDescriptor(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewGraphicalprocesseditormodelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelCreationWizardPage(
				"DiagramModelFile", getSelection(), "graphicalprocesseditormodel_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.GraphicalProcessEditorModelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.GraphicalProcessEditorModelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelCreationWizardPage(
				"DomainModelFile", getSelection(), "graphicalprocesseditormodel") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".graphicalprocesseditormodel_diagram".length()); //$NON-NLS-1$
					setFileName(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "graphicalprocesseditormodel")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.GraphicalProcessEditorModelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.GraphicalProcessEditorModelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.GraphicalProcessEditorModelCreationWizardOpenEditorError,
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
								GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.Messages.GraphicalProcessEditorModelCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
