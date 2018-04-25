/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;
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


	public static List<String> getUsedViewpointPagesIDs(final Viewpoint model){
		final List<String> result = new ArrayList<String>();
		final Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();

		collectAllviewpoints(model, viewpoints);

		for (final Viewpoint viewpoint : viewpoints) {
			final List<String> viewpointPagesIDs = getViewpointPagesIDs(viewpoint);
			if (!viewpointPagesIDs.isEmpty()) {
				result.addAll(viewpointPagesIDs);
			}
		}
		return result;
	}

	private static void collectAllviewpoints(final Viewpoint viewpoint, final Set<Viewpoint> result){
		if (viewpoint != null){
			final List<Viewpoint> viewpoints = getDirectViewpointsOf(viewpoint);
			result.addAll(viewpoints);
			for (final Viewpoint v : viewpoints) {
				collectAllviewpoints(v, result);
			}
		}
	}


	private static List<Viewpoint> getDirectViewpointsOf(final Viewpoint model) {

		final EList<Viewpoint> viewpoints = model.getUseViewpoint();
		final EList<Viewpoint> parents = model.getParents();
		final EList<Viewpoint> dependencies = model.getDependencies();

		final List<Viewpoint> viewpointsCopy = new ArrayList<Viewpoint>();
		viewpointsCopy.addAll(viewpoints);
		viewpointsCopy.addAll(parents);
		viewpointsCopy.addAll(dependencies);

		return viewpointsCopy;
	}



	public static List<String> getUsedViewpointSectionsIDs(final Viewpoint model){
		final List<String> result = new ArrayList<String>();

		final Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();

		collectAllviewpoints(model, viewpoints);

		for (final Viewpoint viewpoint : viewpoints)
		{
			final List<String> vewpointSectionsIDs = getViewpointSectionsIDs(viewpoint);
			if (!vewpointSectionsIDs.isEmpty()) {
				result.addAll(vewpointSectionsIDs);
			}
		}
		return result;
	}



	public static List<String> getViewpointPagesIDs(final Viewpoint viewpoint){
		final List<String> result = new ArrayList<String>();
		final List<AbstractPage> aExPages = getAExPages(viewpoint, true);
		for (final AbstractPage abstractpage : aExPages)
		{
			if (abstractpage instanceof Page) {
				result.add(((Page) abstractpage).getActivityExplorerItemID());
			}
		}
		return result;
	}

	public static final List<AbstractPage> getAExPages(final Viewpoint viewpoint, final boolean includePageExtensions){
		final List<AbstractPage> pages = new ArrayList<AbstractPage>();
		final ViewpointActivityExplorer aExAspect = getAExAspect(viewpoint);

		if (null == aExAspect)
		{
			// This means that there is no AEx aspect in the current viewpoint.
			return pages;
		}

		final EList<AbstractPage> ownedPages = aExAspect.getOwnedPages();
		for (final AbstractPage abstractPage : ownedPages)
		{
			if ((abstractPage instanceof Page) || includePageExtensions) {
				pages.add(abstractPage);
			}
		}
		return pages;

	}


	public static ViewpointActivityExplorer getAExAspect(final Viewpoint viewpoint){
		final EList<Aspect> vpAspects = viewpoint.getVP_Aspects();
		if (!vpAspects.isEmpty())
		{
			for (final Aspect aspect : vpAspects)
			{
				if (aspect instanceof ViewpointActivityExplorer) {
					return (ViewpointActivityExplorer) aspect;
				}
			}
		}

		return null;
	}

	/**
	 * @return IDs of all vpdsl sections of a viewpoint
	 */
	public static List<String> getViewpointSectionsIDs(final Viewpoint viewpoint){
		final List<String> result = new ArrayList<String>();
		final List<AbstractPage> aExPages = getAExPages(viewpoint, true);
		for (final AbstractPage abstractpage : aExPages)
		{
			final EList<Section> ownedSections = abstractpage.getOwnedSections();
			for (final Section section : ownedSections)
			{
				result.add(section.getActivityExplorerItemID());
			}
		}
		return result;
	}

	public static String getPageName(final Viewpoint viewpoint, final String id){
		final EList<Viewpoint> useViewpoints = viewpoint.getUseViewpoint();

		for (final Viewpoint vp : useViewpoints) {
			final ViewpointActivityExplorer aExAspect = getAExAspect(vp);
			final EList<AbstractPage> ownedPages = aExAspect.getOwnedPages();

			for (final AbstractPage p : ownedPages) {
				if ((p instanceof Page) && ((Page)p).getActivityExplorerItemID().equals(id)){
					final String name = ((Page)p).getName();
					if ((name == null) || name.isEmpty()) {
						return ((Page)p).getTabName();
					}
					return name;
				}
			}
		}
		return null;
	}

	//Retrieve the name of the page from the Extension
	public static String getPageName(final String id){
		final IConfigurationElement[] config = getExtensionsFor(PROVIDER_PAGES_EXT);

		if (config.length != 0){
			for (final IConfigurationElement iConfigurationElement : config) {
				final String attrId = iConfigurationElement.getAttribute(ATT_ID);
				if ((null != attrId) && (!attrId.isEmpty()) && attrId.equals(id)){
					return getConfigurationName(iConfigurationElement, PAGE_TYPE);
				}
			}
		}
		return null;
	}


	private static IConfigurationElement[] getExtensionsFor(final String id) {
		final IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(id);
		return config;
	}


	private static String getConfigurationName(final IConfigurationElement conf, final int type) {
		String name = null;

		switch (type){
		case PAGE_TYPE: {
			name = conf.getAttribute(ATT_TITLE);
			if ((name == null) || name.isEmpty()) {
				return conf.getAttribute(ATT_TABNAME);
			}
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


	public static String getSectionName(final Viewpoint viewpoint, final String extendedSectionId) {
		final EList<Viewpoint> useViewpoints = viewpoint.getUseViewpoint();

		for (final Viewpoint vp : useViewpoints) {
			final ViewpointActivityExplorer aExAspect = getAExAspect(vp);
			final EList<AbstractPage> ownedPages = aExAspect.getOwnedPages();

			for (final AbstractPage _p : ownedPages) {
				final EList<Section> ownedSections = _p.getOwnedSections();
				for (final Section _s : ownedSections) {
					final String id = _s.getActivityExplorerItemID();

					if ((id != null) && !id.isEmpty() && id.equals(extendedSectionId)) {
						return _s.getName();
					}
				}
			}
		}
		return null;
	}


	public static String getSectionName(final String extendedSectionId) {
		IConfigurationElement[] config = getExtensionsFor(PROVIDER_SECTIONS_EXT);
		if (config.length != 0){
			for (final IConfigurationElement iConfigurationElement : config) {
				final String id = iConfigurationElement.getAttribute(ATT_ID);

				if ((id != null) && !id.isEmpty() && id.equals(extendedSectionId)){
					return getConfigurationName(iConfigurationElement, SECTION_TYPE);
				}
			}
		} else {
			config = getExtensionsFor(PROVIDER_PAGES_EXT);
			if (config.length != 0){
				for (final IConfigurationElement _configPage : config) {
					final IConfigurationElement[] children = _configPage.getChildren(SECTION);
					for (final IConfigurationElement _sectionChild : children) {
						final String id = _sectionChild.getAttribute(ATT_ID);
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
