/**
 */
package GraphicalProcessEditor.graphicalprocesseditormodel.impl;

import GraphicalProcessEditor.graphicalprocesseditormodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicalprocesseditormodelFactoryImpl extends EFactoryImpl implements GraphicalprocesseditormodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphicalprocesseditormodelFactory init() {
		try {
			GraphicalprocesseditormodelFactory theGraphicalprocesseditormodelFactory = (GraphicalprocesseditormodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://graphicalprocesseditormodel/1.0"); 
			if (theGraphicalprocesseditormodelFactory != null) {
				return theGraphicalprocesseditormodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphicalprocesseditormodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalprocesseditormodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GraphicalprocesseditormodelPackage.GRAPH: return createGraph();
			case GraphicalprocesseditormodelPackage.NODE: return createNode();
			case GraphicalprocesseditormodelPackage.EDGE: return createEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalprocesseditormodelPackage getGraphicalprocesseditormodelPackage() {
		return (GraphicalprocesseditormodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphicalprocesseditormodelPackage getPackage() {
		return GraphicalprocesseditormodelPackage.eINSTANCE;
	}

} //GraphicalprocesseditormodelFactoryImpl
