/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.extension;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.exceptions.CantContributeToPluginXml;

/**
 * @author Boubekeur Zendagui
 */

public class ConcreteSyntaxResourceInitializeManager {

	private static final String ConcreteSyntaxResourceInitialize_ExtensionPoint = 
		"org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.initializeconcretesyntaxresource"; //$NON-NLS-N$
	private static final String ConcreteSyntaxResourceInitialize_ConfElement =  "InitializeConcreteSyntaxResource"; //$NON-NLS-N$
	private static final String ConcreteSyntaxResourceInitialize_ID = "id"; //$NON-NLS-N$
	private static final String ConcreteSyntaxResourceInitialize_Label = "label"; //$NON-NLS-N$
	private static final String ConcreteSyntaxResourceInitialize_Class = "class"; //$NON-NLS-N$
	private static final String ConcreteSyntaxResourceInitialize_Default = "default"; //$NON-NLS-N$

	public static boolean isDefault(String creatorID) {
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(ConcreteSyntaxResourceInitialize_ExtensionPoint);

		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				if (iConfigurationElement.getName().toLowerCase().equals(ConcreteSyntaxResourceInitialize_ConfElement.toLowerCase()))
				{
					String id = iConfigurationElement.getAttribute(ConcreteSyntaxResourceInitialize_ID);
					if (id.equals(creatorID))
					{
						String default_ = iConfigurationElement.getAttribute(ConcreteSyntaxResourceInitialize_Default);
						if (default_ != null && default_.trim().length() > 0)
						{
							return Boolean.valueOf(default_);
						}
					}
				}
			}
		}
		return false;
	}
	
	public static boolean initializeAdditionalResource(String creatorID, 
													URI vpDescResourceURI,
													String vpShortName,
													String vpTargetPlatform,
													String vpRootProjectName,
													String vpDescriptionProjectName,
													String NsURI) throws CantInitializeConcreteSyntaxResource {
		IConcreteSyntaxResourceInitialize initializer = null;
		try 
		{
			initializer = getConcreteSyntaxResourceInitializer(creatorID);
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}

		if (initializer == null)
			throw new CantInitializeConcreteSyntaxResource();

		return initializer.initializeConcreteSyntaxResource(vpDescResourceURI, vpDescriptionProjectName);
	}

	public static StringBuffer createPluginXmlContribution(String creatorID, 
													URI vpDescResourceURI,
													String vpDescriptionProjectName) 
													throws CantContributeToPluginXml {
		IConcreteSyntaxResourceInitialize initializer = null;
		try 
		{
			initializer = getConcreteSyntaxResourceInitializer(creatorID);
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}

		if (initializer == null)
			throw new CantContributeToPluginXml();

		return initializer.createPluginXmlContribution(vpDescResourceURI, vpDescriptionProjectName);
	}

	private static IConcreteSyntaxResourceInitialize getConcreteSyntaxResourceInitializer(String creatorID) throws CoreException{
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(ConcreteSyntaxResourceInitialize_ExtensionPoint);

		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				if (iConfigurationElement.getName().toLowerCase().equals(ConcreteSyntaxResourceInitialize_ConfElement.toLowerCase()))
				{
					String id = iConfigurationElement.getAttribute(ConcreteSyntaxResourceInitialize_ID);
					if (id.equals(creatorID))
						return (IConcreteSyntaxResourceInitialize) iConfigurationElement.createExecutableExtension(ConcreteSyntaxResourceInitialize_Class);
				}
			}
		}
		return null;
	}

	public static Map<String, String> getAvailableConcreteSyntaxResourceInitializers() throws CoreException{
		IConfigurationElement[] config =Platform.getExtensionRegistry().
		getConfigurationElementsFor(ConcreteSyntaxResourceInitialize_ExtensionPoint);

		Map<String, String> result = new HashMap<String, String>();

		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				if (iConfigurationElement.getName().toLowerCase().
						equals(ConcreteSyntaxResourceInitialize_ConfElement.toLowerCase()))
				{
					String id = iConfigurationElement.getAttribute(ConcreteSyntaxResourceInitialize_ID);
					String label = iConfigurationElement.getAttribute(ConcreteSyntaxResourceInitialize_Label);
					result.put(id, (label != null && label.trim().length() != 0 ? label : id));
				}
			}
		}
		return result;
	}

}
