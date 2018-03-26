/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.dialog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.sirius.business.api.query.ViewpointQuery;
import org.eclipse.sirius.common.ui.tools.api.util.SWTUtil;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

/**
 * Derivated from org.eclipse.sirius.ViewpointSelection Add feature to disable
 * state changing for Sirius viewpoint managed by AF
 * 
 * @author Thomas Guiu
 * 
 */
public class ViewpointSelectionDialog extends TitleAreaDialog {

	private static final String DEFAULT_MESSAGE = "Change viewpoints selection status (see tooltip for details about each viewpoint)";

	public static final String[] COLUMNS = { " ", "icon", "Viewpoint" };

	private final SortedMap<Viewpoint, Boolean> viewpointsMap;
	private final Map<Viewpoint, Boolean> originalViewpointsMap = new HashMap<Viewpoint, Boolean>();

	public ViewpointSelectionDialog(Shell parentShell, SortedMap<Viewpoint, Boolean> viewpointsMap) {
		super(parentShell);
		this.viewpointsMap = viewpointsMap;
		originalViewpointsMap.putAll(viewpointsMap);
	}

	private boolean isRegularExpression(String viewpointURI){
		return viewpointURI.contains("*") 
				|| viewpointURI.contains("(")
				|| viewpointURI.contains("[")
				|| viewpointURI.contains("?")
				|| viewpointURI.contains("|")
				|| viewpointURI.contains("+");
	}

	private boolean validate() {
		Set<String> selectedURIs = new HashSet<String>();
		Map<String, Viewpoint> missings = new HashMap<String, Viewpoint>();

		for (Entry<Viewpoint, Boolean> entry : viewpointsMap.entrySet()) {
			if (entry.getValue()) {
				Viewpoint vp = entry.getKey();
				Option<URI> uri = new ViewpointQuery(vp).getViewpointURI();
				if (uri.some()) {
					selectedURIs.add(uri.get().toString().trim());
					missings.remove(uri.get().toString().trim());
					for (RepresentationExtensionDescription extension : new ViewpointQuery(vp).getAllRepresentationExtensionDescriptions()) {
						String extended = extension.getViewpointURI();
						if (!isRegularExpression(extended) && !selectedURIs.contains(extended.trim())) {
							missings.put(extended.trim(), null);
						}
					}
				}
			}
		}
		if (missings.isEmpty()) {
			setErrorMessage(null);
			setMessage(DEFAULT_MESSAGE);
			return true;
		}
		StringBuilder builder = new StringBuilder();
		builder.append("Missing dependencies: ");
		for (String uri : missings.keySet()) {
			builder.append('\'').append(new Path(uri).lastSegment()).append("\' ");
		}
		setErrorMessage(builder.toString());
		return false;
	}
	
	@Override
	protected Control createDialogArea(final Composite parent) {
		getShell().setText("Viewpoints Selection");
		setTitle("Selected viewpoints");
		setMessage(DEFAULT_MESSAGE);

		final Composite control = SWTUtil.createCompositeBothFill(parent, 1, false);
		final TableViewer tableViewer = new TableViewer(control, SWT.BORDER | SWT.FULL_SELECTION);
		ICellModifier cellModifier = new ViewpointsTableLazyCellModifier(viewpointsMap, tableViewer) {

			@Override
			public void modify(Object element, String property, Object value) {
				super.modify(element, property, value);
				getButton(OK).setEnabled(validate());
			}

		};
		tableViewer.getTable().setFont(parent.getFont());
		ColumnViewerToolTipSupport.enableFor(tableViewer, ToolTip.NO_RECREATE);

		final Table table = tableViewer.getTable();

		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		final TableColumn tc0 = new TableColumn(table, SWT.CENTER, 0);
		tc0.setWidth(30);

		final TableColumn tc1 = new TableColumn(table, SWT.CENTER, 1);
		tc1.setWidth(30);

		final TableViewerColumn column = new TableViewerColumn(tableViewer, SWT.LEFT, 2);
		column.getColumn().setWidth(450);

		table.setSize(new Point(table.getSize().x, 510));

		// Can only changes the first column - the visible column
		final CellEditor[] editors = new CellEditor[3];
		editors[0] = new CheckboxCellEditor(table);
		for (int i = 1; i < 3; i++) {
			editors[i] = null;
		}

		tableViewer.setColumnProperties(COLUMNS);

		tableViewer.setCellEditors(editors);
		tableViewer.setCellModifier(cellModifier);
		tableViewer.setContentProvider(new ViewpointsTableContentProvider());
		tableViewer.setLabelProvider(new ViewpointsTableLabelProvider(viewpointsMap));
		tableViewer.setComparator(new ViewerComparator());

		tableViewer.setInput(viewpointsMap.keySet());

		/* Lines and headers are not visible */
		table.setLinesVisible(false);
		table.setHeaderVisible(false);
		return control;
	}

	public Map<Viewpoint, Boolean> getChanges() {
		Map<Viewpoint, Boolean> result = new HashMap<Viewpoint, Boolean>();
		for (Entry<Viewpoint, Boolean> entry : viewpointsMap.entrySet()) {
			if (entry.getValue() != originalViewpointsMap.get(entry.getKey())){
				result.put(entry.getKey(), viewpointsMap.get(entry.getKey()));
			}
		}
		return result;
	}

}
