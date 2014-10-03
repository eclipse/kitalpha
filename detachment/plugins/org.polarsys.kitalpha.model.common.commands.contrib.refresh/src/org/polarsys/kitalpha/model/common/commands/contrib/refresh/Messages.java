/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.common.commands.contrib.refresh;

import org.eclipse.osgi.util.NLS;

/**
 * @author Faycal Abka
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.model.common.commands.contrib.refresh.messages"; //$NON-NLS-1$
	
	public static String REFRESH_REMPRESENTATIONS;

	public static String SAVE_SIRIUS_SESSION;

	public static String CLOSING_SIRIUS_SESSION;
	
	
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	
	private Messages() {
	}
}
