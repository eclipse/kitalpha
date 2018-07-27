/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.common.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.richtext.common.internal.Activator;

/**
 * 
 * @author Faycal Abka
 * @author Minh Tu TON THAT
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
		if (null == eObject) {
			return null;
		}
		IFile res = getFile(eObject);
		if (res != null) {
			result = res.getProject();
		}
		return result;
	}
	
	public static IFile getFile(EObject eObject) {
		if (eObject == null || eObject.eResource() == null) {
			return null;
		}
		return WorkspaceSynchronizer.getFile(eObject.eResource());
	}
	
	/**
	 * Get String of the path of the project where the eObject is holded
	 * @param eObject
	 * @return A string which represents the path of the project or null
	 */
	public static String getProjectPath(EObject eObject){
		IProject project = getProject(eObject);
		if (project != null) {
			IPath path = project.getLocation();
			if (path != null) {
				return path.toPortableString();
			}
		}
		return null;
	}
	
	/**
	 * return the URL of path within the bundle
	 * @param bundleId
	 * @param path
	 * @return
	 */
	public static URL getURL(String bundleId, String path){
		Bundle bundle = Platform.getBundle(bundleId);
		URL escapedURL = null;
		if (bundle != null){
			URL url = FileLocator.find(bundle, new Path(path), null);
			try {
				URL resolvedUrl = FileLocator.toFileURL(url);
				URI uri = new URI(resolvedUrl.getProtocol(), resolvedUrl.getPath(), null);
				escapedURL = uri.toURL();
			} catch (IOException e) {
				Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			} catch (URISyntaxException e) {
				Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
		return escapedURL;
	}
}
