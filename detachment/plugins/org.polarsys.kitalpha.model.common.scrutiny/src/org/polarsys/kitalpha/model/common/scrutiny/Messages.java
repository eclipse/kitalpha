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
package org.polarsys.kitalpha.model.common.scrutiny;

import org.eclipse.osgi.util.NLS;

/**
 * @author Faycal Abka
 */
public class Messages {
	
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.model.common.scrutiny.messages"; //$NON-NLS-1$



	

	
	
	//Registry
	public static String UR_EXTENSION_CANT_GET;
	public static String UR_CONTRIBUTE_SEVERAL_SAME_CLASS;
	//TODO
	public static String MODEL_SCRUTINY_NO_EXTENSION_FOUND;
	public static Object MODEL_SCRUTINY_NO_SCRUTINIZE_FOUND;
	
	//Detachment Service - Refresh representations
	public static String REFRESH_REMPRESENTATIONS;
	public static String SAVE_SIRIUS_SESSION;
	public static String CLOSING_SIRIUS_SESSION;
	
	
	//Extension
	public static String SEVERAL_ID_EXTENSION;
	public static String NO_SUCH_REGISTRY_ELEMENT;



	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	
	private Messages() {
	}

}
