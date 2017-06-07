/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.toolbar.handlers;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.links.AbstractLinkTypeHandler;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.links.LinkTypeHandler;

/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class AbstractOpenLinkTypeHandler extends AbstractLinkTypeHandler implements LinkTypeHandler {


	@Override
	public void openLink(String link) {
		File fileToOpen = new File(link);
		if (fileToOpen.exists() && fileToOpen.isFile()) {
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
			IURIEditorInput editorInput = new FileStoreEditorInput(fileStore);
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				page.openEditor(editorInput, IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
			} catch (Exception e) {
				//TODO log
			}
		}
	}

}
