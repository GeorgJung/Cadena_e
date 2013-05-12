package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class GraphicalProcessEditorModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelNodeDescriptor> getGraph_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GraphicalProcessEditor.graphicalprocesseditormodel.Graph modelElement = (GraphicalProcessEditor.graphicalprocesseditormodel.Graph) view
				.getElement();
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelNodeDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProcesses().iterator(); it
				.hasNext();) {
			GraphicalProcessEditor.graphicalprocesseditormodel.Node childElement = (GraphicalProcessEditor.graphicalprocesseditormodel.Node) it
					.next();
			int visualID = GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID) {
				result.add(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID) {
				result.add(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000ContainedLinks(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getProcess_2001ContainedLinks(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getJoin_2002ContainedLinks(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getTransaction_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getProcess_2001IncomingLinks(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getJoin_2002IncomingLinks(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getTransaction_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getProcess_2001OutgoingLinks(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getJoin_2002OutgoingLinks(view);
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getTransaction_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getGraph_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getProcess_2001ContainedLinks(
			View view) {
		GraphicalProcessEditor.graphicalprocesseditormodel.Process modelElement = (GraphicalProcessEditor.graphicalprocesseditormodel.Process) view
				.getElement();
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transaction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getJoin_2002ContainedLinks(
			View view) {
		GraphicalProcessEditor.graphicalprocesseditormodel.Join modelElement = (GraphicalProcessEditor.graphicalprocesseditormodel.Join) view
				.getElement();
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transaction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getTransaction_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getProcess_2001IncomingLinks(
			View view) {
		GraphicalProcessEditor.graphicalprocesseditormodel.Process modelElement = (GraphicalProcessEditor.graphicalprocesseditormodel.Process) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transaction_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getJoin_2002IncomingLinks(
			View view) {
		GraphicalProcessEditor.graphicalprocesseditormodel.Join modelElement = (GraphicalProcessEditor.graphicalprocesseditormodel.Join) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transaction_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getTransaction_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getProcess_2001OutgoingLinks(
			View view) {
		GraphicalProcessEditor.graphicalprocesseditormodel.Process modelElement = (GraphicalProcessEditor.graphicalprocesseditormodel.Process) view
				.getElement();
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transaction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getJoin_2002OutgoingLinks(
			View view) {
		GraphicalProcessEditor.graphicalprocesseditormodel.Join modelElement = (GraphicalProcessEditor.graphicalprocesseditormodel.Join) view
				.getElement();
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transaction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getTransaction_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getContainedTypeModelFacetLinks_Transaction_4001(
			GraphicalProcessEditor.graphicalprocesseditormodel.Node container) {
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor>();
		for (Iterator<?> links = container.getTransactions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) {
				continue;
			}
			GraphicalProcessEditor.graphicalprocesseditormodel.Transaction link = (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) linkObject;
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID != GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalProcessEditor.graphicalprocesseditormodel.Node dst = link
					.getTarget();
			GraphicalProcessEditor.graphicalprocesseditormodel.Node src = link
					.getSource();
			result.add(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor(
					src,
					dst,
					link,
					GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4001,
					GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getIncomingTypeModelFacetLinks_Transaction_4001(
			GraphicalProcessEditor.graphicalprocesseditormodel.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
					.getTransaction_Target()
					|| false == setting.getEObject() instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) {
				continue;
			}
			GraphicalProcessEditor.graphicalprocesseditormodel.Transaction link = (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) setting
					.getEObject();
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID != GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalProcessEditor.graphicalprocesseditormodel.Node src = link
					.getSource();
			result.add(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor(
					src,
					target,
					link,
					GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4001,
					GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Transaction_4001(
			GraphicalProcessEditor.graphicalprocesseditormodel.Node source) {
		GraphicalProcessEditor.graphicalprocesseditormodel.Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Node) {
				container = (GraphicalProcessEditor.graphicalprocesseditormodel.Node) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> result = new LinkedList<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor>();
		for (Iterator<?> links = container.getTransactions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) {
				continue;
			}
			GraphicalProcessEditor.graphicalprocesseditormodel.Transaction link = (GraphicalProcessEditor.graphicalprocesseditormodel.Transaction) linkObject;
			if (GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID != GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalProcessEditor.graphicalprocesseditormodel.Node dst = link
					.getTarget();
			GraphicalProcessEditor.graphicalprocesseditormodel.Node src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor(
					src,
					dst,
					link,
					GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers.GraphicalProcessEditorModelElementTypes.Transaction_4001,
					GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelNodeDescriptor> getSemanticChildren(
				View view) {
			return GraphicalProcessEditorModelDiagramUpdater
					.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getContainedLinks(
				View view) {
			return GraphicalProcessEditorModelDiagramUpdater
					.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getIncomingLinks(
				View view) {
			return GraphicalProcessEditorModelDiagramUpdater
					.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return GraphicalProcessEditorModelDiagramUpdater
					.getOutgoingLinks(view);
		}
	};

}
