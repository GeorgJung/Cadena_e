/**
 */
package GraphicalProcessEditor.graphicalprocesseditormodel;

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
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Node#getEdges <em>Edges</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Node#getName <em>Name</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Node#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link GraphicalProcessEditor.graphicalprocesseditormodel.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getNode_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

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
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute list.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getNode_Attribute()
	 * @model
	 * @generated
	 */
	EList<String> getAttribute();

} // Node
