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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiFactory
 * @model kind="package"
 * @generated
 */
public interface VpuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vpui"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpui/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpui"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpuiPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.DisplayableElementImpl <em>Displayable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.DisplayableElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getDisplayableElement()
	 * @generated
	 */
	int DISPLAYABLE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYABLE_ELEMENT__ID = VpdescPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYABLE_ELEMENT__NAME = VpdescPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYABLE_ELEMENT__DESCRIPTION = VpdescPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYABLE_ELEMENT__LABEL = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Displayable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYABLE_ELEMENT_FEATURE_COUNT = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIContainerImpl <em>UI Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIContainerImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUIContainer()
	 * @generated
	 */
	int UI_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTAINER__ID = DISPLAYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTAINER__NAME = DISPLAYABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTAINER__DESCRIPTION = DISPLAYABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTAINER__LABEL = DISPLAYABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>UI fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTAINER__UI_FIELDS = DISPLAYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTAINER__SUB_CONTAINERS = DISPLAYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTAINER_FEATURE_COUNT = DISPLAYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUI()
	 * @generated
	 */
	int UI = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__ID = DISPLAYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__NAME = DISPLAYABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__DESCRIPTION = DISPLAYABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__LABEL = DISPLAYABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>UI Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__UI_CONTAINERS = DISPLAYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>UI Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__UI_DATA_SOURCE = DISPLAYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = DISPLAYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIFieldImpl <em>UI Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIFieldImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUIField()
	 * @generated
	 */
	int UI_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__ID = DISPLAYABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__NAME = DISPLAYABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__DESCRIPTION = DISPLAYABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__LABEL = DISPLAYABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__MAPPING = DISPLAYABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__TYPE = DISPLAYABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD_FEATURE_COUNT = DISPLAYABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.FieldMappingImpl <em>Field Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.FieldMappingImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getFieldMapping()
	 * @generated
	 */
	int FIELD_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING__ID = VpdescPackage.VIEWPOINT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>UI Field Mapped To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING__UI_FIELD_MAPPED_TO = VpdescPackage.VIEWPOINT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING_FEATURE_COUNT = VpdescPackage.VIEWPOINT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIDescriptionImpl <em>UI Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIDescriptionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUIDescription()
	 * @generated
	 */
	int UI_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DESCRIPTION__ID = VpdescPackage.ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DESCRIPTION__NAME = VpdescPackage.ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DESCRIPTION__DESCRIPTION = VpdescPackage.ASPECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>UIs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DESCRIPTION__UIS = VpdescPackage.ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DESCRIPTION_FEATURE_COUNT = VpdescPackage.ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.DataSourceImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 6;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.LocalClassImpl <em>Local Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.LocalClassImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getLocalClass()
	 * @generated
	 */
	int LOCAL_CLASS = 7;

	/**
	 * The feature id for the '<em><b>UI For Local Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS__UI_FOR_LOCAL_CLASS = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type <em>UI Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUI_Field_Type()
	 * @generated
	 */
	int UI_FIELD_TYPE = 8;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer <em>UI Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Container</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer
	 * @generated
	 */
	EClass getUIContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer#getUI_fields <em>UI fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UI fields</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer#getUI_fields()
	 * @see #getUIContainer()
	 * @generated
	 */
	EReference getUIContainer_UI_fields();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer#getSubContainers <em>Sub Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Containers</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer#getSubContainers()
	 * @see #getUIContainer()
	 * @generated
	 */
	EReference getUIContainer_SubContainers();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI#getUI_Containers <em>UI Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UI Containers</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI#getUI_Containers()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_UI_Containers();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI#getUI_DataSource <em>UI Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UI Data Source</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI#getUI_DataSource()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_UI_DataSource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField <em>UI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Field</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField
	 * @generated
	 */
	EClass getUIField();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField#getMapping()
	 * @see #getUIField()
	 * @generated
	 */
	EReference getUIField_Mapping();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField#getType()
	 * @see #getUIField()
	 * @generated
	 */
	EAttribute getUIField_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping <em>Field Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Mapping</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping
	 * @generated
	 */
	EClass getFieldMapping();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping#getUI_Field_Mapped_To <em>UI Field Mapped To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UI Field Mapped To</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping#getUI_Field_Mapped_To()
	 * @see #getFieldMapping()
	 * @generated
	 */
	EReference getFieldMapping_UI_Field_Mapped_To();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription <em>UI Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription
	 * @generated
	 */
	EClass getUIDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription#getUIs <em>UIs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UIs</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription#getUIs()
	 * @see #getUIDescription()
	 * @generated
	 */
	EReference getUIDescription_UIs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DisplayableElement <em>Displayable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displayable Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DisplayableElement
	 * @generated
	 */
	EClass getDisplayableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DisplayableElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DisplayableElement#getLabel()
	 * @see #getDisplayableElement()
	 * @generated
	 */
	EAttribute getDisplayableElement_Label();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass <em>Local Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass
	 * @generated
	 */
	EClass getLocalClass();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass#getUI_For_LocalClass <em>UI For Local Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UI For Local Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass#getUI_For_LocalClass()
	 * @see #getLocalClass()
	 * @generated
	 */
	EReference getLocalClass_UI_For_LocalClass();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type <em>UI Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UI Field Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type
	 * @generated
	 */
	EEnum getUI_Field_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VpuiFactory getVpuiFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIContainerImpl <em>UI Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIContainerImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUIContainer()
		 * @generated
		 */
		EClass UI_CONTAINER = eINSTANCE.getUIContainer();

		/**
		 * The meta object literal for the '<em><b>UI fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CONTAINER__UI_FIELDS = eINSTANCE.getUIContainer_UI_fields();

		/**
		 * The meta object literal for the '<em><b>Sub Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CONTAINER__SUB_CONTAINERS = eINSTANCE.getUIContainer_SubContainers();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>UI Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__UI_CONTAINERS = eINSTANCE.getUI_UI_Containers();

		/**
		 * The meta object literal for the '<em><b>UI Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__UI_DATA_SOURCE = eINSTANCE.getUI_UI_DataSource();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIFieldImpl <em>UI Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIFieldImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUIField()
		 * @generated
		 */
		EClass UI_FIELD = eINSTANCE.getUIField();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_FIELD__MAPPING = eINSTANCE.getUIField_Mapping();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_FIELD__TYPE = eINSTANCE.getUIField_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.FieldMappingImpl <em>Field Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.FieldMappingImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getFieldMapping()
		 * @generated
		 */
		EClass FIELD_MAPPING = eINSTANCE.getFieldMapping();

		/**
		 * The meta object literal for the '<em><b>UI Field Mapped To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_MAPPING__UI_FIELD_MAPPED_TO = eINSTANCE.getFieldMapping_UI_Field_Mapped_To();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIDescriptionImpl <em>UI Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIDescriptionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUIDescription()
		 * @generated
		 */
		EClass UI_DESCRIPTION = eINSTANCE.getUIDescription();

		/**
		 * The meta object literal for the '<em><b>UIs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DESCRIPTION__UIS = eINSTANCE.getUIDescription_UIs();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.DisplayableElementImpl <em>Displayable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.DisplayableElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getDisplayableElement()
		 * @generated
		 */
		EClass DISPLAYABLE_ELEMENT = eINSTANCE.getDisplayableElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAYABLE_ELEMENT__LABEL = eINSTANCE.getDisplayableElement_Label();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.DataSourceImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.LocalClassImpl <em>Local Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.LocalClassImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getLocalClass()
		 * @generated
		 */
		EClass LOCAL_CLASS = eINSTANCE.getLocalClass();

		/**
		 * The meta object literal for the '<em><b>UI For Local Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLASS__UI_FOR_LOCAL_CLASS = eINSTANCE.getLocalClass_UI_For_LocalClass();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type <em>UI Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.VpuiPackageImpl#getUI_Field_Type()
		 * @generated
		 */
		EEnum UI_FIELD_TYPE = eINSTANCE.getUI_Field_Type();

	}

} //VpuiPackage
