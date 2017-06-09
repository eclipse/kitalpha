/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.activity.explorer.services;

import java.util.Collection;
import java.util.EnumSet;

import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.SiriusHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.commands.registry.WorkflowType;
import org.polarsys.kitalpha.model.common.commands.runner.IModelCommandRunner;
import org.polarsys.kitalpha.model.common.commands.runner.ModelCommandRunner;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.Scrutineer;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.IViewpointTreeDescription;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeContainer;
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
						e.printStackTrace();
					}
				}
			};
			session.getTransactionalEditingDomain().getCommandStack().execute(ref);
		}
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
							detach(vpid, session.getSessionResource());
						}
					} catch (ViewpointActivationException e) {
						e.printStackTrace();
					}
				}
			};
			session.getTransactionalEditingDomain().getCommandStack().execute(unRef);
		}
	}
	
	private void detach(final String vpid, final Resource resource){
		ModelScrutinyRegistry analysis = Scrutineer.startScrutiny(resource);
		try {
			RegistryElement vpReg = analysis.getRegistryElement("org.polarsys.kitalpha.model.common.scrutiny.contrib.scrutiny.viewpoints"); //$NON-NLS-1$
			Collection<IScrutinize> finders = vpReg.getFinders();
			for (IScrutinize s : finders) {
				ViewpointTreeContainer vps = (ViewpointTreeContainer) s.getAnalysisResult();
				unselectVp(vps, vpid);
			}
			
			//Run Commands
			IModelCommandRunner commandRunner = new ModelCommandRunner();
			commandRunner.run(analysis, resource, EnumSet.of(WorkflowType.DETACHMENT), new NullProgressMonitor());
			
		} catch (ModelScrutinyException e) {
			logError(e);
		} catch (ModelCommandException e) {
			logError(e);
		}
	}

	private void logError(Throwable e) {
		Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
	}

	private void unselectVp(final ViewpointTreeContainer vps, final String vpid) {
		Collection<IViewpointTreeDescription> roots = vps.getRoots();
		for (IViewpointTreeDescription iViewpointTreeDescription : roots) {
			unselect(iViewpointTreeDescription, vpid);
		}
	}

	private void unselect(IViewpointTreeDescription iViewpointTreeDescription, final String vpid) {
		String viewpointId = iViewpointTreeDescription.getViewpointId();
		if (vpid.equals(viewpointId)){
			iViewpointTreeDescription.setAsCandidateToKeep(false);
			iViewpointTreeDescription.updateCandidates(false);
			return;
		}
		Collection<IViewpointTreeDescription> children = iViewpointTreeDescription.getChildren();
		if (children != null && !children.isEmpty()){
			for (IViewpointTreeDescription vpd : children) {
				unselect(vpd, vpid);
			}
		}
	}
}
