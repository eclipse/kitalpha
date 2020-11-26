/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.editor.ext.callback;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionStatus;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaBasedRichTextWidget;
import org.polarsys.kitalpha.richtext.widget.editor.intf.MDERichTextEditorCallback;

/**
 * 
 * @author Faycal Abka
 *
 */
public class SiriusMDERichTextCallback implements MDERichTextEditorCallback {

	@Override
	public void saveWorkspaceResource(MDERichTextWidget widget) {
		EObject element = widget.getElement();
		Session session = SessionManager.INSTANCE.getSession(element);
		if (session != null) {
			session.save(new NullProgressMonitor());
		}
	}

	@Override
	public boolean isWorkspaceResourceDirty(MDERichTextWidget widget) {
		EObject element = widget.getElement();
		Session session = SessionManager.INSTANCE.getSession(element);
		if (session != null) {
			return SessionStatus.DIRTY.equals(session.getStatus());
		}
		return false;
	}

	@Override
	public void registerWorkspaceResourceSaveListener(MDERichTextWidget widget) {
		EObject element = widget.getElement();
		Session session = SessionManager.INSTANCE.getSession(element);
		if (session != null) {
			session.addListener(new SessionListener() {
				@Override
				public void notify(int changeKind) {
					if (changeKind == SessionListener.SYNC && widget instanceof MDENebulaBasedRichTextWidget) {
						Display.getDefault()
								.asyncExec(() -> ((MDENebulaBasedRichTextWidget) widget).setDirtyStateUpdated(false));
					}
				}
			});
		}
	}
}
