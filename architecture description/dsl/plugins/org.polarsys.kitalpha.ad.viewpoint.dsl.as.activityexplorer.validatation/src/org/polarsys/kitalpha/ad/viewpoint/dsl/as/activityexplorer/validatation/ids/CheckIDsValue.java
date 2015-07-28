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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.AbstractSection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;


/**
 * 
 * @author Faycal Abka, Boubekeur Zendagui
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

		// First Handle All available Pages.
		List<Page> pages = getAllPages(viewpointActivityExplorer);
		if (pages.contains(item))
			pages.remove(item);
		
		for (Page page : pages) 
		{
			final String id = page.getActivityExplorerItemID();
			if (id.trim().length() > 0)
				ids.add(id);
		}

		// Second: Handle All available Sections.
		List<Section> sections = getAllSections(viewpointActivityExplorer);
		if (sections.contains(item))
			sections.remove(item);
		
		for (Section section : sections) 
		{
			final String id = section.getActivityExplorerItemID();
			if (id.trim().length() > 0)
				ids.add(id);
		}
		
		// Third: Handle All available Sections.
		List<Activity> activities = getActivities(viewpointActivityExplorer);
		if (activities.contains(item))
			activities.remove(item);
		
		for (Activity activity : activities) 
		{
			String id = activity.getActivityExplorerItemID();
			if (id.trim().length() > 0)
				ids.add(id);
		}
		
		return ids;
	}
	
	/**
	 * Return all Pages or Page Extensions defined 
	 * @param viewpointActivityExplorer
	 * @return
	 */
	private List<Page> getAllPages(ViewpointActivityExplorer viewpointActivityExplorer){
		List<Page> result = new ArrayList<Page>();
		List<AbstractPage> abstractPages = viewpointActivityExplorer.getOwnedPages();
		for (AbstractPage abstractPage : abstractPages) 
		{
			if (abstractPage instanceof Page)
				result.add((Page)abstractPage);
		}
		return result;
	}
	/**
	 * Return all Section defined in all Pages.
	 * @param viewpointActivityExplorer
	 * @return
	 */
	private List<Section> getAllSections(ViewpointActivityExplorer viewpointActivityExplorer) {
		List<Section> result = new ArrayList<Section>();
		
		final List<Page> pages = getAllPages(viewpointActivityExplorer);
		for (Page page : pages) 
		{
			final List<Section> pageSections = page.getOwnedSections();
			if (false == pageSections.isEmpty())
				result.addAll(pageSections);
		}
		
		return result;
	}

	/**
	 * Return all Activities defined in all Section.
	 * @param viewpointActivityExplorer
	 * @return
	 */
	private List<Activity> getActivities(ViewpointActivityExplorer viewpointActivityExplorer){
		List<Activity> result = new ArrayList<Activity>();
		List<Section> sections = getAllSections(viewpointActivityExplorer);
		
		for (Section section : sections) 
		{
			final List<Activity> sectionActivities = section.getOwnedActivities();
			if (false == sectionActivities.isEmpty())
				result.addAll(sectionActivities);
		}
		
		return result;
	}

}
