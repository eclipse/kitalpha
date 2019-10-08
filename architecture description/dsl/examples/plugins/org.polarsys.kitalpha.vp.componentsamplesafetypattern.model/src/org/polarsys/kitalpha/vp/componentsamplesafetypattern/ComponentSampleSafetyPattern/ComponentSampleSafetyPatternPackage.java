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

package org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage;

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
 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentSampleSafetyPatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentSampleSafetyPattern"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ComponentSampleSafetyPattern/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentSampleSafetyPattern"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSampleSafetyPatternPackage eINSTANCE = org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.ComponentSampleSafetyPatternPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyPackageImpl <em>Safety Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyPackageImpl
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.ComponentSampleSafetyPatternPackageImpl#getSafetyPackage()
	 * @generated
	 */
	int SAFETY_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_PACKAGE__OWNED_EXTENSIONS = ComponentSamplePackage.PACKAGE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_PACKAGE__NAME = ComponentSamplePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_PACKAGE__DESCRIPTION = ComponentSamplePackage.PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_PACKAGE__MODES = ComponentSamplePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Safety Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_PACKAGE_FEATURE_COUNT = ComponentSamplePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyModeImpl <em>Safety Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyModeImpl
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.ComponentSampleSafetyPatternPackageImpl#getSafetyMode()
	 * @generated
	 */
	int SAFETY_MODE = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MODE__OWNED_EXTENSIONS = ComponentSampleSafetyPackage.SAFETY__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MODE__NAME = ComponentSampleSafetyPackage.SAFETY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MODE__DESCRIPTION = ComponentSampleSafetyPackage.SAFETY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MODE__CRITICALITY = ComponentSampleSafetyPackage.SAFETY__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Dal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MODE__DAL = ComponentSampleSafetyPackage.SAFETY__DAL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MODE__STATE = ComponentSampleSafetyPackage.SAFETY__STATE;

	/**
	 * The feature id for the '<em><b>Involved Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MODE__INVOLVED_COMPONENTS = ComponentSampleSafetyPackage.SAFETY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MODE__PATTERN = ComponentSampleSafetyPackage.SAFETY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Safety Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MODE_FEATURE_COUNT = ComponentSampleSafetyPackage.SAFETY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN <em>SAFETY PATTERN</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.ComponentSampleSafetyPatternPackageImpl#getSAFETY_PATTERN()
	 * @generated
	 */
	int SAFETY_PATTERN = 2;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyPackage <em>Safety Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Package</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyPackage
	 * @generated
	 */
	EClass getSafetyPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyPackage#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyPackage#getModes()
	 * @see #getSafetyPackage()
	 * @generated
	 */
	EReference getSafetyPackage_Modes();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode <em>Safety Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Mode</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode
	 * @generated
	 */
	EClass getSafetyMode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode#getInvolvedComponents <em>Involved Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Components</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode#getInvolvedComponents()
	 * @see #getSafetyMode()
	 * @generated
	 */
	EReference getSafetyMode_InvolvedComponents();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode#getPattern()
	 * @see #getSafetyMode()
	 * @generated
	 */
	EAttribute getSafetyMode_Pattern();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN <em>SAFETY PATTERN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SAFETY PATTERN</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN
	 * @generated
	 */
	EEnum getSAFETY_PATTERN();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentSampleSafetyPatternFactory getComponentSampleSafetyPatternFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyPackageImpl <em>Safety Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyPackageImpl
		 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.ComponentSampleSafetyPatternPackageImpl#getSafetyPackage()
		 * @generated
		 */
		EClass SAFETY_PACKAGE = eINSTANCE.getSafetyPackage();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_PACKAGE__MODES = eINSTANCE.getSafetyPackage_Modes();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyModeImpl <em>Safety Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyModeImpl
		 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.ComponentSampleSafetyPatternPackageImpl#getSafetyMode()
		 * @generated
		 */
		EClass SAFETY_MODE = eINSTANCE.getSafetyMode();

		/**
		 * The meta object literal for the '<em><b>Involved Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_MODE__INVOLVED_COMPONENTS = eINSTANCE.getSafetyMode_InvolvedComponents();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_MODE__PATTERN = eINSTANCE.getSafetyMode_Pattern();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN <em>SAFETY PATTERN</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN
		 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.ComponentSampleSafetyPatternPackageImpl#getSAFETY_PATTERN()
		 * @generated
		 */
		EEnum SAFETY_PATTERN = eINSTANCE.getSAFETY_PATTERN();

	}

} //ComponentSampleSafetyPatternPackage
