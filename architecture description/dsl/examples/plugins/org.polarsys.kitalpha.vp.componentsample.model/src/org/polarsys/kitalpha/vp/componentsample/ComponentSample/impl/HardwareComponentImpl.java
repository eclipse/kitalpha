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

import org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.HardwareComponentImpl#getAbstractComponent <em>Abstract Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareComponentImpl extends AbstractComponentImpl implements
		HardwareComponent {

	/**
	 * The cached value of the '{@link #getAbstractComponent() <em>Abstract Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractComponent> abstractComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareComponentImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSamplePackage.Literals.HARDWARE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractComponent> getAbstractComponent() {

		if (abstractComponent == null) {
			abstractComponent = new EObjectContainmentEList<AbstractComponent>(
					AbstractComponent.class,
					this,
					ComponentSamplePackage.HARDWARE_COMPONENT__ABSTRACT_COMPONENT);
		}
		return abstractComponent;
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
		case ComponentSamplePackage.HARDWARE_COMPONENT__ABSTRACT_COMPONENT:
			return ((InternalEList<?>) getAbstractComponent()).basicRemove(
					otherEnd, msgs);
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
		case ComponentSamplePackage.HARDWARE_COMPONENT__ABSTRACT_COMPONENT:
			return getAbstractComponent();
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
		case ComponentSamplePackage.HARDWARE_COMPONENT__ABSTRACT_COMPONENT:
			getAbstractComponent().clear();
			getAbstractComponent().addAll(
					(Collection<? extends AbstractComponent>) newValue);
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
		case ComponentSamplePackage.HARDWARE_COMPONENT__ABSTRACT_COMPONENT:
			getAbstractComponent().clear();
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
		case ComponentSamplePackage.HARDWARE_COMPONENT__ABSTRACT_COMPONENT:
			return abstractComponent != null && !abstractComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwareComponentImpl