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

package org.polarsys.kitalpha.ad.viewpoint.handlers.workspace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IServiceHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ResourceManager;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class ServiceHandler extends WorkspaceManager.ElementHandler implements IServiceHandler {

	public ServiceHandler(Viewpoint viewpoint, ResourceManager mgr) {
		super(viewpoint, mgr);
	}

	private ServiceSet createServiceSet() {
		ServiceSet serviceSet = ViewpointFactory.eINSTANCE.createServiceSet();
		serviceSet.setTarget(getViewpoint());
		serviceSet.setVpid(EcoreUtil.generateUUID());
		getWorkspace().getServiceSets().add(serviceSet);
		return serviceSet;
	}

	@Override
	public void removeServices(List<Service> services) {
		for (Service service : services) {
			if (!isRemovable(service)){
				continue;
			}
			ServiceSet set = (ServiceSet) service.eContainer();
			set.getNewServices().remove(service);
		}
		saveModel();
	}

	@Override
	public void createService(String id, String name, String type, List<Rule> rules) {
		if (getWorkspace() == null){
			throw new IllegalStateException("no workspace available");
		}
		ServiceSet set = getCurrentServiceSet();
		Service service = ViewpointFactory.eINSTANCE.createService();
		set.getNewServices().add(service);
		service.setId(id);
		service.setName(name);
		service.setType(type);
		service.getRelatedRules().addAll(rules);
		service.setVpid(EcoreUtil.generateUUID());
		saveModel();
	}

	private ServiceSet getCurrentServiceSet() {
		ServiceSet set = getWorkspace().getServiceSet(getViewpoint());
		if (set == null){
			set = createServiceSet();
		}
		return set;
	}

	@Override
	public List<ViewpointElement> getElements() {
		List<? extends ViewpointElement> toRemove = null;
		List<? extends ViewpointElement> toAdd = null;

		Map<String, ViewpointElement> name2elt = new HashMap<String, ViewpointElement>();
		for (ViewpointElement elt : getViewpoint().getServices()) {
			name2elt.put(getIdentifier(elt), elt);
		}
		if (getWorkspace() != null) {
			ServiceSet set = getWorkspace().getServiceSet(getViewpoint());
			if (set != null) {
				toRemove = set.getHiddenServices();
				toAdd = set.getNewServices();
			}
		}
		return computeElements(getViewpoint().getServices(), toRemove, toAdd);
	}

	@Override
	public List<ViewpointElement> getElementsFromParents() {
		Map<String, ViewpointElement> name2prop = new HashMap<String, ViewpointElement>();
		for (Viewpoint vp : getViewpoint().getAllParents()) {
			processViewpoint(vp, name2prop);
		}
		processViewpoint(getViewpoint(), name2prop);
		return new ArrayList<ViewpointElement>(name2prop.values());
	}

	private void processViewpoint(Viewpoint vp, Map<String, ViewpointElement> name2prop) {
		for (ViewpointElement elt : vp.getServices()) {
			name2prop.put(getIdentifier(elt), elt);
		}
	}
}
