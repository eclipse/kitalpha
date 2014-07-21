/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationImpl#getRepresentations <em>Representations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationImpl extends EObjectImpl implements Representation {

	/**
	 * The cached value of the '{@link #getRepresentations() <em>Representations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationElement> representations;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointPackage.Literals.REPRESENTATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<RepresentationElement> getRepresentations() {

		if (representations == null) {
			representations = new EObjectContainmentEList<RepresentationElement>(RepresentationElement.class, this, ViewpointPackage.REPRESENTATION__REPRESENTATIONS);
		}
		return representations;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointPackage.REPRESENTATION__REPRESENTATIONS:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
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
			case ViewpointPackage.REPRESENTATION__REPRESENTATIONS:
				return getRepresentations();
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
			case ViewpointPackage.REPRESENTATION__REPRESENTATIONS:
				getRepresentations().clear();
				getRepresentations().addAll((Collection<? extends RepresentationElement>)newValue);
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
			case ViewpointPackage.REPRESENTATION__REPRESENTATIONS:
				getRepresentations().clear();
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
			case ViewpointPackage.REPRESENTATION__REPRESENTATIONS:
				return representations != null && !representations.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //RepresentationImpl
