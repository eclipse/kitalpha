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

package org.polarsys.kitalpha.ecore.diagram.javaaction;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.tools.api.command.view.RevealDDiagramElements;
import org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts.AbstractInheritanceAction;

public class ShowInheritanceAction extends AbstractInheritanceAction {

	@Override
	protected RecordingCommand getCommand(TransactionalEditingDomain editingDomain, Set<EObject> targetSet) {
		Set<DDiagramElement> diagramElements = new HashSet<DDiagramElement>();
		for (Object object : targetSet) {
			if (object instanceof DDiagramElement) {
				diagramElements.add((DDiagramElement) object);
			}
		}
		return new RevealDDiagramElements(editingDomain, diagramElements);
	}
}
