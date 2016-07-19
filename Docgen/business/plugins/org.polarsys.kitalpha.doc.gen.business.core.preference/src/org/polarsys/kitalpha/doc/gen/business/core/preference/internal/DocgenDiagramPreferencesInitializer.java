/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.preference.internal;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;

/**
 * @author Boubekeur Zendagui
 */

public class DocgenDiagramPreferencesInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		DocgenDiagramPreferencesHelper.restorExportDiagramDefaultValues();
	}

}
