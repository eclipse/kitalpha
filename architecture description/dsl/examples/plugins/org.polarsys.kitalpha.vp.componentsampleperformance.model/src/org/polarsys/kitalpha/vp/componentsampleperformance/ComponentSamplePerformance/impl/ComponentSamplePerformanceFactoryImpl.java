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
package org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.*;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformanceFactory;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformancePackage;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.PerformanceStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSamplePerformanceFactoryImpl extends EFactoryImpl implements ComponentSamplePerformanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentSamplePerformanceFactory init() {
		try {
			ComponentSamplePerformanceFactory theComponentSamplePerformanceFactory = (ComponentSamplePerformanceFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentSamplePerformancePackage.eNS_URI);
			if (theComponentSamplePerformanceFactory != null) {
				return theComponentSamplePerformanceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentSamplePerformanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSamplePerformanceFactoryImpl() {
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
		case ComponentSamplePerformancePackage.PERFORMANCE:
			return createPerformance();
		case ComponentSamplePerformancePackage.PERFORMANCE_STATUS:
			return createPerformanceStatus();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance createPerformance() {
		PerformanceImpl performance = new PerformanceImpl();
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceStatus createPerformanceStatus() {
		PerformanceStatusImpl performanceStatus = new PerformanceStatusImpl();
		return performanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSamplePerformancePackage getComponentSamplePerformancePackage() {
		return (ComponentSamplePerformancePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentSamplePerformancePackage getPackage() {
		return ComponentSamplePerformancePackage.eINSTANCE;
	}

} //ComponentSamplePerformanceFactoryImpl
