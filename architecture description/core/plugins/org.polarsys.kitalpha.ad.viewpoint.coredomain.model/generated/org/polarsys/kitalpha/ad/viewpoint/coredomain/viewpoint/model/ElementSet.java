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

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElementSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ElementSet#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getElementSet()
 * @model
 * @generated
 */
public interface ElementSet extends NameElement, ViewpointElementSet {





	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Viewpoint)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getElementSet_Target()
	 * @model
	 * @generated
	 */

	Viewpoint getTarget();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ElementSet#getTarget <em>Target</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */

	void setTarget(Viewpoint value);





} // ElementSet
