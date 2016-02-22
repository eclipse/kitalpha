/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.refresh.command;

import java.io.IOException;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.contrib.refresh.Messages;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;

/**
 * @author Faycal Abka
 */
public class RefreshRepresentation extends ModelCommand {
	
	Logger LOGGER = Logger.getLogger(RefreshRepresentation.class);

	@Override
	public void exec(Resource resource, IProgressMonitor monitor)
			throws ModelCommandException {
		
		SubMonitor subMonitor = SubMonitor.convert(monitor);
		
		if (resource.isLoaded()){
			resource.unload();
		}
		
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Session session = SessionManager.INSTANCE.getSession(resource.getURI(), subMonitor);
		session.open(subMonitor);
		
		subMonitor.beginTask(Messages.REFRESH_REMPRESENTATIONS, IProgressMonitor.UNKNOWN);
		
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		
		Command cmd = new RefreshRepresentationsCommand(domain, subMonitor, allRepresentations);
		
		if (cmd.canExecute())
			domain.getCommandStack().execute(cmd);

		subMonitor.subTask(Messages.SAVE_SIRIUS_SESSION);
		session.save(subMonitor);
		
		subMonitor.subTask(Messages.CLOSING_SIRIUS_SESSION);
		session.close(subMonitor);
		subMonitor.done();

	}

}
