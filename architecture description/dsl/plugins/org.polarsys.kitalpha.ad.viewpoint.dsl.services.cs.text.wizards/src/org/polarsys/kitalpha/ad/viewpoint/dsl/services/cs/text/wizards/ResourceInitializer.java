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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.EditorIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.PluginUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.util.WizardsUtil;

import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.extensions.IConcreteSyntaxResourceCreator;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class ResourceInitializer implements IConcreteSyntaxResourceCreator {
	
	private String vpShortName;	
	private String vpTargetApplication;
	private String vpDescriptionProjectName;
	private String vpRootProjectName;
	private String vpNsURI;
	
	public ResourceInitializer() {
	}

	public boolean createConcreteSyntaxResource(String shortName,
			String targetApplciation, String rootProjectName,
			String dslProjectName, 
			String nsURI) {
		this.vpShortName = shortName;
		this.vpTargetApplication = targetApplciation;
		this.vpRootProjectName = rootProjectName;
		this.vpDescriptionProjectName = dslProjectName;
		this.vpNsURI = nsURI;
		return createResourcesAndOpenEditor();
	}
	
	public boolean createResourcesAndOpenEditor() {
		doCreateResources();
		bindEditors();
		IFile file = getWorkspaceRoot().getFile(new Path(computeURI(FileExtension.SPECIFICATION_EXTENSION).toPlatformString(true)));
		if (file !=null) {
			try {
				refreshWorkspace();
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
				return true;
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	private void refreshWorkspace() {
		IProject project = getWorkspaceRoot().getProject(vpDescriptionProjectName);
		try {
			project.refreshLocal(IProject.DEPTH_INFINITE, monitor());
		} catch (CoreException ex) {
			ex.printStackTrace();
		}
	}

	private void bindEditors() {
		//spec
		IFile specFile = getWorkspaceRoot().getFile(new Path(computeURI(FileExtension.SPECIFICATION_EXTENSION).toPlatformString(true)));
		if (specFile !=null) {
			IDE.setDefaultEditor(specFile,EditorIDs.VPSPEC_EDITOR_ID);
		}
		//data
		IFile dataFile = getWorkspaceRoot().getFile(new Path(computeURI(FileExtension.DATA_EXTENSION).toPlatformString(true)));
		if (dataFile !=null) {
			IDE.setDefaultEditor(dataFile,EditorIDs.DATA_EDITOR_ID);
		}
		//config
		IFile configFile = getWorkspaceRoot().getFile(new Path(computeURI(FileExtension.CONFIGURATION_EXTENSION).toPlatformString(true)));
		if (configFile !=null) {
			IDE.setDefaultEditor(configFile,EditorIDs.CONFIG_EDITOR_ID);
		}
	}
	
	private void doCreateResources() {	
		try {
			new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
					monitor.beginTask("Initializing viewpoint resources", IProgressMonitor.UNKNOWN); //$NON-NLS-1$
					ResourceSet resourceSet = new ResourceSetImpl();
					//1. create data resource
					createDataResource(resourceSet);
					//2. create config resource
					createConfigResource(resourceSet);
					//3. create spec resource
					createPrimaryResource(resourceSet);
					//4. add model reuse extensions
					addModelReuseExtensions(vpDescriptionProjectName, vpShortName);
					monitor.done();
				}
			}.run(monitor());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void createPrimaryResource(ResourceSet resourceSet) {	
		URI uri = computeURI(FileExtension.SPECIFICATION_EXTENSION);		
		XtextResource specResource = (XtextResource) ResourceHelper.createResource(uri, resourceSet);
		if (specResource !=null) {
			try {
				specResource.reparse(getInitialSpecContent());
				specResource.save(Collections.emptyMap());
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	protected void createDataResource(ResourceSet resourceSet) {		
		URI uri = computeURI(FileExtension.DATA_EXTENSION);		
		XtextResource specResource = (XtextResource) ResourceHelper.createResource(uri, resourceSet);
		if (specResource !=null) {
			try {
				specResource.reparse(getInitialDataContent());
				specResource.save(Collections.emptyMap());
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}	
	}

	protected void createConfigResource(ResourceSet resourceSet) {		
		URI uri = computeURI(FileExtension.CONFIGURATION_EXTENSION);		
		XtextResource specResource = (XtextResource) ResourceHelper.createResource(uri, resourceSet);
		if (specResource !=null) {
			try {
				specResource.reparse(getInitialConfigurationContent());
				specResource.save(Collections.emptyMap());
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	public URI computeURI(String extension) {
		return ResourceHelper.computeURI(vpDescriptionProjectName, vpShortName, extension);
	}
	
	public String getInitialSpecContent() {
		return WizardsUtil.getInitialSpecContent(vpShortName);
	}
	
	public String getInitialConfigurationContent() {
		return WizardsUtil.getInitialConfigurationContent(vpShortName, vpTargetApplication, vpRootProjectName, vpNsURI);
	}
	
	public String getInitialDataContent() {
		return WizardsUtil.getInitialDataContent(vpShortName);
	}
	
	public static IProgressMonitor monitor() {
		return new NullProgressMonitor();
	}
	
	private void addModelReuseExtensions(String dslProjectName, String shortName) {
		PluginUtil.createModelReuseExtensionForAE(dslProjectName, shortName);
		PluginUtil.addModelReuseExtension(dslProjectName, shortName, FileExtension.SPECIFICATION_EXTENSION);
		PluginUtil.addModelReuseExtension(dslProjectName, shortName, FileExtension.DATA_EXTENSION);
		PluginUtil.addModelReuseExtension(dslProjectName, shortName, FileExtension.CONFIGURATION_EXTENSION);
	}
	
	/**
	 * @deprecated
	 */
	@SuppressWarnings("unused")
	private void addArchitectureEvaluationExtension() {
		IProject project = getWorkspaceRoot().getProject(vpDescriptionProjectName);
		if (project.exists())
			PluginUtil.doCreatePluginXml(project, vpShortName);		
	}
	
	/**
	 * @deprecated
	 */
	public StringBuffer createPluginXmlContribution(String shortName, String targetApplication, String rootProjectName, String dslProjectName, String nsURI) {
		return null;
	}
	
	private IWorkspaceRoot getWorkspaceRoot() {
		return  ResourcesPlugin.getWorkspace().getRoot();
	}
}
