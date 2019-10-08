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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.rules;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.Rules;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AFLabelProvider;

/**
 * @author Thomas Guiu
 * 
 */
public class RuleLabelProvider extends AFLabelProvider {

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof Rule)) {
			return "";
		}
		Rule rule = (Rule) element;

		columnIndex++;
		String result = null;
		switch (columnIndex) {
		case 1:
			result = rule.getId();
			break;
		case 2:
			result = rule.getType();
			break;
		case 3:
			result = Rules.getName(rule);
			break;
		case 4:
			result = rule.getDescription();
			break;
		}
		if (result == null) {
			return "";
		}
		return result;
	}

	@Override
	protected ViewpointElement getElement(Viewpoint parent, ViewpointElement elt) {
		return parent.getRule(elt.getId());
	}

}
