/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.viewpoint.representation.command;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.helper.SiriusUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.contrib.viewpoint.representation.Activator;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.viewpoints.scrutinizes.UsedAFViewpoints;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeContainer;

public class HandleViewpointRepresentationCommand extends ModelCommand {

	public HandleViewpointRepresentationCommand() {
	}

	@Override
	public void exec(ModelScrutinyRegistry analysis, Resource resource, IProgressMonitor monitor) throws ModelCommandException {
		
		if (resource.getURI().lastSegment() == null || !resource.getURI().lastSegment().endsWith(SiriusUtil.SESSION_RESOURCE_EXTENSION)) {
			return;
		}
		
		SubMonitor subMonitor = SubMonitor.convert(monitor);

		Session session = SessionManager.INSTANCE.getExistingSession(resource.getURI());
		if (session == null){
			saveResources(resource);
			session = SessionManager.INSTANCE.getSession(resource.getURI(), subMonitor);
		}
		
		if (!session.isOpen()){
			session.open(subMonitor);
		}

		RegistryElement regElt;
		try {
			regElt = analysis.getRegistryElement(getModelAnalysisID());
			
			if (regElt != null){
				UsedAFViewpoints usedVpFinder = getUsedAFFinder(regElt);
				if (usedVpFinder != null){
					ViewpointTreeContainer analysisResult = usedVpFinder.getAnalysisResult();
					clean(analysisResult, session, monitor);
				}
			}
		} catch (ModelScrutinyException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
	}

	private void saveResources(Resource resource) {
		for(Resource r: resource.getResourceSet().getResources()){
			try {
				if (r.getURI() != null && r.getURI().isPlatformResource()){
					r.save(null);
				}
			} catch (IOException e) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
		}
	}
	
	private void clean(ViewpointTreeContainer analysisResult, Session session, IProgressMonitor monitor) {
		Collection<String> viewpointToRemove = analysisResult.getViewpointToRemove();
		(new SiriusViewpointRepresentationHandler(session, viewpointToRemove, monitor)).clean();
	}

	@SuppressWarnings("rawtypes")
	private UsedAFViewpoints getUsedAFFinder(RegistryElement regElt) {

		Collection<IScrutinize> finders = regElt.getFinders();

		for (IScrutinize iFinder : finders) {
			if (iFinder instanceof UsedAFViewpoints){
				//There are one finder of viewpoints
				return (UsedAFViewpoints)iFinder;
			}
		}
		return null;
	}
}
