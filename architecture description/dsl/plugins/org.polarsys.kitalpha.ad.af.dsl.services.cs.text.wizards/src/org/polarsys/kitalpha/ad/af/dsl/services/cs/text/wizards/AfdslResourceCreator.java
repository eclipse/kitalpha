/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

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
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.util.AfdslWizardsUtil;

import org.polarsys.kitalpha.ad.af.dsl.servicies.project.extension.IAFConcreteSyntaxResourceCreator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdslResourceCreator implements IAFConcreteSyntaxResourceCreator {

	public static final String AFTEXT_EXTENSION = "aftext";
	
	private URI resourceURI;
	private String shortName; 
	private String rootProjectName;
	private String dslProjectName;	
	private String parentFolder;
	private String fileName;
	private List<Viewpoint> viewpoints = new ArrayList<Viewpoint>();

	public AfdslResourceCreator() {}
	
	public AfdslResourceCreator(String fileName, String shortName, String rootProjectName, String dslProjectName, List<Viewpoint> viewpoints) {
		this(shortName, rootProjectName, dslProjectName, viewpoints);
		this.fileName = fileName;
		this.parentFolder = null;
	}
	
	public AfdslResourceCreator(String shortName, String rootProjectName, String dslProjectName, List<Viewpoint> viewpoints) {
		this.shortName = shortName;
		this.rootProjectName = rootProjectName;
		this.dslProjectName = dslProjectName;
		this.viewpoints = viewpoints;
		this.parentFolder = null;
	}
	
	@Override
	public boolean createConcreteSyntaxResource(String shortName, String rootProjectName, String dslProjectName, List<Viewpoint> viewpoints) {
		this.shortName = shortName;
		this.rootProjectName = rootProjectName;
		this.dslProjectName = dslProjectName;
		this.viewpoints = viewpoints;
		return createResourceAndOpenEditor();
	}

	public boolean createResourceAndOpenEditor() {
		doCreateResource();
		IFile file = getWorkspaceRoot().getFile(new Path(resourceURI.toPlatformString(true)));
		try {
			refreshWorkspace();
			if (file.exists()) {
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
			}
			return true;
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean createResourceAndOpenEditor(IFile file) {
		String[] segments = file.getFullPath().segments();
		StringBuffer folders = new StringBuffer();
		
		//skip plugin segment and file name.
		for (int i = 1; i < segments.length - 1; i++){
			folders.append("/")
				   .append(segments[i])
				   .append("/");
		}
		
		parentFolder = folders.toString();
		
		doCreateResource();
		try {
			refreshWorkspace();
			if (file.exists()) {
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
			}
			return true;
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private void doCreateResource() {
		try {
			new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
					monitor.beginTask("AF Textual DSL Resource Creation", IProgressMonitor.UNKNOWN); //$NON-NLS-1$
					ResourceSet resourceSet = new ResourceSetImpl();		
					URI uri = computeURI();	
					resourceURI = resourceSet.getURIConverter().normalize(uri);
					XtextResource resource = (XtextResource) resourceSet.createResource(resourceURI);
					if (resource !=null) {
						try {
							resource.reparse(getInitialContent());
							resource.save(Collections.emptyMap());
							} catch (IOException ex) {
							ex.printStackTrace();
						}
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
	
	
	//returns the parent folder of a new created aftext file.
	private String getSubFolders(String parentFolder){
		if (parentFolder == null) {
			return "/model/";
		}
		return parentFolder;
		
	}
	private URI computeURI() {
		String stringURI =null;
		if (fileName!=null) {
			String vpName = fileName.substring(0, fileName.indexOf("."));
			stringURI = '/' + dslProjectName + getSubFolders(parentFolder) + vpName+ "." + AFTEXT_EXTENSION;
		} else {
			stringURI = '/' + dslProjectName + getSubFolders(parentFolder) + shortName+ "." + AFTEXT_EXTENSION;
		}
		return AfdslWizardsUtil.URIFix.createPlatformResourceURI(stringURI, false);	
	}
	
	
	
	
	
	protected String getInitialContent() {
		String header = 
			"/**\n" + 
			" * Copyright (c) " + AfdslWizardsUtil.COPYRIGHT_KITALPHA + ", " + AfdslWizardsUtil.getCurrentYear() + ". All rights reserved. \n" +
			" *\n" +
			" *	Architecture Framework " + shortName + "\n" +
			" *	@author: " + AfdslWizardsUtil.getCurrentUserName() + "\n" +
			" *	@date: " +  AfdslWizardsUtil.getCurrentDate() + "\n" +
			" *\n" +
			" */\n" +
			"ArchitectureFramework " + shortName + " {\n" +
			"	shortName: \"" + shortName + "\"" + "\n" + 
			"	Viewpoints { \n" ;
		
			String body = "		";
			for (int i=0; i<viewpoints.size(); i++) {
				body = body + viewpoints.get(i).getName();
				if (i<(viewpoints.size()-1)) {
					body = body + ", ";
				}
			}
			
			String footer =
			"\n	}\n" + 
			"	Configuration {\n" +
			"		rootProjectName: " + rootProjectName + "\n" +
			"	}\n" +	
			"}";
			String fileContent = header + body + footer;
		return fileContent;
	}

	private IWorkspaceRoot getWorkspaceRoot() {
		return  ResourcesPlugin.getWorkspace().getRoot();
	}
	
	private void refreshWorkspace() {
		IProject project = getWorkspaceRoot().getProject(dslProjectName);
		try {
			project.refreshLocal(IProject.DEPTH_INFINITE, monitor());
		} catch (CoreException ex) {
			ex.printStackTrace();
		}
	}
	
	public static IProgressMonitor monitor() {
		return new NullProgressMonitor();
	}
	
	@Override
	public StringBuffer createPluginXmlContribution(String shortName, String rootProjectName, String dslProjectName) {
		return null;
	}
}
