/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package componentSampleAllocation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Sample Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentSampleAllocation.ComponentSampleHardware#getContainsComponents <em>Contains Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentSampleHardware()
 * @model
 * @generated
 */
public interface ComponentSampleHardware extends ComponentType {
	/**
	 * Returns the value of the '<em><b>Contains Components</b></em>' reference list.
	 * The list contents are of type {@link componentSampleAllocation.Contains}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Components</em>' reference list.
	 * @see componentSampleAllocation.ComponentSampleAllocationPackage#getComponentSampleHardware_ContainsComponents()
	 * @model
	 * @generated
	 */
	EList<Contains> getContainsComponents();

} // ComponentSampleHardware
