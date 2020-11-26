/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.internal.widgets;


import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import org.polarsys.kitalpha.cadence.ui.providers.CadenceContentProvider;
import org.polarsys.kitalpha.cadence.ui.providers.CadenceLabelProvider;

/**
 * @author Guillaume Gebhart
 * 
 */
public class ActivitiesWidget {

  private ListViewer viewer = null;
  Button addButton = null, removeButton = null, upButton = null, downButton = null;

  public ActivitiesWidget(Composite composite) {
	 Label description =  new Label(composite, SWT.NONE);
	 description.setText("Selected Activities :");
	 Font font = description.getFont();
	 FontData data = font.getFontData()[0];
	 data.setStyle(SWT.BOLD);
	 Font boldFont = new Font(font.getDevice(),data);
	 description.setFont(boldFont);
	 
	 new Label(composite, SWT.NONE);
    viewer = new ListViewer(composite);

    GridData gd = new GridData(GridData.FILL_BOTH);
    initViewer(gd);

    Composite pushComposite = new Composite(composite, SWT.NONE);
    GridLayout pushLayout = new GridLayout(1, true);
    pushComposite.setLayout(pushLayout);
    pushLayout.marginLeft = pushLayout.marginTop = pushLayout.marginRight = pushLayout.marginBottom = 0;
    gd = new GridData(GridData.FILL_BOTH);
    gd.widthHint = 50;

    addButton = createAddButton(pushComposite, gd);
    removeButton = createRemoveButton(pushComposite, gd);
    upButton = createUpButton(pushComposite, gd);
    downButton = createDownButton(pushComposite, gd);

  }

  private Button createDownButton(Composite pushComposite, GridData gd) {
    Button button = new Button(pushComposite, SWT.PUSH);
    button.setText("Down"); //$NON-NLS-1$
    button.setLayoutData(gd);
    return button;
  }

  private Button createUpButton(Composite pushComposite, GridData gd) {
    Button button = new Button(pushComposite, SWT.PUSH);
    button.setText("Up"); //$NON-NLS-1$
    button.setLayoutData(gd);
    return button;
  }

  private Button createRemoveButton(Composite pushComposite, GridData gd) {
    Button button = new Button(pushComposite, SWT.PUSH);
    button.setText("Remove"); //$NON-NLS-1$
    button.setLayoutData(gd);
    return button;
  }

  private Button createAddButton(Composite composite, GridData gd) {

    Button button = new Button(composite, SWT.PUSH);
    button.setText("Add"); //$NON-NLS-1$
    button.setLayoutData(gd);
    return button;
  }

  private void initViewer(GridData gd) {
    gd.heightHint = 100;
    gd.grabExcessVerticalSpace = false;
    viewer.getList().setLayoutData(gd);
    CadenceLabelProvider labelProvider = new CadenceLabelProvider();
    viewer.setContentProvider(new CadenceContentProvider());
    viewer.setLabelProvider(labelProvider);
  }

  public ListViewer getViewer() {
    return viewer;
  }

  public Button getAddButton() {
    return addButton;
  }

  public Button getRemoveButton() {
    return removeButton;
  }

  public Button getUpButton() {
    return upButton;
  }

  public Button getDownButton() {
    return downButton;
  }
}