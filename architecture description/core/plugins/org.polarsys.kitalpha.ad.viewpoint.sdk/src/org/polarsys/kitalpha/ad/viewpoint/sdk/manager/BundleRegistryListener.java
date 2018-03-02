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
package org.polarsys.kitalpha.ad.viewpoint.sdk.manager;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IRegistryEventListener;
import org.polarsys.kitalpha.ad.common.AD_Log;

/**
 * @author Thomas Guiu
 * 
 */
public class BundleRegistryListener implements IRegistryEventListener {

	private final String contributor;
	private boolean waiting = true;

	public BundleRegistryListener(String contributor) {
		super();
		this.contributor = contributor;
	}

	@Override
	public void removed(IExtensionPoint[] extensionPoints) {
		//nothing to do
	}

	@Override
	public void removed(IExtension[] extensions) {
		//nothing to do
	}

	@Override
	public void added(IExtensionPoint[] extensionPoints) {
		//nothing to do
	}

	@Override
	public void added(IExtension[] extensions) {
		for (IExtension ext : extensions) {
			if (contributor.equals(ext.getContributor().getName()))
				waiting = false;
		}

	}

	public void waitForEventDispatch() throws InterruptedException {
		int timeout = 20;
		while (waiting && timeout-- > 0) {
			Thread.sleep(100);
		}
		if (timeout == 0)
			AD_Log.RUNTIME.logWarning("Some bundles (related to " + contributor + ") may not be fully loaded.");

	}

}
