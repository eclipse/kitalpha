/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.helper.StylesSelectionHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Container Style Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SpecificContainerStyleCustomizationImpl#getAppliedOn <em>Applied On</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpecificContainerStyleCustomizationImpl extends MinimalEObjectImpl.Container implements SpecificContainerStyleCustomization {



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificContainerStyleCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ContainerStyleDescription> getAppliedOn() {
		if (this.eContainer instanceof ContainerStyleCustomization) 
			return StylesSelectionHelper.filterCustomizedContainerStyles(this);
		
		return new BasicEList<ContainerStyleDescription>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON:
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
			case VpstylecustomizationPackage.SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				getAppliedOn().addAll((Collection<? extends ContainerStyleDescription>)newValue);
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
			case VpstylecustomizationPackage.SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON:
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
			case VpstylecustomizationPackage.SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON:
				return !getAppliedOn().isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //SpecificContainerStyleCustomizationImpl
