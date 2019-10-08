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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Class Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalClassAssociationImpl#getExternalTarget <em>External Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalClassAssociationImpl extends AbstractAssociationImpl
		implements ExternalClassAssociation {

	/**
	 * The cached value of the '{@link #getExternalTarget() <em>External Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalTarget()
	 * @generated
	 * @ordered
	 */
	protected EClass externalTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalClassAssociationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.EXTERNAL_CLASS_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EClass getExternalTarget() {

		if (externalTarget != null && externalTarget.eIsProxy()) {
			InternalEObject oldExternalTarget = (InternalEObject)externalTarget;
			externalTarget = (EClass)eResolveProxy(oldExternalTarget);
			if (externalTarget != oldExternalTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpdescPackage.EXTERNAL_CLASS_ASSOCIATION__EXTERNAL_TARGET, oldExternalTarget, externalTarget));
			}
		}
		return externalTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EClass basicGetExternalTarget() {

		return externalTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExternalTarget(EClass newExternalTarget) {

		EClass oldExternalTarget = externalTarget;
		externalTarget = newExternalTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.EXTERNAL_CLASS_ASSOCIATION__EXTERNAL_TARGET, oldExternalTarget, externalTarget));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpdescPackage.EXTERNAL_CLASS_ASSOCIATION__EXTERNAL_TARGET:
				if (resolve) return getExternalTarget();
				return basicGetExternalTarget();
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
			case VpdescPackage.EXTERNAL_CLASS_ASSOCIATION__EXTERNAL_TARGET:
				setExternalTarget((EClass)newValue);
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
			case VpdescPackage.EXTERNAL_CLASS_ASSOCIATION__EXTERNAL_TARGET:
				setExternalTarget((EClass)null);
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
			case VpdescPackage.EXTERNAL_CLASS_ASSOCIATION__EXTERNAL_TARGET:
				return externalTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalClassAssociationImpl
