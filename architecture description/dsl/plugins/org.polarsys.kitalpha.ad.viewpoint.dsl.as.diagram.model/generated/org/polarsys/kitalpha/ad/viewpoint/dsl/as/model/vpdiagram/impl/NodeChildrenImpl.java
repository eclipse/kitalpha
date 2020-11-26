/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Children</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeChildrenImpl#getOwned_boderednodes <em>Owned boderednodes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeChildrenImpl#getReused_boderednodes <em>Reused boderednodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeChildrenImpl extends EObjectImpl implements NodeChildren {

	/**
	 * The cached value of the '{@link #getOwned_boderednodes() <em>Owned boderednodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned_boderednodes()
	 * @generated
	 * @ordered
	 */
	protected EList<BorderedNode> owned_boderednodes;

	/**
	 * The cached value of the '{@link #getReused_boderednodes() <em>Reused boderednodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReused_boderednodes()
	 * @generated
	 * @ordered
	 */
	protected EList<BorderedNode> reused_boderednodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeChildrenImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.NODE_CHILDREN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<BorderedNode> getOwned_boderednodes() {

		if (owned_boderednodes == null) {
			owned_boderednodes = new EObjectContainmentEList<BorderedNode>(BorderedNode.class, this, VpdiagramPackage.NODE_CHILDREN__OWNED_BODEREDNODES);
		}
		return owned_boderednodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<BorderedNode> getReused_boderednodes() {

		if (reused_boderednodes == null) {
			reused_boderednodes = new EObjectResolvingEList<BorderedNode>(BorderedNode.class, this, VpdiagramPackage.NODE_CHILDREN__REUSED_BODEREDNODES);
		}
		return reused_boderednodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpdiagramPackage.NODE_CHILDREN__OWNED_BODEREDNODES:
				return ((InternalEList<?>)getOwned_boderednodes()).basicRemove(otherEnd, msgs);
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
			case VpdiagramPackage.NODE_CHILDREN__OWNED_BODEREDNODES:
				return getOwned_boderednodes();
			case VpdiagramPackage.NODE_CHILDREN__REUSED_BODEREDNODES:
				return getReused_boderednodes();
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
			case VpdiagramPackage.NODE_CHILDREN__OWNED_BODEREDNODES:
				getOwned_boderednodes().clear();
				getOwned_boderednodes().addAll((Collection<? extends BorderedNode>)newValue);
				return;
			case VpdiagramPackage.NODE_CHILDREN__REUSED_BODEREDNODES:
				getReused_boderednodes().clear();
				getReused_boderednodes().addAll((Collection<? extends BorderedNode>)newValue);
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
			case VpdiagramPackage.NODE_CHILDREN__OWNED_BODEREDNODES:
				getOwned_boderednodes().clear();
				return;
			case VpdiagramPackage.NODE_CHILDREN__REUSED_BODEREDNODES:
				getReused_boderednodes().clear();
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
			case VpdiagramPackage.NODE_CHILDREN__OWNED_BODEREDNODES:
				return owned_boderednodes != null && !owned_boderednodes.isEmpty();
			case VpdiagramPackage.NODE_CHILDREN__REUSED_BODEREDNODES:
				return reused_boderednodes != null && !reused_boderednodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeChildrenImpl
