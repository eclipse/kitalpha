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

import org.polarsys.kitalpha.richtext.mde.tools.managers.AbstractLinkTypeHandler;
import org.polarsys.kitalpha.richtext.mde.tools.utils.Constants;

public class LocalLinkHandler extends AbstractLinkTypeHandler {

	@Override
	public String resolveType(String link) {
		return link != null && link.contains("local:")? Constants.LOCAL : Constants.UNKNOWN; //$NON-NLS-1$
	}

	@Override
	public String encode(String url, String displayText) {
		return "<a href=\"local:///" + url + "\">" + escapeDisplayedText(displayText) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public String decode(String link, String basePath) {
		link = link.replaceFirst("local:///", basePath); //$NON-NLS-1$
		link = link.replace('/', '\\');
		link = link.replace("%20", " "); //$NON-NLS-1$ //$NON-NLS-2$
		return link;
	}
}
