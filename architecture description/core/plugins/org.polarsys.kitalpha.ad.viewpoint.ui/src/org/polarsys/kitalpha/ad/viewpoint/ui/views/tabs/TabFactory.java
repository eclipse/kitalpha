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
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IViewSite;
import org.polarsys.kitalpha.ad.common.AD_Log;

/**
 * @author Thomas Guiu
 * 
 */
public class TabFactory {

	public void createTab(String viewpointId, List<Tab> tabCollector, IViewSite site) {
		IConfigurationElement[] elts = Platform.getExtensionRegistry().getConfigurationElementsFor("org.polarsys.kitalpha.ad.viewpoint.ui.viewpointview.tab");
		Arrays.sort(elts, new Comparator<IConfigurationElement>() {

			@Override
			public int compare(IConfigurationElement o1, IConfigurationElement o2) {
				int attribute2 = Integer.parseInt(o2.getAttribute("weight"));
				int attribute1 = Integer.parseInt(o1.getAttribute("weight"));
				return attribute2 - attribute1;
			}
		});

		for (IConfigurationElement elt : elts) {
			if (!addTab(elt, viewpointId)) {
				continue;
			}
			try {
				AbstractTab tab = (AbstractTab) elt.createExecutableExtension("class");
				tab.setSite(site);
				tab.setDesignOnly(Boolean.parseBoolean(elt.getAttribute("designOnly")));
				tabCollector.add(tab);
			} catch (CoreException e) {
				AD_Log.getDefault().logError(e);
			}
		}

	}

	private boolean addTab(IConfigurationElement elt, String viewpointId) {
		String attribute = elt.getAttribute("targetViewpointIds");
		if (attribute == null) {
			return true;
		}
		attribute = attribute.trim();
		if ("".equals(attribute)) {
			return true;
		}
		for (String id : attribute.split(",")) {
			if (id.trim().equals(viewpointId)) {
				return true;
			}
		}
		return false;
	}

	public static TabFactory INSTANCE = new TabFactory();
}
