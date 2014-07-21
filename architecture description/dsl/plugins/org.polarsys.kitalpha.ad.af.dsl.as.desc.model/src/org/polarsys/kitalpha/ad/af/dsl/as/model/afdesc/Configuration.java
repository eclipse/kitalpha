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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Configuration#getOwned_element <em>Owned element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {

	/**
	 * Returns the value of the '<em><b>Owned element</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ConfigurationElement}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned element</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getConfiguration_Owned_element()
	 * @model containment="true"
	 * @generated
	 */

	EList<ConfigurationElement> getOwned_element();

} // Configuration
