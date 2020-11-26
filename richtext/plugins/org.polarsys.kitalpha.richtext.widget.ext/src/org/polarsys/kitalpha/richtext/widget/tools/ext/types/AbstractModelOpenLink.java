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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.richtext.widget.tools.ext.internal.Activator;
import org.polarsys.kitalpha.richtext.widget.tools.ext.internal.ExtensionManager;
import org.polarsys.kitalpha.richtext.widget.tools.ext.intf.OpenLinkStrategy;
import org.polarsys.kitalpha.richtext.widget.tools.intf.LinkHandler;

/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class AbstractModelOpenLink implements LinkHandler {

	@Override
	public boolean canHandleLink(String link) {
		return link != null && link.contains("hlink:"); //$NON-NLS-1$
	}

	@Override
	public void openLink(Object object, String link) {
		OpenLinkStrategy strategy = (new ExtensionManager()).getFirstFoundStrategy();
		if (strategy != null) {
			strategy.openLink(object, link);
		} else {
			Status status = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Cannot found the strategy to open " + link); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
		}
	}
}