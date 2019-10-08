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

package org.polarsys.kitalpha.ad.viewpoint.ui.integration.rules;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.ad.common.AD_Log;

/**
 * @author Thomas Guiu
 * 
 */
public class RuleWizards {

	public static String[] getAvailableTypes() {
		String[] types = getProviders().keySet().toArray(new String[getProviders().size()]);
		Arrays.sort(types);
		return types;
	}

	public static RuleProviderWizard getProvider(String type) {
		return getProviders().get(type);

	}

	public static Map<String, RuleProviderWizard> getProviders() {
		Map<String, RuleProviderWizard> providers = new HashMap<>();
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.polarsys.kitalpha.ad.viewpoint.ui.rule.wizard.providers");
		for (IConfigurationElement elt : configurationElements) {
			try {
				RuleProviderWizard prov = (RuleProviderWizard) elt.createExecutableExtension("class");
				providers.put(prov.getType(), prov);
			} catch (CoreException e) {
				AD_Log.getDefault().logError(e);
			}
		}

		return providers;
	}

	private RuleWizards() {
		super();
	}

}
