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
package componentSampleAllocation.impl;

import componentSampleAllocation.ComponentModelType;
import componentSampleAllocation.ComponentSampleAllocationFactory;
import componentSampleAllocation.ComponentSampleAllocationPackage;
import componentSampleAllocation.ComponentSampleFile;
import componentSampleAllocation.ComponentSampleHardware;
import componentSampleAllocation.ComponentSampleRoot;
import componentSampleAllocation.ComponentSampleSoftware;
import componentSampleAllocation.ComponentType;
import componentSampleAllocation.ComponentsAttributes;
import componentSampleAllocation.ContainedBy;
import componentSampleAllocation.Contains;
import componentSampleAllocation.UsedBy;
import componentSampleAllocation.Uses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSampleAllocationPackageImpl extends EPackageImpl implements ComponentSampleAllocationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSampleRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSampleFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSampleHardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSampleSoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsAttributesEClass = null;

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
	 * @see componentSampleAllocation.ComponentSampleAllocationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentSampleAllocationPackageImpl() {
		super(eNS_URI, ComponentSampleAllocationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentSampleAllocationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentSampleAllocationPackage init() {
		if (isInited) return (ComponentSampleAllocationPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentSampleAllocationPackage.eNS_URI);

		// Obtain or create and register package
		ComponentSampleAllocationPackageImpl theComponentSampleAllocationPackage = (ComponentSampleAllocationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentSampleAllocationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentSampleAllocationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentSampleAllocationPackage.createPackageContents();

		// Initialize created meta-data
		theComponentSampleAllocationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentSampleAllocationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentSampleAllocationPackage.eNS_URI, theComponentSampleAllocationPackage);
		return theComponentSampleAllocationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSampleRoot() {
		return componentSampleRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSampleFile() {
		return componentSampleFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_UsedComponents() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_UsedByComponent() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_ContainedByComponent() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_Name() {
		return (EAttribute)componentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentModelType() {
		return componentModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentModelType_HardwareComponents() {
		return (EReference)componentModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentModelType_Softwarecomponents() {
		return (EReference)componentModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUses() {
		return usesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsedBy() {
		return usedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedBy() {
		return containedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSampleHardware() {
		return componentSampleHardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSampleHardware_ContainsComponents() {
		return (EReference)componentSampleHardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSampleSoftware() {
		return componentSampleSoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentsAttributes() {
		return componentsAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentsAttributes_ComponentName() {
		return (EAttribute)componentsAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentsAttributes_Link() {
		return (EAttribute)componentsAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleAllocationFactory getComponentSampleAllocationFactory() {
		return (ComponentSampleAllocationFactory)getEFactoryInstance();
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
		componentSampleRootEClass = createEClass(COMPONENT_SAMPLE_ROOT);

		componentSampleFileEClass = createEClass(COMPONENT_SAMPLE_FILE);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__USED_COMPONENTS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__USED_BY_COMPONENT);
		createEReference(componentTypeEClass, COMPONENT_TYPE__CONTAINED_BY_COMPONENT);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__NAME);

		componentModelTypeEClass = createEClass(COMPONENT_MODEL_TYPE);
		createEReference(componentModelTypeEClass, COMPONENT_MODEL_TYPE__HARDWARE_COMPONENTS);
		createEReference(componentModelTypeEClass, COMPONENT_MODEL_TYPE__SOFTWARECOMPONENTS);

		usesEClass = createEClass(USES);

		usedByEClass = createEClass(USED_BY);

		containsEClass = createEClass(CONTAINS);

		containedByEClass = createEClass(CONTAINED_BY);

		componentSampleHardwareEClass = createEClass(COMPONENT_SAMPLE_HARDWARE);
		createEReference(componentSampleHardwareEClass, COMPONENT_SAMPLE_HARDWARE__CONTAINS_COMPONENTS);

		componentSampleSoftwareEClass = createEClass(COMPONENT_SAMPLE_SOFTWARE);

		componentsAttributesEClass = createEClass(COMPONENTS_ATTRIBUTES);
		createEAttribute(componentsAttributesEClass, COMPONENTS_ATTRIBUTES__COMPONENT_NAME);
		createEAttribute(componentsAttributesEClass, COMPONENTS_ATTRIBUTES__LINK);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentSampleRootEClass.getESuperTypes().add(theBasePackage.getRoot());
		componentSampleFileEClass.getESuperTypes().add(theBasePackage.getFile());
		componentTypeEClass.getESuperTypes().add(theBasePackage.getType());
		componentModelTypeEClass.getESuperTypes().add(theBasePackage.getType());
		usesEClass.getESuperTypes().add(this.getComponentsAttributes());
		usedByEClass.getESuperTypes().add(this.getComponentsAttributes());
		containsEClass.getESuperTypes().add(this.getComponentsAttributes());
		containedByEClass.getESuperTypes().add(this.getComponentsAttributes());
		componentSampleHardwareEClass.getESuperTypes().add(this.getComponentType());
		componentSampleSoftwareEClass.getESuperTypes().add(this.getComponentType());

		// Initialize classes and features; add operations and parameters
		initEClass(componentSampleRootEClass, ComponentSampleRoot.class, "ComponentSampleRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentSampleFileEClass, ComponentSampleFile.class, "ComponentSampleFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentType_UsedComponents(), this.getUses(), null, "usedComponents", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_UsedByComponent(), this.getUsedBy(), null, "usedByComponent", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_ContainedByComponent(), this.getContainedBy(), null, "containedByComponent", null, 0, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentModelTypeEClass, ComponentModelType.class, "ComponentModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentModelType_HardwareComponents(), this.getComponentSampleHardware(), null, "hardwareComponents", null, 0, -1, ComponentModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentModelType_Softwarecomponents(), this.getComponentSampleSoftware(), null, "softwarecomponents", null, 0, -1, ComponentModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usesEClass, Uses.class, "Uses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usedByEClass, UsedBy.class, "UsedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containedByEClass, ContainedBy.class, "ContainedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentSampleHardwareEClass, ComponentSampleHardware.class, "ComponentSampleHardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSampleHardware_ContainsComponents(), this.getContains(), null, "containsComponents", null, 0, -1, ComponentSampleHardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSampleSoftwareEClass, ComponentSampleSoftware.class, "ComponentSampleSoftware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentsAttributesEClass, ComponentsAttributes.class, "ComponentsAttributes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentsAttributes_ComponentName(), ecorePackage.getEString(), "componentName", null, 0, 1, ComponentsAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentsAttributes_Link(), ecorePackage.getEString(), "link", null, 0, 1, ComponentsAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentSampleAllocationPackageImpl
