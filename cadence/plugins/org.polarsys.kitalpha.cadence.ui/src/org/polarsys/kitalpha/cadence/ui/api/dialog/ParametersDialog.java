/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.api.dialog;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;

/**
 * @author Guillaume Gebhart
 *
 */
public class ParametersDialog extends SelectionDialog {
	

    private TableViewerColumn values;
    private Object container;
    private final IParameterManager manager;
    private Text descriptionArea, validityArea;
    
    

	private TableViewer tableViewer;

    
    private int widthInChars = 100;
   
    private int vwidthInChars = 10;

    private int heightInChars = 50;

    EditingSupport edit;
	private IStructuredContentProvider contentProvider;

	private CellLabelProvider parameterLabelProvider;

	private CellLabelProvider valueLabelProvider;

	
	public ParametersDialog(Shell parent, 
			IStructuredContentProvider content_p,
			ColumnLabelProvider parameter_p, 
			ColumnLabelProvider value_p,
			IParameterManager manager_p) {
		
		super(parent);
		this.contentProvider = content_p;
		this.parameterLabelProvider = parameter_p;
		this.valueLabelProvider = value_p;
		this.manager = manager_p;
		
		setTitle("Parameters Configuration");
		
	}

	 @Override
	protected Control createDialogArea(Composite container) {
		 Composite  parent = (Composite)super.createDialogArea(container);
		 
		 GridData gd = new GridData(GridData.FILL_BOTH);
	        gd.heightHint = convertHeightInCharsToPixels(heightInChars/4);
	        gd.widthHint = convertWidthInCharsToPixels(widthInChars);
	       
	        
	        tableViewer = new TableViewer(parent, getStyle());
		 Table table = tableViewer.getTable();
		 table.setLayoutData(gd);
	       table.setFont(container.getFont());
		
			String[] columnNames = new String[] { "Name", "Value", "Validity" };
			int vsize = convertWidthInCharsToPixels(vwidthInChars);
			int size = convertWidthInCharsToPixels((widthInChars-vwidthInChars)/2);
			int[] columnWidths = new int[] { size,size,vsize};
			int[] columnAlignements = new int[] { SWT.LEFT, SWT.CENTER, SWT.CENTER };
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
			tableViewer.setContentProvider(contentProvider);

			TableViewerColumn parameters = new TableViewerColumn(tableViewer,
					tableColumn[0]);
			 values = new TableViewerColumn(tableViewer,
					tableColumn[1]);
			TableViewerColumn validity = new TableViewerColumn(tableViewer,
					tableColumn[2]);
			
			// provider
			CellLabelProvider providerP = parameterLabelProvider;
			CellLabelProvider providerV = valueLabelProvider;
			CellLabelProvider providerVa = new ColumnValidityLabelProvider(this, manager);

			parameters.setLabelProvider(providerP);
			values.setLabelProvider(providerV);
			validity.setLabelProvider(providerVa);
			
			
			ColumnViewerToolTipSupport.enableFor(tableViewer, ToolTip.NO_RECREATE);
			
		 
			Group group = new Group(parent, SWT.NONE);
			group.setText("Selected parameter");
			
			group.setLayout(new GridLayout(2, false));
			
			gd = new GridData();
			gd = new GridData(GridData.FILL_BOTH);
	        gd.heightHint = convertHeightInCharsToPixels(heightInChars);
	        gd.widthHint = convertWidthInCharsToPixels(widthInChars);
			group.setLayoutData(gd);
			
			Label label = new Label(group, SWT.NONE);
			label.setText("Description");
			descriptionArea = new Text(group,SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
			descriptionArea.setEditable(false);
			gd.heightHint = convertHeightInCharsToPixels(10);
			
			descriptionArea.setLayoutData(gd);
			
			
			group = new Group(parent, SWT.NONE);
			group.setText("Validation");
			group.setLayout(new GridLayout(2, false));
			
			label = new Label(group, SWT.NONE);
			label.setText("Message(s)");
			validityArea = new Text(group,SWT.MULTI | SWT.READ_ONLY| SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
			validityArea.setLayoutData(gd);
			descriptionArea.setEditable(false);
			
			tableViewer.addSelectionChangedListener(
					new ParameterTableSelectionChangedListener(
					tableViewer, descriptionArea));
			
			
			
			
		 return parent;
	 }

	private int getStyle() {
		return SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL;
	}
	
	public void setInput(Object input){
		tableViewer.setInput(input);
	}

	public Object  getInput(){
		return tableViewer.getInput();
	}

	public Object getContainer() {
		return container;
	}

	public void setContainer(Object container) {
		this.container = container;
	}
	
	public String getDescription() {
		return descriptionArea.getText();
	}

	public void setDescription(String text_p) {
		this.descriptionArea.setText(text_p);
	}

	public String getValidity() {
		return validityArea.getText();
	}

	public void setValidity(String text_p) {
		this.validityArea.setText(text_p);
	}
	
	
	protected  class ParameterTableSelectionChangedListener implements
	ISelectionChangedListener {

private TableViewer viewer;
private Text text; 

public ParameterTableSelectionChangedListener(
		TableViewer viewer, Text text) {
	this.viewer = viewer;
	this.text = text;
}

@Override
public void selectionChanged(SelectionChangedEvent event) {
	ISelection selection = viewer.getSelection();
	if (selection instanceof IStructuredSelection) {
		Object o = ((IStructuredSelection) selection).getFirstElement();
			
			String string = manager.getDescription(o) == null ? "Parameter "
					+ manager.getName(o)
					: manager.getDescription(o);
			text.setText(string);
		}
	}
}
	
	public void setEditingSupport(EditingSupport editing){
		values.setEditingSupport(editing);
	}
	
	public TableViewer getViewer(){
		return tableViewer;
	}
	
	
	public Map<String, String> getMapFromParametersTable() {

	    Map<String, String> params = new HashMap<String, String>();
	    TableItem[] items = tableViewer.getTable().getItems();

	    for (TableItem item : items) {
	      params.put(item.getText(0), item.getText(1));
	    }
	    return params;

	  }
}
