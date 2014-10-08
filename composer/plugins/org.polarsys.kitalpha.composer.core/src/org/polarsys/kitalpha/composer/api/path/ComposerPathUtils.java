/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api.path;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration;
import org.polarsys.kitalpha.composer.api.configuration.ICodeManagerInput;
import org.polarsys.kitalpha.composer.api.path.variables.ComposerVariableInterpreter;

/**
 * Utility class to manage path in composer.
 * 
 * @author Yann Mortier
 */
public final class ComposerPathUtils {

	private static final String COMPOSER_LINK_PROJECT = ".composer";
	private static final String LINKED_FOLDER_NAME = "link";
	private static final String GENERATED_FOLDER = "/generated";
	
	private ComposerPathUtils() {
		// empty
	}

	public static void recomputePath(CodeManagerConfiguration configuration)
			throws CoreException {
		ICodeManagerInput input = configuration.getInput();
		IPath actualPath = configuration.getDestinationFolder();
		String actualPathString = actualPath == null ? null : actualPath
				.toString();
		if (input.isMultipleObjectsInput()) {
			List<EObject> inputs = input.getListInput();
			if (!inputs.isEmpty())
				configuration.setDestinationFolder(getPath(inputs.get(0),
						actualPathString));
		} else {
			if (!input.getRootsInputs().isEmpty()) {
				configuration.setDestinationFolder(getPath(input
						.getRootsInputs().get(0), actualPathString));
			}
		}

	}

	public static IPath getPath(Object object, String pathGeneration)
			throws CoreException {
		String projectPath = "";
		if (object instanceof IResource) {
			IResource res = (IResource) object;
			projectPath = res.getProject().getFullPath().toString();
		}
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			projectPath = "/" + eObject.eResource().getURI().segment(1);
		}
	
		
		return pathGeneration == null ? new Path(projectPath + GENERATED_FOLDER)
				: computeIPath(pathGeneration,object);
	}

	private static IPath computeIPath(String path, Object object) throws CoreException {
		
		
		path = (String)ComposerVariableInterpreter.INSTANCE.execute(path, object);
		
		
		IPath pathObject = new Path(path);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(
				pathObject.segment(0));
		if (!project.exists()) {
			project = getComposerProject();
			IFolder folder = createLinkedFolder(project, path);
			pathObject = folder.getFullPath();
		}
		return pathObject;
	}

	private static IFolder createLinkedFolder(IProject project,
			String targetPath) throws CoreException {
		IFolder folder = project.getFolder(LINKED_FOLDER_NAME);
		if (folder.exists()) {
			folder.delete(true, new NullProgressMonitor());
		}
		
		File javaFile = new File(targetPath);
		
		if(!javaFile.exists())
				javaFile.mkdirs();
			
			
		folder.createLink(new Path(targetPath), 0, new NullProgressMonitor());
		return folder;
	}

	private static IProject getComposerProject() throws CoreException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(
				COMPOSER_LINK_PROJECT);
		if (!project.exists()) {
			project.create(new NullProgressMonitor());
		}
		if (!project.isOpen()) {
			project.open(new NullProgressMonitor());
		}
		return project;
	}

}
