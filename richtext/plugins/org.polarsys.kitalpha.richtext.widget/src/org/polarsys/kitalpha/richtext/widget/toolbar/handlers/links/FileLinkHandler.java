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
package org.polarsys.kitalpha.richtext.widget.toolbar.handlers.links;

import java.io.File;

import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.polarsys.kitalpha.richtext.widget.internal.Activator;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.AbstractOpenLinkTypeHandler;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public class FileLinkHandler extends AbstractOpenLinkTypeHandler {

	@Override
	public String resolveType(String link) {
		return link != null && link.contains("file:")? LinkManager.FILE : LinkManager.UNKNOWN; //$NON-NLS-1$
	}

	@Override
	public String encode(String url, String displayText) {
		return "<a href=\"file:///" + customizeLink(url, null).getFirst() + "\">" + escapeDisplayedText(displayText) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public String decode(String link, String basePath) {
		link = link.replaceFirst("file://", ""); //$NON-NLS-1$
		link = link.replace('/', '\\');
		link = link.replace("%20", " "); //$NON-NLS-1$ //$NON-NLS-2$
		return link;
	}

	@Override
	public Tuple<String, String> getPath(Object object) {
		if (object instanceof String){
			String basePath = (String)object;
			FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
			dialog.setFilterPath(basePath);
			String attachFile = dialog.open();
			if (attachFile != null && attachFile.length() > 0) {
				try {
					File file = new File(dialog.getFilterPath(), dialog.getFileName());
					return customizeLink(file.getAbsolutePath(), object);
				} catch (Exception e) {
					Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, "getPath(...)", e); //$NON-NLS-1$
					Activator.getDefault().getLog().log(status);
				}
			}
		}
		return null;
	}
}
