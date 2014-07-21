/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.transformation.emf.traces;

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
 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.TracesFactory
 * @model kind="package"
 * @generated
 */
public interface TracesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traces"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/transposer/transformation/emf/traces"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traces"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracesPackage eINSTANCE = org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TracesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TraceImpl
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TracesPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TraceRepositoryImpl <em>Trace Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TraceRepositoryImpl
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TracesPackageImpl#getTraceRepository()
	 * @generated
	 */
	int TRACE_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_REPOSITORY__TRACES = 0;

	/**
	 * The number of structural features of the '<em>Trace Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_REPOSITORY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getRole()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Role();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getSource()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Source();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace#getTarget()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Target();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.TraceRepository <em>Trace Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Repository</em>'.
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.TraceRepository
	 * @generated
	 */
	EClass getTraceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.TraceRepository#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.TraceRepository#getTraces()
	 * @see #getTraceRepository()
	 * @generated
	 */
	EReference getTraceRepository_Traces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracesFactory getTracesFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TraceImpl
		 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TracesPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__ROLE = eINSTANCE.getTrace_Role();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SOURCE = eINSTANCE.getTrace_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TARGET = eINSTANCE.getTrace_Target();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TraceRepositoryImpl <em>Trace Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TraceRepositoryImpl
		 * @see org.polarsys.kitalpha.transposer.transformation.emf.traces.impl.TracesPackageImpl#getTraceRepository()
		 * @generated
		 */
		EClass TRACE_REPOSITORY = eINSTANCE.getTraceRepository();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_REPOSITORY__TRACES = eINSTANCE.getTraceRepository_Traces();

	}

} //TracesPackage
