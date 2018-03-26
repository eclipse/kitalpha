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

package org.polarsys.kitalpha.ad.viewpoint.handlers.runtime;

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

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class ViewpointServiceHandler extends ViewpointManager.ElementHandler implements IServiceHandler {

	public ViewpointServiceHandler(Viewpoint viewpoint, ViewpointManager mgr) {
		super(viewpoint, mgr);
	}

	private ServiceSet getCurrentServiceSet() {
		if (getViewpoint().getServiceSet() == null) {
			ServiceSet serviceSet = ViewpointFactory.eINSTANCE.createServiceSet();
			serviceSet.setTarget(getViewpoint());
			serviceSet.setVpid(EcoreUtil.generateUUID());
			getViewpoint().setServiceSet(serviceSet);
		}
		return getViewpoint().getServiceSet();
	}

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

	public void createService(String id, String name, String type, List<Rule> rules) {
		ServiceSet set = getCurrentServiceSet();
		Service service = ViewpointFactory.eINSTANCE.createService();
		set.getNewServices().add(service);
		service.setName(name);
		service.setId(id);
		service.setType(type);
		service.setVpid(EcoreUtil.generateUUID());
		service.getRelatedRules().addAll(rules);
		saveModel();
	}

	public List<ViewpointElement> getElements() {
		List<ViewpointElement> services = new ArrayList<ViewpointElement>();
		services.addAll(getViewpoint().getServices());
		return services;
	}

	public List<ViewpointElement> getElementsFromParents() {
		Map<String, ViewpointElement> name2prop = new HashMap<String, ViewpointElement>();
		for (Viewpoint vp : getViewpoint().getAllParents()) {
			for (ViewpointElement elt : vp.getServices()) {
				name2prop.put(getIdentifier(elt), elt);
			}
		}
		return new ArrayList<ViewpointElement>(name2prop.values());
	}
}
