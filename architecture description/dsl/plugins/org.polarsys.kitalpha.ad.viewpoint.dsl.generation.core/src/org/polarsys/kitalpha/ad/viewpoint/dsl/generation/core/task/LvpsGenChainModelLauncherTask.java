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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.task;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.egf.portfolio.genchain.tools.ui.actions.BuildApplicationHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.utils.GenchainAdditionsManager;

/**
 * @author Boubekeur Zendagui
 */

public class LvpsGenChainModelLauncherTask extends TaskProductionAdapter {

	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String lvpsProjectName = productionContext.getInputValue(ROOT_PROJECT_NAME, String.class);
		String lvpsShortName = productionContext.getInputValue(SHORT_NAME, String.class);
		String modelFolder = productionContext.getInputValue(MODEL_FOLDER, String.class);
		Boolean buildViewpoint = productionContext.getInputValue(BUILD_VIEWPOINT, Boolean.class);

		buildViewpoint = (buildViewpoint == null ? false : buildViewpoint);

		// Add generated features to the generation chain
		GenerationChain genchain = getGenerationchain(lvpsProjectName, lvpsShortName, modelFolder);
		GenchainAdditionsManager.INSTANCE.addAdditions(genchain);
		
		// Save the GenerationchainModel
		try {
			genchain.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Launch the build of the generation chain if the user want to do it
		if (buildViewpoint)
		{
			final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(lvpsProjectName);
			IFile modelFile = (IFile) project.getFile(modelFolder+"/"+lvpsShortName+".generationchain");
			URI modelURI = URI.createPlatformPluginURI(modelFile.getFullPath().toString(), false);
			class vpdslOnlyBuildApplicationHelper extends BuildApplicationHelper{
				public void onlyBuild(URI fcoreURI){
					final TargetPlatformResourceSet resourceSet = new TargetPlatformResourceSet();
				       this.generationChain = (GenerationChain) resourceSet.getResource(fcoreURI, true).getContents().get(0);
				       super.createAfterJob().schedule();
				}
			};
			vpdslOnlyBuildApplicationHelper onlyBuilder = new vpdslOnlyBuildApplicationHelper();
			onlyBuilder.onlyBuild(modelURI);
		}
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(2, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
//		LvpsLogger.doLogInfo("Viewpoint "+ lvpsShortName +" generated with succes");
	}

	protected GenerationChain getGenerationchain(String projectName, String shortName, String modelFolder){
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFile modelFile = (IFile) project.getFile(modelFolder+"/"+shortName+".generationchain");
		URI modelURI = URI.createURI(modelFile.getLocationURI().toString());
		
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(modelURI);
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (r != null && r.isLoaded()){
			GenerationChain rootGenChainElement = (GenerationChain) r.getContents().get(0);
			for (GenerationElement generationElement : rootGenChainElement.getElements()) {
				if (generationElement instanceof GenerationChain){
					return (GenerationChain) generationElement;
				}
			}
		}
		
		return null;
	}

}
