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
package org.polarsys.kitalpha.richtext.common.util;

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.osgi.framework.Bundle;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MDERichTextHelper {

	private MDERichTextHelper(){
	}

	/**
	 * Get project where the resource of the eObject is holded
	 * @param eObject
	 * @return the project or null
	 */
	public static IProject getProject(EObject eObject) {
		IProject result = null;
		Resource resource;
		if ((null == eObject) || ((resource = eObject.eResource()) == null)) {
			return result;
		}
		IFile res = WorkspaceSynchronizer.getFile(resource);
		if (res != null) {
			result = res.getProject();
		}
		return result;
	}
	
	/**
	 * Get String of the path of the project where the eObject is holded
	 * @param eObject
	 * @return A string which represents the path of the project or null
	 */
	public static String getProjectPath(EObject eObject){
		IProject project = getProject(eObject);
		return project != null? project.getLocation().toPortableString() : null;
	}
	
	/**
	 * return the URL of path within the bundle
	 * @param bundleId
	 * @param path
	 * @return
	 */
	public static URL getURL(String bundleId, String path){
		Bundle bundle = Platform.getBundle(bundleId);
		URL url = null;
		if (bundle != null){
			url = FileLocator.find(bundle, new Path(path), null);
			return url;
		}
		return url;
	}
}
