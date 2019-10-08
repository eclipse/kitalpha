/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer;

import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Activity Explorer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer#getOwnedPages <em>Owned Pages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer#getOwnedSectionExtensions <em>Owned Section Extensions</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer#getAllActivities <em>All Activities</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage#getViewpointActivityExplorer()
 * @model
 * @generated
 */

public interface ViewpointActivityExplorer extends Aspect {





	/**
	 * Returns the value of the '<em><b>Owned Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.AbstractPage}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Pages</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage#getViewpointActivityExplorer_OwnedPages()
	 * @model containment="true"
	 * @generated
	 */

	EList<AbstractPage> getOwnedPages();







	/**
	 * Returns the value of the '<em><b>Owned Section Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.SectionExtension}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Section Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Section Extensions</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage#getViewpointActivityExplorer_OwnedSectionExtensions()
	 * @model containment="true"
	 * @generated
	 */

	EList<SectionExtension> getOwnedSectionExtensions();







	/**
	 * Returns the value of the '<em><b>All Activities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Activity}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Activities</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage#getViewpointActivityExplorer_AllActivities()
	 * @model changeable="false" derived="true"
	 * @generated
	 */

	EList<Activity> getAllActivities();





} // ViewpointActivityExplorer
