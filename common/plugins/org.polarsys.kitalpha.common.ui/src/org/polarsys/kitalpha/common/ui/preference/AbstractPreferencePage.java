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
package org.polarsys.kitalpha.common.ui.preference;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.osgi.service.prefs.BackingStoreException;

public abstract class AbstractPreferencePage extends PreferencePage {

	private boolean isDirty;

	public AbstractPreferencePage() {
		super();
	}

	public AbstractPreferencePage(String title) {
		super(title);
	}

	public AbstractPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
	}

	public void init(IWorkbench workbench) {
	}

	protected abstract void loadData();

	protected abstract void doApply() throws BackingStoreException;

	protected abstract void addContents(Composite parent);

	@Override
	protected void performApply() {
		try {
			doApply();
			setDirty(false);
		} catch (BackingStoreException e) {
			MessageDialog.openError(getShell(), "Error", e.getMessage());
		}
	}

	@Override
	public boolean performCancel() {
		performDefaults();
		return super.performCancel();
	}

	@Override
	protected void performDefaults() {
		if (!isDirty) {
			return;
		}
		loadData();
		setDirty(false);
	}

	@Override
	public boolean performOk() {
		performApply();
		return super.performOk();
	}

	protected void setDirty(boolean dirty) {

		if (isDirty == dirty) {
			return;
		}
		isDirty = dirty;
		updateButtons();
	}

	protected void updateButtons() {
		getApplyButton().setEnabled(isDirty && isValid());
		getDefaultsButton().setEnabled(isDirty);
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite bar = new Composite(parent, SWT.NONE);
		bar.setLayoutData(new GridData(GridData.FILL_BOTH));
		bar.setLayout(new GridLayout(2, false));

		addContents(bar);

		loadData();
		return bar;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		updateButtons();
	}

	public final class DirtyManagerSelectionListener implements SelectionListener {

		protected void doWidgetSelected(SelectionEvent e) {

		}

		@Override
		public final void widgetSelected(SelectionEvent e) {
			setDirty(true);
			doWidgetSelected(e);
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	}

}