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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Super Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalSuperClassImpl#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalSuperClassImpl extends AbstractSuperClassImpl implements
		LocalSuperClass {

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class superClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalSuperClassImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.LOCAL_SUPER_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class getSuperClass() {

		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject)superClass;
			superClass = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpdescPackage.LOCAL_SUPER_CLASS__SUPER_CLASS, oldSuperClass, superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class basicGetSuperClass() {

		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSuperClass(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class newSuperClass) {

		org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.LOCAL_SUPER_CLASS__SUPER_CLASS, oldSuperClass, superClass));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpdescPackage.LOCAL_SUPER_CLASS__SUPER_CLASS:
				if (resolve) return getSuperClass();
				return basicGetSuperClass();
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
			case VpdescPackage.LOCAL_SUPER_CLASS__SUPER_CLASS:
				setSuperClass((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)newValue);
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
			case VpdescPackage.LOCAL_SUPER_CLASS__SUPER_CLASS:
				setSuperClass((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)null);
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
			case VpdescPackage.LOCAL_SUPER_CLASS__SUPER_CLASS:
				return superClass != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalSuperClassImpl
