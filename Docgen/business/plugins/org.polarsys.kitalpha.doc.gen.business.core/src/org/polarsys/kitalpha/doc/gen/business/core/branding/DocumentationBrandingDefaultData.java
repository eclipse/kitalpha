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
package org.polarsys.kitalpha.doc.gen.business.core.branding;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Boubekeur Zendagui
 */
public final class DocumentationBrandingDefaultData {

	/**
	 * A Map containing default data. These data will be used if no branding object is available.
	 */
	private static Map<String, Object> data = new HashMap<String, Object>();
	
	// Initialize default data
	static {
		data.put("copyright", "(c) Thales Global Services S.A.S, 2014. All Rights Reserved.");
		data.put("logoPath", "Default");
		data.put("logoAlt", "Kitalpha");
	}
	/**
	 * Check if a default data is available for data identified by key
	 * @param key the name of the data
	 * @return True if there is a default value for the key
	 */
	public static boolean isThereDefautData(String key){
		return data.containsKey(key);
	}
	
	/**
	 * Return a default value of the data identified by key
	 * @param key the name of the data
	 * @return the value of the data
	 */
	public static Object getDefaultData(String key) {
		return data.get(key);
	}
}
