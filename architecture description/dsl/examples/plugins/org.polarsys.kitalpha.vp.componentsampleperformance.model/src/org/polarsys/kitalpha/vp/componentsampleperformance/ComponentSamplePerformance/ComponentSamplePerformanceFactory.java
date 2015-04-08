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

package org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformancePackage
 * @generated
 */
public interface ComponentSamplePerformanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSamplePerformanceFactory eINSTANCE = org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.ComponentSamplePerformanceFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance</em>'.
	 * @generated
	 */
	Performance createPerformance();

	/**
	 * Returns a new object of class '<em>Performance Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Status</em>'.
	 * @generated
	 */
	PerformanceStatus createPerformanceStatus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentSamplePerformancePackage getComponentSamplePerformancePackage();

} //ComponentSamplePerformanceFactory
