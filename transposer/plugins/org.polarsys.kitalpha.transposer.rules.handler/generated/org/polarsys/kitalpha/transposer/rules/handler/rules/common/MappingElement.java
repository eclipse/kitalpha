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
 * A representation of the model object '<em><b>Mapping Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getOwnedDefaultPossibility <em>Owned Default Possibility</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getDefaultPossibility <em>Default Possibility</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getOwnedPossibilities <em>Owned Possibilities</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getAllPossibilities <em>All Possibilities</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getDomainMetaClass <em>Domain Meta Class</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtendedMappingElement <em>Extended Mapping Element</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#isReuseSuperPossibilities <em>Reuse Super Possibilities</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#isReuseSuperDefaultPossibility <em>Reuse Super Default Possibility</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtenders <em>Extenders</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement()
 * @model
 * @generated
 */
public interface MappingElement extends EObject {





	/**
	 * Returns the value of the '<em><b>Owned Default Possibility</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default Possibility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default Possibility</em>' containment reference.
	 * @see #setOwnedDefaultPossibility(MappingPossibility)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_OwnedDefaultPossibility()
	 * @model containment="true"
	 * @generated
	 */

	MappingPossibility getOwnedDefaultPossibility();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getOwnedDefaultPossibility <em>Owned Default Possibility</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default Possibility</em>' containment reference.
	 * @see #getOwnedDefaultPossibility()
	 * @generated
	 */

	void setOwnedDefaultPossibility(MappingPossibility value);







	/**
	 * Returns the value of the '<em><b>Default Possibility</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Possibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Possibility</em>' reference.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_DefaultPossibility()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	MappingPossibility getDefaultPossibility();







	/**
	 * Returns the value of the '<em><b>Owned Possibilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Possibilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Possibilities</em>' containment reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_OwnedPossibilities()
	 * @model containment="true"
	 * @generated
	 */

	EList<MappingPossibility> getOwnedPossibilities();







	/**
	 * Returns the value of the '<em><b>All Possibilities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Possibilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Possibilities</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_AllPossibilities()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	EList<MappingPossibility> getAllPossibilities();







	/**
	 * Returns the value of the '<em><b>Domain Meta Class</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Meta Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Meta Class</em>' attribute.
	 * @see #setDomainMetaClass(Class)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_DomainMetaClass()
	 * @model required="true"
	 * @generated
	 */

	Class<?> getDomainMetaClass();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getDomainMetaClass <em>Domain Meta Class</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Class</em>' attribute.
	 * @see #getDomainMetaClass()
	 * @generated
	 */

	void setDomainMetaClass(Class<?> value);







	/**
	 * Returns the value of the '<em><b>Extended Mapping Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtenders <em>Extenders</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Mapping Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Mapping Element</em>' reference.
	 * @see #setExtendedMappingElement(MappingElement)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_ExtendedMappingElement()
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtenders
	 * @model opposite="extenders"
	 * @generated
	 */

	MappingElement getExtendedMappingElement();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtendedMappingElement <em>Extended Mapping Element</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Mapping Element</em>' reference.
	 * @see #getExtendedMappingElement()
	 * @generated
	 */

	void setExtendedMappingElement(MappingElement value);







	/**
	 * Returns the value of the '<em><b>Reuse Super Possibilities</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reuse Super Possibilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reuse Super Possibilities</em>' attribute.
	 * @see #setReuseSuperPossibilities(boolean)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_ReuseSuperPossibilities()
	 * @model
	 * @generated
	 */

	boolean isReuseSuperPossibilities();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#isReuseSuperPossibilities <em>Reuse Super Possibilities</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reuse Super Possibilities</em>' attribute.
	 * @see #isReuseSuperPossibilities()
	 * @generated
	 */

	void setReuseSuperPossibilities(boolean value);







	/**
	 * Returns the value of the '<em><b>Reuse Super Default Possibility</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reuse Super Default Possibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reuse Super Default Possibility</em>' attribute.
	 * @see #setReuseSuperDefaultPossibility(boolean)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_ReuseSuperDefaultPossibility()
	 * @model
	 * @generated
	 */

	boolean isReuseSuperDefaultPossibility();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#isReuseSuperDefaultPossibility <em>Reuse Super Default Possibility</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reuse Super Default Possibility</em>' attribute.
	 * @see #isReuseSuperDefaultPossibility()
	 * @generated
	 */

	void setReuseSuperDefaultPossibility(boolean value);







	/**
	 * Returns the value of the '<em><b>Extenders</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtendedMappingElement <em>Extended Mapping Element</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extenders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extenders</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_Extenders()
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtendedMappingElement
	 * @model opposite="extendedMappingElement" changeable="false"
	 * @generated
	 */

	EList<MappingElement> getExtenders();







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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingElement_Name()
	 * @model required="true"
	 * @generated
	 */

	String getName();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getName <em>Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	MappingPossibility getApplicablePossibility(Object object_p);




} // MappingElement
