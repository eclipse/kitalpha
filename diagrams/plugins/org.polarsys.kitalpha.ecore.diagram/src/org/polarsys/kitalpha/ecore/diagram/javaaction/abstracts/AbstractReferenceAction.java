package org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.diagram.DEdge;
import org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts.AbstractDDiagramElementAction;

public abstract class AbstractReferenceAction extends AbstractDDiagramElementAction {

	@Override
	protected Collection<DEdge> filter(Collection<DEdge> collection) {
		Collection<DEdge> result = new ArrayList<DEdge>();
		for (DEdge d : collection) {
			if (d.getTarget() instanceof EReference) {
				result.add(d);
			}
		}
		return result;
	}

}
