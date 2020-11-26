/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.services.preference.ui;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.polarsys.kitalpha.ad.af.dsl.services.preference.Activator;
import org.polarsys.kitalpha.ad.af.dsl.services.preference.helper.AFDslPreferenceConstant;
import org.polarsys.kitalpha.ad.af.dsl.services.preference.internal.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class AFDslPreferencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public AFDslPreferencesPage() {
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
	 * @see FieldEditorPreferencePage#createControl(Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		return super.createContents(parent);
	}

	/**
	 * @see FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		Composite composite = new Composite(getFieldEditorParent(), SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout(1, true));
		
		StringFieldEditor rpnField = new StringFieldEditor(AFDslPreferenceConstant.AF_ROOT_PROJECT_NAME__VALUE, 
														   Messages.AF_RPN_FIELD_LABEL, 
														   composite);
		rpnField.setEmptyStringAllowed(false);
		rpnField.setErrorMessage(Messages.AF_RPN_FIELD_VALUE_ERROR);
		addField(rpnField);
	}

}
