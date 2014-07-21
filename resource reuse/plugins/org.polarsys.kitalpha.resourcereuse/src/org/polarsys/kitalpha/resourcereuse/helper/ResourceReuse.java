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
package org.polarsys.kitalpha.resourcereuse.helper;

import org.polarsys.kitalpha.resourcereuse.registry.LivePlatformReader;
import org.polarsys.kitalpha.resourcereuse.registry.LiveTargetPlatformReader;
import org.polarsys.kitalpha.resourcereuse.registry.LiveWorkspaceReader;
import org.polarsys.kitalpha.resourcereuse.registry.PlatformReader;
import org.polarsys.kitalpha.resourcereuse.registry.ResourceRegistry;
import org.polarsys.kitalpha.resourcereuse.registry.TargetPlatformReader;
import org.polarsys.kitalpha.resourcereuse.registry.WorkspaceReader;

/**
 * @author Thomas Guiu
 * 
 */
public class ResourceReuse {

	// private static ResourceHelper INSTANCE = createLiveHelper();

	/**
	 * This kind of helper does not work properly :(
	 */
	private static ResourceHelper createLiveHelper() {
		ResourceRegistry platformResources = new LivePlatformReader().readResources();
		ResourceRegistry targetPlatformResources = new LiveTargetPlatformReader().readResources(platformResources);
		ResourceRegistry workspaceResources = new LiveWorkspaceReader().readResources(targetPlatformResources);
		return workspaceResources;
	}

	public static ResourceHelper createHelper() {
		ResourceRegistry platformResources = new PlatformReader().readResources();
		ResourceRegistry targetPlatformResources = new TargetPlatformReader().readResources(platformResources);
		ResourceRegistry workspaceResources = new WorkspaceReader().readResources(targetPlatformResources);
		return workspaceResources;
	}

	public static ResourceHelper createRuntimeHelper() {
		ResourceRegistry platformResources = new PlatformReader().readResources();
		ResourceRegistry targetPlatformResources = new TargetPlatformReader().readResources(platformResources);
		return targetPlatformResources;
	}

	public static ResourceHelper createPlatformHelper() {
		ResourceRegistry platformResources = new PlatformReader().readResources();
		return platformResources;
	}

	public static ResourceHelper createWorkspaceHelper() {
		ResourceRegistry workspaceResources = new WorkspaceReader().readResources(null);
		return workspaceResources;
	}

	// public static ResourceHelper getHelper() {
	// return INSTANCE;
	// }

}
