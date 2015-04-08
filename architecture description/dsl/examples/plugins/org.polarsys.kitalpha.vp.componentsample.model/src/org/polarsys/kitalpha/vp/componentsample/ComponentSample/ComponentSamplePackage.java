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
package org.polarsys.kitalpha.vp.componentsample.ComponentSample;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.kitalpha.emde.model.EmdePackage;

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
 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSampleFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentSamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentSample"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ComponentSample/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentSample"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSamplePackage eINSTANCE = org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentElementImpl <em>Component Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentElementImpl
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getComponentElement()
	 * @generated
	 */
	int COMPONENT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__OWNED_EXTENSIONS = EmdePackage.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__NAME = EmdePackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__DESCRIPTION = EmdePackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT_FEATURE_COUNT = EmdePackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentModelImpl <em>Component Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentModelImpl
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getComponentModel()
	 * @generated
	 */
	int COMPONENT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL__OWNED_EXTENSIONS = COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL__NAME = COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL__PACKAGES = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.PackageImpl
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_EXTENSIONS = COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentPackageImpl <em>Component Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentPackageImpl
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getComponentPackage()
	 * @generated
	 */
	int COMPONENT_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__OWNED_EXTENSIONS = PACKAGE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__DESCRIPTION = PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__COMPONENTS = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.AbstractComponentImpl
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__OWNED_EXTENSIONS = COMPONENT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__NAME = COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__USE = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__TYPE = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.SoftwareComponentImpl
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getSoftwareComponent()
	 * @generated
	 */
	int SOFTWARE_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__OWNED_EXTENSIONS = ABSTRACT_COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__DESCRIPTION = ABSTRACT_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__USE = ABSTRACT_COMPONENT__USE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__TYPE = ABSTRACT_COMPONENT__TYPE;

	/**
	 * The number of structural features of the '<em>Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.HardwareComponentImpl <em>Hardware Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.HardwareComponentImpl
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getHardwareComponent()
	 * @generated
	 */
	int HARDWARE_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__OWNED_EXTENSIONS = ABSTRACT_COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__DESCRIPTION = ABSTRACT_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__USE = ABSTRACT_COMPONENT__USE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__TYPE = ABSTRACT_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Abstract Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__ABSTRACT_COMPONENT = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType <em>Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 7;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement <em>Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Element</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement
	 * @generated
	 */
	EClass getComponentElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement#getName()
	 * @see #getComponentElement()
	 * @generated
	 */
	EAttribute getComponentElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement#getDescription()
	 * @see #getComponentElement()
	 * @generated
	 */
	EAttribute getComponentElement_Description();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel <em>Component Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Model</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel
	 * @generated
	 */
	EClass getComponentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel#getPackages()
	 * @see #getComponentModel()
	 * @generated
	 */
	EReference getComponentModel_Packages();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage <em>Component Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Package</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage
	 * @generated
	 */
	EClass getComponentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage#getComponents()
	 * @see #getComponentPackage()
	 * @generated
	 */
	EReference getComponentPackage_Components();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent#getUse()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_Use();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent#getType()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EAttribute getAbstractComponent_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent <em>Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Component</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent
	 * @generated
	 */
	EClass getSoftwareComponent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent <em>Hardware Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Component</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent
	 * @generated
	 */
	EClass getHardwareComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent#getAbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Component</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent#getAbstractComponent()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EReference getHardwareComponent_AbstractComponent();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type</em>'.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType
	 * @generated
	 */
	EEnum getComponentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentSampleFactory getComponentSampleFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentElementImpl <em>Component Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentElementImpl
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getComponentElement()
		 * @generated
		 */
		EClass COMPONENT_ELEMENT = eINSTANCE.getComponentElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ELEMENT__NAME = eINSTANCE
				.getComponentElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ELEMENT__DESCRIPTION = eINSTANCE
				.getComponentElement_Description();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentModelImpl <em>Component Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentModelImpl
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getComponentModel()
		 * @generated
		 */
		EClass COMPONENT_MODEL = eINSTANCE.getComponentModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODEL__PACKAGES = eINSTANCE
				.getComponentModel_Packages();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.PackageImpl
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentPackageImpl <em>Component Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentPackageImpl
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getComponentPackage()
		 * @generated
		 */
		EClass COMPONENT_PACKAGE = eINSTANCE.getComponentPackage();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PACKAGE__COMPONENTS = eINSTANCE
				.getComponentPackage_Components();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.AbstractComponentImpl
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__USE = eINSTANCE
				.getAbstractComponent_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT__TYPE = eINSTANCE
				.getAbstractComponent_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.SoftwareComponentImpl
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getSoftwareComponent()
		 * @generated
		 */
		EClass SOFTWARE_COMPONENT = eINSTANCE.getSoftwareComponent();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.HardwareComponentImpl <em>Hardware Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.HardwareComponentImpl
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getHardwareComponent()
		 * @generated
		 */
		EClass HARDWARE_COMPONENT = eINSTANCE.getHardwareComponent();

		/**
		 * The meta object literal for the '<em><b>Abstract Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT__ABSTRACT_COMPONENT = eINSTANCE
				.getHardwareComponent_AbstractComponent();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType <em>Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType
		 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentSamplePackageImpl#getComponentType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

	}

} //ComponentSamplePackage
