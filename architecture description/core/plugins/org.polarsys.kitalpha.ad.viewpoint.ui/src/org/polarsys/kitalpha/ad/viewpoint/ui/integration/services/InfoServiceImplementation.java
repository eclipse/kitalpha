/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.integration.services;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.ServiceImplementation;
import org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor;

/**
 * @author Thomas Guiu
 * 
 */
public class InfoServiceImplementation implements ServiceImplementation {

	@Override
	public void run(Service action, ModelAccessor properties, Object[] selection) {
		MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Test dialog", "This is a test!");
	}

	@Override
	public boolean canRun(Service action, ModelAccessor properties, Object[] selection) {
		return true;
	}
}
