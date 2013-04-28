/**
 */
package GraphEditor2.grapheditormodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GraphEditor2.grapheditormodel.Node#getName <em>Name</em>}</li>
 *   <li>{@link GraphEditor2.grapheditormodel.Node#getOutGoingEdges <em>Out Going Edges</em>}</li>
 *   <li>{@link GraphEditor2.grapheditormodel.Node#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphEditor2.grapheditormodel.GrapheditormodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GraphEditor2.grapheditormodel.GrapheditormodelPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GraphEditor2.grapheditormodel.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Out Going Edges</b></em>' containment reference list.
	 * The list contents are of type {@link GraphEditor2.grapheditormodel.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Going Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Going Edges</em>' containment reference list.
	 * @see GraphEditor2.grapheditormodel.GrapheditormodelPackage#getNode_OutGoingEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getOutGoingEdges();

	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link GraphEditor2.grapheditormodel.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see GraphEditor2.grapheditormodel.GrapheditormodelPackage#getNode_IncomingEdges()
	 * @model
	 * @generated
	 */
	EList<Edge> getIncomingEdges();

} // Node
