/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage
 * @generated
 */
public interface VpconfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpconfFactory eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Target Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Application</em>'.
	 * @generated
	 */
	TargetApplication createTargetApplication();

	/**
	 * Returns a new object of class '<em>Generation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Configuration</em>'.
	 * @generated
	 */
	GenerationConfiguration createGenerationConfiguration();

	/**
	 * Returns a new object of class '<em>Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation</em>'.
	 * @generated
	 */
	Generation createGeneration();

	/**
	 * Returns a new object of class '<em>GData</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GData</em>'.
	 * @generated
	 */
	GData createGData();

	/**
	 * Returns a new object of class '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release</em>'.
	 * @generated
	 */
	Release createRelease();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VpconfPackage getVpconfPackage();

} //VpconfFactory
