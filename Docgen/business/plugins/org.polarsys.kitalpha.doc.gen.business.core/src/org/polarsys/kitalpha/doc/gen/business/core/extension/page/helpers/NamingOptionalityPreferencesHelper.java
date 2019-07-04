/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.extension.page.helpers;

import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionElement;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenOptionalityPreferencesHelper;

/**
 * 
 * @author Faycal Abka
 *
 */
public class NamingOptionalityPreferencesHelper extends DocgenOptionalityPreferencesHelper {
	
	/**
	 * Compute the key of the category
	 * 
	 * @param pageExtensionElement
	 * @return well formed key of the category
	 */
	public static String getKeyOfPageExtensionElement(PageExtensionElement pageExtensionElement) {
		return getKeyOfPageExtensionElement(pageExtensionElement.getDomain(), pageExtensionElement.getCategory());
	}
	
	/**
	 * 
	 * @param domain as string
	 * @param category as string
	 * @return well formed key of the category
	 */
	public static String getKeyOfPageExtensionElement(String domain, String category) {
		return PREFERENCE_DOCGEN_PREFIX + "." + domain + "." + category;
	}

}
