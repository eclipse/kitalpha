/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.provider;


import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.sirius.diagram.ui.provider.DiagramUIPlugin;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.provider.CommondataEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.provider.ExpressionEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.provider.VpconfEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.provider.VpdescEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.provider.VpstylecustomizationEditPlugin;

/**
 * This is the central singleton for the Vpdiagram edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class VpdiagramEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VpdiagramEditPlugin INSTANCE = new VpdiagramEditPlugin();

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
	public VpdiagramEditPlugin() {
		super
		  (new ResourceLocator [] {
		     CommondataEditPlugin.INSTANCE,
		     DiagramUIPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     ExpressionEditPlugin.INSTANCE,
		     SiriusEditPlugin.INSTANCE,
		     VpconfEditPlugin.INSTANCE,
		     VpdescEditPlugin.INSTANCE,
		     VpstylecustomizationEditPlugin.INSTANCE,
		   });
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
	}

}
