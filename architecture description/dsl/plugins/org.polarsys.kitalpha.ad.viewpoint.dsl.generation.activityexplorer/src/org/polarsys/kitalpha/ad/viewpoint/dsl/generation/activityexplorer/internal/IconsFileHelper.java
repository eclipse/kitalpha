/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.activityexplorer.internal;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.log.ViewpointDslLogger;

public class IconsFileHelper {
	
	/** Default icons folder name: icons */
	public static final String ICONS_FOLDER_NAME = "icons";
	/** Default progress monitor */
	private static final NullProgressMonitor NPM = new NullProgressMonitor();

	/**
	 * Copy an icon from a location to an other one. The default icons folder name is {@link #ICONS_FOLDER_NAME}
	 * @param iconName the name of the icon file including the file extension.
	 * @param sourceProjectName the name of the source project.
	 * @param targetProjectName the name of the target project.
	 * @throws InvocationTargetException
	 * @throws InterruptedException
	 */
	public static void copyIcon(final String iconName, String sourceProjectName, String targetProjectName) throws InvocationTargetException, InterruptedException{
		final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		// Check existence of source project
		final IProject sourceProject = workspaceRoot.getProject(sourceProjectName);
		if (!sourceProject.exists())
		{
			throw new RuntimeException("Project " + sourceProjectName + "doesn't exists");
		}
		
		// Check existence of target project
		final IProject targetProject = workspaceRoot.getProject(targetProjectName);
		if (!targetProject.exists())
		{
			throw new RuntimeException("Project " + targetProjectName + "doesn't exists");
		}
		
		WorkspaceModifyOperation wo = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
				IFolder iconFolder = sourceProject.getFolder(ICONS_FOLDER_NAME);
				IFile vpIconFile = iconFolder.getFile(iconName);
				if (vpIconFile.exists())
				{
					final IFolder targetFolder = targetProject.getFolder(ICONS_FOLDER_NAME);
					if (!targetFolder.exists())
					{
						targetFolder.create(true, true, NPM);
					}
					
					IFile targetIconFile = targetFolder.getFile(iconName);
		
					if (targetIconFile.exists())
					{
						// Replace old icon by the new one.
						targetIconFile.setContents(vpIconFile.getContents(), IFile.REPLACE, NPM);
					}
					else
					{
						// Copy the icon.
						targetIconFile.create(vpIconFile.getContents(), true, NPM);
					}
				}
				else
				{
					ViewpointDslLogger.doLogWarning("Unable to find the icon : " + iconName);
				}
			}
		};
		
		wo.run(null);
	}
}
