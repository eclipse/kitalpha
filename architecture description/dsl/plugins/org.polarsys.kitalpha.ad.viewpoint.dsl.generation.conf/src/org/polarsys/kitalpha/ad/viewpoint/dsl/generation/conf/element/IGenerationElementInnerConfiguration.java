/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;

/**
 * <!-- begin-user-doc -->
 * An interface allowing to configure a given {@link GenerationElement}.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IGenerationElementInnerConfiguration#configure(GenerationElement)}</li>
 * </ul>
 * </p>
 * @author Boubekeur Zendagui
 */
public interface IGenerationElementInnerConfiguration extends IGenerationElementConfiguration{
	
	/**
	 * Configure the associated {@link GenerationElement}. Implementation of this method (done in  
	 * classes implementing this interface) allows to change the GenerationElement properties. 
	 * 
	 * @param element the {@link GenerationElement} to configure
	 */
	void configure(GenerationElement element);
	
}
