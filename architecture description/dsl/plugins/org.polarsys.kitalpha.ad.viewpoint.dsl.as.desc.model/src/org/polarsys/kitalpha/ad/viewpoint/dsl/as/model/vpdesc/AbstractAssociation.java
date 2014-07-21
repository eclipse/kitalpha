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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractAssociation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractAssociation extends AbstractFeature {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types
	 * @see #setType(Association_Types)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractAssociation_Type()
	 * @model
	 * @generated
	 */

	Association_Types getType();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation#getType <em>Type</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types
	 * @see #getType()
	 * @generated
	 */

	void setType(Association_Types value);

} // AbstractAssociation
