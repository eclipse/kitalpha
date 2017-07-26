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
 
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DataSource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DisplayableElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpuiPackageImpl extends EPackageImpl implements VpuiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

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
	private EEnum uI_Field_TypeEEnum = null;

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
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VpuiPackageImpl() {
		super(eNS_URI, VpuiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VpuiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VpuiPackage init() {
		if (isInited) return (VpuiPackage)EPackage.Registry.INSTANCE.getEPackage(VpuiPackage.eNS_URI);

		// Obtain or create and register package
		VpuiPackageImpl theVpuiPackage = (VpuiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VpuiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VpuiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VpdescPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVpuiPackage.createPackageContents();

		// Initialize created meta-data
		theVpuiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVpuiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VpuiPackage.eNS_URI, theVpuiPackage);
		return theVpuiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIContainer() {
		return uiContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIContainer_UI_fields() {
		return (EReference)uiContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIContainer_SubContainers() {
		return (EReference)uiContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUI() {
		return uiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_UI_Containers() {
		return (EReference)uiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_UI_DataSource() {
		return (EReference)uiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIField() {
		return uiFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIField_Mapping() {
		return (EReference)uiFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIField_Type() {
		return (EAttribute)uiFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldMapping() {
		return fieldMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldMapping_UI_Field_Mapped_To() {
		return (EReference)fieldMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIDescription() {
		return uiDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIDescription_UIs() {
		return (EReference)uiDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayableElement() {
		return displayableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayableElement_Label() {
		return (EAttribute)displayableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource() {
		return dataSourceEClass;
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
	public EReference getLocalClass_UI_For_LocalClass() {
		return (EReference)localClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUI_Field_Type() {
		return uI_Field_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpuiFactory getVpuiFactory() {
		return (VpuiFactory)getEFactoryInstance();
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
		uiContainerEClass = createEClass(UI_CONTAINER);
		createEReference(uiContainerEClass, UI_CONTAINER__UI_FIELDS);
		createEReference(uiContainerEClass, UI_CONTAINER__SUB_CONTAINERS);

		uiEClass = createEClass(UI);
		createEReference(uiEClass, UI__UI_CONTAINERS);
		createEReference(uiEClass, UI__UI_DATA_SOURCE);

		uiFieldEClass = createEClass(UI_FIELD);
		createEReference(uiFieldEClass, UI_FIELD__MAPPING);
		createEAttribute(uiFieldEClass, UI_FIELD__TYPE);

		fieldMappingEClass = createEClass(FIELD_MAPPING);
		createEReference(fieldMappingEClass, FIELD_MAPPING__UI_FIELD_MAPPED_TO);

		uiDescriptionEClass = createEClass(UI_DESCRIPTION);
		createEReference(uiDescriptionEClass, UI_DESCRIPTION__UIS);

		displayableElementEClass = createEClass(DISPLAYABLE_ELEMENT);
		createEAttribute(displayableElementEClass, DISPLAYABLE_ELEMENT__LABEL);

		dataSourceEClass = createEClass(DATA_SOURCE);

		localClassEClass = createEClass(LOCAL_CLASS);
		createEReference(localClassEClass, LOCAL_CLASS__UI_FOR_LOCAL_CLASS);

		// Create enums
		uI_Field_TypeEEnum = createEEnum(UI_FIELD_TYPE);
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
		uiContainerEClass.getESuperTypes().add(this.getDisplayableElement());
		uiEClass.getESuperTypes().add(this.getDisplayableElement());
		uiFieldEClass.getESuperTypes().add(this.getDisplayableElement());
		fieldMappingEClass.getESuperTypes().add(theVpdescPackage.getViewpointElement());
		uiDescriptionEClass.getESuperTypes().add(theVpdescPackage.getAspect());
		displayableElementEClass.getESuperTypes().add(theVpdescPackage.getNamedElement());
		localClassEClass.getESuperTypes().add(this.getDataSource());

		// Initialize classes and features; add operations and parameters
		initEClass(uiContainerEClass, UIContainer.class, "UIContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIContainer_UI_fields(), this.getUIField(), null, "UI_fields", null, 0, -1, UIContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIContainer_SubContainers(), this.getUIContainer(), null, "subContainers", null, 0, -1, UIContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiEClass, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI.class, "UI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUI_UI_Containers(), this.getUIContainer(), null, "UI_Containers", null, 0, -1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_UI_DataSource(), this.getDataSource(), null, "UI_DataSource", null, 0, 1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFieldEClass, UIField.class, "UIField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIField_Mapping(), this.getFieldMapping(), null, "Mapping", null, 1, 1, UIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIField_Type(), this.getUI_Field_Type(), "type", null, 0, 1, UIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldMappingEClass, FieldMapping.class, "FieldMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldMapping_UI_Field_Mapped_To(), theVpdescPackage.getAbstractFeature(), null, "UI_Field_Mapped_To", null, 1, 1, FieldMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDescriptionEClass, UIDescription.class, "UIDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIDescription_UIs(), this.getUI(), null, "UIs", null, 0, -1, UIDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayableElementEClass, DisplayableElement.class, "DisplayableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplayableElement_Label(), theEcorePackage.getEString(), "label", null, 0, 1, DisplayableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localClassEClass, LocalClass.class, "LocalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalClass_UI_For_LocalClass(), theVpdescPackage.getClass_(), null, "UI_For_LocalClass", null, 1, 1, LocalClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(uI_Field_TypeEEnum, UI_Field_Type.class, "UI_Field_Type");
		addEEnumLiteral(uI_Field_TypeEEnum, UI_Field_Type.TEXT);
		addEEnumLiteral(uI_Field_TypeEEnum, UI_Field_Type.TEXTAREA);
		addEEnumLiteral(uI_Field_TypeEEnum, UI_Field_Type.CHECKBOX);
		addEEnumLiteral(uI_Field_TypeEEnum, UI_Field_Type.RADIOBOX);
		addEEnumLiteral(uI_Field_TypeEEnum, UI_Field_Type.SIMPLE_CHOICE_LIST);
		addEEnumLiteral(uI_Field_TypeEEnum, UI_Field_Type.MULTIPLE_CHOICE_LIST);
		addEEnumLiteral(uI_Field_TypeEEnum, UI_Field_Type.RICHTEXT);

		// Create resource
		createResource(eNS_URI);
	}

} //VpuiPackageImpl
