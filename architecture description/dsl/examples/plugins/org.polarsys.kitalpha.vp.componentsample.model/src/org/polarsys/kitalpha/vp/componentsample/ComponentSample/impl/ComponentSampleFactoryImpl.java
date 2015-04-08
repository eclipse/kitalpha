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
package org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSampleFactory;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSampleFactoryImpl extends EFactoryImpl implements
		ComponentSampleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentSampleFactory init() {
		try {
			ComponentSampleFactory theComponentSampleFactory = (ComponentSampleFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.polarsys.org/kitalpha/ComponentSample/1.0.0"); //$NON-NLS-1$ 
			if (theComponentSampleFactory != null) {
				return theComponentSampleFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentSampleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ComponentSamplePackage.COMPONENT_MODEL:
			return createComponentModel();
		case ComponentSamplePackage.COMPONENT_PACKAGE:
			return createComponentPackage();
		case ComponentSamplePackage.SOFTWARE_COMPONENT:
			return createSoftwareComponent();
		case ComponentSamplePackage.HARDWARE_COMPONENT:
			return createHardwareComponent();
		default:
			throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ComponentSamplePackage.COMPONENT_TYPE:
			return createComponentTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ComponentSamplePackage.COMPONENT_TYPE:
			return convertComponentTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModel createComponentModel() {
		ComponentModelImpl componentModel = new ComponentModelImpl();
		return componentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPackage createComponentPackage() {
		ComponentPackageImpl componentPackage = new ComponentPackageImpl();
		return componentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareComponent createSoftwareComponent() {
		SoftwareComponentImpl softwareComponent = new SoftwareComponentImpl();
		return softwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponent createHardwareComponent() {
		HardwareComponentImpl hardwareComponent = new HardwareComponentImpl();
		return hardwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentTypeFromString(EDataType eDataType,
			String initialValue) {
		ComponentType result = ComponentType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSamplePackage getComponentSamplePackage() {
		return (ComponentSamplePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentSamplePackage getPackage() {
		return ComponentSamplePackage.eINSTANCE;
	}

} //ComponentSampleFactoryImpl
