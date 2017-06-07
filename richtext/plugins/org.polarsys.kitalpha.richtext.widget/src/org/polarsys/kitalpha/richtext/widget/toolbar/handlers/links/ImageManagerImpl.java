/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.toolbar.handlers.links;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ImageManagerImpl extends LinksManagerImpl {

	public static final String DISK_LABEL = "Image (absolute path)"; //$NON-NLS-1$
	public static final String LOCAL_LABEL = "Image (project relative path)"; //$NON-NLS-1$
	
	@Override
	protected final void initializeDefaultLinks() {
		addLinkType(LOCAL_LABEL, LOCAL_LABEL, new LocalImageHandler());
		addLinkType(DISK_LABEL, DISK_LABEL, new DiskImageHandler());
	}

}
