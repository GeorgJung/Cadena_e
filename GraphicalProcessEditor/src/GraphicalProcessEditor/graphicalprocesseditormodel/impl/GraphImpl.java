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
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl#getStart <em>Start</em>}</li>
 *   <li>{@link GraphicalProcessEditor.graphicalprocesseditormodel.impl.GraphImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphImpl extends EObjectImpl implements Graph {
	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference0;

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
	public EList<Node> getEReference0() {
		if (eReference0 == null) {
			eReference0 = new EObjectContainmentEList<Node>(Node.class, this, GraphicalprocesseditormodelPackage.GRAPH__EREFERENCE0);
		}
		return eReference0;
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
			case GraphicalprocesseditormodelPackage.GRAPH__EREFERENCE0:
				return ((InternalEList<?>)getEReference0()).basicRemove(otherEnd, msgs);
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
			case GraphicalprocesseditormodelPackage.GRAPH__EREFERENCE0:
				return getEReference0();
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				return getStart();
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
			case GraphicalprocesseditormodelPackage.GRAPH__EREFERENCE0:
				getEReference0().clear();
				getEReference0().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				getStart().clear();
				getStart().addAll((Collection<? extends Node>)newValue);
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
			case GraphicalprocesseditormodelPackage.GRAPH__EREFERENCE0:
				getEReference0().clear();
				return;
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				getStart().clear();
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
			case GraphicalprocesseditormodelPackage.GRAPH__EREFERENCE0:
				return eReference0 != null && !eReference0.isEmpty();
			case GraphicalprocesseditormodelPackage.GRAPH__START:
				return start != null && !start.isEmpty();
			case GraphicalprocesseditormodelPackage.GRAPH__END:
				return end != null && !end.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphImpl
