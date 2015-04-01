/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/extension extensibleProviderFactory='true' childCreationExtenders='true' useUUIDs='true' useIDAttributes='false'"
 * @generated
 */
public interface VpbuildPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vpbuild"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpbuild/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpbuild"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpbuildPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.BuildImpl <em>Build</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.BuildImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getBuild()
	 * @generated
	 */
	int BUILD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__ID = VpdescPackage.ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__NAME = VpdescPackage.ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__DESCRIPTION = VpdescPackage.ASPECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__TARGET_PLATFORM = VpdescPackage.ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapped repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__MAPPED_REPOSITORIES = VpdescPackage.ASPECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hudson Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__HUDSON_DEPLOYMENT = VpdescPackage.ASPECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_FEATURE_COUNT = VpdescPackage.ASPECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.RepositoryImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FEATURES = 2;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FOLDERS = 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.FeatureImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.SourceFolderImpl <em>Source Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.SourceFolderImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getSourceFolder()
	 * @generated
	 */
	int SOURCE_FOLDER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FOLDER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Source Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FOLDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl <em>Hudson Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getHudsonDeployment()
	 * @generated
	 */
	int HUDSON_DEPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Ant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__ANT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Assigned Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__ASSIGNED_NODE = 1;

	/**
	 * The feature id for the '<em><b>Build id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__BUILD_ID = 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__ENABLED = 3;

	/**
	 * The feature id for the '<em><b>Jdk Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__JDK_NAME = 4;

	/**
	 * The feature id for the '<em><b>User Deploy Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME = 5;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__USERS = 6;

	/**
	 * The feature id for the '<em><b>User Deploy Server Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL = 7;

	/**
	 * The feature id for the '<em><b>Generation Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__GENERATION_LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT__TRIGGERS = 9;

	/**
	 * The number of structural features of the '<em>Hudson Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUDSON_DEPLOYMENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.UserImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGIN = 0;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PERMISSION = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.GenerationLocationImpl <em>Generation Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.GenerationLocationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getGenerationLocation()
	 * @generated
	 */
	int GENERATION_LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_LOCATION__FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_LOCATION__URL = 1;

	/**
	 * The number of structural features of the '<em>Generation Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.TriggerImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Planning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PLANNING = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.CronImpl <em>Cron</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.CronImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getCron()
	 * @generated
	 */
	int CRON = 8;

	/**
	 * The feature id for the '<em><b>Planning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON__PLANNING = TRIGGER__PLANNING;

	/**
	 * The number of structural features of the '<em>Cron</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.SCMImpl <em>SCM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.SCMImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getSCM()
	 * @generated
	 */
	int SCM = 9;

	/**
	 * The feature id for the '<em><b>Planning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM__PLANNING = TRIGGER__PLANNING;

	/**
	 * The number of structural features of the '<em>SCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.ProtocolType <em>Protocol Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.ProtocolType
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission <em>User Permission</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getUserPermission()
	 * @generated
	 */
	int USER_PERMISSION = 11;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build
	 * @generated
	 */
	EClass getBuild();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getTarget_platform <em>Target platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target platform</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getTarget_platform()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Target_platform();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getMapped_repositories <em>Mapped repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped repositories</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getMapped_repositories()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Mapped_repositories();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getHudsonDeployment <em>Hudson Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hudson Deployment</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getHudsonDeployment()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_HudsonDeployment();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository#getProtocol()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository#getLocation()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository#getFeatures()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository#getFolders()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Folders();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SourceFolder <em>Source Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Folder</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SourceFolder
	 * @generated
	 */
	EClass getSourceFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SourceFolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SourceFolder#getName()
	 * @see #getSourceFolder()
	 * @generated
	 */
	EAttribute getSourceFolder_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment <em>Hudson Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hudson Deployment</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment
	 * @generated
	 */
	EClass getHudsonDeployment();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getAntName <em>Ant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ant Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getAntName()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EAttribute getHudsonDeployment_AntName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getAssignedNode <em>Assigned Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Node</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getAssignedNode()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EAttribute getHudsonDeployment_AssignedNode();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getBuild_id <em>Build id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build id</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getBuild_id()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EAttribute getHudsonDeployment_Build_id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#isEnabled()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EAttribute getHudsonDeployment_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getJdkName <em>Jdk Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdk Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getJdkName()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EAttribute getHudsonDeployment_JdkName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUserDeployJobName <em>User Deploy Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Deploy Job Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUserDeployJobName()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EAttribute getHudsonDeployment_UserDeployJobName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUsers()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EReference getHudsonDeployment_Users();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUserDeployServerUrl <em>User Deploy Server Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Deploy Server Url</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUserDeployServerUrl()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EAttribute getHudsonDeployment_UserDeployServerUrl();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getGenerationLocation <em>Generation Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generation Location</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getGenerationLocation()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EReference getHudsonDeployment_GenerationLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getTriggers()
	 * @see #getHudsonDeployment()
	 * @generated
	 */
	EReference getHudsonDeployment_Triggers();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User#getLogin()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Login();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User#getPermission()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Permission();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation <em>Generation Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Location</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation
	 * @generated
	 */
	EClass getGenerationLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation#getFolder()
	 * @see #getGenerationLocation()
	 * @generated
	 */
	EAttribute getGenerationLocation_Folder();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation#getUrl()
	 * @see #getGenerationLocation()
	 * @generated
	 */
	EAttribute getGenerationLocation_Url();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger#getPlanning <em>Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planning</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger#getPlanning()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Planning();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Cron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cron</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Cron
	 * @generated
	 */
	EClass getCron();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SCM <em>SCM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCM</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SCM
	 * @generated
	 */
	EClass getSCM();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.ProtocolType
	 * @generated
	 */
	EEnum getProtocolType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission <em>User Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Permission</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission
	 * @generated
	 */
	EEnum getUserPermission();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VpbuildFactory getVpbuildFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.BuildImpl <em>Build</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.BuildImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getBuild()
		 * @generated
		 */
		EClass BUILD = eINSTANCE.getBuild();

		/**
		 * The meta object literal for the '<em><b>Target platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__TARGET_PLATFORM = eINSTANCE
				.getBuild_Target_platform();

		/**
		 * The meta object literal for the '<em><b>Mapped repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__MAPPED_REPOSITORIES = eINSTANCE
				.getBuild_Mapped_repositories();

		/**
		 * The meta object literal for the '<em><b>Hudson Deployment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__HUDSON_DEPLOYMENT = eINSTANCE
				.getBuild_HudsonDeployment();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.RepositoryImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__PROTOCOL = eINSTANCE.getRepository_Protocol();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__LOCATION = eINSTANCE.getRepository_Location();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__FEATURES = eINSTANCE.getRepository_Features();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__FOLDERS = eINSTANCE.getRepository_Folders();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.FeatureImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.SourceFolderImpl <em>Source Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.SourceFolderImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getSourceFolder()
		 * @generated
		 */
		EClass SOURCE_FOLDER = eINSTANCE.getSourceFolder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FOLDER__NAME = eINSTANCE.getSourceFolder_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl <em>Hudson Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getHudsonDeployment()
		 * @generated
		 */
		EClass HUDSON_DEPLOYMENT = eINSTANCE.getHudsonDeployment();

		/**
		 * The meta object literal for the '<em><b>Ant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUDSON_DEPLOYMENT__ANT_NAME = eINSTANCE
				.getHudsonDeployment_AntName();

		/**
		 * The meta object literal for the '<em><b>Assigned Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUDSON_DEPLOYMENT__ASSIGNED_NODE = eINSTANCE
				.getHudsonDeployment_AssignedNode();

		/**
		 * The meta object literal for the '<em><b>Build id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUDSON_DEPLOYMENT__BUILD_ID = eINSTANCE
				.getHudsonDeployment_Build_id();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUDSON_DEPLOYMENT__ENABLED = eINSTANCE
				.getHudsonDeployment_Enabled();

		/**
		 * The meta object literal for the '<em><b>Jdk Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUDSON_DEPLOYMENT__JDK_NAME = eINSTANCE
				.getHudsonDeployment_JdkName();

		/**
		 * The meta object literal for the '<em><b>User Deploy Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME = eINSTANCE
				.getHudsonDeployment_UserDeployJobName();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUDSON_DEPLOYMENT__USERS = eINSTANCE
				.getHudsonDeployment_Users();

		/**
		 * The meta object literal for the '<em><b>User Deploy Server Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL = eINSTANCE
				.getHudsonDeployment_UserDeployServerUrl();

		/**
		 * The meta object literal for the '<em><b>Generation Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUDSON_DEPLOYMENT__GENERATION_LOCATION = eINSTANCE
				.getHudsonDeployment_GenerationLocation();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUDSON_DEPLOYMENT__TRIGGERS = eINSTANCE
				.getHudsonDeployment_Triggers();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.UserImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LOGIN = eINSTANCE.getUser_Login();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PERMISSION = eINSTANCE.getUser_Permission();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.GenerationLocationImpl <em>Generation Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.GenerationLocationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getGenerationLocation()
		 * @generated
		 */
		EClass GENERATION_LOCATION = eINSTANCE.getGenerationLocation();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_LOCATION__FOLDER = eINSTANCE
				.getGenerationLocation_Folder();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_LOCATION__URL = eINSTANCE
				.getGenerationLocation_Url();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.TriggerImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Planning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__PLANNING = eINSTANCE.getTrigger_Planning();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.CronImpl <em>Cron</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.CronImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getCron()
		 * @generated
		 */
		EClass CRON = eINSTANCE.getCron();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.SCMImpl <em>SCM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.SCMImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getSCM()
		 * @generated
		 */
		EClass SCM = eINSTANCE.getSCM();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.ProtocolType <em>Protocol Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.ProtocolType
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getProtocolType()
		 * @generated
		 */
		EEnum PROTOCOL_TYPE = eINSTANCE.getProtocolType();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission <em>User Permission</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.VpbuildPackageImpl#getUserPermission()
		 * @generated
		 */
		EEnum USER_PERMISSION = eINSTANCE.getUserPermission();

	}

} //VpbuildPackage
