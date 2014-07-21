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


package org.polarsys.kitalpha.transposer.rules.handler.rules.api.impl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.RulesPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiFactory;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributionPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributionPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePackageImpl;

import org.eclipse.core.resources.IFile;

import org.eclipse.core.runtime.IStatus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiPackageImpl extends EPackageImpl implements ApiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iPremiseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iRuleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iDomainHelperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iContextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iStatusEDataType = null;

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
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApiPackageImpl() {
		super(eNS_URI, ApiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApiPackage init() {
		if (isInited) return (ApiPackage)EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI);

		// Obtain or create and register package
		ApiPackageImpl theApiPackage = (ApiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);
		ContributionPackageImpl theContributionPackage = (ContributionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContributionPackage.eNS_URI) instanceof ContributionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContributionPackage.eNS_URI) : ContributionPackage.eINSTANCE);

		// Create package meta-data objects
		theApiPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theContributionPackage.createPackageContents();

		// Initialize created meta-data
		theApiPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theContributionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApiPackage.eNS_URI, theApiPackage);
		return theApiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPurpose() {
		return iPurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPurpose_Name() {
		return (EAttribute)iPurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFile() {
		return iFileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIPremise() {
		return iPremiseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIRule() {
		return iRuleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIDomainHelper() {
		return iDomainHelperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIContext() {
		return iContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIStatus() {
		return iStatusEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiFactory getApiFactory() {
		return (ApiFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iPurposeEClass = createEClass(IPURPOSE);
		createEAttribute(iPurposeEClass, IPURPOSE__NAME);

		// Create data types
		iFileEDataType = createEDataType(IFILE);
		iPremiseEDataType = createEDataType(IPREMISE);
		iRuleEDataType = createEDataType(IRULE);
		iDomainHelperEDataType = createEDataType(IDOMAIN_HELPER);
		iContextEDataType = createEDataType(ICONTEXT);
		iStatusEDataType = createEDataType(ISTATUS);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(iRuleEDataType, "T"); //$NON-NLS-1$

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(iPurposeEClass, IPurpose.class, "IPurpose", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIPurpose_Name(), ecorePackage.getEString(), "name", null, 0, 1, IPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(iPurposeEClass, this.getIStatus(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		// Initialize data types
		initEDataType(iFileEDataType, IFile.class, "IFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(iPremiseEDataType, IPremise.class, "IPremise", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(iRuleEDataType, IRule.class, "IRule", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(iDomainHelperEDataType, IDomainHelper.class, "IDomainHelper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(iContextEDataType, IContext.class, "IContext", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(iStatusEDataType, IStatus.class, "IStatus", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
	}

} //ApiPackageImpl
