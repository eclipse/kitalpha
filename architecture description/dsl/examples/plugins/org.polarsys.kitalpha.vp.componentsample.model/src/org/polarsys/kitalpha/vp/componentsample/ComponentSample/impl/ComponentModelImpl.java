/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentModelImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentModelImpl extends ComponentElementImpl implements
		ComponentModel {

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package> packages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentModelImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSamplePackage.Literals.COMPONENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package> getPackages() {

		if (packages == null) {
			packages = new EObjectContainmentEList<org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package>(
					org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package.class,
					this, ComponentSamplePackage.COMPONENT_MODEL__PACKAGES);
		}
		return packages;
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
		case ComponentSamplePackage.COMPONENT_MODEL__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd,
					msgs);
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
		case ComponentSamplePackage.COMPONENT_MODEL__PACKAGES:
			return getPackages();
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
		case ComponentSamplePackage.COMPONENT_MODEL__PACKAGES:
			getPackages().clear();
			getPackages()
					.addAll((Collection<? extends org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package>) newValue);
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
		case ComponentSamplePackage.COMPONENT_MODEL__PACKAGES:
			getPackages().clear();
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
		case ComponentSamplePackage.COMPONENT_MODEL__PACKAGES:
			return packages != null && !packages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentModelImpl