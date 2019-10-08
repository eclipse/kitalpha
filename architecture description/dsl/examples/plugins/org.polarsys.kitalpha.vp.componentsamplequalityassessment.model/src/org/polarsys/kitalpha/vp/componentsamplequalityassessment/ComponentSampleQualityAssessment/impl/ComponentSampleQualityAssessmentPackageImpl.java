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
package org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentFactory;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSampleQualityAssessmentPackageImpl extends EPackageImpl
		implements ComponentSampleQualityAssessmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidenceLevel_TypeEEnum = null;

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
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentSampleQualityAssessmentPackageImpl() {
		super(eNS_URI, ComponentSampleQualityAssessmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentSampleQualityAssessmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentSampleQualityAssessmentPackage init() {
		if (isInited)
			return (ComponentSampleQualityAssessmentPackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentSampleQualityAssessmentPackage.eNS_URI);

		// Obtain or create and register package
		ComponentSampleQualityAssessmentPackageImpl theComponentSampleQualityAssessmentPackage = (ComponentSampleQualityAssessmentPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComponentSampleQualityAssessmentPackageImpl
						? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComponentSampleQualityAssessmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();
		ComponentSamplePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentSampleQualityAssessmentPackage.createPackageContents();

		// Initialize created meta-data
		theComponentSampleQualityAssessmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentSampleQualityAssessmentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentSampleQualityAssessmentPackage.eNS_URI,
				theComponentSampleQualityAssessmentPackage);
		return theComponentSampleQualityAssessmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityAssessment() {
		return qualityAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityAssessment_BasedOn() {
		return (EReference) qualityAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityAssessment_Context() {
		return (EReference) qualityAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityAssessment_Measures() {
		return (EReference) qualityAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityAssessment_MaturityLevel() {
		return (EAttribute) qualityAssessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityAssessment_ConfidenceLevel() {
		return (EAttribute) qualityAssessmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityAssessment_Assessed() {
		return (EAttribute) qualityAssessmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityMeasure() {
		return qualityMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityMeasure_Criterion() {
		return (EAttribute) qualityMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityMeasure_MeasureValue() {
		return (EAttribute) qualityMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getconfidenceLevel_Type() {
		return confidenceLevel_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleQualityAssessmentFactory getComponentSampleQualityAssessmentFactory() {
		return (ComponentSampleQualityAssessmentFactory) getEFactoryInstance();
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
		qualityAssessmentEClass = createEClass(QUALITY_ASSESSMENT);
		createEReference(qualityAssessmentEClass, QUALITY_ASSESSMENT__BASED_ON);
		createEReference(qualityAssessmentEClass, QUALITY_ASSESSMENT__CONTEXT);
		createEReference(qualityAssessmentEClass, QUALITY_ASSESSMENT__MEASURES);
		createEAttribute(qualityAssessmentEClass, QUALITY_ASSESSMENT__MATURITY_LEVEL);
		createEAttribute(qualityAssessmentEClass, QUALITY_ASSESSMENT__CONFIDENCE_LEVEL);
		createEAttribute(qualityAssessmentEClass, QUALITY_ASSESSMENT__ASSESSED);

		qualityMeasureEClass = createEClass(QUALITY_MEASURE);
		createEAttribute(qualityMeasureEClass, QUALITY_MEASURE__CRITERION);
		createEAttribute(qualityMeasureEClass, QUALITY_MEASURE__MEASURE_VALUE);

		// Create enums
		confidenceLevel_TypeEEnum = createEEnum(CONFIDENCE_LEVEL_TYPE);
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
		qualityAssessmentEClass.getESuperTypes().add(theComponentSamplePackage.getComponentElement());
		qualityAssessmentEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		qualityMeasureEClass.getESuperTypes().add(theComponentSamplePackage.getComponentElement());

		// Initialize classes and features; add operations and parameters
		initEClass(qualityAssessmentEClass, QualityAssessment.class, "QualityAssessment", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityAssessment_BasedOn(), this.getQualityAssessment(), null, "basedOn", null, 0, -1, //$NON-NLS-1$
				QualityAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityAssessment_Context(), theComponentSamplePackage.getComponentElement(), null, "context", //$NON-NLS-1$
				null, 0, -1, QualityAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityAssessment_Measures(), this.getQualityMeasure(), null, "measures", null, 0, -1, //$NON-NLS-1$
				QualityAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityAssessment_MaturityLevel(), ecorePackage.getEString(), "maturityLevel", null, 0, 1, //$NON-NLS-1$
				QualityAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityAssessment_ConfidenceLevel(), this.getconfidenceLevel_Type(), "confidenceLevel", null, //$NON-NLS-1$
				0, 1, QualityAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityAssessment_Assessed(), ecorePackage.getEBoolean(), "assessed", null, 0, 1, //$NON-NLS-1$
				QualityAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(qualityMeasureEClass, QualityMeasure.class, "QualityMeasure", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualityMeasure_Criterion(), ecorePackage.getEString(), "criterion", null, 0, 1, //$NON-NLS-1$
				QualityMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityMeasure_MeasureValue(), ecorePackage.getEInt(), "measureValue", null, 0, 1, //$NON-NLS-1$
				QualityMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(confidenceLevel_TypeEEnum, confidenceLevel_Type.class, "confidenceLevel_Type"); //$NON-NLS-1$
		addEEnumLiteral(confidenceLevel_TypeEEnum, confidenceLevel_Type.NOT_ASSESSED);
		addEEnumLiteral(confidenceLevel_TypeEEnum, confidenceLevel_Type.LOW);
		addEEnumLiteral(confidenceLevel_TypeEEnum, confidenceLevel_Type.MEDIUM);
		addEEnumLiteral(confidenceLevel_TypeEEnum, confidenceLevel_Type.HIGH);

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
		addAnnotation(qualityAssessmentEClass, source, new String[] { "ExtendedElement", //$NON-NLS-1$
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
		addAnnotation(qualityAssessmentEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/resource/org.polarsys.kitalpha.vp.componentsample/models/ComponentSample.ecore#//AbstractComponent" //$NON-NLS-1$
		});
	}

} //ComponentSampleQualityAssessmentPackageImpl
