/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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
	
	private static final String no_icon_name = "Icon name must have a value";
	private static final String vpElement_is_null = "Viewpoint element must be not null";
	private static final String vpElement_name_is_null = "Viewpoint element name must be not null";
	
	private static final String default_icon_folder = "icons";
	private static final String default_design_project = "design";
	
	private static final NullProgressMonitor null_progress_monitor = new NullProgressMonitor();
	
	/**
	 * This method computes the icon path to put in the odesign model. 
	 * The path format is like: /PluginID/Folder/IconeFileName.Extension
	 * @param icon_name: the value of the attribute icon
	 * @param vpElement: the viewpoint element for which the icon is processed
	 * @return The icon path to put in the odesign model
	 */
	public static String computeDslIconPath(String icon_name, NamedElement vpElement){
		// Checking the icon name value
		if (icon_name == null || (icon_name != null && icon_name.trim().length() == 0))
		{
			throw new IllegalArgumentException(no_icon_name);
		}
		
		if (vpElement == null)
		{
			throw new IllegalArgumentException(vpElement_is_null);
		}
		
		String plugin_ID = VpDslConfigurationHelper.getRootProjectName(vpElement);
//		String target_icon_name = computeTargetIconFileName(icon_name, vpElement);
//		String icon_path = "/"+plugin_ID+"."+default_design_project+"/"+default_icon_folder+"/"+target_icon_name;
		String icon_path = "/"+plugin_ID+"."+default_design_project+"/"+default_icon_folder+"/"+icon_name;
		return icon_path;
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
	public static boolean copyIconFile(String icon_name, NamedElement vpElement) 
							throws CoreException, InvocationTargetException, InterruptedException{
		boolean result = true;
		IFolder source_folder = VpDslProjectHelper.getVpDslIconFolder(vpElement, false);
		if (source_folder == null || !source_folder.exists())
			return false;
		
		final IFile source_icon = source_folder.getFile(icon_name);
		if (source_icon == null || ! source_icon.exists())
			return false;
		
//		String target_icon_name = computeTargetIconFileName(icon_name, vpElement);
		IFolder target_folder = getTargetFolder(vpElement);
		
		final IFile target_icon = target_folder.getFile(icon_name);
		
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException,
					InvocationTargetException, InterruptedException {
				if (target_icon.exists())
				{
					target_icon.delete(false, null_progress_monitor);
				}
				source_icon.copy(target_icon.getFullPath(), true, null_progress_monitor);
			}
		};
		operation.run(null_progress_monitor);
		
		return result;
	}
	
	private static IFolder getTargetFolder(NamedElement vpElement) 
							throws CoreException, InvocationTargetException, InterruptedException{
		String plugin_ID = VpDslConfigurationHelper.getRootProjectName(vpElement);
		String Design_Project_path = "/"+plugin_ID+"."+default_design_project;
		
		IProject design_project = ResourcesPlugin.getWorkspace().getRoot().getProject(Design_Project_path);
		final IFolder design_icon_folder = design_project.getFolder(default_icon_folder);
		if (! design_icon_folder.exists())
		{
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException,
						InvocationTargetException, InterruptedException {
					design_icon_folder.create(true, true, null_progress_monitor);
				}
			};
			operation.run(null_progress_monitor);
		}
		
		return design_icon_folder;
	}
	
	/**
	 * This method computes the the name of the icon to add to the viewpoint specification project.
	 * The name format is like: [vpElement name].Extension
	 * @param icon_name: the value of the attribute icon
	 * @param vpElement: the viewpoint element for which the icon is processed
	 * @return
	 */
	@Deprecated
	private static String computeTargetIconFileName(String icon_name, NamedElement vpElement){
		String vpElement_name = vpElement.getName();
		String icon_ext = getIconFileExtension(icon_name);
		if (vpElement_name.trim().length() == 0)
		{
			throw new IllegalArgumentException(vpElement_name_is_null);
		}
		return (icon_ext.trim().length() > 0 ? vpElement_name + "." + icon_ext : vpElement_name);
	}
	
	/**
	 * This method extract the icon file extension from the icon file name.
	 * @param icon_name: the value of the attribute icon
	 * @return icon file extension or empty string
	 */
	private static String getIconFileExtension(String icon_name){
		int point_index = icon_name.lastIndexOf(".");
		String icon_ext = "";
		if (point_index != -1)
			icon_ext = icon_name.substring(point_index + 1);
		
		return icon_ext;
	}
}
