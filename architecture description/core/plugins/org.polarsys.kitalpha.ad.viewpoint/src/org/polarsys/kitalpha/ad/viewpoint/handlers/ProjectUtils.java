/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
