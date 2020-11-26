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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.data;

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
