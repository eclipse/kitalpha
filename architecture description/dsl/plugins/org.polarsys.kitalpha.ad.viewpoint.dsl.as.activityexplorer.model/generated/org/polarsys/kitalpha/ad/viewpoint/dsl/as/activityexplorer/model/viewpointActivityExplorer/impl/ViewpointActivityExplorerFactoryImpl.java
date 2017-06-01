/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.*;

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
			ViewpointActivityExplorerFactory theViewpointActivityExplorerFactory = (ViewpointActivityExplorerFactory)EPackage.Registry.INSTANCE.getEFactory(ViewpointActivityExplorerPackage.eNS_URI);
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
			case ViewpointActivityExplorerPackage.SECTION: return createSection();
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER: return createViewpointActivityExplorer();
			case ViewpointActivityExplorerPackage.PAGE_EXTENSION: return createPageExtension();
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION: return createSectionExtension();
			case ViewpointActivityExplorerPackage.ACTIVITY: return createActivity();
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
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
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
	public PageExtension createPageExtension() {
		PageExtensionImpl pageExtension = new PageExtensionImpl();
		return pageExtension;
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
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
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
