/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ElementImpl extends EObjectImpl implements Element {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementImpl() {

    super();

  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return EmdePackage.Literals.ELEMENT;
  }

} //ElementImpl
