/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfFactory
 * @model kind="package"
 * @generated
 */
public interface VpconfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vpconf"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpconf/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpconf"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpconfPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ConfigurationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = VpdescPackage.ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = VpdescPackage.ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DESCRIPTION = VpdescPackage.ASPECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Vp Configuration Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VP_CONFIGURATION_ELEMENTS = VpdescPackage.ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = VpdescPackage.ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ConfigurationElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getConfigurationElement()
	 * @generated
	 */
	int CONFIGURATION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT__ID = VpdescPackage.VIEWPOINT_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Configuration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_FEATURE_COUNT = VpdescPackage.VIEWPOINT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.TargetApplicationImpl <em>Target Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.TargetApplicationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getTargetApplication()
	 * @generated
	 */
	int TARGET_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_APPLICATION__ID = CONFIGURATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_APPLICATION__TYPE = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_APPLICATION_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationConfigurationImpl <em>Generation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationConfigurationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getGenerationConfiguration()
	 * @generated
	 */
	int GENERATION_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__ID = CONFIGURATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__PROJECT_NAME = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nsuri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__NSURI = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationImpl <em>Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getGeneration()
	 * @generated
	 */
	int GENERATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__ID = CONFIGURATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owned Data Generation Conf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__OWNED_DATA_GENERATION_CONF = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Extension Gen Conf</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__OWNED_EXTENSION_GEN_CONF = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl <em>GData</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getGData()
	 * @generated
	 */
	int GDATA = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDATA__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDATA__EDIT = 1;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDATA__EDITOR = 2;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDATA__TEST = 3;

	/**
	 * The feature id for the '<em><b>Java Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDATA__JAVA_DOC = 4;

	/**
	 * The feature id for the '<em><b>Overwrite Ecore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDATA__OVERWRITE_ECORE = 5;

	/**
	 * The number of structural features of the '<em>GData</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDATA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ExtensionGeneratrionConfigurationImpl <em>Extension Generatrion Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ExtensionGeneratrionConfigurationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getExtensionGeneratrionConfiguration()
	 * @generated
	 */
	int EXTENSION_GENERATRION_CONFIGURATION = 6;

	/**
	 * The number of structural features of the '<em>Extension Generatrion Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_GENERATRION_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ReleaseImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ID = CONFIGURATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Viewpoint Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__VIEWPOINT_VERSION = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Viewpoint Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__VIEWPOINT_DESCRIPTION = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Execution Environment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__REQUIRED_EXECUTION_ENVIRONMENT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ViewConfigurationImpl <em>View Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ViewConfigurationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getViewConfiguration()
	 * @generated
	 */
	int VIEW_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__ID = CONFIGURATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__VISIBLE = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION__ACTIVABLE = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Version
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 9;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration#getVpConfigurationElements <em>Vp Configuration Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vp Configuration Elements</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration#getVpConfigurationElements()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_VpConfigurationElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement <em>Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement
	 * @generated
	 */
	EClass getConfigurationElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication <em>Target Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Application</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication
	 * @generated
	 */
	EClass getTargetApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication#getType()
	 * @see #getTargetApplication()
	 * @generated
	 */
	EAttribute getTargetApplication_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration <em>Generation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration
	 * @generated
	 */
	EClass getGenerationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration#getProjectName()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration#getNsuri <em>Nsuri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nsuri</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration#getNsuri()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_Nsuri();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation
	 * @generated
	 */
	EClass getGeneration();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation#getOwnedDataGenerationConf <em>Owned Data Generation Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Data Generation Conf</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation#getOwnedDataGenerationConf()
	 * @see #getGeneration()
	 * @generated
	 */
	EReference getGeneration_OwnedDataGenerationConf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation#getOwnedExtensionGenConf <em>Owned Extension Gen Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Extension Gen Conf</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation#getOwnedExtensionGenConf()
	 * @see #getGeneration()
	 * @generated
	 */
	EReference getGeneration_OwnedExtensionGenConf();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData <em>GData</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GData</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData
	 * @generated
	 */
	EClass getGData();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isModel()
	 * @see #getGData()
	 * @generated
	 */
	EAttribute getGData_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isEdit <em>Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isEdit()
	 * @see #getGData()
	 * @generated
	 */
	EAttribute getGData_Edit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isEditor()
	 * @see #getGData()
	 * @generated
	 */
	EAttribute getGData_Editor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isTest()
	 * @see #getGData()
	 * @generated
	 */
	EAttribute getGData_Test();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isJavaDoc <em>Java Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Doc</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isJavaDoc()
	 * @see #getGData()
	 * @generated
	 */
	EAttribute getGData_JavaDoc();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isOverwriteEcore <em>Overwrite Ecore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overwrite Ecore</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData#isOverwriteEcore()
	 * @see #getGData()
	 * @generated
	 */
	EAttribute getGData_OverwriteEcore();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration <em>Extension Generatrion Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Generatrion Configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration
	 * @generated
	 */
	EClass getExtensionGeneratrionConfiguration();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getViewpointVersion <em>Viewpoint Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint Version</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getViewpointVersion()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_ViewpointVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getViewpointDescription <em>Viewpoint Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getViewpointDescription()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_ViewpointDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getRequiredExecutionEnvironment <em>Required Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Execution Environment</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getRequiredExecutionEnvironment()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_RequiredExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration <em>View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration
	 * @generated
	 */
	EClass getViewConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration#isVisible()
	 * @see #getViewConfiguration()
	 * @generated
	 */
	EAttribute getViewConfiguration_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration#isActivable <em>Activable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activable</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration#isActivable()
	 * @see #getViewConfiguration()
	 * @generated
	 */
	EAttribute getViewConfiguration_Activable();

	/**
	 * Returns the meta object for data type '{@link org.osgi.framework.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see org.osgi.framework.Version
	 * @model instanceClass="org.osgi.framework.Version"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VpconfFactory getVpconfFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ConfigurationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Vp Configuration Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__VP_CONFIGURATION_ELEMENTS = eINSTANCE.getConfiguration_VpConfigurationElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ConfigurationElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getConfigurationElement()
		 * @generated
		 */
		EClass CONFIGURATION_ELEMENT = eINSTANCE.getConfigurationElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.TargetApplicationImpl <em>Target Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.TargetApplicationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getTargetApplication()
		 * @generated
		 */
		EClass TARGET_APPLICATION = eINSTANCE.getTargetApplication();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_APPLICATION__TYPE = eINSTANCE.getTargetApplication_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationConfigurationImpl <em>Generation Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationConfigurationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getGenerationConfiguration()
		 * @generated
		 */
		EClass GENERATION_CONFIGURATION = eINSTANCE.getGenerationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__PROJECT_NAME = eINSTANCE.getGenerationConfiguration_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Nsuri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__NSURI = eINSTANCE.getGenerationConfiguration_Nsuri();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationImpl <em>Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getGeneration()
		 * @generated
		 */
		EClass GENERATION = eINSTANCE.getGeneration();

		/**
		 * The meta object literal for the '<em><b>Owned Data Generation Conf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION__OWNED_DATA_GENERATION_CONF = eINSTANCE.getGeneration_OwnedDataGenerationConf();

		/**
		 * The meta object literal for the '<em><b>Owned Extension Gen Conf</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION__OWNED_EXTENSION_GEN_CONF = eINSTANCE.getGeneration_OwnedExtensionGenConf();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl <em>GData</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getGData()
		 * @generated
		 */
		EClass GDATA = eINSTANCE.getGData();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDATA__MODEL = eINSTANCE.getGData_Model();

		/**
		 * The meta object literal for the '<em><b>Edit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDATA__EDIT = eINSTANCE.getGData_Edit();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDATA__EDITOR = eINSTANCE.getGData_Editor();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDATA__TEST = eINSTANCE.getGData_Test();

		/**
		 * The meta object literal for the '<em><b>Java Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDATA__JAVA_DOC = eINSTANCE.getGData_JavaDoc();

		/**
		 * The meta object literal for the '<em><b>Overwrite Ecore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDATA__OVERWRITE_ECORE = eINSTANCE.getGData_OverwriteEcore();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ExtensionGeneratrionConfigurationImpl <em>Extension Generatrion Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ExtensionGeneratrionConfigurationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getExtensionGeneratrionConfiguration()
		 * @generated
		 */
		EClass EXTENSION_GENERATRION_CONFIGURATION = eINSTANCE.getExtensionGeneratrionConfiguration();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ReleaseImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Viewpoint Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__VIEWPOINT_VERSION = eINSTANCE.getRelease_ViewpointVersion();

		/**
		 * The meta object literal for the '<em><b>Viewpoint Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__VIEWPOINT_DESCRIPTION = eINSTANCE.getRelease_ViewpointDescription();

		/**
		 * The meta object literal for the '<em><b>Required Execution Environment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__REQUIRED_EXECUTION_ENVIRONMENT = eINSTANCE.getRelease_RequiredExecutionEnvironment();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ViewConfigurationImpl <em>View Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ViewConfigurationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getViewConfiguration()
		 * @generated
		 */
		EClass VIEW_CONFIGURATION = eINSTANCE.getViewConfiguration();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONFIGURATION__VISIBLE = eINSTANCE.getViewConfiguration_Visible();

		/**
		 * The meta object literal for the '<em><b>Activable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONFIGURATION__ACTIVABLE = eINSTANCE.getViewConfiguration_Activable();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Version
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

	}

} //VpconfPackage
