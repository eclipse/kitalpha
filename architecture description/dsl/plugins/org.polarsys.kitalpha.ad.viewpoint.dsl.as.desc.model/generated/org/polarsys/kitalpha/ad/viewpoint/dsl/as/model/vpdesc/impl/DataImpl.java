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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DataImpl#getVP_Classes <em>VP Classes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DataImpl#getVP_Enumerations <em>VP Enumerations</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DataImpl#getAdditionalExternalData <em>Additional External Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends AnnotatableElementImpl implements Data {

	/**
	 * The cached value of the '{@link #getVP_Classes() <em>VP Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVP_Classes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class> vP_Classes;

	/**
	 * The cached value of the '{@link #getVP_Enumerations() <em>VP Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVP_Enumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> vP_Enumerations;

	/**
	 * The cached value of the '{@link #getAdditionalExternalData() <em>Additional External Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalExternalData()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> additionalExternalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class> getVP_Classes() {

		if (vP_Classes == null) {
			vP_Classes = new EObjectContainmentEList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class>(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class.class, this, VpdescPackage.DATA__VP_CLASSES);
		}
		return vP_Classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<EPackage> getAdditionalExternalData() {

		if (additionalExternalData == null) {
			additionalExternalData = new EObjectResolvingEList<EPackage>(EPackage.class, this, VpdescPackage.DATA__ADDITIONAL_EXTERNAL_DATA);
		}
		return additionalExternalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Enumeration> getVP_Enumerations() {

		if (vP_Enumerations == null) {
			vP_Enumerations = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, VpdescPackage.DATA__VP_ENUMERATIONS);
		}
		return vP_Enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpdescPackage.DATA__VP_CLASSES:
				return ((InternalEList<?>)getVP_Classes()).basicRemove(otherEnd, msgs);
			case VpdescPackage.DATA__VP_ENUMERATIONS:
				return ((InternalEList<?>)getVP_Enumerations()).basicRemove(otherEnd, msgs);
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
			case VpdescPackage.DATA__VP_CLASSES:
				return getVP_Classes();
			case VpdescPackage.DATA__VP_ENUMERATIONS:
				return getVP_Enumerations();
			case VpdescPackage.DATA__ADDITIONAL_EXTERNAL_DATA:
				return getAdditionalExternalData();
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
			case VpdescPackage.DATA__VP_CLASSES:
				getVP_Classes().clear();
				getVP_Classes().addAll((Collection<? extends org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class>)newValue);
				return;
			case VpdescPackage.DATA__VP_ENUMERATIONS:
				getVP_Enumerations().clear();
				getVP_Enumerations().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case VpdescPackage.DATA__ADDITIONAL_EXTERNAL_DATA:
				getAdditionalExternalData().clear();
				getAdditionalExternalData().addAll((Collection<? extends EPackage>)newValue);
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
			case VpdescPackage.DATA__VP_CLASSES:
				getVP_Classes().clear();
				return;
			case VpdescPackage.DATA__VP_ENUMERATIONS:
				getVP_Enumerations().clear();
				return;
			case VpdescPackage.DATA__ADDITIONAL_EXTERNAL_DATA:
				getAdditionalExternalData().clear();
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
			case VpdescPackage.DATA__VP_CLASSES:
				return vP_Classes != null && !vP_Classes.isEmpty();
			case VpdescPackage.DATA__VP_ENUMERATIONS:
				return vP_Enumerations != null && !vP_Enumerations.isEmpty();
			case VpdescPackage.DATA__ADDITIONAL_EXTERNAL_DATA:
				return additionalExternalData != null && !additionalExternalData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataImpl
