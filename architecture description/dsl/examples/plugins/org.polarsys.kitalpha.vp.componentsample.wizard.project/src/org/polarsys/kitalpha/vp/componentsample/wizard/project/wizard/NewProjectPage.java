/*******************************************************************************
 * Copyright (c) 2015, 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.wizard.project.wizard;

import java.util.regex.Pattern;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * 
 * @author Faycal Abka
 *
 */
public class NewProjectPage extends WizardPage {
	
	private static Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9]*");
	
	private String _projectName = null;
	private String _modelName = null;

	protected NewProjectPage(String pageName) {
		super(pageName);
		setDescription("Create a new Component Sample Project");
	}

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, true);
		
		container.setLayout(gridLayout);
		
		Label projectNameLabel = new Label(container, SWT.NONE);
		projectNameLabel.setText("Project Name");
		
		final Text projectName = new Text(container, SWT.BORDER | SWT.SINGLE);
		projectName.setText("");
		
		Label modelNamelabel = new Label(container, SWT.NONE);
		modelNamelabel.setText("Model Name");
		
		final Text modelName = new Text(container, SWT.BORDER | SWT.SINGLE);
		
		modelName.setText("");
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		projectName.setLayoutData(gd);
		modelName.setLayoutData(gd);
		
		ModifyListener listener = new ModifyListener() {
			
			public void modifyText(ModifyEvent e) {
				//Validate and setComplete
				Object source = e.getSource();
				if (source instanceof Text){
					Text text = (Text)source;
					String name = text.getText();
					if (isValid(name)){
						setErrorMessage(null);
						if (text == projectName){
							_projectName = name;
							modelName.setText(name);
							_modelName = name;
						} else {
							_modelName = name;
						}
						setPageComplete(true);
					} else {
						setErrorMessage("Allowed Characters: [a-zA-Z][a-zA-Z0-9]*");
						setPageComplete(false);
					}
				}
			}
		};
		
		projectName.addModifyListener(listener);
		
		modelName.addModifyListener(listener);
		
		setControl(container);
		setPageComplete(false);
		
	}
	
	
	
	private boolean isValid(String name) {
		return name != null && !name.isEmpty() && pattern.matcher(name).matches();
	}
	
	public String getProjectName(){
		return _projectName;
	}
	
	public String getModelName(){
		return _modelName;
	}

}
