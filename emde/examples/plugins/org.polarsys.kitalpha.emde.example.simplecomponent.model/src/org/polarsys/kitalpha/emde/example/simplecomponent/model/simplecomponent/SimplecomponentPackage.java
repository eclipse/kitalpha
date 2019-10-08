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
package org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/extension extensibleProviderFactory='true' childCreationExtenders='true' useUUIDs='true' useIDAttributes='false'"
 * @generated
 */
public interface SimplecomponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplecomponent"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/emde/example/simplecomponent"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplecomponent"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplecomponentPackage eINSTANCE = org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentElementImpl <em>Component Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentElementImpl
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getComponentElement()
	 * @generated
	 */
	int COMPONENT_ELEMENT = 1;

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
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentModelImpl <em>Component Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentModelImpl
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getComponentModel()
	 * @generated
	 */
	int COMPONENT_MODEL = 0;

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
	 * The feature id for the '<em><b>Abstract Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL__ABSTRACT_COMPONENT = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.AbstractComponentImpl
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 2;

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
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SoftwareComponentImpl
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getSoftwareComponent()
	 * @generated
	 */
	int SOFTWARE_COMPONENT = 3;

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
	 * The number of structural features of the '<em>Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.HardwareComponentImpl <em>Hardware Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.HardwareComponentImpl
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getHardwareComponent()
	 * @generated
	 */
	int HARDWARE_COMPONENT = 4;

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
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentModel <em>Component Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Model</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentModel
	 * @generated
	 */
	EClass getComponentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentModel#getAbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Component</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentModel#getAbstractComponent()
	 * @see #getComponentModel()
	 * @generated
	 */
	EReference getComponentModel_AbstractComponent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement <em>Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Element</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement
	 * @generated
	 */
	EClass getComponentElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement#getName()
	 * @see #getComponentElement()
	 * @generated
	 */
	EAttribute getComponentElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement#getDescription()
	 * @see #getComponentElement()
	 * @generated
	 */
	EAttribute getComponentElement_Description();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SoftwareComponent <em>Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Component</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SoftwareComponent
	 * @generated
	 */
	EClass getSoftwareComponent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.HardwareComponent <em>Hardware Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Component</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.HardwareComponent
	 * @generated
	 */
	EClass getHardwareComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.HardwareComponent#getAbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Component</em>'.
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.HardwareComponent#getAbstractComponent()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EReference getHardwareComponent_AbstractComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplecomponentFactory getSimplecomponentFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentModelImpl <em>Component Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentModelImpl
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getComponentModel()
		 * @generated
		 */
		EClass COMPONENT_MODEL = eINSTANCE.getComponentModel();

		/**
		 * The meta object literal for the '<em><b>Abstract Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODEL__ABSTRACT_COMPONENT = eINSTANCE.getComponentModel_AbstractComponent();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentElementImpl <em>Component Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentElementImpl
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getComponentElement()
		 * @generated
		 */
		EClass COMPONENT_ELEMENT = eINSTANCE.getComponentElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ELEMENT__NAME = eINSTANCE.getComponentElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ELEMENT__DESCRIPTION = eINSTANCE.getComponentElement_Description();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.AbstractComponentImpl
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SoftwareComponentImpl
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getSoftwareComponent()
		 * @generated
		 */
		EClass SOFTWARE_COMPONENT = eINSTANCE.getSoftwareComponent();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.HardwareComponentImpl <em>Hardware Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.HardwareComponentImpl
		 * @see org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.SimplecomponentPackageImpl#getHardwareComponent()
		 * @generated
		 */
		EClass HARDWARE_COMPONENT = eINSTANCE.getHardwareComponent();

		/**
		 * The meta object literal for the '<em><b>Abstract Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT__ABSTRACT_COMPONENT = eINSTANCE.getHardwareComponent_AbstractComponent();

	}

} //SimplecomponentPackage
