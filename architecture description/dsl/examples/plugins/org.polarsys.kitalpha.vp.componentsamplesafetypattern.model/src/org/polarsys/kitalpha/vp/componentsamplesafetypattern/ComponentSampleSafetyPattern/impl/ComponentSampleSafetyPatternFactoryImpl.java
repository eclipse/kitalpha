/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.*;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternFactory;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSampleSafetyPatternFactoryImpl extends EFactoryImpl
		implements ComponentSampleSafetyPatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentSampleSafetyPatternFactory init() {
		try {
			ComponentSampleSafetyPatternFactory theComponentSampleSafetyPatternFactory = (ComponentSampleSafetyPatternFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentSampleSafetyPatternPackage.eNS_URI);
			if (theComponentSampleSafetyPatternFactory != null) {
				return theComponentSampleSafetyPatternFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentSampleSafetyPatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleSafetyPatternFactoryImpl() {
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
		case ComponentSampleSafetyPatternPackage.SAFETY_PACKAGE:
			return createSafetyPackage();
		case ComponentSampleSafetyPatternPackage.SAFETY_MODE:
			return createSafetyMode();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ComponentSampleSafetyPatternPackage.SAFETY_PATTERN:
			return createSAFETY_PATTERNFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
		case ComponentSampleSafetyPatternPackage.SAFETY_PATTERN:
			return convertSAFETY_PATTERNToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyPackage createSafetyPackage() {
		SafetyPackageImpl safetyPackage = new SafetyPackageImpl();
		return safetyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyMode createSafetyMode() {
		SafetyModeImpl safetyMode = new SafetyModeImpl();
		return safetyMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFETY_PATTERN createSAFETY_PATTERNFromString(EDataType eDataType, String initialValue) {
		SAFETY_PATTERN result = SAFETY_PATTERN.get(initialValue);
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
	public String convertSAFETY_PATTERNToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSampleSafetyPatternPackage getComponentSampleSafetyPatternPackage() {
		return (ComponentSampleSafetyPatternPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentSampleSafetyPatternPackage getPackage() {
		return ComponentSampleSafetyPatternPackage.eINSTANCE;
	}

} //ComponentSampleSafetyPatternFactoryImpl
