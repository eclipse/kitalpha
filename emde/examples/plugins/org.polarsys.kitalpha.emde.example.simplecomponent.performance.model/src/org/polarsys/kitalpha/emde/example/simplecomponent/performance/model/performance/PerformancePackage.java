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
package org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentPackage;

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
 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformanceFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/extension extensibleProviderFactory='true' childCreationExtenders='true' useUUIDs='true' useIDAttributes='false'"
 * @generated
 */
public interface PerformancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "performance"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/emde/example/simplecomponent/performance"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "performance"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PerformancePackage eINSTANCE = org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.PerformancePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.SimpleVPPerformanceImpl <em>Simple VP Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.SimpleVPPerformanceImpl
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.PerformancePackageImpl#getSimpleVPPerformance()
	 * @generated
	 */
	int SIMPLE_VP_PERFORMANCE = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_PERFORMANCE__OWNED_EXTENSIONS = SimplecomponentPackage.COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_PERFORMANCE__NAME = SimplecomponentPackage.COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_PERFORMANCE__DESCRIPTION = SimplecomponentPackage.COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_PERFORMANCE__COMPLEXITY = SimplecomponentPackage.COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_PERFORMANCE__COST = SimplecomponentPackage.COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_PERFORMANCE__STATUS = SimplecomponentPackage.COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple VP Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_PERFORMANCE_FEATURE_COUNT = SimplecomponentPackage.COMPONENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.VPStatusImpl <em>VP Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.VPStatusImpl
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.PerformancePackageImpl#getVPStatus()
	 * @generated
	 */
	int VP_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_STATUS__OWNED_EXTENSIONS = SimplecomponentPackage.COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_STATUS__NAME = SimplecomponentPackage.COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_STATUS__DESCRIPTION = SimplecomponentPackage.COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_STATUS__OVERHEAD = SimplecomponentPackage.COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VP Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_STATUS_FEATURE_COUNT = SimplecomponentPackage.COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance <em>Simple VP Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple VP Performance</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance
	 * @generated
	 */
	EClass getSimpleVPPerformance();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complexity</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getComplexity()
	 * @see #getSimpleVPPerformance()
	 * @generated
	 */
	EAttribute getSimpleVPPerformance_Complexity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getCost()
	 * @see #getSimpleVPPerformance()
	 * @generated
	 */
	EAttribute getSimpleVPPerformance_Cost();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getStatus()
	 * @see #getSimpleVPPerformance()
	 * @generated
	 */
	EReference getSimpleVPPerformance_Status();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.VPStatus <em>VP Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VP Status</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.VPStatus
	 * @generated
	 */
	EClass getVPStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.VPStatus#isOverhead <em>Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overhead</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.VPStatus#isOverhead()
	 * @see #getVPStatus()
	 * @generated
	 */
	EAttribute getVPStatus_Overhead();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PerformanceFactory getPerformanceFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.SimpleVPPerformanceImpl <em>Simple VP Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.SimpleVPPerformanceImpl
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.PerformancePackageImpl#getSimpleVPPerformance()
		 * @generated
		 */
		EClass SIMPLE_VP_PERFORMANCE = eINSTANCE.getSimpleVPPerformance();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VP_PERFORMANCE__COMPLEXITY = eINSTANCE.getSimpleVPPerformance_Complexity();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VP_PERFORMANCE__COST = eINSTANCE.getSimpleVPPerformance_Cost();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_VP_PERFORMANCE__STATUS = eINSTANCE.getSimpleVPPerformance_Status();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.VPStatusImpl <em>VP Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.VPStatusImpl
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.PerformancePackageImpl#getVPStatus()
		 * @generated
		 */
		EClass VP_STATUS = eINSTANCE.getVPStatus();

		/**
		 * The meta object literal for the '<em><b>Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VP_STATUS__OVERHEAD = eINSTANCE.getVPStatus_Overhead();

	}

} //PerformancePackage
