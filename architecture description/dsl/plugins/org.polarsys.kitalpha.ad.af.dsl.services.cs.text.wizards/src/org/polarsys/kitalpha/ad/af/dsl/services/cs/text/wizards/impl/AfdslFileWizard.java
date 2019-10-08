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

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.impl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.AfdslResourceCreator;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.messages.Messages;
import org.polarsys.kitalpha.ad.af.dsl.services.preference.helper.AFRootProjectNamePreferencesHelper;
import org.polarsys.kitalpha.ad.af.dsl.servicies.project.ui.NewAFSpecProject;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdslFileWizard extends NewAFSpecProject implements INewWizard {

	private AfdslFileCreationPage firstPage;
	
	private AfdslFileSecondPage secondPage;
	
	private AfdslFileThirdPage thirdPage;
	
	private IStructuredSelection selection;  

	private AfdslResourceCreator delegate;
	
	public AfdslFileCreationPage getFirstPage() {
		return firstPage;
	}
	
	public AfdslFileSecondPage getSecondPage() {
		return secondPage;
	}
	
	public AfdslFileThirdPage getThirdPage(){
		return thirdPage;
	}
	
	public AfdslFileWizard() {
		setWindowTitle(Messages.AfdslNewFile_AfdslFileWizard);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection; 
	}

	@Override
	public boolean performFinish() {
		IPath containerPath = firstPage.getContainerFullPath();
		IPath filePath = containerPath.append(firstPage.getFileName());
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
		
		String projectName = filePath.segment(0);
		String rootProjectName = AFRootProjectNamePreferencesHelper.getCustomizedValue();
		
		setAfRootProjectName(rootProjectName);
		setAfSpecificationProjectName(projectName);
		
		if (!file.exists()) {
			delegate = new AfdslResourceCreator(file.getName(),
					getAfShortName(), getAfRootProjectName(),
					getAfSpecificationProjectName(),
					secondPage.getSelectedViewpoint());
			return delegate.createResourceAndOpenEditor(file);
		}
		return false;
	}

	public IFile createNewFile() {
		return firstPage.createNewFile();
	}

	@Override
	public void addPages() {
		firstPage = new AfdslFileCreationPage(selection);
		addPage(firstPage);  
		
		secondPage = new AfdslFileSecondPage(selection);
		secondPage.setTitle(Messages.AfdslNewFileSecondPage_InitializeProperties);
		secondPage.setDescription(Messages.AfdslNewFileCreationPage_CreateAfdslFileFromScratch + " (2/3)");
		addPage(secondPage);
		
	}
}
