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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.AbstractOpenLinkTypeHandler;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.Tuple;

public class LocalLinkHandler extends AbstractOpenLinkTypeHandler {

	@Override
	public String resolveType(String link) {
		return link != null && link.contains("local:")? LinkManager.LOCAL : LinkManager.UNKNOWN; //$NON-NLS-1$
	}

	@Override
	public String encode(String url, String displayText) {
		return "<a href=\"local://" + url + "\">" + escapeDisplayedText(displayText) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public String decode(String link, String basePath) {
		link = link.replaceFirst("local://", basePath); //$NON-NLS-1$
		link = link.replace('/', '\\');
		link = link.replace("%20", " "); //$NON-NLS-1$ //$NON-NLS-2$
		return link;
	}

	@Override
	public Tuple<String, String> getPath(Object object) {
		String location = null;
		if (object instanceof EObject){
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
					String basePath = MDERichTextHelper.getProjectPath(element);
					location = ((IFile) result).getLocation().toPortableString();
					if (location.startsWith(basePath)) {
						location = location.replaceFirst(basePath, ""); //$NON-NLS-1$
					}
				}
			}
		}
		return customizeLink(location, object);
	}
}
