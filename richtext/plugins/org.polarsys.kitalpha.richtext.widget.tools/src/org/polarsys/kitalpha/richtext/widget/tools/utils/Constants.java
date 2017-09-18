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
package org.polarsys.kitalpha.richtext.widget.tools.utils;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.tools.internal.Activator;

/**
 * 
 * @author Faycal Abka
 *
 */
public class Constants {

	//Default supported Links
	public static final String URL = "http"; //$NON-NLS-1$
	public static final String FILE = "file"; //$NON-NLS-1$
	public static final String LOCAL = "local"; //$NON-NLS-1$
	public static final String MODEL_ELEMENT = "modelElement"; //$NON-NLS-1$
	public static final String DIAGRAM_ELEMENT = "modelDiagram"; //$NON-NLS-1$
	public static final String UNKNOWN = "unknonwn"; //$NON-NLS-1$

	public static final String URL_LABEL = "URL"; //$NON-NLS-1$
	public static final String FILE_LABEL = "File (absolute path)"; //$NON-NLS-1$
	public static final String FILE_LOCAL_LABEL = "File (project relative path)"; //$NON-NLS-1$
	public static final String MODEL_ELEMENT_LABEL = "Model Element"; //$NON-NLS-1$
	public static final String DIAGRAM_ELEMENT_LABEL = "Diagram Element"; //$NON-NLS-1$

	public static final String DISK_LABEL = "Image (absolute path)"; //$NON-NLS-1$
	public static final String LOCAL_LABEL = "Image (project relative path)"; //$NON-NLS-1$
	
	 //URL CONSTANTS
    public static final URL EDIT_ICON = getFileURL(MDERichTextHelper.getURL(Activator.PLUGIN_ID, "icons/edit.gif")); 		//$NON-NLS-1$
    public static final URL CLEAR_ICON = getFileURL(MDERichTextHelper.getURL(Activator.PLUGIN_ID, "icons/clear.gif")); 		//$NON-NLS-1$
    public static final URL ADD_LINK_ICON = getFileURL(MDERichTextHelper.getURL(Activator.PLUGIN_ID, "icons/add_link.gif")); 	//$NON-NLS-1$
    public static final URL ADD_IMAGE_ICON = getFileURL(MDERichTextHelper.getURL(Activator.PLUGIN_ID, "icons/add_image.gif")); 	//$NON-NLS-1$

    public static URL getFileURL(URL url){
		try {
			return FileLocator.toFileURL(url);
		} catch (IOException e) {
			Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
		return null;
	}
}
