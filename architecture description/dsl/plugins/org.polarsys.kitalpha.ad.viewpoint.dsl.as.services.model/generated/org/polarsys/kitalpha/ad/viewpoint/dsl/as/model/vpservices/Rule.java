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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends AbstractServicesElement {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types
	 * @see #setType(Rules_Types)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage#getRule_Type()
	 * @model
	 * @generated
	 */

	Rules_Types getType();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule#getType <em>Type</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types
	 * @see #getType()
	 * @generated
	 */

	void setType(Rules_Types value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage#getRule_Class()
	 * @model
	 * @generated
	 */

	String getClass_();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule#getClass_ <em>Class</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */

	void setClass(String value);

} // Rule
