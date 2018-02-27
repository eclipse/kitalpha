/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.handlers;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.common.AD_Log;

/**
 * @author Thomas Guiu
 * 
 */
public class ProjectUtils {
	public static IProject getContainingProject(EObject eobj) {

		URI uri = eobj.eResource().getURI();
		if (uri.segmentCount() < 2) {
			AD_Log.getDefault().logError("Cannot find project name from resource: " + uri);
			return null;
		}
		String name = uri.segment(1);
		return ResourcesPlugin.getWorkspace().getRoot().getProject(name);
	}

	private ProjectUtils() {
		super();
		
	}

}
