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
				if (generationElement.equals(targetNodeTarget))
					break;
				else
					index++;
			}
		}
		return index;
	}
}
