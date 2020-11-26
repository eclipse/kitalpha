/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.preferences;

import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpbuildActivator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.preferences.kitalphaPreferences.PreferencesConstants;

/**
 * 
 * @author Amine Lajmi
 *
 */

public class VpbuildPreferences extends LanguageRootPreferencePage {
	
	@Override
    protected void createFieldEditors() {
		addField(new FileFieldEditor(PreferencesConstants.TARGET_PLATFORM_PREF, "Target-platfom",
				getFieldEditorParent()));
        addField(new StringFieldEditor(PreferencesConstants.FEATURES_ROOT_PATH, 
        		"Repository ", getFieldEditorParent()));
    }
	
	
	@Override
    public void init(IWorkbench workbench) {
		setPreferenceStore(VpbuildActivator.getInstance().getPreferenceStore());
    }
}
