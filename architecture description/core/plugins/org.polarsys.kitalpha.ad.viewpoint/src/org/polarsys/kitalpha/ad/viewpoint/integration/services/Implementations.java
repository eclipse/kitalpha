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

package org.polarsys.kitalpha.ad.viewpoint.integration.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.core.PDECore;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;

/**
 * @author Thomas Guiu
 * 
 */
public class Implementations {

	private static final String EXTENSION_POINT_ID = "org.polarsys.kitalpha.ad.viewpoint.implementation.services";

	public static String toString(List<Rule> rules) {
		String str = "";
		for (Rule rule : rules) {
			if (str.length() != 0)
				str += ", ";
			str += rule.getId();
		}
		return str;
	}

	public static boolean hasProvider(Bundle bundle) {
		IPluginModelBase model = PDECore.getDefault().getModelManager().findModel(bundle.getSymbolicName());
		if (model == null)
			return false; // occurs when a workspace vp is closed while active
		for (IPluginExtension extension : model.getExtensions().getExtensions()) {
			if (EXTENSION_POINT_ID.equals(extension.getPoint()))
				return true;
		}
		return false;

	}

	public static String[] getAvailableActionLabels() {
		Set<String> types = new HashSet<String>();
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement elt : configurationElements) {
			types.add(elt.getAttribute("label"));
		}
		String[] array = types.toArray(new String[types.size()]);
		Arrays.sort(array);
		return array;

	}

	public static String getLabel(String type) {
		if (type == null)
			return "";
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement elt : configurationElements) {
			if (elt.getAttribute("type").equals(type))
				return elt.getAttribute("label");
		}
		// Activator.getDefault().logError("Cannot find label for service type='"
		// + type + "'");
		return "Missing - May be not loaded yet";
	}

	public static String getType(String label) {
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement elt : configurationElements) {
			if (elt.getAttribute("label").equals(label))
				return elt.getAttribute("type");
		}
		AD_Log.getDefault().logError("Cannot find type for service label='" + label + "'");
		return "Unknown";
	}

	public static ServiceImplementation getInstance(Service service) throws CoreException {
		String type = service.getType();
		if (type == null || "".equals(type))
			throw new NullPointerException("No type for service " + service.getId());
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement elt : configurationElements) {
			String typeAttribute = elt.getAttribute("type");
			if (type.equals(typeAttribute))
				return (ServiceImplementation) elt.createExecutableExtension("class");
		}
		return null;
	}

	public static class LoadingException extends Exception {

		private static final long serialVersionUID = 1L;

		public LoadingException(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}

	}
}
