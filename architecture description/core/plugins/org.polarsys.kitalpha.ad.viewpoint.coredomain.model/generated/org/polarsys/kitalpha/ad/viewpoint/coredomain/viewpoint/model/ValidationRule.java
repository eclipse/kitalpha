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

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getValidationRule()
 * @model
 * @generated
 */
public interface ValidationRule extends Rule {





	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.SeverityTypes}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.SeverityTypes
	 * @see #setSeverity(SeverityTypes)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getValidationRule_Severity()
	 * @model required="true"
	 * @generated
	 */

	SeverityTypes getSeverity();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule#getSeverity <em>Severity</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.SeverityTypes
	 * @see #getSeverity()
	 * @generated
	 */

	void setSeverity(SeverityTypes value);







	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getValidationRule_Message()
	 * @model required="true"
	 * @generated
	 */

	String getMessage();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule#getMessage <em>Message</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */

	void setMessage(String value);





} // ValidationRule
