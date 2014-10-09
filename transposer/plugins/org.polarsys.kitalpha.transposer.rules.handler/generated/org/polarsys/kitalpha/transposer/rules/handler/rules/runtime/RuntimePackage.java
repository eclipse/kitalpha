/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.runtime;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/transposer/rules/runtime"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "runtime"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePurposeImpl <em>Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePurposeImpl
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePackageImpl#getRuntimePurpose()
	 * @generated
	 */
	int RUNTIME_PURPOSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PURPOSE__NAME = ApiPackage.IPURPOSE__NAME;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PURPOSE__MAPPING = ApiPackage.IPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PURPOSE__DESCRIPTION = ApiPackage.IPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PURPOSE__ID = ApiPackage.IPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PURPOSE_FEATURE_COUNT = ApiPackage.IPURPOSE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose
	 * @generated
	 */
	EClass getRuntimePurpose();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getMapping()
	 * @see #getRuntimePurpose()
	 * @generated
	 */
	EReference getRuntimePurpose_Mapping();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getDescription()
	 * @see #getRuntimePurpose()
	 * @generated
	 */
	EAttribute getRuntimePurpose_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose#getId()
	 * @see #getRuntimePurpose()
	 * @generated
	 */
	EAttribute getRuntimePurpose_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePurposeImpl <em>Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePurposeImpl
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePackageImpl#getRuntimePurpose()
		 * @generated
		 */
		EClass RUNTIME_PURPOSE = eINSTANCE.getRuntimePurpose();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PURPOSE__MAPPING = eINSTANCE.getRuntimePurpose_Mapping();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_PURPOSE__DESCRIPTION = eINSTANCE.getRuntimePurpose_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_PURPOSE__ID = eINSTANCE.getRuntimePurpose_Id();

	}

} //RuntimePackage
