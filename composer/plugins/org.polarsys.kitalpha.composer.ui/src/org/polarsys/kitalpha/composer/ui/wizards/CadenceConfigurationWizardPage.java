/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.wizards;

import java.util.Set;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.composer.api.CodeManagerCadenceLaunchConfiguration;
import org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration;

/**
 * Page to get parameter values and destination folder for
 * {@link CodeManagerConfiguration}.
 * 
 * @author Yann Mortier
 */
public class CadenceConfigurationWizardPage extends GenericConfigurationWizardPage {

	private CodeManagerConfiguration configuration;
	private CodeManagerCadenceLaunchConfiguration cadenceConfig; 
	
	protected CadenceConfigurationWizardPage(String pageName, String title,
			ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	public void setConfiguration(CodeManagerConfiguration configuration) {
		this.configuration = configuration;
		this.cadenceConfig = configuration.getCodeManagerCadenceLaunchConfiguration();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridData compositeData = new GridData(GridData.FILL_BOTH);
		composite.setLayoutData(compositeData);
		
		composite.setLayout(new GridLayout(1, true));

		CTabFolder tabFolder  = new CTabFolder(composite, SWT.BORDER| SWT.VERTICAL);
		compositeData = new GridData(GridData.FILL_BOTH);
		tabFolder.setLayoutData(compositeData);
		tabFolder.setSimple(false);
		
		createTab(tabFolder,"Before Strategy",cadenceConfig.getBeforeStrategyActivities());
		createTab(tabFolder,"Before Refinery",cadenceConfig.getBeforeRefineryActivities());
		createTab(tabFolder,"Before Generation", cadenceConfig.getBeforeGenerationActivities());
		createTab(tabFolder,"After Generation", cadenceConfig.getAfterGenerationActivities());
	

		setControl(composite);
		composite.pack();
	}

	
	private void createTab(CTabFolder tabFolder, String title, WorkflowActivityParameter parameter) {
		CTabItem item = new CTabItem(tabFolder, SWT.VERTICAL,0);
		
		item.setText(title);
		Set<String> activities = parameter.getActivitiesID();
		Composite composite = new Composite(tabFolder, SWT.NONE);
		
		
		composite.setLayout(new GridLayout(1, true));
		GridData compositeData = new GridData(GridData.FILL_BOTH);
		compositeData.grabExcessVerticalSpace = true;
		composite.setLayoutData(compositeData);
		for(String id : activities){
			
			Group strategyParametersGroup = new Group(composite, SWT.FILL);
			strategyParametersGroup.setLayout(new GridLayout(2, false));
			GridData groupData = new GridData(GridData.FILL_HORIZONTAL);
			strategyParametersGroup.setLayoutData(groupData);
			strategyParametersGroup.setText(id);
			createParametersComposite(strategyParametersGroup, parameter.getActivityParameters(id)
					);
			
		}
		
		item.setControl(composite);
	}

	

	


	private void createParametersComposite(Composite parent,
			ActivityParameters parameters) {
		for (GenericParameter<?> parameter : parameters.getParameters()) {
			Label label = new Label(parent, SWT.LEFT);
			label.setText(parameter.getName());
			label.setToolTipText(parameter.getDescription());

			Text text = new Text(parent, SWT.BORDER);
			text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			text.setToolTipText(parameter.getDescription());
			text.setText(parameter.getValue().toString());
			text.addModifyListener(new TextListener(text, (GenericParameter<Object>)parameter, parameter.getName()));
		}
	
	}
	private static class TextListener implements ModifyListener {

		private Text text;

		private  GenericParameter<Object> parameter;

		private String key;

		public TextListener(Text text, GenericParameter<Object> parameter, String key) {
			this.text = text;
			this.parameter = parameter;
			this.key = key;
		}

		public void modifyText(ModifyEvent e) {
			this.parameter.setValue(text.getText());
		}
	}

	

}
