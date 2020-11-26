/**
 * ******************************************************************************
 *  Copyright (c) 2016-2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataImpl#getViewpointReferences <em>Viewpoint References</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataImpl#getAdditionalMetadata <em>Additional Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataImpl extends MetadataElementImpl implements Metadata {

	/**
	 * The cached value of the '{@link #getViewpointReferences() <em>Viewpoint References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpointReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewpointReference> viewpointReferences;
	/**
	 * The cached value of the '{@link #getAdditionalMetadata() <em>Additional Metadata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> additionalMetadata;
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

	public EList<ViewpointReference> getViewpointReferences() {

		if (viewpointReferences == null) {
			viewpointReferences = new EObjectContainmentEList<ViewpointReference>(ViewpointReference.class, this, MetadataPackage.METADATA__VIEWPOINT_REFERENCES);
		}
		return viewpointReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Metadata> getAdditionalMetadata() {

		if (additionalMetadata == null) {
			additionalMetadata = new EObjectResolvingEList<Metadata>(Metadata.class, this, MetadataPackage.METADATA__ADDITIONAL_METADATA);
		}
		return additionalMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.METADATA__VIEWPOINT_REFERENCES:
				return ((InternalEList<?>)getViewpointReferences()).basicRemove(otherEnd, msgs);
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
			case MetadataPackage.METADATA__VIEWPOINT_REFERENCES:
				return getViewpointReferences();
			case MetadataPackage.METADATA__ADDITIONAL_METADATA:
				return getAdditionalMetadata();
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
			case MetadataPackage.METADATA__VIEWPOINT_REFERENCES:
				getViewpointReferences().clear();
				getViewpointReferences().addAll((Collection<? extends ViewpointReference>)newValue);
				return;
			case MetadataPackage.METADATA__ADDITIONAL_METADATA:
				getAdditionalMetadata().clear();
				getAdditionalMetadata().addAll((Collection<? extends Metadata>)newValue);
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
			case MetadataPackage.METADATA__VIEWPOINT_REFERENCES:
				getViewpointReferences().clear();
				return;
			case MetadataPackage.METADATA__ADDITIONAL_METADATA:
				getAdditionalMetadata().clear();
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
			case MetadataPackage.METADATA__VIEWPOINT_REFERENCES:
				return viewpointReferences != null && !viewpointReferences.isEmpty();
			case MetadataPackage.METADATA__ADDITIONAL_METADATA:
				return additionalMetadata != null && !additionalMetadata.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //MetadataImpl
