/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.ui;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.LoadingResourceReuseDialog;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;
import org.polarsys.kitalpha.resourcereuse.emfscheme.utils.context.ModelReuseContext;
import org.polarsys.kitalpha.resourcereuse.emfscheme.utils.services.ResourceSetLoaderServices;
import org.polarsys.kitalpha.resourcereuse.emfscheme.utils.services.SiriusLoaderServices;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class LoadResourceReuseHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ModelReuseContext context = ModelReuseContext.INSTANCE;
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection){
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			Object firstElement = structuredSelection.getFirstElement();
			
			if (firstElement instanceof GraphicalEditPart){
				firstElement = ((GraphicalEditPart)firstElement).resolveSemanticElement();
			}
			if (firstElement instanceof Resource){
				EList<EObject> contents = ((Resource)firstElement).getContents();
				if (!contents.isEmpty()){
					firstElement = contents.get(0);
				}
			}
			if (firstElement instanceof EObject){
				LoadingResourceReuseDialog dialog = new LoadingResourceReuseDialog(HandlerUtil.getActiveShell(event));
				EObject eObject = (EObject)firstElement;
				dialog.setSelection(eObject);
				dialog.open();
				
				final Session session = context.getSession();
				List<SearchCriteria> criterias = context.getCriterias();
				for (SearchCriteria settedCriteria : criterias) {
					final java.util.List<URI> modelToLoad = ModelReuseHelper.findModelsURIAccordingToCriteria(settedCriteria);
					if (session != null) {
						if (modelToLoad.size() == 1)
							SiriusLoaderServices.loadModelsForSiriusSession(session,
									modelToLoad);
						else
							continue;
					}
					// else we work with the resource set
					else {
						if (modelToLoad.size() == 1) {
							ResourceSetLoaderServices.loadResourceForCurrentRessourceSet(eObject, modelToLoad);
						} else {
							continue;
						}
					}
				}
			}
		}
		return null;
	}

}
