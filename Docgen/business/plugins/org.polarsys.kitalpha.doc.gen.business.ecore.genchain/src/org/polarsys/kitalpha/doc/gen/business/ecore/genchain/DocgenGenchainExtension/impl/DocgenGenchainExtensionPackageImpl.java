/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionFactory;
import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionPackage;
import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration;
import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocgenGenchainExtensionPackageImpl extends EPackageImpl implements DocgenGenchainExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kitalphaDocumentationGenerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kitalphaDocumentationGenerationBrandingEClass = null;

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
	 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocgenGenchainExtensionPackageImpl() {
		super(eNS_URI, DocgenGenchainExtensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DocgenGenchainExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocgenGenchainExtensionPackage init() {
		if (isInited) {
			return (DocgenGenchainExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(DocgenGenchainExtensionPackage.eNS_URI);
		}

		// Obtain or create and register package
		DocgenGenchainExtensionPackageImpl theDocgenGenchainExtensionPackage = (DocgenGenchainExtensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DocgenGenchainExtensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DocgenGenchainExtensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenerationChainPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDocgenGenchainExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theDocgenGenchainExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocgenGenchainExtensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocgenGenchainExtensionPackage.eNS_URI, theDocgenGenchainExtensionPackage);
		return theDocgenGenchainExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKitalphaDocumentationGeneration() {
		return kitalphaDocumentationGenerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKitalphaDocumentationGeneration_BrandingData() {
		return (EReference)kitalphaDocumentationGenerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKitalphaDocumentationGenerationBranding() {
		return kitalphaDocumentationGenerationBrandingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKitalphaDocumentationGenerationBranding_Copyright() {
		return (EAttribute)kitalphaDocumentationGenerationBrandingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKitalphaDocumentationGenerationBranding_LogoPath() {
		return (EAttribute)kitalphaDocumentationGenerationBrandingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKitalphaDocumentationGenerationBranding_LogoAlt() {
		return (EAttribute)kitalphaDocumentationGenerationBrandingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocgenGenchainExtensionFactory getDocgenGenchainExtensionFactory() {
		return (DocgenGenchainExtensionFactory)getEFactoryInstance();
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
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		kitalphaDocumentationGenerationEClass = createEClass(KITALPHA_DOCUMENTATION_GENERATION);
		createEReference(kitalphaDocumentationGenerationEClass, KITALPHA_DOCUMENTATION_GENERATION__BRANDING_DATA);

		kitalphaDocumentationGenerationBrandingEClass = createEClass(KITALPHA_DOCUMENTATION_GENERATION_BRANDING);
		createEAttribute(kitalphaDocumentationGenerationBrandingEClass, KITALPHA_DOCUMENTATION_GENERATION_BRANDING__COPYRIGHT);
		createEAttribute(kitalphaDocumentationGenerationBrandingEClass, KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_PATH);
		createEAttribute(kitalphaDocumentationGenerationBrandingEClass, KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_ALT);
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
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenerationChainPackage theGenerationChainPackage = (GenerationChainPackage)EPackage.Registry.INSTANCE.getEPackage(GenerationChainPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kitalphaDocumentationGenerationEClass.getESuperTypes().add(theGenerationChainPackage.getDocumentationGeneration());

		// Initialize classes and features; add operations and parameters
		initEClass(kitalphaDocumentationGenerationEClass, KitalphaDocumentationGeneration.class, "KitalphaDocumentationGeneration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKitalphaDocumentationGeneration_BrandingData(), this.getKitalphaDocumentationGenerationBranding(), null, "brandingData", null, 0, 1, KitalphaDocumentationGeneration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kitalphaDocumentationGenerationBrandingEClass, KitalphaDocumentationGenerationBranding.class, "KitalphaDocumentationGenerationBranding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKitalphaDocumentationGenerationBranding_Copyright(), ecorePackage.getEString(), "copyright", null, 0, 1, KitalphaDocumentationGenerationBranding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKitalphaDocumentationGenerationBranding_LogoPath(), ecorePackage.getEString(), "logoPath", null, 0, 1, KitalphaDocumentationGenerationBranding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKitalphaDocumentationGenerationBranding_LogoAlt(), ecorePackage.getEString(), "logoAlt", null, 0, 1, KitalphaDocumentationGenerationBranding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DocgenGenchainExtensionPackageImpl
