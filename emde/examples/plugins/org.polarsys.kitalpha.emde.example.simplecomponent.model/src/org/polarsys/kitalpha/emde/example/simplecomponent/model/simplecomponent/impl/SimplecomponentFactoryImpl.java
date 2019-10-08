/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentModel;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.HardwareComponent;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentFactory;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentPackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SoftwareComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplecomponentFactoryImpl extends EFactoryImpl implements SimplecomponentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplecomponentFactory init() {
		try {
			SimplecomponentFactory theSimplecomponentFactory = (SimplecomponentFactory) EPackage.Registry.INSTANCE
					.getEFactory(SimplecomponentPackage.eNS_URI);
			if (theSimplecomponentFactory != null) {
				return theSimplecomponentFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplecomponentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplecomponentFactoryImpl() {
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
		case SimplecomponentPackage.COMPONENT_MODEL:
			return createComponentModel();
		case SimplecomponentPackage.SOFTWARE_COMPONENT:
			return createSoftwareComponent();
		case SimplecomponentPackage.HARDWARE_COMPONENT:
			return createHardwareComponent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModel createComponentModel() {
		ComponentModelImpl componentModel = new ComponentModelImpl();
		return componentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareComponent createSoftwareComponent() {
		SoftwareComponentImpl softwareComponent = new SoftwareComponentImpl();
		return softwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareComponent createHardwareComponent() {
		HardwareComponentImpl hardwareComponent = new HardwareComponentImpl();
		return hardwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplecomponentPackage getSimplecomponentPackage() {
		return (SimplecomponentPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplecomponentPackage getPackage() {
		return SimplecomponentPackage.eINSTANCE;
	}

} //SimplecomponentFactoryImpl
