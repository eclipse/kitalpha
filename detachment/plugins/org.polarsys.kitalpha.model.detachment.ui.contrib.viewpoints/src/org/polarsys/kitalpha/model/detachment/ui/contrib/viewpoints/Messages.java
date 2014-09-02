/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.detachment.ui.contrib.viewpoints;

import org.eclipse.osgi.util.NLS;

/**
 * @author Faycal Abka
 */
public class Messages {
	
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.model.detachment.ui.contrib.viewpoints.messages"; //$NON-NLS-1$
	
	public static String VIEWPOINTS_HIERARCHY;

	public static String VIEWPOINTS_HIERARCHY_DESC;

	public static String SELECT_ALL_LABEL;

	public static String DESELECT_ALL_LABEL;
	
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	
	private Messages() {
	}

}
