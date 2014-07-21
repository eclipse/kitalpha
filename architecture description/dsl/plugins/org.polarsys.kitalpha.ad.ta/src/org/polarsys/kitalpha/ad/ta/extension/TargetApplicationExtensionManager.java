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

package org.polarsys.kitalpha.ad.ta.extension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.ad.ta.message.Messages;

/**
 * @author Boubekeur Zendagui
 */
public class TargetApplicationExtensionManager {
	
	/**
	 * @param targetApplicationName the name of the target application
	 * @return the target application root project name
	 */
	public static String getRootProjectName(String targetApplicationName){
		IConfigurationElement element = getTargetApplicationExtension(targetApplicationName);
		return element.getAttribute(TargetApplicationConstants.TARGET_APP_ATTRIBUTE_ROOT_PROJECT_NAME);
	}
	
	/**
	 * @param targetApplicationName the name of the target application
	 * @return return the target application root NsUri
	 */
	public static String getRootNsUri(String targetApplicationName){
		IConfigurationElement element = getTargetApplicationExtension(targetApplicationName);
		return element.getAttribute(TargetApplicationConstants.TARGET_APP_ATTRIBUTE_ROOT_NSURI);
	}
	
	/**
	 * @param targetApplicationName the name of the target application
	 * @return the description of the target application
	 */
	public static String getDescription(String targetApplicationName){
		IConfigurationElement element = getTargetApplicationExtension(targetApplicationName);
		return element.getAttribute(TargetApplicationConstants.TARGET_APP_ATTRIBUTE_DESCRIPTION);
	}
	
	/**
	 * @param targetApplicationName the name of the target application
	 * @return the target application executable class
	 * @throws CoreException
	 */
	public static Map<String, List<String>> getTargetApplicationMetaModels(String targetApplicationName) {
		Map<String, List<String>> result = new HashMap<String, List<String>>();
		IConfigurationElement element = getTargetApplicationExtension(targetApplicationName);
		
		for (IConfigurationElement configurationElement : element.getChildren()) 
		{
			if (configurationElement.getName().equals(TargetApplicationConstants.TARGET_APP_META_MODEL_CONFIGURATION_ELEMENT_NAME))
			{
				String nsuri = configurationElement.getAttribute(TargetApplicationConstants.TARGET_APP_META_MODEL_ATTRIBUTE_NSURI);
				String type = configurationElement.getAttribute(TargetApplicationConstants.TARGET_APP_META_MODEL_ATTRIBUTE_NSURI_TYEP);
				List<String> list = result.get(type);
				if (list == null)
				{
					list = new ArrayList<String>();
					result.put(type, list);
				}
				list.add(nsuri);
			}
		}
		return result;
	}
	
	/**
	 * @param targetApplicationName the name of the target application
	 * @return the target application executable class
	 * @throws CoreException
	 */
	public static ITargetApplication getTargetApplicationClass(String targetApplicationName) throws CoreException{
		IConfigurationElement element = getTargetApplicationExtension(targetApplicationName);
		return (ITargetApplication) element.createExecutableExtension(TargetApplicationConstants.TARGET_APP_ATTRIBUTE_CLASS);
	}
	
	/**
	 * @return a String array containing all target application names found in the platform  
	 */
	public static String[] getSupportedTargetApplication(){
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(
				/*GeneratorExtensionConstants.GENERATOR_SPECILIZATION_EXTENSION_ID*/
				TargetApplicationConstants.TARGET_APP_EXTENSION_ID);

		String[] result = {};
		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				if (iConfigurationElement.getName().equals(TargetApplicationConstants.TARGET_APP_CONFIGURATION_ELEMENT_NAME))
				{
					String mEnvironment = iConfigurationElement.getAttribute(TargetApplicationConstants.TARGET_APP_ATTRIBUTE_NAME);
					String[] temp = new String[result.length+1];
					System.arraycopy(result, 0, temp, 0, result.length);
					temp[result.length] = mEnvironment;
					result = new String[temp.length];
					System.arraycopy(temp, 0, result, 0, temp.length);
				}
			}
		}
		return result;
	}
	
	public static IConfigurationElement getTargetApplicationExtension(String targetApplicationName){
		// Search in the platform the corresponding extension point 
		
		if (null == targetApplicationName || 
				(null != targetApplicationName && targetApplicationName.trim().length() == 0))
		{
			throw new IllegalArgumentException(Messages.Target_Application__NameNotValid);
		}
		
		// If we are here, that means that targetApplicationName parameter value is correct
		if (null != targetApplicationName && targetApplicationName.trim().length() > 0)
		{
			IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(
					TargetApplicationConstants.TARGET_APP_EXTENSION_ID);
			if (config.length != 0)
			{
				for (IConfigurationElement iConfigurationElement : config) 
				{
					if (iConfigurationElement.getName().equals(TargetApplicationConstants.TARGET_APP_CONFIGURATION_ELEMENT_NAME))
					{
						String mEnvironment = iConfigurationElement.getAttribute(TargetApplicationConstants.TARGET_APP_ATTRIBUTE_NAME);
						if (mEnvironment.equals(targetApplicationName))
							return iConfigurationElement;
					}
				}
			}
		}
		
		// If we are here, that means that there is no target application whose name is equals 
		// to targetApplicationName parameter value
		String msg = Messages.bind(Messages.Target_Application__Unknown, targetApplicationName);
		throw new RuntimeException(msg);
	}
}
