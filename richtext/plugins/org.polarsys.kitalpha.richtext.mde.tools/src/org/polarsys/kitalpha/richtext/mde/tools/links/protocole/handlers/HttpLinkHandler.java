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
import org.polarsys.kitalpha.richtext.mde.tools.managers.Tuple;
import org.polarsys.kitalpha.richtext.mde.tools.messages.Messages;
import org.polarsys.kitalpha.richtext.mde.tools.utils.Constants;

/**
 * 
 * @author Faycal Abka
 *
 */
public class HttpLinkHandler extends AbstractLinkTypeHandler {

	@Override
	public String resolveType(String link) {
		return link != null && link.contains("http:")? Constants.URL : Constants.UNKNOWN; //$NON-NLS-1$<z
	}

	@Override
	public String encode(String url, String displayText) {
		return "<a href=\"" + customizeLink(url, null).getFirst() + "\">" + escapeDisplayedText(displayText) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$;
	}

	@Override
	public String decode(String link, String basePath) {
		return link;
	}

	
	@Override
	protected Tuple<String, String> customizeLink(String link, Object object) {
		return super.customizeLink(Constants.URL + "://" + link, object);
	}

	@Override
	public Tuple<String, String> getURI(Object object, String type) {
		throw new UnsupportedOperationException(Messages.RichTextWidget_Exception_URL_Error_Computation);
	}

}
