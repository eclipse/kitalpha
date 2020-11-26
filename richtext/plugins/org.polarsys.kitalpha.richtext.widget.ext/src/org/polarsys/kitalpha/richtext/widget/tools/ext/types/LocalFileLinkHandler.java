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
package org.polarsys.kitalpha.richtext.widget.tools.ext.types;

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.tools.intf.LinkHandler;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public class LocalFileLinkHandler implements LinkHandler {

	public LocalFileLinkHandler() {
	}

	@Override
	public boolean canHandleLink(String link) {
		return link != null && link.contains("local:");
	}

	@Override
	public void openLink(Object object, String link) {

	}

	@Override
	public Tuple<String, String> getLink(String linkType, String basePath, Object object) {
		String location = null;
		if (object instanceof EObject) {
			EObject element = (EObject)object;
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
					Display.getCurrent().getActiveShell(),
					new WorkbenchLabelProvider(),
					new BaseWorkbenchContentProvider());
			dialog.setTitle("Select File");
			dialog.setMessage("Select Local File");
			dialog.setInput(MDERichTextHelper.getProject(element));

			if (Window.OK == dialog.open()) {
				Object result = dialog.getFirstResult();
				if (result instanceof IFile) {
					location = ((IFile) result).getLocation().toPortableString();
					if (location.startsWith(basePath)) {
						location = location.replaceFirst(basePath, ""); //$NON-NLS-1$
					}
				}
			}
		}
		return new Tuple<String, String>(location, null);
	}

	@Override
	public String encode(String url, String urlDisplayName) {
		return "<a href=\"local:///" + url + "\">" + StringEscapeUtils.escapeHtml(urlDisplayName) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public String decode(String url, String basePath) {
		url = url.replaceFirst("local:///", basePath); //$NON-NLS-1$
		url = url.replace('/', '\\');
		url = url.replace("%20", " "); //$NON-NLS-1$ //$NON-NLS-2$
		return url;
	}

}
