/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.examples.basic.ecore.workflow.activities;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.cadence.examples.basic.ecore.workflow.Activator;

public class EclipseBrowserLauncher implements IActivity {

	public EclipseBrowserLauncher() {
		// TODO Auto-generated constructor stub
	}

	public Collection<DeclaredParameter> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public IStatus run(ActivityParameters activityParams_p) {
		IStatus status = Status.OK_STATUS;

		String generatedFolderPath = (String) activityParams_p.getParameter(
				"generationDirectoryPath").getValue();

		IPath path = new Path(generatedFolderPath);
		IFolder ifolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
		File folder = new File(ifolder.getLocationURI().getPath());
		File[] files = folder.listFiles();

		for (File f : files) {
			try {
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(generatedFolderPath+"/"+f.getName()));
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file, true);
			} catch (PartInitException e) {
				status = new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage());
				Activator.getDefault().getLog().log(status);
			}
		}

		return status;
	}

	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters valuedParameters_p) {
		// TODO Auto-generated method stub
		return null;
	}

}
