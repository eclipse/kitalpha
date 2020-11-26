/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl;

import org.eclipse.egf.portfolio.genchain.generationChain.impl.DocumentationGenerationImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionPackage;
import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration;
import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kitalpha Documentation Generation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationImpl#getBrandingData <em>Branding Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KitalphaDocumentationGenerationImpl extends DocumentationGenerationImpl implements KitalphaDocumentationGeneration {
	/**
	 * The cached value of the '{@link #getBrandingData() <em>Branding Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandingData()
	 * @generated
	 * @ordered
	 */
	protected KitalphaDocumentationGenerationBranding brandingData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KitalphaDocumentationGenerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocgenGenchainExtensionPackage.Literals.KITALPHA_DOCUMENTATION_GENERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KitalphaDocumentationGenerationBranding getBrandingData() {
		return brandingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrandingData(KitalphaDocumentationGenerationBranding newBrandingData, NotificationChain msgs) {
		KitalphaDocumentationGenerationBranding oldBrandingData = brandingData;
		brandingData = newBrandingData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA, oldBrandingData, newBrandingData);
			if (msgs == null) {
				msgs = notification;
			}else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrandingData(KitalphaDocumentationGenerationBranding newBrandingData) {
		if (newBrandingData != brandingData) {
			NotificationChain msgs = null;
			if (brandingData != null){
				msgs = ((InternalEObject)brandingData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA, null, msgs);
			}
			if (newBrandingData != null){
				msgs = ((InternalEObject)newBrandingData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA, null, msgs);
			}
			msgs = basicSetBrandingData(newBrandingData, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, Notification.SET, DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA, newBrandingData, newBrandingData));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA:
				return basicSetBrandingData(null, msgs);
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
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA:
				return getBrandingData();
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
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA:
				setBrandingData((KitalphaDocumentationGenerationBranding)newValue);
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
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA:
				setBrandingData((KitalphaDocumentationGenerationBranding)null);
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
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA:
				return brandingData != null;
		}
		return super.eIsSet(featureID);
	}

} //KitalphaDocumentationGenerationImpl
