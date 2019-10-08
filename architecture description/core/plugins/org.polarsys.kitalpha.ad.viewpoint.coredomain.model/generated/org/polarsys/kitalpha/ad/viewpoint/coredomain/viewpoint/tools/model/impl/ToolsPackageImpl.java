/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ToolsFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ToolsPackage;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElementSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolsPackageImpl extends EPackageImpl implements ToolsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointElementSetEClass = null;

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
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ToolsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToolsPackageImpl() {
		super(eNS_URI, ToolsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToolsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToolsPackage init() {
		if (isInited) return (ToolsPackage)EPackage.Registry.INSTANCE.getEPackage(ToolsPackage.eNS_URI);

		// Obtain or create and register package
		ToolsPackageImpl theToolsPackage = (ToolsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToolsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToolsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ViewpointPackageImpl theViewpointPackage = (ViewpointPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewpointPackage.eNS_URI) instanceof ViewpointPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewpointPackage.eNS_URI) : ViewpointPackage.eINSTANCE);

		// Create package meta-data objects
		theToolsPackage.createPackageContents();
		theViewpointPackage.createPackageContents();

		// Initialize created meta-data
		theToolsPackage.initializePackageContents();
		theViewpointPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToolsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToolsPackage.eNS_URI, theToolsPackage);
		return theToolsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpointElement() {
		return viewpointElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpointElementSet() {
		return viewpointElementSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolsFactory getToolsFactory() {
		return (ToolsFactory)getEFactoryInstance();
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
		viewpointElementEClass = createEClass(VIEWPOINT_ELEMENT);

		viewpointElementSetEClass = createEClass(VIEWPOINT_ELEMENT_SET);
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
		ViewpointPackage theViewpointPackage = (ViewpointPackage)EPackage.Registry.INSTANCE.getEPackage(ViewpointPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		viewpointElementEClass.getESuperTypes().add(theViewpointPackage.getNameElement());

		// Initialize classes and features; add operations and parameters
		initEClass(viewpointElementEClass, ViewpointElement.class, "ViewpointElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewpointElementSetEClass, ViewpointElementSet.class, "ViewpointElementSet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ToolsPackageImpl
