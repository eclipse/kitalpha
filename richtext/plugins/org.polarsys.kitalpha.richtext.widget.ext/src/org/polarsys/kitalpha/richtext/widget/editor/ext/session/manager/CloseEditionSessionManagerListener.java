/*******************************************************************************
 * Copyright (c) 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.editor.ext.session.manager;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.richtext.nebula.widget.MDERichTextConstants;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditorInput;
import org.polarsys.kitalpha.richtext.widget.tools.ext.internal.Activator;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CloseEditionSessionManagerListener extends SessionManagerListener.Stub {

	public CloseEditionSessionManagerListener() {
		//Do nothing
	}

	@Override
	public void notify(Session session, int event) {
		switch (event) {
		case SessionListener.CLOSED:
			IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

			if (activeWorkbenchWindow != null) {
				IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
				if (activePage != null) {
					IEditorReference[] editorReferences = activePage.getEditorReferences();
					try {
						handleCloseMDERichText(session, activePage, editorReferences);
					} catch (PartInitException e) {
						Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot find richtext editor", e); //$NON-NLS-1$
						Activator.getDefault().getLog().log(status);
					}
				}
			}
			break;
		case SessionListener.SELECTED_VIEWS_CHANGE_KIND:
			break;
		case SessionListener.REPRESENTATION_CHANGE:
			break;
		case SessionListener.OPENED:
			break;
		case SessionListener.DIRTY:
			break;
		case SessionListener.SYNC:
			break;
		case SessionListener.SEMANTIC_CHANGE: 
			break;
		case SessionListener.REPLACED:
			break;
		default:
			break;
		}
	}

	private void handleCloseMDERichText(Session session, IWorkbenchPage activePage, IEditorReference[] editorReferences)
			throws PartInitException {
		for (IEditorReference ref : editorReferences) {
			String editorIdentifier = ref.getId();
			if (MDERichTextConstants.RICHTEXT_EDITOR_ID.equals(editorIdentifier)) { //$NON-NLS-1$
				IEditorInput editorInput = ref.getEditorInput();
				EObject element = ((MDERichTextEditorInput)editorInput).getElement();
				Session sessionOfElt = SessionManager.INSTANCE.getSession(element);
				
				if (session != null && session.equals(sessionOfElt)) {
					Display.getDefault().asyncExec(() -> activePage.closeEditor(ref.getEditor(false), false));
				}
			}
		}
	}

	

}
