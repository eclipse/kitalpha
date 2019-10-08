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
import componentSampleAllocation.ComponentType;
import componentSampleAllocation.ContainedBy;
import componentSampleAllocation.UsedBy;
import componentSampleAllocation.Uses;

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
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link componentSampleAllocation.impl.ComponentTypeImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link componentSampleAllocation.impl.ComponentTypeImpl#getUsedComponents <em>Used Components</em>}</li>
 *   <li>{@link componentSampleAllocation.impl.ComponentTypeImpl#getUsedByComponent <em>Used By Component</em>}</li>
 *   <li>{@link componentSampleAllocation.impl.ComponentTypeImpl#getContainedByComponent <em>Contained By Component</em>}</li>
 *   <li>{@link componentSampleAllocation.impl.ComponentTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentTypeImpl extends EObjectImpl implements ComponentType {
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
	 * The cached value of the '{@link #getUsedComponents() <em>Used Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Uses> usedComponents;

	/**
	 * The cached value of the '{@link #getUsedByComponent() <em>Used By Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedByComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<UsedBy> usedByComponent;

	/**
	 * The cached value of the '{@link #getContainedByComponent() <em>Contained By Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedByComponent()
	 * @generated
	 * @ordered
	 */
	protected ContainedBy containedByComponent;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSampleAllocationPackage.Literals.COMPONENT_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentSampleAllocationPackage.COMPONENT_TYPE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentSampleAllocationPackage.COMPONENT_TYPE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uses> getUsedComponents() {
		if (usedComponents == null) {
			usedComponents = new EObjectResolvingEList<Uses>(Uses.class, this, ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_COMPONENTS);
		}
		return usedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsedBy> getUsedByComponent() {
		if (usedByComponent == null) {
			usedByComponent = new EObjectResolvingEList<UsedBy>(UsedBy.class, this, ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_BY_COMPONENT);
		}
		return usedByComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedBy getContainedByComponent() {
		if (containedByComponent != null && containedByComponent.eIsProxy()) {
			InternalEObject oldContainedByComponent = (InternalEObject)containedByComponent;
			containedByComponent = (ContainedBy)eResolveProxy(oldContainedByComponent);
			if (containedByComponent != oldContainedByComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentSampleAllocationPackage.COMPONENT_TYPE__CONTAINED_BY_COMPONENT, oldContainedByComponent, containedByComponent));
			}
		}
		return containedByComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedBy basicGetContainedByComponent() {
		return containedByComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedByComponent(ContainedBy newContainedByComponent) {
		ContainedBy oldContainedByComponent = containedByComponent;
		containedByComponent = newContainedByComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentSampleAllocationPackage.COMPONENT_TYPE__CONTAINED_BY_COMPONENT, oldContainedByComponent, containedByComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentSampleAllocationPackage.COMPONENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_COMPONENTS:
				return getUsedComponents();
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_BY_COMPONENT:
				return getUsedByComponent();
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__CONTAINED_BY_COMPONENT:
				if (resolve) return getContainedByComponent();
				return basicGetContainedByComponent();
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__NAME:
				return getName();
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
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__REFERENCED_ELEMENT:
				setReferencedElement((EObject)newValue);
				return;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_COMPONENTS:
				getUsedComponents().clear();
				getUsedComponents().addAll((Collection<? extends Uses>)newValue);
				return;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_BY_COMPONENT:
				getUsedByComponent().clear();
				getUsedByComponent().addAll((Collection<? extends UsedBy>)newValue);
				return;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__CONTAINED_BY_COMPONENT:
				setContainedByComponent((ContainedBy)newValue);
				return;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__NAME:
				setName((String)newValue);
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
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__REFERENCED_ELEMENT:
				setReferencedElement((EObject)null);
				return;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_COMPONENTS:
				getUsedComponents().clear();
				return;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_BY_COMPONENT:
				getUsedByComponent().clear();
				return;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__CONTAINED_BY_COMPONENT:
				setContainedByComponent((ContainedBy)null);
				return;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__REFERENCED_ELEMENT:
				return referencedElement != null;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_COMPONENTS:
				return usedComponents != null && !usedComponents.isEmpty();
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__USED_BY_COMPONENT:
				return usedByComponent != null && !usedByComponent.isEmpty();
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__CONTAINED_BY_COMPONENT:
				return containedByComponent != null;
			case ComponentSampleAllocationPackage.COMPONENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
