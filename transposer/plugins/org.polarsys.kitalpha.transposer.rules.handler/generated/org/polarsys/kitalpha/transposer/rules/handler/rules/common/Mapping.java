/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
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

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose;

import org.eclipse.core.runtime.IStatus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtendedMapping <em>Extended Mapping</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtenders <em>Extenders</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedMappingElements <em>Owned Mapping Elements</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedDomainHelper <em>Owned Domain Helper</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getDomainHelper <em>Domain Helper</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getAllOwnedMappingElements <em>All Owned Mapping Elements</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getCompleteDescription <em>Complete Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedContext <em>Owned Context</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getContext <em>Context</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#isPrivate <em>Private</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {





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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_Name()
	 * @model required="true"
	 * @generated
	 */

	String getName();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getName <em>Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);







	/**
	 * Returns the value of the '<em><b>Extended Mapping</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtenders <em>Extenders</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Mapping</em>' reference.
	 * @see #setExtendedMapping(Mapping)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_ExtendedMapping()
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtenders
	 * @model opposite="extenders"
	 * @generated
	 */

	Mapping getExtendedMapping();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtendedMapping <em>Extended Mapping</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Mapping</em>' reference.
	 * @see #getExtendedMapping()
	 * @generated
	 */

	void setExtendedMapping(Mapping value);







	/**
	 * Returns the value of the '<em><b>Extenders</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtendedMapping <em>Extended Mapping</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extenders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extenders</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_Extenders()
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtendedMapping
	 * @model opposite="extendedMapping" changeable="false"
	 * @generated
	 */

	EList<Mapping> getExtenders();







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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_OwnedPackages()
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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_OwnedMappingElements()
	 * @model containment="true"
	 * @generated
	 */

	EList<MappingElement> getOwnedMappingElements();







	/**
	 * Returns the value of the '<em><b>Owned Domain Helper</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Domain Helper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Domain Helper</em>' attribute.
	 * @see #setOwnedDomainHelper(IDomainHelper)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_OwnedDomainHelper()
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper"
	 * @generated
	 */

	IDomainHelper getOwnedDomainHelper();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedDomainHelper <em>Owned Domain Helper</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Domain Helper</em>' attribute.
	 * @see #getOwnedDomainHelper()
	 * @generated
	 */

	void setOwnedDomainHelper(IDomainHelper value);







	/**
	 * Returns the value of the '<em><b>Domain Helper</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Helper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Helper</em>' attribute.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_DomainHelper()
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	IDomainHelper getDomainHelper();







	/**
	 * Returns the value of the '<em><b>All Owned Mapping Elements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Owned Mapping Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Owned Mapping Elements</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_AllOwnedMappingElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	EList<MappingElement> getAllOwnedMappingElements();







	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' reference.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_Purpose()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	IPurpose getPurpose();







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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_Description()
	 * @model
	 * @generated
	 */

	String getDescription();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getDescription <em>Description</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */

	void setDescription(String value);







	/**
	 * Returns the value of the '<em><b>Complete Description</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Description</em>' attribute.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_CompleteDescription()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	String getCompleteDescription();







	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_Id()
	 * @model id="true" required="true"
	 * @generated
	 */

	String getId();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getId <em>Id</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */

	void setId(String value);







	/**
	 * Returns the value of the '<em><b>Owned Context</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Context</em>' attribute.
	 * @see #setOwnedContext(IContext)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_OwnedContext()
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext"
	 * @generated
	 */

	IContext getOwnedContext();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedContext <em>Owned Context</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Context</em>' attribute.
	 * @see #getOwnedContext()
	 * @generated
	 */

	void setOwnedContext(IContext value);







	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_Context()
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	IContext getContext();






	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #setPrivate(boolean)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMapping_Private()
	 * @model required="true"
	 * @generated
	 */

	boolean isPrivate();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#isPrivate <em>Private</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isPrivate()
	 * @generated
	 */

	void setPrivate(boolean value);




	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IStatus"
	 * @generated
	 */

	IStatus validate();





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	MappingElement getOwnedMappingElement(Class<?> domainClass_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.polarsys.kitalpha.transposer.rules.handler.rules.MappingPossibilityResolutionException" object_pRequired="true" domainHelper_pDataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper" domainHelper_pRequired="true"
	 * @generated
	 */

	MappingPossibility resolveApplicablePossibility(Object object_p, IDomainHelper domainHelper_p) throws MappingPossibilityResolutionException;





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.polarsys.kitalpha.transposer.rules.handler.rules.MappingResolutionException" object_pRequired="true" domainHelper_pDataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper" domainHelper_pRequired="true"
	 * @generated
	 */

	MappingElement resolveUniqueAvailableMappingElement(Object object_p, IDomainHelper domainHelper_p) throws MappingResolutionException;





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	EList<MappingElement> resolveAllAvailableMappingElements(Class<?> domainClass_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */

	EList<Mapping> getExtendersWithSamePurpose();




} // Mapping
