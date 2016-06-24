/*******************************************************************************
 * Copyright (c) 2014-2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.project.VpDslProjectHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;

/**
 * @author Boubekeur Zendagui
 */

public class IconPathHelper {
	
	private static final String NO_ICON_NAME = "Icon name must have a value";
	private static final String VPELEMENT_IS_NULL = "Viewpoint element must be not null";
	private static final String VPELEMENT_NAME_IS_NULL = "Viewpoint element name must be not null";
	
	private static final String DEFAULT_ICON_FOLDER = "icons";
	private static final String DEFAULT_DESIGN_PROJECT = "design";
	
	private static final NullProgressMonitor NPM = new NullProgressMonitor();
	
	/**
	 * This method computes the icon path to put in the odesign model. 
	 * The path format is like: /PluginID/Folder/IconeFileName.Extension
	 * @param icon_name: the value of the attribute icon
	 * @param vpElement: the viewpoint element for which the icon is processed
	 * @return The icon path to put in the odesign model
	 */
	public static String computeDslIconPath(String iconName, NamedElement vpElement){
		// Checking the icon name value
		if (iconName == null || (iconName != null && iconName.trim().length() == 0))
		{
			throw new IllegalArgumentException(NO_ICON_NAME);
		}
		
		if (vpElement == null)
		{
			throw new IllegalArgumentException(VPELEMENT_IS_NULL);
		}
		
		final String pluginID = VpDslConfigurationHelper.getRootProjectName(vpElement);
		return "/"+pluginID+"."+DEFAULT_DESIGN_PROJECT+"/"+DEFAULT_ICON_FOLDER+"/"+iconName;
	}
	
	/**
	 * This method copy the icon file from the source folder (available in the vpSpec Project) to the target 
	 * folder (available in the viewpoint specification project)
	 * @param icon_name: the value of the attribute icon (complete file name (with extension))
	 * @param vpElement: the viewpoint element for which the icon is processed
	 * @return
	 * @throws CoreException
	 * @throws InterruptedException 
	 * @throws InvocationTargetException 
	 */
	public static boolean copyIconFile(String iconName, NamedElement vpElement) 
							throws CoreException, InvocationTargetException, InterruptedException{
		boolean result = true;
		IFolder sourceFolder = VpDslProjectHelper.getVpDslIconFolder(vpElement, false);
		if (sourceFolder == null || !sourceFolder.exists())
		{
			return false;
		}
		
		final IFile sourceIcon = sourceFolder.getFile(iconName);
		if (sourceIcon == null || ! sourceIcon.exists())
		{
			return false;
		}
		
//		String target_icon_name = computeTargetIconFileName(icon_name, vpElement);
		IFolder targetFolder = getTargetFolder(vpElement);
		
		final IFile targetIcon = targetFolder.getFile(iconName);
		
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException,
					InvocationTargetException, InterruptedException {
				if (targetIcon.exists())
				{
					targetIcon.delete(false, NPM);
				}
				sourceIcon.copy(targetIcon.getFullPath(), true, NPM);
			}
		};
		operation.run(NPM);
		return result;
	}
	
	private static IFolder getTargetFolder(NamedElement vpElement) 
							throws CoreException, InvocationTargetException, InterruptedException{
		String pluginID = VpDslConfigurationHelper.getRootProjectName(vpElement);
		String designProjectPath = "/"+pluginID+"."+DEFAULT_DESIGN_PROJECT;
		
		IProject designProject = ResourcesPlugin.getWorkspace().getRoot().getProject(designProjectPath);
		final IFolder designIconFolder = designProject.getFolder(DEFAULT_ICON_FOLDER);
		if (! designIconFolder.exists())
		{
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException,
						InvocationTargetException, InterruptedException {
					designIconFolder.create(true, true, NPM);
				}
			};
			operation.run(NPM);
		}
		
		return designIconFolder;
	}
	
	/**
	 * This method computes the the name of the icon to add to the viewpoint specification project.
	 * The name format is like: [vpElement name].Extension
	 * @param icon_name: the value of the attribute icon
	 * @param vpElement: the viewpoint element for which the icon is processed
	 * @return
	 */
	@Deprecated
	private static String computeTargetIconFileName(String iconName, NamedElement vpElement){
		String vpElementName = vpElement.getName();
		String iconExt = getIconFileExtension(iconName);
		if (vpElementName.trim().length() == 0)
		{
			throw new IllegalArgumentException(VPELEMENT_NAME_IS_NULL);
		}
		return (iconExt.trim().length() > 0 ? vpElementName + "." + iconExt : vpElementName);
	}
	
	/**
	 * This method extract the icon file extension from the icon file name.
	 * @param icon_name: the value of the attribute icon
	 * @return icon file extension or empty string
	 */
	private static String getIconFileExtension(String iconName){
		int pointIndex = iconName.lastIndexOf(".");
		String iconExt = "";
		if (pointIndex != -1)
			iconExt = iconName.substring(pointIndex + 1);
		
		return iconExt;
	}
}
