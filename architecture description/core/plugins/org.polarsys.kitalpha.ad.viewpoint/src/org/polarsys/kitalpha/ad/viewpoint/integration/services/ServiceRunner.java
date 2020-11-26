/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.integration.services;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.ad.viewpoint.Activator;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;
import org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor;

/**
 * @author Thomas Guiu
 * 
 */
public class ServiceRunner {

	public boolean canRun(Service action, ModelManager vpMgr, List<Object> selection) {
		try {
			ServiceImplementation impl = Implementations.getInstance(action);
			if (impl == null) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.getSymbolicName(), "An error occured while loading viewpoint service:" + action.getId()));
				return false;
			}
			return impl.canRun(action, new ModelAccessor(vpMgr), selection == null ? new Object[0] : selection.toArray());

		} catch (Exception e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.getSymbolicName(), "Error with service", e));
			return false;
		}
		
	}

	public boolean run(Service action, ModelManager vpMgr, List<Object> selection) {
		return doRun(action, vpMgr, selection) == null;
	}

	protected String doRun(Service action, ModelManager vpMgr, List<Object> selection) {
		try {
			ServiceImplementation impl = Implementations.getInstance(action);
			if (impl == null){
				return "An error occured while loading viewpoint service:" + action.getId();
			}

			impl.run(action, new ModelAccessor(vpMgr), selection == null ? new Object[0] : selection.toArray());

		} catch (Exception e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.getSymbolicName(), "Error with service", e));
			return "An error occured while executing viewpoint service:" + action.getId();
		}
		return null;
	}

}
