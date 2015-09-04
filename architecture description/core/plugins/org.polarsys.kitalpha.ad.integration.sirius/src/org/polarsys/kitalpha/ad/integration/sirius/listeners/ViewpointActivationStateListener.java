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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener.Stub;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointActivationStateListener extends Stub {

	private Map<String, org.eclipse.sirius.viewpoint.description.Viewpoint> getAllDoremiViewpoints() {
		Map<String, org.eclipse.sirius.viewpoint.description.Viewpoint> vps = new HashMap<String, org.eclipse.sirius.viewpoint.description.Viewpoint>();
		for (org.eclipse.sirius.viewpoint.description.Viewpoint vp : ViewpointRegistry.getInstance().getViewpoints()) {
			vps.put(vp.getName(), vp);
		}
		return vps;

	}

	// walk through AF VP to list Sirius vp who must be activated and those who
	// must be desactivated
	private void collectionSiriusViewpoint(Set<String> toActivate, Set<String> toDesactivate) {
		// TODO que faire des dépendences entre VP Sirius ?
		ResourceSet set = new ResourceSetImpl();
		// // Add AF Sirius viewpoint, used to filtering in diagrams
		// toActivate.add("Architecture Framework");
		try {
			for (org.polarsys.kitalpha.resourcereuse.model.Resource res : ViewpointManager.INSTANCE.getAvailableViewpoints()) {
				try {
					URI uri = URIHelper.createURI(res);

					List<String> siriusVps = new ArrayList<String>();
					Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
					for (org.eclipse.sirius.viewpoint.description.Viewpoint dvp : SiriusHelper.getViewpoints(vp)) {
						siriusVps.add(dvp.getName());
					}
					if (siriusVps.isEmpty())
						continue;
					if (ViewpointManager.INSTANCE.isActive(res.getId()))
						toActivate.addAll(siriusVps);
					else
						toDesactivate.addAll(siriusVps);
				} catch (Exception e) {
					// we got a screw up model file, we don't care
				}
			}
		} finally {
			for (Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}

	}

	public void notifyAddSession(final Session session) {
		// use a job with scheduling delay to handle project creation.
		// By default the wizard will enable all available Sirius viewpoints.
		// It would be better to improve project creation but we don't to add a
		// dependency on AF plugins...
		// need to care aout migration process ...
		Job job = new Job("") {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				if (!session.isOpen())
					return Status.OK_STATUS;

				try {
					final Set<org.eclipse.sirius.viewpoint.description.Viewpoint> newSelectedViewpoints = new HashSet<org.eclipse.sirius.viewpoint.description.Viewpoint>();
					final Set<org.eclipse.sirius.viewpoint.description.Viewpoint> newDeselectedViewpoints = new HashSet<org.eclipse.sirius.viewpoint.description.Viewpoint>();

					final Set<String> toActivate = new HashSet<String>();
					final Set<String> toDesactivate = new HashSet<String>();
					collectionSiriusViewpoint(toActivate, toDesactivate);
					final Map<String, org.eclipse.sirius.viewpoint.description.Viewpoint> allDoremiViewpoints = getAllDoremiViewpoints();

					for (org.eclipse.sirius.viewpoint.description.Viewpoint vp : session.getSelectedViewpoints(false)) {
						if (toActivate.contains(vp.getName()))
							toActivate.remove(vp.getName());
						else if (toDesactivate.contains(vp.getName()))
							newDeselectedViewpoints.add(vp);
					}
					for (String name : toActivate) {
						newSelectedViewpoints.add(allDoremiViewpoints.get(name));
					}

					RecordingCommand command = new RecordingCommand(session.getTransactionalEditingDomain()) {

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
					};
					if (!newSelectedViewpoints.isEmpty() || !newDeselectedViewpoints.isEmpty())
						session.getTransactionalEditingDomain().getCommandStack().execute(command);
				} catch (Exception e) {
					// fail silently ...
					// Activator.getDefault().logWarning(e);
				}
				return Status.OK_STATUS;
			}
		};
		job.setSystem(true);
		job.setUser(false);
		job.schedule(1000);
		super.notifyAddSession(session);
	}

}
