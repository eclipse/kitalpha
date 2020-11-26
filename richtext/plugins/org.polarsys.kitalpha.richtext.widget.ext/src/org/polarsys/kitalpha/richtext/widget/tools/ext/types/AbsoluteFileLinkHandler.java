/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.ext.types;

import java.io.File;

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.polarsys.kitalpha.richtext.widget.tools.ext.internal.Activator;
import org.polarsys.kitalpha.richtext.widget.tools.intf.LinkHandler;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public class AbsoluteFileLinkHandler implements LinkHandler {

	public AbsoluteFileLinkHandler() {
	}

	@Override
	public boolean canHandleLink(String link) {
		return link != null && link.contains("file:");
	}

	@Override
	public void openLink(Object object, String link) {
		File fileToOpen = new File(link);
		if (fileToOpen.exists() && fileToOpen.isFile()) {
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
			IURIEditorInput editorInput = new FileStoreEditorInput(fileStore);
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				page.openEditor(editorInput, IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
			} catch (Exception e) {
				Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, "openLink(" + link + ")", e); //$NON-NLS-1$
				Activator.getDefault().getLog().log(status);
			}
		}
	}

	@Override
	public Tuple<String, String> getLink(String linkType, String basePath, Object object) {
		FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
		dialog.setFilterPath(basePath);
		String attachFile = dialog.open();
		if (attachFile != null && attachFile.length() > 0) {
			try {
				File file = new File(dialog.getFilterPath(), dialog.getFileName());
				return new Tuple<String, String>(file.getAbsolutePath(), null);
			} catch (Exception e) {
				Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, "getURI(...)", e); //$NON-NLS-1$
				Activator.getDefault().getLog().log(status);
			}
		}
		return null;
	}

	@Override
	public String encode(String url, String urlDisplayName) {
	  return "<a href=\"file:///" + url.replace("\\", "\\\\") + "\">" + StringEscapeUtils.escapeHtml(urlDisplayName).replace("\\", "\\\\") + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$;
	}

	@Override
	public String decode(String url, String basePath) {
		url = url.replaceFirst("file://", ""); //$NON-NLS-1$
		url = url.replace('/', '\\');
		url = url.replace("%20", " "); //$NON-NLS-1$ //$NON-NLS-2$
		return url;
	}

}
