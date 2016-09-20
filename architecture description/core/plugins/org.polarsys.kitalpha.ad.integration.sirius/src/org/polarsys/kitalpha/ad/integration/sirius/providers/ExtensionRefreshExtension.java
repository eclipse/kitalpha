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

package org.polarsys.kitalpha.ad.integration.sirius.providers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtension;
import org.eclipse.sirius.diagram.description.filter.CompositeFilterDescription;
import org.eclipse.sirius.diagram.description.filter.FilterDescription;
import org.polarsys.kitalpha.ad.integration.sirius.Activator;

/**
 * @author Thomas Guiu
 * 
 */
public class ExtensionRefreshExtension implements IRefreshExtension {
	private final ResourceSetImpl localSet = new ResourceSetImpl();

	public void beforeRefresh(DDiagram diagram) {
		process(diagram);
	}

	public void postRefresh(DDiagram diagram) {

	}

	public void process(DDiagram diagram) {
		CompositeFilterDescription filterDesc = (CompositeFilterDescription) localSet.getEObject(Activator.FILTER_URI, true);
		if (!contains(diagram.getActivatedFilters(), filterDesc))
		{
			diagram.getActivatedFilters().add(filterDesc);
			if (diagram.getCurrentConcern() != null)
				diagram.getCurrentConcern().getFilters().add(filterDesc);
		}
	}

	private boolean contains(EList<FilterDescription> activatedFilters, CompositeFilterDescription filterDesc) {
		for (FilterDescription desc : activatedFilters) {
			// name is the id of the element ...
			if (desc.getName().equals(filterDesc.getName()))
				return true;
		}
		return false;
	}

}