/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.activity;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.ActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.BasicSessionActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.constants.IComponentSampleConstants;

/**
 * 
 * @author Faycal Abka
 *
 */
public class StopAllActivity extends AbstractComponentsampleHyperLink {

	private static final String END_LABEL = "Stop All";

	@Override
	public void linkActivated(HyperlinkEvent e) {
		_linkActivated(e, null);
	}

	@Override
	protected void _linkActivated(HyperlinkEvent e, String vpid) {
		if (e.getLabel() != null && !e.getLabel().isEmpty()) {
			if (e.getLabel().equals(END_LABEL)) {
				ActivityExplorerPage page = (BasicSessionActivityExplorerPage) getPage(
						IComponentSampleConstants.VIEWPOINTS_MANAGEMENT_PAGE_ID);

				String[] reverse = reverseTab(IComponentSampleConstants.ALL_COMPONENTSAMPLE_VIEWPOINTS);
				for (String _vpid : reverse) {
					try {
						ViewpointManager.getInstance(ActivityExplorerManager.INSTANCE.getRootSemanticModel())
								.desactivate(_vpid);
						notify(page, _vpid);
					} catch (ViewpointActivationException e1) {
						//Do nothing
					}
				}
			}
		}
	}

	private String[] reverseTab(String[] allComponentsampleViewpoints) {

		int size = allComponentsampleViewpoints.length;
		String[] res = new String[size];

		int j = 0;
		for (int i = (size - 1); i >= 0; i--) {
			res[j] = allComponentsampleViewpoints[i];
			j++;
		}

		return res;
	}
}
