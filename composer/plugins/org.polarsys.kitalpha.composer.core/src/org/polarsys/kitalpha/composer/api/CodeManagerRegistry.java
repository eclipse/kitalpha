/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.extension.points.IGenerator;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;

/**
 * 
 * This class allows to get Strategies, Refineries and Generators contributing
 * at the Manager extensions points.
 * 
 * @author Guillaume Gebhart
 */
public class CodeManagerRegistry {

	private static IConfigurationElement config = null;

	/**
	 * Get a strategy by its name
	 * 
	 * @param name :
	 *            name of the strategy
	 * @return the IStrategy
	 * @throws CoreException
	 */
	public static IStrategy getStrategyFromName(String name) throws CoreException {
		IStrategy strategy = null;
		config = CodeManagerExtensions.getStrategyConfigElement(name);
		if(config != null){
		strategy = (IStrategy) config
				.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
		}
		return strategy;

	}

	/**
	 * Get a refinery by its name
	 * 
	 * @param name :
	 *            name of the refinery
	 * @return the IRefinery
	 * @throws CoreException
	 */
	public static IRefinery getRefineryFromName(String name) throws CoreException {
		IRefinery refinery = null;
		
		config = CodeManagerExtensions.getRefineryConfigElement(name);
		if(config != null){
			refinery = (IRefinery) config
				.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
		}
		return refinery;
	}

	/**
	 * Get a generator by its name
	 * 
	 * @param name :
	 *            name of the generator
	 * @return the IGenerator
	 * @throws CoreException
	 */
	public static IGenerator getGeneratorFromName(String name) throws CoreException {
		IGenerator generator = null;
		
		config = CodeManagerExtensions.getGeneratorConfigElement(name);
		if(config != null){
		generator = (IGenerator) config
				.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
		}
		return generator;
	}

	/**
	 * Get a strategy by its id
	 * 
	 * @param name :
	 *            id of the strategy
	 * @return the IStrategy
	 * @throws CoreException
	 */
	public static IStrategy getStrategyFromId(String id) throws CoreException {
		IStrategy strategy = null;
		
		config = CodeManagerExtensions.getStrategyConfigElementFromId(id);
		if(config != null){
		 strategy = (IStrategy) config
				.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
		}
		return strategy;

	}

	/**
	 * Get a refinery by its id
	 * 
	 * @param name :
	 *            id of the refinery
	 * @return the IRefinery
	 * @throws CoreException
	 */
	public static IRefinery getRefineryFromId(String id) throws CoreException {
		IRefinery refinery = null;
		
		config = CodeManagerExtensions.getRefineryConfigElementFromId(id);
		if(config !=null){
		refinery = (IRefinery) config
				.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
		}
		return refinery;
	}

	/**
	 * Get a generator by its id
	 * 
	 * @param id :
	 *            id of the generator
	 * @return the IGenerator
	 * @throws CoreException
	 */
	public static IGenerator getGeneratorFromId(String id) throws CoreException {
		IGenerator generator = null;
		
		config = CodeManagerExtensions.getGeneratorConfigElementFromId(id);
		if(config != null){
		generator = (IGenerator) config
				.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
		}
		return generator;
	}

}
