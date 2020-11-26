/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.viewpoint.description.EStructuralFeatureCustomization;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Customization Reuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationReuseImpl#getReusedCustomization <em>Reused Customization</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationReuseImpl#getAppliedOn <em>Applied On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleCustomizationReuseImpl extends NamedElementImpl implements StyleCustomizationReuse {

	/**
	 * The cached value of the '{@link #getReusedCustomization() <em>Reused Customization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReusedCustomization()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeatureCustomization> reusedCustomization;




	/**
	 * The cached value of the '{@link #getAppliedOn() <em>Applied On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> appliedOn;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleCustomizationReuseImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_REUSE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<EStructuralFeatureCustomization> getReusedCustomization() {

		if (reusedCustomization == null) {
			reusedCustomization = new EObjectResolvingEList<EStructuralFeatureCustomization>(EStructuralFeatureCustomization.class, this, VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__REUSED_CUSTOMIZATION);
		}
		return reusedCustomization;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<EObject> getAppliedOn() {

		if (appliedOn == null) {
			appliedOn = new EObjectResolvingEList<EObject>(EObject.class, this, VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__APPLIED_ON);
		}
		return appliedOn;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__REUSED_CUSTOMIZATION:
				return getReusedCustomization();
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__APPLIED_ON:
				return getAppliedOn();
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
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__REUSED_CUSTOMIZATION:
				getReusedCustomization().clear();
				getReusedCustomization().addAll((Collection<? extends EStructuralFeatureCustomization>)newValue);
				return;
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__APPLIED_ON:
				getAppliedOn().clear();
				getAppliedOn().addAll((Collection<? extends EObject>)newValue);
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
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__REUSED_CUSTOMIZATION:
				getReusedCustomization().clear();
				return;
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__APPLIED_ON:
				getAppliedOn().clear();
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
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__REUSED_CUSTOMIZATION:
				return reusedCustomization != null && !reusedCustomization.isEmpty();
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE__APPLIED_ON:
				return appliedOn != null && !appliedOn.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //StyleCustomizationReuseImpl
