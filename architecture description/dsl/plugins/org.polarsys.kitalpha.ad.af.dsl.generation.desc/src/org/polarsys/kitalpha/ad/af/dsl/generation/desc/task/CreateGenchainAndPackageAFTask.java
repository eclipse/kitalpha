/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.task;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.core.pde.tools.ConvertProjectOperation;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.portfolio.genchain.generationChain.FeatureAddition;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainFactory;
import org.eclipse.egf.portfolio.genchain.tools.Activator;
import org.eclipse.egf.portfolio.genchain.tools.ui.actions.BuildApplicationHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.internal.editors.text.WorkspaceOperationRunner;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.internal.Constants;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.AbstractGenerationEvent;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.listener.GenerationAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.manager.GenerationEventManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.type.ViewpointGenerationEndEvent;

/**
 * @author Boubekeur Zendagui
 */
@SuppressWarnings("restriction")
public class CreateGenchainAndPackageAFTask extends GenerationAdapter implements ITaskProduction {

	private String projectId;
	
	private String shortName;
		
	private int waitFor = 0;
	
	private boolean packageAF = false;
	
	private EMFDomain domainModel;
	
	private IProgressMonitor monitor = new NullProgressMonitor();
	
	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		this.waitFor = productionContext.getInputValue(Constants.CONTRACT_NUMBER_VIEWPOINT_TO_GENERATE, Integer.class);
		this.monitor = monitor;
		GenerationEventManager.getInstance().addGenerationListener(this);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.listener.GenerationAdapter#generationEnd(org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.AbstractGenerationEvent)
	 */
	@Override
	public void generationEnd(AbstractGenerationEvent event) {
		if (waitFor == -1) {
			return;
		}
		
		if (event instanceof ViewpointGenerationEndEvent) {
			waitFor --;
		}
		if (waitFor == 0 && packageAF)
		{
			try {
				buildAF();
			} catch (InvocationException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		projectId = productionContext.getInputValue(Constants.CONTRACT_PROJECT_NAME, String.class);
		shortName = productionContext.getInputValue(Constants.CONTRACT_SHORT_NAME, String.class);
		packageAF = productionContext.getInputValue(Constants.CONTRACT_PACKAGE_AF, Boolean.class);
		domainModel = productionContext.getInputValue(Constants.CONTRACT_DOMAIN_MODEL, EMFDomain.class);
		
		// First create generation chain
		GenerationChain chain = createGenerationChain(shortName, projectId);
		URI uri = URI.createURI("platform:/resource/"+projectId + "/" + Constants.MODELS_FOLDER + "/" + shortName + ".generationchain");
		ResourceSet set = new ResourceSetImpl();
		final Resource genchainResource = set.createResource(uri);
		genchainResource.getContents().add(chain);
		
		try {
			genchainResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new InvocationException(e);
		} 
		
		if (waitFor == -1)
		{
			buildAF();
		}
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}
	
	/**
	 * 
	 * @throws InvocationException 
	 */
	private void buildAF() throws InvocationException {
		class AfdslOnlyBuildApplicationHelper extends BuildApplicationHelper{
			public void onlyBuild(URI genchainURI) throws CoreException, InterruptedException{
				final TargetPlatformResourceSet resourceSet = new TargetPlatformResourceSet();
				this.generationChain = (GenerationChain) resourceSet.getResource(genchainURI, true).getContents().get(0);
				
				String pluginName = getPluginName();
				final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(pluginName);
				if (!project.exists())
				{
					project.create(monitor);
					project.refreshLocal(2, monitor);
					project.open(monitor);
					
					WorkspaceOperationRunner runner = new WorkspaceOperationRunner();
					runner.setProgressMonitor(monitor);
					try {
						runner.run(true, false, new ConvertProjectOperation(project, false, false));
					} catch (Exception e) {
						throw new CoreException(new Status(IStatus.ERROR, Activator.getDefault().getPluginID(), e.getMessage(), e));
					}
				}
				
				final WorkspaceJob createJob = super.createJob(generationChain, false);
				final WorkspaceJob createAfterJob = super.createAfterJob();
				createAfterJob.setPriority(Job.BUILD);
				
				/*
				 * Schedule builder after creating all projects
				 * Fix a bug: https://bugs.polarsys.org/show_bug.cgi?id=2228
				 */
				createJob.addJobChangeListener(new JobChangeAdapter() {
					
					@Override
					public void done(IJobChangeEvent event) {
						createAfterJob.schedule(2000);
					}
					
				});
				
				/*
				 * Dispose generation listener after building
				 * Fix a bug: https://bugs.polarsys.org/show_bug.cgi?id=2228
				 */
				createAfterJob.addJobChangeListener(new JobChangeAdapter() {
					
					@Override
					public void done(IJobChangeEvent event) {
						GenerationEventManager.getInstance().removeGenerationListener(CreateGenchainAndPackageAFTask.this);
					}
					
				});
				createJob.schedule();
				createJob.join();
				project.refreshLocal(IProject.DEPTH_INFINITE, monitor);
				project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);
			}
			
			@Override
			protected String computeFcoreOutputPath(GenerationChain generationChain) {
				return getPluginName() + computeFcoreRelativePath(generationChain);
			}
			
			private String getPluginName(){
				return generationChain.getFactoryComponentName() +".fc";
			}
		};
		
		AfdslOnlyBuildApplicationHelper onlyBuilder = new AfdslOnlyBuildApplicationHelper();
		try {
			URI uri = URI.createURI("platform:/resource/"+projectId + "/" + Constants.MODELS_FOLDER + "/" + shortName + ".generationchain");
			onlyBuilder.onlyBuild(uri);
		} catch (CoreException | InterruptedException e) {
			throw new InvocationException(e);
		}
	}
	
	/**
	 * Create a generation chain
	 * @return a generation chain
	 */
	protected GenerationChain createGenerationChain(String shortName, String projectName){
		GenerationChain genchainRootElement = GenerationChainFactory.eINSTANCE.createGenerationChain();
		genchainRootElement.setName(shortName);
		genchainRootElement.setFactoryComponentName(projectName);
		GenerationChain chain = GenerationChainFactory.eINSTANCE.createGenerationChain();
		chain.setName(shortName);
		genchainRootElement.getElements().add(chain);
		
		// Adding viewpoint features as feature additions
		final FeatureAddition featureAddition = GenerationChainFactory.eINSTANCE.createFeatureAddition();
		chain.getElements().add(featureAddition);
		
		Object rootDomainElement = domainModel.getContent().get(0);
		if (rootDomainElement != null && rootDomainElement instanceof ArchitectureFramework)
		{
			ArchitectureFramework af = (ArchitectureFramework) rootDomainElement;
			Viewpoints afviewpoints = af.getAf_viewpoints();
			for (Viewpoint viewpoint : afviewpoints.getOwned_viewpoints()) 
			{
				String rootProjectName = VpDslConfigurationHelper.getRootProjectName(viewpoint);
				featureAddition.getAdditions().add(rootProjectName + ".feature");
			}
		}
		return genchainRootElement;
	}

}
