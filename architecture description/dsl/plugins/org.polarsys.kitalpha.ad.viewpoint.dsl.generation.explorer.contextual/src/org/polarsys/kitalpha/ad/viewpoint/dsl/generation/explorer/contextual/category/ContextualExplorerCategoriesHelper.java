/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.category;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;

/**
 * @author Boubekeur Zendagui
 */
public class ContextualExplorerCategoriesHelper {

	/**
	 * 
	 * @param category
	 * @param vpClass
	 * @param projectName
	 * @return
	 * @throws ContextualExplorerCategoriesException
	 */
	public static String getCategoryID(ContextualExplorerCategories category, Class vpClass, String projectName) 
			throws ContextualExplorerCategoriesException {
		Assert.isNotNull(vpClass, "Viewpoint Class must be not null");
		Assert.isNotNull(category, "Category must be not null");
		
		return projectName+".queries."+vpClass.getName()+"."+category.getCategoryIdentifier();
	}
	
	public boolean canGenerateCategoryFor(Class vpClass, ContextualExplorerCategories category){
		boolean result = false;
		
		
		
		return result;
	}
	
	/**
	 * 
	 * @param category
	 * @param vpClass
	 * @param projectName
	 * @return
	 * @throws ContextualExplorerCategoriesException
	 */
	public static String getQueryJavaClassFQN(ContextualExplorerCategories category, Class vpClass, String projectName) 
	throws ContextualExplorerCategoriesException {
		Assert.isNotNull(vpClass, "Viewpoint Class must be not null");
		Assert.isNotNull(category, "Category must be not null");
		
		String queryJavaClassFQN = projectName.toLowerCase()+".queries."+vpClass.getName().toLowerCase()+".";
		String queryJavaClassName = getQueryJavaClassName(category);
		
		if (queryJavaClassName.length() > 0)
			queryJavaClassFQN = queryJavaClassFQN + queryJavaClassName ;
		
		if (javaClassFileExist(queryJavaClassFQN, projectName))
			return queryJavaClassFQN;
			
		else
			throw new ContextualExplorerCategoriesException();
	}

	/**
	 * 
	 * @param category
	 * @return
	 */
	private static String getQueryJavaClassName(ContextualExplorerCategories category){
		String result = "";
		switch (category) {
		case Parent:
			result = "ParentQuery";
			break;
			
		case OwnedExternalElement:
			result = "OwnedExternalElementQuery";
			break;
		
		case OwnedViewpointElement:
			result = "OwnedViewpointElementQuery";
			break;
		
		case ReferencedViewpointElement:
			result = "ReferencedViewpointElementQuery";
			break;
			
		case ReferencedExternalElement:
			result = "ReferencedExternalElementQuery";
			break;
			
		case ReferencingViewpointElement:
			result = "ReferencingViewpointElementQuery";
			break;
		}
		
		return result;
	}
	
	/**
	 * 
	 * @param javaClassFQN
	 * @param projectName
	 * @return
	 * @throws ContextualExplorerCategoriesException
	 */
	private static boolean javaClassFileExist(String javaClassFQN, String projectName) throws ContextualExplorerCategoriesException{
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (! project.exists())
			throw new ContextualExplorerCategoriesException();
		
		IFolder src_folder = project.getFolder("src");
		if (! src_folder.exists())
			throw new ContextualExplorerCategoriesException();
		
		IFolder currentParentFolder = src_folder;
		String[] FQNSegments = javaClassFQN.split("\\.");
		for (int i = 0; i < FQNSegments.length - 1; i++) 
		{
			String segment = FQNSegments[i].toLowerCase();
			IFolder subFolder = currentParentFolder.getFolder(segment);
			if (! subFolder.exists())
				throw new ContextualExplorerCategoriesException();
			else
				currentParentFolder = subFolder;
		}
		
		String fileName = FQNSegments[FQNSegments.length - 1] + ".java";
		IFile queryJavaClass = currentParentFolder.getFile(fileName);
		if (! queryJavaClass.exists())
			throw new ContextualExplorerCategoriesException();
		
		return true;
	}

}
