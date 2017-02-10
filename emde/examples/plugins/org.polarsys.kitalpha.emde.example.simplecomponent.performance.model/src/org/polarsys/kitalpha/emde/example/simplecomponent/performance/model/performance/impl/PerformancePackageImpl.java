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
package org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentPackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformanceFactory;
import org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance;
import org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.VPStatus;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformancePackageImpl extends EPackageImpl implements PerformancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleVPPerformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpStatusEClass = null;

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
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PerformancePackageImpl() {
		super(eNS_URI, PerformanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PerformancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PerformancePackage init() {
		if (isInited)
			return (PerformancePackage) EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI);

		// Obtain or create and register package
		PerformancePackageImpl thePerformancePackage = (PerformancePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PerformancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new PerformancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimplecomponentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePerformancePackage.createPackageContents();

		// Initialize created meta-data
		thePerformancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePerformancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PerformancePackage.eNS_URI, thePerformancePackage);
		return thePerformancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleVPPerformance() {
		return simpleVPPerformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleVPPerformance_Complexity() {
		return (EAttribute) simpleVPPerformanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleVPPerformance_Cost() {
		return (EAttribute) simpleVPPerformanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleVPPerformance_Status() {
		return (EReference) simpleVPPerformanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPStatus() {
		return vpStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPStatus_Overhead() {
		return (EAttribute) vpStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceFactory getPerformanceFactory() {
		return (PerformanceFactory) getEFactoryInstance();
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
		simpleVPPerformanceEClass = createEClass(SIMPLE_VP_PERFORMANCE);
		createEAttribute(simpleVPPerformanceEClass, SIMPLE_VP_PERFORMANCE__COMPLEXITY);
		createEAttribute(simpleVPPerformanceEClass, SIMPLE_VP_PERFORMANCE__COST);
		createEReference(simpleVPPerformanceEClass, SIMPLE_VP_PERFORMANCE__STATUS);

		vpStatusEClass = createEClass(VP_STATUS);
		createEAttribute(vpStatusEClass, VP_STATUS__OVERHEAD);
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
		SimplecomponentPackage theSimplecomponentPackage = (SimplecomponentPackage) EPackage.Registry.INSTANCE
				.getEPackage(SimplecomponentPackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleVPPerformanceEClass.getESuperTypes().add(theSimplecomponentPackage.getComponentElement());
		simpleVPPerformanceEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		vpStatusEClass.getESuperTypes().add(theSimplecomponentPackage.getComponentElement());

		// Initialize classes and features; add operations and parameters
		initEClass(simpleVPPerformanceEClass, SimpleVPPerformance.class, "SimpleVPPerformance", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleVPPerformance_Complexity(), ecorePackage.getEInt(), "complexity", null, 0, 1, //$NON-NLS-1$
				SimpleVPPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleVPPerformance_Cost(), ecorePackage.getEInt(), "cost", null, 0, 1, //$NON-NLS-1$
				SimpleVPPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleVPPerformance_Status(), this.getVPStatus(), null, "status", null, 0, 1, //$NON-NLS-1$
				SimpleVPPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpStatusEClass, VPStatus.class, "VPStatus", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVPStatus_Overhead(), ecorePackage.getEBoolean(), "overhead", null, 0, 1, VPStatus.class, //$NON-NLS-1$
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
		addAnnotation(simpleVPPerformanceEClass, source, new String[] { "ExtendedElement", //$NON-NLS-1$
				"http://www.polarsys.org/kitalpha/emde/example/simplecomponent#//AbstractComponent " //$NON-NLS-1$
		});
	}

} //PerformancePackageImpl
