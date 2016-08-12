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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.LoadingResourceReuseDialog;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;
import org.polarsys.kitalpha.resourcereuse.emfscheme.utils.context.ModelReuseContext;
import org.polarsys.kitalpha.resourcereuse.emfscheme.utils.services.ResourceSetLoaderServices;
import org.polarsys.kitalpha.resourcereuse.emfscheme.utils.services.SiriusLoaderServices;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class LoadResourceReusePopUp implements IObjectActionDelegate {

	IStructuredSelection selection;
	private Shell shell;

	@Override
	public void run(IAction action) {

		ModelReuseContext context = ModelReuseContext.INSTANCE;
		EObject selectedObject = (EObject) selection.getFirstElement();
		// creation of the wizard responsible of the loading of resources ..
		LoadingResourceReuseDialog dialog = new LoadingResourceReuseDialog(
				shell);
		dialog.setSelection(selectedObject);
		dialog.open();

		// when ok is pressed, i load
		final Session session = context.getSession();
		List<SearchCriteria> criterias = context.getCriterias();
		for (SearchCriteria settedCriteria : criterias) {
			final java.util.List<URI> modelToLoad = ModelReuseHelper
					.findModelsURIAccordingToCriteria(settedCriteria);
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
					ResourceSetLoaderServices
							.loadResourceForCurrentRessourceSet(selectedObject,
									modelToLoad);
				} else
					continue;
			}
		}
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

}
