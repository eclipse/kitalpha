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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpconfFactoryImpl extends EFactoryImpl implements VpconfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VpconfFactory init() {
		try {
			VpconfFactory theVpconfFactory = (VpconfFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpconf/1.0.0"); 
			if (theVpconfFactory != null) {
				return theVpconfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VpconfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpconfFactoryImpl() {
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
			case VpconfPackage.CONFIGURATION: return createConfiguration();
			case VpconfPackage.TARGET_APPLICATION: return createTargetApplication();
			case VpconfPackage.GENERATION_CONFIGURATION: return createGenerationConfiguration();
			case VpconfPackage.GENERATION: return createGeneration();
			case VpconfPackage.GDATA: return createGData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetApplication createTargetApplication() {
		TargetApplicationImpl targetApplication = new TargetApplicationImpl();
		return targetApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationConfiguration createGenerationConfiguration() {
		GenerationConfigurationImpl generationConfiguration = new GenerationConfigurationImpl();
		return generationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation createGeneration() {
		GenerationImpl generation = new GenerationImpl();
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GData createGData() {
		GDataImpl gData = new GDataImpl();
		return gData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpconfPackage getVpconfPackage() {
		return (VpconfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VpconfPackage getPackage() {
		return VpconfPackage.eINSTANCE;
	}

} //VpconfFactoryImpl
