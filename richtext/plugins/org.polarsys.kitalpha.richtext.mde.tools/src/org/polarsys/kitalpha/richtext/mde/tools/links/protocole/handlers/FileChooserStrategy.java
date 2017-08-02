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
package org.polarsys.kitalpha.richtext.mde.tools.links.protocole.handlers;

import java.io.File;

import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.polarsys.kitalpha.richtext.mde.tools.internal.Activator;
import org.polarsys.kitalpha.richtext.mde.tools.managers.Tuple;

public class FileChooserStrategy extends AbstractChooseLinkElement {

	public FileChooserStrategy() {
	}

	@Override
	public Tuple<String, String> getURI(Object object) {
		if (object instanceof String){
			String basePath = (String)object;
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
		}
		return null;
	}
}
