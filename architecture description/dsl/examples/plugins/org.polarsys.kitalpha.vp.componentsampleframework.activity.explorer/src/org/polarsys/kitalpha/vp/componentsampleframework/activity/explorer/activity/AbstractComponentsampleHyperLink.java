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

import java.util.Vector;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.ActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.BasicSessionActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.CommonActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.statushandlers.StatusManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.Activator;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.constants.IComponentSampleConstants;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.page.ComponentSampleViewpointManagementPagePage;
import org.polarsys.kitalpha.vp.componentsampleframework.internal.activity.explorer.helper.ComponentSampleViewpointsHelper;
import org.polarsys.kitalpha.vp.componentsampleframework.internal.activity.explorer.notification.INotifer;

/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class AbstractComponentsampleHyperLink implements IHyperlinkListener, INotifer {
	
	@Override
	public void linkEntered(HyperlinkEvent e) {
	}

	@Override
	public void linkExited(HyperlinkEvent e) {
	}

	@Override
	public abstract void linkActivated(HyperlinkEvent e);
	
	
	protected void _linkActivated(HyperlinkEvent e, String vpid)
	{
		try {
			ActivityExplorerPage page = (BasicSessionActivityExplorerPage) getPage(IComponentSampleConstants.VIEWPOINTS_MANAGEMENT_PAGE_ID);
			
			ComponentSampleViewpointsHelper.handleViewpointActivation(e.getLabel(), vpid);
			notify(page, vpid);
			
		} catch (ViewpointActivationException e1) {
			
			IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID, "An error was occurred. Please see the details for more errors.", e1);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		}
	}
	

	public static CommonActivityExplorerPage getPage(String pageId)
	{
		Vector<CommonActivityExplorerPage> pages = ActivityExplorerManager.INSTANCE.getEditor().getPages();
		
		for (CommonActivityExplorerPage abstractActivityExplorerPage : pages) {
			if (abstractActivityExplorerPage.getId().toLowerCase().equalsIgnoreCase(pageId))
			{
				return abstractActivityExplorerPage;
			}
		}
		
		return null;
	}
	
	
	public void notify(ActivityExplorerPage page, String vpid)
	{
		if (page instanceof ComponentSampleViewpointManagementPagePage)
		{
			((ComponentSampleViewpointManagementPagePage)page).processNotification(vpid);
		}
	}

}
