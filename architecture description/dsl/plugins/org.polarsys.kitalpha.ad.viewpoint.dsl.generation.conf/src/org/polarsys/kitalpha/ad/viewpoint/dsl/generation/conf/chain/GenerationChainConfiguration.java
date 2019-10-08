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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.chain;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.element.IGenerationElementInnerConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.global.GenerationConfigurationRegistry;

/**
 * @author Boubekeur Zendagui
 */
public final class GenerationChainConfiguration {

	/**
	 * Configure a given {@link GenerationChain}. This method do the following steps :
	 * <ul>
	 *   <li>Inner configuration of {@link GenerationChain} elements (see <code>innerConfiguration(GenerationChain, boolean)</code>)</li>
	 *   <li>Dependencies between {@link GenerationChain} elements configuration (see <code>dependenciesConfiguration(GenerationChain)</code>)</li>
	 * </ul>
	 * @param generationchain the {@link GenerationChain} to configure
	 * @param clean if True, {@link GenerationChain} will be cleaned (for example, remove all not relevant {@link GenerationElement}).
	 */
	public static void configure(GenerationChain generationchain, boolean clean){
		// First: Do inner configuration of generation elements 
		innerConfiguration(generationchain, clean);
		
		// Second: Handle dependencies between generations
		dependenciesConfiguration(generationchain);
	}
	
	/**
	 * Handle dependencies between generation 
	 * @param generationchain the {@link GenerationChain} to configure
	 */
	private static void dependenciesConfiguration(GenerationChain generationchain) {
		// TODO: implements this when every generation is migrated to generation chain
		/**
		 * 1- Check dependencies of each GenerationElment. 
		 * 2- If some dependencies are satisfied, then
		 * 		 a) Check precondition of each GenerationElement
		 * 				if a precondition is not verified, then CLEAN generation chain
		 * 
		 * 3- Reorder GenerationElement depending on their dependencies
		 */
		
	}

	/**
	 * Do inner configuration of all {@link GenerationElement} of a {@link GenerationChain}.
	 * Inner configuration allows to customize the values of all {@link GenerationElement} of a given 
	 * {@link GenerationChain}
	 * 
	 * <p>
	 * Values configuration is done only if {@link GenerationElement} is relevant. 
	 * If this is not the case and if <code>clean</code> parameter value is True, 
	 * the {@link GenerationElement} will be removed from the {@link GenerationChain}
	 * </p>
	 * @param generationchain {@link GenerationChain} to configure
	 * @param clean if True, all not relevant {@link GenerationElement} will be 
	 * removed from the {@link GenerationChain}
	 */
	private static void innerConfiguration(GenerationChain generationchain, boolean clean) {
		List<GenerationElement> elementToRemove = new ArrayList<GenerationElement>();
		for (GenerationElement element : generationchain.getElements())
		{
			IGenerationElementInnerConfiguration configuration = GenerationConfigurationRegistry.getInnerConfigurationFor(element);
			if (configuration != null)
			{
				if (configuration.isRelevant(generationchain, element)) {
					configuration.configure(element);
				} else
					if (clean) {
						elementToRemove.add(element);
					}
			}
		}
		
		if (! elementToRemove.isEmpty())
		{
			for (GenerationElement generationElement : elementToRemove) 
			{
				// TODO: Output a log warning in the console.
				removeGenerationElementFrom(generationchain, generationElement);
			}
		}
	}
	
	/**
	 * Remove a given {@link GenerationElement} from a {@link GenerationChain}
	 * @param generationchain containing the element to remove
	 * @param element to remove
	 */
	private static boolean removeGenerationElementFrom(GenerationChain generationchain, GenerationElement element){
		boolean elementFound = false;
		boolean done = false;
		for (GenerationElement iElement : generationchain.getElements()) 
		{
			if (iElement instanceof GenerationChain)
			{
				done = removeGenerationElementFrom((GenerationChain) iElement, element);
				if (done) {
					return true;
				}
			}
			else
			{
				if (iElement.equals(element))
				{
					elementFound = true;
					break;
				}
			}
		}
		
		if (elementFound)
		{
			generationchain.getElements().remove(element);
			return true;
		} else {
			return false;
		}
			
	}
}
