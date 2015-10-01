/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
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
 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentSampleSafetyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentSampleSafety"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ComponentSampleSafety/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentSampleSafety"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSampleSafetyPackage eINSTANCE = org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.ComponentSampleSafetyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.SafetyImpl <em>Safety</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.SafetyImpl
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.ComponentSampleSafetyPackageImpl#getSafety()
	 * @generated
	 */
	int SAFETY = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__OWNED_EXTENSIONS = ComponentSamplePackage.COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__NAME = ComponentSamplePackage.COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__DESCRIPTION = ComponentSamplePackage.COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__CRITICALITY = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__DAL = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__STATE = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FEATURE_COUNT = ComponentSamplePackage.COMPONENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE <em>STATE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.ComponentSampleSafetyPackageImpl#getSTATE()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL <em>DAL LEVEL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.ComponentSampleSafetyPackageImpl#getDAL_LEVEL()
	 * @generated
	 */
	int DAL_LEVEL = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY <em>CRITICALITY</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.ComponentSampleSafetyPackageImpl#getCRITICALITY()
	 * @generated
	 */
	int CRITICALITY = 3;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety
	 * @generated
	 */
	EClass getSafety();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getCriticality()
	 * @see #getSafety()
	 * @generated
	 */
	EAttribute getSafety_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getDal <em>Dal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dal</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getDal()
	 * @see #getSafety()
	 * @generated
	 */
	EAttribute getSafety_Dal();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getState()
	 * @see #getSafety()
	 * @generated
	 */
	EAttribute getSafety_State();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE <em>STATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STATE</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE
	 * @generated
	 */
	EEnum getSTATE();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL <em>DAL LEVEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DAL LEVEL</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL
	 * @generated
	 */
	EEnum getDAL_LEVEL();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY <em>CRITICALITY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CRITICALITY</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY
	 * @generated
	 */
	EEnum getCRITICALITY();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentSampleSafetyFactory getComponentSampleSafetyFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.SafetyImpl <em>Safety</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.SafetyImpl
		 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.ComponentSampleSafetyPackageImpl#getSafety()
		 * @generated
		 */
		EClass SAFETY = eINSTANCE.getSafety();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY__CRITICALITY = eINSTANCE.getSafety_Criticality();

		/**
		 * The meta object literal for the '<em><b>Dal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY__DAL = eINSTANCE.getSafety_Dal();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY__STATE = eINSTANCE.getSafety_State();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE <em>STATE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE
		 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.ComponentSampleSafetyPackageImpl#getSTATE()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getSTATE();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL <em>DAL LEVEL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL
		 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.ComponentSampleSafetyPackageImpl#getDAL_LEVEL()
		 * @generated
		 */
		EEnum DAL_LEVEL = eINSTANCE.getDAL_LEVEL();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY <em>CRITICALITY</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY
		 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.ComponentSampleSafetyPackageImpl#getCRITICALITY()
		 * @generated
		 */
		EEnum CRITICALITY = eINSTANCE.getCRITICALITY();

	}

} //ComponentSampleSafetyPackage
