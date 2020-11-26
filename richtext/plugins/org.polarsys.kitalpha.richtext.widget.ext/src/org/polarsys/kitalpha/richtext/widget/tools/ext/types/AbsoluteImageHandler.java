/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
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

import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.polarsys.kitalpha.richtext.widget.tools.ext.internal.Activator;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

public class AbsoluteImageHandler extends AbstractImageHandler {

	public AbsoluteImageHandler() {
	}

	@Override
	public boolean canHandleLink(String link) {
		return false; //Image cannot be handled
	}

	@Override
	public void openLink(Object object, String link) {
		//Do nothing
	}

	@Override
	public Tuple<String, String> getLink(String linkType, String basePath, Object object) {
		String url = null;
		FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
		dialog.setFilterExtensions(allowedExtensions); 
		String imageFile = dialog.open();
		if ((imageFile != null) && (imageFile.length() > 0)) {
			File file = new File(imageFile);
			try {
				url = file.toURI().toURL().toExternalForm();
			} catch (Exception e) {
				Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, "getPath(...)", e); //$NON-NLS-1$
				Activator.getDefault().getLog().log(status);
			}
		}
		return new Tuple<String, String>(url, null);
	}

	@Override
	public String decode(String url, String basePath) {
		return url;
	}

}
