/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformanceFactory;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformancePackage;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.PerformanceStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSamplePerformancePackageImpl extends EPackageImpl implements ComponentSamplePerformancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceStatusEClass = null;

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
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentSamplePerformancePackageImpl() {
		super(eNS_URI, ComponentSamplePerformanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentSamplePerformancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentSamplePerformancePackage init() {
		if (isInited)
			return (ComponentSamplePerformancePackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentSamplePerformancePackage.eNS_URI);

		// Obtain or create and register package
		ComponentSamplePerformancePackageImpl theComponentSamplePerformancePackage = (ComponentSamplePerformancePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComponentSamplePerformancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComponentSamplePerformancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();
		ComponentSamplePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentSamplePerformancePackage.createPackageContents();

		// Initialize created meta-data
		theComponentSamplePerformancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentSamplePerformancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentSamplePerformancePackage.eNS_URI, theComponentSamplePerformancePackage);
		return theComponentSamplePerformancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformance() {
		return performanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformance_Status() {
		return (EReference) performanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformance_Complexity() {
		return (EAttribute) performanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformance_Cost() {
		return (EAttribute) performanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceStatus() {
		return performanceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceStatus_Overhead() {
		return (EAttribute) performanceStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSamplePerformanceFactory getComponentSamplePerformanceFactory() {
		return (ComponentSamplePerformanceFactory) getEFactoryInstance();
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
		performanceEClass = createEClass(PERFORMANCE);
		createEReference(performanceEClass, PERFORMANCE__STATUS);
		createEAttribute(performanceEClass, PERFORMANCE__COMPLEXITY);
		createEAttribute(performanceEClass, PERFORMANCE__COST);

		performanceStatusEClass = createEClass(PERFORMANCE_STATUS);
		createEAttribute(performanceStatusEClass, PERFORMANCE_STATUS__OVERHEAD);
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
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		performanceEClass.getESuperTypes().add(theComponentSamplePackage.getComponentElement());
		performanceEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		performanceStatusEClass.getESuperTypes().add(theComponentSamplePackage.getComponentElement());

		// Initialize classes and features; add operations and parameters
		initEClass(performanceEClass, Performance.class, "Performance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformance_Status(), this.getPerformanceStatus(), null, "status", null, 0, 1, //$NON-NLS-1$
				Performance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformance_Complexity(), ecorePackage.getEInt(), "complexity", null, 0, 1, Performance.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformance_Cost(), ecorePackage.getEInt(), "cost", null, 0, 1, Performance.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceStatusEClass, PerformanceStatus.class, "PerformanceStatus", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformanceStatus_Overhead(), ecorePackage.getEBoolean(), "overhead", null, 0, 1, //$NON-NLS-1$
				PerformanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$	
		addAnnotation(performanceEClass, source, new String[] { "ExtendedElement", //$NON-NLS-1$
				" http://www.polarsys.org/kitalpha/ComponentSample/1.0.0#//AbstractComponent" //$NON-NLS-1$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$	
		addAnnotation(performanceEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/resource/org.polarsys.kitalpha.vp.componentsample/models/ComponentSample.ecore#//AbstractComponent" //$NON-NLS-1$
		});
	}

} //ComponentSamplePerformancePackageImpl
