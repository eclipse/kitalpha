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

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * @author Boubekeur Zendagui
 */
public class ActivityExplorerExtensionPointHelper {
	public static final String PROVIDER_PAGES_EXT = "org.eclipse.amalgam.explorer.activity.ui.pagesProvider"; //$NON-NLS-1$
	public static final String PROVIDER_SECTIONS_EXT = "org.eclipse.amalgam.explorer.activity.ui.sectionsProvider"; //$NON-NLS-1$
	public static final String ATT_ID = "id"; //$NON-NLS-1$
	public static final String SECTION = "Section"; //$NON-NLS-1$
	
	/**
	 * @return IDs of all pages provided by Page Provider extensions points
	 */
	public static List<String> getPlateformePagesIDs(){
		List<String> result = new ArrayList<String>();
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(PROVIDER_PAGES_EXT);
		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				final String id = iConfigurationElement.getAttribute(ATT_ID);
				if (null != id && !id.isEmpty())
				{
					result.add(id);
				}
			}
		}
		return result;
	}
	
	/**
	 * @return IDs of all sections provided by Section Provider and Page Provider extensions points
	 */
	public static List<String> getPlateformeSectionsIDs(){
		List<String> result = new ArrayList<String>();
		// First: handle section of Section Provider extension point
		IConfigurationElement[] configSections =Platform.getExtensionRegistry().getConfigurationElementsFor(PROVIDER_SECTIONS_EXT);
		if (configSections.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : configSections) 
			{
				final String id = iConfigurationElement.getAttribute(ATT_ID);
				if (null != id && !id.isEmpty())
				{
					result.add(id);
				}
			}
		}
		
		// Second: handle section of Page Provider extension point
		IConfigurationElement[] configPages =Platform.getExtensionRegistry().getConfigurationElementsFor(PROVIDER_PAGES_EXT);
		if (configPages.length != 0)
		{
			for (IConfigurationElement pConfigurationElement : configPages) 
			{
				IConfigurationElement[] children = pConfigurationElement.getChildren(SECTION);
				for (IConfigurationElement sConfigurationElement : children) 
				{
					final String id = sConfigurationElement.getAttribute(ATT_ID);
					if (null != id && !id.isEmpty())
					{
						result.add(id);
					}
				}
			}
		}
		return result;
	}
}
