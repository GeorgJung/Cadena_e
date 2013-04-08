package GraphEditor.graphmodel.diagram.part;

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
public class GraphModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GraphEditor.graphmodel.diagram.part.GraphModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.graphmodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.graphmodel.diagram.part.GraphModelNodeDescriptor> getGraph_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GraphEditor.graphmodel.Graph modelElement = (GraphEditor.graphmodel.Graph) view
				.getElement();
		LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelNodeDescriptor> result = new LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGraphNode().iterator(); it
				.hasNext();) {
			GraphEditor.graphmodel.Node childElement = (GraphEditor.graphmodel.Node) it
					.next();
			int visualID = GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == GraphEditor.graphmodel.diagram.edit.parts.NodeEditPart.VISUAL_ID) {
				result.add(new GraphEditor.graphmodel.diagram.part.GraphModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.graphmodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return getGraph_1000ContainedLinks(view);
		case GraphEditor.graphmodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.graphmodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (GraphEditor.graphmodel.diagram.part.GraphModelVisualIDRegistry
				.getVisualID(view)) {
		case GraphEditor.graphmodel.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getGraph_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getNode_2001ContainedLinks(
			View view) {
		GraphEditor.graphmodel.Node modelElement = (GraphEditor.graphmodel.Node) view
				.getElement();
		LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> result = new LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Node_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getNode_2001IncomingLinks(
			View view) {
		GraphEditor.graphmodel.Node modelElement = (GraphEditor.graphmodel.Node) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> result = new LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Node_Edge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getNode_2001OutgoingLinks(
			View view) {
		GraphEditor.graphmodel.Node modelElement = (GraphEditor.graphmodel.Node) view
				.getElement();
		LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> result = new LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Node_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Node_Edge_4001(
			GraphEditor.graphmodel.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> result = new LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GraphEditor.graphmodel.GraphmodelPackage.eINSTANCE
					.getNode_Edge()) {
				result.add(new GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor(
						setting.getEObject(),
						target,
						GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.NodeEdge_4001,
						GraphEditor.graphmodel.diagram.edit.parts.NodeEdgeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Node_Edge_4001(
			GraphEditor.graphmodel.Node source) {
		LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> result = new LinkedList<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getEdge().iterator(); destinations
				.hasNext();) {
			GraphEditor.graphmodel.Node destination = (GraphEditor.graphmodel.Node) destinations
					.next();
			result.add(new GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor(
					source,
					destination,
					GraphEditor.graphmodel.diagram.providers.GraphModelElementTypes.NodeEdge_4001,
					GraphEditor.graphmodel.diagram.edit.parts.NodeEdgeEditPart.VISUAL_ID));
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
		public List<GraphEditor.graphmodel.diagram.part.GraphModelNodeDescriptor> getSemanticChildren(
				View view) {
			return GraphModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getContainedLinks(
				View view) {
			return GraphModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getIncomingLinks(
				View view) {
			return GraphModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GraphEditor.graphmodel.diagram.part.GraphModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return GraphModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
