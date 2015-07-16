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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewpointActivityExplorerFactoryImpl extends EFactoryImpl implements ViewpointActivityExplorerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewpointActivityExplorerFactory init() {
		try {
			ViewpointActivityExplorerFactory theViewpointActivityExplorerFactory = (ViewpointActivityExplorerFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/viewpointactivityexplorer/1.0.0"); 
			if (theViewpointActivityExplorerFactory != null) {
				return theViewpointActivityExplorerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewpointActivityExplorerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointActivityExplorerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViewpointActivityExplorerPackage.PAGE: return createPage();
			case ViewpointActivityExplorerPackage.OVERVIEW: return createOverview();
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION: return createSectionExtension();
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION: return createActivityExtension();
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER: return createViewpointActivityExplorer();
			case ViewpointActivityExplorerPackage.PAGES: return createPages();
			case ViewpointActivityExplorerPackage.SECTIONS: return createSections();
			case ViewpointActivityExplorerPackage.ACTIVITIES: return createActivities();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overview createOverview() {
		OverviewImpl overview = new OverviewImpl();
		return overview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionExtension createSectionExtension() {
		SectionExtensionImpl sectionExtension = new SectionExtensionImpl();
		return sectionExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityExtension createActivityExtension() {
		ActivityExtensionImpl activityExtension = new ActivityExtensionImpl();
		return activityExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointActivityExplorer createViewpointActivityExplorer() {
		ViewpointActivityExplorerImpl viewpointActivityExplorer = new ViewpointActivityExplorerImpl();
		return viewpointActivityExplorer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pages createPages() {
		PagesImpl pages = new PagesImpl();
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sections createSections() {
		SectionsImpl sections = new SectionsImpl();
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activities createActivities() {
		ActivitiesImpl activities = new ActivitiesImpl();
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointActivityExplorerPackage getViewpointActivityExplorerPackage() {
		return (ViewpointActivityExplorerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewpointActivityExplorerPackage getPackage() {
		return ViewpointActivityExplorerPackage.eINSTANCE;
	}

} //ViewpointActivityExplorerFactoryImpl
