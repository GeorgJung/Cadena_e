/**
 */
package GraphEditor2.grapheditormodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GraphEditor2.grapheditormodel.Graph#getGraphNodes <em>Graph Nodes</em>}</li>
 *   <li>{@link GraphEditor2.grapheditormodel.Graph#getStart <em>Start</em>}</li>
 *   <li>{@link GraphEditor2.grapheditormodel.Graph#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphEditor2.grapheditormodel.GrapheditormodelPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Graph Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link GraphEditor2.grapheditormodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Nodes</em>' containment reference list.
	 * @see GraphEditor2.grapheditormodel.GrapheditormodelPackage#getGraph_GraphNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getGraphNodes();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Node)
	 * @see GraphEditor2.grapheditormodel.GrapheditormodelPackage#getGraph_Start()
	 * @model required="true"
	 * @generated
	 */
	Node getStart();

	/**
	 * Sets the value of the '{@link GraphEditor2.grapheditormodel.Graph#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Node value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Node)
	 * @see GraphEditor2.grapheditormodel.GrapheditormodelPackage#getGraph_End()
	 * @model required="true"
	 * @generated
	 */
	Node getEnd();

	/**
	 * Sets the value of the '{@link GraphEditor2.grapheditormodel.Graph#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Node value);

} // Graph
