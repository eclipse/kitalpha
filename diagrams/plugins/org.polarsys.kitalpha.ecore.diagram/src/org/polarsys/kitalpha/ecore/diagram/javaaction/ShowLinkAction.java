package org.polarsys.kitalpha.ecore.diagram.javaaction;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.tools.api.command.view.RevealDDiagramElements;
import org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts.AbstractLinkAction;

public class ShowLinkAction extends AbstractLinkAction {

	@Override
	protected RecordingCommand getCommand(TransactionalEditingDomain editingDomain, Set<EObject> targetSet) {
		Set<DDiagramElement> diagramElements = new HashSet<DDiagramElement>();
		for (Object object : targetSet) 
		{
			if (object instanceof DDiagramElement) 
				diagramElements.add((DDiagramElement) object);
		}
		return new RevealDDiagramElements(editingDomain, diagramElements);
	}
}
