/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards;

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

/**
 * 
 * @author Amine Lajmi
 *
 */
public abstract class AbstractPropertiesPage extends WizardPage{
	
	private Composite compo = null;
	
	public AbstractPropertiesPage(ISelection selection){
		super(Messages.AbstractPropertiesPage_DefaultFileCreationPage_Title);
	}
	
	public AbstractPropertiesPage(String title){
		super(title);
	}
	
	public AbstractPropertiesPage(ISelection selection, String title){
		super(title);
	}
	
	public AbstractPropertiesPage(){
		super(Messages.AbstractPropertiesPage_DefaultFileCreationPage_Title);
	}
	
	public void createControl(Composite parent) {
		compo = new Composite(parent, SWT.NONE);
		compo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compo.setLayout(new GridLayout(2, false));
	    initializeProperties();
		setControl(compo);
	    dataChanged();
	}

	protected void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	protected Text createTextProperty(String label, String initialValue, boolean editable) {
		Label descriptionProjectName = new Label(compo, SWT.NONE);
		descriptionProjectName.setText(label);
		Text field = new Text(compo, SWT.BORDER | SWT.SINGLE);
		field.setEditable(editable);
		field.setFocus();
		field.setText(initialValue);
		if (editable) {
			field.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dataChanged();
			}
		});
		}
		field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		return field;
	}
	
	protected Combo createComboProperty(String label, String[] inputValues, int defaultItem, boolean editable) {
		Label targetapplicationListLabel = new Label(compo, SWT.NONE);
		targetapplicationListLabel.setText(label);
		Combo field = new Combo (compo, SWT.READ_ONLY);
		field.setItems(inputValues);
		field.select(defaultItem);
		field.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				dataChanged();
			}	
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		return field;
	}
	
	public void setTextProperty(Text field, String value) {
		field.setText(value);
	}
	
	protected abstract void initializeProperties();

	protected abstract boolean dataChanged();
}
