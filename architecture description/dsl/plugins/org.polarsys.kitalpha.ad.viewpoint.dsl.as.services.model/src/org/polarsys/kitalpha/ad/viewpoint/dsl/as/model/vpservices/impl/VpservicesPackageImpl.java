/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/


package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.AbstractServicesElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Property;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertyType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Service;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpservicesPackageImpl extends EPackageImpl implements
		VpservicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractServicesElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rules_TypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeEEnum = null;

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
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VpservicesPackageImpl() {
		super(eNS_URI, VpservicesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VpservicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VpservicesPackage init() {
		if (isInited) return (VpservicesPackage)EPackage.Registry.INSTANCE.getEPackage(VpservicesPackage.eNS_URI);

		// Obtain or create and register package
		VpservicesPackageImpl theVpservicesPackage = (VpservicesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VpservicesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VpservicesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VpdescPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVpservicesPackage.createPackageContents();

		// Initialize created meta-data
		theVpservicesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVpservicesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VpservicesPackage.eNS_URI, theVpservicesPackage);
		return theVpservicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleSet() {
		return ruleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleSet_VpRules() {
		return (EReference)ruleSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceSet() {
		return serviceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceSet_VpServices() {
		return (EReference)serviceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractServicesElement() {
		return abstractServicesElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractServicesElement_Vpid() {
		return (EAttribute)abstractServicesElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Type() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Class() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_RelatedRules() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertySet() {
		return propertySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertySet_VpProperties() {
		return (EReference)propertySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRules_Types() {
		return rules_TypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyType() {
		return propertyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpservicesFactory getVpservicesFactory() {
		return (VpservicesFactory)getEFactoryInstance();
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
		ruleSetEClass = createEClass(RULE_SET);
		createEReference(ruleSetEClass, RULE_SET__VP_RULES);

		serviceSetEClass = createEClass(SERVICE_SET);
		createEReference(serviceSetEClass, SERVICE_SET__VP_SERVICES);

		abstractServicesElementEClass = createEClass(ABSTRACT_SERVICES_ELEMENT);
		createEAttribute(abstractServicesElementEClass, ABSTRACT_SERVICES_ELEMENT__VPID);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__TYPE);
		createEAttribute(ruleEClass, RULE__CLASS);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__RELATED_RULES);

		propertySetEClass = createEClass(PROPERTY_SET);
		createEReference(propertySetEClass, PROPERTY_SET__VP_PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		// Create enums
		rules_TypesEEnum = createEEnum(RULES_TYPES);
		propertyTypeEEnum = createEEnum(PROPERTY_TYPE);
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
		VpdescPackage theVpdescPackage = (VpdescPackage)EPackage.Registry.INSTANCE.getEPackage(VpdescPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ruleSetEClass.getESuperTypes().add(theVpdescPackage.getAspect());
		serviceSetEClass.getESuperTypes().add(theVpdescPackage.getAspect());
		abstractServicesElementEClass.getESuperTypes().add(theVpdescPackage.getNamedElement());
		ruleEClass.getESuperTypes().add(this.getAbstractServicesElement());
		serviceEClass.getESuperTypes().add(this.getAbstractServicesElement());
		propertySetEClass.getESuperTypes().add(theVpdescPackage.getAspect());
		propertyEClass.getESuperTypes().add(this.getAbstractServicesElement());

		// Initialize classes and features; add operations and parameters
		initEClass(ruleSetEClass, RuleSet.class, "RuleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleSet_VpRules(), this.getRule(), null, "vpRules", null, 0, -1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceSetEClass, ServiceSet.class, "ServiceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceSet_VpServices(), this.getService(), null, "vpServices", null, 0, -1, ServiceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractServicesElementEClass, AbstractServicesElement.class, "AbstractServicesElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractServicesElement_Vpid(), theEcorePackage.getEString(), "vpid", null, 0, 1, AbstractServicesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Type(), this.getRules_Types(), "type", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Class(), theEcorePackage.getEString(), "class", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_RelatedRules(), this.getRule(), null, "relatedRules", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertySetEClass, PropertySet.class, "PropertySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertySet_VpProperties(), this.getProperty(), null, "vpProperties", null, 0, -1, PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Type(), this.getPropertyType(), "Type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(rules_TypesEEnum, Rules_Types.class, "Rules_Types");
		addEEnumLiteral(rules_TypesEEnum, Rules_Types.JAVA);
		addEEnumLiteral(rules_TypesEEnum, Rules_Types.EM_FVALIDATION);

		initEEnum(propertyTypeEEnum, PropertyType.class, "PropertyType");
		addEEnumLiteral(propertyTypeEEnum, PropertyType.INTEGER);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.STRING);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.BOOLEAN);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.FLOAT);

		// Create resource
		createResource(eNS_URI);
	}

} //VpservicesPackageImpl
