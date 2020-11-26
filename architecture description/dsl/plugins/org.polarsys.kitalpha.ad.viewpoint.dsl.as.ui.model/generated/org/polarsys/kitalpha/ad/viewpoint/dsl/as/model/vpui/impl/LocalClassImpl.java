/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
 
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.LocalClassImpl#getUI_For_LocalClass <em>UI For Local Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalClassImpl extends DataSourceImpl implements LocalClass {

	/**
	 * The cached value of the '{@link #getUI_For_LocalClass() <em>UI For Local Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUI_For_LocalClass()
	 * @generated
	 * @ordered
	 */
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class uI_For_LocalClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalClassImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpuiPackage.Literals.LOCAL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class getUI_For_LocalClass() {

		if (uI_For_LocalClass != null && uI_For_LocalClass.eIsProxy()) {
			InternalEObject oldUI_For_LocalClass = (InternalEObject)uI_For_LocalClass;
			uI_For_LocalClass = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)eResolveProxy(oldUI_For_LocalClass);
			if (uI_For_LocalClass != oldUI_For_LocalClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpuiPackage.LOCAL_CLASS__UI_FOR_LOCAL_CLASS, oldUI_For_LocalClass, uI_For_LocalClass));
			}
		}
		return uI_For_LocalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class basicGetUI_For_LocalClass() {

		return uI_For_LocalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUI_For_LocalClass(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class newUI_For_LocalClass) {

		org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class oldUI_For_LocalClass = uI_For_LocalClass;
		uI_For_LocalClass = newUI_For_LocalClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpuiPackage.LOCAL_CLASS__UI_FOR_LOCAL_CLASS, oldUI_For_LocalClass, uI_For_LocalClass));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpuiPackage.LOCAL_CLASS__UI_FOR_LOCAL_CLASS:
				if (resolve) return getUI_For_LocalClass();
				return basicGetUI_For_LocalClass();
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
			case VpuiPackage.LOCAL_CLASS__UI_FOR_LOCAL_CLASS:
				setUI_For_LocalClass((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)newValue);
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
			case VpuiPackage.LOCAL_CLASS__UI_FOR_LOCAL_CLASS:
				setUI_For_LocalClass((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)null);
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
			case VpuiPackage.LOCAL_CLASS__UI_FOR_LOCAL_CLASS:
				return uI_For_LocalClass != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalClassImpl
