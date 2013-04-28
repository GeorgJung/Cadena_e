/**
 */
package GraphicalProcessEditor.graphicalprocesseditormodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelFactory
 * @model kind="package"
 * @generated
 */
public interface GraphicalprocesseditormodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphicalprocesseditormodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://graphicalprocesseditormodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphicalprocesseditormodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphicalprocesseditormodelPackage eINSTANCE = GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__END = 2;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.NodeImpl
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EDGES = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.EdgeImpl
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference0</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getEReference0()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_EReference0();

	/**
	 * Returns the meta object for the reference list '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Start</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getStart()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Start();

	/**
	 * Returns the meta object for the reference list '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getEnd()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_End();

	/**
	 * Returns the meta object for class '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute list '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Node#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Node#getAttribute()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Node#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Node#getEdges()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Edges();

	/**
	 * Returns the meta object for class '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Edge#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Edge#getValue()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Value();

	/**
	 * Returns the meta object for the reference '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphicalprocesseditormodelFactory getGraphicalprocesseditormodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__EREFERENCE0 = eINSTANCE.getGraph_EReference0();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__START = eINSTANCE.getGraph_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__END = eINSTANCE.getGraph_End();

		/**
		 * The meta object literal for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.NodeImpl
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ATTRIBUTE = eINSTANCE.getNode_Attribute();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EDGES = eINSTANCE.getNode_Edges();

		/**
		 * The meta object literal for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.EdgeImpl
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__VALUE = eINSTANCE.getEdge_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

	}

} //GraphicalprocesseditormodelPackage
