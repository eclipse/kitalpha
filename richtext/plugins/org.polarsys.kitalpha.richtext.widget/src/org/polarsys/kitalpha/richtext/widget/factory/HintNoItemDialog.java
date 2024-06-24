/*******************************************************************************
 * Copyright (c) 2017, 2023 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.richtext.widget.factory;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.PreferencesUtil;

public class HintNoItemDialog extends Dialog {
	public HintNoItemDialog(Shell parentShell)
	{
		super(parentShell);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		Shell parentShell = parent.getShell();
		
		parentShell.setImage(Display.getDefault().getSystemImage(SWT.ICON_WARNING));
		parentShell.setText("Warning");
		
		Label message = new Label(container, 0);
		message.setText("All RichText editor items are disabled");
		
		Link preferencePageLink = new Link(container, 0);
		preferencePageLink.setText("You can activate some in <a>preference page</a>");
		
	    SelectionAdapter adapter = new SelectionAdapter() {
	        @Override
	        public void widgetSelected(final SelectionEvent e) {
	            PreferenceDialog preferenceDialog = PreferencesUtil.createPreferenceDialogOn(
	            		Display.getDefault().getActiveShell(),
	            		"org.polarsys.kitalpha.richtext.widget.configurable.preferences.ui.page",
	            		null,
	            		null);
	            if (preferenceDialog != null) {
	                preferenceDialog.open();
	            }
	        }
	    };
	    preferencePageLink.addSelectionListener(adapter);
		return container;
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}
}
