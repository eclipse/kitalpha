/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternFactory;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSampleSafetyPatternPackageImpl extends EPackageImpl
		implements ComponentSampleSafetyPatternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum safetY_PATTERNEEnum = null;

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
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentSampleSafetyPatternPackageImpl() {
		super(eNS_URI, ComponentSampleSafetyPatternFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentSampleSafetyPatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentSampleSafetyPatternPackage init() {
		if (isInited)
			return (ComponentSampleSafetyPatternPackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentSampleSafetyPatternPackage.eNS_URI);

		// Obtain or create and register package
		ComponentSampleSafetyPatternPackageImpl theComponentSampleSafetyPatternPackage = (ComponentSampleSafetyPatternPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComponentSampleSafetyPatternPackageImpl
						? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComponentSampleSafetyPatternPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();
		ComponentSampleSafetyPackage.eINSTANCE.eClass();
		ComponentSamplePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentSampleSafetyPatternPackage.createPackageContents();

		// Initialize created meta-data
		theComponentSampleSafetyPatternPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentSampleSafetyPatternPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentSampleSafetyPatternPackage.eNS_URI,
				theComponentSampleSafetyPatternPackage);
		return theComponentSampleSafetyPatternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafetyPackage() {
		return safetyPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSafetyPackage_Modes() {
		return (EReference) safetyPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafetyMode() {
		return safetyModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSafetyMode_InvolvedComponents() {
		return (EReference) safetyModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyMode_Pattern() {
		return (EAttribute) safetyModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSAFETY_PATTERN() {
		return safetY_PATTERNEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleSafetyPatternFactory getComponentSampleSafetyPatternFactory() {
		return (ComponentSampleSafetyPatternFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		safetyPackageEClass = createEClass(SAFETY_PACKAGE);
		createEReference(safetyPackageEClass, SAFETY_PACKAGE__MODES);

		safetyModeEClass = createEClass(SAFETY_MODE);
		createEReference(safetyModeEClass, SAFETY_MODE__INVOLVED_COMPONENTS);
		createEAttribute(safetyModeEClass, SAFETY_MODE__PATTERN);

		// Create enums
		safetY_PATTERNEEnum = createEEnum(SAFETY_PATTERN);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ComponentSamplePackage theComponentSamplePackage = (ComponentSamplePackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentSamplePackage.eNS_URI);
		ComponentSampleSafetyPackage theComponentSampleSafetyPackage = (ComponentSampleSafetyPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentSampleSafetyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		safetyPackageEClass.getESuperTypes().add(theComponentSamplePackage.getPackage());
		safetyModeEClass.getESuperTypes().add(theComponentSampleSafetyPackage.getSafety());

		// Initialize classes and features; add operations and parameters
		initEClass(safetyPackageEClass, SafetyPackage.class, "SafetyPackage", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSafetyPackage_Modes(), this.getSafetyMode(), null, "modes", null, 0, -1, SafetyPackage.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyModeEClass, SafetyMode.class, "SafetyMode", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSafetyMode_InvolvedComponents(), theComponentSampleSafetyPackage.getSafety(), null,
				"involvedComponents", null, 0, -1, SafetyMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyMode_Pattern(), this.getSAFETY_PATTERN(), "pattern", null, 0, 1, SafetyMode.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(safetY_PATTERNEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN.class,
				"SAFETY_PATTERN"); //$NON-NLS-1$
		addEEnumLiteral(safetY_PATTERNEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN.INTEGRITY);
		addEEnumLiteral(safetY_PATTERNEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN.AVAILABILITY);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentSampleSafetyPatternPackageImpl
