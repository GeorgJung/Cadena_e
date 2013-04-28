/**
 */
package GraphicalProcessEditor.graphicalprocesseditormodel.impl;

import GraphicalProcessEditor.graphicalprocesseditormodel.Graph;
import GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage;
import GraphicalProcessEditor.graphicalprocesseditormodel.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl#getGraphNodes <em>Graph Nodes</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl#getEnd <em>End</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl#getStart <em>Start</em>}</li>
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
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> end;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> start;

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
	public EList<Node> getGraphNodes() {
		if (graphNodes == null) {
			graphNodes = new EObjectContainmentEList<Node>(Node.class, this, GraphicalprocesseditormodelPackage.GRAPH__GRAPH_NODES);
		}
		return graphNodes;
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
	public EList<Node> getStart() {
		if (start == null) {
			start = new EObjectResolvingEList<Node>(Node.class, this, GraphicalprocesseditormodelPackage.GRAPH__START);
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicalprocesseditormodelPackage.GRAPH__GRAPH_NODES:
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
			case GraphicalprocesseditormodelPackage.GRAPH__GRAPH_NODES:
				return getGraphNodes();
			case GraphicalprocesseditormodelPackage.GRAPH__END:
				return getEnd();
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				return getStart();
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
			case GraphicalprocesseditormodelPackage.GRAPH__GRAPH_NODES:
				getGraphNodes().clear();
				getGraphNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				getStart().clear();
				getStart().addAll((Collection<? extends Node>)newValue);
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
			case GraphicalprocesseditormodelPackage.GRAPH__GRAPH_NODES:
				getGraphNodes().clear();
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__END:
				getEnd().clear();
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				getStart().clear();
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
			case GraphicalprocesseditormodelPackage.GRAPH__GRAPH_NODES:
				return graphNodes != null && !graphNodes.isEmpty();
			case GraphicalprocesseditormodelPackage.GRAPH__END:
				return end != null && !end.isEmpty();
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				return start != null && !start.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphImpl
