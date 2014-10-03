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

package org.polarsys.kitalpha.model.common.commands.contrib.backup;

import org.eclipse.osgi.util.NLS;

/**
 * @author Faycal Abka
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.model.common.commands.contrib.backup.messages"; //$NON-NLS-1$
	
	public static String BACKUP_RESOURCE_MESSAGE;

	public static String SAVE_RESOURCE_MESSAGE;

	public static String REFRESH_PROJECT_MESSAGE;

	public static String FOLDER_CREATION_MESSAGE;

	public static String ROOT_FOLDER_CREATION_MESSAGE;
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	
	private Messages() {
	}
}
