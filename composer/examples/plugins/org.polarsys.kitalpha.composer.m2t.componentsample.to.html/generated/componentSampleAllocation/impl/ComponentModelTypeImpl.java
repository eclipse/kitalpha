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

import componentSampleAllocation.ComponentModelType;
import componentSampleAllocation.ComponentSampleAllocationPackage;
import componentSampleAllocation.ComponentSampleHardware;
import componentSampleAllocation.ComponentSampleSoftware;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link componentSampleAllocation.impl.ComponentModelTypeImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link componentSampleAllocation.impl.ComponentModelTypeImpl#getHardwareComponents <em>Hardware Components</em>}</li>
 *   <li>{@link componentSampleAllocation.impl.ComponentModelTypeImpl#getSoftwarecomponents <em>Softwarecomponents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentModelTypeImpl extends EObjectImpl implements ComponentModelType {
	/**
	 * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject referencedElement;

	/**
	 * The cached value of the '{@link #getHardwareComponents() <em>Hardware Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentSampleHardware> hardwareComponents;

	/**
	 * The cached value of the '{@link #getSoftwarecomponents() <em>Softwarecomponents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwarecomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentSampleSoftware> softwarecomponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSampleAllocationPackage.Literals.COMPONENT_MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getReferencedElement() {
		if (referencedElement != null && referencedElement.eIsProxy()) {
			InternalEObject oldReferencedElement = (InternalEObject)referencedElement;
			referencedElement = eResolveProxy(oldReferencedElement);
			if (referencedElement != oldReferencedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
			}
		}
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetReferencedElement() {
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(EObject newReferencedElement) {
		EObject oldReferencedElement = referencedElement;
		referencedElement = newReferencedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentSampleHardware> getHardwareComponents() {
		if (hardwareComponents == null) {
			hardwareComponents = new EObjectResolvingEList<ComponentSampleHardware>(ComponentSampleHardware.class, this, ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__HARDWARE_COMPONENTS);
		}
		return hardwareComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentSampleSoftware> getSoftwarecomponents() {
		if (softwarecomponents == null) {
			softwarecomponents = new EObjectResolvingEList<ComponentSampleSoftware>(ComponentSampleSoftware.class, this, ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__SOFTWARECOMPONENTS);
		}
		return softwarecomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__HARDWARE_COMPONENTS:
				return getHardwareComponents();
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__SOFTWARECOMPONENTS:
				return getSoftwarecomponents();
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
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__REFERENCED_ELEMENT:
				setReferencedElement((EObject)newValue);
				return;
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__HARDWARE_COMPONENTS:
				getHardwareComponents().clear();
				getHardwareComponents().addAll((Collection<? extends ComponentSampleHardware>)newValue);
				return;
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__SOFTWARECOMPONENTS:
				getSoftwarecomponents().clear();
				getSoftwarecomponents().addAll((Collection<? extends ComponentSampleSoftware>)newValue);
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
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__REFERENCED_ELEMENT:
				setReferencedElement((EObject)null);
				return;
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__HARDWARE_COMPONENTS:
				getHardwareComponents().clear();
				return;
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__SOFTWARECOMPONENTS:
				getSoftwarecomponents().clear();
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
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__REFERENCED_ELEMENT:
				return referencedElement != null;
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__HARDWARE_COMPONENTS:
				return hardwareComponents != null && !hardwareComponents.isEmpty();
			case ComponentSampleAllocationPackage.COMPONENT_MODEL_TYPE__SOFTWARECOMPONENTS:
				return softwarecomponents != null && !softwarecomponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentModelTypeImpl
