/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocGenConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface DocGenConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "docGenConfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/DocGenConfiguration/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "docGenConfiguration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocGenConfigurationPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl.DocGenConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl.DocumentationGenerationConfigurationImpl <em>Documentation Generation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl.DocumentationGenerationConfigurationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl.DocGenConfigurationPackageImpl#getDocumentationGenerationConfiguration()
	 * @generated
	 */
	int DOCUMENTATION_GENERATION_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Ecore To Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_GENERATION_CONFIGURATION__ECORE_TO_HTML = VpconfPackage.EXTENSION_GENERATRION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Documentation Generation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_GENERATION_CONFIGURATION_FEATURE_COUNT = VpconfPackage.EXTENSION_GENERATRION_CONFIGURATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration <em>Documentation Generation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Generation Configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration
	 * @generated
	 */
	EClass getDocumentationGenerationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration#isEcoreToHtml <em>Ecore To Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore To Html</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration#isEcoreToHtml()
	 * @see #getDocumentationGenerationConfiguration()
	 * @generated
	 */
	EAttribute getDocumentationGenerationConfiguration_EcoreToHtml();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocGenConfigurationFactory getDocGenConfigurationFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl.DocumentationGenerationConfigurationImpl <em>Documentation Generation Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl.DocumentationGenerationConfigurationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl.DocGenConfigurationPackageImpl#getDocumentationGenerationConfiguration()
		 * @generated
		 */
		EClass DOCUMENTATION_GENERATION_CONFIGURATION = eINSTANCE.getDocumentationGenerationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Ecore To Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION_GENERATION_CONFIGURATION__ECORE_TO_HTML = eINSTANCE.getDocumentationGenerationConfiguration_EcoreToHtml();

	}

} //DocGenConfigurationPackage
