/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet#getHiddenProperties <em>Hidden Properties</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet#getNewProperties <em>New Properties</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getPropertySet()
 * @model
 * @generated
 */
public interface PropertySet extends ElementSet {





	/**
	 * Returns the value of the '<em><b>Hidden Properties</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Properties</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getPropertySet_HiddenProperties()
	 * @model
	 * @generated
	 */

	EList<Property> getHiddenProperties();







	/**
	 * Returns the value of the '<em><b>New Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Properties</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getPropertySet_NewProperties()
	 * @model containment="true"
	 * @generated
	 */

	EList<Property> getNewProperties();





} // PropertySet
