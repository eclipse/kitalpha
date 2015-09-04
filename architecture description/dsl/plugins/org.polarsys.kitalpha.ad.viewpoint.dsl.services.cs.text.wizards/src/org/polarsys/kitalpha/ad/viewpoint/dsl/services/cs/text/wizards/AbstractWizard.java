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
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.PluginUtil;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreModelHelper;

/**
 * 
 * @author Amine Lajmi
 *
 */
public abstract class AbstractWizard extends Wizard implements INewWizard {
	
	protected IWorkbench workbench;  
	protected IStructuredSelection selection;  
	
	protected AbstractFileCreationPage firstPage;
	protected AbstractSecondPage secondPage;	
	protected AbstractThirdPage thirdPage;	

	protected String vpShortName;
	protected String vpTargetApplication;
	protected String vpDescriptionProjectName;
	protected String vpRootProjectName;
	protected String vpNsURI;

	protected String fileName;
	
	public AbstractWizard() {
	}
	
	protected abstract boolean createFirstPage(IStructuredSelection selection);
	
	protected abstract boolean createSecondPage(IStructuredSelection selection) ;

	protected abstract boolean createThirdPage(IStructuredSelection selection) ;
	
	protected abstract void bindEditor(IFile file);
	
	protected abstract String getInitialContent();
	
	protected abstract String getInitialContent(String fileName);
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;  
		this.selection = selection;
	}
	
	public void addPages() {
		super.addPages();
		if (createFirstPage(selection)) {
			addPage(firstPage);
			EObject standaloneRoot = loadStandaloneResource();
			if (standaloneRoot!=null)
				setViewpointProperties(standaloneRoot);
		}
		if (createSecondPage(selection)) {
			addPage(secondPage);
		}
		if (createThirdPage(selection)) {
			addPage(thirdPage);	
		}
	}

	private EObject loadStandaloneResource() {
		IProject project = firstPage.getViewpointProject();
		if (project!=null) {
			IFolder folder =  firstPage.getViewpointProject().getFolder(ResourceHelper.MODELS_FOLDER);
			if (!folder.exists())
				throw new RuntimeException(Messages.AbstractWizard_ModelFolderNotFound + project.getName());
			URI standaloneResourceURI = ResourceHelper.getStandaloneResourceURI(project.getName());
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(standaloneResourceURI, true);
			return resource.getContents().get(0);
		}
		return null;
	}

	private void setViewpointProperties(EObject root) {
		setVpShortName(CoreModelHelper.getViewpointShortName(root));
		setVpTargetApplication(VpDslConfigurationHelper.getTargetApplication(root));
		setVpRootProjectName(VpDslConfigurationHelper.getRootProjectName(root));
		setVpDescriptionProjectName(firstPage.getViewpointProject().getName());
		setVpNsURI(VpDslConfigurationHelper.getNsURI(root));
	}

	@Override
	public boolean performFinish() {
		boolean result = false;
		IFile file = createNewFile();
		createResource(file);
		result = file != null;
		if (result) {
			try {
				fileName = file.getName();
				bindEditor(file);
				IDE.openEditor(workbench.getActiveWorkbenchWindow().getActivePage(), file);
			} catch (PartInitException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	public IFile createNewFile() {
		return firstPage.createNewFile();
	}

	private void createResource(final IFile file) {
		try {
			new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
					monitor.beginTask(org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.Messages.AbstractWizard_FileCreationTaskTitle, IProgressMonitor.UNKNOWN);
					ResourceSet resourceSet = new ResourceSetImpl();
					URI uri = ResourceHelper.URIFix.createPlatformResourceURI(file.getFullPath().toString(), true);
					URI normalized = resourceSet.getURIConverter().normalize(uri);
					XtextResource resource = (XtextResource) ResourceHelper.loadResource(normalized, resourceSet);
					try {
						String fileName = firstPage.getFileName();
						resource.reparse(getInitialContent(fileName));
						resource.save(Collections.emptyMap());
						PluginUtil.addModelReuseExtension(fileName, vpDescriptionProjectName, vpShortName, uri);
					} catch (IOException ex) {
						ex.printStackTrace();
					}		
					monitor.done();
				}
			}.run(monitor());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void setVpShortName(String vpShortName) {
		this.vpShortName = vpShortName;
	}

	public void setVpTargetApplication(String vpTargetApplication) {
		this.vpTargetApplication = vpTargetApplication;
	}

	public void setVpDescriptionProjectName(String vpDescriptionProjectName) {
		this.vpDescriptionProjectName = vpDescriptionProjectName;
	}

	public void setVpRootProjectName(String vpRootProjectName) {
		this.vpRootProjectName = vpRootProjectName;
	}
	
	private void setVpNsURI(String nsURI) {
		this.vpNsURI = nsURI;
	}

	public String getVpShortName() {
		return vpShortName;
	}

	public String getVpTargetApplication() {
		return vpTargetApplication;
	}

	public String getVpDescriptionProjectName() {
		return vpDescriptionProjectName;
	}

	public String getVpRootProjectName() {
		return vpRootProjectName;
	}
	
	public String getVpNsURI() {
		return vpNsURI;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public static IProgressMonitor monitor() {
		return new NullProgressMonitor();
	}
}
