/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.helper.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.helper.exception.SelfContainedAspectException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.PageExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */
public class ActivityExplorerAspectHelper {

	/**
	 * @return IDs of all vpdsl pages accessible by viewpoint dependencies
	 * @throws SelfContainedAspectException 
	 */
	public static List<String> getUsedViewpointPagesIDs(EObject anyModelElement) throws SelfContainedAspectException{
		final List<String> result = new ArrayList<String>();
		List<Viewpoint> usedViewpoints = getUsedViewpoints(anyModelElement);
		for (Viewpoint viewpoint : usedViewpoints) 
		{
			List<String> viewpointPagesIDs = getViewpointPagesIDs(viewpoint);
			if (!viewpointPagesIDs.isEmpty())
			{
				result.addAll(viewpointPagesIDs);
			}
		}
		return result;
	}
	
	/**
	 * @return IDs of all vpdsl pages accessible by viewpoint dependencies
	 * @throws SelfContainedAspectException 
	 */
	public static List<String> getUsedViewpointSectionsIDs(EObject anyModelElement) throws SelfContainedAspectException{
		final List<String> result = new ArrayList<String>();
		List<Viewpoint> usedViewpoints = getUsedViewpoints(anyModelElement);
		for (Viewpoint viewpoint : usedViewpoints) 
		{
			List<String> vewpointSectionsIDs = getViewpointSectionsIDs(viewpoint);
			if (!vewpointSectionsIDs.isEmpty())
			{
				result.addAll(vewpointSectionsIDs);
			}
		}
		return result;
	}
	
	
	/**
	 * @return IDs of all vpdsl pages of a viewpoint
	 */
	public static List<String> getViewpointPagesIDs(EObject anyModelElement){
		final List<String> result = new ArrayList<String>();
		final List<AbstractPage> aExPages = getAExPages(anyModelElement, false);
		for (AbstractPage abstractpage : aExPages) 
		{
			Page page = (Page) abstractpage;
			result.add(page.getActivityExplorerItemID());
		}
		return result;
	}
	
	
	/**
	 * @return IDs of all vpdsl sections of a viewpoint
	 */
	public static List<String> getViewpointSectionsIDs(EObject anyModelElement){
		final List<String> result = new ArrayList<String>();
		final List<AbstractPage> aExPages = getAExPages(anyModelElement, true);
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
	
	/**
	 * @param anyModelElement any element of a viewpoint
	 * @param includePageExtensions if True, add page extensions in the result, remove them otherwise.
	 * @return a {@link List} of element of type {@link Page} and, if includePageExtensions is true,  {@link PageExtension}
	 */
	public static final List<AbstractPage> getAExPages(EObject anyModelElement, boolean includePageExtensions){
		List<AbstractPage> pages = new ArrayList<AbstractPage>();
		ViewpointActivityExplorer aExAspect = getAExAspect(anyModelElement);
		if (null == aExAspect)
		{
			// This means that there is no AEx aspect in the current viewpoint.
			return pages;
		}
		
		EList<AbstractPage> ownedPages = aExAspect.getOwnedPages();
		for (AbstractPage abstractPage : ownedPages) 
		{
			if (abstractPage instanceof Page || includePageExtensions) {
				pages.add(abstractPage);
			}
		}
		return pages;
	}
	
	/**
	 * Return the aspect object.
	 * @param anyModelElement any element of a viewpoint
	 * @return the {@link ViewpointActivityExplorer} aspect
	 */
	public static final ViewpointActivityExplorer getAExAspect(EObject anyModelElement){
		EObject rootContainer = EcoreUtil.getRootContainer(anyModelElement);
		if (rootContainer instanceof Viewpoint)
		{
			Viewpoint viewpoint = (Viewpoint) rootContainer;
			EList<Aspect> vpAspects = viewpoint.getVP_Aspects();
			if (!vpAspects.isEmpty())
			{
				for (Aspect aspect : vpAspects) 
				{
					if (aspect instanceof ViewpointActivityExplorer) {
						return (ViewpointActivityExplorer) aspect;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * @param anyModelElement any element of a viewpoint
	 * @return Return the list of used {@link Viewpoint} by the viewpoint containing the anyModelElement object
	 * @throws SelfContainedAspectException 
	 */
	private static List<Viewpoint> getUsedViewpoints(EObject anyModelElement) throws SelfContainedAspectException{
		List<Viewpoint> result = new ArrayList<Viewpoint>();
		EObject rootContainer = EcoreUtil.getRootContainer(anyModelElement);
		if (rootContainer instanceof Viewpoint)
		{
			final Viewpoint viewpoint = (Viewpoint) rootContainer;
			final EList<Viewpoint> usedViewpoints = viewpoint.getUseViewpoint();
			if (!usedViewpoints.isEmpty())
			{
				result.addAll(usedViewpoints);
			}
			
			final EList<Viewpoint> parentViewpoint = viewpoint.getParents();
			if (!parentViewpoint.isEmpty())
			{
				result.addAll(parentViewpoint);
			}
			
			final EList<Viewpoint> dependencyViewpoint = viewpoint.getDependencies();
			if (!dependencyViewpoint.isEmpty())
			{
				result.addAll(dependencyViewpoint);
			}
			
			List<Viewpoint> result2 = new ArrayList<Viewpoint>();
			for (Viewpoint iViewpoint : result) 
			{
				final List<Viewpoint> recursiveViewpoints = getUsedViewpoints(iViewpoint);
				if (!recursiveViewpoints.isEmpty())
				{
					result2.addAll(recursiveViewpoints);
				}
			}
			
			if (!result2.isEmpty()) 
			{
				result.addAll(result2);
			}
		}
		else
		{
			throw new SelfContainedAspectException();
		}
		
		return result;
	}
}
