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
package org.polarsys.kitalpha.richtext.mde.tools.managers;

import org.polarsys.kitalpha.richtext.mde.tools.images.handlers.DiskImageHandler;
import org.polarsys.kitalpha.richtext.mde.tools.images.handlers.LocalImageHandler;
import org.polarsys.kitalpha.richtext.mde.tools.utils.Constants;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ImageManagerImpl extends LinksManagerImpl {

	
	@Override
	protected final void initializeDefaultLinks() {
		addLinkType(Constants.LOCAL_LABEL, Constants.LOCAL_LABEL, new LocalImageHandler());
		addLinkType(Constants.DISK_LABEL, Constants.DISK_LABEL, new DiskImageHandler());
	}

}
