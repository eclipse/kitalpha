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
package org.polarsys.kitalpha.model.actions.contrib.backup.action;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.actions.action.ModelAction;
import org.polarsys.kitalpha.model.actions.contrib.backup.Messages;
import org.polarsys.kitalpha.model.actions.exception.ModelActionException;

/**
 * @author Faycal Abka
 */
public class BackupAndSaveAction extends ModelAction {
	
	Logger LOGGER = Logger.getLogger(BackupAndSaveAction.class);

	private final String DATE_FORMAT = "yyyy-MM-dd";
	private final String HOUR_FORMAT = "HH-mm-ss";
	private final String BACKUP_FOLDER_NAME  = "backup-";
	
	
	
	public BackupAndSaveAction() {
	}

	@Override
	public void exec(Resource resource, IProgressMonitor monitor) 
			throws ModelActionException {
		
		URI uri = URI.createURI(resource.getURI().toString(), true);
		String plugin_id = uri.segment(1);
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(plugin_id);
		
		
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		Date date = new Date();
		String rootBackupFolder = BACKUP_FOLDER_NAME + dateFormat.format(date);
		
		
		EList<Resource> resources = resource.getResourceSet().getResources();
		
		int nbResources = resources.size();
		
		SubMonitor subMonitor = SubMonitor.convert(monitor, nbResources);
		subMonitor.beginTask(Messages.bind(Messages.BACKUP_RESOURCE_MESSAGE, resource.getURI()), nbResources);
		
		createRootBackupFolder(rootBackupFolder, project, subMonitor.newChild(1));
		
		String backupPath = createSubFolder(rootBackupFolder, plugin_id, project, date, subMonitor.newChild(1));
	
		for (Resource resource2 : resources){
			
			if (resource2.getURI().isPlatformResource()) {
				
				try {
					backupResource(resource2, backupPath, subMonitor.newChild(1));
					
					subMonitor.subTask(Messages.bind(Messages.SAVE_RESOURCE_MESSAGE, resource2.getURI()));
					resource2.save(null);
					subMonitor.worked(1);
					
				} catch (CoreException e) {
					e.printStackTrace();
					LOGGER.error(e.getMessage(), e);
				} catch (IOException e) {
					e.printStackTrace();
					LOGGER.error(e.getMessage(), e);
				}
			} else {
				//Log on the progress monitor that is not platform resource
				subMonitor.worked(1);
			}
		}
		if (project != null)
			try {
				
				subMonitor.subTask(Messages.bind(Messages.REFRESH_PROJECT_MESSAGE, plugin_id));
				project.refreshLocal(IResource.DEPTH_INFINITE, subMonitor);
				subMonitor.worked(1);

			} catch (CoreException e) {
				e.printStackTrace();
				LOGGER.error(e.getMessage(), e);
			}

		subMonitor.done();
	}
	
	
	private String createSubFolder(String rootBackupFolder, String plugin_id, IProject project, Date date,
			IProgressMonitor monitor) {
		
		IFolder rootFolder = project.getFolder(new Path(rootBackupFolder));
		
		if (!rootFolder.exists()){
			createRootBackupFolder(rootBackupFolder, project, monitor);
		}
		
		DateFormat dateFormat = new SimpleDateFormat(HOUR_FORMAT);
		String subFolderName = dateFormat.format(date);
		
		String subFolderPath = rootBackupFolder + "/" + subFolderName; //$NON-NLS-1$
		IFolder subFolder = project.getFolder(new Path(subFolderPath));
		
		if (!subFolder.exists()){
			
			try {
				monitor.subTask(Messages.bind(Messages.FOLDER_CREATION_MESSAGE, subFolderPath));
				subFolder.create(true, true, monitor);
				project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				monitor.done();
			} catch (CoreException e) {
				e.printStackTrace();
				LOGGER.error(e.getMessage(), e);
			}
			
		}
		
		return plugin_id + "/" + subFolderPath; //$NON-NLS-1$
	}

	private void createRootBackupFolder(String rootBackupFolder,
			IProject project, IProgressMonitor monitor) {

		IPath path = new Path(rootBackupFolder);

		IFolder folder = project.getFolder(path);
		
		if (!folder.exists()){
			try {
				monitor.subTask(Messages.bind(Messages.ROOT_FOLDER_CREATION_MESSAGE, rootBackupFolder));
				folder.create(true, true, monitor);
				monitor.done();
				
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

	}

	private void backupResource(Resource resource2, String path, IProgressMonitor monitor) throws CoreException {
		
		SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
		
		subMonitor.subTask(Messages.bind(Messages.BACKUP_RESOURCE_MESSAGE, resource2.getURI()));
		
		URI uri = resource2.getURI();

		if (uri.isPlatformResource()){
			String platformString = uri.toPlatformString(true);
			IResource iResource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
			String iResourceName = iResource.getName();
			IPath backupPath = new Path("/" + path + "/" + iResourceName); //$NON-NLS-1$
			iResource.copy(backupPath, true, subMonitor);
		}
		
		subMonitor.done();
	}

}
