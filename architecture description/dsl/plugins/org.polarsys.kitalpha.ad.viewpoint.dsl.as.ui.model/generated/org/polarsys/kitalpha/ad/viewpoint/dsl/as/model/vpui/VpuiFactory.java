/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage
 * @generated
 */
public interface VpuiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpuiFactory eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UI Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Container</em>'.
	 * @generated
	 */
	UIContainer createUIContainer();

	/**
	 * Returns a new object of class '<em>UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI</em>'.
	 * @generated
	 */
	UI createUI();

	/**
	 * Returns a new object of class '<em>UI Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Field</em>'.
	 * @generated
	 */
	UIField createUIField();

	/**
	 * Returns a new object of class '<em>Field Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Mapping</em>'.
	 * @generated
	 */
	FieldMapping createFieldMapping();

	/**
	 * Returns a new object of class '<em>UI Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Description</em>'.
	 * @generated
	 */
	UIDescription createUIDescription();

	/**
	 * Returns a new object of class '<em>Local Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Class</em>'.
	 * @generated
	 */
	LocalClass createLocalClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VpuiPackage getVpuiPackage();

} //VpuiFactory
