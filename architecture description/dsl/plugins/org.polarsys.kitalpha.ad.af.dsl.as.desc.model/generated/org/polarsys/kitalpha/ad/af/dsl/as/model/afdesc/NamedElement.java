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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getShortName <em>Short Name</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getNamedElement_Name()
	 * @model
	 * @generated
	 */

	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getName <em>Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getNamedElement_Description()
	 * @model
	 * @generated
	 */

	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getDescription <em>Description</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */

	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getNamedElement_ShortName()
	 * @model
	 * @generated
	 */

	String getShortName();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getShortName <em>Short Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */

	void setShortName(String value);

} // NamedElement
