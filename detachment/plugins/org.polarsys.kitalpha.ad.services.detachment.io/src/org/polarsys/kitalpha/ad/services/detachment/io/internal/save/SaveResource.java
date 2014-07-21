/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.ad.services.detachment.io.internal.save;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.services.detachment.io.internal.messages.Messages;

/**
 * Utility to save and backup resources
 * 
 * @author Matthieu Helleboid
 *
 */
public class SaveResource {
	
	//Constants for backup
	private static final String DATE_FORMAT 	= "yyyyMMdd-HHmmss";
	private static final String SUFFIX_BACKUP 	= "backup_detachment_";

	private Resource resource;
	private IProgressMonitor monitor;
	
	
	public SaveResource(Resource resource){
		this.resource = resource;
		this.monitor = null;
	}
	
	public SaveResource(Resource resource, IProgressMonitor monitor){
		this.resource = resource;
		this.monitor = monitor;
	}
	
	
	
	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public IProgressMonitor getMonitor() {
		return monitor;
	}

	public void setMonitor(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	/**
	 * Does backup and save the platform resources
	 * @param monitor
	 * @param project
	 * @throws IOException
	 * @throws CoreException
	 */
	public void save(IProject project) throws IOException, CoreException {
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		String dateString = dateFormat.format(new Date());
		String suffix = SUFFIX_BACKUP + dateString;
		
		for (Resource resource2 : resource.getResourceSet().getResources()) {
			if (resource2.getURI().isPlatformResource()) {
				if (getMonitor() != null)
					monitor.subTask(Messages.BACKUP_RESOURCE + resource2.getURI());
				
				backupResource(resource2, suffix);
				
				if (getMonitor() != null)
					monitor.subTask(Messages.LOADING_RESOURCE + resource2.getURI());
				
				resource2.save(null);
			}
		}
		if (project != null)
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
	
	/**
	 * Performs a backup of the platform resource
	 * @param resource2 to backup
	 * @param suffix
	 * @throws CoreException
	 */
	private void backupResource(Resource resource2, String suffix) throws CoreException {
		String platformString = resource2.getURI().toPlatformString(true);
		IResource iResource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
		IPath backupPath = iResource.getFullPath().addFileExtension(suffix);
		iResource.copy(backupPath, true, new NullProgressMonitor());
	}
	
}
