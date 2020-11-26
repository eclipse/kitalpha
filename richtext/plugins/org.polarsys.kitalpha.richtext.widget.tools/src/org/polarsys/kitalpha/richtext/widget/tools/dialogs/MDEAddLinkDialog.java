/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
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

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
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
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.tools.manager.LinkManager;
import org.polarsys.kitalpha.richtext.widget.tools.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Constants;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

public class MDEAddLinkDialog extends MDEOkCancelDialog {
	
	protected MDERichTextWidget richText;

	protected Text urlText;

	protected String basePath;

	protected Composite composite;

	protected Label urlLabel;

	protected Text urlDisplayNameText;

	protected Label urlDisplayNameLabel;

	protected Combo linkTypeCombo;

	protected Button browseButton;

	protected String linkType;
	
	protected LinkManager linkManager;


	public MDEAddLinkDialog(Shell parentShell, MDERichTextWidget richText, LinkManager linkManager) {
		super(parentShell);
		this.linkManager = linkManager;
		this.richText = richText;
		this.basePath = MDERichTextHelper.getProjectPath(richText.getElement());
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite composite = (Composite) super.createDialogArea(parent);
		GridLayout gridLayout = (GridLayout) composite.getLayout();
		gridLayout.numColumns = 3;
		
		createUrlLabel(composite);
		createDisplayTextURL(composite);
		createListLinksType(composite);
		createBrowserButton(composite);

		String selectedText = richText.getSelectedText();
		if (selectedText != null){
			urlDisplayNameText.setText(selectedText);
		}

		super.getShell().setText(Messages.RichTextWidget_Dialog_Add_Link);

		return composite;
	}

	private void createBrowserButton(Composite composite) {
		browseButton = new Button(composite, SWT.PUSH);
		browseButton.setLayoutData(new GridData());
		browseButton.setText(Messages.RichTextWidget_Dialog_Add_Link_Browse);
		browseButton.setEnabled(false);
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Tuple<String, String> path = null;
				path = linkManager.getURI(linkType, basePath, richText.getElement());
				
				if (path != null){
					String path2Object = path.getFirst();
					String objectLabel = path.getSecond();
					if (path2Object != null){
            if (Constants.FILE_LABEL.equals(linkType)) {
              path2Object = path2Object.replace("\\", "/");
            }
						urlText.setText(path2Object);
					}
					urlDisplayNameText.setText(objectLabel != null? objectLabel: "");
				}
			}
		});
		browseButton.moveAbove(urlDisplayNameLabel);
	}

	private void createListLinksType(Composite composite) {
		linkTypeCombo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		GridData comboGridData = new GridData(GridData.FILL_HORIZONTAL);
		comboGridData.horizontalSpan = 2;
		linkTypeCombo.setLayoutData(comboGridData);
		
		final String[] itemsLinkList = linkManager.getAllLinkLabels().toArray(new String[0]);
		
		linkTypeCombo.setItems(itemsLinkList);
		linkType = itemsLinkList[0];
		linkTypeCombo.setText(linkType);
		linkTypeCombo.addSelectionListener(new SelectionListener() {
			@SuppressWarnings("synthetic-access")
			public void widgetSelected(SelectionEvent event) {
				linkType = itemsLinkList[linkTypeCombo.getSelectionIndex()];
				browseButton.setEnabled(!Constants.URL_LABEL.equals(linkType));
				urlLabel.setEnabled(Constants.URL_LABEL.equals(linkType) || Constants.FILE_LABEL.equals(linkType) || Constants.FILE_LOCAL_LABEL.equals(linkType));
				urlText.setEnabled(Constants.URL_LABEL.equals(linkType) ||  Constants.FILE_LABEL.equals(linkType) || Constants.FILE_LOCAL_LABEL.equals(linkType));
				if (Constants.URL_LABEL.equals(linkType)) {
					urlDisplayNameText.setText(richText.getSelectedText());
				} else {
					urlDisplayNameText.setText(""); //$NON-NLS-1$
				}
				urlText.setText(""); //$NON-NLS-1$
			}

			public void widgetDefaultSelected(SelectionEvent event) {
				// do nothing
			}
		});
		
		linkTypeCombo.moveAbove(urlLabel);
	}

	private void createDisplayTextURL(Composite composite) {
		
		urlDisplayNameLabel = new Label(composite, SWT.NONE);
		urlDisplayNameLabel.setText(Messages.RichTextWidget_Dialog_Add_Link_URL_Display);
		
		urlDisplayNameText = new Text(composite, SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, false).hint(300, SWT.DEFAULT).applyTo(urlDisplayNameText);

		Label linkTypeLabel = new Label(composite, SWT.NONE);
		linkTypeLabel.setText(Messages.RichTextWidget_Dialog_Add_Link);
		linkTypeLabel.moveAbove(urlLabel);
	}

	private void createUrlLabel(Composite composite) {
		urlLabel = new Label(composite, SWT.NONE);
		urlLabel.setText("URL");
		urlText = new Text(composite, SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, false).hint(300, SWT.DEFAULT).applyTo(urlText);
		urlText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if (getOK() != null) {
					getOK().setEnabled(urlText.getText().trim().length() > 0);
				}
			}
		});
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}
	
	@Override
	protected void okPressed() {
		String url = urlText.getText();
		if (url != null && url.length() > 0) {
			String urlDisplayName = urlDisplayNameText.getText();
			if (urlDisplayName.trim().length() == 0) {
				urlDisplayName = url;
			}
			String encodedURL = linkManager.encode(linkType, url, urlDisplayName);
			richText.insertRawText(encodedURL);
		}

		urlText.setText(""); //$NON-NLS-1$
		super.okPressed();
		richText.forceFocus();
	}

}
