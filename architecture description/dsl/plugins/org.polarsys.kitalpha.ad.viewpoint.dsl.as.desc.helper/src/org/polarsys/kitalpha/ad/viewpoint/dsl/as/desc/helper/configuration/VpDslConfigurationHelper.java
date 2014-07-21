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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class VpDslConfigurationHelper {
	
	/**
	 * @param object any model element
	 * @return the view point Configuration element
	 */
	public static Configuration getViewpointConfiguration(Object object){
		Viewpoint viewpoint;
		if (object instanceof Viewpoint)
			viewpoint = (Viewpoint) object;
		else
			viewpoint = CoreModelHelper.getDSLViewpoint(object);
		
		if (viewpoint != null)
		{
			for (Aspect aspect : viewpoint.getVP_Aspects()) 
			if (aspect instanceof Configuration)
				return (Configuration) aspect;
		}
		
		return null;
	}

	/**
	 * @param object any model element
	 * @return the Target Application specified in the configuration element
	 */
	public static String getTargetApplication(Object object){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
			{
				if (configurationElement instanceof TargetApplication)
				{
					TargetApplication targetApplication = (TargetApplication) configurationElement;
					return targetApplication.getType();
				}
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param object any model element
	 * @return  The Project Name specified in the configuration element
	 */
	public static String getRootProjectName(Object object){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
				if (configurationElement instanceof GenerationConfiguration){
					GenerationConfiguration generationConfiguration = (GenerationConfiguration) configurationElement;
					return generationConfiguration.getProjectName();
				}
		}
		return null;
	}
	
	/**
	 * @param object any model element
	 * @return The NsURI specified in the configuration element
	 */
	public static String getNsURI(Object object){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
				if (configurationElement instanceof GenerationConfiguration){
					GenerationConfiguration generationConfiguration = (GenerationConfiguration) configurationElement;
					return generationConfiguration.getNsuri();
				}
		}
		return null;
	}
	
	/**
	 * @param object object any model element
	 * @return True if model is to generate. Default value is TRUE.
	 */
	public static boolean getGenerateModel(Object object){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
			{
				if (configurationElement instanceof Generation){
					Generation generation = (Generation) configurationElement;
					GData dataGenerationConf = generation.getOwnedDataGenerationConf();
					if (dataGenerationConf != null)
						return dataGenerationConf.isModel();
				}
			}
		}
		return true;
	}
	
	/**
	 * @param object object any model element
	 * @return True if Edit is to generate. Default value is TRUE.
	 */
	public static boolean getGenerateEdit(Object object){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
			{
				if (configurationElement instanceof Generation){
					Generation generation = (Generation) configurationElement;
					GData dataGenerationConf = generation.getOwnedDataGenerationConf();
					if (dataGenerationConf != null)
						return dataGenerationConf.isEdit();
				}
			}
		}
		return true;
	}
	
	/**
	 * @param object object any model element
	 * @return True if Editor is to generate. Default value is FALSE
	 */
	public static boolean getGenerateEditor(Object object){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
			{
				if (configurationElement instanceof Generation){
					Generation generation = (Generation) configurationElement;
					GData dataGenerationConf = generation.getOwnedDataGenerationConf();
					if (dataGenerationConf != null)
						return dataGenerationConf.isEditor();
				}
			}
		}
		return false;
	}
	
	/**
	 * @param object object any model element
	 * @return True if Test is to generate. Default value is FALSE.
	 */
	public static boolean getGenerateTest(Object object){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
			{
				if (configurationElement instanceof Generation){
					Generation generation = (Generation) configurationElement;
					GData dataGenerationConf = generation.getOwnedDataGenerationConf();
					if (dataGenerationConf != null)
						return dataGenerationConf.isTest();
				}
			}
		}
		return false;
	}
	
	/**
	 * @param object object any model element
	 * @return True if JavaDoc is to generate. default value is FALSE
	 */
	public static boolean getGenerateJavaDoc(Object object){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
			{
				if (configurationElement instanceof Generation){
					Generation generation = (Generation) configurationElement;
					GData dataGenerationConf = generation.getOwnedDataGenerationConf();
					if (dataGenerationConf != null)
						return dataGenerationConf.isJavaDoc();
				}
			}
		}
		return false;
	}
	
	/**
	 * @param object object any model element
	 * @return True if ecore model is to overwrite. default value is TRUE
	 */
	public static boolean getOverwriteEcore(Object object){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
			{
				if (configurationElement instanceof Generation){
					Generation generation = (Generation) configurationElement;
					GData dataGenerationConf = generation.getOwnedDataGenerationConf();
					if (dataGenerationConf != null)
						return dataGenerationConf.isOverwriteEcore();
				}
			}
		}
		return true;
	}
}
