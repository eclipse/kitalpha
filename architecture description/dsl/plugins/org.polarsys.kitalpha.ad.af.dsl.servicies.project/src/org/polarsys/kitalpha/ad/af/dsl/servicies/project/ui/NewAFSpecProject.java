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

package org.polarsys.kitalpha.ad.af.dsl.servicies.project.ui;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescFactory;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Configuration;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.GenerationConfiguration;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints;
import org.polarsys.kitalpha.ad.af.dsl.servicies.project.extension.ConcreteSyntaxResourceCreationManager;
import org.polarsys.kitalpha.ad.af.dsl.servicies.project.ui.util.ProjectsManager;

/**
 * @author Boubekeur Zendagui
 */

public class NewAFSpecProject extends Wizard implements INewWizard {
	
	private final StringBuffer PLUGIN_XML_HEADER = 
		new StringBuffer().append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n")
						  .append("<?eclipse version=\"3.4\"?>\n")
						  .append("<plugin>\n");
	private final StringBuffer PLUGIN_XML_FOOTER = 
		new StringBuffer().append("</plugin>\n");
	
	protected String afShortName;
	protected String afSpecificationProjectName;
	protected String afRootProjectName;
	protected List<Viewpoint> selectedViewpoint = new ArrayList<Viewpoint>();
	
	protected Map<String, String> selectedConcreteSyntaxCreators;
	
	private AFSpecProjectWizardFirstPage  fPage;
	private AFSpecProjectWizardSecondPage sPage;
	
	protected ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin("org.polarsys.kitalpha.ad.af.dsl.servicies.project", //$NON-NLS-1$
												"icons/af_newproject.png"); //$NON-NLS-1$

	public NewAFSpecProject() {
		super();
		this.setWindowTitle("New Architecture Framework");
		super.setDefaultPageImageDescriptor(image);
		super.setNeedsProgressMonitor(true);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public boolean performFinish() {
		try {
			getContainer().run(false, false, new IRunnableWithProgress() {
				
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					try {
						createAfDslProject(monitor);
					} catch (CoreException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					// Create concrete syntax resource.
					createConcretSyntaxResources(monitor);
					
					// Create concrete syntax resource.
					createPluginXml(monitor);
					
					monitor.done();
				}
			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public void addPages() {
		super.addPages();
		addFirstPage();
		if (ConcreteSyntaxResourceCreationManager.isThereAFConcreteSyntaxResourceCreators()) {
			addSecondPage();
		}
	}
	
	protected void addFirstPage(){
		fPage = new AFSpecProjectWizardFirstPage();
		fPage.setTitle("Architecture Framework");
		fPage.setDescription("Create an Architecture Framework (1/2)");
		addPage(fPage);
	}
	
	protected void addSecondPage(){
		sPage = new AFSpecProjectWizardSecondPage();
		sPage.setTitle("Architecture Framework");
		sPage.setDescription("Create an Architecture Framework (2/2)");
		addPage(sPage);
	}
	
	protected void createAfDslProject(IProgressMonitor monitor) throws CoreException, IOException {
		monitor.beginTask("AfSpec resource creation", 3);
		// Project creation.
		monitor.subTask("AFDsl project creation");
		IProject prj = ProjectsManager.createProject(afSpecificationProjectName, afShortName, monitor);
		monitor.worked(2);
		
		// VpDesc model creation.
		monitor.subTask("VPdesc resources creation");
		createAFSpecResource(prj);
		monitor.worked(1);
	}
	
	public void createAFSpecResource(IProject project){
		ArchitectureFramework af = AfdescFactory.eINSTANCE.createArchitectureFramework();
		af.setShortName(afShortName);
		af.setName(afShortName);
		
		/**
		 * Manage Viewpoint
		 */
		if (selectedViewpoint.size() > 0)
		{
			Viewpoints viewpoints = AfdescFactory.eINSTANCE.createViewpoints();
			af.setAf_viewpoints(viewpoints);
			for (Viewpoint viewpoint : selectedViewpoint) {
				viewpoints.getOwned_viewpoints().add(viewpoint);
			}
		}
		
		/**
		 * Manage Configuration
		 */
		Configuration configuration = AfdescFactory.eINSTANCE.createConfiguration();
		af.setOwned_configuration(configuration);
		GenerationConfiguration generationConfiguration = AfdescFactory.eINSTANCE.createGenerationConfiguration();
		generationConfiguration.setRootProjectName(afRootProjectName);
		configuration.getOwned_element().add(generationConfiguration);
		
		// Save model in a new resource
		ResourceSet resourceSet = new ResourceSetImpl();
		String uris = "/"+project.getName()+"/model/"+afShortName.toLowerCase()+".afdesc";
		URI uri = URI.createPlatformResourceURI(uris, false);
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(af);
		
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void createConcretSyntaxResources(IProgressMonitor monitor){
		if (selectedConcreteSyntaxCreators != null && 
				selectedConcreteSyntaxCreators.size() != 0)
		{
			monitor.beginTask("Concrete syntax resources creation", selectedConcreteSyntaxCreators.size());
			Set<String> set = selectedConcreteSyntaxCreators.keySet();
			for (String id : set) 
			{
				try {
					monitor.subTask("creation of " + id + " resource"); //$NON-NLS-1$ //$NON-NLS-2$
					ConcreteSyntaxResourceCreationManager.createAdditionalResource(id, 
																afShortName, 
																afRootProjectName, 
																afSpecificationProjectName,
																selectedViewpoint);
					monitor.worked(1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	protected void createPluginXml(IProgressMonitor monitor){
		StringBuffer pluginXmlContent = new StringBuffer();
		
		pluginXmlContent.append(PLUGIN_XML_HEADER);
		pluginXmlContent.append("\n");
		pluginXmlContent.append(createConcretSyntaxExtensions(monitor));
		pluginXmlContent.append("\n");
		pluginXmlContent.append(PLUGIN_XML_FOOTER);
		
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(afSpecificationProjectName);
		final ByteArrayInputStream fileInputStream = new ByteArrayInputStream(pluginXmlContent.toString().getBytes());

		try {
			new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException,
				InvocationTargetException, InterruptedException {
					IFile pluginXml = project.getFile("plugin.xml");
					if (pluginXml.exists()) {
						pluginXml.setContents(fileInputStream, true, false, null);
					}
					else {
						pluginXml.create(fileInputStream, true, null);
					}

					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				}
			}.run(monitor);
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	protected StringBuffer createConcretSyntaxExtensions(IProgressMonitor monitor){
		StringBuffer result = null;
		if (selectedConcreteSyntaxCreators != null && 
				selectedConcreteSyntaxCreators.size() != 0)
		{
			result = new StringBuffer();
			monitor.beginTask("Concrete syntax resources creation", selectedConcreteSyntaxCreators.size());
			Set<String> set = selectedConcreteSyntaxCreators.keySet();
			for (String id : set) 
			{
				try {
					monitor.subTask("creation of " + id + " contribution"); //$NON-NLS-1$ //$NON-NLS-2$
					StringBuffer content = ConcreteSyntaxResourceCreationManager
									   			.createAdditionalPluginXmlContribution(id, 
									     								   afShortName, 
																		   afRootProjectName, 
																		   afSpecificationProjectName);
					
					if (content != null)
					{
						result.append(content);
						result.append("\n");
					}
					monitor.worked(1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public String getAfShortName() {
		return afShortName;
	}

	public void setAfShortName(String afShortName) {
		this.afShortName = afShortName;
	}

	public String getAfSpecificationProjectName() {
		return afSpecificationProjectName;
	}

	public void setAfSpecificationProjectName(String afSpecificationProjectName) {
		this.afSpecificationProjectName = afSpecificationProjectName;
	}

	public String getAfRootProjectName() {
		return afRootProjectName;
	}

	public void setAfRootProjectName(String afRootProjectName) {
		this.afRootProjectName = afRootProjectName;
	}

	public List<Viewpoint> getSelectedViewpoint() {
		return selectedViewpoint;
	}

	public void setSelectedViewpoint(List<Viewpoint> selectedViewpoint) {
		this.selectedViewpoint = selectedViewpoint;
	}

	public Map<String, String> getSelectedConcreteSyntaxCreators() {
		return selectedConcreteSyntaxCreators;
	}

	public void setSelectedConcreteSyntaxCreators(
			Map<String, String> selectedConcreteSyntaxCreators) {
		this.selectedConcreteSyntaxCreators = selectedConcreteSyntaxCreators;
	}
}
