/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/




package org.polarsys.kitalpha.transposer.rules.handler;

import org.polarsys.kitalpha.transposer.rules.handler.rules.RulesPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.ApiPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.util.ApiValidator;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.util.CommonValidator;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributionPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.util.ContributionValidator;

import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.util.RuntimeValidator;

import org.polarsys.kitalpha.transposer.rules.handler.rules.util.RulesValidator;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EValidator;

import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the Mapping model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class MappingPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MappingPlugin INSTANCE = new MappingPlugin();

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
	public MappingPlugin() {
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
			// Register package validator for RulesPackage
			EValidator.Registry.INSTANCE.put(
				RulesPackage.eINSTANCE, 
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return RulesValidator.INSTANCE;
					}
				}
			);
			// Register package validator for ApiPackage
			EValidator.Registry.INSTANCE.put(
				ApiPackage.eINSTANCE, 
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return ApiValidator.INSTANCE;
					}
				}
			);
			// Register package validator for CommonPackage
			EValidator.Registry.INSTANCE.put(
				CommonPackage.eINSTANCE, 
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return CommonValidator.INSTANCE;
					}
				}
			);
			// Register package validator for RuntimePackage
			EValidator.Registry.INSTANCE.put(
				RuntimePackage.eINSTANCE, 
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return RuntimeValidator.INSTANCE;
					}
				}
			);
			// Register package validator for ContributionPackage
			EValidator.Registry.INSTANCE.put(
				ContributionPackage.eINSTANCE, 
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return ContributionValidator.INSTANCE;
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
			// Unregister package validator for RulesPackage
			EValidator.Registry.INSTANCE.remove(
				RulesPackage.eINSTANCE
			);
			// Unregister package validator for ApiPackage
			EValidator.Registry.INSTANCE.remove(
				ApiPackage.eINSTANCE
			);
			// Unregister package validator for CommonPackage
			EValidator.Registry.INSTANCE.remove(
				CommonPackage.eINSTANCE
			);
			// Unregister package validator for RuntimePackage
			EValidator.Registry.INSTANCE.remove(
				RuntimePackage.eINSTANCE
			);
			// Unregister package validator for ContributionPackage
			EValidator.Registry.INSTANCE.remove(
				ContributionPackage.eINSTANCE
			);
			super.stop(context);
		}		
	}

}
