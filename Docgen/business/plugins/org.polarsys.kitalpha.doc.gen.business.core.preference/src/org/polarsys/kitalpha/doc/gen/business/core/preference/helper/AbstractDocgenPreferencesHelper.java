/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.preference.helper;

import org.eclipse.jface.preference.IPreferenceStore;
import org.polarsys.kitalpha.doc.gen.business.core.preference.Activator;

/**
 * @author Boubekeur Zendagui
 */

public abstract class AbstractDocgenPreferencesHelper {

	public final static IPreferenceStore STORE =  Activator.getDefault().getPreferenceStore();
	
	/**
	 * Get a string value of a preference
	 * @param preferenceName name of a preference
	 * @return the value of a preference
	 */
	public static String getCustomizedStringValue(String preferenceName){
		return STORE.getString(preferenceName);
	}
	
	/**
	 * Get a string value of a preference
	 * @param preferenceName name of a preference
	 * @return the value of a preference
	 */
	public static boolean getCustomizedBooleanValue(String preferenceName){
		return STORE.getBoolean(preferenceName);
	}
}
