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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.message;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.message.messages"; //$NON-NLS-1$
	
	// Viewpoint constraints messages
	public static String Viewpoint_ID_Not_Unique;
	
	// Viewpoint generation messages
	public static String Viewpoint_Generation;
	public static String Viewpoint_Generation_Excecution_Problem;
	
	// PDE Helper task
	public static String Pde_Helper__Update_Bin;
	public static String Pde_Helper__Contract_Value_Required;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
