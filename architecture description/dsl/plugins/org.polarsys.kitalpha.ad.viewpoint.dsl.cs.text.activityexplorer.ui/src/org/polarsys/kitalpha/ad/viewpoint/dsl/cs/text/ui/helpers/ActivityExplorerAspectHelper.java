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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.helpers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;


/**
 * Reworked from {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.helper.extensions.ActivityExplorerAspectHelper}
 * @author Faycal Abka
 *
 */
public class ActivityExplorerAspectHelper {
	
	public static final String PROVIDER_PAGES_EXT = "org.eclipse.amalgam.explorer.activity.ui.pagesProvider"; //$NON-NLS-1$
	public static final String PROVIDER_SECTIONS_EXT = "org.eclipse.amalgam.explorer.activity.ui.sectionsProvider"; //$NON-NLS-1$
	public static final String ATT_ID = "id"; //$NON-NLS-1$
	public static final String ATT_TITLE = "title"; //$NON-NLS-1$
	public static final String ATT_TABNAME = "tabName"; //$NON-NLS-1$
	public static final String ATT_NAME = "name"; //$NON-NLS-1$
	public static final String SECTION = "Section"; //$NON-NLS-1$
	
	private static final int PAGE_TYPE = 1<<0;
	private static final int SECTION_TYPE = 1<<1;
	
	
	public static List<String> getUsedViewpointPagesIDs(Viewpoint model){
		final List<String> result = new ArrayList<String>();
		Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
		
		collectAllviewpoints(model, viewpoints);		
		
		for (Viewpoint viewpoint : viewpoints) {
			List<String> viewpointPagesIDs = getViewpointPagesIDs(viewpoint);
			if (viewpointPagesIDs.isEmpty() == false)
				result.addAll(viewpointPagesIDs);
		}
		return result;
	}
	
	private static void collectAllviewpoints(Viewpoint viewpoint, Set<Viewpoint> result){
		if (viewpoint != null){
			List<Viewpoint> viewpoints = getDirectViewpointsOf(viewpoint);
			result.addAll(viewpoints);
			for (Viewpoint v : viewpoints) {
				collectAllviewpoints(v, result);
			}
		}
	}


	private static List<Viewpoint> getDirectViewpointsOf(Viewpoint model) {
		
		EList<Viewpoint> viewpoints = model.getUseViewpoint();
		EList<Viewpoint> parents = model.getParents();
		EList<Viewpoint> dependencies = model.getDependencies();

		List<Viewpoint> viewpointsCopy = new ArrayList<Viewpoint>();
		viewpointsCopy.addAll(viewpoints);
		viewpointsCopy.addAll(parents);
		viewpointsCopy.addAll(dependencies);
		
		return viewpointsCopy;
	}
	
	
	
	public static List<String> getUsedViewpointSectionsIDs(Viewpoint model){
		final List<String> result = new ArrayList<String>();
		
		Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
		
		collectAllviewpoints(model, viewpoints);
		
		for (Viewpoint viewpoint : viewpoints) 
		{
			List<String> vewpointSectionsIDs = getViewpointSectionsIDs(viewpoint);
			if (vewpointSectionsIDs.isEmpty() == false)
				result.addAll(vewpointSectionsIDs);
		}
		return result;
	}
	
	
	
	public static List<String> getViewpointPagesIDs(Viewpoint viewpoint){
		final List<String> result = new ArrayList<String>();
		final List<AbstractPage> aExPages = getAExPages(viewpoint, true);
		for (AbstractPage abstractpage : aExPages) 
		{
			if (abstractpage instanceof Page)
				result.add(((Page) abstractpage).getActivityExplorerItemID());
		}
		return result;
	}
	
	public static final List<AbstractPage> getAExPages(Viewpoint viewpoint, boolean includePageExtensions){
		List<AbstractPage> pages = new ArrayList<AbstractPage>();
		ViewpointActivityExplorer aExAspect = getAExAspect(viewpoint);
		
		if (null == aExAspect)
		{
			// This means that there is no AEx aspect in the current viewpoint.
			return pages;
		}
		
		EList<AbstractPage> ownedPages = aExAspect.getOwnedPages();
		for (AbstractPage abstractPage : ownedPages) 
		{
			if (abstractPage instanceof Page || includePageExtensions)
				pages.add(abstractPage);
		}
		return pages;
		
	}
	
	
	public static ViewpointActivityExplorer getAExAspect(Viewpoint viewpoint){
		EList<Aspect> vp_Aspects = viewpoint.getVP_Aspects();
		if (vp_Aspects.isEmpty() == false)
		{
			for (Aspect aspect : vp_Aspects) 
			{
				if (aspect instanceof ViewpointActivityExplorer)
					return (ViewpointActivityExplorer) aspect;
			}
		}
		
		return null;
	}
	
	/**
	 * @return IDs of all vpdsl sections of a viewpoint
	 */
	public static List<String> getViewpointSectionsIDs(Viewpoint viewpoint){
		final List<String> result = new ArrayList<String>();
		final List<AbstractPage> aExPages = getAExPages(viewpoint, true);
		for (AbstractPage abstractpage : aExPages) 
		{
			EList<Section> ownedSections = abstractpage.getOwnedSections();
			for (Section section : ownedSections) 
			{
				result.add(section.getActivityExplorerItemID());
			}
		}
		return result;
	}
	
	public static String getPageName(Viewpoint viewpoint, String id){
		EList<Viewpoint> useViewpoints = viewpoint.getUseViewpoint();
		
		for (Viewpoint vp : useViewpoints) {
			ViewpointActivityExplorer aExAspect = getAExAspect(vp);
			EList<AbstractPage> ownedPages = aExAspect.getOwnedPages();
			
			for (AbstractPage p : ownedPages) {
				if ((p instanceof Page) && ((Page)p).getActivityExplorerItemID().equals(id)){
					String name = ((Page)p).getName();
					if (name == null || name.isEmpty())
						return ((Page)p).getTabName();
					return name;
				}
			}
		}
		return null;
	}
	
	//Retrieve the name of the page from the Extension
	public static String getPageName(String id){
		IConfigurationElement[] config = getExtensionsFor(PROVIDER_PAGES_EXT);
		
		if (config.length != 0){
			for (IConfigurationElement iConfigurationElement : config) {
				final String _id = iConfigurationElement.getAttribute(ATT_ID);
				if (null != _id && false == _id.isEmpty() && _id.equals(id)){
					return getConfigurationName(iConfigurationElement, PAGE_TYPE);
				}
			}
		}
		return null;
	}


	private static IConfigurationElement[] getExtensionsFor(String id) {
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(id);
		return config;
	}


	private static String getConfigurationName(IConfigurationElement conf, int type) {
		String name = null;
		
		switch (type){
		case PAGE_TYPE: {
			name = conf.getAttribute(ATT_TITLE);
			if (name == null || name.isEmpty())
				return conf.getAttribute(ATT_TABNAME);
			return name;
		}
		case SECTION_TYPE: {
			return conf.getAttribute(ATT_NAME);
		}
		default: {
			return null;
		}
		} //switch
	}


	public static String getSectionName(Viewpoint viewpoint, String extendedSectionId) {
		EList<Viewpoint> useViewpoints = viewpoint.getUseViewpoint();
		
		for (Viewpoint vp : useViewpoints) {
			ViewpointActivityExplorer aExAspect = getAExAspect(vp);
			EList<AbstractPage> ownedPages = aExAspect.getOwnedPages();
			
			for (AbstractPage _p : ownedPages) {
				EList<Section> ownedSections = _p.getOwnedSections();
				for (Section _s : ownedSections) {
					String id = _s.getActivityExplorerItemID();
					
					if (id != null && !id.isEmpty() && id.equals(extendedSectionId))
						return _s.getName();
				}
			}
		}
		return null;
	}


	public static String getSectionName(String extendedSectionId) {
		IConfigurationElement[] config = getExtensionsFor(PROVIDER_SECTIONS_EXT);
		if (config.length != 0){
			for (IConfigurationElement iConfigurationElement : config) {
				final String _id = iConfigurationElement.getAttribute(ATT_ID);
				
				if (_id != null && !_id.isEmpty() && _id.equals(extendedSectionId)){
					return getConfigurationName(iConfigurationElement, SECTION_TYPE);
				}
			}
		} else {
			config = getExtensionsFor(PROVIDER_PAGES_EXT);
			if (config.length != 0){
				for (IConfigurationElement _configPage : config) {
					IConfigurationElement[] children = _configPage.getChildren(SECTION);
					for (IConfigurationElement _sectionChild : children) {
						String id = _sectionChild.getAttribute(ATT_ID);
						if (id.equals(extendedSectionId)){
							return getConfigurationName(_sectionChild, SECTION_TYPE);
						}
					}
				}
			}
		}
		return null;
	}
	
}
