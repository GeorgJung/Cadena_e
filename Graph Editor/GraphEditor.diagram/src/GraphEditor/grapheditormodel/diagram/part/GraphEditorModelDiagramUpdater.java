package GraphEditor.grapheditormodel.diagram.part;

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
public class GraphEditorModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.grapheditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor> getGraph_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GraphEditor.grapheditormodel.Graph modelElement = (GraphEditor.grapheditormodel.Graph) view
				.getElement();
		LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor> result = new LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGraphNodes().iterator(); it
				.hasNext();) {
			GraphEditor.grapheditormodel.Node childElement = (GraphEditor.grapheditormodel.Node) it
					.next();
			int visualID = GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == GraphEditor.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID) {
				result.add(new GraphEditor.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.grapheditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000ContainedLinks(view);
		case GraphEditor.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		case GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		case GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		case GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getGraph_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getNode_2001ContainedLinks(
			View view) {
		GraphEditor.grapheditormodel.Node modelElement = (GraphEditor.grapheditormodel.Node) view
				.getElement();
		LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getNode_2001IncomingLinks(
			View view) {
		GraphEditor.grapheditormodel.Node modelElement = (GraphEditor.grapheditormodel.Node) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getNode_2001OutgoingLinks(
			View view) {
		GraphEditor.grapheditormodel.Node modelElement = (GraphEditor.grapheditormodel.Node) view
				.getElement();
		LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(
			GraphEditor.grapheditormodel.Node container) {
		LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		for (Iterator<?> links = container.getOutGoingEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GraphEditor.grapheditormodel.Edge) {
				continue;
			}
			GraphEditor.grapheditormodel.Edge link = (GraphEditor.grapheditormodel.Edge) linkObject;
			if (GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID != GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphEditor.grapheditormodel.Node dst = link.getTarget();
			GraphEditor.grapheditormodel.Node src = link.getSource();
			result.add(new GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor(
					src,
					dst,
					link,
					GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001,
					GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(
			GraphEditor.grapheditormodel.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GraphEditor.grapheditormodel.GrapheditormodelPackage.eINSTANCE
					.getEdge_Target()
					|| false == setting.getEObject() instanceof GraphEditor.grapheditormodel.Edge) {
				continue;
			}
			GraphEditor.grapheditormodel.Edge link = (GraphEditor.grapheditormodel.Edge) setting
					.getEObject();
			if (GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID != GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphEditor.grapheditormodel.Node src = link.getSource();
			result.add(new GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor(
					src,
					target,
					link,
					GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001,
					GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Edge_4001(
			GraphEditor.grapheditormodel.Node source) {
		GraphEditor.grapheditormodel.Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof GraphEditor.grapheditormodel.Node) {
				container = (GraphEditor.grapheditormodel.Node) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		for (Iterator<?> links = container.getOutGoingEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GraphEditor.grapheditormodel.Edge) {
				continue;
			}
			GraphEditor.grapheditormodel.Edge link = (GraphEditor.grapheditormodel.Edge) linkObject;
			if (GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID != GraphEditor.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphEditor.grapheditormodel.Node dst = link.getTarget();
			GraphEditor.grapheditormodel.Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor(
					src,
					dst,
					link,
					GraphEditor.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001,
					GraphEditor.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
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
		public List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor> getSemanticChildren(
				View view) {
			return GraphEditorModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getContainedLinks(
				View view) {
			return GraphEditorModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getIncomingLinks(
				View view) {
			return GraphEditorModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GraphEditor.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return GraphEditorModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
