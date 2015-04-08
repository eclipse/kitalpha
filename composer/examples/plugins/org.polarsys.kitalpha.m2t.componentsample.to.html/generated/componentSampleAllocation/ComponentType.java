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
package componentSampleAllocation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentSampleAllocation.ComponentType#getUsedComponents <em>Used Components</em>}</li>
 *   <li>{@link componentSampleAllocation.ComponentType#getUsedByComponent <em>Used By Component</em>}</li>
 *   <li>{@link componentSampleAllocation.ComponentType#getContainedByComponent <em>Contained By Component</em>}</li>
 *   <li>{@link componentSampleAllocation.ComponentType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentType()
 * @model abstract="true"
 * @generated
 */
public interface ComponentType extends Type {
	/**
	 * Returns the value of the '<em><b>Used Components</b></em>' reference list.
	 * The list contents are of type {@link componentSampleAllocation.Uses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Components</em>' reference list.
	 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentType_UsedComponents()
	 * @model
	 * @generated
	 */
	EList<Uses> getUsedComponents();

	/**
	 * Returns the value of the '<em><b>Used By Component</b></em>' reference list.
	 * The list contents are of type {@link componentSampleAllocation.UsedBy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By Component</em>' reference list.
	 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentType_UsedByComponent()
	 * @model
	 * @generated
	 */
	EList<UsedBy> getUsedByComponent();

	/**
	 * Returns the value of the '<em><b>Contained By Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained By Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained By Component</em>' reference.
	 * @see #setContainedByComponent(ContainedBy)
	 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentType_ContainedByComponent()
	 * @model
	 * @generated
	 */
	ContainedBy getContainedByComponent();

	/**
	 * Sets the value of the '{@link componentSampleAllocation.ComponentType#getContainedByComponent <em>Contained By Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained By Component</em>' reference.
	 * @see #getContainedByComponent()
	 * @generated
	 */
	void setContainedByComponent(ContainedBy value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentSampleAllocation.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentType
