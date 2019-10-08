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
package org.polarsys.kitalpha.emde.genchain.extension.model;

import org.eclipse.egf.portfolio.genchain.cdo.cdoExtension.CdoExtensionPackage;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.polarsys.kitalpha.emde.genchain.extension.model.ExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/emde/genchain/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genchainExtension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionPackage eINSTANCE = org.polarsys.kitalpha.emde.genchain.extension.model.impl.ExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.genchain.extension.model.impl.EmdeGenerationImpl <em>Emde Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.genchain.extension.model.impl.EmdeGenerationImpl
	 * @see org.polarsys.kitalpha.emde.genchain.extension.model.impl.ExtensionPackageImpl#getEmdeGeneration()
	 * @generated
	 */
	int EMDE_GENERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__NAME = GenerationChainPackage.EMF_GENERATION__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__CONTAINER = GenerationChainPackage.EMF_GENERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__MODEL_PATH = GenerationChainPackage.EMF_GENERATION__MODEL_PATH;

	/**
	 * The feature id for the '<em><b>Generate Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__GENERATE_MODEL = GenerationChainPackage.EMF_GENERATION__GENERATE_MODEL;

	/**
	 * The feature id for the '<em><b>Generate Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__GENERATE_EDIT = GenerationChainPackage.EMF_GENERATION__GENERATE_EDIT;

	/**
	 * The feature id for the '<em><b>Generate Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__GENERATE_EDITOR = GenerationChainPackage.EMF_GENERATION__GENERATE_EDITOR;

	/**
	 * The feature id for the '<em><b>Generate Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__GENERATE_TEST = GenerationChainPackage.EMF_GENERATION__GENERATE_TEST;

	/**
	 * The feature id for the '<em><b>Generate Javadoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__GENERATE_JAVADOC = GenerationChainPackage.EMF_GENERATION__GENERATE_JAVADOC;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__PLUGIN_NAME = GenerationChainPackage.EMF_GENERATION__PLUGIN_NAME;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION__BASE_PACKAGE = GenerationChainPackage.EMF_GENERATION__BASE_PACKAGE;

	/**
	 * The number of structural features of the '<em>Emde Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_GENERATION_FEATURE_COUNT = GenerationChainPackage.EMF_GENERATION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.genchain.extension.model.impl.EmdeCdoGenerationImpl <em>Emde Cdo Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.genchain.extension.model.impl.EmdeCdoGenerationImpl
	 * @see org.polarsys.kitalpha.emde.genchain.extension.model.impl.ExtensionPackageImpl#getEmdeCdoGeneration()
	 * @generated
	 */
	int EMDE_CDO_GENERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_CDO_GENERATION__NAME = CdoExtensionPackage.CDO_GENERATION__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_CDO_GENERATION__CONTAINER = CdoExtensionPackage.CDO_GENERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_CDO_GENERATION__MODEL_PATH = CdoExtensionPackage.CDO_GENERATION__MODEL_PATH;

	/**
	 * The feature id for the '<em><b>Cdo Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_CDO_GENERATION__CDO_SUFFIX = CdoExtensionPackage.CDO_GENERATION__CDO_SUFFIX;

	/**
	 * The feature id for the '<em><b>Feature Delegation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_CDO_GENERATION__FEATURE_DELEGATION = CdoExtensionPackage.CDO_GENERATION__FEATURE_DELEGATION;

	/**
	 * The number of structural features of the '<em>Emde Cdo Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMDE_CDO_GENERATION_FEATURE_COUNT = CdoExtensionPackage.CDO_GENERATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.genchain.extension.model.EmdeGeneration <em>Emde Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emde Generation</em>'.
	 * @see org.polarsys.kitalpha.emde.genchain.extension.model.EmdeGeneration
	 * @generated
	 */
	EClass getEmdeGeneration();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.genchain.extension.model.EmdeCdoGeneration <em>Emde Cdo Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emde Cdo Generation</em>'.
	 * @see org.polarsys.kitalpha.emde.genchain.extension.model.EmdeCdoGeneration
	 * @generated
	 */
	EClass getEmdeCdoGeneration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionFactory getExtensionFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.genchain.extension.model.impl.EmdeGenerationImpl <em>Emde Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.genchain.extension.model.impl.EmdeGenerationImpl
		 * @see org.polarsys.kitalpha.emde.genchain.extension.model.impl.ExtensionPackageImpl#getEmdeGeneration()
		 * @generated
		 */
		EClass EMDE_GENERATION = eINSTANCE.getEmdeGeneration();
		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.genchain.extension.model.impl.EmdeCdoGenerationImpl <em>Emde Cdo Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.genchain.extension.model.impl.EmdeCdoGenerationImpl
		 * @see org.polarsys.kitalpha.emde.genchain.extension.model.impl.ExtensionPackageImpl#getEmdeCdoGeneration()
		 * @generated
		 */
		EClass EMDE_CDO_GENERATION = eINSTANCE.getEmdeCdoGeneration();

	}

} //ExtensionPackage
