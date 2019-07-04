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
package org.polarsys.kitalpha.doc.gen.business.core.preference.helper;

public class DocgenOptionalityPreferencesHelper extends AbstractDocgenPreferencesHelper {
	
	public static final String PREFERENCE_DOCGEN_PREFIX = "docgen"; //$NON-NLS-1$
	
	/**
	 * Set a boolean value of a preference
	 * @param preferenceName name of a preference
	 * @param value of the preference
	 */
	public static void setCustomizedStringValue(String preferenceName, String value){
		STORE.setValue(preferenceName, value);
	}

}
