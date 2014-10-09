/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.api;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IRule</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Represents a rule, allows Transoposer to reference the complete rule and an optionnal incomplete rule used when cycle occurs. <!--
 * end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage#getIRule()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRule<T> {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Name of the rule.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage#getIRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model required="true" element_pRequired="true"
   * @generated
   */
  boolean isApplicableOn(T element_p);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model exceptions="org.polarsys.kitalpha.transposer.rules.handler.rules.exceptions.Exception" element_pRequired="true"
   * @generated
   */
  void apply(T element_p, IContext context_p) throws Exception;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model required="true" element_pRequired="true"
   * @generated
   */
  List<IPremise> getPremises(T element_p);

} // IRule
