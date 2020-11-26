/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.transformation.emf.traces;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getRole <em>Role</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.TracesPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {





	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.TracesPackage#getTrace_Role()
	 * @model required="true"
	 * @generated
	 */

	String getRole();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getRole <em>Role</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */

	void setRole(String value);







	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.TracesPackage#getTrace_Source()
	 * @model required="true"
	 * @generated
	 */

	EObject getSource();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getSource <em>Source</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */

	void setSource(EObject value);







	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.TracesPackage#getTrace_Target()
	 * @model required="true"
	 * @generated
	 */

	EObject getTarget();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getTarget <em>Target</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */

	void setTarget(EObject value);





} // Trace
