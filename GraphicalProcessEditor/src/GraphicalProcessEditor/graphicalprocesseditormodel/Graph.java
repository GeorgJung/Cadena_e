/**
 */
package GraphicalProcessEditor.graphicalprocesseditormodel;

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
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getStart <em>Start</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Graph#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' containment reference list.
	 * The list contents are of type {@link GraphicalProcessEditor.graphicalprocesseditormodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' containment reference list.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getGraph_EReference0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Node> getEReference0();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference list.
	 * The list contents are of type {@link GraphicalProcessEditor.graphicalprocesseditormodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference list.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getGraph_Start()
	 * @model required="true"
	 * @generated
	 */
	EList<Node> getStart();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link GraphicalProcessEditor.graphicalprocesseditormodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getGraph_End()
	 * @model required="true"
	 * @generated
	 */
	EList<Node> getEnd();

} // Graph
