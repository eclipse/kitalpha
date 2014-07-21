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
package org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.*;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyFactory;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyPackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyFactoryImpl extends EFactoryImpl implements SafetyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SafetyFactory init() {
		try {
			SafetyFactory theSafetyFactory = (SafetyFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/kitalpha/emde/example/simplecomponent/safety"); //$NON-NLS-1$ 
			if (theSafetyFactory != null) {
				return theSafetyFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SafetyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyFactoryImpl() {
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
		case SafetyPackage.SIMPLE_VP_SAFETY:
			return createSimpleVPSafety();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleVPSafety createSimpleVPSafety() {
		SimpleVPSafetyImpl simpleVPSafety = new SimpleVPSafetyImpl();
		return simpleVPSafety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyPackage getSafetyPackage() {
		return (SafetyPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SafetyPackage getPackage() {
		return SafetyPackage.eINSTANCE;
	}

} //SafetyFactoryImpl
