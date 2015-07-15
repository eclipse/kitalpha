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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerFactory
 * @model kind="package"
 * @generated
 */
public interface ViewpointActivityExplorerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ViewpointActivityExplorer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/viewpointactivityexplorer/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "viewpointactivityexplorer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewpointActivityExplorerPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExplorerItemImpl <em>Activity Explorer Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExplorerItemImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getActivityExplorerItem()
	 * @generated
	 */
	int ACTIVITY_EXPLORER_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Activity Explorer Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXPLORER_ITEM__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXPLORER_ITEM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Activity Explorer Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PageImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 0;

	/**
	 * The feature id for the '<em><b>Activity Explorer Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ACTIVITY_EXPLORER_ITEM_ID = ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INDEX = ACTIVITY_EXPLORER_ITEM__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = ACTIVITY_EXPLORER_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Image Path Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__IMAGE_PATH_OFF = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Path On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__IMAGE_PATH_ON = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HAS_PREDICATE = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Overview</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OWNED_OVERVIEW = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tab Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TAB_NAME = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show Viewer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SHOW_VIEWER = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MODEL_TYPE = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PredicateElementImpl <em>Predicate Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PredicateElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getPredicateElement()
	 * @generated
	 */
	int PREDICATE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Has Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_ELEMENT__HAS_PREDICATE = 0;

	/**
	 * The number of structural features of the '<em>Predicate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.IconImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 3;

	/**
	 * The feature id for the '<em><b>Image Path Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__IMAGE_PATH_OFF = 0;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.DynamicIconImpl <em>Dynamic Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.DynamicIconImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getDynamicIcon()
	 * @generated
	 */
	int DYNAMIC_ICON = 5;

	/**
	 * The feature id for the '<em><b>Image Path Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ICON__IMAGE_PATH_OFF = ICON__IMAGE_PATH_OFF;

	/**
	 * The feature id for the '<em><b>Image Path On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ICON__IMAGE_PATH_ON = ICON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ICON_FEATURE_COUNT = ICON_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.OverviewImpl <em>Overview</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.OverviewImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getOverview()
	 * @generated
	 */
	int OVERVIEW = 2;

	/**
	 * The feature id for the '<em><b>Image Path Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW__IMAGE_PATH_OFF = DYNAMIC_ICON__IMAGE_PATH_OFF;

	/**
	 * The feature id for the '<em><b>Image Path On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW__IMAGE_PATH_ON = DYNAMIC_ICON__IMAGE_PATH_ON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW__DESCRIPTION = DYNAMIC_ICON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Overview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_FEATURE_COUNT = DYNAMIC_ICON_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionExtensionImpl <em>Section Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionExtensionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getSectionExtension()
	 * @generated
	 */
	int SECTION_EXTENSION = 6;

	/**
	 * The feature id for the '<em><b>Activity Explorer Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_EXTENSION__ACTIVITY_EXPLORER_ITEM_ID = ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_EXTENSION__INDEX = ACTIVITY_EXPLORER_ITEM__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_EXTENSION__NAME = ACTIVITY_EXPLORER_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Extended Page ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_EXTENSION__EXTENDED_PAGE_ID = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_EXTENSION__EXPANDED = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_EXTENSION__FILTERING = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Section Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_EXTENSION_FEATURE_COUNT = ACTIVITY_EXPLORER_ITEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExtensionImpl <em>Activity Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExtensionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getActivityExtension()
	 * @generated
	 */
	int ACTIVITY_EXTENSION = 7;

	/**
	 * The feature id for the '<em><b>Has Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__HAS_PREDICATE = PREDICATE_ELEMENT__HAS_PREDICATE;

	/**
	 * The feature id for the '<em><b>Image Path Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__IMAGE_PATH_OFF = PREDICATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity Explorer Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__ACTIVITY_EXPLORER_ITEM_ID = PREDICATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__INDEX = PREDICATE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__NAME = PREDICATE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extended Section ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__EXTENDED_SECTION_ID = PREDICATE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION_FEATURE_COUNT = PREDICATE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl <em>Viewpoint Activity Explorer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getViewpointActivityExplorer()
	 * @generated
	 */
	int VIEWPOINT_ACTIVITY_EXPLORER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ACTIVITY_EXPLORER__ID = VpdescPackage.ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ACTIVITY_EXPLORER__NAME = VpdescPackage.ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ACTIVITY_EXPLORER__DESCRIPTION = VpdescPackage.ASPECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned New Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES = VpdescPackage.ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Sections Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION = VpdescPackage.ASPECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Activities Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION = VpdescPackage.ASPECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Viewpoint Activity Explorer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ACTIVITY_EXPLORER_FEATURE_COUNT = VpdescPackage.ASPECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PagesImpl <em>Pages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PagesImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getPages()
	 * @generated
	 */
	int PAGES = 9;

	/**
	 * The feature id for the '<em><b>Owned Activity Explorer Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES__OWNED_ACTIVITY_EXPLORER_PAGES = 0;

	/**
	 * The number of structural features of the '<em>Pages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionsImpl <em>Sections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionsImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getSections()
	 * @generated
	 */
	int SECTIONS = 10;

	/**
	 * The feature id for the '<em><b>Owned Sections Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTIONS__OWNED_SECTIONS_EXTENSIONS = 0;

	/**
	 * The number of structural features of the '<em>Sections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivitiesImpl <em>Activities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivitiesImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getActivities()
	 * @generated
	 */
	int ACTIVITIES = 11;

	/**
	 * The feature id for the '<em><b>Owned Activities Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITIES__OWNED_ACTIVITIES_EXTENSIONS = 0;

	/**
	 * The number of structural features of the '<em>Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITIES_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page#getOwnedOverview <em>Owned Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Overview</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page#getOwnedOverview()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_OwnedOverview();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page#getTabName <em>Tab Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page#getTabName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TabName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page#isShowViewer <em>Show Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Viewer</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page#isShowViewer()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_ShowViewer();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page#getModelType()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_ModelType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PredicateElement <em>Predicate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PredicateElement
	 * @generated
	 */
	EClass getPredicateElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PredicateElement#isHasPredicate <em>Has Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Predicate</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PredicateElement#isHasPredicate()
	 * @see #getPredicateElement()
	 * @generated
	 */
	EAttribute getPredicateElement_HasPredicate();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Overview <em>Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overview</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Overview
	 * @generated
	 */
	EClass getOverview();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Overview#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Overview#getDescription()
	 * @see #getOverview()
	 * @generated
	 */
	EAttribute getOverview_Description();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Icon#getImagePathOff <em>Image Path Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path Off</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Icon#getImagePathOff()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_ImagePathOff();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem <em>Activity Explorer Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Explorer Item</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem
	 * @generated
	 */
	EClass getActivityExplorerItem();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem#getActivityExplorerItemID <em>Activity Explorer Item ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Explorer Item ID</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem#getActivityExplorerItemID()
	 * @see #getActivityExplorerItem()
	 * @generated
	 */
	EAttribute getActivityExplorerItem_ActivityExplorerItemID();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem#getIndex()
	 * @see #getActivityExplorerItem()
	 * @generated
	 */
	EAttribute getActivityExplorerItem_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem#getName()
	 * @see #getActivityExplorerItem()
	 * @generated
	 */
	EAttribute getActivityExplorerItem_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.DynamicIcon <em>Dynamic Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Icon</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.DynamicIcon
	 * @generated
	 */
	EClass getDynamicIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.DynamicIcon#getImagePathOn <em>Image Path On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.DynamicIcon#getImagePathOn()
	 * @see #getDynamicIcon()
	 * @generated
	 */
	EAttribute getDynamicIcon_ImagePathOn();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension <em>Section Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Extension</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension
	 * @generated
	 */
	EClass getSectionExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension#getExtendedPageID <em>Extended Page ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Page ID</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension#getExtendedPageID()
	 * @see #getSectionExtension()
	 * @generated
	 */
	EAttribute getSectionExtension_ExtendedPageID();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension#isExpanded <em>Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expanded</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension#isExpanded()
	 * @see #getSectionExtension()
	 * @generated
	 */
	EAttribute getSectionExtension_Expanded();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension#isFiltering <em>Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtering</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension#isFiltering()
	 * @see #getSectionExtension()
	 * @generated
	 */
	EAttribute getSectionExtension_Filtering();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExtension <em>Activity Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Extension</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExtension
	 * @generated
	 */
	EClass getActivityExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExtension#getExtendedSectionID <em>Extended Section ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Section ID</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExtension#getExtendedSectionID()
	 * @see #getActivityExtension()
	 * @generated
	 */
	EAttribute getActivityExtension_ExtendedSectionID();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer <em>Viewpoint Activity Explorer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint Activity Explorer</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer
	 * @generated
	 */
	EClass getViewpointActivityExplorer();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedNewPages <em>Owned New Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned New Pages</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedNewPages()
	 * @see #getViewpointActivityExplorer()
	 * @generated
	 */
	EReference getViewpointActivityExplorer_OwnedNewPages();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedSectionsExtension <em>Owned Sections Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Sections Extension</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedSectionsExtension()
	 * @see #getViewpointActivityExplorer()
	 * @generated
	 */
	EReference getViewpointActivityExplorer_OwnedSectionsExtension();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedActivitiesExtension <em>Owned Activities Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Activities Extension</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer#getOwnedActivitiesExtension()
	 * @see #getViewpointActivityExplorer()
	 * @generated
	 */
	EReference getViewpointActivityExplorer_OwnedActivitiesExtension();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Pages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pages</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Pages
	 * @generated
	 */
	EClass getPages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Pages#getOwnedActivityExplorerPages <em>Owned Activity Explorer Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Activity Explorer Pages</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Pages#getOwnedActivityExplorerPages()
	 * @see #getPages()
	 * @generated
	 */
	EReference getPages_OwnedActivityExplorerPages();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sections</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections
	 * @generated
	 */
	EClass getSections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections#getOwnedSectionsExtensions <em>Owned Sections Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Sections Extensions</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections#getOwnedSectionsExtensions()
	 * @see #getSections()
	 * @generated
	 */
	EReference getSections_OwnedSectionsExtensions();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activities</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activities
	 * @generated
	 */
	EClass getActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activities#getOwnedActivitiesExtensions <em>Owned Activities Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Activities Extensions</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activities#getOwnedActivitiesExtensions()
	 * @see #getActivities()
	 * @generated
	 */
	EReference getActivities_OwnedActivitiesExtensions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewpointActivityExplorerFactory getViewpointActivityExplorerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PageImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Owned Overview</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__OWNED_OVERVIEW = eINSTANCE.getPage_OwnedOverview();

		/**
		 * The meta object literal for the '<em><b>Tab Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TAB_NAME = eINSTANCE.getPage_TabName();

		/**
		 * The meta object literal for the '<em><b>Show Viewer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__SHOW_VIEWER = eINSTANCE.getPage_ShowViewer();

		/**
		 * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__MODEL_TYPE = eINSTANCE.getPage_ModelType();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PredicateElementImpl <em>Predicate Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PredicateElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getPredicateElement()
		 * @generated
		 */
		EClass PREDICATE_ELEMENT = eINSTANCE.getPredicateElement();

		/**
		 * The meta object literal for the '<em><b>Has Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_ELEMENT__HAS_PREDICATE = eINSTANCE.getPredicateElement_HasPredicate();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.OverviewImpl <em>Overview</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.OverviewImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getOverview()
		 * @generated
		 */
		EClass OVERVIEW = eINSTANCE.getOverview();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERVIEW__DESCRIPTION = eINSTANCE.getOverview_Description();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.IconImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Image Path Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__IMAGE_PATH_OFF = eINSTANCE.getIcon_ImagePathOff();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExplorerItemImpl <em>Activity Explorer Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExplorerItemImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getActivityExplorerItem()
		 * @generated
		 */
		EClass ACTIVITY_EXPLORER_ITEM = eINSTANCE.getActivityExplorerItem();

		/**
		 * The meta object literal for the '<em><b>Activity Explorer Item ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID = eINSTANCE.getActivityExplorerItem_ActivityExplorerItemID();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXPLORER_ITEM__INDEX = eINSTANCE.getActivityExplorerItem_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXPLORER_ITEM__NAME = eINSTANCE.getActivityExplorerItem_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.DynamicIconImpl <em>Dynamic Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.DynamicIconImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getDynamicIcon()
		 * @generated
		 */
		EClass DYNAMIC_ICON = eINSTANCE.getDynamicIcon();

		/**
		 * The meta object literal for the '<em><b>Image Path On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_ICON__IMAGE_PATH_ON = eINSTANCE.getDynamicIcon_ImagePathOn();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionExtensionImpl <em>Section Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionExtensionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getSectionExtension()
		 * @generated
		 */
		EClass SECTION_EXTENSION = eINSTANCE.getSectionExtension();

		/**
		 * The meta object literal for the '<em><b>Extended Page ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_EXTENSION__EXTENDED_PAGE_ID = eINSTANCE.getSectionExtension_ExtendedPageID();

		/**
		 * The meta object literal for the '<em><b>Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_EXTENSION__EXPANDED = eINSTANCE.getSectionExtension_Expanded();

		/**
		 * The meta object literal for the '<em><b>Filtering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_EXTENSION__FILTERING = eINSTANCE.getSectionExtension_Filtering();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExtensionImpl <em>Activity Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExtensionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getActivityExtension()
		 * @generated
		 */
		EClass ACTIVITY_EXTENSION = eINSTANCE.getActivityExtension();

		/**
		 * The meta object literal for the '<em><b>Extended Section ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXTENSION__EXTENDED_SECTION_ID = eINSTANCE.getActivityExtension_ExtendedSectionID();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl <em>Viewpoint Activity Explorer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getViewpointActivityExplorer()
		 * @generated
		 */
		EClass VIEWPOINT_ACTIVITY_EXPLORER = eINSTANCE.getViewpointActivityExplorer();

		/**
		 * The meta object literal for the '<em><b>Owned New Pages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES = eINSTANCE.getViewpointActivityExplorer_OwnedNewPages();

		/**
		 * The meta object literal for the '<em><b>Owned Sections Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION = eINSTANCE.getViewpointActivityExplorer_OwnedSectionsExtension();

		/**
		 * The meta object literal for the '<em><b>Owned Activities Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION = eINSTANCE.getViewpointActivityExplorer_OwnedActivitiesExtension();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PagesImpl <em>Pages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.PagesImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getPages()
		 * @generated
		 */
		EClass PAGES = eINSTANCE.getPages();

		/**
		 * The meta object literal for the '<em><b>Owned Activity Explorer Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGES__OWNED_ACTIVITY_EXPLORER_PAGES = eINSTANCE.getPages_OwnedActivityExplorerPages();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionsImpl <em>Sections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionsImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getSections()
		 * @generated
		 */
		EClass SECTIONS = eINSTANCE.getSections();

		/**
		 * The meta object literal for the '<em><b>Owned Sections Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTIONS__OWNED_SECTIONS_EXTENSIONS = eINSTANCE.getSections_OwnedSectionsExtensions();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivitiesImpl <em>Activities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivitiesImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerPackageImpl#getActivities()
		 * @generated
		 */
		EClass ACTIVITIES = eINSTANCE.getActivities();

		/**
		 * The meta object literal for the '<em><b>Owned Activities Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITIES__OWNED_ACTIVITIES_EXTENSIONS = eINSTANCE.getActivities_OwnedActivitiesExtensions();

	}

} //ViewpointActivityExplorerPackage
