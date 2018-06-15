/*******************************************************************************
 * Copyright (c) 2015, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;


/**
 * @author Faycal Abka, Boubekeur Zendagui
 */
public class ActivityExplorerItemUniqueIDConstraint implements IAdditionalConstraint  {

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof ActivityExplorerItem;
	}
	
	@Override
	public ValidationStatus validationRules(Object data) {
		ActivityExplorerItem item = (ActivityExplorerItem)data;
		ViewpointActivityExplorer viewpointActivityExplorer = getViewpointActivityExplorer(item);
		List<String> ids = getAllActivityExplorerIdsExceptItem(viewpointActivityExplorer, item);
		String id = item.getActivityExplorerItemID();
		if (ids.contains(id)) {
			return ValidationStatus.Error;
		}
		
		return ValidationStatus.Ok;
	}
	
	@Override
	public String getMessage(ValidationStatus status, Object object) {
		ActivityExplorerItem item = (ActivityExplorerItem)object;
		String name = item.getName();
		return Messages.bind(Messages.DuplicatedActivityExplorerId, name);
	}
	
	protected ViewpointActivityExplorer getViewpointActivityExplorer(ActivityExplorerItem item){
		EObject itemCcontainer = item.eContainer();
		if (!(itemCcontainer instanceof ViewpointActivityExplorer))
		{
			while (null != itemCcontainer && !(itemCcontainer instanceof ViewpointActivityExplorer)) 
			{
				itemCcontainer = itemCcontainer.eContainer();
			}
		}
		
		if (null != itemCcontainer) {
			return (ViewpointActivityExplorer) itemCcontainer;
		}
		throw new RuntimeException(Messages.Validation_Runtime_CantLocateViewpointActivityExplorer);
	}
	
	protected List<String> getAllActivityExplorerIdsExceptItem(ViewpointActivityExplorer viewpointActivityExplorer, ActivityExplorerItem item) {
		List<String> ids = new ArrayList<String>();

		// First Handle All available Pages.
		List<Page> pages = getAllPages(viewpointActivityExplorer);
		if (pages.contains(item)) {
			pages.remove(item);
		}
		
		for (Page page : pages) 
		{
			final String id = page.getActivityExplorerItemID();
			if (id != null && id.trim().length() > 0) {
				ids.add(id);
			}
		}

		// Second: Handle All available Sections.
		List<Section> sections = getAllSections(viewpointActivityExplorer);
		if (sections.contains(item)) {
			sections.remove(item);
		}
		
		for (Section section : sections) 
		{
			final String id = section.getActivityExplorerItemID();
			if (id != null && id.trim().length() > 0) {
				ids.add(id);
			}
		}
		
		// Third: Handle All available Sections.
		List<Activity> activities = getActivities(viewpointActivityExplorer);
		if (activities.contains(item)) {
			activities.remove(item);
		}
		
		for (Activity activity : activities) 
		{
			String id = activity.getActivityExplorerItemID();
			if (id != null && id.trim().length() > 0) {
				ids.add(id);
			}
		}
		
		return ids;
	}
	
	/**
	 * Return all Pages or Page Extensions defined 
	 * @param viewpointActivityExplorer
	 * @return
	 */
	protected List<Page> getAllPages(ViewpointActivityExplorer viewpointActivityExplorer){
		List<Page> result = new ArrayList<Page>();
		List<AbstractPage> abstractPages = viewpointActivityExplorer.getOwnedPages();
		for (AbstractPage abstractPage : abstractPages) 
		{
			if (abstractPage instanceof Page) {
				result.add((Page)abstractPage);
			}
		}
		return result;
	}
	/**
	 * Return all Section defined in all Pages.
	 * @param viewpointActivityExplorer
	 * @return
	 */
	protected List<Section> getAllSections(ViewpointActivityExplorer viewpointActivityExplorer) {
		List<Section> result = new ArrayList<Section>();
		
		final List<Page> pages = getAllPages(viewpointActivityExplorer);
		for (Page page : pages) 
		{
			final List<Section> pageSections = page.getOwnedSections();
			if (!pageSections.isEmpty())
			{
				result.addAll(pageSections);
			}
		}
		
		return result;
	}

	/**
	 * Return all Activities defined in all Section.
	 * @param viewpointActivityExplorer
	 * @return
	 */
	protected List<Activity> getActivities(ViewpointActivityExplorer viewpointActivityExplorer){
		List<Activity> result = new ArrayList<Activity>();
		List<Section> sections = getAllSections(viewpointActivityExplorer);
		
		for (Section section : sections) 
		{
			final List<Activity> sectionActivities = section.getOwnedActivities();
			if (!sectionActivities.isEmpty())
			{
				result.addAll(sectionActivities);
			}
		}
		
		return result;
	}

}
