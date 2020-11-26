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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointElementImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.FieldMappingImpl#getUI_Field_Mapped_To <em>UI Field Mapped To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldMappingImpl extends ViewpointElementImpl implements
		FieldMapping {

	/**
	 * The cached value of the '{@link #getUI_Field_Mapped_To() <em>UI Field Mapped To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUI_Field_Mapped_To()
	 * @generated
	 * @ordered
	 */
	protected AbstractFeature uI_Field_Mapped_To;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldMappingImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpuiPackage.Literals.FIELD_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractFeature getUI_Field_Mapped_To() {

		if (uI_Field_Mapped_To != null && uI_Field_Mapped_To.eIsProxy()) {
			InternalEObject oldUI_Field_Mapped_To = (InternalEObject)uI_Field_Mapped_To;
			uI_Field_Mapped_To = (AbstractFeature)eResolveProxy(oldUI_Field_Mapped_To);
			if (uI_Field_Mapped_To != oldUI_Field_Mapped_To) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpuiPackage.FIELD_MAPPING__UI_FIELD_MAPPED_TO, oldUI_Field_Mapped_To, uI_Field_Mapped_To));
			}
		}
		return uI_Field_Mapped_To;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractFeature basicGetUI_Field_Mapped_To() {

		return uI_Field_Mapped_To;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUI_Field_Mapped_To(AbstractFeature newUI_Field_Mapped_To) {

		AbstractFeature oldUI_Field_Mapped_To = uI_Field_Mapped_To;
		uI_Field_Mapped_To = newUI_Field_Mapped_To;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpuiPackage.FIELD_MAPPING__UI_FIELD_MAPPED_TO, oldUI_Field_Mapped_To, uI_Field_Mapped_To));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpuiPackage.FIELD_MAPPING__UI_FIELD_MAPPED_TO:
				if (resolve) return getUI_Field_Mapped_To();
				return basicGetUI_Field_Mapped_To();
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
			case VpuiPackage.FIELD_MAPPING__UI_FIELD_MAPPED_TO:
				setUI_Field_Mapped_To((AbstractFeature)newValue);
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
			case VpuiPackage.FIELD_MAPPING__UI_FIELD_MAPPED_TO:
				setUI_Field_Mapped_To((AbstractFeature)null);
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
			case VpuiPackage.FIELD_MAPPING__UI_FIELD_MAPPED_TO:
				return uI_Field_Mapped_To != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldMappingImpl
