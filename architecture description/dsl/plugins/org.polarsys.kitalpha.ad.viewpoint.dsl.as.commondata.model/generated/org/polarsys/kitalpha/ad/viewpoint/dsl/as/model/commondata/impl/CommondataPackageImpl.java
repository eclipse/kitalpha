/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommondataPackageImpl extends EPackageImpl implements
		CommondataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalAttributeEClass = null;

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
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommondataPackageImpl() {
		super(eNS_URI, CommondataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommondataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommondataPackage init() {
		if (isInited) return (CommondataPackage)EPackage.Registry.INSTANCE.getEPackage(CommondataPackage.eNS_URI);

		// Obtain or create and register package
		CommondataPackageImpl theCommondataPackage = (CommondataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommondataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommondataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VpdescPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommondataPackage.createPackageContents();

		// Initialize created meta-data
		theCommondataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommondataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommondataPackage.eNS_URI, theCommondataPackage);
		return theCommondataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractClass() {
		return abstractClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalClass() {
		return externalClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalClass_Class() {
		return (EReference)externalClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalClass() {
		return localClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalClass_Class() {
		return (EReference)localClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAssociation() {
		return abstractAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalAssociation() {
		return externalAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalAssociation_Reference() {
		return (EReference)externalAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalAssociation() {
		return localAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAssociation_Reference() {
		return (EReference)localAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAttribute() {
		return abstractAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalAttribute() {
		return localAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAttribute_Attribute() {
		return (EReference)localAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalAttribute() {
		return externalAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalAttribute_Attribute() {
		return (EReference)externalAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommondataFactory getCommondataFactory() {
		return (CommondataFactory)getEFactoryInstance();
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
		abstractClassEClass = createEClass(ABSTRACT_CLASS);

		externalClassEClass = createEClass(EXTERNAL_CLASS);
		createEReference(externalClassEClass, EXTERNAL_CLASS__CLASS);

		localClassEClass = createEClass(LOCAL_CLASS);
		createEReference(localClassEClass, LOCAL_CLASS__CLASS);

		abstractAssociationEClass = createEClass(ABSTRACT_ASSOCIATION);

		externalAssociationEClass = createEClass(EXTERNAL_ASSOCIATION);
		createEReference(externalAssociationEClass, EXTERNAL_ASSOCIATION__REFERENCE);

		localAssociationEClass = createEClass(LOCAL_ASSOCIATION);
		createEReference(localAssociationEClass, LOCAL_ASSOCIATION__REFERENCE);

		abstractAttributeEClass = createEClass(ABSTRACT_ATTRIBUTE);

		localAttributeEClass = createEClass(LOCAL_ATTRIBUTE);
		createEReference(localAttributeEClass, LOCAL_ATTRIBUTE__ATTRIBUTE);

		externalAttributeEClass = createEClass(EXTERNAL_ATTRIBUTE);
		createEReference(externalAttributeEClass, EXTERNAL_ATTRIBUTE__ATTRIBUTE);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		VpdescPackage theVpdescPackage = (VpdescPackage)EPackage.Registry.INSTANCE.getEPackage(VpdescPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		externalClassEClass.getESuperTypes().add(this.getAbstractClass());
		localClassEClass.getESuperTypes().add(this.getAbstractClass());
		externalAssociationEClass.getESuperTypes().add(this.getAbstractAssociation());
		localAssociationEClass.getESuperTypes().add(this.getAbstractAssociation());
		localAttributeEClass.getESuperTypes().add(this.getAbstractAttribute());
		externalAttributeEClass.getESuperTypes().add(this.getAbstractAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractClassEClass, AbstractClass.class, "AbstractClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(abstractClassEClass, this.getAbstractAttribute(), "getAbstractAttributes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractClassEClass, this.getAbstractAttribute(), "getAllAbstractAttributes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractClassEClass, this.getAbstractAssociation(), "getAbstractAssociations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractClassEClass, this.getAbstractAssociation(), "getAllAbstractAssociation", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractClassEClass, this.getAbstractClass(), "getSuperAbstractTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractClassEClass, this.getAbstractClass(), "getAllSuperAbstractTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractClassEClass, theEcorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractClassEClass, theEcorePackage.getEString(), "getEPackageName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractClassEClass, theEcorePackage.getEString(), "getFQN", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalClassEClass, ExternalClass.class, "ExternalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalClass_Class(), theEcorePackage.getEClass(), null, "class", null, 1, 1, ExternalClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localClassEClass, LocalClass.class, "LocalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalClass_Class(), theVpdescPackage.getClass_(), null, "class", null, 1, 1, LocalClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAssociationEClass, AbstractAssociation.class, "AbstractAssociation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(abstractAssociationEClass, theEcorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractAssociationEClass, theEcorePackage.getEBoolean(), "isMany", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalAssociationEClass, ExternalAssociation.class, "ExternalAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalAssociation_Reference(), theEcorePackage.getEReference(), null, "reference", null, 1, 1, ExternalAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localAssociationEClass, LocalAssociation.class, "LocalAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAssociation_Reference(), theVpdescPackage.getAbstractAssociation(), null, "reference", null, 1, 1, LocalAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAttributeEClass, AbstractAttribute.class, "AbstractAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(abstractAttributeEClass, theEcorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(localAttributeEClass, LocalAttribute.class, "LocalAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAttribute_Attribute(), theVpdescPackage.getAttribute(), null, "attribute", null, 1, 1, LocalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalAttributeEClass, ExternalAttribute.class, "ExternalAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalAttribute_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 1, 1, ExternalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CommondataPackageImpl
