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
package org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyFactory;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSampleSafetyPackageImpl extends EPackageImpl implements ComponentSampleSafetyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daL_LEVELEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum criticalityEEnum = null;

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
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentSampleSafetyPackageImpl() {
		super(eNS_URI, ComponentSampleSafetyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentSampleSafetyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentSampleSafetyPackage init() {
		if (isInited)
			return (ComponentSampleSafetyPackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentSampleSafetyPackage.eNS_URI);

		// Obtain or create and register package
		ComponentSampleSafetyPackageImpl theComponentSampleSafetyPackage = (ComponentSampleSafetyPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComponentSampleSafetyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComponentSampleSafetyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();
		ComponentSamplePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentSampleSafetyPackage.createPackageContents();

		// Initialize created meta-data
		theComponentSampleSafetyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentSampleSafetyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentSampleSafetyPackage.eNS_URI, theComponentSampleSafetyPackage);
		return theComponentSampleSafetyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafety() {
		return safetyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafety_Criticality() {
		return (EAttribute) safetyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafety_Dal() {
		return (EAttribute) safetyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafety_State() {
		return (EAttribute) safetyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSTATE() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDAL_LEVEL() {
		return daL_LEVELEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCRITICALITY() {
		return criticalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleSafetyFactory getComponentSampleSafetyFactory() {
		return (ComponentSampleSafetyFactory) getEFactoryInstance();
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
		safetyEClass = createEClass(SAFETY);
		createEAttribute(safetyEClass, SAFETY__CRITICALITY);
		createEAttribute(safetyEClass, SAFETY__DAL);
		createEAttribute(safetyEClass, SAFETY__STATE);

		// Create enums
		stateEEnum = createEEnum(STATE);
		daL_LEVELEEnum = createEEnum(DAL_LEVEL);
		criticalityEEnum = createEEnum(CRITICALITY);
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
		safetyEClass.getESuperTypes().add(theComponentSamplePackage.getComponentElement());
		safetyEClass.getESuperTypes().add(theEmdePackage.getElementExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(safetyEClass, Safety.class, "Safety", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSafety_Criticality(), this.getCRITICALITY(), "criticality", null, 0, 1, Safety.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafety_Dal(), this.getDAL_LEVEL(), "dal", null, 0, 1, Safety.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafety_State(), this.getSTATE(), "state", null, 0, 1, Safety.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE.class,
				"STATE"); //$NON-NLS-1$
		addEEnumLiteral(stateEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE.OPERATIVE);
		addEEnumLiteral(stateEEnum, org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE.LOST);
		addEEnumLiteral(stateEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE.ERRONEOUS);

		initEEnum(daL_LEVELEEnum, org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL.class,
				"DAL_LEVEL"); //$NON-NLS-1$
		addEEnumLiteral(daL_LEVELEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL.DAL_A);
		addEEnumLiteral(daL_LEVELEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL.DAL_B);
		addEEnumLiteral(daL_LEVELEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL.DAL_C);
		addEEnumLiteral(daL_LEVELEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL.DAL_D);
		addEEnumLiteral(daL_LEVELEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL.DAL_E);

		initEEnum(criticalityEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY.class, "CRITICALITY"); //$NON-NLS-1$
		addEEnumLiteral(criticalityEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY.CATASTROPHIC);
		addEEnumLiteral(criticalityEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY.HAZARDOUS);
		addEEnumLiteral(criticalityEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY.MAJOR);
		addEEnumLiteral(criticalityEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY.MINOR);
		addEEnumLiteral(criticalityEEnum,
				org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY.NO_SAFETY_EFFECT);

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
		addAnnotation(safetyEClass, source, new String[] { "ExtendedElement", //$NON-NLS-1$
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
		addAnnotation(safetyEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/resource/org.polarsys.kitalpha.vp.componentsample/models/ComponentSample.ecore#//AbstractComponent" //$NON-NLS-1$
		});
	}

} //ComponentSampleSafetyPackageImpl
