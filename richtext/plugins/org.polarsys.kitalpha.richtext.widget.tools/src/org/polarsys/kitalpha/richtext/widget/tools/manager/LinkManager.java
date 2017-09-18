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
package org.polarsys.kitalpha.richtext.widget.tools.manager;

import java.util.List;

import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public interface LinkManager {
	
	List<String> getAllLinkLabels();
	
	void openLink(String link);

	Tuple<String, String> getURI(String linkType, String basePath, Object object);

	String encode(String linkType, String url, String urlDisplayName);
	
}
