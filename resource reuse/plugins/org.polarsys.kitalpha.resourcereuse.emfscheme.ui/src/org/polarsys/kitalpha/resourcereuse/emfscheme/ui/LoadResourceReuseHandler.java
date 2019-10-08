/*******************************************************************************
 * Copyright (c) 2016, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;
import org.polarsys.kitalpha.resourcereuse.emfscheme.utils.services.ResourceSetLoaderServices;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;
import org.polarsys.kitalpha.resourcereuse.ui.dialog.ResourceReuseSelectionDialog;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class LoadResourceReuseHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();

			if (firstElement instanceof GraphicalEditPart) {
				firstElement = ((GraphicalEditPart) firstElement).resolveSemanticElement();
			}
			if (firstElement instanceof Resource) {
				EList<EObject> contents = ((Resource) firstElement).getContents();
				if (!contents.isEmpty()) {
					firstElement = contents.get(0);
				}
			}
			if (firstElement instanceof EObject) {
				ResourceReuseSelectionDialog dialog = new ResourceReuseSelectionDialog(HandlerUtil.getActiveShell(event));
				if (dialog.open() == Window.OK) {
				EObject eObject = (EObject) firstElement;
				final Session session = SessionManager.INSTANCE.getExistingSession(eObject.eResource().getURI());
				SearchCriteria criteria = dialog.getCriteria();
				final URI modelToLoad = ModelReuseHelper.createModelReuseURI(criteria);
				ResourceSetLoaderServices.loadResourceForCurrentResourceSet(eObject, modelToLoad);
				if (session != null) {
					RecordingCommand command = new RecordingCommand(session.getTransactionalEditingDomain()) {

						@Override
						protected void doExecute() {
							session.addSemanticResource(modelToLoad, new NullProgressMonitor());
						}
					};
					session.getTransactionalEditingDomain().getCommandStack().execute(command);

				}
			}
		}
			
		}
		return null;
	}

}
