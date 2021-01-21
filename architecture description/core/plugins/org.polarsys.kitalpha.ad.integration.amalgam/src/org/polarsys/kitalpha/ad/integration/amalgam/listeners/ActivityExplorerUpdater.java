/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.amalgam.listeners;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.OverallListener;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ActivityExplorerUpdater implements OverallListener {

	@Override
	public void hasBeenDeactivated(Object ctx, Resource vp) {
		refresh(ctx);
	}

	@Override
	public void hasBeenActivated(Object ctx, Resource vp) {
		refresh(ctx);
	}

	@Override
	public void hasBeenFiltered(Object ctx, Resource vp) {
		refresh(ctx);
	}

	@Override
	public void hasBeenDisplayed(Object ctx, Resource vp) {
		refresh(ctx);
	}

	/*
	 * TODO Add refresh support of: (Bugzilla: https://bugs.polarsys.org/show_bug.cgi?id=2158)
	 * 	- Section contributions to an existing page
	 *  - Activity contributions an existing section
	 */
	private void refresh(Object ctx) {

		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				if (activePage == null) {
					return;
				}
				for (IEditorReference ref : activePage.getEditorReferences()) {
					IEditorPart editor = ref.getEditor(false);
					if (editor != null && editor instanceof ActivityExplorerEditor) {
						ActivityExplorerEditor aeditor = (ActivityExplorerEditor) editor;
						aeditor.updateEditorPages( aeditor.getActivePage());
					}
				}
			}
		});
	}

}
