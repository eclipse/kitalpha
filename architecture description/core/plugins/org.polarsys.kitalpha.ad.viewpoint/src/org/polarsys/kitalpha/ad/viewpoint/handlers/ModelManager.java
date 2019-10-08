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

package org.polarsys.kitalpha.ad.viewpoint.handlers;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.runtime.ViewpointConfigurationHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.runtime.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.handlers.runtime.ViewpointMetamodelHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.runtime.ViewpointMiscHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.runtime.ViewpointRepresentationMetamodelHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.runtime.ViewpointRuleHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.runtime.ViewpointServiceHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.workspace.ConfigurationHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.workspace.MetamodelHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.workspace.MiscHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.workspace.RepresentationHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.workspace.RuleHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.workspace.ServiceHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.workspace.WorkspaceManager;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelManager {
	private ResourceManager resourceMgr;
	private IConfigurationHandler configurationHandler;
	private IRuleHandler ruleHandler;
	private IServiceHandler serviceHandler;
	private IRepresentationHandler representationHandler;
	private IMetamodelHandler metamodelHandler;
	private IMiscHandler miscHandler;
	private boolean local;

	public boolean isLocal() {
		return local;
	}

	public IMetamodelHandler getMetamodelHandler() {
		return metamodelHandler;
	}

	public IMiscHandler getMiscHandler() {
		return miscHandler;
	}

	public IConfigurationHandler getConfigurationHandler() {
		return configurationHandler;
	}

	public IRuleHandler getRuleHandler() {
		return ruleHandler;
	}

	public IServiceHandler getServiceHandler() {
		return serviceHandler;
	}

	public void addListener(ModelListener list) {
		resourceMgr.addListener(list);
	}

	public void removeListener(ModelListener list) {
		resourceMgr.removeListener(list);
	}

	public IRepresentationHandler getRepresentationHandler() {
		return representationHandler;
	}

	public ResourceManager getResourceManager() {
		return resourceMgr;
	}

	public boolean isRemovable(ViewpointElement element) {
		if (element instanceof Property){
			return getConfigurationHandler().isRemovable(element);
		}
		if (element instanceof Rule){
			return getRuleHandler().isRemovable(element);
		}
		if (element instanceof Service){
			return getServiceHandler().isRemovable(element);
		}
		throw new IllegalStateException();
	}

	public void dispose() {
		resourceMgr.dispose();
		configurationHandler = null;
		serviceHandler = null;
		ruleHandler = null;
		resourceMgr = null;
	}

	public static ModelManager createViewpointManager(Viewpoint vp) {
		ViewpointManager mgr = new ViewpointManager(vp);
		ModelManager mmgr = new ModelManager();
		mmgr.resourceMgr = mgr;
		mmgr.local = false;
		mmgr.ruleHandler = new ViewpointRuleHandler(vp, mgr);
		mmgr.configurationHandler = new ViewpointConfigurationHandler(vp, mgr);
		mmgr.serviceHandler = new ViewpointServiceHandler(vp, mgr);
		mmgr.metamodelHandler = new ViewpointMetamodelHandler(vp, mgr);
		mmgr.miscHandler = new ViewpointMiscHandler(vp, mgr);
		mmgr.representationHandler = new ViewpointRepresentationMetamodelHandler(vp, mgr);
		return mmgr;
	}

	public static ModelManager createWorkspaceManager(Viewpoint viewpoint) {
		ResourceManager mgr = WorkspaceManager.INSTANCE;
		ModelManager mmgr = new ModelManager();
		mmgr.resourceMgr = mgr;
		mmgr.local = true;
		mmgr.miscHandler = new MiscHandler(viewpoint, mgr);
		mmgr.metamodelHandler = new MetamodelHandler(viewpoint, mgr);
		mmgr.ruleHandler = new RuleHandler(viewpoint, mgr);
		mmgr.configurationHandler = new ConfigurationHandler(viewpoint, mgr);
		mmgr.serviceHandler = new ServiceHandler(viewpoint, mgr);
		mmgr.representationHandler = new RepresentationHandler(viewpoint, mgr);
		return mmgr;
	}

}
