/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.kitalpha.emde.extension.preferences;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.BackingStoreException;
import org.polarsys.kitalpha.emde.Activator;
import org.polarsys.kitalpha.emde.extension.DefaultModelExtensionManager;
import org.polarsys.kitalpha.emde.extension.ExtendedModel;
import org.polarsys.kitalpha.emde.extension.ExtensibleModel;
import org.polarsys.kitalpha.emde.extension.utils.Log;

/**
 * @author Thomas Guiu
 * 
 */
public class PreferenceModelExtensionManager extends DefaultModelExtensionManager {

	private static final String MODEL_DISABLED_PREFERENCE = "model.disabled_";

	public void setExtensionModelDisabled(ExtensibleModel extensibleModel, ExtendedModel extendedModel, boolean disabled) {
		if (isExtensionModelDisabled(extendedModel) != disabled) {
			IEclipsePreferences prefs = getPreferencesRoot();
			prefs.putBoolean(computeKey(extendedModel), disabled);
			flushPreferences(prefs);
			fireExtensionEvent(extendedModel.getName(), !disabled);
		}
	}

	public boolean isExtensionModelDisabled(ExtendedModel extendedModel) {
		return getPreferencesRoot().getBoolean(computeKey(extendedModel), false);
	}

	protected String computeKey(ExtendedModel extendedModel) {
		return MODEL_DISABLED_PREFERENCE + extendedModel.getQualifiedName();
	}

	static IEclipsePreferences getPreferencesRoot() {
		IEclipsePreferences root = (IEclipsePreferences) Platform.getPreferencesService().getRootNode().node(InstanceScope.SCOPE);
		return (IEclipsePreferences) root.node(Activator.getContext().getBundle().getSymbolicName());
	}

	static void flushPreferences(IEclipsePreferences prefs) {
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			Log.getDefault().logError(e);
		}
	}

}
