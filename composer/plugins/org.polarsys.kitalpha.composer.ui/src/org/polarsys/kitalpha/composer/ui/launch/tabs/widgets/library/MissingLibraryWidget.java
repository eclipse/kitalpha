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
package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.launch.ICodeManagerLaunchConfigurationConstants;
import org.polarsys.kitalpha.composer.ui.launch.tabs.LibraryTab;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.AtomicWidget;

/**
 * @author Guillaume Gebhart
 *
 */
public class MissingLibraryWidget {

	//private Viewer viewer;
	Button radio1, radio2;
	AtomicWidget cw;
	Text path;
	private LibraryTab tab;
	
	public MissingLibraryWidget(LibraryTab tab){
		this.tab = tab;
	}
	
	
	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#createContents(org.eclipse.swt.widgets.Composite)
	 */
	public void createContents(Composite parent) {
		 createWidget(parent, "Handling of other dependancies"); ////$NON-NLS-1$
		 attachListeners();
		 initialize();
	}

	private void attachListeners() {
		radio1.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				MissingLibraryWidget.this.path.setEnabled(radio1.getSelection());
				tab.update();
			}
		});
		radio2.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				MissingLibraryWidget.this.path.setText("");	 ////$NON-NLS-1$
				tab.update();
			}
		});
		
		path.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent e) {
				tab.update();
			}
		});
	}


	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#initialize()
	 */
	public void initialize() {
		radio2.setSelection(true);
		radio1.setSelection(false);
		path.setEnabled(false);
	}

	
	
public void createWidget(Composite parent_p, String name_p){
		
		Group group = new Group(parent_p, SWT.NONE);
		group.setText(name_p);
		group.setLayout(new GridLayout(2, false));
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = true;
		group.setLayoutData(gd);
		cw = new AtomicWidget(group);
		
		radio1 = cw.createRadioButton(group, "Systematically force path", ""); ////$NON-NLS-2$
		cw.createEmptyLabel(false);
		 gd = new GridData();
		gd.horizontalAlignment = SWT.RIGHT;
		
		Label l = cw.createLabel("Path:");
		l.setLayoutData(gd);
		path = cw.createText(group);
		
		gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		path.setLayoutData(gd);
		radio2 = cw.createRadioButton(group, "Apply Generation Strategy", ""); ////$NON-NLS-2$
		
	
	}


public Text createTextArea(Composite container){
	Text description = new Text(container, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
	description.setEditable(false);
	
	GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL);
	gd.grabExcessVerticalSpace = true;
	gd.grabExcessHorizontalSpace = true;
	gd.horizontalSpan = 1;
	
	description.setLayoutData(gd);
	return description;
}


public void performApply(ILaunchConfigurationWorkingCopy configuration){
	
	String pathStr = path.getText();
	
		configuration
				.setAttribute(
						ICodeManagerLaunchConfigurationConstants.MISSING_LIB_PATH,pathStr);
		
}

public void initializeFrom(ILaunchConfiguration configuration) {
	try {
		String value =  configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.MISSING_LIB_PATH, 
		"");	////$NON-NLS-1$
		if(!value.equals("")){	////$NON-NLS-1$
			path.setText(value);
			radio1.setSelection(true);
			path.setEnabled(true);
			radio2.setSelection(false);
			
		}
		if(value.equals("")){
			path.setText(value);
			radio1.setSelection(false);
			path.setEnabled(false);
			radio2.setSelection(true);
		}
		
	} catch (CoreException e) {
		Activator.getDefault().getLog().log(e.getStatus());
	}
}


}
