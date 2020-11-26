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

package org.polarsys.kitalpha.ad.af.coredomain.af.model;

import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.coredomain.af.model.AF#getViewpoints <em>Viewpoints</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.af.coredomain.af.model.AfPackage#getAF()
 * @model
 * @generated
 */
public interface AF extends NameElement {





	/**
	 * Returns the value of the '<em><b>Viewpoints</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoints</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.af.coredomain.af.model.AfPackage#getAF_Viewpoints()
	 * @model
	 * @generated
	 */

	EList<Viewpoint> getViewpoints();






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */

	Viewpoint getViewpoint(String id);




} // AF
