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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see componentSampleAllocation.ComponentSampleAllocationPackage
 * @generated
 */
public interface ComponentSampleAllocationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSampleAllocationFactory eINSTANCE = componentSampleAllocation.impl.ComponentSampleAllocationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Sample Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Sample Root</em>'.
	 * @generated
	 */
	ComponentSampleRoot createComponentSampleRoot();

	/**
	 * Returns a new object of class '<em>Component Sample File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Sample File</em>'.
	 * @generated
	 */
	ComponentSampleFile createComponentSampleFile();

	/**
	 * Returns a new object of class '<em>Component Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Model Type</em>'.
	 * @generated
	 */
	ComponentModelType createComponentModelType();

	/**
	 * Returns a new object of class '<em>Uses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses</em>'.
	 * @generated
	 */
	Uses createUses();

	/**
	 * Returns a new object of class '<em>Used By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Used By</em>'.
	 * @generated
	 */
	UsedBy createUsedBy();

	/**
	 * Returns a new object of class '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains</em>'.
	 * @generated
	 */
	Contains createContains();

	/**
	 * Returns a new object of class '<em>Contained By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contained By</em>'.
	 * @generated
	 */
	ContainedBy createContainedBy();

	/**
	 * Returns a new object of class '<em>Component Sample Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Sample Hardware</em>'.
	 * @generated
	 */
	ComponentSampleHardware createComponentSampleHardware();

	/**
	 * Returns a new object of class '<em>Component Sample Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Sample Software</em>'.
	 * @generated
	 */
	ComponentSampleSoftware createComponentSampleSoftware();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentSampleAllocationPackage getComponentSampleAllocationPackage();

} //ComponentSampleAllocationFactory
