/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.viewpoint.ViewpointPackage;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusFactory;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusPackage;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiriusPackageImpl extends EPackageImpl implements SiriusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusRepresentationEClass = null;

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
	 * @see org.polarsys.kitalpha.ad.integration.sirius.model.SiriusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SiriusPackageImpl() {
		super(eNS_URI, SiriusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SiriusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SiriusPackage init() {
		if (isInited) return (SiriusPackage)EPackage.Registry.INSTANCE.getEPackage(SiriusPackage.eNS_URI);

		// Obtain or create and register package
		SiriusPackageImpl theSiriusPackage = (SiriusPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SiriusPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SiriusPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ViewpointPackage.eINSTANCE.eClass();
		org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSiriusPackage.createPackageContents();

		// Initialize created meta-data
		theSiriusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSiriusPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SiriusPackage.eNS_URI, theSiriusPackage);
		return theSiriusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiriusRepresentation() {
		return siriusRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiriusRepresentation_Odesign() {
		return (EReference)siriusRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiriusFactory getSiriusFactory() {
		return (SiriusFactory)getEFactoryInstance();
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
		siriusRepresentationEClass = createEClass(SIRIUS_REPRESENTATION);
		createEReference(siriusRepresentationEClass, SIRIUS_REPRESENTATION__ODESIGN);
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
		org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage theViewpointPackage_1 = (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage)EPackage.Registry.INSTANCE.getEPackage(org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage.eNS_URI);
		DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		siriusRepresentationEClass.getESuperTypes().add(theViewpointPackage_1.getRepresentationElement());

		// Initialize classes and features; add operations and parameters
		initEClass(siriusRepresentationEClass, SiriusRepresentation.class, "SiriusRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiriusRepresentation_Odesign(), theDescriptionPackage.getGroup(), null, "odesign", null, 0, 1, SiriusRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SiriusPackageImpl
