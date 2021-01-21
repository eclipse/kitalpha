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

package org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage
 * @generated
 */
public interface ComponentSampleSafetyPatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSampleSafetyPatternFactory eINSTANCE = org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.ComponentSampleSafetyPatternFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Safety Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Package</em>'.
	 * @generated
	 */
	SafetyPackage createSafetyPackage();

	/**
	 * Returns a new object of class '<em>Safety Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Mode</em>'.
	 * @generated
	 */
	SafetyMode createSafetyMode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentSampleSafetyPatternPackage getComponentSampleSafetyPatternPackage();

} //ComponentSampleSafetyPatternFactory
