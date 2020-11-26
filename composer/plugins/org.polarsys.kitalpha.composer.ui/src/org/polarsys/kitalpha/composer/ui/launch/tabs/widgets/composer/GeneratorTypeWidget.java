/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.composer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.launch.ICodeManagerLaunchConfigurationConstants;
import org.polarsys.kitalpha.composer.ui.launch.tabs.ComposerTab;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.AtomicWidget;

/**
 * @author Guillaume Gebhart
 *
 */
public class GeneratorTypeWidget extends AbstractComposerWidget {

	private Viewer viewer;
	private ComposerTab tab;
	AtomicWidget cw;
	private IConfigurationElement selectedAllocationBinding;
	
	public GeneratorTypeWidget(ComposerTab tab_p){
		tab = tab_p;
	}
	
	
	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createContents(Composite parent) {
		 createWidget(parent, "Generation Type", "Choose the generation Type",false);
		 attachListeners();
		 initialize();
	}

	private void attachListeners() {
		viewer.addSelectionChangedListener(new ComposerElementListener(
				this));
		
	}


	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#initialize()
	 */
	@Override
	public void initialize() {
		IConfigurationElement[] binding = CodeManagerExtensions
		.getAllBindingExtensions();
		viewer.setInput(binding);
		
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#updateSelection(org.eclipse.core.runtime.IConfigurationElement)
	 */
	@Override
	public void updateSelection(IConfigurationElement selectedElement) {
		if (selectedElement != this.selectedAllocationBinding) {
			selectedAllocationBinding = selectedElement;
			String ns_URI = selectedAllocationBinding
			.getAttribute(CodeManagerExtensions.ATT_URI);
			tab.setGlobalNsUri(ns_URI);
			tab.update();
		}

	}
	
public Viewer createWidget(Composite parent_p, String name_p, String comboxText_p, boolean button){
		
		Group group = new Group(parent_p, SWT.NONE);
		group.setText(name_p);
		group.setLayout(new GridLayout(2, true));
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		group.setLayoutData(gd);
		
		cw = new AtomicWidget(group);
		 viewer = cw.createComboViewer(false);
		
		if(!button){
			cw.createEmptyLabel(false);
		}else{
			Button edit = cw.createButton(group, "Edit Parameters", "configure the parameters");
			GridData gd_button = new GridData();
			gd_button.horizontalAlignment = SWT.RIGHT;
			edit.setLayoutData(gd_button);
			
		}
		
		description = cw.createEmptyLabel(true);
		return viewer;
	}

@Override
public final Viewer getViewer() {
	return viewer;
}

public void performApply(ILaunchConfigurationWorkingCopy configuration){
	if (selectedAllocationBinding != null) {
		configuration
				.setAttribute(
						ICodeManagerLaunchConfigurationConstants.GENERATION_ALLOCATION_URI,
						selectedAllocationBinding
								.getAttribute(CodeManagerExtensions.ATT_URI));
		configuration.setAttribute(
				ICodeManagerLaunchConfigurationConstants.GENERATION_NAME,
				selectedAllocationBinding
						.getAttribute(CodeManagerExtensions.ATT_NAME));
	}
}

public void initializeFrom(ILaunchConfiguration configuration) {
	try {
		
		String str = configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.GENERATION_NAME,
				"");
		if(!str.equals("")){
			int index= cw.initializeComboViewer(str);
			cw.intializeDescription(description,index);
		}
	} catch (CoreException e) {
		Activator.getDefault().getLog().log(e.getStatus());
	}
}


}
