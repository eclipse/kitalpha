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
package org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformanceFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentSamplePerformancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentSamplePerformance"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ComponentSamplePerformance/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentSamplePerformance"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSamplePerformancePackage eINSTANCE = org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.ComponentSamplePerformancePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.PerformanceImpl <em>Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.PerformanceImpl
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.ComponentSamplePerformancePackageImpl#getPerformance()
	 * @generated
	 */
	int PERFORMANCE = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__OWNED_EXTENSIONS = ComponentSamplePackage.COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__NAME = ComponentSamplePackage.COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__DESCRIPTION = ComponentSamplePackage.COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__STATUS = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__COMPLEXITY = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__COST = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_FEATURE_COUNT = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.PerformanceStatusImpl <em>Performance Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.PerformanceStatusImpl
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.ComponentSamplePerformancePackageImpl#getPerformanceStatus()
	 * @generated
	 */
	int PERFORMANCE_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATUS__OWNED_EXTENSIONS = ComponentSamplePackage.COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATUS__NAME = ComponentSamplePackage.COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATUS__DESCRIPTION = ComponentSamplePackage.COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATUS__OVERHEAD = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Performance Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATUS_FEATURE_COUNT = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance
	 * @generated
	 */
	EClass getPerformance();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getStatus()
	 * @see #getPerformance()
	 * @generated
	 */
	EReference getPerformance_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complexity</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getComplexity()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Complexity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getCost()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Cost();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.PerformanceStatus <em>Performance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Status</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.PerformanceStatus
	 * @generated
	 */
	EClass getPerformanceStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.PerformanceStatus#isOverhead <em>Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overhead</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.PerformanceStatus#isOverhead()
	 * @see #getPerformanceStatus()
	 * @generated
	 */
	EAttribute getPerformanceStatus_Overhead();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentSamplePerformanceFactory getComponentSamplePerformanceFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.PerformanceImpl <em>Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.PerformanceImpl
		 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.ComponentSamplePerformancePackageImpl#getPerformance()
		 * @generated
		 */
		EClass PERFORMANCE = eINSTANCE.getPerformance();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE__STATUS = eINSTANCE.getPerformance_Status();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__COMPLEXITY = eINSTANCE.getPerformance_Complexity();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__COST = eINSTANCE.getPerformance_Cost();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.PerformanceStatusImpl <em>Performance Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.PerformanceStatusImpl
		 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl.ComponentSamplePerformancePackageImpl#getPerformanceStatus()
		 * @generated
		 */
		EClass PERFORMANCE_STATUS = eINSTANCE.getPerformanceStatus();

		/**
		 * The meta object literal for the '<em><b>Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_STATUS__OVERHEAD = eINSTANCE.getPerformanceStatus_Overhead();

	}

} //ComponentSamplePerformancePackage
