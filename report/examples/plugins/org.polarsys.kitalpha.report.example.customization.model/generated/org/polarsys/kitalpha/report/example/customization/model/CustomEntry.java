/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.example.customization.model;

import org.polarsys.kitalpha.report.model.LogEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.report.example.customization.model.CustomEntry#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.report.example.customization.model.CustomizationPackage#getCustomEntry()
 * @model
 * @generated
 */
public interface CustomEntry extends LogEntry {





	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.polarsys.kitalpha.report.example.customization.model.CustomizationPackage#getCustomEntry_Comment()
	 * @model
	 * @generated
	 */

	String getComment();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.report.example.customization.model.CustomEntry#getComment <em>Comment</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */

	void setComment(String value);





} // CustomEntry
