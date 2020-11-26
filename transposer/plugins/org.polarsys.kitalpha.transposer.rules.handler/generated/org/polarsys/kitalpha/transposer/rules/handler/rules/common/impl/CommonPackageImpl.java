/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.RulesPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonFactory;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributionPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributionPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePackageImpl;

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
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingPossibilityEClass = null;

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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		ApiPackageImpl theApiPackage = (ApiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI) instanceof ApiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI) : ApiPackage.eINSTANCE);
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);
		ContributionPackageImpl theContributionPackage = (ContributionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContributionPackage.eNS_URI) instanceof ContributionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContributionPackage.eNS_URI) : ContributionPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theApiPackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theContributionPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theApiPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theContributionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_Name() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_ExtendedMapping() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Extenders() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_OwnedPackages() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_OwnedMappingElements() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_OwnedDomainHelper() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_DomainHelper() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_AllOwnedMappingElements() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Purpose() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_Description() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_CompleteDescription() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_Id() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_OwnedContext() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_Context() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_Private() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingPackage() {
		return mappingPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingPackage_OwnedPackages() {
		return (EReference)mappingPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingPackage_OwnedMappingElements() {
		return (EReference)mappingPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingPackage_Name() {
		return (EAttribute)mappingPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingPackage_AllMappingElements() {
		return (EReference)mappingPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingElement() {
		return mappingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingElement_OwnedDefaultPossibility() {
		return (EReference)mappingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingElement_DefaultPossibility() {
		return (EReference)mappingElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingElement_OwnedPossibilities() {
		return (EReference)mappingElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingElement_AllPossibilities() {
		return (EReference)mappingElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingElement_DomainMetaClass() {
		return (EAttribute)mappingElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingElement_ExtendedMappingElement() {
		return (EReference)mappingElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingElement_ReuseSuperPossibilities() {
		return (EAttribute)mappingElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingElement_ReuseSuperDefaultPossibility() {
		return (EAttribute)mappingElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingElement_Extenders() {
		return (EReference)mappingElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingElement_Name() {
		return (EAttribute)mappingElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingPossibility() {
		return mappingPossibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingPossibility_Name() {
		return (EAttribute)mappingPossibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingPossibility_Context() {
		return (EAttribute)mappingPossibilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingPossibility_CompleteRule() {
		return (EAttribute)mappingPossibilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingPossibility_IncompleteRule() {
		return (EAttribute)mappingPossibilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
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
		mappingEClass = createEClass(MAPPING);
		createEAttribute(mappingEClass, MAPPING__NAME);
		createEReference(mappingEClass, MAPPING__EXTENDED_MAPPING);
		createEReference(mappingEClass, MAPPING__EXTENDERS);
		createEReference(mappingEClass, MAPPING__OWNED_PACKAGES);
		createEReference(mappingEClass, MAPPING__OWNED_MAPPING_ELEMENTS);
		createEAttribute(mappingEClass, MAPPING__OWNED_DOMAIN_HELPER);
		createEAttribute(mappingEClass, MAPPING__DOMAIN_HELPER);
		createEReference(mappingEClass, MAPPING__ALL_OWNED_MAPPING_ELEMENTS);
		createEReference(mappingEClass, MAPPING__PURPOSE);
		createEAttribute(mappingEClass, MAPPING__DESCRIPTION);
		createEAttribute(mappingEClass, MAPPING__COMPLETE_DESCRIPTION);
		createEAttribute(mappingEClass, MAPPING__ID);
		createEAttribute(mappingEClass, MAPPING__OWNED_CONTEXT);
		createEAttribute(mappingEClass, MAPPING__CONTEXT);
		createEAttribute(mappingEClass, MAPPING__PRIVATE);

		mappingPackageEClass = createEClass(MAPPING_PACKAGE);
		createEReference(mappingPackageEClass, MAPPING_PACKAGE__OWNED_PACKAGES);
		createEReference(mappingPackageEClass, MAPPING_PACKAGE__OWNED_MAPPING_ELEMENTS);
		createEAttribute(mappingPackageEClass, MAPPING_PACKAGE__NAME);
		createEReference(mappingPackageEClass, MAPPING_PACKAGE__ALL_MAPPING_ELEMENTS);

		mappingElementEClass = createEClass(MAPPING_ELEMENT);
		createEReference(mappingElementEClass, MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY);
		createEReference(mappingElementEClass, MAPPING_ELEMENT__DEFAULT_POSSIBILITY);
		createEReference(mappingElementEClass, MAPPING_ELEMENT__OWNED_POSSIBILITIES);
		createEReference(mappingElementEClass, MAPPING_ELEMENT__ALL_POSSIBILITIES);
		createEAttribute(mappingElementEClass, MAPPING_ELEMENT__DOMAIN_META_CLASS);
		createEReference(mappingElementEClass, MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT);
		createEAttribute(mappingElementEClass, MAPPING_ELEMENT__REUSE_SUPER_POSSIBILITIES);
		createEAttribute(mappingElementEClass, MAPPING_ELEMENT__REUSE_SUPER_DEFAULT_POSSIBILITY);
		createEReference(mappingElementEClass, MAPPING_ELEMENT__EXTENDERS);
		createEAttribute(mappingElementEClass, MAPPING_ELEMENT__NAME);

		mappingPossibilityEClass = createEClass(MAPPING_POSSIBILITY);
		createEAttribute(mappingPossibilityEClass, MAPPING_POSSIBILITY__NAME);
		createEAttribute(mappingPossibilityEClass, MAPPING_POSSIBILITY__CONTEXT);
		createEAttribute(mappingPossibilityEClass, MAPPING_POSSIBILITY__COMPLETE_RULE);
		createEAttribute(mappingPossibilityEClass, MAPPING_POSSIBILITY__INCOMPLETE_RULE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		RulesPackage theRulesPackage = (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMapping_Name(), ecorePackage.getEString(), "name", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMapping_ExtendedMapping(), this.getMapping(), this.getMapping_Extenders(), "extendedMapping", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMapping_Extenders(), this.getMapping(), this.getMapping_ExtendedMapping(), "extenders", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMapping_OwnedPackages(), this.getMappingPackage(), null, "ownedPackages", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMapping_OwnedMappingElements(), this.getMappingElement(), null, "ownedMappingElements", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMapping_OwnedDomainHelper(), theApiPackage.getIDomainHelper(), "ownedDomainHelper", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMapping_DomainHelper(), theApiPackage.getIDomainHelper(), "domainHelper", null, 1, 1, Mapping.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMapping_AllOwnedMappingElements(), this.getMappingElement(), null, "allOwnedMappingElements", null, 0, -1, Mapping.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMapping_Purpose(), theApiPackage.getIPurpose(), null, "purpose", null, 1, 1, Mapping.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMapping_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMapping_CompleteDescription(), theEcorePackage.getEString(), "completeDescription", null, 0, 1, Mapping.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMapping_Id(), ecorePackage.getEString(), "id", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMapping_OwnedContext(), theApiPackage.getIContext(), "ownedContext", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMapping_Context(), theApiPackage.getIContext(), "context", null, 0, 1, Mapping.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMapping_Private(), ecorePackage.getEBoolean(), "private", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(mappingEClass, theApiPackage.getIStatus(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(mappingEClass, this.getMappingElement(), "getOwnedMappingElement", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(theEcorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "domainClass_p", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mappingEClass, this.getMappingPossibility(), "resolveApplicablePossibility", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "object_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theApiPackage.getIDomainHelper(), "domainHelper_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, theRulesPackage.getMappingPossibilityResolutionException());

		op = addEOperation(mappingEClass, this.getMappingElement(), "resolveUniqueAvailableMappingElement", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "object_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theApiPackage.getIDomainHelper(), "domainHelper_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, theRulesPackage.getMappingResolutionException());

		op = addEOperation(mappingEClass, this.getMappingElement(), "resolveAllAvailableMappingElements", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "domainClass_p", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(mappingEClass, this.getMapping(), "getExtendersWithSamePurpose", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(mappingPackageEClass, MappingPackage.class, "MappingPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMappingPackage_OwnedPackages(), this.getMappingPackage(), null, "ownedPackages", null, 0, -1, MappingPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMappingPackage_OwnedMappingElements(), this.getMappingElement(), null, "ownedMappingElements", null, 0, -1, MappingPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMappingPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, MappingPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMappingPackage_AllMappingElements(), this.getMappingElement(), null, "allMappingElements", null, 0, -1, MappingPackage.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mappingElementEClass, MappingElement.class, "MappingElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMappingElement_OwnedDefaultPossibility(), this.getMappingPossibility(), null, "ownedDefaultPossibility", null, 0, 1, MappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMappingElement_DefaultPossibility(), this.getMappingPossibility(), null, "defaultPossibility", null, 0, 1, MappingElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMappingElement_OwnedPossibilities(), this.getMappingPossibility(), null, "ownedPossibilities", null, 0, -1, MappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMappingElement_AllPossibilities(), this.getMappingPossibility(), null, "allPossibilities", null, 0, -1, MappingElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getMappingElement_DomainMetaClass(), g1, "domainMetaClass", null, 1, 1, MappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMappingElement_ExtendedMappingElement(), this.getMappingElement(), this.getMappingElement_Extenders(), "extendedMappingElement", null, 0, 1, MappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMappingElement_ReuseSuperPossibilities(), theEcorePackage.getEBoolean(), "reuseSuperPossibilities", null, 0, 1, MappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMappingElement_ReuseSuperDefaultPossibility(), ecorePackage.getEBoolean(), "reuseSuperDefaultPossibility", null, 0, 1, MappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMappingElement_Extenders(), this.getMappingElement(), this.getMappingElement_ExtendedMappingElement(), "extenders", null, 0, -1, MappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMappingElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, MappingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mappingElementEClass, this.getMappingPossibility(), "getApplicablePossibility", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEJavaObject(), "object_p", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(mappingPossibilityEClass, MappingPossibility.class, "MappingPossibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMappingPossibility_Name(), ecorePackage.getEString(), "name", "mapping possibility", 1, 1, MappingPossibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getMappingPossibility_Context(), theApiPackage.getIContext(), "context", null, 0, 1, MappingPossibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theApiPackage.getIRule());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getMappingPossibility_CompleteRule(), g1, "completeRule", null, 1, 1, MappingPossibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theApiPackage.getIRule());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getMappingPossibility_IncompleteRule(), g1, "incompleteRule", null, 0, 1, MappingPossibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mappingPossibilityEClass, theEcorePackage.getEBoolean(), "checkRules", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theApiPackage.getIDomainHelper(), "domainHelper_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, theRulesPackage.getRuleDefinitionException());

		op = addEOperation(mappingPossibilityEClass, theEcorePackage.getEBoolean(), "checkCompleteRule", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theApiPackage.getIDomainHelper(), "domainHelper_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, theRulesPackage.getRuleDefinitionException());

		op = addEOperation(mappingPossibilityEClass, theEcorePackage.getEBoolean(), "checkIncompleteRule", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theApiPackage.getIDomainHelper(), "domainHelper_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, theRulesPackage.getRuleDefinitionException());

		op = addEOperation(mappingPossibilityEClass, null, "applyRule", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEJavaObject(), "object_p", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theApiPackage.getIContext(), "context_p", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEBoolean(), "complete_p", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, theRulesPackage.getRuleExecutionException());

		op = addEOperation(mappingPossibilityEClass, null, "updateContext", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEJavaObject(), "object_p", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theApiPackage.getIContext(), "context_p", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(mappingPossibilityEClass, theEcorePackage.getEBoolean(), "isApplicableOn", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEJavaObject(), "object_p", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
	}

} //CommonPackageImpl
