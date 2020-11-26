/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.report.ui.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.model.ReportList;
import org.polarsys.kitalpha.report.registry.ReportRegistry;
import org.polarsys.kitalpha.report.registry.ReportRegistry.Listener;
import org.polarsys.kitalpha.report.ui.description.ColumnDescription;
import org.polarsys.kitalpha.report.ui.description.ReportsUI;

/**
 * @author Thomas Guiu
 */
public class ReportsView extends ViewPart implements Observer {

	private static final String DESCRIPTION_KEY = "description";

	protected int severityThreshold = -1;
	protected MyTreeViewer viewer;

	private Listener listener = new Listener() {

		@Override
		public void reportListUpdated(ReportList list) {
			Display.getDefault().asyncExec(new Runnable() {

				@Override
				public void run() {
					if (viewer != null && !viewer.getControl().isDisposed()) {
						refreshView();
					}
				}
			});
		}

	};

	private final DeleteReportsAction deleteReportAction = new DeleteReportsAction(this);

	private final DeleteAllReportsAction deleteAllReportAction = new DeleteAllReportsAction();
	private final Map<String, TreeViewerColumn> columns = new HashMap<String, TreeViewerColumn>();
	private StyledText detailText;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());

		SashForm comp1a = new SashForm(parent, SWT.HORIZONTAL);

		createTreeViewer(comp1a);
		createTextViewer(comp1a);

		comp1a.setWeights(new int[] { 5, 1 });

		contributeToActionBars();

		ReportsUI.addObserver(this);
	}

	private void createTextViewer(Composite parent) {
		detailText = new StyledText(parent, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		detailText.setEditable(false);
		detailText.setText("");
	}

	public void selectAndReveal(LogEntry entry) {
		ReportsUI.showList((ReportList) entry.eContainer());
		// need to refresh if an additional list should be displayed
		viewer.refresh();

		StructuredSelection selection = new StructuredSelection(entry);
		viewer.setSelection(selection, true);
	}

	/**
	 * Creates the table viewer.
	 * 
	 * @param parent
	 *            the parent.
	 */
	private void createTreeViewer(Composite parent) {

		//
		// Graphical settings.
		this.viewer = new MyTreeViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER | SWT.MULTI);
		viewer.getTree().setLinesVisible(true);
		viewer.getTree().setHeaderVisible(true);

		for (String id : ReportsUI.getDisplayedColumns()) {
			createColumn(id);
		}

		viewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				LogEntry entry = (LogEntry) element;
				return severityThreshold == -1 || entry.getSeverity().getCode() <= severityThreshold;
			}
		});

		// content and label provider.
		viewer.setContentProvider(new ReportContentProvider());
		viewer.setSorter(new ReportTableSorter(DESCRIPTION_KEY));
		viewer.getTree().setSortDirection(SWT.DOWN);

		//
		// Graphical layout settings.
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		viewer.getTree().setLayoutData(gridData);

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection ss = (IStructuredSelection) event.getSelection();
				if (ss.size() == 1) {
					LogEntry entry = (LogEntry) ss.getFirstElement();
					detailText.setText(entry.getMessage() == null ? "" : entry.getMessage());
				} else {
					detailText.setText("");
				}
				deleteReportAction.setEnabled(!event.getSelection().isEmpty());
			}
		});

		viewer.setInput(ReportRegistry.INSTANCE);
		deleteReportAction.setEnabled(false);
		refreshView();

		ReportRegistry.INSTANCE.addListener(listener);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		// fill Local ToolBar
		IToolBarManager toolBarManager = bars.getToolBarManager();
		toolBarManager.add(new ManageColumnsAction(this));
		toolBarManager.add(new SetSeverityFilterAction(this));
		toolBarManager.add(new Separator("grp1"));
		toolBarManager.add(new LoadReportListAction(this));
		toolBarManager.add(new SaveReportListAction(this));
		toolBarManager.add(new Separator("grp2"));
		toolBarManager.add(deleteReportAction);
		toolBarManager.add(deleteAllReportAction);
		toolBarManager.add(new Separator("grp3"));
		toolBarManager.add(new SelectReportDropDownAction());

	}

	public int getSeverityThreshold() {
		return severityThreshold;
	}

	public void setSeverityThreshold(int severityThreshold) {
		this.severityThreshold = severityThreshold;
		if (viewer != null && !viewer.getTree().isDisposed()) {
			refreshView();
		}
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	public void dispose() {
		ReportsUI.removeObserver(this);
		super.dispose();
	}

	void refreshView() {
		viewer.refresh();
		deleteAllReportAction.setEnabled(viewer.getTree().getItems().length > 0);
	}

	void deleteColumn(String id) {
		TreeViewerColumn treeViewerColumn = columns.remove(id);
		if (treeViewerColumn != null) {
			treeViewerColumn.getColumn().dispose();
		}
	}

	void createColumn(String id) {
		final ColumnDescription desc = ReportsUI.getColumnDescription(id);
		final TreeViewerColumn treeColumn = new TreeViewerColumn(viewer, desc.getAlignment());
		columns.put(id, treeColumn);
		treeColumn.getColumn().setData(DESCRIPTION_KEY, desc);
		treeColumn.getColumn().setText(desc.getLabel());
		treeColumn.getColumn().setWidth(desc.getWidth());
		treeColumn.getColumn().setMoveable(true);
		treeColumn.setLabelProvider(new CellLabelProvider() {

			@Override
			public void update(ViewerCell cell) {
				desc.update(cell);
			}
		});
		treeColumn.getColumn().addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				TreeColumn selectedColumn = (TreeColumn) e.widget;
				int sortDirection = viewer.getTree().getSortDirection();
				if (selectedColumn.equals(viewer.getTree().getSortColumn())) {
					viewer.getTree().setSortDirection(sortDirection == SWT.UP ? SWT.DOWN : SWT.UP);
				} else {
					viewer.getTree().setSortColumn(selectedColumn);
				}
				viewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) { // NOSONAR
			}
		});

	}

	IStructuredSelection getSelection() {
		return (IStructuredSelection) viewer.getSelection();
	}

	public List<LogEntry> getDisplayedReports() {
		final Object[] filteredChildren = viewer.getFilteredChildren(viewer.getInput());
		List<LogEntry> result = new ArrayList<LogEntry>();
		for (Object obj : filteredChildren) {
			result.add((LogEntry) obj);
		}
		return result;
	}

	static class MyTreeViewer extends TreeViewer { // NOSONAR

		public MyTreeViewer(Composite parent, int style) {
			super(parent, style);
		}

		@Override
		public Object[] getFilteredChildren(Object parent) {
			return super.getFilteredChildren(parent);
		}

	}


	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof String) {
			String id = (String) arg;
			if (ReportsUI.getColumnDescription(id) == null) {
				deleteColumn(id);
			} else if (ReportsUI.getDisplayedColumns().contains(id) && !columns.containsKey(id)) {
				createColumn(id);
			}
		}
		viewer.refresh();
	}

}
