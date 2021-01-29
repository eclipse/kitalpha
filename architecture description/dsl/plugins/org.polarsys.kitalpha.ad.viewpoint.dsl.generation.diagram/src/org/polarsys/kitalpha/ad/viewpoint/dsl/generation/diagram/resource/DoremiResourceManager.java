/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.ui.tools.api.project.ViewpointSpecificationProject;
import org.eclipse.sirius.viewpoint.description.DescriptionFactory;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.extension.ExtensionManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;

/**
 * @author Boubekeur Zendagui
 */

public class DoremiResourceManager {
	
	private static Group group;
	
	private static Viewpoint generateViewpoint;
	private static EObject rootModelObject;
	
	private static ResourceSet rSet;
	private static Resource doremiResource;
	
	
	public static Group getGroup(){
		return group;
	}
	
	public static Viewpoint getGenerateViewpoint(){
		return generateViewpoint;
	}
	
	public static void clear(){
		generateViewpoint = null;
		rootModelObject = null;
		doremiResource = null;
		rSet = null;
	}
	
	public static void loadAndInitODesignModel(String projectName, String modelFolderName, String modelName){
		IProject vProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		boolean loaded = false;
		if (vProject.exists())
		{
			IFolder modelFolder = vProject.getFolder(modelFolderName);
			if (modelFolder.exists())
			{
				IFile modelFile = modelFolder.getFile(modelName + "." + ViewpointSpecificationProject.VIEWPOINT_MODEL_EXTENSION);
				if (modelFile.exists())
				{
					rSet = new ResourceSetImpl();
					URI doremiURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
					doremiResource = rSet.getResource(doremiURI, true);
					rootModelObject = doremiResource.getContents().get(0);
					if (rootModelObject instanceof Group)
					{
						group = (Group)rootModelObject;
						Viewpoint vp = DescriptionFactory.eINSTANCE.createViewpoint();
						String newModelName = modelName.substring(0, 1).toUpperCase()+modelName.substring(1, modelName.length());
						vp.setLabel(newModelName);
						vp.setName(newModelName+"_ID");
						vp.setModelFileExtension(diagramExtensions(modelName.toLowerCase()));
						group.getOwnedViewpoints().add(vp);
						
						generateViewpoint = vp;
					}
					loaded = true;
				}
			}
		}
		if (!loaded)
		{
			// TODO: handle case
		}
	}
	
	public static void loadODesignModel(String projectName, String modelFolderName, String modelName){
		IProject vProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (vProject.exists())
		{
			IFolder modelFolder = vProject.getFolder(modelFolderName);
			if (modelFolder.exists())
			{
				IFile modelFile = modelFolder.getFile(modelName+"."+ViewpointSpecificationProject.VIEWPOINT_MODEL_EXTENSION);
				if (modelFile.exists())
				{
					rSet = new ResourceSetImpl();
					URI doremiURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
					doremiResource = rSet.getResource(doremiURI, true);
					rootModelObject = doremiResource.getContents().get(0);
					if (rootModelObject instanceof Group)
					{
						group = (Group)rootModelObject;
					}
				}
			}
		}
	}
	
	private static String diagramExtensions(String modelName){
		String result = modelName;
		
		// Add diagram filters extensions
		EObject viewpoint = ViewpointResourceProviderRegistry.getInstance().getViewpoint();
		List<String> taExtensions = ExtensionManager.getDiagramFilters(viewpoint);
		
		if (! taExtensions.isEmpty())
		{
			StringBuilder builder = new StringBuilder();
			for (String extension : taExtensions) 
			{
				builder.append(" ").append(extension);
			}
			result = result + builder.toString();
		}
		else
		{
			try {
				final String otherExtensions = computeOtherFileExtensions();
				if (otherExtensions != null && ! otherExtensions.isEmpty())
				{
					String extensions = result + " " + otherExtensions;
					extensions = removeDuplicateExtensions(extensions);
					result = extensions;
				}
			} catch (Exception e) {}
		}

		return result;
	}
	
	/**
	 * Compute additional model file extension depending on the extended Viewpoints
	 * @return a {@link String} value containing additional model files extensions
	 */
	private static String computeOtherFileExtensions(){
		StringBuilder builder = new StringBuilder();
		org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint viewpoint = ViewpointResourceProviderRegistry.getInstance().getViewpoint();
		final EList<Aspect> vpAspects = viewpoint.getVP_Aspects();
		for (Aspect aspect : vpAspects) 
		{
			if (aspect instanceof DiagramSet)
			{
				final EList<DiagramRepresentation> diagrams = ((DiagramSet) aspect).getDiagrams();
				// Collect file extensions
				for (DiagramRepresentation diagramRepresentation : diagrams) 
				{
					if (diagramRepresentation instanceof DiagramExtension)
					{
						final DiagramDescription extentedDiagram = ((DiagramExtension) diagramRepresentation).getExtented_diagram();
						final EObject eContainer = extentedDiagram.eContainer();
						if (eContainer instanceof Viewpoint)
						{
							builder.append(" ").append(((Viewpoint) eContainer).getModelFileExtension());
						}
					}
				}
			}
		}
		
		return builder.toString();
	}
	
	private static String removeDuplicateExtensions(String exts){
		final String[] extensions = exts.split(" ");
		Arrays.sort(extensions);
		ArrayList<String> uniqExtensions = new ArrayList<String>();
		for (String ext : extensions) 
		{
			if (! uniqExtensions.contains(ext))
				uniqExtensions.add(ext);
		}
		
		String uniqExt = "";
		StringBuilder builder = new StringBuilder();
		for (String string : uniqExtensions) 
		{
			builder.append(string).append(" ");
		}
		
		return uniqExt;
	}
	
	public static void save(){
		try {
			doremiResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
