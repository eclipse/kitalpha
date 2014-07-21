/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.AbstractComponent;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentModel;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.HardwareComponent;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentFactory;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentPackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SoftwareComponent;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplecomponentPackageImpl extends EPackageImpl implements SimplecomponentPackage {
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
	private EClass componentElementEClass = null;

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
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplecomponentPackageImpl() {
		super(eNS_URI, SimplecomponentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimplecomponentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplecomponentPackage init() {
		if (isInited)
			return (SimplecomponentPackage) EPackage.Registry.INSTANCE.getEPackage(SimplecomponentPackage.eNS_URI);

		// Obtain or create and register package
		SimplecomponentPackageImpl theSimplecomponentPackage = (SimplecomponentPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimplecomponentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimplecomponentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimplecomponentPackage.createPackageContents();

		// Initialize created meta-data
		theSimplecomponentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplecomponentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplecomponentPackage.eNS_URI, theSimplecomponentPackage);
		return theSimplecomponentPackage;
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
	public EReference getComponentModel_AbstractComponent() {
		return (EReference) componentModelEClass.getEStructuralFeatures().get(0);
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
	public EClass getAbstractComponent() {
		return abstractComponentEClass;
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
	public SimplecomponentFactory getSimplecomponentFactory() {
		return (SimplecomponentFactory) getEFactoryInstance();
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
		componentModelEClass = createEClass(COMPONENT_MODEL);
		createEReference(componentModelEClass, COMPONENT_MODEL__ABSTRACT_COMPONENT);

		componentElementEClass = createEClass(COMPONENT_ELEMENT);
		createEAttribute(componentElementEClass, COMPONENT_ELEMENT__NAME);
		createEAttribute(componentElementEClass, COMPONENT_ELEMENT__DESCRIPTION);

		abstractComponentEClass = createEClass(ABSTRACT_COMPONENT);

		softwareComponentEClass = createEClass(SOFTWARE_COMPONENT);

		hardwareComponentEClass = createEClass(HARDWARE_COMPONENT);
		createEReference(hardwareComponentEClass, HARDWARE_COMPONENT__ABSTRACT_COMPONENT);
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
		componentModelEClass.getESuperTypes().add(this.getComponentElement());
		componentElementEClass.getESuperTypes().add(theEmdePackage.getExtensibleElement());
		abstractComponentEClass.getESuperTypes().add(this.getComponentElement());
		softwareComponentEClass.getESuperTypes().add(this.getAbstractComponent());
		hardwareComponentEClass.getESuperTypes().add(this.getAbstractComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(componentModelEClass, ComponentModel.class, "ComponentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComponentModel_AbstractComponent(), this.getAbstractComponent(), null, "abstractComponent", null, 0, -1, ComponentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(componentElementEClass, ComponentElement.class, "ComponentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getComponentElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComponentElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ComponentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractComponentEClass, AbstractComponent.class, "AbstractComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(softwareComponentEClass, SoftwareComponent.class, "SoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(hardwareComponentEClass, HardwareComponent.class, "HardwareComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHardwareComponent_AbstractComponent(), this.getAbstractComponent(), null, "abstractComponent", null, 0, -1, HardwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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
		addAnnotation(this, source, new String[] { "extensibleProviderFactory", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"childCreationExtenders", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"useUUIDs", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"useIDAttributes", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

} //SimplecomponentPackageImpl
