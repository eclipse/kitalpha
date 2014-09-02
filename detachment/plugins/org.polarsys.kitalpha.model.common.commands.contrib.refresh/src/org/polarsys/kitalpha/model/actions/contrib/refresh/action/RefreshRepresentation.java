/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.actions.contrib.refresh.action;

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
import org.polarsys.kitalpha.model.actions.action.ModelAction;
import org.polarsys.kitalpha.model.actions.contrib.refresh.Messages;
import org.polarsys.kitalpha.model.actions.exception.ModelActionException;

/**
 * @author Faycal Abka
 */
public class RefreshRepresentation extends ModelAction {
	
	Logger LOGGER = Logger.getLogger(RefreshRepresentation.class);

	@Override
	public void exec(Resource resource, IProgressMonitor monitor)
			throws ModelActionException {
		
		SubMonitor subMonitor = SubMonitor.convert(monitor);
		
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
