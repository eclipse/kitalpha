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
/**
 * <copyright>
 * </copyright>
 *

 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ui";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/cs/text/vpui/1.0.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ui";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UiPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UiPackageImpl.init();

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UserInterfaceImpl <em>User Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UserInterfaceImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UiPackageImpl#getUserInterface()
   * @generated
   */
  int USER_INTERFACE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_INTERFACE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Ui Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_INTERFACE__UI_DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>User Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.ImportImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UiPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface <em>User Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Interface</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface
   * @generated
   */
  EClass getUserInterface();

  /**
   * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface#getImports()
   * @see #getUserInterface()
   * @generated
   */
  EReference getUserInterface_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface#getUiDescription <em>Ui Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ui Description</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface#getUiDescription()
   * @see #getUserInterface()
   * @generated
   */
  EReference getUserInterface_UiDescription();

  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UiFactory getUiFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UserInterfaceImpl <em>User Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UserInterfaceImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UiPackageImpl#getUserInterface()
     * @generated
     */
    EClass USER_INTERFACE = eINSTANCE.getUserInterface();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_INTERFACE__IMPORTS = eINSTANCE.getUserInterface_Imports();

    /**
     * The meta object literal for the '<em><b>Ui Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_INTERFACE__UI_DESCRIPTION = eINSTANCE.getUserInterface_UiDescription();

    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.ImportImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UiPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

  }

} //UiPackage
