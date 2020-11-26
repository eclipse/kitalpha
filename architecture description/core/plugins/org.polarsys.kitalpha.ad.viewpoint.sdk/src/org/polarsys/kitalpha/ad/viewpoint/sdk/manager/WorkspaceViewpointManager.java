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

package org.polarsys.kitalpha.ad.viewpoint.sdk.manager;

import org.eclipse.osgi.util.NLS;
import org.osgi.framework.BundleException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.sdk.Messages;

/**
 * @author Thomas Guiu
 * 
 */
public class WorkspaceViewpointManager extends ViewpointManager {

	static {
		VP_FINDER = new WorkspaceFinder();
	}

	@Override
	protected void activateBundle(String id) throws ViewpointActivationException {
		try {
			BundleManager.INSTANCE.load(id);
		} catch (Exception e) {
			throw new ViewpointActivationException(NLS.bind(Messages.ManageBundle_error_title8, id), e);
		}
	}

	@Override
	protected void desactivateBundle(String id) throws ViewpointActivationException {
		if (!BundleManager.INSTANCE.isManaged(id)){
			return;
		}
		try {
			BundleManager.INSTANCE.unLoad(id);
		} catch (IllegalStateException e) {
			// we don't care
		} catch (BundleException e) {
			throw new ViewpointActivationException(NLS.bind(Messages.ManageBundle_error_title9, id), e);
		}
	}

	private static class WorkspaceFinder extends ViewpointFinder {

		
	}

}
