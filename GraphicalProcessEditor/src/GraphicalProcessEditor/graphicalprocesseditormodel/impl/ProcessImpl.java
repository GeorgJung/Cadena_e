/**
 */
package GraphicalProcessEditor.graphicalprocesseditormodel.impl;

import GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage;
import GraphicalProcessEditor.graphicalprocesseditormodel.InputPort;
import GraphicalProcessEditor.graphicalprocesseditormodel.OutputPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.ProcessImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.ProcessImpl#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.ProcessImpl#getInputPort <em>Input Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends NodeImpl implements GraphicalProcessEditor.graphicalprocesseditormodel.Process {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected String imagePath = IMAGE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> outputPorts;

	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected InputPort inputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicalprocesseditormodelPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalprocesseditormodelPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePath(String newImagePath) {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalprocesseditormodelPackage.PROCESS__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPort> getOutputPorts() {
		if (outputPorts == null) {
			outputPorts = new EObjectContainmentEList<OutputPort>(OutputPort.class, this, GraphicalprocesseditormodelPackage.PROCESS__OUTPUT_PORTS);
		}
		return outputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPort(InputPort newInputPort, NotificationChain msgs) {
		InputPort oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphicalprocesseditormodelPackage.PROCESS__INPUT_PORT, oldInputPort, newInputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPort(InputPort newInputPort) {
		if (newInputPort != inputPort) {
			NotificationChain msgs = null;
			if (inputPort != null)
				msgs = ((InternalEObject)inputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphicalprocesseditormodelPackage.PROCESS__INPUT_PORT, null, msgs);
			if (newInputPort != null)
				msgs = ((InternalEObject)newInputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphicalprocesseditormodelPackage.PROCESS__INPUT_PORT, null, msgs);
			msgs = basicSetInputPort(newInputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalprocesseditormodelPackage.PROCESS__INPUT_PORT, newInputPort, newInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicalprocesseditormodelPackage.PROCESS__OUTPUT_PORTS:
				return ((InternalEList<?>)getOutputPorts()).basicRemove(otherEnd, msgs);
			case GraphicalprocesseditormodelPackage.PROCESS__INPUT_PORT:
				return basicSetInputPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicalprocesseditormodelPackage.PROCESS__NAME:
				return getName();
			case GraphicalprocesseditormodelPackage.PROCESS__IMAGE_PATH:
				return getImagePath();
			case GraphicalprocesseditormodelPackage.PROCESS__OUTPUT_PORTS:
				return getOutputPorts();
			case GraphicalprocesseditormodelPackage.PROCESS__INPUT_PORT:
				return getInputPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphicalprocesseditormodelPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case GraphicalprocesseditormodelPackage.PROCESS__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case GraphicalprocesseditormodelPackage.PROCESS__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection<? extends OutputPort>)newValue);
				return;
			case GraphicalprocesseditormodelPackage.PROCESS__INPUT_PORT:
				setInputPort((InputPort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphicalprocesseditormodelPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphicalprocesseditormodelPackage.PROCESS__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case GraphicalprocesseditormodelPackage.PROCESS__OUTPUT_PORTS:
				getOutputPorts().clear();
				return;
			case GraphicalprocesseditormodelPackage.PROCESS__INPUT_PORT:
				setInputPort((InputPort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphicalprocesseditormodelPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphicalprocesseditormodelPackage.PROCESS__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case GraphicalprocesseditormodelPackage.PROCESS__OUTPUT_PORTS:
				return outputPorts != null && !outputPorts.isEmpty();
			case GraphicalprocesseditormodelPackage.PROCESS__INPUT_PORT:
				return inputPort != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", ImagePath: ");
		result.append(imagePath);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
