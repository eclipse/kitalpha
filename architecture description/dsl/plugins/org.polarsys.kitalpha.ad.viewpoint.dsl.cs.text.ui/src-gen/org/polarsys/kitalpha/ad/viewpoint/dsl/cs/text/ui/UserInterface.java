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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface#getImports <em>Imports</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface#getUiDescription <em>Ui Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UiPackage#getUserInterface()
 * @model
 * @generated
 */
public interface UserInterface extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UiPackage#getUserInterface_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Ui Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ui Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ui Description</em>' containment reference.
   * @see #setUiDescription(Aspect)
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UiPackage#getUserInterface_UiDescription()
   * @model containment="true"
   * @generated
   */
  Aspect getUiDescription();

  /**
   * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface#getUiDescription <em>Ui Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ui Description</em>' containment reference.
   * @see #getUiDescription()
   * @generated
   */
  void setUiDescription(Aspect value);

} // UserInterface
