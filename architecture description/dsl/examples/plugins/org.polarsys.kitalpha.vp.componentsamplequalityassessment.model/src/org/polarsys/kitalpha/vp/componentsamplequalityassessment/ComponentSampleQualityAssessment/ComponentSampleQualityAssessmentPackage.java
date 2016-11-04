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
package org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentSampleQualityAssessmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentSampleQualityAssessment"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ComponentSampleQualityAssessment/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentSampleQualityAssessment"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSampleQualityAssessmentPackage eINSTANCE = org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.ComponentSampleQualityAssessmentPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl <em>Quality Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.ComponentSampleQualityAssessmentPackageImpl#getQualityAssessment()
	 * @generated
	 */
	int QUALITY_ASSESSMENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT__OWNED_EXTENSIONS = ComponentSamplePackage.COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT__NAME = ComponentSamplePackage.COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT__DESCRIPTION = ComponentSamplePackage.COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT__BASED_ON = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT__CONTEXT = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT__MEASURES = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maturity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT__MATURITY_LEVEL = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidence Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT__CONFIDENCE_LEVEL = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assessed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT__ASSESSED = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Quality Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSESSMENT_FEATURE_COUNT = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityMeasureImpl <em>Quality Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityMeasureImpl
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.ComponentSampleQualityAssessmentPackageImpl#getQualityMeasure()
	 * @generated
	 */
	int QUALITY_MEASURE = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MEASURE__OWNED_EXTENSIONS = ComponentSamplePackage.COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MEASURE__NAME = ComponentSamplePackage.COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MEASURE__DESCRIPTION = ComponentSamplePackage.COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MEASURE__CRITERION = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measure Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MEASURE__MEASURE_VALUE = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quality Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MEASURE_FEATURE_COUNT = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type <em>confidence Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.ComponentSampleQualityAssessmentPackageImpl#getconfidenceLevel_Type()
	 * @generated
	 */
	int CONFIDENCE_LEVEL_TYPE = 2;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment <em>Quality Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Assessment</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment
	 * @generated
	 */
	EClass getQualityAssessment();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Based On</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getBasedOn()
	 * @see #getQualityAssessment()
	 * @generated
	 */
	EReference getQualityAssessment_BasedOn();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getContext()
	 * @see #getQualityAssessment()
	 * @generated
	 */
	EReference getQualityAssessment_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getMeasures()
	 * @see #getQualityAssessment()
	 * @generated
	 */
	EReference getQualityAssessment_Measures();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getMaturityLevel <em>Maturity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity Level</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getMaturityLevel()
	 * @see #getQualityAssessment()
	 * @generated
	 */
	EAttribute getQualityAssessment_MaturityLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getConfidenceLevel <em>Confidence Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence Level</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getConfidenceLevel()
	 * @see #getQualityAssessment()
	 * @generated
	 */
	EAttribute getQualityAssessment_ConfidenceLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#isAssessed <em>Assessed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessed</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#isAssessed()
	 * @see #getQualityAssessment()
	 * @generated
	 */
	EAttribute getQualityAssessment_Assessed();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure <em>Quality Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Measure</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure
	 * @generated
	 */
	EClass getQualityMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criterion</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure#getCriterion()
	 * @see #getQualityMeasure()
	 * @generated
	 */
	EAttribute getQualityMeasure_Criterion();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure#getMeasureValue <em>Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Value</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure#getMeasureValue()
	 * @see #getQualityMeasure()
	 * @generated
	 */
	EAttribute getQualityMeasure_MeasureValue();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type <em>confidence Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>confidence Level Type</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type
	 * @generated
	 */
	EEnum getconfidenceLevel_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentSampleQualityAssessmentFactory getComponentSampleQualityAssessmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl <em>Quality Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl
		 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.ComponentSampleQualityAssessmentPackageImpl#getQualityAssessment()
		 * @generated
		 */
		EClass QUALITY_ASSESSMENT = eINSTANCE.getQualityAssessment();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ASSESSMENT__BASED_ON = eINSTANCE.getQualityAssessment_BasedOn();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ASSESSMENT__CONTEXT = eINSTANCE.getQualityAssessment_Context();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ASSESSMENT__MEASURES = eINSTANCE.getQualityAssessment_Measures();

		/**
		 * The meta object literal for the '<em><b>Maturity Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_ASSESSMENT__MATURITY_LEVEL = eINSTANCE.getQualityAssessment_MaturityLevel();

		/**
		 * The meta object literal for the '<em><b>Confidence Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_ASSESSMENT__CONFIDENCE_LEVEL = eINSTANCE.getQualityAssessment_ConfidenceLevel();

		/**
		 * The meta object literal for the '<em><b>Assessed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_ASSESSMENT__ASSESSED = eINSTANCE.getQualityAssessment_Assessed();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityMeasureImpl <em>Quality Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityMeasureImpl
		 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.ComponentSampleQualityAssessmentPackageImpl#getQualityMeasure()
		 * @generated
		 */
		EClass QUALITY_MEASURE = eINSTANCE.getQualityMeasure();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_MEASURE__CRITERION = eINSTANCE.getQualityMeasure_Criterion();

		/**
		 * The meta object literal for the '<em><b>Measure Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_MEASURE__MEASURE_VALUE = eINSTANCE.getQualityMeasure_MeasureValue();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type <em>confidence Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type
		 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.ComponentSampleQualityAssessmentPackageImpl#getconfidenceLevel_Type()
		 * @generated
		 */
		EEnum CONFIDENCE_LEVEL_TYPE = eINSTANCE.getconfidenceLevel_Type();

	}

} //ComponentSampleQualityAssessmentPackage
