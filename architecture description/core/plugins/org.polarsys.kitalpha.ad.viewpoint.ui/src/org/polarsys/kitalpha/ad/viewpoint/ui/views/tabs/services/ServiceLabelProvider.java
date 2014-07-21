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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.services;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.Implementations;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AFLabelProvider;

/**
 * @author Thomas Guiu
 * 
 */
public class ServiceLabelProvider extends AFLabelProvider {

	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof Service))
			return "";
		Service service = (Service) element;

		switch (columnIndex) {
		case 0:
			return ""; // use a btn
		case 1:
			return service.getId();
		case 2:
			return service.getName();
		case 3:
			return Implementations.getLabel(service.getType());
		case 5:
			return service.getDescription();
		case 4:
			return Implementations.toString(service.getRelatedRules());
		}
		return "";
	}

	@Override
	protected ViewpointElement getElement(Viewpoint parent, ViewpointElement elt) {
		return parent.getService(elt.getId());
	}

}
