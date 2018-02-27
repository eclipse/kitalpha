/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.integration.sirius.listeners;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.integration.sirius.Activator;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.OverallListener;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

public final class SiriusViewpointActivationManager implements OverallListener {

	public void hasBeenDeactivated(Object ctx, Resource vp) {
		updateActiveViewpoint(ctx, getURI(vp), false);
	}

	public void hasBeenActivated(Object ctx, Resource vp) {
		updateActiveViewpoint(ctx, getURI(vp), true);
	}

	private URI getURI(Resource res) {
		return URIHelper.createURI(res);
	}

	@Override
	public void hasBeenFiltered(Object ctx, Resource vp) {
		updateActiveViewpoint(ctx, getURI(vp), false);
	}

	@Override
	public void hasBeenDisplayed(Object ctx, Resource vp) {
		updateActiveViewpoint(ctx, getURI(vp), true);
	}
 
	private void updateActiveViewpoint(Object ctx, URI vpURI, boolean activate) {
		ViewpointSelectionCallback callback = new ViewpointSelectionCallback();
		Session session = SiriusHelper.getSession((ResourceSet) ctx);
		if (session == null)
			return ;
		final TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint vp = (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint) domain.getResourceSet().getEObject(vpURI, true);
		Viewpoint genericVp = (Viewpoint) domain.getResourceSet().getEObject(Activator.GENERIC_VP_URI, true);

		Set<Viewpoint> viewpoints = SiriusHelper.getViewpoints(vp);
		if (viewpoints.isEmpty())
			return;
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
	
	public void execute(final TransactionalEditingDomain domain, final RecordingCommand command) {
		domain.getCommandStack().execute(command);
	}
}