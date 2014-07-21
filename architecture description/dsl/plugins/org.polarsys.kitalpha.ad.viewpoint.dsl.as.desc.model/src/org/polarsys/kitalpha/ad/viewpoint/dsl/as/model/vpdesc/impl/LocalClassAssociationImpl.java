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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Class Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalClassAssociationImpl#getLocalTarget <em>Local Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalClassAssociationImpl extends AbstractAssociationImpl
		implements LocalClassAssociation {

	/**
	 * The cached value of the '{@link #getLocalTarget() <em>Local Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalTarget()
	 * @generated
	 * @ordered
	 */
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class localTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalClassAssociationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.LOCAL_CLASS_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class getLocalTarget() {

		if (localTarget != null && localTarget.eIsProxy()) {
			InternalEObject oldLocalTarget = (InternalEObject)localTarget;
			localTarget = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)eResolveProxy(oldLocalTarget);
			if (localTarget != oldLocalTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpdescPackage.LOCAL_CLASS_ASSOCIATION__LOCAL_TARGET, oldLocalTarget, localTarget));
			}
		}
		return localTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class basicGetLocalTarget() {

		return localTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLocalTarget(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class newLocalTarget) {

		org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class oldLocalTarget = localTarget;
		localTarget = newLocalTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.LOCAL_CLASS_ASSOCIATION__LOCAL_TARGET, oldLocalTarget, localTarget));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpdescPackage.LOCAL_CLASS_ASSOCIATION__LOCAL_TARGET:
				if (resolve) return getLocalTarget();
				return basicGetLocalTarget();
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
			case VpdescPackage.LOCAL_CLASS_ASSOCIATION__LOCAL_TARGET:
				setLocalTarget((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)newValue);
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
			case VpdescPackage.LOCAL_CLASS_ASSOCIATION__LOCAL_TARGET:
				setLocalTarget((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)null);
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
			case VpdescPackage.LOCAL_CLASS_ASSOCIATION__LOCAL_TARGET:
				return localTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalClassAssociationImpl
