/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.integration.services;

import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.ServiceRunner;

/**
 * @author Thomas Guiu
 * 
 */
public class UIServiceRunner extends ServiceRunner {

	@Override
	public boolean run(Service action, ModelManager vpMgr, List<Object> selection) {
		String msg = doRun(action, vpMgr, selection);
		if (msg != null)
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error with service", msg);
		return msg == null;
	}
	
}
