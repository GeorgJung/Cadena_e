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
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__PROCESSES = 0;

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
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TRANSACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.TransactionImpl
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.JoinImpl
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 3;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__TRANSACTIONS = NODE__TRANSACTIONS;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.ProcessImpl
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TRANSACTIONS = NODE__TRANSACTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STATES = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMAGE_PATH = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OUTPUT_PORTS = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INPUT_PORT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.OutputPortImpl
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 5;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__TRANSACTIONS = NODE__TRANSACTIONS;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.InputPortImpl
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 6;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__TRANSACTIONS = NODE__TRANSACTIONS;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getProcesses()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Processes();

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
	 * Returns the meta object for the containment reference list '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Node#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transactions</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Node#getTransactions()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Transactions();

	/**
	 * Returns the meta object for class '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Transaction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Transaction#getValue()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Value();

	/**
	 * Returns the meta object for the reference '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Transaction#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Transaction#getSource()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Source();

	/**
	 * Returns the meta object for the reference '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Transaction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Transaction#getTarget()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Target();

	/**
	 * Returns the meta object for class '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute list '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>States</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Process#getStates()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_States();

	/**
	 * Returns the meta object for the attribute '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Process#getImagePath()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ImagePath();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Process#getOutputPorts()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OutputPorts();

	/**
	 * Returns the meta object for the containment reference '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Port</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.Process#getInputPort()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_InputPort();

	/**
	 * Returns the meta object for class '{@link GraphicalProcessEditor.graphicalprocesseditormodel.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for class '{@link GraphicalProcessEditor.graphicalprocesseditormodel.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.InputPort
	 * @generated
	 */
	EClass getInputPort();

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
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__PROCESSES = eINSTANCE.getGraph_Processes();

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
		 * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TRANSACTIONS = eINSTANCE.getNode_Transactions();

		/**
		 * The meta object literal for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.TransactionImpl
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__VALUE = eINSTANCE.getTransaction_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__SOURCE = eINSTANCE.getTransaction_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__TARGET = eINSTANCE.getTransaction_Target();

		/**
		 * The meta object literal for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.JoinImpl
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.ProcessImpl
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__STATES = eINSTANCE.getProcess_States();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__IMAGE_PATH = eINSTANCE.getProcess_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__OUTPUT_PORTS = eINSTANCE.getProcess_OutputPorts();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INPUT_PORT = eINSTANCE.getProcess_InputPort();

		/**
		 * The meta object literal for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.OutputPortImpl
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.InputPortImpl
		 * @see GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphicalprocesseditormodelPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

	}

} //GraphicalprocesseditormodelPackage
