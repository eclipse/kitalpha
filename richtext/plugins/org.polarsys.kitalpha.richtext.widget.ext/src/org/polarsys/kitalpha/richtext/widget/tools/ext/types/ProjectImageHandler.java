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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ProjectImageHandler extends AbstractImageHandler {

	public ProjectImageHandler() {
	}

	@Override
	public boolean canHandleLink(String link) {
		return false;
	}

	@Override
	public void openLink(Object object, String link) {

	}

	@Override
	public Tuple<String, String> getLink(String linkType, String basePath, Object object) {
		String path = null;

		if (object instanceof EObject){
			ElementTreeSelectionDialog dialog =
					new ElementTreeSelectionDialog(Display.getCurrent().getActiveShell(),
							new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
			dialog.setTitle("Image Selection");
			dialog.setMessage("Select the image (*.bmp, *.gif, *.jpg, *.png) :");
			dialog.setInput(MDERichTextHelper.getProject((EObject)object));
			dialog.addFilter(new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer_p, Object parentElement_p, Object element_p) {
					return (element_p instanceof IFolder)
							|| ((element_p instanceof IFile) && isAllowedExtension((IFile) element_p));
				}
			});

			if (Window.OK == dialog.open()) {
				Object result = dialog.getFirstResult();
				if (result instanceof IFile) {
					String location = ((IFile) result).getLocation().toPortableString();
					String basepath = MDERichTextHelper.getProjectPath((EObject)object);
					basepath = basepath + (basepath.endsWith("/") ? "" : "/"); //$NON-NLS-1$ //$NON-NLS-2$//$NON-NLS-3$
					if (location.startsWith(basepath)) {
						path = location.replaceFirst(basepath, ""); //$NON-NLS-1$
					}
				}
			}
		}
		return new Tuple<String, String>(path, null);
	}

	@Override
	public String decode(String url, String basePath) {
		return url;
	}

}
