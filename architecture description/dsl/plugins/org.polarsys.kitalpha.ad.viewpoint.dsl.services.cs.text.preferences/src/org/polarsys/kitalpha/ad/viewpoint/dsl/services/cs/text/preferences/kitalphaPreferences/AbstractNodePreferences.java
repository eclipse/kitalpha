/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.preferences.kitalphaPreferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * 
 * @author Faycal ABKA
 *
 */
public abstract class AbstractNodePreferences extends PreferencePage implements
		IWorkbenchPreferencePage {
	
	
	protected Control createContentsWithTitle(Composite parent, String title){
		Composite bar = new Composite(parent, SWT.NONE);
		bar.setLayoutData(new GridData(GridData.FILL_BOTH));
		bar.setLayout(new GridLayout(2, false));
		Label label = new Label(bar, SWT.NONE);
		label.setLayoutData(new GridData());
		label.setText(title);
		return bar;
	}
	
	
	@Override
	public void init(IWorkbench workbench) {

	}

	@Override
	protected Control createContents(Composite parent) {
		return null;
	}

}
