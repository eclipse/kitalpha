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

package org.polarsys.kitalpha.model.attachment.ui;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelPage extends AbstractWizardPage {

	public static final String NAME = "modelpage";

	private static final String[] USAGES = { "Source", "Target", "Ancestor" };

	private final Text[] models = new Text[3];
	private final Combo[] usages = new Combo[3];

	private IFile[] files;

	private SelectionListener validationListener = new SelectionListener() {
		public void widgetSelected(SelectionEvent e) {
			updateStatus(null);
			for (int n = 0; n < 3; n++) {
				if (!usages[n].getText().equals(USAGES[2]) && files[n] == null)
					updateStatus(NLS.bind(Messages.wizard_page_error1, usages[n].getText()));
			}
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}

	};
	private SelectionListener listener = new SelectionListener() {

		@Override
		public void widgetSelected(SelectionEvent e) {
			Combo w = (Combo) e.widget;
			String t = w.getText();
			Set<String> set = new HashSet<String>(Arrays.asList(USAGES));
			for (Combo c : usages) {
				set.remove(c.getText());
			}
			String unbinded = (String) set.toArray()[0];
			System.out.println();
			for (Combo c : usages) {
				if (!c.equals(w) && t.equals(c.getText()))
					c.setText(unbinded);
			}
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	};

	protected ModelPage(List<IFile> files) {
		super(NAME);
		this.files = files.toArray(new IFile[3]);
		setTitle(Messages.wizard_page_title);
		setDescription(Messages.wizard_page_description);
	}

	protected void createModelControls(Composite container2, int index) {
		Text sourceText = new Text(container2, SWT.BORDER);
		sourceText.setEditable(false);
		if (files[index] != null)
			sourceText.setText(files[index].getFullPath().toString());
		sourceText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		models[index] = sourceText;

		Label label = new Label(container2, SWT.None);
		label.setText(Messages.wizard_page_label1);
		label.setLayoutData(new GridData());

		Combo sourceCombo = new Combo(container2, SWT.READ_ONLY | SWT.DROP_DOWN);
		sourceCombo.setLayoutData(new GridData());
		sourceCombo.setItems(USAGES);
		sourceCombo.setText(USAGES[index]);
		sourceCombo.addSelectionListener(listener);
		sourceCombo.addSelectionListener(validationListener);
		sourceCombo.setLayoutData(new GridData());
		usages[index] = sourceCombo;

	}

	protected void createControls(Composite container2) {
		createModelControls(container2, 0);
		createModelControls(container2, 1);
		createModelControls(container2, 2);
		validationListener.widgetSelected(null);
	}

	private IFile getFile(String role) {
		for (int n = 0; n < 3; n++) {
			if (usages[n].getText().equals(role))
				return files[n];
		}
		throw new IllegalStateException(NLS.bind(Messages.wizard_page_error2, role));

	}

	protected IFile getSourceFile() {
		return getFile(USAGES[0]);
	}

	protected IFile getTargetFile() {
		return getFile(USAGES[1]);
	}

	protected IFile getAncestorFile() {
		return getFile(USAGES[2]);
	}

}
