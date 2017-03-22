/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.backup.command;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.contrib.backup.Messages;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;

/**
 * @author Faycal Abka
 */
public class BackupAndSaveCommand extends ModelCommand {

	Logger LOGGER = Logger.getLogger(BackupAndSaveCommand.class);

	private final String DATE_FORMAT = "yyyy-MM-dd";
	private final String HOUR_FORMAT = "HH-mm-ss";
	private final String BACKUP_FOLDER_NAME  = "backup-";



	public BackupAndSaveCommand() {
	}

	@Override
	public void exec(ModelScrutinyRegistry analysis, Resource resource, IProgressMonitor monitor) 
			throws ModelCommandException {

		URI uri = resource.getURI();
		String plugin_id = uri.segment(1);

		try {
			plugin_id = URLDecoder.decode(plugin_id, "UTF-8");


			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(plugin_id);

			DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
			Date date = new Date();
			String rootBackupFolder = BACKUP_FOLDER_NAME + dateFormat.format(date);

			EList<Resource> resources = null;
			if (resource != null && resource.getResourceSet() != null){
				resources = resource.getResourceSet().getResources();


				int nbResources = resources.size();

				SubMonitor subMonitor = SubMonitor.convert(monitor, nbResources);
				subMonitor.beginTask(Messages.bind(Messages.BACKUP_RESOURCE_MESSAGE, resource.getURI()), nbResources);

				createRootBackupFolder(rootBackupFolder, project, subMonitor.newChild(1));

				String backupPath = createSubFolder(rootBackupFolder, plugin_id, project, date, subMonitor.newChild(1));

				//Just backup a workspace resources without saving EMF ones to
				//avoid conflicts when original aird resource from Sirius Session
				//This implementation is ugly workaround!
				Session session = SessionManager.INSTANCE.getExistingSession(uri);
				boolean saveResources = session == null;
				for (Resource resource2 : resources){
					if (resource2.getURI().isPlatformResource()) {
						try {
							if (resource2 != null){
								backupResource(resource2, backupPath, subMonitor.newChild(1));
								subMonitor.subTask(Messages.bind(Messages.SAVE_RESOURCE_MESSAGE, resource2.getURI()));
								if (saveResources && resource2.isModified()){
									resource2.save(null);
								}
								subMonitor.worked(1);
							}
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
		} catch (UnsupportedEncodingException e1) {
			LOGGER.error(e1.getMessage(), e1);
		}
	}


	private String createSubFolder(String rootBackupFolder, String plugin_id, IProject project, Date date,
			IProgressMonitor monitor) {
		String subFolderPath = null;
		try {
			rootBackupFolder = URLDecoder.decode(rootBackupFolder, "UTF-8");
			

			IFolder rootFolder = project.getFolder(new Path(rootBackupFolder));
			if (!rootFolder.exists()){
				createRootBackupFolder(rootBackupFolder, project, monitor);
			}

			DateFormat dateFormat = new SimpleDateFormat(HOUR_FORMAT);
			String subFolderName = dateFormat.format(date);

			subFolderPath = rootBackupFolder + "/" + subFolderName; //$NON-NLS-1$



			IFolder subFolder = project.getFolder(new Path(subFolderPath));

			if (!subFolder.exists()){

				try {
					monitor.subTask(Messages.bind(Messages.FOLDER_CREATION_MESSAGE, subFolderPath));
					subFolder.create(true, true, monitor);
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					monitor.done();
				} catch (CoreException e) {
					LOGGER.error(e.getMessage(), e);
				}
			}
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		return plugin_id + "/" + ((subFolderPath == null)?"default-backup":subFolderPath); //$NON-NLS-1$
	}

	private void createRootBackupFolder(String rootBackupFolder,
			IProject project, IProgressMonitor monitor) {
		try {
			rootBackupFolder = URLDecoder.decode(rootBackupFolder, "UTF-8");

			IPath path = new Path(rootBackupFolder);

			IFolder folder = project.getFolder(path);

			if (!folder.exists()){
				try {
					monitor.subTask(Messages.bind(Messages.ROOT_FOLDER_CREATION_MESSAGE, rootBackupFolder));
					folder.create(true, true, monitor);
					monitor.done();
				} catch (CoreException e) {
					e.printStackTrace();
					LOGGER.error(e.getMessage(), e);
				}
			}
		} catch (UnsupportedEncodingException e1) {
			LOGGER.error(e1.getMessage(), e1);
		}

	}

	private void backupResource(Resource resource2, String path, IProgressMonitor monitor) throws CoreException {
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
			subMonitor.subTask(Messages.bind(Messages.BACKUP_RESOURCE_MESSAGE, resource2.getURI()));
			URI uri = resource2.getURI();
			path = URLDecoder.decode(path, "UTF-8");
			if (uri.isPlatformResource()){
				String platformString = uri.toPlatformString(true);
				IResource iResource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
				if (iResource != null){
					String iResourceName = iResource.getName();
					IPath backupPath = new Path("/" + path + "/" + iResourceName); //$NON-NLS-1$
					iResource.copy(backupPath, true, subMonitor);
				}
			}
			subMonitor.done();
		} catch (UnsupportedEncodingException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

}
