/**
 */
package GraphicalProcessEditor.graphicalprocesseditormodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getName <em>Name</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getInputPort <em>Input Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Node {
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
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getProcess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getProcess_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link GraphicalProcessEditor.graphicalprocesseditormodel.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getProcess_OutputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPort> getOutputPorts();

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' containment reference.
	 * @see #setInputPort(InputPort)
	 * @see GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage#getProcess_InputPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPort getInputPort();

	/**
	 * Sets the value of the '{@link GraphicalProcessEditor.graphicalprocesseditormodel.Process#getInputPort <em>Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' containment reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(InputPort value);

} // Process
