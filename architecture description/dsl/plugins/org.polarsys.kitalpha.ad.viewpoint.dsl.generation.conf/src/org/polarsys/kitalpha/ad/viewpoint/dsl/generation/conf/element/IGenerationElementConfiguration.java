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

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;

/**
 * Defines methods to compute relevance of a {@link GenerationElement}
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IGenerationElementInnerConfiguration#getElementClass()}</li>
 *   <li>{@link IGenerationElementInnerConfiguration#isRelevant(GenerationChain, GenerationElement)}</li>
 * </ul>
 * </p>
 * @author Boubekeur Zendagui
 */
public interface IGenerationElementConfiguration {
	
	/**
	 * This allows to associate a configuration to a {@link GenerationElement} class
	 * @return the {@link GenerationElement} class associated with configuration
	 */
	Class<? extends GenerationElement> getElementClass();
	
	/**
	 * This allows to check if the element is relevant or not. The relevance of a GenerationElement 
	 * in a Generation Chain is computed by the classes implementing this interface.
	 * 
	 * @param generationchain a {@link GenerationChain} containing the {@link GenerationElement} to check.  
	 * @param element a {@link GenerationElement} to check if it is relevant or not
	 * 
	 * @return True if the element is relevant, false else.
	 */
	boolean isRelevant(GenerationChain generationchain, GenerationElement element);
}
