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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.config;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AFLabelProvider;

/**
 * @author Thomas Guiu
 * 
 */
public class ConfigurationLabelProvider extends AFLabelProvider {

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof Property)) {
			return "";
		}
		Property prop = (Property) element;

		switch (columnIndex) {
		case 0:
			return prop.getName();
		case 1:
			return prop.getType().getName();
		case 2:
			return prop.getValue();
		case 3:
			return prop.getDescription();
		}
		return "";
	}

	@Override
	protected ViewpointElement getElement(Viewpoint parent, ViewpointElement elt) {
		return parent.getPropertyByName(elt.getName());
	}

}
