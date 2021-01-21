/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.ui.wizards;

import org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenBrandingPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenPreferenceConstant;
import org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.string.Messages;

/**
 * @author Boubekeur Zendagui
 */
public class HTMLDocumentationBrandingWizardPage extends WizardPage {

	private Text copyrightText;
	private Text logoPathText;
	private Text logoAltText;
	
	/**
	 * Default constructor
	 */
	public HTMLDocumentationBrandingWizardPage() {
		super("wizardPage");
		setTitle(Messages.HTMLDocumentationGenerationWizardPage_title);
		setDescription(Messages.HTMLDocumentationBrandingWizardPage_description);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite container = createContent(parent);
		loadPreferencesValues();
		dialogChanged();
		setControl(container);
	}
	
	
	/**
	 * @return The copyright value provided by end user
	 */
	public String getCopyright(){
		return copyrightText != null && doesCopyrightChanged() ? copyrightText.getText() : null;
	}
	
	/**
	 * @return The LogoPath value provided by end user
	 */
	public String getLogoPath(){
		return logoPathText != null && doesLogoPathChanged() ? logoPathText.getText() : null;
	}
	
	/**
	 * @return The LogoAlt value provided by end user
	 */
	public String getLogoAlt(){
		return logoAltText != null && doesLogoAltChanged() ? logoAltText.getText() : null;
	}
	
	
	/**
	 * This method displays a pop-up to ask user if he/she went to store the customized values in the Docgen preferences.
	 * 
	 * If there no modifications, this method will do nothing.
	 */
	public void askUserForUpdatingBrandingDataPreferences(){
		if (doesBrandingDataChanged())
		{
			final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			MessageDialog dialog = new MessageDialog(shell, "Branding data", null, "Would you like to update the prefereences with the wizard data", 
													 MessageDialog.QUESTION, new String[] {"Yes", "No"}, 0);
			int result = dialog.open();
			if (result == 0)
			{
				updateBrandingPreferences();
			}
		}
	}
	
	/**
	 * @return True if the user customized the copyright, False otherwise
	 */
	public boolean doesCopyrightChanged(){
		return ! copyrightText.getText().equals(DocgenBrandingPreferencesHelper.getCopyright());
	}
	
	/**
	 * @return True if the user customized the LogoPath, False otherwise
	 */
	public boolean doesLogoPathChanged(){
		return ! logoPathText.getText().equals(DocgenBrandingPreferencesHelper.getLogoPath());
	}
	
	/**
	 * @return True if the user customized the LogoAlt, False otherwise
	 */
	public boolean doesLogoAltChanged(){
		return ! logoAltText.getText().equals(DocgenBrandingPreferencesHelper.getLogoAlternateText());
	}
	
	/**
	 * @return True if the user customized at least one Branding Data
	 */
	public boolean doesBrandingDataChanged(){
		return doesCopyrightChanged() || doesLogoPathChanged() || doesLogoAltChanged();
	}
	
	/**
	 * Update the Branding Data Preferences by the values provided by the user in the Wizard
	 */
	public void updateBrandingPreferences(){
		IPreferenceStore store = DocgenBrandingPreferencesHelper.STORE;
		if (! copyrightText.getText().equals(DocgenBrandingPreferencesHelper.getCopyright()))
		{
			store.setValue(DocgenPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT, copyrightText.getText());
		}
		if (! logoPathText.getText().equals(DocgenBrandingPreferencesHelper.getLogoPath()))
		{
			store.setValue(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH, logoPathText.getText());
		}
		if (! logoAltText.getText().equals(DocgenBrandingPreferencesHelper.getLogoAlternateText()))
		{
			store.setValue(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT, logoAltText.getText());
		}
		
		if (logoPathText.getText().equals(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH_DEFAULT_VALUE) &&
			logoAltText.getText().equals(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT_DEFAULT_VALUE))
		{
			store.setValue(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_USE_DEFAULT, true);
		}
		else
		{
			store.setValue(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_USE_DEFAULT, false);
		}
	}
	
	/**
	 * Create the Branding widgets.
	 * 
	 * @param parent the parent {@link Composite}
	 * @return the composite containing Branding widgets
	 */
	private Composite createContent(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 10;
		
		Label copyrightLabel = new Label(container, SWT.NULL);
		copyrightLabel.setText(Messages.HTMLDocumentationBrandingWizardPage_Copyright);
		copyrightText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		copyrightText.setLayoutData(gd);
		
		Label imageLabel = new Label(container, SWT.NULL);
		imageLabel.setText(Messages.HTMLDocumentationBrandingWizardPage_Logo_Path);
		logoPathText = new Text(container, SWT.BORDER | SWT.SINGLE);
		logoPathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		logoPathText.setEnabled(false);
		logoPathText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		Button button = new Button(container, SWT.PUSH);
		button.setText(Messages.HTMLDocumentationGenerationWizardPage_browse_text);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				imageSelection();
			}
		});
		
		Label logoAltLabel = new Label(container, SWT.NULL);
		logoAltLabel.setText(Messages.HTMLDocumentationBrandingWizardPage_Logo_ALT);
		logoAltText = new Text(container, SWT.BORDER | SWT.SINGLE);
		logoAltText.setLayoutData(gd);
		return container;
	}
	
	/**
	 * Load the value of the preferences in the wizard page
	 */
	private void loadPreferencesValues(){
		copyrightText.setText(DocgenBrandingPreferencesHelper.getCopyright());
		logoPathText.setText(DocgenBrandingPreferencesHelper.getLogoPath());
		logoAltText.setText(DocgenBrandingPreferencesHelper.getLogoAlternateText());
	}
	
	/**
	 * Fired on any changes in the wizard Text widgets
	 */
	private void dialogChanged() {
		final String logoPqth = logoPathText.getText();
		if (logoPqth.equals(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH_DEFAULT_VALUE))
		{
			updateStatus(null);
		}
	}


	/**
	 * Update the status of the Wizard
	 * @param message the message to display
	 */
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	/**
	 * Open a LoadResource dialog allowing logo file selection
	 */
	private void imageSelection() {
		LoadResourceDialog dialog = new LoadResourceDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		if (dialog.open() == LoadResourceDialog.OK) 
		{
			String uriText = dialog.getURIText();
			if (uriText != null) 
			{
				logoPathText.setText(uriText);
			}
		}
	}

}
