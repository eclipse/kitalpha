/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/




package org.polarsys.kitalpha.composer.metamodel.allocation.base.model;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.util.BaseValidator;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EValidator;

import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the Allocation model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class AllocationPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AllocationPlugin INSTANCE = new AllocationPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationPlugin() {
		super(new ResourceLocator [] {});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
		
		/**
		 * start
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */		
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);
			// Register package validator for BasePackage
			EValidator.Registry.INSTANCE.put(
				BasePackage.eINSTANCE, 
				new EValidator.Descriptor() {
					@Override
					public EValidator getEValidator() {
						return BaseValidator.INSTANCE;
					}
				}
			);
		}

		/**
		 * stop
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */		
		@Override
		public void stop(BundleContext context) throws Exception {
			// Unregister package validator for BasePackage
			EValidator.Registry.INSTANCE.remove(
				BasePackage.eINSTANCE
			);
			super.stop(context);
		}		
	}

}
