/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.api;

import java.util.Collection;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IDomain Helper</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Helper used to acces the service of the current domain. <!-- end-model-doc -->
 * 
 * 
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage#getIDomainHelper()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDomainHelper {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  Collection<Class<?>> getAllDomainMetaclasses();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model required="true" name_pRequired="true"
   * @generated
   */
  Class<?> getDomainMetaclass(String name_p);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model required="true" object_pRequired="true"
   * @generated
   */
  Class<?> getDomainMetaclass(Object object_p);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model
   * @generated
   */
  String getName(Object modelElement);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model
   * @generated
   */
  Collection<Object> getAnalysisSources(Collection<?> selection_p);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model
   * @generated
   */
  boolean isHotSpot(Object object_p);

  boolean isDomainFor(Object object_p);
} // IDomainHelper
