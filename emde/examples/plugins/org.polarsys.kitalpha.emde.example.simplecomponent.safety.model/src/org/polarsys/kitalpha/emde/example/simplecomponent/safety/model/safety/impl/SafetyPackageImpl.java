/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentPackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyFactory;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyPackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyPackageImpl extends EPackageImpl implements SafetyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleVPSafetyEClass = null;

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
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SafetyPackageImpl() {
		super(eNS_URI, SafetyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SafetyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SafetyPackage init() {
		if (isInited) {
			return (SafetyPackage) EPackage.Registry.INSTANCE.getEPackage(SafetyPackage.eNS_URI);
		}

		// Obtain or create and register package
		SafetyPackageImpl theSafetyPackage = (SafetyPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SafetyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SafetyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimplecomponentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSafetyPackage.createPackageContents();

		// Initialize created meta-data
		theSafetyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSafetyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SafetyPackage.eNS_URI, theSafetyPackage);
		return theSafetyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleVPSafety() {
		return simpleVPSafetyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleVPSafety_Complexity() {
		return (EAttribute) simpleVPSafetyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleVPSafety_Cost() {
		return (EAttribute) simpleVPSafetyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyFactory getSafetyFactory() {
		return (SafetyFactory) getEFactoryInstance();
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
		simpleVPSafetyEClass = createEClass(SIMPLE_VP_SAFETY);
		createEAttribute(simpleVPSafetyEClass, SIMPLE_VP_SAFETY__COMPLEXITY);
		createEAttribute(simpleVPSafetyEClass, SIMPLE_VP_SAFETY__COST);
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
		SimplecomponentPackage theSimplecomponentPackage = (SimplecomponentPackage) EPackage.Registry.INSTANCE
				.getEPackage(SimplecomponentPackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleVPSafetyEClass.getESuperTypes().add(theSimplecomponentPackage.getComponentElement());
		simpleVPSafetyEClass.getESuperTypes().add(theEmdePackage.getElementExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(simpleVPSafetyEClass, SimpleVPSafety.class, "SimpleVPSafety", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleVPSafety_Complexity(), ecorePackage.getEInt(), "complexity", null, 0, 1, //$NON-NLS-1$
				SimpleVPSafety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleVPSafety_Cost(), ecorePackage.getEInt(), "cost", null, 0, 1, SimpleVPSafety.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/extension
		createExtensionAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/extension</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtensionAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/extension"; //$NON-NLS-1$	
		addAnnotation(this, source,
				new String[] { "extensibleProviderFactory", "true", //$NON-NLS-1$ //$NON-NLS-2$
						"childCreationExtenders", "true", //$NON-NLS-1$ //$NON-NLS-2$
						"useUUIDs", "true", //$NON-NLS-1$ //$NON-NLS-2$
						"useIDAttributes", "false" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$	
		addAnnotation(simpleVPSafetyEClass, source, new String[] { "ExtendedElement", //$NON-NLS-1$
				"http://www.polarsys.org/kitalpha/emde/example/simplecomponent#//AbstractComponent " //$NON-NLS-1$
		});
	}

} //SafetyPackageImpl
