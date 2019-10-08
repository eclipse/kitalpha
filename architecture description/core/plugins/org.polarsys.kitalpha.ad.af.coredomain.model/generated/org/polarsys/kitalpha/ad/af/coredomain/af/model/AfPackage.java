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

package org.polarsys.kitalpha.ad.af.coredomain.af.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;

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
 * @see org.polarsys.kitalpha.ad.af.coredomain.af.model.AfFactory
 * @model kind="package"
 * @generated
 */
public interface AfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "af";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/af/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "af";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AfPackage eINSTANCE = org.polarsys.kitalpha.ad.af.coredomain.af.model.impl.AfPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.af.coredomain.af.model.impl.AFImpl <em>AF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.af.coredomain.af.model.impl.AFImpl
	 * @see org.polarsys.kitalpha.ad.af.coredomain.af.model.impl.AfPackageImpl#getAF()
	 * @generated
	 */
	int AF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF__NAME = ViewpointPackage.NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF__DESCRIPTION = ViewpointPackage.NAME_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF__ID = ViewpointPackage.NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF__VPID = ViewpointPackage.NAME_ELEMENT__VPID;

	/**
	 * The feature id for the '<em><b>Viewpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF__VIEWPOINTS = ViewpointPackage.NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_FEATURE_COUNT = ViewpointPackage.NAME_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.af.coredomain.af.model.AF <em>AF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AF</em>'.
	 * @see org.polarsys.kitalpha.ad.af.coredomain.af.model.AF
	 * @generated
	 */
	EClass getAF();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.af.coredomain.af.model.AF#getViewpoints <em>Viewpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Viewpoints</em>'.
	 * @see org.polarsys.kitalpha.ad.af.coredomain.af.model.AF#getViewpoints()
	 * @see #getAF()
	 * @generated
	 */
	EReference getAF_Viewpoints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AfFactory getAfFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.af.coredomain.af.model.impl.AFImpl <em>AF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.af.coredomain.af.model.impl.AFImpl
		 * @see org.polarsys.kitalpha.ad.af.coredomain.af.model.impl.AfPackageImpl#getAF()
		 * @generated
		 */
		EClass AF = eINSTANCE.getAF();

		/**
		 * The meta object literal for the '<em><b>Viewpoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AF__VIEWPOINTS = eINSTANCE.getAF_Viewpoints();

	}

} //AfPackage
