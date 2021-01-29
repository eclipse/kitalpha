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

package org.polarsys.kitalpha.report.example.customization.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.polarsys.kitalpha.report.model.ReportElementPackage;

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
 * @see org.polarsys.kitalpha.report.example.customization.model.CustomizationFactory
 * @model kind="package"
 * @generated
 */
public interface CustomizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "customization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/report/customization/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "customization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomizationPackage eINSTANCE = org.polarsys.kitalpha.report.example.customization.model.impl.CustomizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.report.example.customization.model.impl.CustomEntryImpl <em>Custom Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.report.example.customization.model.impl.CustomEntryImpl
	 * @see org.polarsys.kitalpha.report.example.customization.model.impl.CustomizationPackageImpl#getCustomEntry()
	 * @generated
	 */
	int CUSTOM_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY__MESSAGE = ReportElementPackage.LOG_ENTRY__MESSAGE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY__DATE = ReportElementPackage.LOG_ENTRY__DATE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY__SEVERITY = ReportElementPackage.LOG_ENTRY__SEVERITY;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY__DETAILS = ReportElementPackage.LOG_ENTRY__DETAILS;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY__REFERENCED_OBJECT = ReportElementPackage.LOG_ENTRY__REFERENCED_OBJECT;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY__COMMENT = ReportElementPackage.LOG_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY_FEATURE_COUNT = ReportElementPackage.LOG_ENTRY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.report.example.customization.model.CustomEntry <em>Custom Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Entry</em>'.
	 * @see org.polarsys.kitalpha.report.example.customization.model.CustomEntry
	 * @generated
	 */
	EClass getCustomEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.report.example.customization.model.CustomEntry#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.polarsys.kitalpha.report.example.customization.model.CustomEntry#getComment()
	 * @see #getCustomEntry()
	 * @generated
	 */
	EAttribute getCustomEntry_Comment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomizationFactory getCustomizationFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.report.example.customization.model.impl.CustomEntryImpl <em>Custom Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.report.example.customization.model.impl.CustomEntryImpl
		 * @see org.polarsys.kitalpha.report.example.customization.model.impl.CustomizationPackageImpl#getCustomEntry()
		 * @generated
		 */
		EClass CUSTOM_ENTRY = eINSTANCE.getCustomEntry();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ENTRY__COMMENT = eINSTANCE.getCustomEntry_Comment();

	}

} //CustomizationPackage
