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
package componentSampleAllocation.impl;

import componentSampleAllocation.ComponentSampleAllocationPackage;
import componentSampleAllocation.ComponentSampleHardware;
import componentSampleAllocation.Contains;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Sample Hardware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link componentSampleAllocation.impl.ComponentSampleHardwareImpl#getContainsComponents <em>Contains Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentSampleHardwareImpl extends ComponentTypeImpl implements ComponentSampleHardware {
	/**
	 * The cached value of the '{@link #getContainsComponents() <em>Contains Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Contains> containsComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSampleHardwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSampleAllocationPackage.Literals.COMPONENT_SAMPLE_HARDWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contains> getContainsComponents() {
		if (containsComponents == null) {
			containsComponents = new EObjectResolvingEList<Contains>(Contains.class, this, ComponentSampleAllocationPackage.COMPONENT_SAMPLE_HARDWARE__CONTAINS_COMPONENTS);
		}
		return containsComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_HARDWARE__CONTAINS_COMPONENTS:
				return getContainsComponents();
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
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_HARDWARE__CONTAINS_COMPONENTS:
				getContainsComponents().clear();
				getContainsComponents().addAll((Collection<? extends Contains>)newValue);
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
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_HARDWARE__CONTAINS_COMPONENTS:
				getContainsComponents().clear();
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
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_HARDWARE__CONTAINS_COMPONENTS:
				return containsComponents != null && !containsComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentSampleHardwareImpl
