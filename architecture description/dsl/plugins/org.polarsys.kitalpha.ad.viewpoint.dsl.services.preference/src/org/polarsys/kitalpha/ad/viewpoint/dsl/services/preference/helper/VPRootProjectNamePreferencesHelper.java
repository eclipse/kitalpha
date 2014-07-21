/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.helper;

import org.eclipse.jface.preference.IPreferenceStore;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.Activator;

/**
 * @author Boubekeur Zendagui
 */

public class VPRootProjectNamePreferencesHelper {

	private final static IPreferenceStore store =  Activator.getDefault().getPreferenceStore();
	
	/**
	 * This check the user choice.
	 * @return True (default value) if the user want to use Target application Value, False if he/she 
	 * want to use u customized value
	 */
	public static boolean useTargetApplicationValue(){
		return store.getBoolean(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__USE_TA);
	}
	
	
	/**
	 * This get the value customized by user
	 * @return a root project name provided by user
	 */
	public static String getCustomizedValue(){
		return store.getString(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__VALUE);
	}
	
	/**
	 * Set the properties to there default values
	 */
	public static void restorDefautValues(){
		store.setDefault(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__USE_TA, true);
		store.setDefault(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__VALUE, 
				         ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__DEFAULT_VALUE);
	}
}
