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

import java.net.URL;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.polarsys.kitalpha.richtext.mde.tools.internal.Activator;
import org.polarsys.kitalpha.richtext.mde.tools.managers.OpenStrategy;

/**
 * 
 * @author Faycal Abka
 *
 */
public class HttpOpenStrategy implements OpenStrategy {

	public HttpOpenStrategy() {
	}

	@Override
	public void doOpen(String link) {
		try {
			int style = IWorkbenchBrowserSupport.AS_EDITOR | IWorkbenchBrowserSupport.LOCATION_BAR | IWorkbenchBrowserSupport.STATUS;
			IWebBrowser browser = PlatformUI.getWorkbench().getBrowserSupport().createBrowser(style, null, link, link);
			browser.openURL(new URL(link));
		} catch (Exception e) {
			Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, "openLink(" + link + ")", e); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
		}
	}
}
