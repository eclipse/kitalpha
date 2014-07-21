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
	public void configure(GenerationElement element);
	
}
