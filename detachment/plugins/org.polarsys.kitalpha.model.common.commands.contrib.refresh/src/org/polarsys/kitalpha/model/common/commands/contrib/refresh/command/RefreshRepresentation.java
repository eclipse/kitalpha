/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.refresh.command;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.helper.SiriusUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizer;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizerFactory;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.internal.refresh.SynchronizeGMFModelCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.contrib.refresh.Messages;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;

/**
 * @author Faycal Abka
 */
@SuppressWarnings("restriction")
public class RefreshRepresentation extends ModelCommand {
	
	Logger LOGGER = Logger.getLogger(RefreshRepresentation.class);

	@Override
	public void exec(Resource resource, IProgressMonitor monitor)
			throws ModelCommandException {
		
		if (resource.getURI().lastSegment() == null || !resource.getURI().lastSegment().endsWith(SiriusUtil.SESSION_RESOURCE_EXTENSION))
			return;
		
		SubMonitor subMonitor = SubMonitor.convert(monitor);
		
		Session session = SessionManager.INSTANCE.getExistingSession(resource.getURI());
		if (session == null){
			session = SessionManager.INSTANCE.getSession(resource.getURI(), subMonitor);
		}
		
		if (!session.isOpen()){
			session.open(subMonitor);
		}
		
		subMonitor.beginTask(Messages.REFRESH_REMPRESENTATIONS, IProgressMonitor.UNKNOWN);
		
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		
		CompoundCommand compoundCommand = new CompoundCommand("Refresh Diagrams"); //$NON-NLS-1$

		refreshGMFModelDiagrams(allRepresentations, domain, compoundCommand);
		Command refreshDRepresentations = new RefreshRepresentationsCommand(domain, subMonitor, allRepresentations);
		
		compoundCommand.append(refreshDRepresentations);
		
		if (compoundCommand.canExecute())
			domain.getCommandStack().execute(compoundCommand);

		subMonitor.subTask(Messages.SAVE_SIRIUS_SESSION);
		session.save(subMonitor);
		
		subMonitor.subTask(Messages.CLOSING_SIRIUS_SESSION);
		session.close(subMonitor);
		
		subMonitor.done();
	}
	
	private void refreshGMFModelDiagrams(Collection<DRepresentation> allRepresentations, TransactionalEditingDomain ed, CompoundCommand compoundCommand) {
		for (DRepresentation representation : allRepresentations) {
			if (representation instanceof DSemanticDiagram){
				DSemanticDiagram diagram = (DSemanticDiagram)representation;
				Diagram gmfDiagram = SiriusGMFHelper.getGmfDiagram(diagram);
				CanonicalSynchronizer cs = CanonicalSynchronizerFactory.INSTANCE.createCanonicalSynchronizer(gmfDiagram);
				SynchronizeGMFModelCommand refreshDSemanticDiagram = new SynchronizeGMFModelCommand(ed, cs);
				compoundCommand.append(refreshDSemanticDiagram);
			}
		}
	}
}
