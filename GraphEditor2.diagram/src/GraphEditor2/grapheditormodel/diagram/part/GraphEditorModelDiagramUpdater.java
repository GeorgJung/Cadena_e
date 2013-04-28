package GraphEditor2.grapheditormodel.diagram.part;

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
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor2.grapheditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor> getGraph_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GraphEditor2.grapheditormodel.Graph modelElement = (GraphEditor2.grapheditormodel.Graph) view
				.getElement();
		LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor> result = new LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGraphNodes().iterator(); it
				.hasNext();) {
			GraphEditor2.grapheditormodel.Node childElement = (GraphEditor2.grapheditormodel.Node) it
					.next();
			int visualID = GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == GraphEditor2.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID) {
				result.add(new GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor2.grapheditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000ContainedLinks(view);
		case GraphEditor2.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		case GraphEditor2.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor2.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		case GraphEditor2.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor2.grapheditormodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		case GraphEditor2.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getGraph_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getNode_2001ContainedLinks(
			View view) {
		GraphEditor2.grapheditormodel.Node modelElement = (GraphEditor2.grapheditormodel.Node) view
				.getElement();
		LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getNode_2001IncomingLinks(
			View view) {
		GraphEditor2.grapheditormodel.Node modelElement = (GraphEditor2.grapheditormodel.Node) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getNode_2001OutgoingLinks(
			View view) {
		GraphEditor2.grapheditormodel.Node modelElement = (GraphEditor2.grapheditormodel.Node) view
				.getElement();
		LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(
			GraphEditor2.grapheditormodel.Node container) {
		LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		for (Iterator<?> links = container.getOutGoingEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GraphEditor2.grapheditormodel.Edge) {
				continue;
			}
			GraphEditor2.grapheditormodel.Edge link = (GraphEditor2.grapheditormodel.Edge) linkObject;
			if (GraphEditor2.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID != GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphEditor2.grapheditormodel.Node dst = link.getTarget();
			result.add(new GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor(
					container,
					dst,
					link,
					GraphEditor2.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001,
					GraphEditor2.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(
			GraphEditor2.grapheditormodel.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> result = new LinkedList<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GraphEditor2.grapheditormodel.GrapheditormodelPackage.eINSTANCE
					.getEdge_Target()
					|| false == setting.getEObject() instanceof GraphEditor2.grapheditormodel.Edge) {
				continue;
			}
			GraphEditor2.grapheditormodel.Edge link = (GraphEditor2.grapheditormodel.Edge) setting
					.getEObject();
			if (GraphEditor2.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID != GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof GraphEditor2.grapheditormodel.Node) {
				continue;
			}
			GraphEditor2.grapheditormodel.Node container = (GraphEditor2.grapheditormodel.Node) link
					.eContainer();
			result.add(new GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor(
					container,
					target,
					link,
					GraphEditor2.grapheditormodel.diagram.providers.GraphEditorModelElementTypes.Edge_4001,
					GraphEditor2.grapheditormodel.diagram.edit.parts.EdgeEditPart.VISUAL_ID));

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
		public List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelNodeDescriptor> getSemanticChildren(
				View view) {
			return GraphEditorModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		public List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getContainedLinks(
				View view) {
			return GraphEditorModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		public List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getIncomingLinks(
				View view) {
			return GraphEditorModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		public List<GraphEditor2.grapheditormodel.diagram.part.GraphEditorModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return GraphEditorModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
