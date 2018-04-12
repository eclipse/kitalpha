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
package org.polarsys.kitalpha.richtext.widget.internal;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.richtext.nebula.widget.MDERichTextConstants;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditorInput;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CloseEditorResourceSetListener extends ResourceSetListenerImpl implements ResourceSetListener{
	
	public CloseEditorResourceSetListener() {
	}
	
	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		super.resourceSetChanged(event);
		
		List<Notification> notifications = event.getNotifications();
		
		if (!notifications.isEmpty()) {
			IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (activeWorkbenchWindow != null) {
				IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
				if (activePage != null) {
					handleClosingEditors(activePage, event.getEditingDomain());
				}
			}
		}
	}
	
	@Override
	public NotificationFilter getFilter() {
		return NotificationFilter.createEventTypeFilter(Notification.REMOVE)
				.or(NotificationFilter.createEventTypeFilter(Notification.REMOVE_MANY));
	}


	@Override
	public boolean isPostcommitOnly() {
		return true;
	}

	private void close(IEditorReference ref, IWorkbenchPage activePage) {
		if (ref != null) {
			Display.getDefault().asyncExec(() -> activePage.closeEditor(ref.getEditor(false), false));
		}
	}


	private void handleClosingEditors(IWorkbenchPage activePage, TransactionalEditingDomain editingDomain) {

		IEditorReference[] editorReferences = activePage.getEditorReferences();

		for (IEditorReference ref : editorReferences) {
			String editorIdentifier = ref.getId();
			if (MDERichTextConstants.RICHTEXT_EDITOR_ID.equals(editorIdentifier)) {
				MDERichTextEditorInput editorInput;
				try {
					editorInput = (MDERichTextEditorInput) ref.getEditorInput();
					EObject element = editorInput.getElement();
					TransactionalEditingDomain eltEditingDomain = TransactionUtil.getEditingDomain(element);
					/*
					 * If the editing domain of element is null or we are in the same editing domain and the resource of the element
					 * is null => Close the editor
					 */
					if ((eltEditingDomain == null || eltEditingDomain == editingDomain) && element.eResource() == null) {
						close(ref, activePage);
					}
				} catch (PartInitException e) {
					Status status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
	}
}
