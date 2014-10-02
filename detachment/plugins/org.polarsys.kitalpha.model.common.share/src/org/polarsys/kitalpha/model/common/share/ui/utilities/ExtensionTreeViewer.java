/*******************************************************************************
 * Copyright (c) 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.common.share.ui.utilities;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.IViewpointTreeDescription;

public class ExtensionTreeViewer extends ContainerCheckedTreeViewer {

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