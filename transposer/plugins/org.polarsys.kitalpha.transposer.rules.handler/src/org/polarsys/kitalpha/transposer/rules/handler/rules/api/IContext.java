/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.api;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IContext</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> This concept represents the context used to make available information required for rules application. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage#getIContext()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IContext {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Name of the current
   * context. <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage#getIContext_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model baseContextRequired="true"
   * @generated
   */
  void initWith(IContext baseContext_p);
  
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model baseContextRequired="true"
   * @generated
   */
  void updateWith(IContext context_p);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model keyRequired="true" valueRequired="true"
   * @generated
   */
  void put(Object key_p, Object value_p);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model keyRequired="true"
   * @generated
   */
  Object get(Object key_p);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model keyRequired="true"
   * @generated
   */
  boolean exists(Object key_p);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  List<Object> getKeys();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model
   * @generated
   */
  void setUpForModelElement(Object modelElement_p);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model
   * @generated
   */
  void reset();

} // IContext
