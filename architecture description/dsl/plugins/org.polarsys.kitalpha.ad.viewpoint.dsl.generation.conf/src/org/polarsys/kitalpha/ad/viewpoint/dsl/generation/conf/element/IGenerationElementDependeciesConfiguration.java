/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.element;

import java.util.List;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;

/**
 * Defines methods to check dependencies of a {@link GenerationElement}. Implementation of this 
 * interface allow to know if a given {@link GenerationElement} can be run or not. 
 * 
 * <p>
 * A {@link GenerationElement} can be run <b>only if, at least</b>, one of the following conditions is satisfied:
 * <ul>
 *   <li>all its dependencies are satisfied</li>
 *   <li>all required resources are available in the workspace</li>
 *  </ul>
 *  
 * The following features are supported:
 * <ul>
 *   <li>{@link IGenerationElementDependeciesConfiguration#getDependecies()}</li>
 *   <li>{@link IGenerationElementDependeciesConfiguration#preConditions()}</li>
 * </ul>
 * </p>
 * @author Boubekeur Zendagui
 */
public interface IGenerationElementDependeciesConfiguration extends IGenerationElementConfiguration{

	/**
	 * Allows to define dependencies between the current {@link GenerationElement} and other one.
	 * @return a set of {@link GenerationElement} that result is mandatory
	 */
	List<GenerationElement> getDependecies();
	
	/**
	 * Allows to check if the resources required to the current {@link GenerationElement} 
	 * are available in the workspace or not
	 * 
	 * @return <code>True</code> if all required resources are available in the workspace 
	 */
	boolean preConditions();
}
