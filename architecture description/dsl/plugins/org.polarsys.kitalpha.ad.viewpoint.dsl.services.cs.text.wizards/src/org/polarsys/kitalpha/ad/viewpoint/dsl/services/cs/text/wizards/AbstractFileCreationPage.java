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
/**
 * Copyright (c) THALES, 2012. All rights reserved.
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards;

import java.util.Iterator;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;


/**
 * 
 * @author Amine Lajmi
 *
 */
public abstract class AbstractFileCreationPage extends WizardNewFileCreationPage {

	protected IProject viewpointProject;
	
	public AbstractFileCreationPage(IStructuredSelection selection) {
		super(Messages.DefaultFileCreationPage_Title, selection);
		setTitle(Messages.DefaultFileCreationPage_Title);
		setDescription(Messages.DefaultFileCreationPage_Description);
		setFileExtension(FileExtension.PRIMARY_EXTENSION);
		loadViewpointProject(selection);
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		initializeProperties();
	}
	
	public abstract void initializeProperties();

	private void loadViewpointProject(IStructuredSelection selection) {
		TreeSelection currentSelection = (TreeSelection) selection;
		@SuppressWarnings("rawtypes")
		Iterator it = currentSelection.iterator();
		while (it.hasNext()) {
			Object object = it.next();
			IResource selectedResource = null;
			if (object instanceof IResource) {
				selectedResource = (IResource) object;
			} else if (object instanceof IAdaptable) {
				selectedResource = (IResource) ((IAdaptable) object).getAdapter(IResource.class);
			}
			if (selectedResource != null) {
				if (selectedResource.getType() == IResource.FOLDER || selectedResource.getType() == IResource.FILE) {
					setViewpointProject(selectedResource.getProject());
				}
			}
		}
	}
	
	@Override
	protected boolean validatePage() {
		boolean apriori = super.validatePage();
		String fileName = getFileName();
		Pattern pattern = Pattern.compile("(.*).(ui|conf|data|spec|build|diagram|services).vptext");
		boolean fileMatches = pattern.matcher(fileName).matches();
		return (apriori && fileMatches);
	}
	
	public IProject getViewpointProject() {
		return viewpointProject;
	}

	public void setViewpointProject(IProject viewpointProject) {
		this.viewpointProject = viewpointProject;
	}
}
