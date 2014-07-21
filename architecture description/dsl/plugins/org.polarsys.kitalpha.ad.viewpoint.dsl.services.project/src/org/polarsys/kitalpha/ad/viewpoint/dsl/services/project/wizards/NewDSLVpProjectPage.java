/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import org.polarsys.kitalpha.ad.ta.extension.TargetApplicationExtensionManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.utils.NamesValidityChecker;

/**
 * @author Boubekeur Zendagui
 */

public class NewDSLVpProjectPage extends WizardPage{
	private Text _vpShortNameText;
	private Combo _targetapplicationListCombo;
	@SuppressWarnings("unused")
	private ISelection iSelection;

	/**
	 * Default constructor with selection.
	 * @param selection the current selection.
	 */
	public NewDSLVpProjectPage(ISelection selection){
		super(Messages.Wizard_Page1_Title);
		iSelection = selection;
	}
	
	/**
	 * Default constructor
	 */
	public NewDSLVpProjectPage(){
		super(Messages.Wizard_Page1_Title);
	}
	
	/**
	 * Create the page controls.
	 * @param parent the parent composite wherein the created controls will 
	 * be added
	 */
	public void createControl(Composite parent) {
		Composite compo = new Composite(parent, SWT.NONE);
		compo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compo.setLayout(new GridLayout(2, false));
	    
	    Label vpName = new Label(compo, SWT.NONE);
		vpName.setText(Messages.Wizard_Page1_Label_ShortName);
		_vpShortNameText = new Text(compo, SWT.BORDER | SWT.SINGLE);
		_vpShortNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		_vpShortNameText.setFocus();
		_vpShortNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				vpDataChanged();
				((NewDSLVpProjectWizard)getWizard()).setVpShortName(_vpShortNameText.getText());
			}
		});
		
		String initialShortName = ((NewDSLVpProjectWizard)getWizard()).getVpShortName();
		if (initialShortName != null && initialShortName.trim().length() > 0)
			_vpShortNameText.setText(initialShortName);
		
		Label targetapplicationListLabel = new Label(compo, SWT.NONE);
		targetapplicationListLabel.setText(Messages.Wizard_Page1_Label_TargetApplication);
		_targetapplicationListCombo = new Combo (compo, SWT.READ_ONLY);
		_targetapplicationListCombo.setItems(TargetApplicationExtensionManager.getSupportedTargetApplication());
		
		_targetapplicationListCombo.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				vpDataChanged();
				((NewDSLVpProjectWizard)getWizard()).setVpTargetApplication(_targetapplicationListCombo.getText());
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		int i = 0;
		for (String item : _targetapplicationListCombo.getItems()) {
			if (DefaultWizardSelection.isDefault(item, DefaultWizardSelection.TargetApplicationDefaultSelection))
			{
				_targetapplicationListCombo.select(i);
				((NewDSLVpProjectWizard)getWizard()).
							setVpTargetApplication(_targetapplicationListCombo.getText());
				break;
			}
			i++;
		}
		
		setControl(compo);
	    vpDataChanged();
	}
	
	/**
	 * Check if the provided data in widgets are well formated.
	 * @return True if data are well formated, false else.
	 */
	private boolean vpDataChanged() {
		String msg = Messages.Wizard_Page1_DataCheck_AllowedCharacter;

		if (_vpShortNameText != null)
			if (! NamesValidityChecker.isValid(_vpShortNameText.getText(), false))
			{
				updateStatus(Messages.Wizard_Page1_DataCheck_VPShortName_Invalid + msg);
				return false;
			}
		
		if (_targetapplicationListCombo != null)
			if (_targetapplicationListCombo.getText().trim().length() == 0 ||
					_targetapplicationListCombo.getText().equals(Messages.Wizard_Page1_NoTargetApplication))
			{
				updateStatus(Messages.Wizard_Page1_DataCheck_TargetApplication_NoSelection);
				return false;
			}
		
		updateStatus(null);
		return true;
	}

	
	/**
	 * Update the state of the page and display a warning message or an error 
	 * message on the  top of the page.
	 * @param message the message to dispay on the top of the page.
	 */
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	/**
	 * Set value to display in the Text widget _vpShortNameText
	 * @param shortName the new value
	 */
	public void setVpShortName(String shortName){
		_vpShortNameText.setText(shortName);
	}
	
	/**
	 * @return The content of the _vpShortNameText widget 
	 */
	public String getVpShortName(){
		return _vpShortNameText.getText();
	}
}
