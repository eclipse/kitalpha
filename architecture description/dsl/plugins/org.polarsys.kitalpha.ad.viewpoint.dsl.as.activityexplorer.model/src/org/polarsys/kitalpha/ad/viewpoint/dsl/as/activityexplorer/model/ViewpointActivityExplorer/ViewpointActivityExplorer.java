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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Activity Explorer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedNewPages <em>Owned New Pages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedSectionsExtension <em>Owned Sections Extension</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedActivitiesExtension <em>Owned Activities Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage#getViewpointActivityExplorer()
 * @model
 * @generated
 */

public interface ViewpointActivityExplorer extends Aspect {





	/**
	 * Returns the value of the '<em><b>Owned New Pages</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned New Pages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned New Pages</em>' containment reference.
	 * @see #setOwnedNewPages(Pages)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage#getViewpointActivityExplorer_OwnedNewPages()
	 * @model containment="true"
	 * @generated
	 */

	Pages getOwnedNewPages();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedNewPages <em>Owned New Pages</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned New Pages</em>' containment reference.
	 * @see #getOwnedNewPages()
	 * @generated
	 */

	void setOwnedNewPages(Pages value);







	/**
	 * Returns the value of the '<em><b>Owned Sections Extension</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sections Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sections Extension</em>' containment reference.
	 * @see #setOwnedSectionsExtension(Sections)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage#getViewpointActivityExplorer_OwnedSectionsExtension()
	 * @model containment="true"
	 * @generated
	 */

	Sections getOwnedSectionsExtension();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedSectionsExtension <em>Owned Sections Extension</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Sections Extension</em>' containment reference.
	 * @see #getOwnedSectionsExtension()
	 * @generated
	 */

	void setOwnedSectionsExtension(Sections value);







	/**
	 * Returns the value of the '<em><b>Owned Activities Extension</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Activities Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Activities Extension</em>' containment reference.
	 * @see #setOwnedActivitiesExtension(Activities)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage#getViewpointActivityExplorer_OwnedActivitiesExtension()
	 * @model containment="true"
	 * @generated
	 */

	Activities getOwnedActivitiesExtension();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedActivitiesExtension <em>Owned Activities Extension</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Activities Extension</em>' containment reference.
	 * @see #getOwnedActivitiesExtension()
	 * @generated
	 */

	void setOwnedActivitiesExtension(Activities value);





} // ViewpointActivityExplorer
