/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.task;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.tools.ui.actions.BuildApplicationHelper;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;

/**
 * @author Boubekeur Zendagui
 */
public class PackageViewpointTask extends TaskProductionAdapter {

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
		super.doExecute(productionContext, monitor);
		String projectName = productionContext.getInputValue(ROOT_PROJECT_NAME, String.class);
		String shortName = productionContext.getInputValue(SHORT_NAME, String.class);
		String modelFolder = productionContext.getInputValue(MODEL_FOLDER, String.class);
		Boolean buildViewpoint = productionContext.getInputValue(BUILD_VIEWPOINT, Boolean.class);

		buildViewpoint = (buildViewpoint == null ? false : buildViewpoint);
		// Launch the build of the generation chain if the user want to do it
		if (buildViewpoint)
		{
			exportViewpointFeature(projectName, shortName, modelFolder);
		}
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(2, monitor);
		} catch (CoreException e) {
		}
	}
	
	/**
	 * Run the Job that export the viewpoint as Dropins
	 * @param projectName
	 * @param shortName
	 * @param modelFolder
	 */
	private void exportViewpointFeature(String projectName, String shortName, String modelFolder) {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFile modelFile = (IFile) project.getFile(modelFolder+"/"+shortName+".generationchain");
		URI modelURI = URI.createPlatformPluginURI(modelFile.getFullPath().toString(), false);
		class vpdslOnlyBuildApplicationHelper extends BuildApplicationHelper{
			public void onlyBuild(URI fcoreURI){
				final TargetPlatformResourceSet resourceSet = new TargetPlatformResourceSet();
				this.generationChain = (GenerationChain) resourceSet.getResource(fcoreURI, true).getContents().get(0);
				super.createAfterJob().schedule();
			}
			
			@Override
			protected String computeFcoreOutputPath(GenerationChain generationChain) {
				return generationChain.getFactoryComponentName() +".fc" + computeFcoreRelativePath(generationChain);
			}
		};
		vpdslOnlyBuildApplicationHelper onlyBuilder = new vpdslOnlyBuildApplicationHelper();
		onlyBuilder.onlyBuild(modelURI);
	}
}
