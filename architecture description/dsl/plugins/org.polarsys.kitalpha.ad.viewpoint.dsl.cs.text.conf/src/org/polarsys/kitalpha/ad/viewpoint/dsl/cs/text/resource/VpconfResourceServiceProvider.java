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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpconfResourceServiceProvider extends DefaultResourceServiceProvider {

	public VpconfResourceServiceProvider() {
	}
	
	@Override
	public boolean canHandle(URI uri) {
		String fileExtension = ResourceHelper.getFileExtension(uri);
		if (fileExtension.equals(FileExtension.CONFIGURATION_EXTENSION))
			return true;
		return false;
	}
}
