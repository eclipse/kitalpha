/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.extension.points.ParameterizedComposerElement;
import org.polarsys.kitalpha.composer.ui.providers.ColumnParametersLabelProvider;
import org.polarsys.kitalpha.composer.ui.providers.ColumnValuesLabelProvider;
import org.polarsys.kitalpha.composer.ui.providers.ComboContentProvider;
import org.polarsys.kitalpha.composer.ui.providers.ComboLabelProvider;
import org.polarsys.kitalpha.composer.ui.providers.ComboViewerFilter;
import org.polarsys.kitalpha.composer.ui.providers.ITableEditingListener;
import org.polarsys.kitalpha.composer.ui.providers.TableContentProvider;
import org.polarsys.kitalpha.composer.ui.providers.TableEditingSupport;

/**
 * This class manages widget for Composer Launch Configuration dialog.
 * 
 
 */
public class AtomicWidget {

	ComboViewer comboViewer;
	ComboViewerFilter filter;
	TableViewer tableViewer;
	Button button;
	Composite composite;

	private static final String VALIDATION_STR = "validate";
	private static final String VALIDATE_TOOLTIP = "Allows to validate parameters";

	public AtomicWidget(Composite composite) {
		this.composite = composite;
	}

	/**
	 * Creates a table viewer for parameters.
	 * 
	 * @return the created table viewer.
	 */
	public TableViewer createTableViewer(ITableEditingListener listener) {
		tableViewer = new TableViewer(composite, SWT.BORDER
				| SWT.FULL_SELECTION);
		Table table = tableViewer.getTable();

		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 130;
		gd.widthHint = 100;
		gd.grabExcessVerticalSpace = false;

		table.setLayoutData(gd);
		table.setFont(composite.getFont());
		String[] columnNames = new String[] { "Parameter", "Value" };
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
		tableViewer.setContentProvider(new TableContentProvider());

		TableViewerColumn parameters = new TableViewerColumn(tableViewer,
				tableColumn[0]);
		TableViewerColumn values = new TableViewerColumn(tableViewer,
				tableColumn[1]);

		// provider
		ColumnParametersLabelProvider providerP = new ColumnParametersLabelProvider();
		ColumnValuesLabelProvider providerV = new ColumnValuesLabelProvider();

		parameters.setLabelProvider(providerP);
		values.setLabelProvider(providerV);

		TableEditingSupport edit = new TableEditingSupport(tableViewer,
				listener);
		ColumnViewerToolTipSupport.enableFor(tableViewer, ToolTip.NO_RECREATE);
		values.setEditingSupport(edit);

		return tableViewer;
	}

	/**
	 * Creates a combo viewer to select (binding|strategy|refinery|generator).
	 * 
	 * @param filtering
	 *            <code>true</code> if the combo should be filtered.
	 * @return
	 */
	public ComboViewer createComboViewer(boolean filtering) {
		comboViewer = new ComboViewer(composite, SWT.RIGHT | SWT.DROP_DOWN
				| SWT.READ_ONLY);
		final Combo combo = comboViewer.getCombo();
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan = 1;
		combo.setLayoutData(gd);
		comboViewer.setUseHashlookup(true);
		comboViewer.setContentProvider(new ComboContentProvider());
		comboViewer.setLabelProvider(new ComboLabelProvider());

		comboViewer.setSorter(new ViewerSorter());
		if (filtering) {
			filter = new ComboViewerFilter(comboViewer);
			comboViewer.setFilters(new ViewerFilter[] { filter });
		}
		return comboViewer;
	}

	public Text createText(Composite composite) {
		Text text = new Text(composite, SWT.BORDER | SWT.SINGLE);

		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan = 1;
		text.setLayoutData(gd);
		return text;
	}

	/**
	 * Creates a validate button.
	 * 
	 * @return the created button.
	 */
	public Button createValidationButton() {
		Button button = createButton(composite, VALIDATION_STR,
				VALIDATE_TOOLTIP);
		return button;
	}

	/**
	 * Creates a button.
	 * 
	 * @param composite
	 *            the composite parent.
	 * @param text
	 *            the text of the button.
	 * @param tooltip
	 *            the tooltip.
	 * @return the created button.
	 */
	public Button createButton(Composite composite, String text, String tooltip) {
		Button button = new Button(composite, SWT.PUSH);
		button.setText(text);
		button.setToolTipText(tooltip);
		return button;
	}

	/**
	 * Creates a button.
	 * 
	 * @param composite
	 *            the composite parent.
	 * @param text
	 *            the text of the button.
	 * @param tooltip
	 *            the tooltip.
	 * @return the created button.
	 */
	public Button createRadioButton(Composite composite, String text, String tooltip) {
		Button button = new Button(composite, SWT.RADIO);
		button.setText(text);
		button.setToolTipText(tooltip);
		return button;
	}
	
	/**
	 * Creates a label with the given text.
	 * 
	 * @param text
	 *            the text of the label.
	 * @return the created label.
	 */
	public Label createLabel(String text) {
		Label label = new Label(composite, SWT.LEFT);
		label.setText(text);
		return label;
	}
	

	/**
	 * Creates an empty label.
	 */
	public Label createEmptyLabel(boolean span) {
		
		return createEmptyLabel(span, SWT.NONE);
	}
	
	/**
	 * Creates an empty label.
	 */
	public Label createEmptyLabel(boolean span, int style) {
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		if(span)
			gd.horizontalSpan = 2;
		
		Label label =  new Label(composite, style);
		label.setLayoutData(gd);
		return label;
	}
	
	

	/**
	 * Sets the allocation NsURI.
	 * 
	 * @param uri
	 *            the selected allocation NsURI.
	 */
	public void setNsUri(String uri) {
		filter.setNsUri(uri);
		comboViewer.refresh();
	}

	/**
	 * Initializes the combo viewer with the given selected string.
	 * 
	 * @param match
	 *            the selected string (name of
	 *            binding|strategy|refinery|generator).
	 */
	public int initializeComboViewer(String match) {
		int index = 0;
		Combo combo = comboViewer.getCombo();
		for (int item = 0; item < combo.getItems().length; item++) {
			if (combo.getItem(item).equals(match)){
				index = item;
				combo.select(item);
			}
		}
		
		
		return index;
	}

	
	public void intializeDescription(Label description, int index) {
		Object obj = comboViewer.getElementAt(index);
		if(obj != null){
			IConfigurationElement element =(IConfigurationElement)obj;
			String d = (String)element.getAttribute(CodeManagerExtensions.ATT_DESCRIPTION);
			description.setText(d);
		}
		
	}
	/**
	 * Sets the selection of the combo box.
	 * 
	 * @param o
	 *            the selected object.
	 */
	public void setComboSelection(Object o) {
		ISelection selection = new StructuredSelection(o);
		comboViewer.setSelection(selection);
	}

	/**
	 * Returns the map of parameters from the table.
	 * 
	 * @return the map of parameters.
	 */
	@SuppressWarnings("unchecked")
	public Map<String, String> getMapFromTable() {

		Collection<Parameter> parameters = (Collection<Parameter>) tableViewer
				.getInput();

		Map<String, String> params = new HashMap<String, String>();
		if (parameters != null) {
			for (Parameter p : parameters) {
				params.put(p.getName(), p.getValue());
			}
		}

		return params;

	}

	/**
	 * Converts a map of string to a map of parameters.
	 * 
	 * @param map
	 *            the map of string.
	 * @param reference
	 *            composer element.
	 * @return the map of parameters.
	 */
	public Map<String, Parameter> buildMapFromString(
			final Map<String, String> map,
			ParameterizedComposerElement reference) {

		Map<String, Parameter> goodMap = null;

		if (reference != null) {
			goodMap = reference.getParameters();
			if (goodMap != null) {
				Set<String> params = goodMap.keySet();

				for (String param : params) {
					if (!map.containsKey(param)) {
						//
						// It's a new parameter
						Parameter parameter = goodMap.get(param);
						map.put(param, parameter.getValue());
					} else {
						String stringValue = (String) map.get(param);
						Parameter parametersValue = goodMap.get(param);
						parametersValue.setName(param);
						parametersValue.setValue(stringValue);
						goodMap.put(param, parametersValue);
					}
				}
			}
		}
		return goodMap;
	}

	

}
