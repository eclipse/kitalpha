/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage#getLocalAssociation()
 * @model
 * @generated
 */
public interface LocalAssociation extends AbstractAssociation {

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage#getLocalAssociation_Reference()
	 * @model required="true"
	 * @generated
	 */

	org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation getReference();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation#getReference <em>Reference</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */

	void setReference(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation value);

} // LocalAssociation
