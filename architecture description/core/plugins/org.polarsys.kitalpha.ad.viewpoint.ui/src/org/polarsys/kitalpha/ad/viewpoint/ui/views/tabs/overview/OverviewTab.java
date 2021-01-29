/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.overview;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.polarsys.kitalpha.ad.common.utils.URIFix;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IMiscHandler;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.LoadViewpointModelDialog;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AbstractTab;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.ResourceTableSorter;

/**
 * @author Thomas Guiu
 * 
 */
public class OverviewTab extends AbstractTab {
	private static final String NAME_COLUMN = "name";

	private TableViewer parentsViewer;
	private Button addBtn, deleteBtn;
	private Button abstractButton;
	private Text nameText;
	private Text versionText;
	private Text descriptionText;

	public OverviewTab() {
		super(new ParentslLabelProvider());
	}

	@Override
	public ISelectionProvider getSelectionProvider() {
		return parentsViewer;
	}

	@Override
	public void createTab(FormToolkit toolkit, CTabFolder folder) {
		Composite composite = createTab(toolkit, folder, Messages.OverviewTab_title, AFImages.MISC);
		GridLayout clayout = new GridLayout();
		clayout.numColumns = 3;
		composite.setLayout(clayout);

		createLeftControls(toolkit, composite);
		createRightControls(toolkit, composite);
		// site.setSelectionProvider(configViewer);
	}

	private void createLeftControls(FormToolkit toolkit, Composite parent) {
		Composite composite = new Composite(parent, SWT.None);
		composite.setBackground(parent.getBackground());
		GridLayout clayout = new GridLayout();
		composite.setLayout(clayout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		toolkit.createLabel(composite, Messages.OverviewTab_name_label);
		nameText = toolkit.createText(composite, "");
		nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		nameText.addFocusListener(new FocusListener2() {

			@Override
			public void doFocusLost(FocusEvent e) {
				IMiscHandler miscHandler = modelManager.getMiscHandler();
				if (miscHandler != null) {
					miscHandler.setName(nameText.getText());
				}
			}

		});

		toolkit.createLabel(composite, Messages.OverviewTab_version_label);
		versionText = toolkit.createText(composite, "");
		versionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		versionText.addFocusListener(new FocusListener2() {

			@Override
			public void doFocusLost(FocusEvent e) {
				IMiscHandler miscHandler = modelManager.getMiscHandler();
				if (miscHandler != null) {
					miscHandler.setVersion(versionText.getText());
				}
			}
		});

		toolkit.createLabel(composite, Messages.OverviewTab_description_label);
		descriptionText = toolkit.createText(composite, "");
		descriptionText.setLayoutData(new GridData(GridData.FILL_BOTH));
		descriptionText.addFocusListener(new FocusListener2() {

			@Override
			public void doFocusLost(FocusEvent e) {
				IMiscHandler miscHandler = modelManager.getMiscHandler();
				if (miscHandler != null) {
					miscHandler.setDescription(descriptionText.getText());
				}
			}
		});

	}

	public void createRightControls(FormToolkit toolkit, final Composite parent) {
		Composite composite = new Composite(parent, SWT.None);
		composite.setBackground(parent.getBackground());
		GridLayout clayout = new GridLayout();
		composite.setLayout(clayout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		abstractButton = toolkit.createButton(composite, Messages.OverviewTab_abstract_button_label, SWT.CHECK);
		abstractButton.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IMiscHandler miscHandler = modelManager.getMiscHandler();
				if (miscHandler != null) {
					miscHandler.setAbstract(abstractButton.getSelection());
				}
			}
		});

		parentsViewer = new TableViewer(composite, SWT.FULL_SELECTION | SWT.BORDER);
		final Table table = parentsViewer.getTable();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));
		SelectionListener headerListener = new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				TableColumn currentSortColumn = table.getSortColumn();
				TableColumn newSortColumn = (TableColumn) e.getSource();
				if (currentSortColumn.equals(newSortColumn)) {
					int sortDirection = table.getSortDirection();
					table.setSortDirection(sortDirection == SWT.UP ? SWT.DOWN : SWT.UP);
				} else {
					table.setSortColumn(newSortColumn);
					table.setSortDirection(SWT.DOWN);
				}
				parentsViewer.refresh();
			}
		};

		TableViewerColumn nameColumn = new TableViewerColumn(parentsViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 90, true));
		nameColumn.getColumn().addSelectionListener(headerListener);
		nameColumn.getColumn().setText(Messages.OverviewTab_parent_label);
		nameColumn.getColumn().setResizable(true);
		nameColumn.getColumn().setData(0);

		table.setSortColumn(nameColumn.getColumn());
		table.setSortDirection(SWT.DOWN);

		parentsViewer.setColumnProperties(new String[] { NAME_COLUMN });

		parentsViewer.setContentProvider(ParentsContentProvider.INSTANCE);
		parentsViewer.setLabelProvider(labelProvider);
		parentsViewer.setSorter(new ResourceTableSorter());

		// buttons
		Composite btnBar = toolkit.createComposite(parent);
		btnBar.setLayout(new GridLayout());
		addBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		addBtn.setToolTipText(Messages.OverviewTab_add_tooltip);
		addBtn.setImage(Activator.getDefault().getImage(AFImages.ADD));
		addBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IMiscHandler miscHandler = modelManager.getMiscHandler();
				URI uri = viewpoint.eResource().getURI();
				IPath path = new Path(uri.path()).removeFirstSegments(1);

				String segment = uri.segment(1);
				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				IProject project = root.getProject(segment);

				LoadViewpointModelDialog loadResourceDialog = new LoadViewpointModelDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), viewpoint);
				if (loadResourceDialog.open() == Window.OK) {
					ResourceSet resourceSet = viewpoint.eResource().getResourceSet();
					List<Viewpoint> vps = new ArrayList<Viewpoint>();
					for (org.polarsys.kitalpha.resourcereuse.model.Resource res : loadResourceDialog.getResult()) {
						path = new Path(res.getPath());
						project = root.getProject(path.segment(0));
						if (project.isAccessible()) {
							uri = URIFix.createPlatformResourceURI(res.getPath(), false);
						} else {
							uri = URIFix.createPlatformPluginURI(res.getPath(), false);
						}

						Viewpoint vp = (Viewpoint) resourceSet.getEObject(uri, true);
						vps.add(vp);
					}
					miscHandler.addParents(vps);
				}
			}
		});

		deleteBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		deleteBtn.setToolTipText(Messages.OverviewTab_delete_tooltip);
		deleteBtn.setImage(Activator.getDefault().getImage(AFImages.DELETE));
		deleteBtn.setEnabled(false);
		deleteBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) parentsViewer.getSelection();
				List<Viewpoint> vps = new ArrayList<Viewpoint>();
				for (Object obj : selection.toArray()) {
					vps.add((Viewpoint) obj);
				}
				IMiscHandler miscHandler = modelManager.getMiscHandler();
				miscHandler.removeParents(vps);
			}
		});

		parentsViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				updateButtons((IStructuredSelection) event.getSelection());
			}
		});
	}

	@Override
	public void init() {
		parentsViewer.setInput(viewpoint);
		workspaceHasChanged();
	}

	@Override
	public void workspaceHasChanged() {
		super.workspaceHasChanged();
		IMiscHandler miscHandler = modelManager.getMiscHandler();

		if (miscHandler == null) {
			abstractButton.setSelection(false);
			descriptionText.setText("");
			nameText.setText("");
			versionText.setText("");
		} else {
			abstractButton.setSelection(miscHandler.isAbstract());
			descriptionText.setText(miscHandler.getDescription() == null ? "" : miscHandler.getDescription());
			nameText.setText(miscHandler.getName() == null ? "" : miscHandler.getName());
			versionText.setText(miscHandler.getVersion() == null ? "" : miscHandler.getVersion());
		}
		parentsViewer.refresh();
		updateButtons((IStructuredSelection) parentsViewer.getSelection());
	}

	private void updateButtons(IStructuredSelection selection) {
		boolean readOnly = getModelManager().getResourceManager().isReadOnly() || getModelManager().isLocal();
		abstractButton.setEnabled(!readOnly);
		descriptionText.setEnabled(!readOnly);
		nameText.setEnabled(!readOnly);
		versionText.setEnabled(!readOnly);
		addBtn.setEnabled(!readOnly);
		deleteBtn.setEnabled(!readOnly && !selection.isEmpty());
	}
}
