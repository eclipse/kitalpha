/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocGenConfigurationFactory
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
	String eNAME = "DocGenConfiguration";

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
	String eNS_PREFIX = "DocGenConfiguration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocGenConfigurationPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl.DocGenConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl.DocumentationGenerationConfigurationImpl <em>Documentation Generation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl.DocumentationGenerationConfigurationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl.DocGenConfigurationPackageImpl#getDocumentationGenerationConfiguration()
	 * @generated
	 */
	int DOCUMENTATION_GENERATION_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Generate Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_GENERATION_CONFIGURATION__GENERATE_DOCUMENTATION = VpconfPackage.EXTENSION_GENERATRION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Documentation Generation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_GENERATION_CONFIGURATION_FEATURE_COUNT = VpconfPackage.EXTENSION_GENERATRION_CONFIGURATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocumentationGenerationConfiguration <em>Documentation Generation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Generation Configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocumentationGenerationConfiguration
	 * @generated
	 */
	EClass getDocumentationGenerationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocumentationGenerationConfiguration#isGenerateDocumentation <em>Generate Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Documentation</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocumentationGenerationConfiguration#isGenerateDocumentation()
	 * @see #getDocumentationGenerationConfiguration()
	 * @generated
	 */
	EAttribute getDocumentationGenerationConfiguration_GenerateDocumentation();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl.DocumentationGenerationConfigurationImpl <em>Documentation Generation Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl.DocumentationGenerationConfigurationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl.DocGenConfigurationPackageImpl#getDocumentationGenerationConfiguration()
		 * @generated
		 */
		EClass DOCUMENTATION_GENERATION_CONFIGURATION = eINSTANCE.getDocumentationGenerationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Generate Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION_GENERATION_CONFIGURATION__GENERATE_DOCUMENTATION = eINSTANCE.getDocumentationGenerationConfiguration_GenerateDocumentation();

	}

} //DocGenConfigurationPackage
