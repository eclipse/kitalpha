/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.activity.explorer.services;

import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.SiriusHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.EvaluationException;
import org.polarsys.kitalpha.vp.componentsample.activity.explorer.Activator;

/**
 * Set of services used in Component sample activity explorer
 * @author Faycal ABKA
 *
 */
public class ComponentSampleViewpointServices {
	
	public static final ComponentSampleViewpointServices SERVICE = new ComponentSampleViewpointServices();
	
	/**
	 * 
	 * @param id
	 */
	public boolean isReferenced(String vpid){
		Session session = ActivityExplorerManager.INSTANCE.getSession();
		if (session != null){
			return isReferenced(vpid, session);
		}
		return false;
	}

	private boolean isReferenced(String vpid, Session session) {
		ViewpointManager viewpointManager = getViewpointManager(session);
		boolean isReferenced = viewpointManager.isReferenced(vpid);
		boolean isFiltered = viewpointManager.isInactive(vpid);
		return isReferenced && !isFiltered;
	}
	
	public boolean isInactive(String vpid){
		Session session = ActivityExplorerManager.INSTANCE.getSession();
		if (session != null){
			return isInactive(vpid, session);
		}
		return false;
	}

	private boolean isInactive(String vpid, Session session) {
		ViewpointManager viewpointManager = getViewpointManager(session);
		boolean isFiltered = viewpointManager.isInactive(vpid);
		return isFiltered;
	}
	
	public void stopUse(final String id){
		final Session session = ActivityExplorerManager.INSTANCE.getSession();
		if (session != null){
			Command cmd = new RecordingCommand(session.getTransactionalEditingDomain()) {

				@Override
				protected void doExecute() {
					ViewpointManager viewpointManager = getViewpointManager(session);
					try {
						viewpointManager.setActivationState(id, false);
					} catch (ViewpointActivationException e) {
						e.printStackTrace();
					}
				}
			};
			session.getTransactionalEditingDomain().getCommandStack().execute(cmd);
		}
	}
	
	public void startUse(final String id){
		final Session session = ActivityExplorerManager.INSTANCE.getSession();
		if (session != null){
			Command cmd = new RecordingCommand(session.getTransactionalEditingDomain()) {

				@Override
				protected void doExecute() {
					ViewpointManager viewpointManager = getViewpointManager(session);
					try {
						viewpointManager.setActivationState(id, true);
					} catch (ViewpointActivationException e) {
						e.printStackTrace();
					}
				}
			};
			session.getTransactionalEditingDomain().getCommandStack().execute(cmd);
		}
	}

	private ViewpointManager getViewpointManager(final Session session) {
		ViewpointManager viewpointManager = SiriusHelper.getViewpointManager(session);
		return viewpointManager;
	}

	public void reference(final String vpid){
		final Session session = ActivityExplorerManager.INSTANCE.getSession();
		if (session != null){
			final ViewpointManager viewpointManager = getViewpointManager(session);
			Command ref = new RecordingCommand(session.getTransactionalEditingDomain()) {

				@Override
				protected void doExecute() {
					try {
						if (!isReferenced(vpid, session)){
							viewpointManager.reference(vpid);
						}
					} catch (ViewpointActivationException e) {
						log("Can not Activate viewpoint", vpid, e); //$NON-NLS-1$
					} catch (EvaluationException e) {
						log("Can not evaluate predicate of the viewpoint", vpid, e); //$NON-NLS-1$
					}
				}
			};
			session.getTransactionalEditingDomain().getCommandStack().execute(ref);
		}
	}
	
	private void log(final String message, final String vpid, Throwable e) {
		IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message + ": " + vpid , e);
		Activator.getDefault().getLog().log(status);
	}
	
	public void unreference(final String vpid){
		final Session session = ActivityExplorerManager.INSTANCE.getSession();
		if (session != null){
			final ViewpointManager viewpointManager = getViewpointManager(session);
			Command unRef = new RecordingCommand(session.getTransactionalEditingDomain()) {

				@Override
				protected void doExecute() {
					try {
						if (viewpointManager.isReferenced(vpid)){
							viewpointManager.unReference(vpid);
						}
					} catch (ViewpointActivationException e) {
						log("Can not activate viewpoint", vpid, e); //$NON-NLS-1$
					} catch (EvaluationException e) {
						log("Can not evaluate predicate of the viewpoint", vpid, e); //$NON-NLS-1$
					}
				}
			};
			session.getTransactionalEditingDomain().getCommandStack().execute(unRef);
		}
	}
}
