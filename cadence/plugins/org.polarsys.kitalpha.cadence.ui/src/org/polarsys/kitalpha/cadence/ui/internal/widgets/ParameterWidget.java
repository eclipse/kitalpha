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
	
	/*private TableViewer tableViewer = null;
	 private static final String VALIDATION_STR = "validate"; //$NON-NLS-1$
	  private static final String VALIDATE_TOOLTIP = "Allows to validate refinery parameters"; //$NON-NLS-1$
	private Button validate = null;*/
	
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
		
		
	 
	 
	 
	// tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
	  // initTable(parent);
	  // createValidateButton(parent);
	   
 }

/*private void createValidateButton(Composite parent) {
	// validation button
    validate = new Button(parent, SWT.PUSH);
    validate.setText(VALIDATION_STR);
    validate.setToolTipText(VALIDATE_TOOLTIP);

	
}*/

/*private void initTable(Composite parent) {
	 Table table = tableViewer.getTable();

	    GridData gd = new GridData(GridData.FILL_BOTH);

	    gd.heightHint = 130;
	    gd.widthHint = 100;
	    gd.grabExcessVerticalSpace = false;

	    table.setLayoutData(gd);
	    table.setFont(parent.getFont());
	    String[] columnNames = new String[] { "GenericParameter", "Value" }; //$NON-NLS-1$ //$NON-NLS-2$
	    int[] columnWidths = new int[] { 300, 205 };
	    int[] columnAlignements = new int[] { SWT.LEFT, SWT.CENTER };
	    TableColumn[] tableColumn = new TableColumn[columnNames.length];

	    for (int i = 0; i < columnNames.length; i++) {
	      TableColumn column = new TableColumn(table, columnAlignements[i]);
	      column.setText(columnNames[i]);
	      column.setWidth(columnWidths[i]);
	      tableColumn[i] = column;
	    }

	    table.setHeaderVisible(true);
	    table.setLinesVisible(true);
	    tableViewer.setUseHashlookup(true);
	
	    
	    TableViewerColumn parameters = new TableViewerColumn(tableViewer, tableColumn[0]);
	    TableViewerColumn values = new TableViewerColumn(tableViewer, tableColumn[1]);

	    ColumnParametersLabelProvider providerP = new ColumnParametersLabelProvider();
	    ColumnValuesLabelProvider providerV = new ColumnValuesLabelProvider();

	    parameters.setLabelProvider(providerP);
	    values.setLabelProvider(providerV);
	    
	    ColumnViewerToolTipSupport.enableFor(tableViewer, ToolTip.NO_RECREATE);
	    TableEditingSupport edit = new TableEditingSupport(tableViewer);
	    values.setEditingSupport(edit);

	    	}*/

/*public Button getValidateButton() {
	return validate;
}*/

/*public TableViewer getTableViewer() {
	return tableViewer;
}*/
}
