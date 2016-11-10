/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

/**
 *
 * Hold misc utilities of management of project or object creation
 * in the project
 * @author Faycal Abka
 *
 */
public final class ProjectUtil {

	private static final Logger LOGGER = Logger.getLogger(ProjectUtil.class);


	private ProjectUtil(){

	}

	/**
	 *
	 * @param e1
	 * @param e2
	 * @return true if the e1 and e2 are defined in the same project
	 */
	public static boolean areInSameProject(final EObject e1, final EObject e2){
		final URI uri1 = EcoreUtil.getURI(e1);
		final URI uri2 = EcoreUtil.getURI(e2);

		final String project1 = uri1.segment(1);
		final String project2 = uri2.segment(1);

		return project1.equalsIgnoreCase(project2);
	}

	/**
	 * Return the project where the resource of model is defined
	 * @param model
	 * @return
	 */
	public static IProject getEclipseProjectOf(final EObject model){

		if (model == null) {
			return null;
		}

		final Resource resource = model.eResource();

		if (resource == null) {
			return null;
		}

		return getEclipseProjectOf(resource);
	}

	/**
	 * Return the project of the resource
	 * @param resource
	 * @return
	 */
	public static IProject getEclipseProjectOf(final Resource resource){

		final String platformString = resource.getURI().toPlatformString(true);
		final IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		final IProject project = myFile.getProject();
		return project;
	}

	/**
	 * Return list of all resources in folder
	 * @param project where the folder exists
	 * @param folder
	 * @param type of the resource
	 * @param ignoreType if the type parameter is ignored (used to return all folder resources)
	 * @return
	 */
	public static List<IResource> getFolderResources(final IProject project, final String folder, final int type, final boolean ignoreType){

		final List<IResource> resources = new ArrayList<IResource>();

		final IFolder resourcesFolder = getFolderInProject(project, folder);

		if (resourcesFolder != null) {
			try {
				resourcesFolder.accept(new IResourceVisitor() {

					@Override
					public boolean visit(final IResource resource) throws CoreException {

						if (resource.exists() && resource.isAccessible() && (resource.getType() == type)) {
							if (ignoreType) {
								resources.add(resource);
							}
						}
						return true;
					}
				});
			} catch (final CoreException e) {
				return resources;
			}
		}

		return resources;
	}

	public static IFolder getFolderInProject(final IProject project, final String folder){
		return project.getFolder(folder);
	}

	/**
	 * get Root Project name. The caller must check if it is
	 * the right project
	 * @param eObject
	 * @return
	 */
	public static EObject getRootViewpoint(final EObject eObject, final IExternalContentProvider contentProvider){
		final String projectName = ResourceHelper.getProjectName(eObject);
		final ResourceSet fakeResourceSet = new ResourceSetImpl();
		XtextResource resource;

		ResourceHelper.loadPrimaryResource(projectName, fakeResourceSet);
		final URI uri = ResourceHelper.getPrimaryResourceURI(projectName);

		resource = (XtextResource) fakeResourceSet.getResource(uri, false);
		final String text = contentProvider.getActualContentProvider().getContent(uri);

		if ((text != null) && !text.isEmpty() && (resource != null)){
			try {
				resource.reparse(text);
			} catch (final IOException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}

		if (resource != null) {
			return resource.getContents().get(0);
		} else {
			return null;
		}
	}
}
