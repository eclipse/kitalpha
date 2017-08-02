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
package org.polarsys.kitalpha.richtext.mde.tools.images.handlers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.polarsys.kitalpha.richtext.mde.tools.managers.Tuple;

public class LocalImageHandler extends AbstractImageTypeHandler {

	@Override
	public String resolveType(String link) {
		return null;
	}


	@Override
	public String decode(String link, String basePath) {
		return link;
	}

	@Override
	public void openLink(String link, final String basePath) {
		
	}

	@Override
	public Tuple<String, String> getURI(Object object, String type) {
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
	
	protected boolean isAllowedExtension(IFile file_p) {
	    for (String extension : allowedExtensions) {
	      if (extension.equalsIgnoreCase("*." + file_p.getFileExtension())) { //$NON-NLS-1$
	        return true;
	      }
	    }
	    return false;
	  }

}
