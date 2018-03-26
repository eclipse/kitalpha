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

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.ui.business.api.helper.graphicalfilters.CompositeFilterApplicationBuilder;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.emde.extension.ModelExtensionOverallListener;

/**
 * @author Thomas Guiu
 * 
 */
public class DiagramUpdater implements ModelExtensionOverallListener {

	public void modelEnabled(Object ctx, String nsURI) {
		refresh();
	}

	public void modelDisabled(Object ctx, String nsURI) {
		refresh();
	}

	private void refresh() {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				doRefresh();
			}
		});
	}
	private void doRefresh() {
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (activePage == null){
			return;
		}
		for (IEditorReference ref : activePage.getEditorReferences()) {
			IEditorPart editor = ref.getEditor(false);
			if (editor != null && editor instanceof DDiagramEditor) {
				DDiagramEditor dEditor = (DDiagramEditor) editor;
				DRepresentation representation = dEditor.getRepresentation();
				if (representation instanceof DDiagram) {
					DDiagram diagram = (DDiagram) representation;
					updateDiagram(dEditor.getSession(), diagram);
				}
			}
		}
	}

	public void updateDiagram(Session session, final DDiagram diagram) {
		session.getTransactionalEditingDomain().getCommandStack().execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				CompositeFilterApplicationBuilder builder = new CompositeFilterApplicationBuilder(diagram);
				builder.computeCompositeFilterApplications();
			}
		});
	}
}
