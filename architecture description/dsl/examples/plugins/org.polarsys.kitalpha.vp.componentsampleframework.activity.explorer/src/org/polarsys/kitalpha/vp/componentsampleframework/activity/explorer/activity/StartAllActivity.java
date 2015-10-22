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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.constants.IComponentSampleConstants;

/**
 * 
 * @author Faycal Abka
 *
 */
public class StartAllActivity extends AbstractComponentsampleHyperLink {


	public StartAllActivity(EObject root) {
		super(root);
	}
	
	
	public StartAllActivity() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}
	
	

	private static final String START_LABEL = "Start All";

	@Override
	public void linkActivated(HyperlinkEvent e) {
		_linkActivated(e, null);
	}

	@Override
	protected void _linkActivated(HyperlinkEvent e, String vpid) {
		if (e.getLabel() != null && !e.getLabel().isEmpty()) {
			if (e.getLabel().equals(START_LABEL)) {
				ActivityExplorerPage page = (BasicSessionActivityExplorerPage) getPage(
						IComponentSampleConstants.VIEWPOINTS_MANAGEMENT_PAGE_ID);
				for (String _vpid : IComponentSampleConstants.ALL_COMPONENTSAMPLE_VIEWPOINTS) {
					try {
						ViewpointManager.getInstance(ActivityExplorerManager.INSTANCE.getRootSemanticModel())
								.activate(_vpid);
						notify(page, _vpid);
					} catch (ViewpointActivationException e1) {
						//Do nothing
					}
				}
			}
		}
	}
}
