/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/extension extensibleProviderFactory='true' childCreationExtenders='true' useUUIDs='true' useIDAttributes='false'"
 * @generated
 */
public interface SafetyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "safety"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/emde/example/simplecomponent/safety"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "safety"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SafetyPackage eINSTANCE = org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl.SafetyPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl.SimpleVPSafetyImpl <em>Simple VP Safety</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl.SimpleVPSafetyImpl
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl.SafetyPackageImpl#getSimpleVPSafety()
	 * @generated
	 */
	int SIMPLE_VP_SAFETY = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_SAFETY__OWNED_EXTENSIONS = SimplecomponentPackage.COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_SAFETY__NAME = SimplecomponentPackage.COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_SAFETY__DESCRIPTION = SimplecomponentPackage.COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_SAFETY__COMPLEXITY = SimplecomponentPackage.COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_SAFETY__COST = SimplecomponentPackage.COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple VP Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VP_SAFETY_FEATURE_COUNT = SimplecomponentPackage.COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety <em>Simple VP Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple VP Safety</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety
	 * @generated
	 */
	EClass getSimpleVPSafety();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complexity</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety#getComplexity()
	 * @see #getSimpleVPSafety()
	 * @generated
	 */
	EAttribute getSimpleVPSafety_Complexity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety#getCost()
	 * @see #getSimpleVPSafety()
	 * @generated
	 */
	EAttribute getSimpleVPSafety_Cost();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SafetyFactory getSafetyFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl.SimpleVPSafetyImpl <em>Simple VP Safety</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl.SimpleVPSafetyImpl
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl.SafetyPackageImpl#getSimpleVPSafety()
		 * @generated
		 */
		EClass SIMPLE_VP_SAFETY = eINSTANCE.getSimpleVPSafety();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VP_SAFETY__COMPLEXITY = eINSTANCE.getSimpleVPSafety_Complexity();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VP_SAFETY__COST = eINSTANCE.getSimpleVPSafety_Cost();

	}

} //SafetyPackage
