/*******************************************************************************
 * Copyright (c) 2015, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.amalgam.pages;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.BasicSessionActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.SiriusHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;

/**
 * @author Thomas Guiu
 *
 */
public abstract class ADActivityExplorerPage extends BasicSessionActivityExplorerPage {

	protected abstract String getViewpointID();

	@Override
	public boolean isVisible() {
		if (getEditorInput() != null)
		{
			Session session = ActivityExplorerManager.INSTANCE.getSession();
			if (session != null)
			{
				ViewpointManager instance = SiriusHelper.getViewpointManager(session);
				String vpid = getViewpointID();
				boolean used = instance.isUsed(vpid);
				boolean filtered = instance.isFiltered(vpid);
				return used && !filtered &&  super.isVisible();
			}
		}
		return super.isVisible();
	}
}
