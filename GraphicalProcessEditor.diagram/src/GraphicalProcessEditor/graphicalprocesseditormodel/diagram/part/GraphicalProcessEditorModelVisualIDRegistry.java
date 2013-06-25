package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GraphicalProcessEditorModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "GraphicalProcessEditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.MODEL_ID
					.equals(view.getType())) {
				return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
				.getGraph().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((GraphicalProcessEditor.graphicalprocesseditormodel.Graph) domainElement)) {
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
				.getModelID(containerView);
		if (!GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			if (GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
					.getJoin().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID;
			}
			if (GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
					.getProcess().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID;
			}
			break;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessProcessFigureCompartmentEditPart.VISUAL_ID:
			if (GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
					.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
			}
			if (GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
					.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
				.getModelID(containerView);
		if (!GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessProcessFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessProcessFigureCompartmentEditPart.VISUAL_ID:
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
				.getTransaction().isSuperTypeOf(domainElement.eClass())) {
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			GraphicalProcessEditor.graphicalprocesseditormodel.Graph element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessProcessFigureCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return false;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID:
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
