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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.DynamicIcon;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Icon;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Overview;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Pages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PredicateElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewpointActivityExplorerPackageImpl extends EPackageImpl implements ViewpointActivityExplorerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExplorerItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicIconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointActivityExplorerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitiesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewpointActivityExplorerPackageImpl() {
		super(eNS_URI, ViewpointActivityExplorerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ViewpointActivityExplorerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewpointActivityExplorerPackage init() {
		if (isInited) return (ViewpointActivityExplorerPackage)EPackage.Registry.INSTANCE.getEPackage(ViewpointActivityExplorerPackage.eNS_URI);

		// Obtain or create and register package
		ViewpointActivityExplorerPackageImpl theViewpointActivityExplorerPackage = (ViewpointActivityExplorerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViewpointActivityExplorerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViewpointActivityExplorerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VpdescPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViewpointActivityExplorerPackage.createPackageContents();

		// Initialize created meta-data
		theViewpointActivityExplorerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewpointActivityExplorerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewpointActivityExplorerPackage.eNS_URI, theViewpointActivityExplorerPackage);
		return theViewpointActivityExplorerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_OwnedOverview() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TabName() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_ShowViewer() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_ModelType() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateElement() {
		return predicateElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicateElement_HasPredicate() {
		return (EAttribute)predicateElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverview() {
		return overviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverview_Description() {
		return (EAttribute)overviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIcon() {
		return iconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIcon_ImagePathOff() {
		return (EAttribute)iconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExplorerItem() {
		return activityExplorerItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExplorerItem_ActivityExplorerItemID() {
		return (EAttribute)activityExplorerItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExplorerItem_Index() {
		return (EAttribute)activityExplorerItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExplorerItem_Name() {
		return (EAttribute)activityExplorerItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicIcon() {
		return dynamicIconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicIcon_ImagePathOn() {
		return (EAttribute)dynamicIconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionExtension() {
		return sectionExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionExtension_ExtendedPageID() {
		return (EAttribute)sectionExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionExtension_Expanded() {
		return (EAttribute)sectionExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionExtension_Filtering() {
		return (EAttribute)sectionExtensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExtension() {
		return activityExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExtension_ExtendedSectionID() {
		return (EAttribute)activityExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpointActivityExplorer() {
		return viewpointActivityExplorerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpointActivityExplorer_OwnedNewPages() {
		return (EReference)viewpointActivityExplorerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpointActivityExplorer_OwnedSectionsExtension() {
		return (EReference)viewpointActivityExplorerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpointActivityExplorer_OwnedActivitiesExtension() {
		return (EReference)viewpointActivityExplorerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPages() {
		return pagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPages_OwnedActivityExplorerPages() {
		return (EReference)pagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSections() {
		return sectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSections_OwnedSectionsExtensions() {
		return (EReference)sectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivities() {
		return activitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivities_OwnedActivitiesExtensions() {
		return (EReference)activitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointActivityExplorerFactory getViewpointActivityExplorerFactory() {
		return (ViewpointActivityExplorerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__OWNED_OVERVIEW);
		createEAttribute(pageEClass, PAGE__TAB_NAME);
		createEAttribute(pageEClass, PAGE__SHOW_VIEWER);
		createEAttribute(pageEClass, PAGE__MODEL_TYPE);

		predicateElementEClass = createEClass(PREDICATE_ELEMENT);
		createEAttribute(predicateElementEClass, PREDICATE_ELEMENT__HAS_PREDICATE);

		overviewEClass = createEClass(OVERVIEW);
		createEAttribute(overviewEClass, OVERVIEW__DESCRIPTION);

		iconEClass = createEClass(ICON);
		createEAttribute(iconEClass, ICON__IMAGE_PATH_OFF);

		activityExplorerItemEClass = createEClass(ACTIVITY_EXPLORER_ITEM);
		createEAttribute(activityExplorerItemEClass, ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID);
		createEAttribute(activityExplorerItemEClass, ACTIVITY_EXPLORER_ITEM__INDEX);
		createEAttribute(activityExplorerItemEClass, ACTIVITY_EXPLORER_ITEM__NAME);

		dynamicIconEClass = createEClass(DYNAMIC_ICON);
		createEAttribute(dynamicIconEClass, DYNAMIC_ICON__IMAGE_PATH_ON);

		sectionExtensionEClass = createEClass(SECTION_EXTENSION);
		createEAttribute(sectionExtensionEClass, SECTION_EXTENSION__EXTENDED_PAGE_ID);
		createEAttribute(sectionExtensionEClass, SECTION_EXTENSION__EXPANDED);
		createEAttribute(sectionExtensionEClass, SECTION_EXTENSION__FILTERING);

		activityExtensionEClass = createEClass(ACTIVITY_EXTENSION);
		createEAttribute(activityExtensionEClass, ACTIVITY_EXTENSION__EXTENDED_SECTION_ID);

		viewpointActivityExplorerEClass = createEClass(VIEWPOINT_ACTIVITY_EXPLORER);
		createEReference(viewpointActivityExplorerEClass, VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES);
		createEReference(viewpointActivityExplorerEClass, VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION);
		createEReference(viewpointActivityExplorerEClass, VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION);

		pagesEClass = createEClass(PAGES);
		createEReference(pagesEClass, PAGES__OWNED_ACTIVITY_EXPLORER_PAGES);

		sectionsEClass = createEClass(SECTIONS);
		createEReference(sectionsEClass, SECTIONS__OWNED_SECTIONS_EXTENSIONS);

		activitiesEClass = createEClass(ACTIVITIES);
		createEReference(activitiesEClass, ACTIVITIES__OWNED_ACTIVITIES_EXTENSIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		VpdescPackage theVpdescPackage = (VpdescPackage)EPackage.Registry.INSTANCE.getEPackage(VpdescPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pageEClass.getESuperTypes().add(this.getActivityExplorerItem());
		pageEClass.getESuperTypes().add(this.getDynamicIcon());
		pageEClass.getESuperTypes().add(this.getPredicateElement());
		overviewEClass.getESuperTypes().add(this.getDynamicIcon());
		dynamicIconEClass.getESuperTypes().add(this.getIcon());
		sectionExtensionEClass.getESuperTypes().add(this.getActivityExplorerItem());
		activityExtensionEClass.getESuperTypes().add(this.getPredicateElement());
		activityExtensionEClass.getESuperTypes().add(this.getIcon());
		activityExtensionEClass.getESuperTypes().add(this.getActivityExplorerItem());
		viewpointActivityExplorerEClass.getESuperTypes().add(theVpdescPackage.getAspect());

		// Initialize classes and features; add operations and parameters
		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_OwnedOverview(), this.getOverview(), null, "ownedOverview", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_TabName(), theEcorePackage.getEString(), "tabName", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_ShowViewer(), theEcorePackage.getEBoolean(), "showViewer", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_ModelType(), theEcorePackage.getEString(), "modelType", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateElementEClass, PredicateElement.class, "PredicateElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicateElement_HasPredicate(), theEcorePackage.getEBoolean(), "hasPredicate", null, 0, 1, PredicateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overviewEClass, Overview.class, "Overview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverview_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Overview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconEClass, Icon.class, "Icon", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIcon_ImagePathOff(), theEcorePackage.getEString(), "imagePathOff", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityExplorerItemEClass, ActivityExplorerItem.class, "ActivityExplorerItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityExplorerItem_ActivityExplorerItemID(), theEcorePackage.getEString(), "activityExplorerItemID", null, 0, 1, ActivityExplorerItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityExplorerItem_Index(), theEcorePackage.getEInt(), "index", null, 1, 1, ActivityExplorerItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityExplorerItem_Name(), theEcorePackage.getEString(), "name", null, 1, 1, ActivityExplorerItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicIconEClass, DynamicIcon.class, "DynamicIcon", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicIcon_ImagePathOn(), theEcorePackage.getEString(), "imagePathOn", null, 0, 1, DynamicIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionExtensionEClass, SectionExtension.class, "SectionExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSectionExtension_ExtendedPageID(), theEcorePackage.getEString(), "extendedPageID", null, 0, 1, SectionExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionExtension_Expanded(), theEcorePackage.getEBoolean(), "expanded", null, 0, 1, SectionExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionExtension_Filtering(), theEcorePackage.getEBoolean(), "filtering", null, 0, 1, SectionExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityExtensionEClass, ActivityExtension.class, "ActivityExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityExtension_ExtendedSectionID(), theEcorePackage.getEString(), "extendedSectionID", null, 0, 1, ActivityExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewpointActivityExplorerEClass, ViewpointActivityExplorer.class, "ViewpointActivityExplorer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewpointActivityExplorer_OwnedNewPages(), this.getPages(), null, "ownedNewPages", null, 0, 1, ViewpointActivityExplorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewpointActivityExplorer_OwnedSectionsExtension(), this.getSections(), null, "ownedSectionsExtension", null, 0, 1, ViewpointActivityExplorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewpointActivityExplorer_OwnedActivitiesExtension(), this.getActivities(), null, "ownedActivitiesExtension", null, 0, 1, ViewpointActivityExplorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pagesEClass, Pages.class, "Pages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPages_OwnedActivityExplorerPages(), this.getPage(), null, "ownedActivityExplorerPages", null, 0, -1, Pages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionsEClass, Sections.class, "Sections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSections_OwnedSectionsExtensions(), this.getSectionExtension(), null, "ownedSectionsExtensions", null, 0, -1, Sections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitiesEClass, Activities.class, "Activities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivities_OwnedActivitiesExtensions(), this.getActivityExtension(), null, "ownedActivitiesExtensions", null, 0, -1, Activities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ViewpointActivityExplorerPackageImpl
