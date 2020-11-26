/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

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
	
	@Override
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

	
	@Override
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return TAB_NAME;
	}

	@Override
	public Image getImage() {
		String img = "icons/libraries.png"; //$NON-NLS-1$
		ImageDescriptor descriptor =  Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, img);
		return descriptor.createImage();
		
	}
	
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		libraryWidget.initializeFrom(configuration);
		missinglibraryWidget.initializeFrom(configuration);
		
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		libraryWidget.performApply(configuration);
		missinglibraryWidget.performApply(configuration);		
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}
	
	
	@Override
	public Shell getShell(){
		return super.getShell();
	}

	
	@Override
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
