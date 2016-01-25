/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration#getUsedViewpoints <em>Used Viewpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationPackage#getIntegration()
 * @model
 * @generated
 */

public interface Integration extends EObject {





	/**
	 * Returns the value of the '<em><b>Used Viewpoints</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Viewpoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Viewpoints</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationPackage#getIntegration_UsedViewpoints()
	 * @model containment="true"
	 * @generated
	 */

	EList<UsedViewpoint> getUsedViewpoints();





} // Integration
