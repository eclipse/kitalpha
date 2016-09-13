/**
 * ******************************************************************************
 *  Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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





} // Metadata
