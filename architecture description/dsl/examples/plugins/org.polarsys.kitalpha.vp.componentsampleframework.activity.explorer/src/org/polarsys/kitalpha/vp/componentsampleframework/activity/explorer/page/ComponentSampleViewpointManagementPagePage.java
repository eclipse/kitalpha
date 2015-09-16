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

package org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.page;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.BasicSessionActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper.LayoutType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.Section;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Listener;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.activity.AbstractComponentsampleHyperLink;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.constants.IComponentSampleConstants;
import org.polarsys.kitalpha.vp.componentsampleframework.internal.activity.explorer.helper.ComponentSampleViewpointsHelper;
import org.polarsys.kitalpha.vp.componentsampleframework.internal.activity.explorer.notification.IReceiver;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentSampleViewpointManagementPagePage extends BasicSessionActivityExplorerPage implements IReceiver {
	
	private final Map<String, ImageHyperlink> statesHyperLinks = new HashMap<String, ImageHyperlink>();

	public ComponentSampleViewpointManagementPagePage() {
	}
	
	@Override
	protected void createFormContent(IManagedForm managedForm_p) {
		super.createFormContent(managedForm_p);
		
		FormToolkit toolkit = managedForm_p.getToolkit();
		
		Section vpSectionState = toolkit.createSection(getSectionContainer(), Section.EXPANDED | Section.TITLE_BAR);
		Composite vpComposite = FormHelper.createCompositeWithLayoutType(toolkit, vpSectionState, LayoutType.TABLEWRAP_LAYOUT, 6, true);
		vpSectionState.setClient(vpComposite);
		
		vpSectionState.setText("Viewpoints States");
		
		createViewpointsStates(vpComposite, toolkit);
		
		managedForm_p.reflow(true);
		
		ViewpointManager.INSTANCE.addListener(new Listener() {
			
			@Override
			public void hasBeenDeactivated(Resource vp) {
				processNotification(vp.getId());
			}
			
			@Override
			public void hasBeenActivated(Resource vp) {
				processNotification(vp.getId());
			}
		});
	}
	
	
	public void createViewpointsStates(Composite composite, FormToolkit toolkit)
	{
		for (String vpId : IComponentSampleConstants.ALL_COMPONENTSAMPLE_VIEWPOINTS) {
			ImageHyperlink imageLink = toolkit.createImageHyperlink(composite, SWT.WRAP);
			imageLink.setImage(ComponentSampleViewpointsHelper.getImageState(vpId));
			imageLink.setRedraw(true);
			
			statesHyperLinks.put(vpId, imageLink);
			
			
			final String __vpid = vpId;
			
			imageLink.addHyperlinkListener(new AbstractComponentsampleHyperLink() {
				@Override
				public void linkActivated(HyperlinkEvent e) {
					_linkActivated(e, __vpid);
				}
			});
		}
	}
	
	

	@Override
	public void processNotification(String vpid) {
		ImageHyperlink imageLink = statesHyperLinks.get(vpid);
		if (!imageLink.isDisposed())
		{
			imageLink.setImage(ComponentSampleViewpointsHelper.getImageState(vpid));
			imageLink.redraw();
			getManagedForm().refresh();
		}
	}
	
}
