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


package org.polarsys.kitalpha.transposer.rules.handler.rules.contribution;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributed Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A contributed purpose is a purpose built from mapping contributed to the mapping extension point.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributionPackage#getContributedPurpose()
 * @model
 * @generated
 */
public interface ContributedPurpose extends IPurpose {





	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping}.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Built mappings from the mapping extension point. In the corresponding extension, these mappings referenced this purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributionPackage#getContributedPurpose_Mappings()
	 * @model containment="true"
	 * @generated
	 */

	EList<Mapping> getMappings();






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */

	Mapping getMostGenericMapping();





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	Mapping getMapping(String mappingId_p);






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */

	boolean isPrivate();




} // ContributedPurpose
