package org.polarsys.kitalpha.ecore.diagram.javaaction;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.diagram.tools.api.command.view.HideDDiagramElement;
import org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts.AbstractInheritanceAction;

public class HideInheritanceAction extends AbstractInheritanceAction{

	@Override
	protected RecordingCommand getCommand( TransactionalEditingDomain editingDomain, Set<EObject> targetSet) {
		return new HideDDiagramElement(editingDomain, targetSet);
	}
}
