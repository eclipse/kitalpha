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

package org.polarsys.kitalpha.ad.viewpoint.integration.rules;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;

/**
 * @author Thomas Guiu
 * 
 */
public class Rules {

	private static final String EXTENSION_POINT_ID = "org.polarsys.kitalpha.ad.viewpoint.rule.providers";

	public static String getProviderName(Rule rule) {
		if (rule.getImplementation() == null || "".equals(rule.getImplementation()))
			return null;
		RuleProvider provider = getProvider(rule.getType());
		if (provider == null)
			return null;
		for (ElementDescriptor elt : provider.getAvailableImplementations()) {
			if (elt.implementation.equals(rule.getImplementation()))
				return elt.provider;
		}
		return "Cannot find the provider plugin";
	}

	public static String getName(Rule rule) {
		if (rule.getImplementation() == null || "".equals(rule.getImplementation()))
			return null;
		RuleProvider provider = getProvider(rule.getType());
		if (provider == null)
			return null;
		for (ElementDescriptor elt : provider.getAvailableImplementations()) {
			if (elt.implementation.equals(rule.getImplementation()))
				return elt.name;
		}
		return "Missing - May be not loaded yet";
	}

	public static String[] getAvailableTypes() {
		String[] types = getProviders().keySet().toArray(new String[getProviders().size()]);
		Arrays.sort(types);
		return types;
	}

	public static ElementDescriptor[] getAvailableImplementations(String type) {
		if (type == null)
			return new ElementDescriptor[0];
		RuleProvider ruleProvider = getProviders().get(type);
		if (ruleProvider != null) {
			return ruleProvider.getAvailableImplementations();
		}
		return new ElementDescriptor[0];
	}

	public static RuleProvider getProvider(String type) {
		return getProviders().get(type);
	}

	public static Map<String, RuleProvider> getProviders() {
		Map<String, RuleProvider> providers = new HashMap<String, RuleProvider>();
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement elt : configurationElements) {
			try {
				RuleProvider prov = (RuleProvider) elt.createExecutableExtension("class");
				providers.put(prov.getType(), prov);
			} catch (CoreException e) {
				AD_Log.getDefault().logError(e);
			}
		}

		return providers;
	}

	private Rules() {
		super();
		
	}
}
