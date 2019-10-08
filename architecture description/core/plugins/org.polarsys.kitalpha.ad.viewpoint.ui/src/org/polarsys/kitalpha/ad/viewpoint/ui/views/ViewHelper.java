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

package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.plugin.PluginElement;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * @author Guillaume Gebhart
 * 
 */
public class ViewHelper {
	public static void openViews(Resource resource) {
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		for (ViewElement current : getViewIds(resource)) {
			try {
				activePage.showView(current.getId());
			} catch (PartInitException e) {
				AD_Log.getDefault().logError(e);
			}
		}
	}

	public static List<ViewElement> getViewIds(Resource resource) {
		List<ViewElement> viewIds = new ArrayList<>();
		String providerSymbolicName = resource.getProviderSymbolicName();
		IPluginModelBase bundle = PluginRegistry.findModel(providerSymbolicName);
		if (bundle == null){
			return viewIds; // occurs when a workspace vp is closed while active
		}
		for (IPluginExtension extension : bundle.getExtensions().getExtensions()) {
			if ("org.eclipse.ui.views".equals(extension.getPoint())) {
				for (IPluginObject children : extension.getChildren()) {
					if (children instanceof PluginElement) {
						PluginElement elt = (PluginElement) children;
						if (elt.getAttribute("resourceId") != null && elt.getAttribute("id") != null) {
							String id = (elt.getAttribute("id").getValue());
							String name = (elt.getAttribute("name").getValue());
							name = (name == null || name.isEmpty()) ? id :  name; 
							
							final ViewElement view = new ViewElement(id,name);
							viewIds.add(view);		
									
							
						}
					}
				}
			}
		}
		return viewIds;

	}

	private ViewHelper() {
		super();
	}

}
