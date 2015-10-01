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
package org.polarsys.kitalpha.vp.componentsampleframework.internal.activity.explorer.helper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.Activator;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.constants.IComponentSampleConstants;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentSampleViewpointsHelper {
	
	private static final String START_LABEL = "Start";
	
	public static List<String> getComponentSampleVp()
	{
		Resource[] resources = ViewpointManager.getAvailableViewpoints();
		List<String> result = new ArrayList<String>();
		
		for (Resource resource : resources) 
		{
			if (resource.getId().contains(IComponentSampleConstants.COMPONENTSAMPLE_PREFIX))
			{
				result.add(resource.getId());
			}
		}
		
		return result;
	}
	
	public static Image getImageState(String vpId) {
		final ViewpointManager vpManager = ViewpointManager.getInstance(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
		
		if (vpId.equalsIgnoreCase(IComponentSampleConstants.COMPONENTSAMPLE_FRAMEWORK))
		{
			
			if (vpManager.isActive(vpId))
			{
				return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_FRAMEWORK_ON_IMAGE_STATE);
			}
			return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_FRAMEWORK_OFF_IMAGE_STATE);
		}
		
		if (vpId.equalsIgnoreCase(IComponentSampleConstants.COMPONENTSAMPLE))
		{
			if (vpManager.isActive(vpId))
			{
				return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_ON_IMAGE_STATE);
			}
			return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_OFF_IMAGE_STATE);
		}
		
		if (vpId.equalsIgnoreCase(IComponentSampleConstants.COMPONENTSAMPLE_PERFORMANCE))
		{
			if (vpManager.isActive(vpId))
			{
				return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_PERFO_ON_IMAGE_STATE);
			}
			return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_PERFO_OFF_IMAGE_STATE);
		}
		
		if (vpId.equalsIgnoreCase(IComponentSampleConstants.COMPONENTSAMPLE_QUALITY_ASSESSMENT))
		{
			if (vpManager.isActive(vpId))
			{
				return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_QUALITY_ASSESSMENT_ON_IMAGE_STATE);
			}
			return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_QUALITY_ASSESSMENT_OFF_IMAGE_STATE);
		}
		
		if (vpId.equalsIgnoreCase(IComponentSampleConstants.COMPONENTSAMPLE_SAFETY))
		{
			if (vpManager.isActive(vpId))
			{
				return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_SAFETY_ON_IMAGE_STATE);
			}
			return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_SAFETY_OFF_IMAGE_STATE);
		}
		
		if (vpId.equalsIgnoreCase(IComponentSampleConstants.COMPONENTSAMPLE_SAFETY_PATTERN))
		{
			if (vpManager.isActive(vpId))
			{
				return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_SAFETY_PATTERN_ON_IMAGE_STATE);
			}
			return Activator.getDefault().getImage(IComponentSampleConstants.COMPONENTSAMPLE_SAFETY_PATTERN_OFF_IMAGE_STATE);
		}
		
		return Activator.getDefault().getImage(IComponentSampleConstants.UNKNOWN_VIEWPOINT_IMAGE_STATE);
	}
	
	
	public static void handleViewpointActivation(String action, String vpid) throws ViewpointActivationException
	{
		final ViewpointManager vpManager = ViewpointManager.getInstance(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
		
		if (action != null && !action.isEmpty())
		{
			if (action.equals(START_LABEL))
			{
				vpManager.activate(vpid);
			}
			else
			{
				vpManager.desactivate(vpid);
			}
		} 
		else
		{
			//Suppose used state links
			
			if (vpManager.isActive(vpid))
			{
				vpManager.desactivate(vpid);
			}
			else
			{
				vpManager.activate(vpid);
			}
		}
	}

}
