/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
