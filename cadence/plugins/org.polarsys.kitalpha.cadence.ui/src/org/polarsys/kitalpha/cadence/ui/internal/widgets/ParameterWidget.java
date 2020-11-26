/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ParameterWidget {
	
	
	private Text description;
	private Button details;
	
	
 public Button getDetails() {
		return details;
	}

	public void setDetails(Button details) {
		this.details = details;
	}

public String getDescription() {
		return description.getText();
	}

	public void setDescription(String value) {
		this.description.setText(value);
	}

public ParameterWidget(Composite parent){
	 	Group group = new Group(parent, SWT.NONE);
		group.setText("Selected Activity");
		group.setLayout(new GridLayout(2, false));
		
		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL);
		gd.grabExcessVerticalSpace = true;
		gd.grabExcessHorizontalSpace = true;
		
		group.setLayoutData(gd);
	 
		Label label = new Label(group,SWT.NONE);
		label.setText("Description:");
		
		new Label(group, SWT.NONE);
		
		description = new Text(group, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
		description.setEditable(false);
		
		gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL);
		gd.grabExcessVerticalSpace = true;
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan = 1;
		
		description.setLayoutData(gd);
		
		new Label(group, SWT.NONE);
	
		details = new Button(group, SWT.PUSH);
		details.setText("Edit details ...");
		
		GridData gd_button = new GridData();
		gd_button.horizontalAlignment = SWT.RIGHT;
		details.setLayoutData(gd_button);
 }
}
