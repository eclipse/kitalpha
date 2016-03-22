/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class VpDslConfigurationHelper {
	
	public static final String VIEWPOINT_VERSION_DEFAULT = "0.0.0";
	public static final String VIEWPOINT_EE_DEFAULT = "JavaSE-1.6";
	
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
	 * @return the Viewpoint <code> Version </code> specified in the {@link Release} configuration Element
	 */
	public static String getViewpointVersion(Object object){
		final Release release = getViewpointConfigurationElement(object, Release.class);
		return release != null ? release.getViewpointVersion().toString() : VIEWPOINT_VERSION_DEFAULT;
	}
	
	/**
	 * @param object any model element
	 * @return the Viewpoint <code> Description </code> specified in the {@link Release} configuration Element
	 */
	public static String getViewpointDescription(Object object){
		final Release release = getViewpointConfigurationElement(object, Release.class);
		return release != null ? release.getViewpointDescription() : "";
	}
	
	/**
	 * @param object any model element
	 * @return à {@link EList} of <code> Required Execution Environment </code> specified in the {@link Release} configuration Element
	 */
	@SuppressWarnings("serial")
	public static EList<String> getViewpointRequiredExecutionEnvironmentList(Object object){
		final Release release = getViewpointConfigurationElement(object, Release.class);
		return release != null ? release.getRequiredExecutionEnvironment() : new BasicEList<String>(){{add(VIEWPOINT_EE_DEFAULT);}};
	}
	
	/**
	 * @param object any model element
	 * @return a {@link String} containing <code> Required Execution Environment </code> specified in the {@link Release} 
	 * configuration Element separated by a comma.
	 */
	public static String getViewpointRequiredExecutionEnvironment(Object object){
		final Release release = getViewpointConfigurationElement(object, Release.class);
		String result = null;
		if ( release != null )
		{
			final EList<String> requiredEE = release.getRequiredExecutionEnvironment();
			if (! requiredEE.isEmpty())
			{
				for (String iEE : requiredEE) 
				{
					if (result == null)
					{
						result = iEE;
					}
					else
					{
						result += ", " + iEE;
					}
				}
			}
			
		}
		return result != null ? result : VIEWPOINT_EE_DEFAULT;
	}
	
	
	/**
	 * @param object any model element
	 * @return the Target Application specified in the configuration element
	 */
	public static String getTargetApplication(Object object){
		final TargetApplication ta = getViewpointConfigurationElement(object, TargetApplication.class);
		return ta != null ? ta.getType() : null;
	}
	
	/**
	 * 
	 * @param object any model element
	 * @return  The Project Name specified in the configuration element
	 */
	public static String getRootProjectName(Object object){
		final GenerationConfiguration configuration = getViewpointConfigurationElement(object, GenerationConfiguration.class);
		return configuration != null ? configuration.getProjectName() : null;
	}
	
	/**
	 * @param object any model element
	 * @return The NsURI specified in the configuration element
	 */
	public static String getNsURI(Object object){
		final GenerationConfiguration configuration = getViewpointConfigurationElement(object, GenerationConfiguration.class);
		return configuration != null ? configuration.getNsuri() : null;
	}
	
	/**
	 * @param object object any model element
	 * @return True if model is to generate. Default value is TRUE.
	 */
	public static boolean getGenerateModel(Object object){
		final GData dataGenerationConf = getGDataElement(object);
		return dataGenerationConf != null ? dataGenerationConf.isModel() : true;
	}
	
	/**
	 * @param object object any model element
	 * @return True if Edit is to generate. Default value is TRUE.
	 */
	public static boolean getGenerateEdit(Object object){
		final GData dataGenerationConf = getGDataElement(object);
		return dataGenerationConf != null ? dataGenerationConf.isEdit() : true;
	}
	
	/**
	 * @param object object any model element
	 * @return True if Editor is to generate. Default value is FALSE
	 */
	public static boolean getGenerateEditor(Object object){
		final GData dataGenerationConf = getGDataElement(object);
		return dataGenerationConf != null ? dataGenerationConf.isEditor() : false;
	}
	
	/**
	 * @param object object any model element
	 * @return True if Test is to generate. Default value is FALSE.
	 */
	public static boolean getGenerateTest(Object object){
		final GData dataGenerationConf = getGDataElement(object);
		return dataGenerationConf != null ? dataGenerationConf.isTest() : false;
	}
	
	/**
	 * @param object object any model element
	 * @return True if JavaDoc is to generate. default value is FALSE
	 */
	public static boolean getGenerateJavaDoc(Object object){
		final GData dataGenerationConf = getGDataElement(object);
		return dataGenerationConf != null ? dataGenerationConf.isJavaDoc() : false;
	}
	
	/**
	 * @param object object any model element
	 * @return True if ecore model is to overwrite. default value is TRUE
	 */
	public static boolean getOverwriteEcore(Object object){
		final GData dataGenerationConf = getGDataElement(object);
		return dataGenerationConf != null ? dataGenerationConf.isOverwriteEcore() : true;
	}
	
	/**
	 * @param object any model element
	 * @return the {@link GData} configuration Element
	 */
	private static GData getGDataElement(Object object){
		final Generation generation = getViewpointConfigurationElement(object, Generation.class);
		if ( generation != null )
		{
			return generation.getOwnedDataGenerationConf();
		}
		return null;
	}
	
	/**
	 * Generic implementation of a configuration getter.
	 * @param object any model element
	 * @param clazz the {@link ConfigurationElement} Java Class
	 * @return the nested Configuration Element
	 */
	private static <R extends ConfigurationElement> R getViewpointConfigurationElement(Object object, Class<R> clazz){
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null)
		{
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
			{
				if (clazz.isInstance(configurationElement))
				{
					return clazz.cast(configurationElement);
				}
			}
		}
		return null;
	}
}
