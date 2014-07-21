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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.internal.conf;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;

import org.polarsys.kitalpha.emde.genchain.extension.model.EmdeGeneration;


/**
 * @author Boubekeur Zendagui
 */
public class EMDEGenerationElementConfiguration extends EMFGenerationElementConfiguration{

	@Override
	public Class<? extends GenerationElement> getElementClass() {
		return EmdeGeneration.class;
	}
	
}
