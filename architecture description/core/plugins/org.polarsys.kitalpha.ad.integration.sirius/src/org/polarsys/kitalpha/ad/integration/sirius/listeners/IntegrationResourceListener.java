/*******************************************************************************
 * Copyright (c) 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.listeners;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener.Stub;
import org.polarsys.kitalpha.ad.viewpoint.integration.IntegrationHelper;

/**
 * This listener ensures the metadata resource is created (if needed) when a session is opened.
 * 
 * @author Thomas Guiu
 * 
 */
public class IntegrationResourceListener extends Stub {

	public void notifyAddSession(final Session session) {
		RecordingCommand command = new RecordingCommand(session.getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				Resource resource = IntegrationHelper.getInstance().initIntegrationStorage(session.getTransactionalEditingDomain().getResourceSet());
				if (resource != null)
				{
					resource.setModified(true);
					session.addSemanticResource(resource.getURI(), new NullProgressMonitor());
				}
				
			}
		};
		session.getTransactionalEditingDomain().getCommandStack().execute(command);
	}

}
