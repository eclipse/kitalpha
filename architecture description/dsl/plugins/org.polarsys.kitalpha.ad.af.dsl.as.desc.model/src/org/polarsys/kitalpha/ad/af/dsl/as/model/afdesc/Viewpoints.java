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

package org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints#getOwned_viewpoints <em>Owned viewpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getViewpoints()
 * @model
 * @generated
 */
public interface Viewpoints extends EObject {

	/**
	 * Returns the value of the '<em><b>Owned viewpoints</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned viewpoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned viewpoints</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getViewpoints_Owned_viewpoints()
	 * @model
	 * @generated
	 */

	EList<Viewpoint> getOwned_viewpoints();

} // Viewpoints
