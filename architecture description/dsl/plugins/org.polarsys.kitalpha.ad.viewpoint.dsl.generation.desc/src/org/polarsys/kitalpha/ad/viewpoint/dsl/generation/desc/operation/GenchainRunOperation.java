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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.operation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.core.pde.tools.ConvertProjectOperation;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.tools.Activator;
import org.eclipse.egf.portfolio.genchain.tools.ui.actions.CreateFcoreHelper;
import org.eclipse.egf.portfolio.genchain.tools.utils.RunActivityHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.AbstractGenerationEvent;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.listener.IGenerationListener;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.manager.GenerationEventManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.type.ViewpointGenerationEndEvent;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;

/**
 * @author Boubekeur Zendagui
 */

public class GenchainRunOperation extends AbstractGenerationOperation implements IGenerationListener{

	private final LocalCreateFcoreAction action = new LocalCreateFcoreAction();
	
	public GenchainRunOperation(String projectName, String ecoreModelName, String modelsFolder) {
		super(projectName, ecoreModelName, modelsFolder);
		GenerationEventManager.getInstance().addGenerationListener(this);
	}
	
	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		setMonitor(monitor);
		action.createGenerationchainArtefacts();
	}
	
	@Override
	public String setupModelExtension() {
		return "generationchain";
	}
	
	class LocalCreateFcoreAction extends CreateFcoreHelper{
		
		private ResourceSet set;
		private GenerationChain generationChain;
		
		public void createFeature(){
			// Reload generation chain element to get the last version
			URI uri = EcoreUtil.getURI(generationChain);
			
			TargetPlatformResourceSet gcSet = new TargetPlatformResourceSet();
			generationChain = (GenerationChain) gcSet.getEObject(uri, true);
			// Fire main feature creation 
			try {
				if (set == null)
					set = new TargetPlatformResourceSet();
				
				generateFeaturePlugin(set, generationChain, _monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		
		public void createGenerationchainArtefacts() {
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(_projectName);
	        WorkspaceModifyOperation convertOperation = new ConvertProjectOperation(project, false, false);
	        try {
	        	convertOperation.run(_monitor);
	        } catch (Exception e) {
	            Activator.getDefault().logError(e);
	        }
	        
			URI fcoreURI = getModelUri(true);
			TargetPlatformResourceSet resourceSet = new TargetPlatformResourceSet();
			generationChain = (GenerationChain) resourceSet.getResource(fcoreURI, true).getContents().get(0);
			String fcoreRelativePath = "model/" + generationChain.getName() + ".fcore";
			String fcoreProjectName = generationChain.getFactoryComponentName() + ".fc";
			String fcoreOutputPath =  fcoreProjectName + "/" + fcoreRelativePath;
			try {
				setupProject(fcoreProjectName, fcoreRelativePath);
				createFcore(generationChain, fcoreOutputPath, _monitor);
				setupGeneratedProject(fcoreProjectName, fcoreRelativePath);
				set = runFcore(fcoreOutputPath);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * @see org.eclipse.egf.portfolio.genchain.tools.ui.actions.CreateFcoreHelper#computeFcoreOutputPath(org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain)
		 */
		@Override
		protected String computeFcoreOutputPath(GenerationChain generationChain) {
			return generationChain.getFactoryComponentName() + ".fc"+ computeFcoreRelativePath(generationChain);
		}
		
		private void setupGeneratedProject(String projectName, String fcorePath) throws CoreException{
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			// Force creation of pluin.xml with egf extension
			try {
				PDEUtility.updatePluginXml(project, getPluginXmlContent(fcorePath));
			} catch (InvocationTargetException e1) {
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.CLEAN_BUILD, _monitor);
		}
		
		protected ResourceSet runFcore(String fcoreOutputPath) throws CoreException{
			URI uri = URI.createPlatformPluginURI(fcoreOutputPath, false);
			TargetPlatformResourceSet resourceSet = new TargetPlatformResourceSet();
			EObject eObject = resourceSet.getResource(uri, true).getContents().get(0);
	        try {
	            RunActivityHelper.run((Activity) eObject, _monitor);
	        } catch (InvocationException e) {
	            throw new CoreException(new Status(IStatus.ERROR, Activator.getDefault().getPluginID(), e.getMessage(), e));
	        }
	        return resourceSet;
		}
		
		private String getPluginXmlContent(String fcorePath){
			String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
			"<?eclipse version=\"3.2\"?>" +
			"<plugin>" +
			"   <extension" +
			"         point=\"org.eclipse.egf.core.fcore\">" +
			"     <fcore" +
			"            id=\"" + fcorePath + "\">" +
			"      </fcore>" +
			"   </extension>" +
			"</plugin>";
			
			return result;
		}
	}
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.listener.IGenerationListener#generationEnd(org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.AbstractGenerationEvent)
	 */
	@Override
	public void generationEnd(AbstractGenerationEvent event) {
		if (event instanceof ViewpointGenerationEndEvent)
		{
			action.createFeature();
		}
	}

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.listener.IGenerationListener#generationBegin(org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.AbstractGenerationEvent)
	 */
	@Override
	public void generationBegin(AbstractGenerationEvent event) {
		// DO nothing
	}
}
