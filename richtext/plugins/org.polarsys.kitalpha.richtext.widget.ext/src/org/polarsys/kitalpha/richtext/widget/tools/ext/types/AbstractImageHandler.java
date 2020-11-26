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

import org.eclipse.core.resources.IFile;
import org.polarsys.kitalpha.richtext.widget.tools.intf.LinkHandler;

public abstract class AbstractImageHandler implements LinkHandler {

	protected static String[] allowedExtensions = { "*.jpg;*.png;*.bmp;*.gif", "*.jpg", "*.png", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			"*.bmp", "*.gif" }; //$NON-NLS-1$ //$NON-NLS-2$
	
	@Override
	public String encode(String url, String displayText) {
		return "<img src=\"" + url + "\"/>"; //$NON-NLS-1$ //$NON-NLS-2$
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
