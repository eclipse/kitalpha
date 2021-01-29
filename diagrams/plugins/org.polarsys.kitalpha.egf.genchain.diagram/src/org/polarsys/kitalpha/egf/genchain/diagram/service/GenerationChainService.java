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
package org.polarsys.kitalpha.egf.genchain.diagram.service;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

public class GenerationChainService {

	public int getIndex(DEdge view){
		final EdgeTarget sourceNode = view.getSourceNode();
		final EdgeTarget targetNode = view.getTargetNode();
		
		final EObject sourceNodeTarget = ((DSemanticDecorator)sourceNode).getTarget();
		final EObject targetNodeTarget = ((DSemanticDecorator)targetNode).getTarget();
		int index = 1;
		if (sourceNodeTarget instanceof GenerationChain)
		{
			final EList<GenerationElement> elements = ((GenerationChain) sourceNodeTarget).getElements();
			for (GenerationElement generationElement : elements) 
			{
				if (generationElement.equals(targetNodeTarget)) {
					break;
				} else {
					index++;
				}
			}
		}
		return index;
	}
}
