/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.ui.pages;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.polarsys.kitalpha.ad.services.detachment.core.services.IDetachmentService;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.IViewpointTreeDescription;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.ViewpointTreeContainer;
import org.polarsys.kitalpha.ad.services.detachment.ui.messages.Messages;
import org.polarsys.kitalpha.ad.services.detachment.ui.pages.providers.ViewpointTreeContentProvider;
import org.polarsys.kitalpha.ad.services.detachment.ui.pages.providers.ViewpointTreeLabelProvider;
import org.eclipse.jface.dialogs.Dialog;


/**
 * 
 * @author Mathieu Hellebois
 *
 */
public class DetachmentViewpointTreePage extends WizardPage {
	
	IDetachmentService detachment;
	
	private Button selectAllButton;
	private Button deSelectAllButton;
	ContainerCheckedTreeViewer viewer;

	public DetachmentViewpointTreePage(IDetachmentService detachment) {
		super(Messages.EMPTY_STRING);
		
		setTitle(Messages.WIZARD_PAGE_VP_HIERARCHY_TITLE);
		setDescription(Messages.WIZARD_PAGE_VP_HIERARCHY_DESCRIPTION);
		setPageComplete(true);
		
		this.detachment = detachment;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().margins(10, 5).numColumns(1).applyTo(
				composite);
		GridDataFactory.fillDefaults().applyTo(composite);
		viewer = new ExtensionTreeViewer(composite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(
				viewer.getControl());

		viewer.setContentProvider(new ViewpointTreeContentProvider());
		viewer.setLabelProvider(new ViewpointTreeLabelProvider());
		
		viewer.setComparator(new ViewerComparator()); //Sorting elements
		
		createButtonGroup(composite);
		setControl(composite);
		Dialog.applyDialogFont(composite);
		
		ViewpointTreeContainer vpcontainer = detachment.getUsedViewpoints();
		viewer.setInput(null);
		viewer.setInput(vpcontainer);
		viewer.expandAll();
		viewer.setAllChecked(true);

//		setPageComplete(false);
	}
	
	
	private void createButtonGroup(Composite parent) {
		Composite buttonGroup = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(buttonGroup);
		selectAllButton = new Button(buttonGroup, SWT.PUSH);
		selectAllButton.setText(Messages.SELECTION_BUTTON);
		selectAllButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				selectAll(true);
			}
		});

		deSelectAllButton = new Button(buttonGroup, SWT.PUSH);
		deSelectAllButton.setText(Messages.DESLECTION_BUTTON);
		deSelectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectAll(false);
			}
		});
	}
	
	@SuppressWarnings("deprecation") //$NON-NLS-1$
	private void selectAll(boolean checked) {
		viewer.setAllChecked(checked);
	}
	
	
	class ExtensionTreeViewer extends ContainerCheckedTreeViewer {

		public ExtensionTreeViewer(Composite parent, int style) {
			super(parent, style);
		}

		// handle user click event
		protected void handleSelect(SelectionEvent event) {
			// call super class to notify change of check state
			IViewpointTreeDescription selected_vpd = (IViewpointTreeDescription) event.item.getData();
			
			if (selected_vpd != null){
				TreeItem item = (TreeItem)event.item;
				item.setGrayed(false);
				selected_vpd.setAsCandidateToKeep(item.getChecked());
				selected_vpd.updateCandidates(selected_vpd.isCandidateToKeep());
				TreeItem [] allItems = getTree().getItems();
				
				updateCheckItems(allItems);
			}
			super.handleSelect(event);

		}

		private void updateCheckItems(TreeItem[] allItems) {
			
			for (TreeItem treeItem : allItems) {
				IViewpointTreeDescription vpd = (IViewpointTreeDescription) treeItem.getData();
				treeItem.setChecked(vpd.isCandidateToKeep());
				treeItem.setGrayed(false);
				updateCheckChildrenItems(treeItem.getItems());
			}
		}

		private void updateCheckChildrenItems(TreeItem[] items) {
			if (items == null) return;
			if (items.length == 0) return;
			
			for (TreeItem treeItem : items) {
				IViewpointTreeDescription vpd = (IViewpointTreeDescription) treeItem.getData();
				treeItem.setChecked(vpd.isCandidateToKeep());
				treeItem.setGrayed(false);
				updateCheckChildrenItems(treeItem.getItems());
			}
			
		}
	}
	
	
	@Override
	public boolean canFlipToNextPage(){
		return false;
	}
}
