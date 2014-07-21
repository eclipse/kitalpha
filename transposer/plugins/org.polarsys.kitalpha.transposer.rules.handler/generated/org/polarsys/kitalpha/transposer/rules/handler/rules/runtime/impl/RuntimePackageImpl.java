/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.RulesPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributionPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributionPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimeFactory;
import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimePackageImpl extends EPackageImpl implements RuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimePurposeEClass = null;

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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackageImpl() {
		super(eNS_URI, RuntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimePackage init() {
		if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		ApiPackageImpl theApiPackage = (ApiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI) instanceof ApiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI) : ApiPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		ContributionPackageImpl theContributionPackage = (ContributionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContributionPackage.eNS_URI) instanceof ContributionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContributionPackage.eNS_URI) : ContributionPackage.eINSTANCE);

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theApiPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theContributionPackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theApiPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theContributionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimePurpose() {
		return runtimePurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimePurpose_Mapping() {
		return (EReference)runtimePurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimePurpose_Description() {
		return (EAttribute)runtimePurposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimePurpose_Id() {
		return (EAttribute)runtimePurposeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactory getRuntimeFactory() {
		return (RuntimeFactory)getEFactoryInstance();
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
		runtimePurposeEClass = createEClass(RUNTIME_PURPOSE);
		createEReference(runtimePurposeEClass, RUNTIME_PURPOSE__MAPPING);
		createEAttribute(runtimePurposeEClass, RUNTIME_PURPOSE__DESCRIPTION);
		createEAttribute(runtimePurposeEClass, RUNTIME_PURPOSE__ID);
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
		ApiPackage theApiPackage = (ApiPackage)EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		RulesPackage theRulesPackage = (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runtimePurposeEClass.getESuperTypes().add(theApiPackage.getIPurpose());

		// Initialize classes and features; add operations and parameters
		initEClass(runtimePurposeEClass, RuntimePurpose.class, "RuntimePurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRuntimePurpose_Mapping(), theCommonPackage.getMapping(), null, "mapping", null, 0, 1, RuntimePurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRuntimePurpose_Description(), theEcorePackage.getEString(), "description", null, 0, 1, RuntimePurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRuntimePurpose_Id(), ecorePackage.getEString(), "id", null, 1, 1, RuntimePurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(runtimePurposeEClass, theCommonPackage.getMappingPossibility(), "resolveApplicablePossibility", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "object_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theApiPackage.getIDomainHelper(), "domainHelper_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, theRulesPackage.getMappingPossibilityResolutionException());

		op = addEOperation(runtimePurposeEClass, theCommonPackage.getMappingElement(), "getMappingElement", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(theEcorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "domainClass_p", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
	}

} //RuntimePackageImpl
