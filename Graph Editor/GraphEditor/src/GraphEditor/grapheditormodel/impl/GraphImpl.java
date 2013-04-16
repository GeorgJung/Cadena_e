/**
 */
package GraphEditor.grapheditormodel.impl;

import GraphEditor.grapheditormodel.Graph;
import GraphEditor.grapheditormodel.GrapheditormodelPackage;
import GraphEditor.grapheditormodel.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GraphEditor.grapheditormodel.impl.GraphImpl#getGraphNodes <em>Graph Nodes</em>}</li>
 *   <li>{@link GraphEditor.grapheditormodel.impl.GraphImpl#getStart <em>Start</em>}</li>
 *   <li>{@link GraphEditor.grapheditormodel.impl.GraphImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphImpl extends EObjectImpl implements Graph {
	/**
	 * The cached value of the '{@link #getGraphNodes() <em>Graph Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> graphNodes;

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
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Node end;

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
		return GrapheditormodelPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getGraphNodes() {
		if (graphNodes == null) {
			graphNodes = new EObjectContainmentEList<Node>(Node.class, this, GrapheditormodelPackage.GRAPH__GRAPH_NODES);
		}
		return graphNodes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrapheditormodelPackage.GRAPH__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrapheditormodelPackage.GRAPH__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Node)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrapheditormodelPackage.GRAPH__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Node newEnd) {
		Node oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrapheditormodelPackage.GRAPH__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrapheditormodelPackage.GRAPH__GRAPH_NODES:
				return ((InternalEList<?>)getGraphNodes()).basicRemove(otherEnd, msgs);
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
			case GrapheditormodelPackage.GRAPH__GRAPH_NODES:
				return getGraphNodes();
			case GrapheditormodelPackage.GRAPH__START:
				if (resolve) return getStart();
				return basicGetStart();
			case GrapheditormodelPackage.GRAPH__END:
				if (resolve) return getEnd();
				return basicGetEnd();
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
			case GrapheditormodelPackage.GRAPH__GRAPH_NODES:
				getGraphNodes().clear();
				getGraphNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case GrapheditormodelPackage.GRAPH__START:
				setStart((Node)newValue);
				return;
			case GrapheditormodelPackage.GRAPH__END:
				setEnd((Node)newValue);
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
			case GrapheditormodelPackage.GRAPH__GRAPH_NODES:
				getGraphNodes().clear();
				return;
			case GrapheditormodelPackage.GRAPH__START:
				setStart((Node)null);
				return;
			case GrapheditormodelPackage.GRAPH__END:
				setEnd((Node)null);
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
			case GrapheditormodelPackage.GRAPH__GRAPH_NODES:
				return graphNodes != null && !graphNodes.isEmpty();
			case GrapheditormodelPackage.GRAPH__START:
				return start != null;
			case GrapheditormodelPackage.GRAPH__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //GraphImpl
