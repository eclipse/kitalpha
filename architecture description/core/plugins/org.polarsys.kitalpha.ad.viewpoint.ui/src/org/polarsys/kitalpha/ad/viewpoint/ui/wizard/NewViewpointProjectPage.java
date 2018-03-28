/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceNotFoundException;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (aird).
 */

public class NewViewpointProjectPage extends WizardPage {
	private static final String SPACE = " ";

	private Text viewpointIdText;
	private Text viewpointNameText;
	private Text viewpointShortNameText;
	private Text projectNameText;

	private ISelection selection;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public NewViewpointProjectPage(ISelection selection) {
		super("wizardPage");
		setTitle("Viewpoint creation wizard");
		setDescription("This wizard creates a project and a viewpoint model.");
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;

		createFirstLine(container);
		createSecondLine(container);
		createThirdLine(container);
		createFourthLine(container);
		dialogChanged();
		setControl(container);

	}

	private void createThirdLine(Composite container) {
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		Label label = new Label(container, SWT.NULL);
		label.setText("&Viewpoint short name:");

		viewpointShortNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		viewpointShortNameText.setLayoutData(gd);
		viewpointShortNameText.setText("myviewpoint");
		viewpointShortNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		label = new Label(container, SWT.NULL);
		label.setText("");
	}

	private void createFourthLine(Composite container) {
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		Label label = new Label(container, SWT.NULL);
		label.setText("&Viewpoint ID:");

		viewpointIdText = new Text(container, SWT.BORDER | SWT.SINGLE);
		viewpointIdText.setLayoutData(gd);
		viewpointIdText.setText("org.polarsys.kitalpha.viewpoint.myviewpoint");
		viewpointIdText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		label = new Label(container, SWT.NULL);
		label.setText("");
	}

	private void createSecondLine(Composite container) {
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		Label label = new Label(container, SWT.NULL);
		label.setText("&Viewpoint name:");

		viewpointNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		viewpointNameText.setLayoutData(gd);
		viewpointNameText.setText("My Viewpoint");
		viewpointNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		label = new Label(container, SWT.NULL);
		label.setText("");
	}

	private void createFirstLine(Composite container) {
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		Label label = new Label(container, SWT.NULL);
		label.setText("&Project name:");

		projectNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		projectNameText.setLayoutData(gd);
		projectNameText.setText("org.polarsys.kitalpha.viewpoint.myviewpointproject");
		projectNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		label = new Label(container, SWT.NULL);
		label.setText("");
	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {

		String projectName = getProjectName();
		String vpName = getViewpointName();
		String vpShortName = getViewpointShortName();
		String vpId = getViewpointId();

		if (projectName.length() == 0) {
			updateStatus("Project name must be specified");
			return;
		}
		if (vpShortName.length() == 0) {
			updateStatus("Viewpoint short name must be specified");
			return;
		}
		if (vpName.length() == 0) {
			updateStatus("Viewpoint name must be specified");
			return;
		}
		if (vpId.length() == 0) {
			updateStatus("Viewpoint Id must be specified");
			return;
		}
		if (vpId.contains(SPACE)) {
			updateStatus("Viewpoint Id must be valid");
			return;
		}
		if (vpShortName.contains(SPACE)) {
			updateStatus("Viewpoint short name must be valid");
			return;
		}
		if (projectName.contains(SPACE)) {
			updateStatus("Project name must be valid");
			return;
		}
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists()) {
			updateStatus("Project exists already");
			return;
		}
		try {
			ResourceReuse.createHelper().getResource(vpId);
			updateStatus("The id is already in use");
			return;
		} catch (ResourceNotFoundException e) {
			// there is no problem !
		}

		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getProjectName() {
		return projectNameText.getText();
	}

	public String getViewpointName() {
		return viewpointNameText.getText();
	}

	public String getViewpointShortName() {
		return viewpointShortNameText.getText();
	}

	public String getViewpointId() {
		return viewpointIdText.getText();
	}

}