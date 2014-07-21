package org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.diagram.DEdge;

public abstract class AbstractLinkAction extends AbstractFocusExternalJavaAction {

	protected void run(Collection<? extends EObject> context, Map<String, Object> parameters) {
		Set<EObject> targetSet = getTargetSet(parameters);
		RecordingCommand command = getCommand((TransactionalEditingDomain) editingDomain, targetSet);
		editingDomain.getCommandStack().execute(command);
	}

	@SuppressWarnings("unchecked")
	private Set<EObject> getTargetSet(Map<String, Object> parameters) {
		Collection<EReference> refs = (Collection<EReference>) parameters.get(ELEMENT);
		Collection<EObject> focusedObjects = (Collection<EObject>) parameters.get(VIEW_ELEMENT);
		Collection<EObject> result = new UniqueEList<EObject>();
		for (EObject o : focusedObjects) 
		{
			DEdge dEdge = (DEdge) o;
			if (dEdge != null && refs.contains(dEdge.getTarget())) 
				result.add(dEdge);
		}
		return new HashSet<EObject>(result);
	}

}
