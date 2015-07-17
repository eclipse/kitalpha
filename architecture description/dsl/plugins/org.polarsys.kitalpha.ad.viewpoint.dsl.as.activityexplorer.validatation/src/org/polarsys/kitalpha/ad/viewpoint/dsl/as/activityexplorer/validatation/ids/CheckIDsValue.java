/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.ids;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Pages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;


/**
 * 
 * @author Faycal Abka
 *
 */
public class CheckIDsValue implements IAdditionalConstraint {

	public CheckIDsValue() {
	}

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof ActivityExplorerItem;
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		
		ActivityExplorerItem item = (ActivityExplorerItem)data;
		ViewpointActivityExplorer viewpointActivityExplorer = (ViewpointActivityExplorer)((EObject) data).eContainer().eContainer();
		List<String> ids = getAllActivityExplorerIdsExceptItem(viewpointActivityExplorer, item);
		
		String id = item.getActivityExplorerItemID();
		
		if (ids.contains(id))
			return ValidationStatus.Error;
		
		return ValidationStatus.Ok;
	}
	
	public String getMessage(ValidationStatus status, Object object) {
		ActivityExplorerItem item = (ActivityExplorerItem)object;
		String name = item.getName();
		
		return Messages.bind(Messages.DuplicatedActivityExplorerId, name);
	}
	
	
	


	private List<String> getAllActivityExplorerIdsExceptItem(ViewpointActivityExplorer viewpointActivityExplorer, ActivityExplorerItem item) {
		List<String> ids = new ArrayList<String>();
		
		List<Page> pages = getPages(viewpointActivityExplorer);
		
		for (Page page : pages) {
			if (page != item){
				String id = page.getActivityExplorerItemID();
				ids.add(id);
			}
		}
		
		List<SectionExtension> sections = getSections(viewpointActivityExplorer);
		
		for (SectionExtension section : sections) {
			
			if (section != item){
				String id = section.getActivityExplorerItemID();
				ids.add(id);
			}
		}
		
		List<ActivityExtension> activities = getActivities(viewpointActivityExplorer);
		for (ActivityExtension activity : activities) {
			
			if (activity != item){
				String id = activity.getActivityExplorerItemID();
				ids.add(id);
			}
		}
		
		return ids;
	}
	
	private List<ActivityExtension> getActivities(ViewpointActivityExplorer v){
		Activities activities = v.getOwnedActivitiesExtension();
		return activities != null?activities.getOwnedActivitiesExtensions():new ArrayList<ActivityExtension>();
	}

	private List<SectionExtension> getSections(ViewpointActivityExplorer v) {
		Sections sections = v.getOwnedSectionsExtension();
		
		return sections != null? sections.getOwnedSectionsExtensions():new ArrayList<SectionExtension>();
	}

	private List<Page> getPages(ViewpointActivityExplorer v){
		Pages pages = v.getOwnedNewPages();
		
		return pages != null? pages.getOwnedActivityExplorerPages(): new ArrayList<Page>();
	}

}
