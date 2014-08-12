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
public class DocumentationBrandingData {
	private static DocumentationBrandingData INSTANCE;
	
	private Map<String, Object> data = new HashMap<String, Object>();
	
	public static DocumentationBrandingData getInstance() {
		if (INSTANCE == null)
			INSTANCE = new DocumentationBrandingData();
		
		return INSTANCE;
	}
	
	/**
	 * Remove all available branding data.
	 */
	public void removeAllData() {
		data.clear();
	}
	
	/**
	 * Get the value of a branding data.
	 * @param key the date name
	 * @return the data value
	 * @throws IllegalArgumentException : in the case of a non available data
	 */
	public Object getData(String key) throws IllegalArgumentException{
		final Object object = data.get(key);
		if (object != null)
			return object;
		else
		{
			if (DocumentationBrandingDefaultData.isThereDefautData(key))
				return DocumentationBrandingDefaultData.getDefaultData(key);
		}
		// TODO: Put a warning in the error log.
		throw new IllegalArgumentException("There is no such branding data");
	}
	
	/**
	 * Register a given branding data
	 * @param key data name
	 * @param value data value
	 */
	public void addData(String key, Object value) {
		data.put(key, value);
	}
	
}
