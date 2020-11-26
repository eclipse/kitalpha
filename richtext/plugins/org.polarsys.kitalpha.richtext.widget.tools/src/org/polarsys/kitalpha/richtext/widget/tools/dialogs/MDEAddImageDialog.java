/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.dialogs;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.widget.tools.manager.LinkManager;
import org.polarsys.kitalpha.richtext.widget.tools.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

public class MDEAddImageDialog extends MDEOkCancelDialog {
	
	

	protected Text urlText;
	protected MDERichTextWidget richText;
	protected LinkManager linkManager;
	protected Combo linkTypeCombo;
	protected Button browseButton;

	private String linkType;

	protected ModifyListener urlTextListener = new ModifyListener() {
		@SuppressWarnings("synthetic-access")
		public void modifyText(ModifyEvent e) {
			if (getOK() != null) {
				getOK().setEnabled(urlText.getText().trim().length() > 0);
			}
		}
	};


	public MDEAddImageDialog(Shell parentShell, MDERichTextWidget richText, LinkManager linkManager) {
		super(parentShell);
		this.richText = richText;
		this.linkManager = linkManager;
	}

	@Override
	protected Control createDialogArea(Composite parent_p) {
		Composite parent = (Composite) super.createDialogArea(parent_p);
		GridLayout layout = (GridLayout) parent.getLayout();
		layout.numColumns = 3;

		Label linkTypeLabel = new Label(parent, SWT.NONE);
		linkTypeLabel.setText("Type");

		linkTypeCombo = new Combo(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData comboGridData = new GridData(GridData.FILL_HORIZONTAL);
		comboGridData.horizontalSpan = 2;
		linkTypeCombo.setLayoutData(comboGridData);

		List<String> allLinkLabels = linkManager.getAllLinkLabels();
		final String[] labels = allLinkLabels.toArray(new String[0]);
		linkType = labels.length > 0? labels[0]:"";

		linkTypeCombo.setItems(labels);
		linkTypeCombo.setText(labels[0]);
		linkTypeCombo.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				linkType = labels[linkTypeCombo.getSelectionIndex()];
				urlText.setText(""); //$NON-NLS-1$
			}

			public void widgetDefaultSelected(SelectionEvent event) {
				// do nothing
			}
		});

		Label urlLabel = new Label(parent, SWT.NONE);
		urlLabel.setText("URL");
		urlText = new Text(parent, SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.widthHint = 300;
		urlText.setLayoutData(gridData);
		urlText.addModifyListener(urlTextListener);

		browseButton = new Button(parent, SWT.PUSH);
		browseButton.setLayoutData(new GridData());
		browseButton.setText("Browse");
		browseButton.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent event) {
				Tuple<String, String> path = linkManager.getURI(linkType, null,richText.getElement());
				if (path != null){
					String first = path.getFirst();
					if (first != null){
						urlText.setText(first);
					}
				}
			}
		});
		
		super.getShell().setText(Messages.RichTextWidget_Dialog_Add_Image);
		
		return parent;
	}

	@Override
	protected void okPressed() {
		String text = urlText.getText();
		String image = linkManager.encode(linkType, text, null);
		richText.insertRawText(image);
		super.okPressed();
		richText.forceFocus();
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		getOK().setEnabled(false);
	}

}
