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

package org.polarsys.kitalpha.ad.viewpoint.handlers.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IConfigurationHandler;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class ViewpointConfigurationHandler extends ViewpointManager.ElementHandler implements IConfigurationHandler {

	public ViewpointConfigurationHandler(Viewpoint viewpoint, ViewpointManager mgr) {
		super(viewpoint, mgr);
	}

	@Override
	public List<ViewpointElement> getElements() {
		List<ViewpointElement> services = new ArrayList<ViewpointElement>();
		services.addAll(getViewpoint().getProperties());
		return services;
	}

	@Override
	public void createProperty(String name) {
		PropertySet set = getCurrentPropertySet();
		Property prop = ViewpointFactory.eINSTANCE.createProperty();
		prop.setName(name);
		prop.setVpid(EcoreUtil.generateUUID());
		set.getNewProperties().add(prop);
		prop.setName(name);
		saveModel();
	}

	private PropertySet getCurrentPropertySet() {
		if (getViewpoint().getPropertySet() == null) {
			PropertySet propSet = ViewpointFactory.eINSTANCE.createPropertySet();
			propSet.setTarget(getViewpoint());
			propSet.setVpid(EcoreUtil.generateUUID());
			getViewpoint().setPropertySet(propSet);
		}
		return getViewpoint().getPropertySet();
	}

	@Override
	public void removeProperties(List<Property> properties) {
		for (Property prop : properties) {
			if (!isRemovable(prop)){
				continue;
			}
			PropertySet set = (PropertySet) prop.eContainer();
			set.getNewProperties().remove(prop);
		}
		saveModel();
	}

	@Override
	public List<ViewpointElement> getElementsFromParents() {
		Map<String, ViewpointElement> name2prop = new HashMap<String, ViewpointElement>();
		for (Viewpoint vp : getViewpoint().getAllParents()) {
			for (ViewpointElement elt : vp.getProperties()) {
				name2prop.put(getIdentifier(elt), elt);
			}
		}
		return new ArrayList<ViewpointElement>(name2prop.values());
	}

	@Override
	protected String getIdentifier(ViewpointElement elt) {
		return elt.getName();
	}

}
