/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.ui.launch.tabs;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library.LibraryWidget;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library.MissingLibraryWidget;

/**
 * @author Guillaume Gebhart
 *
 */
public class LibraryTab extends AbstractLaunchConfigurationTab{

	private static final String TAB_NAME = "Libraries"; //$NON-NLS-1$
	private final LibraryWidget libraryWidget = new LibraryWidget(this);
	private final MissingLibraryWidget missinglibraryWidget = new MissingLibraryWidget(this);
	private boolean save = true;
	
	public void createControl(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		GridLayout topLayout = new GridLayout();
		topLayout.marginHeight = 0;
		topLayout.marginWidth = 0;
		topLayout.numColumns = 1;
		topLayout.marginTop = 10;
		topLayout.marginLeft = 10;
		topLayout.marginRight = 10;
		comp.setLayout(topLayout);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		comp.setLayoutData(gd);
		setControl(comp);
		
		
		libraryWidget.createContents(comp);
		missinglibraryWidget.createContents(comp);
		
	}

	
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return TAB_NAME;
	}

	public Image getImage() {
		String img = "icons/libraries.png"; //$NON-NLS-1$
		ImageDescriptor descriptor =  Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, img);
		return descriptor.createImage();
		
	}
	
	public void initializeFrom(ILaunchConfiguration configuration) {
		libraryWidget.initializeFrom(configuration);
		missinglibraryWidget.initializeFrom(configuration);
		
		
	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		//if(save){
			libraryWidget.performApply(configuration);
			missinglibraryWidget.performApply(configuration);		
		//}
	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}
	
	
	public Shell getShell(){
		return super.getShell();
	}

	
	public void updateLaunchConfigurationDialog(){
		super.updateLaunchConfigurationDialog();
	}
	
	
	public void noUpdate(){
		save = false;
		setDirty(false);
		updateLaunchConfigurationDialog();
	}
	

	public void update(){
		save = true;
		setDirty(true);
		updateLaunchConfigurationDialog();
	}
	
	@Override
	public boolean canSave() {
		return save;
	}
	
}
