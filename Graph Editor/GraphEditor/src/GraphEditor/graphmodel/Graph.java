/**
 */
package GraphEditor.graphmodel;

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
 *   <li>{@link GraphEditor.graphmodel.Graph#getGraphNode <em>Graph Node</em>}</li>
 *   <li>{@link GraphEditor.graphmodel.Graph#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphEditor.graphmodel.GraphmodelPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Graph Node</b></em>' containment reference list.
	 * The list contents are of type {@link GraphEditor.graphmodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Node</em>' containment reference list.
	 * @see GraphEditor.graphmodel.GraphmodelPackage#getGraph_GraphNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getGraphNode();

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
	 * @see GraphEditor.graphmodel.GraphmodelPackage#getGraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GraphEditor.graphmodel.Graph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Graph
