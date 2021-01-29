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


package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.AbstractServicesElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Services Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.AbstractServicesElementImpl#getVpid <em>Vpid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractServicesElementImpl extends NamedElementImpl
		implements AbstractServicesElement {

	/**
	 * The default value of the '{@link #getVpid() <em>Vpid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpid()
	 * @generated
	 * @ordered
	 */
	protected static final String VPID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpid() <em>Vpid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpid()
	 * @generated
	 * @ordered
	 */
	protected String vpid = VPID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractServicesElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpservicesPackage.Literals.ABSTRACT_SERVICES_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getVpid() {

		return vpid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setVpid(String newVpid) {

		String oldVpid = vpid;
		vpid = newVpid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpservicesPackage.ABSTRACT_SERVICES_ELEMENT__VPID, oldVpid, vpid));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpservicesPackage.ABSTRACT_SERVICES_ELEMENT__VPID:
				return getVpid();
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
			case VpservicesPackage.ABSTRACT_SERVICES_ELEMENT__VPID:
				setVpid((String)newValue);
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
			case VpservicesPackage.ABSTRACT_SERVICES_ELEMENT__VPID:
				setVpid(VPID_EDEFAULT);
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
			case VpservicesPackage.ABSTRACT_SERVICES_ELEMENT__VPID:
				return VPID_EDEFAULT == null ? vpid != null : !VPID_EDEFAULT.equals(vpid);
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
		result.append(" (vpid: ");
		result.append(vpid);
		result.append(')');
		return result.toString();
	}

} //AbstractServicesElementImpl
