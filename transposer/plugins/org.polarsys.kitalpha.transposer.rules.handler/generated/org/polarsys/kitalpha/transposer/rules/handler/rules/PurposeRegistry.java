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


package org.polarsys.kitalpha.transposer.rules.handler.rules;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose;

import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose;

import org.eclipse.core.runtime.IStatus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purpose Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This registry is used to store contributed purpose and runtime/registered purposes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.PurposeRegistry#getRegisteredPurposes <em>Registered Purposes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.PurposeRegistry#getContributedPurposes <em>Contributed Purposes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.RulesPackage#getPurposeRegistry()
 * @model abstract="true"
 * @generated
 */
public interface PurposeRegistry extends EObject {





	/**
	 * Returns the value of the '<em><b>Registered Purposes</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose}.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Runtime prupose merged from contributed purposes and used by transposer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registered Purposes</em>' containment reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.RulesPackage#getPurposeRegistry_RegisteredPurposes()
	 * @model containment="true"
	 * @generated
	 */

	EList<RuntimePurpose> getRegisteredPurposes();







	/**
	 * Returns the value of the '<em><b>Contributed Purposes</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose}.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contributed pruposes are purpose built from rule smapping provided to the mapping extension point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributed Purposes</em>' containment reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.RulesPackage#getPurposeRegistry_ContributedPurposes()
	 * @model containment="true"
	 * @generated
	 */

	EList<ContributedPurpose> getContributedPurposes();






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IStatus"
	 * @generated
	 */

	IStatus validateRegisteredPurposes();





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IStatus"
	 * @generated
	 */

	IStatus validateContributedPurposes();





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	void reset();





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	void init();





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	RuntimePurpose getRegisteredPurpose(String purpose_p, String mappingId_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	RuntimePurpose registerPurpose(String purpose_p, String mappingId_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	ContributedPurpose getContributedPurpose(String purpose_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	Mapping getContributedMapping(String purpose_p, String mappingId_p);




} // PurposeRegistry
