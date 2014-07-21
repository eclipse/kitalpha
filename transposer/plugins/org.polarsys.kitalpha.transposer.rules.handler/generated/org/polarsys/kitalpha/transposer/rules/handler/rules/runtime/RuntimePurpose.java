/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.runtime;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A runtime purpose is a purpose which reference a unique mapping used at runtime a merged from contributed purposes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePackage#getRuntimePurpose()
 * @model
 * @generated
 */
public interface RuntimePurpose extends IPurpose {





	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping used at runtime to manage, find and apply rules. This mapping was merged fromthe most specific mapping corresponding to this purpose and all the extension hierarchy of this mapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(Mapping)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePackage#getRuntimePurpose_Mapping()
	 * @model containment="true"
	 * @generated
	 */

	Mapping getMapping();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getMapping <em>Mapping</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */

	void setMapping(Mapping value);







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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePackage#getRuntimePurpose_Description()
	 * @model unique="false"
	 * @generated
	 */

	String getDescription();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getDescription <em>Description</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */

	void setDescription(String value);







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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePackage#getRuntimePurpose_Id()
	 * @model id="true" required="true"
	 * @generated
	 */

	String getId();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getId <em>Id</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */

	void setId(String value);






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
	 * @model
	 * @generated
	 */

	MappingElement getMappingElement(Class<?> domainClass_p);




} // RuntimePurpose
