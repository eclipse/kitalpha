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

package org.polarsys.kitalpha.ad.af.dsl.servicies.project.extension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.ad.af.dsl.servicies.project.extension.IAFConcreteSyntaxResourceCreator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class ConcreteSyntaxResourceCreationManager {
	
	private static final String _ConcreteSyntaxResourceCreator_ExtensionPoint = 
											"org.polarsys.kitalpha.ad.af.dsl.servicies.project.concretesyntaxresource"; //$NON-NLS-N$
	private static final String _ConcreteSyntaxResourceCreator_ConfElement = "ConcreteSyntaxResourceCreator"; //$NON-NLS-N$
	private static final String _ConcreteSyntaxResourceCreator_ID = "id"; //$NON-NLS-N$
	private static final String _ConcreteSyntaxResourceCreator_Label = "label"; //$NON-NLS-N$
	private static final String _ConcreteSyntaxResourceCreator_Class = "class"; //$NON-NLS-N$
	private static final String _ConcreteSyntaxResourceCreator_Default = "default"; //$NON-NLS-N$
	
	/**
	 * Allows to fire the creation one concret syntax resource. The creation of 
	 * the resource is made by the java class referenced in the Eclipse Extension.
	 * This method look for the extension with ID is equals to the value of the 
	 * parameter creatorID and fire it method createConcreteSyntaxResource
	 * @see IConcreteSyntaxResourceCreator#createConcreteSyntaxResource(String, String, String, String, String)
	 * @param creatorID: The ID of the creator. A creator is declared by an 
	 * eclipse extension. 
	 * @param vpShortName Viewpoint short name
	 * @param vpTargetPlatform Viewpoint target application
	 * @param vpRootProjectName Viewpoint root project name
	 * @param vpDescriptionProjectName The name of the Viewpoint DSL project.
	 * @param vpNsURI The nsuri of the viewpoint
	 * @throws CantConcreteSyntaxResourceCreator
	 */
	public static void createAdditionalResource(String creatorID, 
												 String vpShortName,
												 String vpRootProjectName,
												 String vpDescriptionProjectName, 
												 List<Viewpoint> selectedViewpoint) throws Exception{
		IAFConcreteSyntaxResourceCreator creator = null;
		try 
		{
			creator = getAFConcreteSyntaxResourceCreator(creatorID);
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}
		
		if (creator == null) {
			throw new Exception("Creator ID can't be null");
		}
		
		creator.createConcreteSyntaxResource(vpShortName, vpRootProjectName, vpDescriptionProjectName, selectedViewpoint);
	}
	
	public static StringBuffer createAdditionalPluginXmlContribution(String creatorID, 
			String vpShortName,
			String vpRootProjectName,
			String vpDescriptionProjectName) throws Exception{
		IAFConcreteSyntaxResourceCreator creator = null;
		try 
		{
			creator = getAFConcreteSyntaxResourceCreator(creatorID);
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}

		if (creator == null) {
			throw new Exception("");
		}

		return creator.createPluginXmlContribution(vpShortName, vpRootProjectName, vpDescriptionProjectName);
	}
	
	/**
	 * 
	 * @param creatorID the ID of the Concrete Syntax Resource Creator
	 * @return an excecutable unit that implement the interface 
	 * {@link IConcreteSyntaxResourceCreator} 
	 * @throws CoreException
	 */
	private static IAFConcreteSyntaxResourceCreator getAFConcreteSyntaxResourceCreator(String creatorID) throws CoreException{
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(_ConcreteSyntaxResourceCreator_ExtensionPoint);

		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				if (iConfigurationElement.getName().toLowerCase().equals(_ConcreteSyntaxResourceCreator_ConfElement.toLowerCase()))
				{
					String id = iConfigurationElement.getAttribute(_ConcreteSyntaxResourceCreator_ID);
					if (id.equals(creatorID)) {
						return (IAFConcreteSyntaxResourceCreator) iConfigurationElement.createExecutableExtension(_ConcreteSyntaxResourceCreator_Class);
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Allows to check if a {@link ConcreteSyntaxResourceCreator} is defined as 
	 * a default one or not. 
	 * @param creatorID the creator ID. It value is defined in the eclipse 
	 * extension extending the extension point 
	 * org.polarsys.kitalpha.ad.af.dsl.servicies.project.concretesyntaxresource
	 * @return True if default resource edition syntax, False else.
	 * @throws CoreException
	 */
	public static boolean isDefault(String creatorID) throws CoreException{
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(_ConcreteSyntaxResourceCreator_ExtensionPoint);

		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				if (iConfigurationElement.getName().toLowerCase().equals(_ConcreteSyntaxResourceCreator_ConfElement.toLowerCase()))
				{
					String id = iConfigurationElement.getAttribute(_ConcreteSyntaxResourceCreator_ID);
					if (id.equals(creatorID))
					{
						String default_ = iConfigurationElement.getAttribute(_ConcreteSyntaxResourceCreator_Default);
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
	
	/**
	 * Allows to get all Available Concrete Syntax Resource Creators
	 * @return a Map<String, String> containg all Available Concrete Syntax 
	 * Resource Creators. Each entry of this map contains the ID of the creator 
	 * (the map entry key) and it label (the map entry value)
	 * @throws CoreException
	 */
	public static Map<String, String> getAvailableAFConcreteSyntaxResourceCreators() throws CoreException{
		IConfigurationElement[] config = Platform.getExtensionRegistry().
												getConfigurationElementsFor(_ConcreteSyntaxResourceCreator_ExtensionPoint);
		
		Map<String, String> result = new HashMap<String, String>();
		
		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				if (iConfigurationElement.getName().toLowerCase().
						equals(_ConcreteSyntaxResourceCreator_ConfElement.toLowerCase()))
				{
					String id = iConfigurationElement.getAttribute(_ConcreteSyntaxResourceCreator_ID);
					String label = iConfigurationElement.getAttribute(_ConcreteSyntaxResourceCreator_Label);
					result.put(id, (label != null && label.trim().length() != 0 ? label : id));
				}
			}
		}
		return result;
	}
	
	public static boolean isThereAFConcreteSyntaxResourceCreators() {
		IConfigurationElement[] config = Platform.getExtensionRegistry().
												getConfigurationElementsFor(_ConcreteSyntaxResourceCreator_ExtensionPoint);
		
		return config.length > 0;
	}
	
}
