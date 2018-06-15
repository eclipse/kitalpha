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
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IConfigurationHandler;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ResourceManager;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class ConfigurationHandler extends WorkspaceManager.ElementHandler implements IConfigurationHandler {

	public ConfigurationHandler(Viewpoint viewpoint, ResourceManager mgr) {
		super(viewpoint, mgr);
	}

	private PropertySet createPropertySet() {
		PropertySet propertySet = ViewpointFactory.eINSTANCE.createPropertySet();
		propertySet.setTarget(getViewpoint());
		propertySet.setVpid(EcoreUtil.generateUUID());
		getWorkspace().getPropertySets().add(propertySet);
		return propertySet;
	}

	@Override
	public void createProperty(String name) {
		if (getWorkspace() == null){
			throw new IllegalStateException("no workspace available");
		}
		PropertySet set = getCurrentPropertySet();
		Property prop = ViewpointFactory.eINSTANCE.createProperty();
		prop.setName(name);
		prop.setVpid(EcoreUtil.generateUUID());
		set.getNewProperties().add(prop);
		prop.setName(name);
		saveModel();
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

	private PropertySet getCurrentPropertySet() {
		PropertySet set = getWorkspace().getPropertySet(getViewpoint());
		if (set == null){
			set = createPropertySet();
		}
		return set;
	}

	@Override
	protected String getIdentifier(ViewpointElement elt) {
		return elt.getName();
	}

	@Override
	public List<ViewpointElement> getElements() {
		List<? extends ViewpointElement> toRemove = null;
		List<? extends ViewpointElement> toAdd = null;

		Map<String, ViewpointElement> name2elt = new HashMap<String, ViewpointElement>();
		for (ViewpointElement elt : getViewpoint().getProperties()) {
			name2elt.put(getIdentifier(elt), elt);
		}
		if (getWorkspace() != null) {
			PropertySet set = getWorkspace().getPropertySet(getViewpoint());
			if (set != null) {
				toRemove = set.getHiddenProperties();
				toAdd = set.getNewProperties();
			}
		}
		return computeElements(getViewpoint().getProperties(), toRemove, toAdd);
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
		for (ViewpointElement elt : vp.getProperties()) {
			name2prop.put(getIdentifier(elt), elt);
		}
	}
}
