/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author Thomas Guiu
 * 
 */
public class ProjectHelper {

	public static IProject createProject(String name, String vpName, String vpId, String vpuuid, String vpURI, IProgressMonitor monitor) throws CoreException, IOException {
		return new AFProjectHelper().createProject(name, vpName, vpId, vpuuid, vpURI, monitor);
	}

}
