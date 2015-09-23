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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customizations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationsImpl#getOwnedCustomizationDescriptions <em>Owned Customization Descriptions</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationsImpl#getOwnedCustomizationReuse <em>Owned Customization Reuse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomizationsImpl extends MinimalEObjectImpl.Container implements Customizations {

	/**
	 * The cached value of the '{@link #getOwnedCustomizationDescriptions() <em>Owned Customization Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCustomizationDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleCustomizationDescriptions> ownedCustomizationDescriptions;




	/**
	 * The cached value of the '{@link #getOwnedCustomizationReuse() <em>Owned Customization Reuse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCustomizationReuse()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleCustomizationReuse> ownedCustomizationReuse;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomizationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.CUSTOMIZATIONS;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<StyleCustomizationDescriptions> getOwnedCustomizationDescriptions() {

		if (ownedCustomizationDescriptions == null) {
			ownedCustomizationDescriptions = new EObjectContainmentEList<StyleCustomizationDescriptions>(StyleCustomizationDescriptions.class, this, VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_DESCRIPTIONS);
		}
		return ownedCustomizationDescriptions;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<StyleCustomizationReuse> getOwnedCustomizationReuse() {

		if (ownedCustomizationReuse == null) {
			ownedCustomizationReuse = new EObjectContainmentEList<StyleCustomizationReuse>(StyleCustomizationReuse.class, this, VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_REUSE);
		}
		return ownedCustomizationReuse;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_DESCRIPTIONS:
				return ((InternalEList<?>)getOwnedCustomizationDescriptions()).basicRemove(otherEnd, msgs);
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_REUSE:
				return ((InternalEList<?>)getOwnedCustomizationReuse()).basicRemove(otherEnd, msgs);
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
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_DESCRIPTIONS:
				return getOwnedCustomizationDescriptions();
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_REUSE:
				return getOwnedCustomizationReuse();
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
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_DESCRIPTIONS:
				getOwnedCustomizationDescriptions().clear();
				getOwnedCustomizationDescriptions().addAll((Collection<? extends StyleCustomizationDescriptions>)newValue);
				return;
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_REUSE:
				getOwnedCustomizationReuse().clear();
				getOwnedCustomizationReuse().addAll((Collection<? extends StyleCustomizationReuse>)newValue);
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
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_DESCRIPTIONS:
				getOwnedCustomizationDescriptions().clear();
				return;
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_REUSE:
				getOwnedCustomizationReuse().clear();
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
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_DESCRIPTIONS:
				return ownedCustomizationDescriptions != null && !ownedCustomizationDescriptions.isEmpty();
			case VpstylecustomizationPackage.CUSTOMIZATIONS__OWNED_CUSTOMIZATION_REUSE:
				return ownedCustomizationReuse != null && !ownedCustomizationReuse.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //CustomizationsImpl
