/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
