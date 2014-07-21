/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.integration.sirius.listeners;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.progress.IProgressService;
import org.polarsys.kitalpha.ad.integration.sirius.Activator;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Listener;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

public final class SiriusViewpointActivationManager implements Listener {

	public void hasBeenDeactivated(Resource vp) {
		updateActiveViewpoint(getURI(vp), false);
	}

	public void hasBeenActivated(Resource vp) {
		updateActiveViewpoint(getURI(vp), true);
	}

	private URI getURI(Resource res) {
		if (res.getProviderLocation().equals(Location.WORSPACE))
			return URI.createPlatformResourceURI(res.getPath(), false);
		return URI.createPlatformPluginURI(res.getPath(), false);
	}

	private void updateActiveViewpoint(URI vpURI, boolean activate) {
		ViewpointSelectionCallback callback = new ViewpointSelectionCallback();

		for (Session session : SessionManager.INSTANCE.getSessions()) {
			final TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
			org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint vp = (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint) domain.getResourceSet().getEObject(vpURI, true);
			Viewpoint genericVp = (Viewpoint) domain.getResourceSet().getEObject(Activator.GENERIC_VP_URI, true);

			Set<Viewpoint> viewpoints = SiriusHelper.getViewpoints(vp);
			if (viewpoints.isEmpty())
				continue;
			Set<Viewpoint> newSelectedViewpoints = new HashSet<Viewpoint>();
			Set<Viewpoint> newDeselectedViewpoints = SiriusHelper.EMPTY_SET;
			newSelectedViewpoints.add(genericVp);
			if (activate)
				newSelectedViewpoints.addAll(viewpoints);
			else
				newDeselectedViewpoints = viewpoints;
			final RecordingCommand command = new ChangeViewpointSelectionCommand(session, callback, newSelectedViewpoints, newDeselectedViewpoints, new NullProgressMonitor());
			execute(domain, command);

		}
	}

	public void execute(final TransactionalEditingDomain domain, final RecordingCommand command) {
		final IProgressService ps = PlatformUI.getWorkbench().getProgressService();
		try {
			ps.run(false, false, new WorkspaceModifyOperation() {

				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
					monitor.beginTask("Apply new viewpoints selection...", 1);
					domain.getCommandStack().execute(command);
					monitor.done();
				}
			});
		} catch (Exception e) {
			// MessageDialog.openError(shell, "Error while opening view",
			// "See details in error log ");
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.getSymbolicName(), "Error while starting bundle", e));
		}
	}
}