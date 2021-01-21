/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdepatternsupportPackage
 * @generated
 */
public interface EmdepatternsupportFactory extends EFactory {
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EmdepatternsupportFactory eINSTANCE = org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdepatternsupportFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Emde Pattern Instance Set</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emde Pattern Instance Set</em>'.
	 * @generated
	 */
  EmdePatternInstanceSet createEmdePatternInstanceSet();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  EmdepatternsupportPackage getEmdepatternsupportPackage();

} //EmdepatternsupportFactory
