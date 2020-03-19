/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.ui.wizards;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenProjectPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeReferencesStrategy;
import org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.string.Messages;


/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class HTMLDocumentationGenerationWizardPage extends WizardPage {
	
	private static final String STATUS_4 = Messages.HTMLDocumentationGenerationWizardPage_status_4;
	
	private static final String STATUS_3 = Messages.HTMLDocumentationGenerationWizardPage_status_3;

	private static final String STATUS_2 = Messages.HTMLDocumentationGenerationWizardPage_status_2;

	private static final String STATUS_1 = Messages.HTMLDocumentationGenerationWizardPage_stauts_1;

	private static final String MESSAGE = Messages.HTMLDocumentationGenerationWizardPage_message;

	private static final String OUTPUT_FOLDER_TEXT = Messages.HTMLDocumentationGenerationWizardPage_output_folder_text;

	private static final String BROWSE_TEXT = Messages.HTMLDocumentationGenerationWizardPage_browse_text;

	private static final String INPUT_MODEL_TEXT = Messages.HTMLDocumentationGenerationWizardPage_input_model_text;

	private static final String DESCRIPTION = Messages.HTMLDocumentationGenerationWizardPage_description;

	private static final String TITLE = Messages.HTMLDocumentationGenerationWizardPage_title;
	
	private static final String GEN_OPTION_EXPORT_REF = Messages.HTMLDocumentationGenerationWizardPage_Export_Ref;

	private Text containerText;

	private Text modelURIText;

	private ISelection selection;

	private Map<String, URI> launcherUris;

	private Combo combo;
	
	private ScopeReferencesStrategy referencesStrategy = ScopeReferencesStrategy.EXPORT;
	
	private boolean scopedGeneration = false;
	
	public boolean isScopedGeneration() {
		return scopedGeneration;
	}

	public void setScopedGeneration(boolean scopedGeneration) {
		this.scopedGeneration = scopedGeneration;
	}

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public HTMLDocumentationGenerationWizardPage(ISelection selection) {
		super("wizardPage"); //$NON-NLS-1$
		setTitle(TITLE);
		setDescription(DESCRIPTION);
		this.selection = selection;
	}
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 10;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		Label label = new Label(container, SWT.NULL);
		label.setText(INPUT_MODEL_TEXT);

		modelURIText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		modelURIText.setLayoutData(gd);
		modelURIText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText(BROWSE_TEXT);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				modelSelection();
			}

		});

		label = new Label(container, SWT.NULL);
		label.setText(OUTPUT_FOLDER_TEXT);

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);

		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		button = new Button(container, SWT.PUSH);
		button.setText(BROWSE_TEXT);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				outputFolderSelection();
			}
		});

		if (launcherUris.size() > 1) {
			label = new Label(container, SWT.NONE);
			label.setText("Launcher:");
			combo = new Combo(container, SWT.BORDER);
			GridData comboGridData = new GridData(GridData.FILL_HORIZONTAL);
			comboGridData.horizontalSpan = 2;
			combo.setLayoutData(comboGridData);
			for (String name : launcherUris.keySet()) {
				int index = combo.getItemCount();
				if (name
						.equals(HTMLDocumentationGenerationWizard.DEFAULT_LAUNCHER_LABEL)) {
					index = 0;
				}
				combo.add(name, index);
			}

			combo.select(0);
		}
		
		if (isScopedGeneration()) {
			createScopeOptionsWidgets(container);
		}
		
		initialize();
		dialogChanged();
		setControl(container);
	}

	private void createScopeOptionsWidgets(Composite container) {
		Group optionsGroup = new Group(container, SWT.NONE);
		optionsGroup.setText("Partial generation options");
		GridData groupGridData = new GridData(GridData.FILL_HORIZONTAL);
		groupGridData.horizontalSpan = 3;
		optionsGroup.setLayoutData(groupGridData);
		final GridLayout optionsGroupGridLayout = new GridLayout(1, false);
		optionsGroupGridLayout.verticalSpacing = 10;
		optionsGroup.setLayout(optionsGroupGridLayout);
		
		final Button referencesStrategy_cb = new Button(optionsGroup, SWT.CHECK);
		referencesStrategy_cb.setText(GEN_OPTION_EXPORT_REF);
		referencesStrategy_cb.setSelection(referencesStrategy.equals(ScopeReferencesStrategy.EXPORT));
		referencesStrategy_cb.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				 Button btn = (Button) e.getSource();
				 if (btn.getSelection())
				 {
					 referencesStrategy = ScopeReferencesStrategy.EXPORT;
				 }
				 else
				 {
					 referencesStrategy = ScopeReferencesStrategy.DONT_EXPORT;
				 }
			}
		});
	}

	public ScopeReferencesStrategy getReferencesStrategy() {
		return referencesStrategy;
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection != null && !selection.isEmpty()
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object obj = ssel.getFirstElement();
			
			if (obj instanceof EObject)
			{
				// FIXME: Do we handle multiple resource generation or only single resource generation.
				// Let assume that the current implementation manage single resource generation.
				final EObject modelElement = (EObject) obj;
				URI uri = modelElement.eResource().getURI();
				if (uri.isPlatform())
				{
					this.modelURIText.setText(uri.toString());
					String outputPathDefaultValue = "/" + uri.segments()[1];
					outputPathDefaultValue = DocgenProjectPreferencesHelper.getInstance(obj)
												.getOutputLocationPreference(outputPathDefaultValue);
					this.containerText.setText(outputPathDefaultValue);
				}
			}
			else
			{
				// Setting the output folder path
				if (obj instanceof IResource) 
				{

					IContainer container;
					if (obj instanceof IContainer) {
						container = (IContainer) obj;
					} else {
						container = ((IResource) obj).getParent();
					}

					String outputPathDefaultValue = container.getFullPath().toString();
					outputPathDefaultValue = DocgenProjectPreferencesHelper.getInstance(obj)
												.getOutputLocationPreference(outputPathDefaultValue);
					containerText.setText(outputPathDefaultValue);
				}

				// Setting the model URI
				for (Object object : ssel.toArray()) 
				{
					if (object instanceof IFile) 
					{
						IFile modelFile = (IFile) object;
						URI uri = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
						this.modelURIText.setText(this.modelURIText.getText()+ " " + uri.toString()); //$NON-NLS-1$
					}
				}
			}
			
		}

	}

	private void modelSelection() {
		LoadResourceDialog dialog = new LoadResourceDialog(PlatformUI
				.getWorkbench().getActiveWorkbenchWindow().getShell());
		if (dialog.open() == LoadResourceDialog.OK) {
			String uriText = dialog.getURIText();
			if (uriText != null) {
				modelURIText.setText(uriText);
			}
		}
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void outputFolderSelection() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				MESSAGE);
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		if(!(container instanceof IFolder)) {
			updateStatus(STATUS_4);
			return;
		}
		if (getContainerName().length() == 0) {
			updateStatus(STATUS_1);
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus(STATUS_2);
			return;
		}
		if (!container.isAccessible()) {
			updateStatus(STATUS_3);
			return;
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getContainerName() {
		return containerText.getText();
	}

	public String getModelURI() {
		return modelURIText.getText();
	}

	public void setLauncherUris(Map<String, URI> launcherUris) {
		this.launcherUris = launcherUris;
	}

	public String getSelectedLauncher() {
		if (combo != null) {
			return combo.getText();
		} else {
			Iterator<String> iterator = launcherUris.keySet().iterator();
			if (iterator.hasNext()) {
				return iterator.next();
			} else {
				return "";
			}
		}
	}

	/**
	 * Save project specific preferences:
	 * - Output path
	 */
	public void savePreferences() {
		IStructuredSelection ssel = (IStructuredSelection) selection;
		Object obj = ssel.getFirstElement();
		DocgenProjectPreferencesHelper.getInstance(obj)
		   .setOutputLocationPreference(containerText.getText());
	}
}
