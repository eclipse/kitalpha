/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.analyzer.graph.impl;

import org.polarsys.kitalpha.transposer.analyzer.graph.Edge;
import org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#isHotSpot <em>Hot Spot</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getAdjacents <em>Adjacents</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getOutgoingAdjacents <em>Outgoing Adjacents</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getIncomingAdjacents <em>Incoming Adjacents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VertexImpl<ContentClass> extends GraphElementImpl<ContentClass> implements Vertex<ContentClass> {

	/**
	 * The default value of the '{@link #isHotSpot() <em>Hot Spot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHotSpot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOT_SPOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHotSpot() <em>Hot Spot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHotSpot()
	 * @generated
	 * @ordered
	 */
	protected boolean hotSpot = HOT_SPOT_EDEFAULT;


  

	/**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge<?>> outgoingEdges;


  

	/**
	 * The cached value of the '{@link #getIncomingEdges() <em>Incoming Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge<?>> incomingEdges;


  


  


  


  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.VERTEX;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isHotSpot() {

		return hotSpot;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setHotSpot(boolean newHotSpot) {

		boolean oldHotSpot = hotSpot;
		hotSpot = newHotSpot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.VERTEX__HOT_SPOT, oldHotSpot, hotSpot));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Edge<?>> getOutgoingEdges() {

		if (outgoingEdges == null) {
			outgoingEdges = new EObjectWithInverseResolvingEList<Edge<?>>(Edge.class, this, GraphPackage.VERTEX__OUTGOING_EDGES, GraphPackage.EDGE__SOURCE);
		}
		return outgoingEdges;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Edge<?>> getIncomingEdges() {

		if (incomingEdges == null) {
			incomingEdges = new EObjectWithInverseResolvingEList<Edge<?>>(Edge.class, this, GraphPackage.VERTEX__INCOMING_EDGES, GraphPackage.EDGE__TARGET);
		}
		return incomingEdges;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Vertex<?>> getAdjacents() {


		// TODO: implement this method to return the 'Adjacents' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Vertex<?>> getOutgoingAdjacents() {


		// TODO: implement this method to return the 'Outgoing Adjacents' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Vertex<?>> getIncomingAdjacents() {


		// TODO: implement this method to return the 'Incoming Adjacents' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean hasForAdjacent(Vertex<?> vertex_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean hasForOutgoingAdjacent(Vertex<?> vertex_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean hasForIncomingAdjacent(Vertex<?> vertex_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Edge<?> getIncomingEdgeFrom(Vertex<?> vertex_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Edge<?> getOutgoingEdgeTo(Vertex<?> vertex_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Edge<?> getEdgeTo(Vertex<?> vertex_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.VERTEX__OUTGOING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingEdges()).basicAdd(otherEnd, msgs);
			case GraphPackage.VERTEX__INCOMING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingEdges()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.VERTEX__OUTGOING_EDGES:
				return ((InternalEList<?>)getOutgoingEdges()).basicRemove(otherEnd, msgs);
			case GraphPackage.VERTEX__INCOMING_EDGES:
				return ((InternalEList<?>)getIncomingEdges()).basicRemove(otherEnd, msgs);
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
			case GraphPackage.VERTEX__HOT_SPOT:
				return isHotSpot();
			case GraphPackage.VERTEX__OUTGOING_EDGES:
				return getOutgoingEdges();
			case GraphPackage.VERTEX__INCOMING_EDGES:
				return getIncomingEdges();
			case GraphPackage.VERTEX__ADJACENTS:
				return getAdjacents();
			case GraphPackage.VERTEX__OUTGOING_ADJACENTS:
				return getOutgoingAdjacents();
			case GraphPackage.VERTEX__INCOMING_ADJACENTS:
				return getIncomingAdjacents();
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
			case GraphPackage.VERTEX__HOT_SPOT:
				setHotSpot((Boolean)newValue);
				return;
			case GraphPackage.VERTEX__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				getOutgoingEdges().addAll((Collection<? extends Edge<?>>)newValue);
				return;
			case GraphPackage.VERTEX__INCOMING_EDGES:
				getIncomingEdges().clear();
				getIncomingEdges().addAll((Collection<? extends Edge<?>>)newValue);
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
			case GraphPackage.VERTEX__HOT_SPOT:
				setHotSpot(HOT_SPOT_EDEFAULT);
				return;
			case GraphPackage.VERTEX__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				return;
			case GraphPackage.VERTEX__INCOMING_EDGES:
				getIncomingEdges().clear();
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
			case GraphPackage.VERTEX__HOT_SPOT:
				return hotSpot != HOT_SPOT_EDEFAULT;
			case GraphPackage.VERTEX__OUTGOING_EDGES:
				return outgoingEdges != null && !outgoingEdges.isEmpty();
			case GraphPackage.VERTEX__INCOMING_EDGES:
				return incomingEdges != null && !incomingEdges.isEmpty();
			case GraphPackage.VERTEX__ADJACENTS:
				return !getAdjacents().isEmpty();
			case GraphPackage.VERTEX__OUTGOING_ADJACENTS:
				return !getOutgoingAdjacents().isEmpty();
			case GraphPackage.VERTEX__INCOMING_ADJACENTS:
				return !getIncomingAdjacents().isEmpty();
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
		result.append(" (hotSpot: "); //$NON-NLS-1$
		result.append(hotSpot);
		result.append(')');
		return result.toString();
	}


} //VertexImpl
