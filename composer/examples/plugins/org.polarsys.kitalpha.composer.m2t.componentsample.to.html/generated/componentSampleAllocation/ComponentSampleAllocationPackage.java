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
package componentSampleAllocation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage;

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
 * @see componentSampleAllocation.ComponentSampleAllocationFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentSampleAllocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentSampleAllocation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/componentsampleallocation/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentSampleAllocation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSampleAllocationPackage eINSTANCE = componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.ComponentSampleRootImpl <em>Component Sample Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.ComponentSampleRootImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentSampleRoot()
	 * @generated
	 */
	int COMPONENT_SAMPLE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Owned Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_ROOT__OWNED_FILES = BasePackage.ROOT__OWNED_FILES;

	/**
	 * The number of structural features of the '<em>Component Sample Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_ROOT_FEATURE_COUNT = BasePackage.ROOT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.ComponentSampleFileImpl <em>Component Sample File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.ComponentSampleFileImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentSampleFile()
	 * @generated
	 */
	int COMPONENT_SAMPLE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_FILE__NAME = BasePackage.FILE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_FILE__PATH = BasePackage.FILE__PATH;

	/**
	 * The feature id for the '<em><b>Owned Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_FILE__OWNED_TYPES = BasePackage.FILE__OWNED_TYPES;

	/**
	 * The number of structural features of the '<em>Component Sample File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_FILE_FEATURE_COUNT = BasePackage.FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.ComponentTypeImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REFERENCED_ELEMENT = BasePackage.TYPE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Used Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__USED_COMPONENTS = BasePackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used By Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__USED_BY_COMPONENT = BasePackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained By Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__CONTAINED_BY_COMPONENT = BasePackage.TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = BasePackage.TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = BasePackage.TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.ComponentModelTypeImpl <em>Component Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.ComponentModelTypeImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentModelType()
	 * @generated
	 */
	int COMPONENT_MODEL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_TYPE__REFERENCED_ELEMENT = BasePackage.TYPE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Hardware Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_TYPE__HARDWARE_COMPONENTS = BasePackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Softwarecomponents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_TYPE__SOFTWARECOMPONENTS = BasePackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_TYPE_FEATURE_COUNT = BasePackage.TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.ComponentsAttributesImpl <em>Components Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.ComponentsAttributesImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentsAttributes()
	 * @generated
	 */
	int COMPONENTS_ATTRIBUTES = 10;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_ATTRIBUTES__COMPONENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_ATTRIBUTES__LINK = 1;

	/**
	 * The number of structural features of the '<em>Components Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_ATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.UsesImpl <em>Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.UsesImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getUses()
	 * @generated
	 */
	int USES = 4;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__COMPONENT_NAME = COMPONENTS_ATTRIBUTES__COMPONENT_NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__LINK = COMPONENTS_ATTRIBUTES__LINK;

	/**
	 * The number of structural features of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_FEATURE_COUNT = COMPONENTS_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.UsedByImpl <em>Used By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.UsedByImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getUsedBy()
	 * @generated
	 */
	int USED_BY = 5;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY__COMPONENT_NAME = COMPONENTS_ATTRIBUTES__COMPONENT_NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY__LINK = COMPONENTS_ATTRIBUTES__LINK;

	/**
	 * The number of structural features of the '<em>Used By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_FEATURE_COUNT = COMPONENTS_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.ContainsImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 6;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__COMPONENT_NAME = COMPONENTS_ATTRIBUTES__COMPONENT_NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__LINK = COMPONENTS_ATTRIBUTES__LINK;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = COMPONENTS_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.ContainedByImpl <em>Contained By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.ContainedByImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getContainedBy()
	 * @generated
	 */
	int CONTAINED_BY = 7;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_BY__COMPONENT_NAME = COMPONENTS_ATTRIBUTES__COMPONENT_NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_BY__LINK = COMPONENTS_ATTRIBUTES__LINK;

	/**
	 * The number of structural features of the '<em>Contained By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_BY_FEATURE_COUNT = COMPONENTS_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.ComponentSampleHardwareImpl <em>Component Sample Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.ComponentSampleHardwareImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentSampleHardware()
	 * @generated
	 */
	int COMPONENT_SAMPLE_HARDWARE = 8;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_HARDWARE__REFERENCED_ELEMENT = COMPONENT_TYPE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Used Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_HARDWARE__USED_COMPONENTS = COMPONENT_TYPE__USED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Used By Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_HARDWARE__USED_BY_COMPONENT = COMPONENT_TYPE__USED_BY_COMPONENT;

	/**
	 * The feature id for the '<em><b>Contained By Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_HARDWARE__CONTAINED_BY_COMPONENT = COMPONENT_TYPE__CONTAINED_BY_COMPONENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_HARDWARE__NAME = COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Contains Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_HARDWARE__CONTAINS_COMPONENTS = COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Sample Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_HARDWARE_FEATURE_COUNT = COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link componentSampleAllocation.impl.ComponentSampleSoftwareImpl <em>Component Sample Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSampleAllocation.impl.ComponentSampleSoftwareImpl
	 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentSampleSoftware()
	 * @generated
	 */
	int COMPONENT_SAMPLE_SOFTWARE = 9;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_SOFTWARE__REFERENCED_ELEMENT = COMPONENT_TYPE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Used Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_SOFTWARE__USED_COMPONENTS = COMPONENT_TYPE__USED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Used By Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_SOFTWARE__USED_BY_COMPONENT = COMPONENT_TYPE__USED_BY_COMPONENT;

	/**
	 * The feature id for the '<em><b>Contained By Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_SOFTWARE__CONTAINED_BY_COMPONENT = COMPONENT_TYPE__CONTAINED_BY_COMPONENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_SOFTWARE__NAME = COMPONENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Component Sample Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAMPLE_SOFTWARE_FEATURE_COUNT = COMPONENT_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.ComponentSampleRoot <em>Component Sample Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Sample Root</em>'.
	 * @see componentSampleAllocation.ComponentSampleRoot
	 * @generated
	 */
	EClass getComponentSampleRoot();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.ComponentSampleFile <em>Component Sample File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Sample File</em>'.
	 * @see componentSampleAllocation.ComponentSampleFile
	 * @generated
	 */
	EClass getComponentSampleFile();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see componentSampleAllocation.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the reference list '{@link componentSampleAllocation.ComponentType#getUsedComponents <em>Used Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Components</em>'.
	 * @see componentSampleAllocation.ComponentType#getUsedComponents()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_UsedComponents();

	/**
	 * Returns the meta object for the reference list '{@link componentSampleAllocation.ComponentType#getUsedByComponent <em>Used By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By Component</em>'.
	 * @see componentSampleAllocation.ComponentType#getUsedByComponent()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_UsedByComponent();

	/**
	 * Returns the meta object for the reference '{@link componentSampleAllocation.ComponentType#getContainedByComponent <em>Contained By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contained By Component</em>'.
	 * @see componentSampleAllocation.ComponentType#getContainedByComponent()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_ContainedByComponent();

	/**
	 * Returns the meta object for the attribute '{@link componentSampleAllocation.ComponentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentSampleAllocation.ComponentType#getName()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Name();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.ComponentModelType <em>Component Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Model Type</em>'.
	 * @see componentSampleAllocation.ComponentModelType
	 * @generated
	 */
	EClass getComponentModelType();

	/**
	 * Returns the meta object for the reference list '{@link componentSampleAllocation.ComponentModelType#getHardwareComponents <em>Hardware Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hardware Components</em>'.
	 * @see componentSampleAllocation.ComponentModelType#getHardwareComponents()
	 * @see #getComponentModelType()
	 * @generated
	 */
	EReference getComponentModelType_HardwareComponents();

	/**
	 * Returns the meta object for the reference list '{@link componentSampleAllocation.ComponentModelType#getSoftwarecomponents <em>Softwarecomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Softwarecomponents</em>'.
	 * @see componentSampleAllocation.ComponentModelType#getSoftwarecomponents()
	 * @see #getComponentModelType()
	 * @generated
	 */
	EReference getComponentModelType_Softwarecomponents();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses</em>'.
	 * @see componentSampleAllocation.Uses
	 * @generated
	 */
	EClass getUses();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.UsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used By</em>'.
	 * @see componentSampleAllocation.UsedBy
	 * @generated
	 */
	EClass getUsedBy();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see componentSampleAllocation.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.ContainedBy <em>Contained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained By</em>'.
	 * @see componentSampleAllocation.ContainedBy
	 * @generated
	 */
	EClass getContainedBy();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.ComponentSampleHardware <em>Component Sample Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Sample Hardware</em>'.
	 * @see componentSampleAllocation.ComponentSampleHardware
	 * @generated
	 */
	EClass getComponentSampleHardware();

	/**
	 * Returns the meta object for the reference list '{@link componentSampleAllocation.ComponentSampleHardware#getContainsComponents <em>Contains Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Components</em>'.
	 * @see componentSampleAllocation.ComponentSampleHardware#getContainsComponents()
	 * @see #getComponentSampleHardware()
	 * @generated
	 */
	EReference getComponentSampleHardware_ContainsComponents();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.ComponentSampleSoftware <em>Component Sample Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Sample Software</em>'.
	 * @see componentSampleAllocation.ComponentSampleSoftware
	 * @generated
	 */
	EClass getComponentSampleSoftware();

	/**
	 * Returns the meta object for class '{@link componentSampleAllocation.ComponentsAttributes <em>Components Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components Attributes</em>'.
	 * @see componentSampleAllocation.ComponentsAttributes
	 * @generated
	 */
	EClass getComponentsAttributes();

	/**
	 * Returns the meta object for the attribute '{@link componentSampleAllocation.ComponentsAttributes#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see componentSampleAllocation.ComponentsAttributes#getComponentName()
	 * @see #getComponentsAttributes()
	 * @generated
	 */
	EAttribute getComponentsAttributes_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link componentSampleAllocation.ComponentsAttributes#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see componentSampleAllocation.ComponentsAttributes#getLink()
	 * @see #getComponentsAttributes()
	 * @generated
	 */
	EAttribute getComponentsAttributes_Link();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentSampleAllocationFactory getComponentSampleAllocationFactory();

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
		 * The meta object literal for the '{@link componentSampleAllocation.impl.ComponentSampleRootImpl <em>Component Sample Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.ComponentSampleRootImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentSampleRoot()
		 * @generated
		 */
		EClass COMPONENT_SAMPLE_ROOT = eINSTANCE.getComponentSampleRoot();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.ComponentSampleFileImpl <em>Component Sample File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.ComponentSampleFileImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentSampleFile()
		 * @generated
		 */
		EClass COMPONENT_SAMPLE_FILE = eINSTANCE.getComponentSampleFile();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.ComponentTypeImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Used Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__USED_COMPONENTS = eINSTANCE.getComponentType_UsedComponents();

		/**
		 * The meta object literal for the '<em><b>Used By Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__USED_BY_COMPONENT = eINSTANCE.getComponentType_UsedByComponent();

		/**
		 * The meta object literal for the '<em><b>Contained By Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__CONTAINED_BY_COMPONENT = eINSTANCE.getComponentType_ContainedByComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__NAME = eINSTANCE.getComponentType_Name();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.ComponentModelTypeImpl <em>Component Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.ComponentModelTypeImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentModelType()
		 * @generated
		 */
		EClass COMPONENT_MODEL_TYPE = eINSTANCE.getComponentModelType();

		/**
		 * The meta object literal for the '<em><b>Hardware Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODEL_TYPE__HARDWARE_COMPONENTS = eINSTANCE.getComponentModelType_HardwareComponents();

		/**
		 * The meta object literal for the '<em><b>Softwarecomponents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODEL_TYPE__SOFTWARECOMPONENTS = eINSTANCE.getComponentModelType_Softwarecomponents();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.UsesImpl <em>Uses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.UsesImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getUses()
		 * @generated
		 */
		EClass USES = eINSTANCE.getUses();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.UsedByImpl <em>Used By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.UsedByImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getUsedBy()
		 * @generated
		 */
		EClass USED_BY = eINSTANCE.getUsedBy();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.ContainsImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.ContainedByImpl <em>Contained By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.ContainedByImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getContainedBy()
		 * @generated
		 */
		EClass CONTAINED_BY = eINSTANCE.getContainedBy();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.ComponentSampleHardwareImpl <em>Component Sample Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.ComponentSampleHardwareImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentSampleHardware()
		 * @generated
		 */
		EClass COMPONENT_SAMPLE_HARDWARE = eINSTANCE.getComponentSampleHardware();

		/**
		 * The meta object literal for the '<em><b>Contains Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SAMPLE_HARDWARE__CONTAINS_COMPONENTS = eINSTANCE.getComponentSampleHardware_ContainsComponents();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.ComponentSampleSoftwareImpl <em>Component Sample Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.ComponentSampleSoftwareImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentSampleSoftware()
		 * @generated
		 */
		EClass COMPONENT_SAMPLE_SOFTWARE = eINSTANCE.getComponentSampleSoftware();

		/**
		 * The meta object literal for the '{@link componentSampleAllocation.impl.ComponentsAttributesImpl <em>Components Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSampleAllocation.impl.ComponentsAttributesImpl
		 * @see componentSampleAllocation.impl.ComponentSampleAllocationPackageImpl#getComponentsAttributes()
		 * @generated
		 */
		EClass COMPONENTS_ATTRIBUTES = eINSTANCE.getComponentsAttributes();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS_ATTRIBUTES__COMPONENT_NAME = eINSTANCE.getComponentsAttributes_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS_ATTRIBUTES__LINK = eINSTANCE.getComponentsAttributes_Link();

	}

} //ComponentSampleAllocationPackage
