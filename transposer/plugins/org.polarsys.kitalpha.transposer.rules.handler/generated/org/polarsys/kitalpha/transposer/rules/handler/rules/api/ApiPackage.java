/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.api;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiFactory
 * @model kind="package"
 * @generated
 */
public interface ApiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "api"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/transposer/rules/api"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "api"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApiPackage eINSTANCE = org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose <em>IPurpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIPurpose()
	 * @generated
	 */
	int IPURPOSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPURPOSE__NAME = 0;

	/**
	 * The number of structural features of the '<em>IPurpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPURPOSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 1;

	/**
	 * The meta object id for the '<em>IPremise</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIPremise()
	 * @generated
	 */
	int IPREMISE = 2;

	/**
	 * The meta object id for the '<em>IRule</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIRule()
	 * @generated
	 */
	int IRULE = 3;

	/**
	 * The meta object id for the '<em>IDomain Helper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIDomainHelper()
	 * @generated
	 */
	int IDOMAIN_HELPER = 4;

	/**
	 * The meta object id for the '<em>IContext</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIContext()
	 * @generated
	 */
	int ICONTEXT = 5;

	/**
	 * The meta object id for the '<em>IStatus</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IStatus
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIStatus()
	 * @generated
	 */
	int ISTATUS = 6;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose <em>IPurpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPurpose</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose
	 * @generated
	 */
	EClass getIPurpose();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose#getName()
	 * @see #getIPurpose()
	 * @generated
	 */
	EAttribute getIPurpose_Name();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>IFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFile</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile"
	 * @generated
	 */
	EDataType getIFile();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise <em>IPremise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IPremise</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise
	 * @model instanceClass="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise"
	 * @generated
	 */
	EDataType getIPremise();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule <em>IRule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IRule</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule
	 * @model instanceClass="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule" typeParameters="T"
	 * @generated
	 */
	EDataType getIRule();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper <em>IDomain Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IDomain Helper</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper
	 * @model instanceClass="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper"
	 * @generated
	 */
	EDataType getIDomainHelper();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext <em>IContext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IContext</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext
	 * @model instanceClass="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext"
	 * @generated
	 */
	EDataType getIContext();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IStatus <em>IStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IStatus</em>'.
	 * @see org.eclipse.core.runtime.IStatus
	 * @model instanceClass="org.eclipse.core.runtime.IStatus"
	 * @generated
	 */
	EDataType getIStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApiFactory getApiFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose <em>IPurpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIPurpose()
		 * @generated
		 */
		EClass IPURPOSE = eINSTANCE.getIPurpose();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPURPOSE__NAME = eINSTANCE.getIPurpose_Name();

		/**
		 * The meta object literal for the '<em>IFile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIFile()
		 * @generated
		 */
		EDataType IFILE = eINSTANCE.getIFile();

		/**
		 * The meta object literal for the '<em>IPremise</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIPremise()
		 * @generated
		 */
		EDataType IPREMISE = eINSTANCE.getIPremise();

		/**
		 * The meta object literal for the '<em>IRule</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIRule()
		 * @generated
		 */
		EDataType IRULE = eINSTANCE.getIRule();

		/**
		 * The meta object literal for the '<em>IDomain Helper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIDomainHelper()
		 * @generated
		 */
		EDataType IDOMAIN_HELPER = eINSTANCE.getIDomainHelper();

		/**
		 * The meta object literal for the '<em>IContext</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIContext()
		 * @generated
		 */
		EDataType ICONTEXT = eINSTANCE.getIContext();

		/**
		 * The meta object literal for the '<em>IStatus</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IStatus
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl.ApiPackageImpl#getIStatus()
		 * @generated
		 */
		EDataType ISTATUS = eINSTANCE.getIStatus();

	}

} //ApiPackage
