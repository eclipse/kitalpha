/**
 * ******************************************************************************
 *  Copyright (c) 2016-2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *   
 *  Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 * *******************************************************************************
 * 
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.metadata.metadata;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.Metadata#getViewpointReferences <em>Viewpoint References</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.Metadata#getAdditionalMetadata <em>Additional Metadata</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getMetadata()
 * @model
 * @generated
 */

public interface Metadata extends MetadataElement {





	/**
	 * Returns the value of the '<em><b>Viewpoint References</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoint References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint References</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getMetadata_ViewpointReferences()
	 * @model containment="true"
	 * @generated
	 */

	EList<ViewpointReference> getViewpointReferences();

	/**
	 * Returns the value of the '<em><b>Additional Metadata</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.metadata.metadata.Metadata}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Metadata</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Metadata</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getMetadata_AdditionalMetadata()
	 * @model
	 * @generated
	 */

	EList<Metadata> getAdditionalMetadata();





} // Metadata
