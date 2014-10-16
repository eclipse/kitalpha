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

public class ViewpointDslPreferencesHelper{

	public final static IPreferenceStore store =  Activator.getDefault().getPreferenceStore();
	
	/**
	 * This check the user choice.
	 * @return True (default value) if the user want to use Target application Value, False if he/she 
	 * want to use u customized value
	 */
	public static boolean useTargetApplicationValue(){
		return store.getBoolean(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__USE_TA);
	}
	
	/**
	 * @return the root project name preference value 
	 */
	public static String getCustomizedRPNValue(){
		return getCustomizedStringValue(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__VALUE);
	}
	
	/**
	 * @return the default target application preference value
	 */
	public static String getCustomizedDefaultTAValue(){
		return getCustomizedStringValue(ViewpointDslPreferenceConstant.VP_TA__DEFAULT);
	}
	
	/**
	 * This get a string value of a preference
	 * @param preferenceName name of a preference
	 * @return the value of a preference
	 */
	public static String getCustomizedStringValue(String preferenceName){
		return store.getString(preferenceName);
	}
	
	/**
	 * Set the properties of Root Project Name to there default values
	 */
	public static void restorRPNDefautValues(){
		store.setDefault(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__USE_TA, true);
		store.setDefault(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__VALUE, 
				         ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__DEFAULT_VALUE);
	}
	
	/**
	 * Set the properties of Target Application to there default values
	 */
	public static void restorDefautTADefaultValues(){
		store.setDefault(ViewpointDslPreferenceConstant.VP_TA__DEFAULT, 
				         ViewpointDslPreferenceConstant.VP_TA__DEFAULT__DEFAULT_VALUE);
	}
}
