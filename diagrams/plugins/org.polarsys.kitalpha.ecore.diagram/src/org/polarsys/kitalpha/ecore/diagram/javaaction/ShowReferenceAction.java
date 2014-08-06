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

package org.polarsys.kitalpha.ecore.diagram.javaaction;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.tools.api.command.view.RevealDDiagramElements;
import org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts.AbstractReferenceAction;

public class ShowReferenceAction extends AbstractReferenceAction {

	@Override
	protected RecordingCommand getCommand(TransactionalEditingDomain editingDomain, Set<EObject> targetSet) {
		// return new
		// ShowLinkAction.MyRevealDDiagramElement(editingDomain,targetSet);
		Set<DDiagramElement> diagramElements = new HashSet<DDiagramElement>();
		for (Object object : targetSet) 
		{
			if (object instanceof DDiagramElement) 
			{
				diagramElements.add((DDiagramElement) object);
			}
		}
		return new RevealDDiagramElements(editingDomain, diagramElements);
	}

}
