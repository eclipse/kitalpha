/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.preferences.kitalphaPreferences;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.Preferences;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class PreferencesConstants {
	public static final String TARGET_PLATFORM_PREF = "target-platform-pref";
	public static final String FEATURES_ROOT_PATH	= "features-root-path-pref";
	public static final String DEFAULT_VALUE_TARGET_PLATFORM = normalizePlatformTarget(Platform.getInstallLocation().getURL().toString());
	public static final String DEFAULT_VALUE_FEATURES_ROOT_PATH = "org.polarsys.kitalpha.vp";
	public static final String VPBUILD_UI_BUNDLE = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.build.ui";
	
	
	private static String normalizePlatformTarget(String s){
		String os = System.getProperty("os.name").toLowerCase();
		if ((s != null) && s.contains("file:/")){
			return s.substring("file:/".length()) + "eclipse" + ((os.indexOf("win") >= 0)?".exe":"");
		}
		
		return "C:/eclipse";
	}
	
	public static String getBuildPreferences(String key){
		String value = null;
		
		IPreferencesService prefServices = Platform.getPreferencesService();
		Preferences prefs = prefServices.getRootNode().
			node(InstanceScope.SCOPE).
				node(PreferencesConstants.VPBUILD_UI_BUNDLE);
		
		if (prefs != null){
			value = prefs.get(
					(key.equals(PreferencesConstants.TARGET_PLATFORM_PREF))?PreferencesConstants.TARGET_PLATFORM_PREF:PreferencesConstants.FEATURES_ROOT_PATH,
					(key.equals(PreferencesConstants.TARGET_PLATFORM_PREF))?PreferencesConstants.DEFAULT_VALUE_TARGET_PLATFORM:PreferencesConstants.DEFAULT_VALUE_FEATURES_ROOT_PATH);
		} else {
			//If there are no preferences, returns the hard coded platform.
			return (key.equals(PreferencesConstants.TARGET_PLATFORM_PREF))?PreferencesConstants.DEFAULT_VALUE_TARGET_PLATFORM:PreferencesConstants.DEFAULT_VALUE_FEATURES_ROOT_PATH;
		}
		return value.replaceAll("\\\\", "/");
	}
}
