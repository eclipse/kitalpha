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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Severity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.report.model.Severity#getCode <em>Code</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.report.model.Severity#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.report.model.ReportElementPackage#getSeverity()
 * @model
 * @generated
 */
public interface Severity extends EObject {





	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see org.polarsys.kitalpha.report.model.ReportElementPackage#getSeverity_Code()
	 * @model required="true"
	 * @generated
	 */

	int getCode();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.report.model.Severity#getCode <em>Code</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */

	void setCode(int value);







	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.polarsys.kitalpha.report.model.ReportElementPackage#getSeverity_Label()
	 * @model required="true"
	 * @generated
	 */

	String getLabel();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.report.model.Severity#getLabel <em>Label</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */

	void setLabel(String value);





} // Severity
