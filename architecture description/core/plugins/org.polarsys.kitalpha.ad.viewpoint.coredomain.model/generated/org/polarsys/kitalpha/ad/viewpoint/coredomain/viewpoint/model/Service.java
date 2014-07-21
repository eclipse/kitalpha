/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model;

import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service#getRelatedRules <em>Related Rules</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NameElement, ViewpointElement {





	/**
	 * Returns the value of the '<em><b>Related Rules</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Rules</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getService_RelatedRules()
	 * @model
	 * @generated
	 */

	EList<Rule> getRelatedRules();







	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getService_Type()
	 * @model required="true"
	 * @generated
	 */

	String getType();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service#getType <em>Type</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */

	void setType(String value);





} // Service
