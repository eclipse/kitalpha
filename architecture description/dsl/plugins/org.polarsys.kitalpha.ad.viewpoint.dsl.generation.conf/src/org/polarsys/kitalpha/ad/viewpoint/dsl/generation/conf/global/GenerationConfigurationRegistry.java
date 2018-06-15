/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.global;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.element.IGenerationElementConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.element.IGenerationElementDependeciesConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.element.IGenerationElementInnerConfiguration;
 
/**
 * @author Boubekeur Zendagui
 */
public class GenerationConfigurationRegistry  implements GenerationConfigurationConstants{

	/** List of available {@link IGenerationElementInnerConfiguration} */
	private static List<IGenerationElementInnerConfiguration> innerConfigurationRegistry = new ArrayList<IGenerationElementInnerConfiguration>();
	
	/** List of available {@link IGenerationElementDependeciesConfiguration} */
	private static List<IGenerationElementDependeciesConfiguration> dependenciesRegistry = new ArrayList<IGenerationElementDependeciesConfiguration>();
	
	/**
	 * Unregister all extension
	 */
	public static void unregisterAll(){
		innerConfigurationRegistry.clear();
		dependenciesRegistry.clear();
	}
	
	/**
	 * Register an {@link IGenerationElementInnerConfiguration}
	 * @param configuration {@link IGenerationElementInnerConfiguration} to register
	 */
	public static void register(IGenerationElementInnerConfiguration configuration){
		if (! innerConfigurationRegistry.contains(configuration)) {
			innerConfigurationRegistry.add(configuration);
		} else
		{
			// FIXME: Throw and exception if needed
		}
	}
	
	/**
	 * Unregister an {@link IGenerationElementInnerConfiguration}
	 * @param configuration {@link IGenerationElementInnerConfiguration} to unregister
	 */
	public static void unregister(IGenerationElementInnerConfiguration configuration){
		if (innerConfigurationRegistry.contains(configuration)) {
			innerConfigurationRegistry.remove(configuration);
		}
	}
	
	/**
	 * Register an {@link IGenerationElementDependeciesConfiguration}
	 * @param configuration {@link IGenerationElementInnerConfiguration} to register
	 */
	public static void register(IGenerationElementDependeciesConfiguration configuration){
		if (! dependenciesRegistry.contains(configuration)) {
			dependenciesRegistry.add(configuration);
		} else
		{
			// FIXME: Throw and exception if needed
		}
	}
	
	/**
	 * Unregister an {@link IGenerationElementDependeciesConfiguration}
	 * @param configuration {@link IGenerationElementInnerConfiguration} to unregister
	 */
	public static void unregister(IGenerationElementDependeciesConfiguration configuration){
		if (dependenciesRegistry.contains(configuration)) {
			dependenciesRegistry.remove(configuration);
		}
	}
	
	/**
	 * Initialize generation configuration extension.
	 * @throws CoreException
	 */
	public static void initConfigurationExtensionRegistry() throws CoreException{
		IExtension[] tExtensions = Platform.getExtensionRegistry().getExtensionPoint(GEN_CONF_EXTENSION_ID).getExtensions();
		if (tExtensions.length > 0)
		{
			for (IExtension iExtension : tExtensions)
			{
				IConfigurationElement[] configurationElements = iExtension.getConfigurationElements();
				if (configurationElements.length > 0)
				{
					for (IConfigurationElement iConfigurationElement : configurationElements) 
					{
						if (iConfigurationElement.getName().equals(GEN_CONF_INNER_CONFIGURATION_ELEMENT_NAME))
						{
							IGenerationElementInnerConfiguration configuration = 
									(IGenerationElementInnerConfiguration) iConfigurationElement.createExecutableExtension(GEN_CONF_ATTRIBUTE_CLASS);
							GenerationConfigurationRegistry.register(configuration);
						}
					}
				}
			}
		}
	}
	
	/**
	 * Return an {@link IGenerationElementInnerConfiguration} associated with a {@link GenerationElement} 
	 * if it was registered 
	 * <p>
	 * <b>FIXME:</b> if there is no {@link IGenerationElementInnerConfiguration} associated with the 
	 * current {@link GenerationElement}:
	 * <ul>
	 *   <li>May be return a super class configuration</li>
	 * </ul>
	 * </p>
	 * 
	 * @param element a {@link GenerationElement} we want to configure
	 * @return an {@link IGenerationElementInnerConfiguration} that will configure the GenerationElement, 
	 * or null if there is no configuration associated with this element class
	 */
	public static IGenerationElementInnerConfiguration getInnerConfigurationFor(GenerationElement element) {
		for (IGenerationElementInnerConfiguration configuration : innerConfigurationRegistry) 
		{
			if (checkConfigurationClass(element, configuration)) {
				return configuration;
			}
		}
		return null;
	}
	
	/**
	 * Return an {@link IGenerationElementDependeciesConfiguration} associated with a {@link GenerationElement} 
	 * if it was registered 
	 * <p>
	 * <b>FIXME:</b> if there is no {@link IGenerationElementDependeciesConfiguration} associated with the 
	 * current {@link GenerationElement}:
	 * <ul>
	 *   <li>May be return a super class configuration</li>
	 * </ul>
	 * </p>
	 * 
	 * @param element a {@link GenerationElement} we want to configure
	 * @return an {@link IGenerationElementDependeciesConfiguration} that will check dependencies of the 
	 * {@link GenerationElement}, or null if there is no configuration associated with this element class
	 */
	public static IGenerationElementDependeciesConfiguration getDependenciesConfigurationFor(GenerationElement element) {
		for (IGenerationElementDependeciesConfiguration configuration : dependenciesRegistry) 
		{
			if (checkConfigurationClass(element, configuration)) {
				return configuration;
			}
		}
		return null;
	}
	
	/**
	 * Check if a {@link IGenerationElementConfiguration}is defined to configure a given {@link GenerationElement}
	 * @param element {@link GenerationElement}for which we seek an {@link IGenerationElementConfiguration}
	 * @param configuration an {@link IGenerationElementConfiguration} to check
	 * @return True if configuration is can configure element, False else.
	 */
	private static boolean checkConfigurationClass(GenerationElement element, IGenerationElementConfiguration configuration){
		Class<? extends GenerationElement> clazz = configuration.getElementClass();
		if (element.getClass().equals(clazz))
		{
			return true;
		}
		else
		{
			for (Class<?> interfaze : element.getClass().getInterfaces()) 
			{
				if (interfaze.equals(clazz)) {
					return true;
				}
			}
		}
		return false;
	}
	
}
