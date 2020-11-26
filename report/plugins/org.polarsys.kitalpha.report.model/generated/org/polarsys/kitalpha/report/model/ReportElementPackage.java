/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.model;

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
 * @see org.polarsys.kitalpha.report.model.ReportElementFactory
 * @model kind="package"
 * @generated
 */
public interface ReportElementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "report";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/report/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "report";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportElementPackage eINSTANCE = org.polarsys.kitalpha.report.model.impl.ReportElementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.report.model.impl.LogEntryImpl <em>Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.report.model.impl.LogEntryImpl
	 * @see org.polarsys.kitalpha.report.model.impl.ReportElementPackageImpl#getLogEntry()
	 * @generated
	 */
	int LOG_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__DATE = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__DETAILS = 3;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__REFERENCED_OBJECT = 4;

	/**
	 * The number of structural features of the '<em>Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.report.model.impl.SeverityImpl <em>Severity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.report.model.impl.SeverityImpl
	 * @see org.polarsys.kitalpha.report.model.impl.ReportElementPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Severity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.report.model.impl.ReportListImpl <em>Report List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.report.model.impl.ReportListImpl
	 * @see org.polarsys.kitalpha.report.model.impl.ReportElementPackageImpl#getReportList()
	 * @generated
	 */
	int REPORT_LIST = 2;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_LIST__REPORTS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_LIST__ID = 1;

	/**
	 * The number of structural features of the '<em>Report List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_LIST_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.report.model.LogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Entry</em>'.
	 * @see org.polarsys.kitalpha.report.model.LogEntry
	 * @generated
	 */
	EClass getLogEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.report.model.LogEntry#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.polarsys.kitalpha.report.model.LogEntry#getMessage()
	 * @see #getLogEntry()
	 * @generated
	 */
	EAttribute getLogEntry_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.report.model.LogEntry#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.polarsys.kitalpha.report.model.LogEntry#getDate()
	 * @see #getLogEntry()
	 * @generated
	 */
	EAttribute getLogEntry_Date();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.report.model.LogEntry#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Severity</em>'.
	 * @see org.polarsys.kitalpha.report.model.LogEntry#getSeverity()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_Severity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.report.model.LogEntry#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details</em>'.
	 * @see org.polarsys.kitalpha.report.model.LogEntry#getDetails()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_Details();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.report.model.LogEntry#getReferencedObject <em>Referenced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Object</em>'.
	 * @see org.polarsys.kitalpha.report.model.LogEntry#getReferencedObject()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_ReferencedObject();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.report.model.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity</em>'.
	 * @see org.polarsys.kitalpha.report.model.Severity
	 * @generated
	 */
	EClass getSeverity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.report.model.Severity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.polarsys.kitalpha.report.model.Severity#getCode()
	 * @see #getSeverity()
	 * @generated
	 */
	EAttribute getSeverity_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.report.model.Severity#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.polarsys.kitalpha.report.model.Severity#getLabel()
	 * @see #getSeverity()
	 * @generated
	 */
	EAttribute getSeverity_Label();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.report.model.ReportList <em>Report List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report List</em>'.
	 * @see org.polarsys.kitalpha.report.model.ReportList
	 * @generated
	 */
	EClass getReportList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.report.model.ReportList#getReports <em>Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reports</em>'.
	 * @see org.polarsys.kitalpha.report.model.ReportList#getReports()
	 * @see #getReportList()
	 * @generated
	 */
	EReference getReportList_Reports();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.report.model.ReportList#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.kitalpha.report.model.ReportList#getId()
	 * @see #getReportList()
	 * @generated
	 */
	EAttribute getReportList_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReportElementFactory getReportElementFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.report.model.impl.LogEntryImpl <em>Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.report.model.impl.LogEntryImpl
		 * @see org.polarsys.kitalpha.report.model.impl.ReportElementPackageImpl#getLogEntry()
		 * @generated
		 */
		EClass LOG_ENTRY = eINSTANCE.getLogEntry();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ENTRY__MESSAGE = eINSTANCE.getLogEntry_Message();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ENTRY__DATE = eINSTANCE.getLogEntry_Date();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__SEVERITY = eINSTANCE.getLogEntry_Severity();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__DETAILS = eINSTANCE.getLogEntry_Details();

		/**
		 * The meta object literal for the '<em><b>Referenced Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__REFERENCED_OBJECT = eINSTANCE.getLogEntry_ReferencedObject();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.report.model.impl.SeverityImpl <em>Severity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.report.model.impl.SeverityImpl
		 * @see org.polarsys.kitalpha.report.model.impl.ReportElementPackageImpl#getSeverity()
		 * @generated
		 */
		EClass SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEVERITY__CODE = eINSTANCE.getSeverity_Code();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEVERITY__LABEL = eINSTANCE.getSeverity_Label();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.report.model.impl.ReportListImpl <em>Report List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.report.model.impl.ReportListImpl
		 * @see org.polarsys.kitalpha.report.model.impl.ReportElementPackageImpl#getReportList()
		 * @generated
		 */
		EClass REPORT_LIST = eINSTANCE.getReportList();

		/**
		 * The meta object literal for the '<em><b>Reports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_LIST__REPORTS = eINSTANCE.getReportList_Reports();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_LIST__ID = eINSTANCE.getReportList_Id();

	}

} //ReportsPackage
