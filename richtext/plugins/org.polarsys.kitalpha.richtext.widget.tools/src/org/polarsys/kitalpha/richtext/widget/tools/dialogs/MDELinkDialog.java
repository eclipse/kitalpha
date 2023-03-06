/*******************************************************************************
 * Copyright (c) 2023 Thales Global Services S.A.S.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.osgi.util.NLS;
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
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.tools.manager.LinkManager;
import org.polarsys.kitalpha.richtext.widget.tools.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Constants;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

public class MDELinkDialog extends MDEOkCancelDialog implements IEncodedURLHandler {

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

  protected Composite informationArea;

  protected Label messageImageLabel1;

  protected Label messageLabel1;

  protected EObject element;
  protected String defaultLabel;
  protected String encodedURL;
  protected String dialogName;

  public MDELinkDialog(Shell parentShell, EObject element, String defaultLabel, LinkManager linkManager) {
    super(parentShell);
    this.linkManager = linkManager;
    this.element = element;
    this.defaultLabel = defaultLabel;
    this.basePath = MDERichTextHelper.getProjectPath(element);
  }

  public MDELinkDialog(Shell parentShell, EObject element, String defaultLabel, String dialogName,
      LinkManager linkManager) {
    this(parentShell, element, defaultLabel, linkManager);
    this.dialogName = dialogName;
  }

  @Override
  protected Control createDialogArea(Composite parent) {

    Composite mainComposite = (Composite) super.createDialogArea(parent);
    mainComposite.setLayout(new GridLayout());

    Composite composite = new Composite(mainComposite, SWT.NONE);
    composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
    GridLayout gridLayout = new GridLayout();
    gridLayout.numColumns = 3;
    composite.setLayout(gridLayout);

    createUrlLabel(composite);
    createDisplayTextURL(composite);
    createListLinksType(composite);
    createBrowserButton(composite);

    updateButtonsState();

    String selectedText = getDefaultLabel();
    if (selectedText != null) {
      urlDisplayNameText.setText(selectedText);
    }
    createMessagePart(mainComposite);
    super.getShell().setText(getDialogName());

    return composite;
  }

  protected void createMessagePart(Composite parent) {
    Composite composite = new Composite(parent, SWT.NONE);
    composite.setLayout(new GridLayout(2, false));

    messageImageLabel1 = new Label(composite, SWT.NONE);
    messageImageLabel1.setImage(JFaceResources.getImage(DLG_IMG_MESSAGE_WARNING));
    messageLabel1 = new Label(composite, SWT.WRAP);
    messageLabel1
        .setText("Choice not recommended if you want to share information and collaborate.\nUse URL link instead.");

    updateHeaderMessages();
  }

  protected void updateHeaderMessages() {

    String selectedItem = linkTypeCombo.getItem(linkTypeCombo.getSelectionIndex());
    boolean displayWarning = Constants.FILE_LABEL.equals(selectedItem)
        || Constants.FILE_LOCAL_LABEL.equals(selectedItem);
    messageImageLabel1.setVisible(displayWarning);
    messageLabel1.setVisible(displayWarning);

    this.getShell().layout(true, true);
  }

  private void createBrowserButton(Composite composite) {
    browseButton = new Button(composite, SWT.PUSH);
    browseButton.setLayoutData(new GridData());
    browseButton.setText(Messages.RichTextWidget_Dialog_Add_Link_Browse);
    browseButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent event) {
        Tuple<String, String> path = null;
        path = linkManager.getURI(linkType, basePath, getElement());

        if (path != null) {
          String path2Object = path.getFirst();
          String objectLabel = path.getSecond();
          if (path2Object != null) {
            if (Constants.FILE_LABEL.equals(linkType)) {
              path2Object = path2Object.replace("\\", "/");
            }
            urlText.setText(path2Object);
          }
          urlDisplayNameText.setText(objectLabel != null ? objectLabel : "");
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
      @Override
      @SuppressWarnings("synthetic-access")
      public void widgetSelected(SelectionEvent event) {
        linkType = itemsLinkList[linkTypeCombo.getSelectionIndex()];
        updateButtonsState();
        if (Constants.URL_LABEL.equals(linkType)) {
          urlDisplayNameText.setText(getDefaultLabel());
        } else {
          urlDisplayNameText.setText(""); //$NON-NLS-1$
        }
        urlText.setText(""); //$NON-NLS-1$
        updateHeaderMessages();
      }

      @Override
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
      @Override
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
    getOK().setEnabled(urlText.getText().trim().length() > 0);
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
      setEncodedURL(linkManager.encode(linkType, url, urlDisplayName));
    }

    urlText.setText(""); //$NON-NLS-1$
    super.okPressed();
  }

  protected EObject getElement() {
    return element;
  }

  protected String getDefaultLabel() {
    return defaultLabel;
  }

  @Override
  public String getEncodedURL() {
    return encodedURL;
  }

  protected void setEncodedURL(String url) {
    encodedURL = url;
  }

  protected String getText(EObject obj) {
    if (null == obj) {
      return null;
    }
    AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain
        .getEditingDomainFor(obj);
    // Precondition.
    if (null == editingDomain) {
      return null;
    }
    IItemLabelProvider provider = (IItemLabelProvider) editingDomain.getAdapterFactory().adapt(obj,
        IItemLabelProvider.class);
    String label = "";

    if (null != provider) {
      label = provider.getText(obj);
    }
    return label;
  }

  protected String getDialogName() {
    if (dialogName == null) {
      String modelElementLabel = getText(getElement());
      dialogName = NLS.bind(Messages.RichTextWidget_Dialog_Edit_Link, modelElementLabel);
    }
    return dialogName;
  }

  protected void updateButtonsState() {
    browseButton.setEnabled(!Constants.URL_LABEL.equals(linkType));
    urlLabel.setEnabled(Constants.URL_LABEL.equals(linkType) || Constants.FILE_LABEL.equals(linkType)
        || Constants.FILE_LOCAL_LABEL.equals(linkType));
    urlText.setEnabled(Constants.URL_LABEL.equals(linkType) || Constants.FILE_LABEL.equals(linkType)
        || Constants.FILE_LOCAL_LABEL.equals(linkType));
  }

  @Override
  public boolean handle() {
    int result = open();
    return result == Dialog.OK;
  }
}
