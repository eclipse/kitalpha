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

import java.net.URL;

import org.eclipse.core.runtime.Status;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.polarsys.kitalpha.richtext.widget.internal.Activator;
import org.polarsys.kitalpha.richtext.widget.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public class HttpLinkHandler extends AbstractLinkTypeHandler {

	@Override
	public String resolveType(String link) {
		return link != null && link.contains("http:")? LinkManager.URL : LinkManager.UNKNOWN; //$NON-NLS-1$<z
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
	public void openLink(String link) {
		try {
			int style = IWorkbenchBrowserSupport.AS_EDITOR | IWorkbenchBrowserSupport.LOCATION_BAR | IWorkbenchBrowserSupport.STATUS;
			IWebBrowser browser = PlatformUI.getWorkbench().getBrowserSupport().createBrowser(style, null, link, link);
			browser.openURL(new URL(link));
		} catch (Exception e) {
			Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, "openLink(...)", e); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
		}
	}
	
	@Override
	protected Tuple<String, String> customizeLink(String link, Object object) {
		return super.customizeLink(LinkManager.URL + "://" + link, object);
	}

	@Override
	public Tuple<String, String> getPath(Object object) {
		throw new UnsupportedOperationException(Messages.RichTextWidget_Exception_URL_Error_Computation);
	}

}
