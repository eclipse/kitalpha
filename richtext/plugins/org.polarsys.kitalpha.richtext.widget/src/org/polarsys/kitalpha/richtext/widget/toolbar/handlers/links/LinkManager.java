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

import java.util.List;

import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public interface LinkManager {
	
	//Default supported Links
	public static final String URL = "http"; //$NON-NLS-1$
	public static final String FILE = "file"; //$NON-NLS-1$
	public static final String LOCAL = "local"; //$NON-NLS-1$
	public static final String MODEL_ELEMENT = "modelElement"; //$NON-NLS-1$
	public static final String DIAGRAM_ELEMENT = "modelDiagram"; //$NON-NLS-1$
	public static final String UNKNOWN = "unknonwn"; //$NON-NLS-1$
	
	public static final String URL_LABEL = "URL"; //$NON-NLS-1$
	public static final String FILE_LABEL = "File (absolute path)"; //$NON-NLS-1$
	public static final String LOCAL_LABEL = "File (project relative path)"; //$NON-NLS-1$
	public static final String MODEL_ELEMENT_LABEL = "Model Element"; //$NON-NLS-1$
	public static final String DIAGRAM_ELEMENT_LABEL = "Diagram Element"; //$NON-NLS-1$
	
	List<String> getAllLinkTypes();
	
	List<String> getAllLinkLabels();
	
	void addLinkType(final String type, final String label, final LinkTypeHandler handler);
	
	String encode(final String type, final String url, final String displayText);
	
	String decode(final String type, final String link, final String basePath);
	
	void openLink(String link);
	
	Tuple<String, String> getPath(String type, Object object);
}