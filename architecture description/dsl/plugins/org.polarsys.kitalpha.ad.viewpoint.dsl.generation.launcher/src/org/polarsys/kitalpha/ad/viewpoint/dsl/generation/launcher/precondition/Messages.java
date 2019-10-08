/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.precondition;

import org.eclipse.osgi.util.NLS;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.Activator;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = Activator.PLUGIN_ID + ".precondition.messages"; //$NON-NLS-1$
	
	// Viewpoint constraints messages
	public static String Precondition_Message_NOK;
	public static String Precondition_Message_Details;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
