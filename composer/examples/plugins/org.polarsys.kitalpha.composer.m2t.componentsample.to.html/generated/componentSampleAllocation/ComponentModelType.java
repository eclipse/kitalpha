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
 * A representation of the model object '<em><b>Component Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentSampleAllocation.ComponentModelType#getHardwareComponents <em>Hardware Components</em>}</li>
 *   <li>{@link componentSampleAllocation.ComponentModelType#getSoftwarecomponents <em>Softwarecomponents</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentModelType()
 * @model
 * @generated
 */
public interface ComponentModelType extends Type {
	/**
	 * Returns the value of the '<em><b>Hardware Components</b></em>' reference list.
	 * The list contents are of type {@link componentSampleAllocation.ComponentSampleHardware}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Components</em>' reference list.
	 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentModelType_HardwareComponents()
	 * @model
	 * @generated
	 */
	EList<ComponentSampleHardware> getHardwareComponents();

	/**
	 * Returns the value of the '<em><b>Softwarecomponents</b></em>' reference list.
	 * The list contents are of type {@link componentSampleAllocation.ComponentSampleSoftware}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Softwarecomponents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Softwarecomponents</em>' reference list.
	 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentModelType_Softwarecomponents()
	 * @model
	 * @generated
	 */
	EList<ComponentSampleSoftware> getSoftwarecomponents();

} // ComponentModelType
