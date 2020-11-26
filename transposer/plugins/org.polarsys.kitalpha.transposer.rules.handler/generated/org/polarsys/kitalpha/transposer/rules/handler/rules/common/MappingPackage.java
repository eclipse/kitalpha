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


package org.polarsys.kitalpha.transposer.rules.handler.rules.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getOwnedMappingElements <em>Owned Mapping Elements</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getAllMappingElements <em>All Mapping Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPackage()
 * @model
 * @generated
 */
public interface MappingPackage extends EObject {





	/**
	 * Returns the value of the '<em><b>Owned Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Packages</em>' containment reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPackage_OwnedPackages()
	 * @model containment="true"
	 * @generated
	 */

	EList<MappingPackage> getOwnedPackages();







	/**
	 * Returns the value of the '<em><b>Owned Mapping Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Mapping Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Mapping Elements</em>' containment reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPackage_OwnedMappingElements()
	 * @model containment="true"
	 * @generated
	 */

	EList<MappingElement> getOwnedMappingElements();







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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPackage_Name()
	 * @model required="true"
	 * @generated
	 */

	String getName();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getName <em>Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);







	/**
	 * Returns the value of the '<em><b>All Mapping Elements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Mapping Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Mapping Elements</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPackage_AllMappingElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	EList<MappingElement> getAllMappingElements();





} // MappingPackage
