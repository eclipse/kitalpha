/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener.Stub;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.integration.sirius.Activator;
import org.polarsys.kitalpha.ad.integration.sirius.SiriusViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;

/**
 * Use a job with scheduling delay to handle project creation and keep sync from metadata. By default the project creation wizard will enable all available Sirius viewpoints.
 * 
 * @author Thomas Guiu
 * 
 */
public class ViewpointActivationStateListener extends Stub {


	private final class SyncCommand extends RecordingCommand implements AbstractCommand.NonDirtying {
		private final Set<org.eclipse.sirius.viewpoint.description.Viewpoint> newDeselectedViewpoints;
		private final IProgressMonitor monitor;
		private final Session session;
		private final Set<org.eclipse.sirius.viewpoint.description.Viewpoint> newSelectedViewpoints;

		private SyncCommand(TransactionalEditingDomain domain, Set<org.eclipse.sirius.viewpoint.description.Viewpoint> newDeselectedViewpoints, IProgressMonitor monitor, Session session, Set<org.eclipse.sirius.viewpoint.description.Viewpoint> newSelectedViewpoints) {
			super(domain);
			this.newDeselectedViewpoints = newDeselectedViewpoints;
			this.monitor = monitor;
			this.session = session;
			this.newSelectedViewpoints = newSelectedViewpoints;
		}

		@Override
		protected void doExecute() {
			ViewpointSelectionCallback viewpointSelectionCallback = new ViewpointSelectionCallback();

			for (org.eclipse.sirius.viewpoint.description.Viewpoint vp : newDeselectedViewpoints) {
				viewpointSelectionCallback.deselectViewpoint(vp, session, monitor);
			}
			for (org.eclipse.sirius.viewpoint.description.Viewpoint vp : newSelectedViewpoints) {
				viewpointSelectionCallback.selectViewpoint(vp, session, monitor);
			}
		}
	}

	public void notifyAddSession(final Session session) {

		Job job = new Job("") {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				if (!session.isOpen()) {
					// wait until the session is really open
					schedule(500);
					return Status.OK_STATUS;
				}
				try {
					final Set<org.eclipse.sirius.viewpoint.description.Viewpoint> newSelectedViewpoints = new HashSet<org.eclipse.sirius.viewpoint.description.Viewpoint>();
					final Set<org.eclipse.sirius.viewpoint.description.Viewpoint> newDeselectedViewpoints = new HashSet<org.eclipse.sirius.viewpoint.description.Viewpoint>();

					final Set<String> toActivate = new HashSet<String>();
					final Set<String> toDesactivate = new HashSet<String>();
					ViewpointManager mgr = SiriusHelper.getViewpointManager(session);
					SiriusViewpointManager.INSTANCE.collectSiriusViewpoint(mgr, toActivate, toDesactivate);
					final Map<String, org.eclipse.sirius.viewpoint.description.Viewpoint> allSiriusViewpoints = SiriusViewpointManager.INSTANCE.getAllSiriusViewpoints();

					for (org.eclipse.sirius.viewpoint.description.Viewpoint vp : session.getSelectedViewpoints(false)) {
						if (toActivate.contains(vp.getName()))
							toActivate.remove(vp.getName());
						else if (toDesactivate.contains(vp.getName()))
							newDeselectedViewpoints.add(vp);
					}
					for (String name : toActivate) {
						newSelectedViewpoints.add(allSiriusViewpoints.get(name));
					}

					RecordingCommand command = new SyncCommand(session.getTransactionalEditingDomain(), newDeselectedViewpoints, monitor, session, newSelectedViewpoints);
					if (!newSelectedViewpoints.isEmpty() || !newDeselectedViewpoints.isEmpty())
						session.getTransactionalEditingDomain().getCommandStack().execute(command);
				} catch (Exception e) {
					// fail silently ...
					Activator.getDefault().logWarning(e);
				}
				return Status.OK_STATUS;
			}
		};
		job.setSystem(true);
		job.setUser(false);
		job.schedule(500);
		super.notifyAddSession(session);
	}

}
