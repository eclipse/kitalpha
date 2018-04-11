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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
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
		
		//keep only remove nofications
		List<Notification> notifications = event.getNotifications().stream().
				filter(e -> e.getEventType() == Notification.REMOVE_MANY || e.getEventType() == Notification.REMOVE).collect(Collectors.toList());
		
		for (Notification notification : notifications) {
			switch (notification.getEventType()) {
			case Notification.REMOVE_MANY:
			case Notification.REMOVE:
				IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				if (activeWorkbenchWindow != null) {
					IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
					if (activePage != null) {
						IEditorReference[] openedEditors = getRichtextEditorReferences(activePage);
						if (openedEditors.length > 0) {
							handleNotification(notification, activePage, openedEditors);
						}
					}
				}
				break;
			default:
				break;
			}
		}
	}

	private void handleNotification(Notification notification, IWorkbenchPage activePage, IEditorReference[] openedEditors) {
		Object oldValue = notification.getOldValue();
		if (oldValue instanceof EObject) {
			EObject eOldValue = (EObject) oldValue;

			List<IEditorReference> editors = getEditorsToClose(openedEditors, eOldValue);

			for (IEditorReference references : editors) {
				close(references, activePage);
			}
		}
	}
	
	@Override
	public boolean isPostcommitOnly() {
		return true;
	}
	
	
	private List<IEditorReference> getEditorsToClose(IEditorReference[] openedEditors, EObject eOldValue) {
		List<IEditorReference> editors = new ArrayList<>();

		IEditorReference ref = getEditorReferenceFor(eOldValue, openedEditors);
		if (ref != null) {
			editors.add(ref);
		}

		TreeIterator<EObject> it = eOldValue.eAllContents();

		while (it.hasNext()) {
			EObject next = it.next();
			ref = getEditorReferenceFor(next, openedEditors);
			if (ref != null) {
				editors.add(ref);
			}
		}
		return editors;
	}


	private void close(IEditorReference ref, IWorkbenchPage activePage) {
		if (ref != null) {
			Display.getDefault().asyncExec(() -> activePage.closeEditor(ref.getEditor(false), false));
		}
	}


	private IEditorReference getEditorReferenceFor(final EObject eObject, IEditorReference[] editorReferences) {
		try {
			for (IEditorReference ref : editorReferences) {
				MDERichTextEditorInput input = (MDERichTextEditorInput) ref.getEditorInput();
				EObject element = input.getElement();

				if (element.equals(eObject) && eObject.eResource() == null) {
					return  ref;
				}
			}
		} catch (PartInitException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot find richtext editor", e));
		}

		return null;
	}

	private IEditorReference[] getRichtextEditorReferences(IWorkbenchPage activePage) {
		List<IEditorReference> result = new ArrayList<>();

		IEditorReference[] editorReferences = activePage.getEditorReferences();

		for (IEditorReference ref : editorReferences) {
			String editorIdentifier = ref.getId();
			if (MDERichTextConstants.RICHTEXT_EDITOR_ID.equals(editorIdentifier)) { //$NON-NLS-1$
				result.add(ref);
			}
		}

		return result.toArray(new IEditorReference[result.size()]);
	}
	

}
