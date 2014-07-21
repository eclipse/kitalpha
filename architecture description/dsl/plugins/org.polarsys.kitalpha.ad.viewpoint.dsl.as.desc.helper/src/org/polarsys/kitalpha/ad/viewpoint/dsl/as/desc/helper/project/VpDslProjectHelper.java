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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.project;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class VpDslProjectHelper {
	
	private static final NullProgressMonitor null_progress_monitor = new NullProgressMonitor();
	
	private static final String no_resource = 
								Messages.VpDslHelper_Project_No_Resource;
	private static final String resource_not_serialized = 
								Messages.VpDslHelper_Project_Resource_Not_Serealized;
	
	/**
	 * 
	 * @param eObject: Any model element
	 * @return The workspace vpDsl project containing the model which contains the eObject 
	 */
	public static IProject getVpDslProject(EObject eObject){
		URI uri = getContainingResourceURI(eObject);
		String project_name = uri.segment(1);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(project_name);
		if (project.exists())
			return project;
		else
			return null;
	}
	
	/**
	 * This method localize the icon folder created in the vpDsl project
	 * @param eObject: any vpDsl model element
	 * @param force: force the creation of the folder if it not exist yet in the vpDsl project 
	 * @return the vpDsl Icon folder 
	 * @throws CoreException
	 * @throws InvocationTargetException
	 * @throws InterruptedException
	 */
	public static IFolder getVpDslIconFolder(EObject eObject, boolean force) 
					throws CoreException, InvocationTargetException, InterruptedException {
		IProject vpDslProject = getVpDslProject(eObject);
		
		if (! vpDslProject.exists())
			return null;
		
		final IFolder icon_folder = vpDslProject.getFolder(IViewpointDescriptionConstants.VP_DESC__ICONS_FOLDER_NAME);
		
		if (! icon_folder.exists() && force)
		{
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException,
																		InterruptedException {
					icon_folder.create(true, true, null_progress_monitor);
				}
			};
			operation.run(null_progress_monitor);
		}
		return icon_folder;
	}
	
	/**
	 * 
	 * @param eObject: Any model element
	 * @return URI of the model containing the eObject
	 */
	public static URI getContainingResourceURI(EObject eObject){
		Resource resource = eObject.eResource();
		if (resource == null)
			throw new IllegalArgumentException(no_resource);
		
		URI uri = resource.getURI();
		if (uri == null)
			throw new IllegalArgumentException(resource_not_serialized);
		
		return uri;
	}
}
