/*******************************************************************************
 * Copyright (c) 2014-2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractNodeImpl#getThe_domain <em>The domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractNodeImpl extends EObjectImpl implements
		AbstractNode {

	/**
	 * The cached value of the '{@link #getThe_domain() <em>The domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThe_domain()
	 * @generated
	 * @ordered
	 */
	protected NodeDomainElement the_domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNodeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.ABSTRACT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NodeDomainElement getThe_domain() {

		return the_domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetThe_domain(
			NodeDomainElement newThe_domain, NotificationChain msgs) {

		NodeDomainElement oldThe_domain = the_domain;
		the_domain = newThe_domain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN, oldThe_domain, newThe_domain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setThe_domain(NodeDomainElement newThe_domain) {

		if (newThe_domain != the_domain) {
			NotificationChain msgs = null;
			if (the_domain != null)
				msgs = ((InternalEObject)the_domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN, null, msgs);
			if (newThe_domain != null)
				msgs = ((InternalEObject)newThe_domain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN, null, msgs);
			msgs = basicSetThe_domain(newThe_domain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN, newThe_domain, newThe_domain));

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
			case VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN:
				return basicSetThe_domain(null, msgs);
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
			case VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN:
				return getThe_domain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN:
				setThe_domain((NodeDomainElement)newValue);
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
			case VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN:
				setThe_domain((NodeDomainElement)null);
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
			case VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN:
				return the_domain != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractNodeImpl
