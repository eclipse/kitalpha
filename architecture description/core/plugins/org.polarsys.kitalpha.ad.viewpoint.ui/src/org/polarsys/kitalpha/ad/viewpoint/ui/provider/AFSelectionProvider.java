/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.provider;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.ISelectionListener;
import org.polarsys.kitalpha.ad.common.AD_Log;

/**
 * @author Thomas Guiu
 * 
 */
public interface AFSelectionProvider {
	List<Object> getSelection();

	void addListener(ISelectionListener listener);

	void removeListener(ISelectionListener listener);

	void dispose();

	Helper INSTANCE = new Helper();

	class Helper {
		public AFSelectionProvider getSelectionProvider(String id) {
			IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(ID);
			for (IConfigurationElement elt : configurationElements) {
				String idAttr = elt.getAttribute("id");
				if (id.equals(idAttr)){
					try {
						return (AFSelectionProvider) elt.createExecutableExtension("class");
					} catch (CoreException e) {
						AD_Log.getDefault().logError(e);
					}
				}
			}
			return null;
		}

	}

	String ID = "org.polarsys.kitalpha.ad.viewpoint.ui.provider.selection";
	String DEFAULT_PROVIDER_ID = "org.polarsys.capella.core.af.integration.provider.CapellaSelectionProvider";
	String DEFAULT_PROVIDER_ID2 = "org.polarsys.kitalpha.ad.integration.sirius.providers.SiriusSelectionProvider";
}
