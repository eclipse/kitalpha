/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdepatternsupportFactory
 * @model kind="package"
 * @generated
 */
public interface EmdepatternsupportPackage extends EPackage {
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "emdepatternsupport"; //$NON-NLS-1$

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.polarsys.org/kitalpha/patterns/emde/1.0.0"; //$NON-NLS-1$

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "org.polarsys.kitalpha.patterns.emde"; //$NON-NLS-1$

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EmdepatternsupportPackage eINSTANCE = org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdepatternsupportPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdePatternInstanceSetImpl <em>Emde Pattern Instance Set</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdePatternInstanceSetImpl
	 * @see org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdepatternsupportPackageImpl#getEmdePatternInstanceSet()
	 * @generated
	 */
  int EMDE_PATTERN_INSTANCE_SET = 0;

  /**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMDE_PATTERN_INSTANCE_SET__OWNED_EXTENSIONS = EmdePackage.ELEMENT_EXTENSION__OWNED_EXTENSIONS;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMDE_PATTERN_INSTANCE_SET__ID = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Owned Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMDE_PATTERN_INSTANCE_SET__OWNED_INSTANCES = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Emde Pattern Instance Set</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMDE_PATTERN_INSTANCE_SET_FEATURE_COUNT = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 2;

  /**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdePatternInstanceSet <em>Emde Pattern Instance Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emde Pattern Instance Set</em>'.
	 * @see org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdePatternInstanceSet
	 * @generated
	 */
  EClass getEmdePatternInstanceSet();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EmdepatternsupportFactory getEmdepatternsupportFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals {
    /**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdePatternInstanceSetImpl <em>Emde Pattern Instance Set</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdePatternInstanceSetImpl
		 * @see org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdepatternsupportPackageImpl#getEmdePatternInstanceSet()
		 * @generated
		 */
    EClass EMDE_PATTERN_INSTANCE_SET = eINSTANCE.getEmdePatternInstanceSet();

  }

} //EmdepatternsupportPackage
