/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

import com.google.inject.Inject;

/**
 * 
 * Hold misc utility of management of project or object created
 * in the project
 * @author Faycal Abka
 *
 */
public class ProjectUtil {
	
	
	/**
	 * 
	 * @param e1
	 * @param e2
	 * @return true if the e1 and e2 are defined in the same project
	 */
	public static boolean areInSameProject(EObject e1, EObject e2){
		URI uri1 = EcoreUtil.getURI(e1);
		URI uri2 = EcoreUtil.getURI(e2);
		
		String project1 = uri1.segment(1);
		String project2 = uri2.segment(1);
		
		return project1.equalsIgnoreCase(project2);
	}
	
	/**
	 * Return the project where the resource of model is defined
	 * @param model
	 * @return
	 */
	public static IProject getEclipseProjectOf(EObject model){
		
		if (model == null) 
			return null;
		
		Resource resource = model.eResource();
		
		if (resource == null) 
			return null;
		
		return getEclipseProjectOf(resource);
	}
	
	/**
	 * Return the project of the resource
	 * @param resource
	 * @return
	 */
	public static IProject getEclipseProjectOf(Resource resource){
		
		String platformString = resource.getURI().toPlatformString(true);
		IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		IProject project = myFile.getProject();
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
	public static List<IResource> getFolderResources(IProject project, String folder, final int type, final boolean ignoreType){
		
		final List<IResource> resources = new ArrayList<IResource>();
		
		IFolder resourcesFolder = getFolderInProject(project, folder);
		
		if (resourcesFolder != null) {
			try {
				resourcesFolder.accept(new IResourceVisitor() {

					@Override
					public boolean visit(IResource resource) throws CoreException {

						if (resource.exists() && resource.isAccessible()) {
							if (ignoreType || resource.getType() == type)
								resources.add(resource);
						}

						return true;
					}
				});
			} catch (CoreException e) {
				return resources;
			}
		}
		
		return resources;
	}
	
	public static IFolder getFolderInProject(IProject project, String folder){
		return project.getFolder(folder);
	}
	
	/**
	 * get Root Project name. The caller must check if it is
	 * the right project
	 * @param eObject
	 * @return
	 */
	public static EObject getRootViewpoint(EObject eObject, IExternalContentProvider contentProvider){
		String projectName = ResourceHelper.getProjectName(eObject);
		ResourceSet fakeResourceSet = new ResourceSetImpl();
		XtextResource resource;
		
		ResourceHelper.loadPrimaryResource(projectName, fakeResourceSet);
		URI uri = ResourceHelper.getPrimaryResourceURI(projectName);
		
		resource = (XtextResource) fakeResourceSet.getResource(uri, false);
		String text = contentProvider.getActualContentProvider().getContent(uri);
		
		if (text != null && !text.isEmpty() && resource != null){
			try {
				resource.reparse(text);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return resource.getContents().get(0);
	}

}
