/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.action.popup;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.egf.portfolio.genchain.generationChain.EmfGeneration;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.action.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class EraseEMFPluginsAction extends BaseSelectionListenerAction 
		implements IObjectActionDelegate{
	
	private IStructuredSelection selection;

	public EraseEMFPluginsAction() {
		super(Messages.Action_EraseEmfPlugins);
	}

	public void run(IAction action) {
		URI modelURI = ActionsUtils.getDomainURI(this.selection);
		String projectName = ActionsUtils.getRootProjectName(modelURI);
		String shortName = ActionsUtils.getShortName(modelURI);
		try {
			// Get the location of  the genmodel from the generationchain model and erase the generated fc project
			String modelsProject = getModelProjectNameFromGenchain(projectName, shortName);
			// Get the generated EMF Plugins IDs from the genmodel model.
			List<String> list = getEMFPluginsProjects(modelsProject, shortName);
			// Erase generated EMF plugins 
			eraseProjects(list);
		} catch (CoreException e) {
		}
	}
	
	private List<String> getEMFPluginsProjects(String projectName, String shortName){
		List<String> result = new ArrayList<String>();
		
		if (projectName == null || projectName.length() == 0 || shortName == null || shortName.length() == 0)
			return result;
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		
		if (! project.exists()){
			return result;
		}
		
		IFolder modelFolder = project.getFolder("models"); //$NON-NLS-1$
		IFile genModelFile = modelFolder.getFile(shortName.toLowerCase()+".genmodel");  //$NON-NLS-1$
		ResourceSet rs = new ResourceSetImpl();
		URI genModelUri = URI.createURI(genModelFile.getLocationURI().toString());
		Resource r = rs.getResource(genModelUri, true);
		GenModel genModel = (GenModel)r.getContents().get(0);
		result.add(genModel.getTestsPluginID());
		result.add(genModel.getEditorPluginID());
		result.add(genModel.getEditPluginID());
		result.add(genModel.getModelPluginID());
		return result;
	}
	
	private void eraseProjects(List<String> projectNamesList) throws CoreException{
		if (projectNamesList != null)
			for (String projectName : projectNamesList) {
				IProject projet = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				if (projet.exists())
					projet.delete(true, new NullProgressMonitor());
			}
	}

	/**
	 * @param projectName
	 * @param shortName
	 * @return the name of the project containing the GenModel
	 * @throws CoreException 
	 */
	private String getModelProjectNameFromGenchain(String projectName, String shortName) throws CoreException {
		if (projectName == null || projectName.length() == 0 || shortName == null || shortName.length() == 0)
			return null;
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		
		if (! project.exists())
			return null;
		
		IFolder models = project.getFolder("models"); //$NON-NLS-1$
		IFile genchainFile = models.getFile(shortName+".generationchain");  //$NON-NLS-1$
		ResourceSet rs = new ResourceSetImpl();
		URI gennchainUri = URI.createURI(genchainFile.getLocationURI().toString());
		Resource r = rs.getResource(gennchainUri, true);
		GenerationChain generationchain = (GenerationChain)r.getContents().get(0);
		
		String result = null;

		for (GenerationElement iGenerationElement : generationchain.getElements()) {
			if (iGenerationElement instanceof GenerationChain 
					&& iGenerationElement.getName().equalsIgnoreCase(shortName)){
				GenerationChain subGenerationChain = (GenerationChain) iGenerationElement;
				for (GenerationElement iSubGenerationElement : subGenerationChain.getElements()) 
					if (iSubGenerationElement instanceof EmfGeneration 
							&& iGenerationElement.getName().equalsIgnoreCase(shortName)){
						EmfGeneration emfGeneration = (EmfGeneration) iSubGenerationElement;
						result = emfGeneration.getPluginName();
						r.unload();
						r = null;
						rs = null;
						break;
					}
			}
			if (result != null)
				break;
		}
		
		IProject fcProject = ResourcesPlugin.getWorkspace().getRoot().getProject(generationchain.getFactoryComponentName());
		fcProject.delete(true, new NullProgressMonitor());
		
		return result;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
		
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		//Nothing to do
	}

}
