/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.DescAirdGenConfFactory
 * @model kind="package"
 * @generated
 */
public interface DescAirdGenConfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "descAirdGenConf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/DescAirdGenConf/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "descAirdGenConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DescAirdGenConfPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl.DescAirdGenConfPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl.AirdGenerationConfigurationImpl <em>Aird Generation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl.AirdGenerationConfigurationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl.DescAirdGenConfPackageImpl#getAirdGenerationConfiguration()
	 * @generated
	 */
	int AIRD_GENERATION_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Gen Representations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRD_GENERATION_CONFIGURATION__GEN_REPRESENTATIONS = VpconfPackage.EXTENSION_GENERATRION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aird Generation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRD_GENERATION_CONFIGURATION_FEATURE_COUNT = VpconfPackage.EXTENSION_GENERATRION_CONFIGURATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.AirdGenerationConfiguration <em>Aird Generation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aird Generation Configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.AirdGenerationConfiguration
	 * @generated
	 */
	EClass getAirdGenerationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.AirdGenerationConfiguration#isGenRepresentations <em>Gen Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Representations</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.AirdGenerationConfiguration#isGenRepresentations()
	 * @see #getAirdGenerationConfiguration()
	 * @generated
	 */
	EAttribute getAirdGenerationConfiguration_GenRepresentations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DescAirdGenConfFactory getDescAirdGenConfFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl.AirdGenerationConfigurationImpl <em>Aird Generation Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl.AirdGenerationConfigurationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl.DescAirdGenConfPackageImpl#getAirdGenerationConfiguration()
		 * @generated
		 */
		EClass AIRD_GENERATION_CONFIGURATION = eINSTANCE.getAirdGenerationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Gen Representations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRD_GENERATION_CONFIGURATION__GEN_REPRESENTATIONS = eINSTANCE.getAirdGenerationConfiguration_GenRepresentations();

	}

} //DescAirdGenConfPackage
