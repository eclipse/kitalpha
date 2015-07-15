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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Pages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.constants.IActivityExplorerExtensionsIDs;


/**
 * 
 * @author Faycal Abka
 *
 */
public class ActivityExplorerContentAssistHelper {
	
	private static final String ID_FIELD = "id";
	private static final String PAGE_FIELD = "Page";
	private static final String SECTION_FIELD = "Section";
	private static final String ACTIVITY_FIELD = "Activity";
	
	public static List<String> getActivityExplorerExtensions(final int type){

		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extension_p = null;

		switch (type)
		{
		case IActivityExplorerExtensionsIDs.PAGE:
		{
			extension_p = registry.getExtensionPoint(IActivityExplorerExtensionsIDs.PAGE_PROVIDER);
			break;
		}
		case IActivityExplorerExtensionsIDs.SECTION:
		{
			extension_p = registry.getExtensionPoint(IActivityExplorerExtensionsIDs.SECTION_PROVIDER);
			break;
		}
		case IActivityExplorerExtensionsIDs.ACTIVITY:
		{
			extension_p = registry.getExtensionPoint(IActivityExplorerExtensionsIDs.ACTIVITY_PROVIDER);
			break;
		}
		}
		

		if (extension_p == null)
		{
			//TODO log the error
			throw new RuntimeException("No Page contribution to the Activity Explorer");
		}

		IExtension[] extensions = extension_p.getExtensions();

		return collectContributionIds(extensions, type);

		
	}

	private static List<String> collectContributionIds(IExtension[] extensions, final int type) {
		
		for (IExtension iExtension : extensions) {
			IConfigurationElement[] configElts = iExtension.getConfigurationElements();
				switch (type)
				{
				case IActivityExplorerExtensionsIDs.PAGE:
				{
					return getPages(configElts);
				}
				case IActivityExplorerExtensionsIDs.SECTION:
				{
					return getSections(configElts);
				}
				case IActivityExplorerExtensionsIDs.ACTIVITY:
				{
					return getActivities(configElts);
				}
				default:
				{
					//never execute in this block
				}
			}
		}
		return Collections.emptyList();
	}

	private static List<String> getActivities(IConfigurationElement[] configElts) {
		return getIDs(configElts, ACTIVITY_FIELD);
	}

	private static List<String> getSections(IConfigurationElement[] configElts) {
		return getIDs(configElts, SECTION_FIELD);
	}

	private static List<String> getPages(IConfigurationElement[] configElts) {
		return getIDs(configElts, PAGE_FIELD);
	}
	
	private static List<String> getIDs(IConfigurationElement[] configElts, String name)
	{
		List<String> ids = new ArrayList<String>();
		
		for (IConfigurationElement c : configElts) {
			if (c.getName().equals(name))
			{
				String id = c.getAttribute(ID_FIELD);
				ids.add(id);
			}
		}
		
		return ids;
	}

	public static List<String> getNewDefinedPages(EObject model) {
		List<String> ids = new ArrayList<String>();
		
		ViewpointActivityExplorer activityExplorer = (ViewpointActivityExplorer)EcoreUtil.getRootContainer(model);
		Pages pages = activityExplorer.getOwnedNewPages();
		
		EList<Page> newPages = pages.getOwnedActivityExplorerPages();
		
		for (Page page : newPages) {
			String id = page.getActivityExplorerItemID();
			ids.add(id);
		}
		
		return ids;
	}

	public static List<String> getNewDefinedSections(EObject model) {
		List<String> ids = new ArrayList<String>();
		
		ViewpointActivityExplorer activityExplorer = (ViewpointActivityExplorer)EcoreUtil.getRootContainer(model);
		Sections sections = activityExplorer.getOwnedSectionsExtension();
		
		EList<SectionExtension> newSections = sections.getOwnedSectionsExtensions();
		
		for (SectionExtension sectionExt : newSections) {
			String id = sectionExt.getActivityExplorerItemID();
			ids.add(id);
		}
		
		return ids;
	}

	public static int getNextIndexPage(EObject model) {
		
		ViewpointActivityExplorer activityExplorer = (ViewpointActivityExplorer)EcoreUtil.getRootContainer(model);
		Pages pages = activityExplorer.getOwnedNewPages();
		
		List<Integer> indexes = collectIndexes(pages);
		
		return indexes.size() != 0?indexes.get(indexes.size() - 1) + 1:0;
	}

	private static List<Integer> collectIndexes(Pages pages) {
		List<Integer> indexes = new ArrayList<Integer>();
		EList<Page> newPages = pages.getOwnedActivityExplorerPages();
		
		for (Page page : newPages) {
			int i = page.getIndex();
			indexes.add(i);
		}
		
		Collections.sort(indexes);
		
		return indexes;
	}
	
	
}
