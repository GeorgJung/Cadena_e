/**
 */
package GraphicalProcessEditor.graphicalprocesseditormodel.impl;

import GraphicalProcessEditor.graphicalprocesseditormodel.Graph;
import GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage;
import GraphicalProcessEditor.graphicalprocesseditormodel.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl#getStart <em>Start</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphImpl extends EObjectImpl implements Graph {
	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> processes;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Node start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicalprocesseditormodelPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<Node>(Node.class, this, GraphicalprocesseditormodelPackage.GRAPH__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Node)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphicalprocesseditormodelPackage.GRAPH__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Node newStart) {
		Node oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalprocesseditormodelPackage.GRAPH__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEnd() {
		if (end == null) {
			end = new EObjectResolvingEList<Node>(Node.class, this, GraphicalprocesseditormodelPackage.GRAPH__END);
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicalprocesseditormodelPackage.GRAPH__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
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
			case GraphicalprocesseditormodelPackage.GRAPH__PROCESSES:
				return getProcesses();
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				if (resolve) return getStart();
				return basicGetStart();
			case GraphicalprocesseditormodelPackage.GRAPH__END:
				return getEnd();
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
			case GraphicalprocesseditormodelPackage.GRAPH__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				setStart((Node)newValue);
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends Node>)newValue);
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
			case GraphicalprocesseditormodelPackage.GRAPH__PROCESSES:
				getProcesses().clear();
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				setStart((Node)null);
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__END:
				getEnd().clear();
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
			case GraphicalprocesseditormodelPackage.GRAPH__PROCESSES:
				return processes != null && !processes.isEmpty();
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				return start != null;
			case GraphicalprocesseditormodelPackage.GRAPH__END:
				return end != null && !end.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphImpl
