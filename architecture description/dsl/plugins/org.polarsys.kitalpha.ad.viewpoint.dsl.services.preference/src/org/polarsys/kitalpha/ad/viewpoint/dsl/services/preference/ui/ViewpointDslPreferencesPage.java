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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.ui;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.Activator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.helper.ViewpointDslPreferenceConstant;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.internal.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class ViewpointDslPreferencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage{
	
	/**
	 * An instance of {@link IPreferenceStore}
	 */
	private final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
	
	/**
	 * The boolean field that allows to set ROOT_PROJECT_NAME__USE_TA value
	 */
	private BooleanFieldEditor useTAValue;
	
	/**
	 * The boolean field that allows to set ROOT_PROJECT_NAME__VALUE value
	 */
	private StringFieldEditor rpnField;
	
	/**
	 * The container of the root project name preferences fields 
	 */
	private Group group;
	
	/**
	 * Default constructor
	 */
	public ViewpointDslPreferencesPage() {
		super(FieldEditorPreferencePage.GRID);
	}
	
	/**
	 * @see IWorkbenchPreferencePage#init(IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}
	
	/**
	 * @see FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		createGroup();
		
		useTAValue = new BooleanFieldEditor(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__USE_TA, Messages.USE_TA_VALUE_FIELD_LABEL, group);
		addField(useTAValue);
		
		rpnField = new StringFieldEditor(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__VALUE, Messages.RPN_FIELD_LABEL, group);
		rpnField.setEmptyStringAllowed(store.getBoolean(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__USE_TA));
		rpnField.setErrorMessage(Messages.RPN_FIELD_VALUE_ERROR);
		addField(rpnField);
		
		handlePreferencesDefaultValues();
	}
	
	/**
	 * @see FieldEditorPreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		super.performDefaults();
		getPreferenceStore().setDefault(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__USE_TA, true);
		rpnField.setEnabled(false, group);
	}
	
	/**
	 * @see FieldEditorPreferencePage#checkState()
	 */
	@Override
	protected void checkState() {
		rpnField.setEmptyStringAllowed(useTAValue.getBooleanValue());
//		rpnField.load();
		super.checkState();
	}
	
	/**
	 * @see FieldEditorPreferencePage#propertyChange(PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
		if (event.getSource().equals(useTAValue))
		{
			rpnField.setEnabled(! useTAValue.getBooleanValue(), group);
			checkState();
		}
	}
	
	/**
	 * Create the group that will contain preferences fields
	 */
	private void createGroup() {
		group = new Group(getFieldEditorParent(), SWT.NONE);
		group.setText(" Root project name setting ");
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		GridLayout layout = new GridLayout();
		group.setLayoutData(gd);
		group.setLayout(layout);
	}
	
	/**
	 * Handle default values of preferences
	 */
	private void handlePreferencesDefaultValues() {
		Boolean useTAPrefValue = store.getBoolean(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__USE_TA);
		rpnField.setEnabled(! useTAPrefValue, group);
		
		String rpnPrefValue = store.getString(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__VALUE);
		if (rpnPrefValue == null || (rpnPrefValue != null && rpnPrefValue.trim().length() == 0))
			 store.setDefault(ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__VALUE, 
					 ViewpointDslPreferenceConstant.VP_ROOT_PROJECT_NAME__DEFAULT_VALUE);
	}
}
