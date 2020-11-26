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


package org.polarsys.kitalpha.composer.ui.wizards;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration;

/**
 * Page to get parameter values and destination folder for
 * {@link CodeManagerConfiguration}.
 * 
 * @author Yann Mortier
 */
public class GenericConfigurationWizardPage extends WizardPage {

	private CodeManagerConfiguration configuration;
	private static Text configNameText;
	/**
	 * @return the configNameText
	 */
	public final static String getConfigNameName() {
		return configNameText.getText();
	}

	protected GenericConfigurationWizardPage(String pageName, String title,
			ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	public void setConfiguration(CodeManagerConfiguration configuration) {
		this.configuration = configuration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridData compositeData = new GridData(GridData.FILL_BOTH);
		composite.setLayoutData(compositeData);

		composite.setLayout(new GridLayout(1, true));

		
		createConfigNameComposite(composite);
		
		createDestinationFolderComposite(composite);

		//
		// Strategy
		if (configuration.getStrategyParameters() != null
				&& !configuration.getStrategyParameters().isEmpty()) {
			Group strategyParametersGroup = new Group(composite, SWT.FILL);
			strategyParametersGroup.setLayout(new GridLayout(2, false));
			GridData groupData = new GridData(GridData.FILL_HORIZONTAL);
			strategyParametersGroup.setLayoutData(groupData);
			strategyParametersGroup.setText("Strategy parameters");
			createParametersComposite(strategyParametersGroup, configuration
					.getStrategyParameters());
		}

		//
		// Refinery
		if (configuration.getRefineryParameters() != null
				&& !configuration.getRefineryParameters().isEmpty()) {
			Group refineryParametersGroup = new Group(composite, SWT.FILL);
			refineryParametersGroup.setLayout(new GridLayout(2, false));
			GridData groupData = new GridData(GridData.FILL_HORIZONTAL);
			refineryParametersGroup.setLayoutData(groupData);
			refineryParametersGroup.setText("Refinery parameters");
			createParametersComposite(refineryParametersGroup, configuration
					.getRefineryParameters());
		}

		//
		// Generator
		if (configuration.getGeneratorParameters() != null
				&& !configuration.getGeneratorParameters().isEmpty()) {
			Group generatorParametersGroup = new Group(composite, SWT.FILL);
			generatorParametersGroup.setLayout(new GridLayout(2, false));
			GridData groupData = new GridData(GridData.FILL_HORIZONTAL);
			generatorParametersGroup.setLayoutData(groupData);
			generatorParametersGroup.setText("Generator parameters");
			createParametersComposite(generatorParametersGroup, configuration
					.getGeneratorParameters());
		}

		setControl(composite);
		composite.pack();
	}

	
	private void createConfigNameComposite(Composite parent) {
		Group destinationFolderGroup = new Group(parent, SWT.FILL);
		destinationFolderGroup.setLayout(new GridLayout(3, false));
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		GridData groupData = gridData;
		destinationFolderGroup.setLayoutData(groupData);
		destinationFolderGroup.setText("Configuration Name");

		 configNameText = new Text(destinationFolderGroup,
				SWT.BORDER);
		gridData.minimumWidth = 200;
		configNameText.setLayoutData(gridData);
		configNameText.setEditable(true);

	}
	
	private void createDestinationFolderComposite(Composite parent) {
		Group destinationFolderGroup = new Group(parent, SWT.FILL);
		destinationFolderGroup.setLayout(new GridLayout(3, false));
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		GridData groupData = gridData;
		destinationFolderGroup.setLayoutData(groupData);
		destinationFolderGroup.setText("Destination folder");

		Text destinationFolderText = new Text(destinationFolderGroup,
				SWT.BORDER);
		gridData.minimumWidth = 200;
		destinationFolderText.setLayoutData(gridData);
		if (configuration.getDestinationFolder() != null) {
			destinationFolderText.setText(configuration.getDestinationFolder()
					.toString());
		}
		destinationFolderText.setEditable(true);
		destinationFolderText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				 Text text = (Text) e.widget;    
				configuration.setDestinationFolder(new Path(text.getText()));
				
			}
		});

		Button browseWorkspace = new Button(destinationFolderGroup, SWT.PUSH);
		browseWorkspace.setText("Browse Workspace...");
		browseWorkspace.addSelectionListener(new BrowseWorksapceListener(
				configuration, destinationFolderText));

		Button browseFileSystem = new Button(destinationFolderGroup, SWT.PUSH);
		browseFileSystem.setText("Browse File System...");
		browseFileSystem.addSelectionListener(new BrowseFileSystemListener(
				configuration, destinationFolderText));

	}

	private void createParametersComposite(Composite parent,
			Map<String, Parameter> parameters) {
		for (Entry<String, Parameter> parameter : parameters.entrySet()) {
			Label label = new Label(parent, SWT.LEFT);
			label.setText(parameter.getValue().getName());
			label.setToolTipText(parameter.getValue().getDescription());

			Text text = new Text(parent, SWT.BORDER);
			text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			text.setToolTipText(parameter.getValue().getDescription());
			text.setText(parameter.getValue().getValue());
			text.addModifyListener(new TextListener(text, parameters, parameter
					.getKey()));
		}
	}

	private static class TextListener implements ModifyListener {

		private Text text;

		private Map<String, Parameter> map;

		private String key;

		public TextListener(Text text, Map<String, Parameter> map, String key) {
			this.text = text;
			this.map = map;
			this.key = key;
		}

		@Override
		public void modifyText(ModifyEvent e) {
			this.map.get(key).setValue(text.getText());
		}
	}

	private static class BrowseWorksapceListener extends SelectionAdapter {

		private CodeManagerConfiguration configuration;

		private Text toUpdate;

		public BrowseWorksapceListener(CodeManagerConfiguration configuration,
				Text text) {
			this.configuration = configuration;
			this.toUpdate = text;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
		 */
		@Override
		public void widgetSelected(SelectionEvent e) {
			ContainerSelectionDialog dialog = new ContainerSelectionDialog(
					Display.getCurrent().getActiveShell(), ResourcesPlugin
							.getWorkspace().getRoot(), false,
					"Select new file container");
			if (dialog.open() == ContainerSelectionDialog.OK) {
				Object[] result = dialog.getResult();
				if (result.length == 1) {
					IPath path = (IPath) result[0];
					toUpdate.setText(path.toString());
					configuration.setDestinationFolder(path);
				}
			}
		}

	}

	private static class BrowseFileSystemListener extends SelectionAdapter {

		private CodeManagerConfiguration configuration;

		private Text toUpdate;

		public BrowseFileSystemListener(CodeManagerConfiguration configuration,
				Text text) {
			this.configuration = configuration;
			this.toUpdate = text;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
		 */
		@Override
		public void widgetSelected(SelectionEvent e) {
			DirectoryDialog dialog = new DirectoryDialog(Display.getCurrent()
					.getActiveShell());
			String absolutePath;
			if ((absolutePath = dialog.open()) != null) {
				toUpdate.setText(absolutePath);
				configuration.setDestinationFolder(new Path(absolutePath));
			}
		}
	}

}
