/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSampleFactory;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSamplePackageImpl extends EPackageImpl implements ComponentSamplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentTypeEEnum = null;

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
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentSamplePackageImpl() {
		super(eNS_URI, ComponentSampleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentSamplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentSamplePackage init() {
		if (isInited)
			return (ComponentSamplePackage) EPackage.Registry.INSTANCE.getEPackage(ComponentSamplePackage.eNS_URI);

		// Obtain or create and register package
		ComponentSamplePackageImpl theComponentSamplePackage = (ComponentSamplePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComponentSamplePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComponentSamplePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		EmdePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentSamplePackage.createPackageContents();

		// Initialize created meta-data
		theComponentSamplePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentSamplePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentSamplePackage.eNS_URI, theComponentSamplePackage);
		return theComponentSamplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentElement() {
		return componentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentElement_Name() {
		return (EAttribute) componentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentElement_Description() {
		return (EAttribute) componentElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentModel() {
		return componentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentModel_Packages() {
		return (EReference) componentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPackage() {
		return componentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPackage_Components() {
		return (EReference) componentPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponent() {
		return abstractComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponent_Use() {
		return (EReference) abstractComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponent_Type() {
		return (EAttribute) abstractComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareComponent() {
		return softwareComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareComponent() {
		return hardwareComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponent_AbstractComponent() {
		return (EReference) hardwareComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentType() {
		return componentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleFactory getComponentSampleFactory() {
		return (ComponentSampleFactory) getEFactoryInstance();
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
		componentElementEClass = createEClass(COMPONENT_ELEMENT);
		createEAttribute(componentElementEClass, COMPONENT_ELEMENT__NAME);
		createEAttribute(componentElementEClass, COMPONENT_ELEMENT__DESCRIPTION);

		componentModelEClass = createEClass(COMPONENT_MODEL);
		createEReference(componentModelEClass, COMPONENT_MODEL__PACKAGES);

		packageEClass = createEClass(PACKAGE);

		componentPackageEClass = createEClass(COMPONENT_PACKAGE);
		createEReference(componentPackageEClass, COMPONENT_PACKAGE__COMPONENTS);

		abstractComponentEClass = createEClass(ABSTRACT_COMPONENT);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__USE);
		createEAttribute(abstractComponentEClass, ABSTRACT_COMPONENT__TYPE);

		softwareComponentEClass = createEClass(SOFTWARE_COMPONENT);

		hardwareComponentEClass = createEClass(HARDWARE_COMPONENT);
		createEReference(hardwareComponentEClass, HARDWARE_COMPONENT__ABSTRACT_COMPONENT);

		// Create enums
		componentTypeEEnum = createEEnum(COMPONENT_TYPE);
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
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentElementEClass.getESuperTypes().add(theEmdePackage.getExtensibleElement());
		componentModelEClass.getESuperTypes().add(this.getComponentElement());
		packageEClass.getESuperTypes().add(this.getComponentElement());
		componentPackageEClass.getESuperTypes().add(this.getPackage());
		abstractComponentEClass.getESuperTypes().add(this.getComponentElement());
		softwareComponentEClass.getESuperTypes().add(this.getAbstractComponent());
		hardwareComponentEClass.getESuperTypes().add(this.getAbstractComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentElementEClass, ComponentElement.class, "ComponentElement", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, //$NON-NLS-1$
				ComponentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, //$NON-NLS-1$
				ComponentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(componentModelEClass, ComponentModel.class, "ComponentModel", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentModel_Packages(), this.getPackage(), null, "packages", null, 0, -1, //$NON-NLS-1$
				ComponentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package.class, "Package", //$NON-NLS-1$
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentPackageEClass, ComponentPackage.class, "ComponentPackage", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPackage_Components(), this.getAbstractComponent(), null, "components", null, 0, -1, //$NON-NLS-1$
				ComponentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComponentEClass, AbstractComponent.class, "AbstractComponent", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractComponent_Use(), this.getAbstractComponent(), null, "use", null, 0, -1, //$NON-NLS-1$
				AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractComponent_Type(), this.getComponentType(), "type", null, 0, 1, //$NON-NLS-1$
				AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(softwareComponentEClass, SoftwareComponent.class, "SoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareComponentEClass, HardwareComponent.class, "HardwareComponent", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareComponent_AbstractComponent(), this.getAbstractComponent(), null, "abstractComponent", //$NON-NLS-1$
				null, 0, -1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentTypeEEnum, ComponentType.class, "ComponentType"); //$NON-NLS-1$
		addEEnumLiteral(componentTypeEEnum, ComponentType.BEHAVIOUR);
		addEEnumLiteral(componentTypeEEnum, ComponentType.DATA);
		addEEnumLiteral(componentTypeEEnum, ComponentType.SERVICE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://org.polarsys.kitalpha/documentation
		createDocumentationAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://org.polarsys.kitalpha/documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentationAnnotations() {
		String source = "http://org.polarsys.kitalpha/documentation"; //$NON-NLS-1$	
		addAnnotation(hardwareComponentEClass, source, new String[] { "description", "Hardware Component" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

} //ComponentSamplePackageImpl
