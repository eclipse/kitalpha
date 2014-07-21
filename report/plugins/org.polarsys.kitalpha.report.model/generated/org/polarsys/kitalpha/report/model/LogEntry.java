/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.report.model.LogEntry#getMessage <em>Message</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.report.model.LogEntry#getDate <em>Date</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.report.model.LogEntry#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.report.model.LogEntry#getDetails <em>Details</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.report.model.LogEntry#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.report.model.ReportElementPackage#getLogEntry()
 * @model
 * @generated
 */
public interface LogEntry extends EObject {





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
	 * @see org.polarsys.kitalpha.report.model.ReportElementPackage#getLogEntry_Message()
	 * @model
	 * @generated
	 */

	String getMessage();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.report.model.LogEntry#getMessage <em>Message</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */

	void setMessage(String value);







	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.polarsys.kitalpha.report.model.ReportElementPackage#getLogEntry_Date()
	 * @model required="true"
	 * @generated
	 */

	Date getDate();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.report.model.LogEntry#getDate <em>Date</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */

	void setDate(Date value);







	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(Severity)
	 * @see org.polarsys.kitalpha.report.model.ReportElementPackage#getLogEntry_Severity()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Severity getSeverity();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.report.model.LogEntry#getSeverity <em>Severity</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */

	void setSeverity(Severity value);







	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.report.model.LogEntry}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' containment reference list.
	 * @see org.polarsys.kitalpha.report.model.ReportElementPackage#getLogEntry_Details()
	 * @model containment="true"
	 * @generated
	 */

	EList<LogEntry> getDetails();







	/**
	 * Returns the value of the '<em><b>Referenced Object</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Object</em>' reference.
	 * @see #setReferencedObject(EObject)
	 * @see org.polarsys.kitalpha.report.model.ReportElementPackage#getLogEntry_ReferencedObject()
	 * @model
	 * @generated
	 */

	EObject getReferencedObject();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.report.model.LogEntry#getReferencedObject <em>Referenced Object</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Object</em>' reference.
	 * @see #getReferencedObject()
	 * @generated
	 */

	void setReferencedObject(EObject value);





} // LogEntry
