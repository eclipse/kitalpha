/**
 * ******************************************************************************
 *  Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 * *******************************************************************************
 * 
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.metadata.metadata.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataImpl#getViewpointUsages <em>Viewpoint Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataImpl extends MinimalEObjectImpl.Container implements Metadata {

	/**
	 * The cached value of the '{@link #getViewpointUsages() <em>Viewpoint Usages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpointUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewpointUsage> viewpointUsages;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.METADATA;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ViewpointUsage> getViewpointUsages() {

		if (viewpointUsages == null) {
			viewpointUsages = new EObjectContainmentEList<ViewpointUsage>(ViewpointUsage.class, this, MetadataPackage.METADATA__VIEWPOINT_USAGES);
		}
		return viewpointUsages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.METADATA__VIEWPOINT_USAGES:
				return ((InternalEList<?>)getViewpointUsages()).basicRemove(otherEnd, msgs);
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
			case MetadataPackage.METADATA__VIEWPOINT_USAGES:
				return getViewpointUsages();
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
			case MetadataPackage.METADATA__VIEWPOINT_USAGES:
				getViewpointUsages().clear();
				getViewpointUsages().addAll((Collection<? extends ViewpointUsage>)newValue);
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
			case MetadataPackage.METADATA__VIEWPOINT_USAGES:
				getViewpointUsages().clear();
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
			case MetadataPackage.METADATA__VIEWPOINT_USAGES:
				return viewpointUsages != null && !viewpointUsages.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //MetadataImpl
