/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activities#getOwnedActivitiesExtensions <em>Owned Activities Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage#getActivities()
 * @model
 * @generated
 */

public interface Activities extends EObject {





	/**
	 * Returns the value of the '<em><b>Owned Activities Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExtension}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Activities Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Activities Extensions</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage#getActivities_OwnedActivitiesExtensions()
	 * @model containment="true"
	 * @generated
	 */

	EList<ActivityExtension> getOwnedActivitiesExtensions();





} // Activities
