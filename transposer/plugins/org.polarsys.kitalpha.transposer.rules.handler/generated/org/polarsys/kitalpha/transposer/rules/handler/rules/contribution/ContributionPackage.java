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


package org.polarsys.kitalpha.transposer.rules.handler.rules.contribution;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage;

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
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributionFactory
 * @model kind="package"
 * @generated
 */
public interface ContributionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contribution"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/transposer/rules/contribution"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "contribution"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContributionPackage eINSTANCE = org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributedPurposeImpl <em>Contributed Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributedPurposeImpl
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributionPackageImpl#getContributedPurpose()
	 * @generated
	 */
	int CONTRIBUTED_PURPOSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTED_PURPOSE__NAME = ApiPackage.IPURPOSE__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTED_PURPOSE__MAPPINGS = ApiPackage.IPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contributed Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTED_PURPOSE_FEATURE_COUNT = ApiPackage.IPURPOSE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose <em>Contributed Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributed Purpose</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose
	 * @generated
	 */
	EClass getContributedPurpose();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose#getMappings()
	 * @see #getContributedPurpose()
	 * @generated
	 */
	EReference getContributedPurpose_Mappings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContributionFactory getContributionFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributedPurposeImpl <em>Contributed Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributedPurposeImpl
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributionPackageImpl#getContributedPurpose()
		 * @generated
		 */
		EClass CONTRIBUTED_PURPOSE = eINSTANCE.getContributedPurpose();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTED_PURPOSE__MAPPINGS = eINSTANCE.getContributedPurpose_Mappings();

	}

} //ContributionPackage
