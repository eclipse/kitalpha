/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.detachment.ui.action;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.Scrutineer;
import org.polarsys.kitalpha.model.common.share.resource.loading.LoadResource;
import org.polarsys.kitalpha.model.detachment.ui.constants.Constants;
import org.polarsys.kitalpha.model.detachment.ui.editor.DetachmentEditorInput;
import org.polarsys.kitalpha.model.detachment.ui.editor.ModelDetachment;

/**
 * @author Faycal Abka
 */
public class ModelDetachmentAction implements IObjectActionDelegate {
	
	Logger LOGGER = Logger.getLogger(ModelDetachmentAction.class);
	
	private IFile airdIResource;
	private IEditorInput detachmentInput;

	public ModelDetachmentAction() {
		this.detachmentInput = new DetachmentEditorInput();
	}

	@Override
	public void run(IAction action) {
		try {
			if (airdIResource != null){
				Resource resource = (new LoadResource(airdIResource)).getResource();
				Scrutineer.startScrutiny(resource);
				
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorPart editor = IDE.openEditor(page, detachmentInput, Constants.EDITOR_ID);
				
				if (editor != null && editor instanceof ModelDetachment){
					ModelDetachment modelDetachmentEditor = (ModelDetachment) editor;
					modelDetachmentEditor.initAndLaunchDetachmentAction(resource);
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection){
			StructuredSelection structuredSelection = (StructuredSelection)selection;
			
			Object firstElement = structuredSelection.getFirstElement();
			
			if (firstElement instanceof IFile){
				if (airdIResource != firstElement){
					airdIResource = (IFile)firstElement;
					
					action.setEnabled(true);
					URI uri = URI.createPlatformResourceURI(airdIResource.getFullPath().toPortableString(), true);
					Session session = SessionManager.INSTANCE.getSession(uri, new NullProgressMonitor());
					
					if (session != null){
						action.setEnabled(!session.isOpen());
					}
				}
			}
		}
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}

}
