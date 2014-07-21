/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.ui.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.service.prefs.BackingStoreException;
import org.polarsys.kitalpha.emde.extension.preferences.EmdePreferences;
import org.polarsys.kitalpha.emde.extension.utils.Log;

/**
 * @author Thomas Guiu
 */

public class EmdePreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	private boolean isDirty;
	private Button forceGenerationButton;

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Control createContents(Composite parent) {
		Composite bar = new Composite(parent, SWT.NONE);
		bar.setLayoutData(new GridData(GridData.FILL_BOTH));
		bar.setLayout(new GridLayout(2, false));

		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		forceGenerationButton = new Button(bar, SWT.CHECK);
		forceGenerationButton.setText("Force generation using eMDE");
		forceGenerationButton.setData(EmdePreferences.FORCE_GENERATION_KEY);
		forceGenerationButton.setLayoutData(gd);
		forceGenerationButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				setDirty(true);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		loadData();
		return bar;
	}

	public void createControl(Composite parent) {
		super.createControl(parent);
		updateButtons();
	}

	@Override
	protected void performApply() {
		try {
			EmdePreferences.getInstancePreferences().putBoolean(EmdePreferences.FORCE_GENERATION_KEY, forceGenerationButton.getSelection());
			EmdePreferences.getInstancePreferences().flush();
			setDirty(false);
		} catch (BackingStoreException e) {
			Log.getDefault().logError(e);
		}
	}

	@Override
	public boolean performCancel() {
		performDefaults();
		return super.performCancel();
	}

	@Override
	protected void performDefaults() {
		if (!isDirty)
			return;
		loadData();
		setDirty(false);
	}

	@Override
	public boolean performOk() {
		performApply();
		return super.performOk();
	}

	protected void loadData() {
		forceGenerationButton.setSelection(EmdePreferences.getInstancePreferences().getBoolean(EmdePreferences.FORCE_GENERATION_KEY, false));
	}

	protected void setDirty(boolean dirty) {

		if (isDirty == dirty)
			return;
		isDirty = dirty;
		updateButtons();
	}

	private void updateButtons() {
		getApplyButton().setEnabled(isDirty && isValid());
		getDefaultsButton().setEnabled(isDirty);
	}

}
