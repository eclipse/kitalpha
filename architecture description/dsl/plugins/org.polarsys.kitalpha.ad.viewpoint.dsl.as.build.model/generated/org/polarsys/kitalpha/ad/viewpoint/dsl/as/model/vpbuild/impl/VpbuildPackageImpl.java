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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Cron;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Feature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.ProtocolType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SourceFolder;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpbuildPackageImpl extends EPackageImpl implements VpbuildPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hudsonDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cronEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userPermissionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VpbuildPackageImpl() {
		super(eNS_URI, VpbuildFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VpbuildPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VpbuildPackage init() {
		if (isInited)
			return (VpbuildPackage) EPackage.Registry.INSTANCE.getEPackage(VpbuildPackage.eNS_URI);

		// Obtain or create and register package
		VpbuildPackageImpl theVpbuildPackage = (VpbuildPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof VpbuildPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new VpbuildPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VpdescPackage.eINSTANCE.eClass();
		EmdePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVpbuildPackage.createPackageContents();

		// Initialize created meta-data
		theVpbuildPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVpbuildPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VpbuildPackage.eNS_URI, theVpbuildPackage);
		return theVpbuildPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuild() {
		return buildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuild_Target_platform() {
		return (EAttribute) buildEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuild_Mapped_repositories() {
		return (EReference) buildEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuild_HudsonDeployment() {
		return (EReference) buildEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Protocol() {
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Location() {
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Features() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Folders() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFolder() {
		return sourceFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFolder_Name() {
		return (EAttribute) sourceFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHudsonDeployment() {
		return hudsonDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHudsonDeployment_AntName() {
		return (EAttribute) hudsonDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHudsonDeployment_AssignedNode() {
		return (EAttribute) hudsonDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHudsonDeployment_Build_id() {
		return (EAttribute) hudsonDeploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHudsonDeployment_Enabled() {
		return (EAttribute) hudsonDeploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHudsonDeployment_JdkName() {
		return (EAttribute) hudsonDeploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHudsonDeployment_UserDeployJobName() {
		return (EAttribute) hudsonDeploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHudsonDeployment_Users() {
		return (EReference) hudsonDeploymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHudsonDeployment_UserDeployServerUrl() {
		return (EAttribute) hudsonDeploymentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHudsonDeployment_GenerationLocation() {
		return (EReference) hudsonDeploymentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHudsonDeployment_Triggers() {
		return (EReference) hudsonDeploymentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Login() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Permission() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationLocation() {
		return generationLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationLocation_Folder() {
		return (EAttribute) generationLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationLocation_Url() {
		return (EAttribute) generationLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Planning() {
		return (EAttribute) triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCron() {
		return cronEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSCM() {
		return scmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocolType() {
		return protocolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserPermission() {
		return userPermissionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpbuildFactory getVpbuildFactory() {
		return (VpbuildFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		buildEClass = createEClass(BUILD);
		createEAttribute(buildEClass, BUILD__TARGET_PLATFORM);
		createEReference(buildEClass, BUILD__MAPPED_REPOSITORIES);
		createEReference(buildEClass, BUILD__HUDSON_DEPLOYMENT);

		repositoryEClass = createEClass(REPOSITORY);
		createEAttribute(repositoryEClass, REPOSITORY__PROTOCOL);
		createEAttribute(repositoryEClass, REPOSITORY__LOCATION);
		createEReference(repositoryEClass, REPOSITORY__FEATURES);
		createEReference(repositoryEClass, REPOSITORY__FOLDERS);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);

		sourceFolderEClass = createEClass(SOURCE_FOLDER);
		createEAttribute(sourceFolderEClass, SOURCE_FOLDER__NAME);

		hudsonDeploymentEClass = createEClass(HUDSON_DEPLOYMENT);
		createEAttribute(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__ANT_NAME);
		createEAttribute(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__ASSIGNED_NODE);
		createEAttribute(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__BUILD_ID);
		createEAttribute(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__ENABLED);
		createEAttribute(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__JDK_NAME);
		createEAttribute(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME);
		createEReference(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__USERS);
		createEAttribute(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL);
		createEReference(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__GENERATION_LOCATION);
		createEReference(hudsonDeploymentEClass, HUDSON_DEPLOYMENT__TRIGGERS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__LOGIN);
		createEAttribute(userEClass, USER__PERMISSION);

		generationLocationEClass = createEClass(GENERATION_LOCATION);
		createEAttribute(generationLocationEClass, GENERATION_LOCATION__FOLDER);
		createEAttribute(generationLocationEClass, GENERATION_LOCATION__URL);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__PLANNING);

		cronEClass = createEClass(CRON);

		scmEClass = createEClass(SCM);

		// Create enums
		protocolTypeEEnum = createEEnum(PROTOCOL_TYPE);
		userPermissionEEnum = createEEnum(USER_PERMISSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VpdescPackage theVpdescPackage = (VpdescPackage) EPackage.Registry.INSTANCE.getEPackage(VpdescPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		buildEClass.getESuperTypes().add(theVpdescPackage.getAspect());
		cronEClass.getESuperTypes().add(this.getTrigger());
		scmEClass.getESuperTypes().add(this.getTrigger());

		// Initialize classes and features; add operations and parameters
		initEClass(buildEClass, Build.class, "Build", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBuild_Target_platform(), theEcorePackage.getEString(), "target_platform", null, 0, 1, //$NON-NLS-1$
				Build.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBuild_Mapped_repositories(), this.getRepository(), null, "mapped_repositories", null, 0, -1, //$NON-NLS-1$
				Build.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuild_HudsonDeployment(), this.getHudsonDeployment(), null, "hudsonDeployment", null, 0, 1, //$NON-NLS-1$
				Build.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepository_Protocol(), this.getProtocolType(), "protocol", null, 0, 1, Repository.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Location(), theEcorePackage.getEString(), "location", null, 0, 1, Repository.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Features(), this.getFeature(), null, "features", null, 0, -1, Repository.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Folders(), this.getSourceFolder(), null, "folders", null, 0, -1, Repository.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFeature_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Feature.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceFolderEClass, SourceFolder.class, "SourceFolder", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceFolder_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SourceFolder.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hudsonDeploymentEClass, HudsonDeployment.class, "HudsonDeployment", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHudsonDeployment_AntName(), theEcorePackage.getEString(), "antName", null, 0, 1, //$NON-NLS-1$
				HudsonDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHudsonDeployment_AssignedNode(), theEcorePackage.getEString(), "assignedNode", null, 0, 1, //$NON-NLS-1$
				HudsonDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHudsonDeployment_Build_id(), theEcorePackage.getEString(), "build_id", null, 0, 1, //$NON-NLS-1$
				HudsonDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHudsonDeployment_Enabled(), theEcorePackage.getEBoolean(), "enabled", null, 0, 1, //$NON-NLS-1$
				HudsonDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHudsonDeployment_JdkName(), theEcorePackage.getEString(), "jdkName", null, 0, 1, //$NON-NLS-1$
				HudsonDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHudsonDeployment_UserDeployJobName(), theEcorePackage.getEString(), "userDeployJobName", null, //$NON-NLS-1$
				0, 1, HudsonDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHudsonDeployment_Users(), this.getUser(), null, "users", null, 0, -1, HudsonDeployment.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHudsonDeployment_UserDeployServerUrl(), theEcorePackage.getEString(), "userDeployServerUrl", //$NON-NLS-1$
				null, 0, 1, HudsonDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHudsonDeployment_GenerationLocation(), this.getGenerationLocation(), null,
				"generationLocation", null, 0, 1, HudsonDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHudsonDeployment_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, //$NON-NLS-1$
				HudsonDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getUser_Login(), theEcorePackage.getEString(), "login", null, 0, 1, User.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Permission(), this.getUserPermission(), "permission", "READ", 0, 1, User.class, //$NON-NLS-1$//$NON-NLS-2$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationLocationEClass, GenerationLocation.class, "GenerationLocation", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerationLocation_Folder(), theEcorePackage.getEString(), "folder", null, 0, 1, //$NON-NLS-1$
				GenerationLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationLocation_Url(), theEcorePackage.getEString(), "url", null, 0, 1, //$NON-NLS-1$
				GenerationLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTrigger_Planning(), theEcorePackage.getEString(), "planning", null, 0, 1, Trigger.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cronEClass, Cron.class, "Cron", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(scmEClass, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SCM.class, "SCM", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(protocolTypeEEnum, ProtocolType.class, "ProtocolType"); //$NON-NLS-1$
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.GIT);
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.SVN);
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.SVNSSH);

		initEEnum(userPermissionEEnum, UserPermission.class, "UserPermission"); //$NON-NLS-1$
		addEEnumLiteral(userPermissionEEnum, UserPermission.WRITE);
		addEEnumLiteral(userPermissionEEnum, UserPermission.EXECUTE);
		addEEnumLiteral(userPermissionEEnum, UserPermission.READ);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/extension
		createExtensionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/extension</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtensionAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/extension"; //$NON-NLS-1$	
		addAnnotation(this, source,
				new String[] { "extensibleProviderFactory", "true", //$NON-NLS-1$ //$NON-NLS-2$
						"childCreationExtenders", "true", //$NON-NLS-1$ //$NON-NLS-2$
						"useUUIDs", "true", //$NON-NLS-1$ //$NON-NLS-2$
						"useIDAttributes", "false" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} //VpbuildPackageImpl
