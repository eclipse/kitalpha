/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.ext.types;

import java.net.URL;

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.polarsys.kitalpha.richtext.widget.tools.ext.internal.Activator;
import org.polarsys.kitalpha.richtext.widget.tools.intf.LinkHandler;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Constants;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public class URLLinkHandler implements LinkHandler {

	public URLLinkHandler() {
	}
	
	@Override
	public boolean canHandleLink(String link) {
		return link != null && (link.contains("http:") || link.contains("https:")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	public void openLink(Object object, String link) {
		try {
			int style = IWorkbenchBrowserSupport.AS_EDITOR | IWorkbenchBrowserSupport.LOCATION_BAR | IWorkbenchBrowserSupport.STATUS;
			IWebBrowser browser = PlatformUI.getWorkbench().getBrowserSupport().createBrowser(style, null, link, link);
			browser.openURL(new URL(link));
		} catch (Exception e) {
			Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, "openLink(" + link + ")", e); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
		}
	}

	@Override
	public Tuple<String, String> getLink(String linkType, String basePath, Object object) {
		return null;
	}

	@Override
	public String encode(String url, String urlDisplayName) {
		
		if (!isLinkUsesScheme(url, Constants.URL_SECURE) && !isLinkUsesScheme(url, Constants.URL)) {
			//Default protocol is http
			url = Constants.URL + "://" + url; //$NON-NLS-1$
		}
		
		//Default protocol is http://
		return "<a href=\"" + url + "\">" + StringEscapeUtils.escapeHtml(urlDisplayName) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
	
	/**
	 * Check if the link uses the scheme
	 * @param link
	 * @param scheme
	 * @return true if link start with scheme, false otherwise
	 */
	private boolean isLinkUsesScheme(String link, String scheme) {
		return link.toLowerCase().startsWith(scheme);
	}

	@Override
	public String decode(String url, String basePath) {
		return url;
	}
}
