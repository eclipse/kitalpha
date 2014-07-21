/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Children</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerChildrenImpl#getOwned_nodes <em>Owned nodes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerChildrenImpl#getReused_nodes <em>Reused nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerChildrenImpl extends EObjectImpl implements
		ContainerChildren {

	/**
	 * The cached value of the '{@link #getOwned_nodes() <em>Owned nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned_nodes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNode> owned_nodes;

	/**
	 * The cached value of the '{@link #getReused_nodes() <em>Reused nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReused_nodes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNode> reused_nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerChildrenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.CONTAINER_CHILDREN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractNode> getOwned_nodes() {
		if (owned_nodes == null) {
			owned_nodes = new EObjectContainmentEList<AbstractNode>(AbstractNode.class, this, VpdiagramPackage.CONTAINER_CHILDREN__OWNED_NODES);
		}
		return owned_nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractNode> getReused_nodes() {
		if (reused_nodes == null) {
			reused_nodes = new EObjectResolvingEList<AbstractNode>(AbstractNode.class, this, VpdiagramPackage.CONTAINER_CHILDREN__REUSED_NODES);
		}
		return reused_nodes;
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
			case VpdiagramPackage.CONTAINER_CHILDREN__OWNED_NODES:
				return ((InternalEList<?>)getOwned_nodes()).basicRemove(otherEnd, msgs);
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
			case VpdiagramPackage.CONTAINER_CHILDREN__OWNED_NODES:
				return getOwned_nodes();
			case VpdiagramPackage.CONTAINER_CHILDREN__REUSED_NODES:
				return getReused_nodes();
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
			case VpdiagramPackage.CONTAINER_CHILDREN__OWNED_NODES:
				getOwned_nodes().clear();
				getOwned_nodes().addAll((Collection<? extends AbstractNode>)newValue);
				return;
			case VpdiagramPackage.CONTAINER_CHILDREN__REUSED_NODES:
				getReused_nodes().clear();
				getReused_nodes().addAll((Collection<? extends AbstractNode>)newValue);
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
			case VpdiagramPackage.CONTAINER_CHILDREN__OWNED_NODES:
				getOwned_nodes().clear();
				return;
			case VpdiagramPackage.CONTAINER_CHILDREN__REUSED_NODES:
				getReused_nodes().clear();
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
			case VpdiagramPackage.CONTAINER_CHILDREN__OWNED_NODES:
				return owned_nodes != null && !owned_nodes.isEmpty();
			case VpdiagramPackage.CONTAINER_CHILDREN__REUSED_NODES:
				return reused_nodes != null && !reused_nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerChildrenImpl
