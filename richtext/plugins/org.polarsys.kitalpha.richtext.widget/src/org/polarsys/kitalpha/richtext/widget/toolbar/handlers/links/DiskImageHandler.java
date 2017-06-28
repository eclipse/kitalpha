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
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.Tuple;

public class DiskImageHandler extends AbstractImageTypeHandler {

	@Override
	public String resolveType(String link) {
		return null;
	}


	@Override
	public String decode(String link, String basePath) {
		return link;
	}

	@Override
	public void openLink(String link) {
		//Do nothing
	}

	@Override
	public Tuple<String, String> getPath(Object object) {
		String url = null;
		FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
		dialog.setFilterExtensions(allowedExtensions); 
		String imageFile = dialog.open();
		if ((imageFile != null) && (imageFile.length() > 0)) {
			File file = new File(imageFile);
			try {
				url = file.toURL().toExternalForm();
			} catch (Exception e) {
				Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, "getPath(...)", e); //$NON-NLS-1$
				Activator.getDefault().getLog().log(status);
			}
		}
		return new Tuple<String, String>(url, null);
	}



}
