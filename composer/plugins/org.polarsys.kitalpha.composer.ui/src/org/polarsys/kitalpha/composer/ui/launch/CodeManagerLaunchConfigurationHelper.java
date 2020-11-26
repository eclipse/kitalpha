/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.launch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;

import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;

/**
 * Helper for {@link CodeManagerLaunchConfigurationType}.
 * 
 * @author Yann Mortier
 */
public final class CodeManagerLaunchConfigurationHelper {

	private static final String BINDING_MM_URI_CHILD = "businessMetamodelNsUriDeclaration";

	/**
	 * Avoid instantiation from external.
	 */
	private CodeManagerLaunchConfigurationHelper() {
		// empty.
	}

	/**
	 * Returns all code manager launch configuration.
	 * 
	 * @return all code manager launch configuration.
	 * @throws CoreException
	 *             if a problem occurs.
	 */
	public static ILaunchConfiguration[] getAllCodeManagerLaunchConfigurations()
			throws CoreException {
		List<ILaunchConfiguration> result = new LinkedList<ILaunchConfiguration>();

		for (ILaunchConfiguration launchConfiguration : getLaunchManager()
				.getLaunchConfigurations()) {
			if (launchConfiguration.getType() != null
					&& launchConfiguration.getType().getIdentifier() != null
					&& launchConfiguration
							.getType()
							.getIdentifier()
							.equals(
									"org.polarsys.kitalpha.code.generation.manager.ui.launch.CodeManagerConfigurationType")) {
				result.add(launchConfiguration);
			}
		}
		return result.toArray(new ILaunchConfiguration[result.size()]);
	}

	/**
	 * Returns all code manager launch configuration having the given binding
	 * URI.
	 * 
	 * @param bindingId
	 *            the binding URI.
	 * @return all code manager launch configuration having the given binding
	 *         URI.
	 * @throws CoreException
	 */
	public static ILaunchConfiguration[] getAllCodeManagerLaunchConfigurations(
			final String bindingId) throws CoreException {
		final String bindingName = CodeManagerExtensions
				.getBindingConfigElementFromId(bindingId).getAttribute(
						CodeManagerExtensions.ATT_NAME);

		final List<ILaunchConfiguration> result = new LinkedList<ILaunchConfiguration>();

		for (ILaunchConfiguration configuration : getAllCodeManagerLaunchConfigurations()) {
			String currentBindingName = configuration.getAttribute(
					ICodeManagerLaunchConfigurationConstants.GENERATION_NAME,
					"");

			if (currentBindingName != null
					&& currentBindingName.equals(bindingName)) {
				result.add(configuration);
			}
		}
		return result.toArray(new ILaunchConfiguration[result.size()]);
	}

	/**
	 * Returns all code manager launch configuration working for the given
	 * business Metamodel URI.
	 * 
	 * @param mmUri
	 *            the business metamodel URI.
	 * @return all code manager launch configuration working for the given
	 *         business Metamodel URI.
	 * @throws CoreException
	 */
	public static ILaunchConfiguration[] getAllCodeManagerLaunchConfigurationsWithMMUri(
			final String mmUri) throws CoreException {
		final Set<ILaunchConfiguration> launchConfigurations = new HashSet<ILaunchConfiguration>();

		final Set<String> bindingIds = new HashSet<String>();
		for (IConfigurationElement binding : CodeManagerExtensions
				.getAllBindingExtensions()) {
			for (IConfigurationElement businessMMUriDeclaration : binding
					.getChildren(BINDING_MM_URI_CHILD)) {
				final String uri = businessMMUriDeclaration
						.getAttribute(CodeManagerExtensions.ATT_URI);
				if (uri != null && uri.equals(mmUri)) {
					bindingIds.add(binding
							.getAttribute(CodeManagerExtensions.ATT_ID));
				}
			}
		}

		for (String id : bindingIds) {
			launchConfigurations.addAll(Arrays
					.asList(getAllCodeManagerLaunchConfigurations(id)));
		}

		return launchConfigurations
				.toArray(new ILaunchConfiguration[launchConfigurations.size()]);
	}

	private static ILaunchManager getLaunchManager() {
		return DebugPlugin.getDefault().getLaunchManager();
	}

}
