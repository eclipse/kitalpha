/*******************************************************************************
 * Copyright (c) 2014, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.common.share.ui.utilities;

import java.util.Arrays;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.IViewpointTreeDescription;

public class ExtensionTreeViewer extends ContainerCheckedTreeViewer {

	public ExtensionTreeViewer(Composite parent, int style) {
		super(parent, style);
		addCheckStateListener(new ICheckStateListener() {
			
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				
				
			}
		});
	}


	@Override
	protected void doCheckStateChanged(Object element) {
		super.doCheckStateChanged(element);
		IViewpointTreeDescription selected_vpd = (IViewpointTreeDescription) element;
		
		if (selected_vpd != null){
			boolean checked = Arrays.asList(getCheckedElements()).contains(element);
			setGrayChecked(selected_vpd, false);
			
			selected_vpd.setAsCandidateToKeep(checked);
			selected_vpd.updateCandidates(selected_vpd.isCandidateToKeep());
			TreeItem [] allItems = getTree().getItems();
			
			updateCheckItems(allItems);
		}

	}

	private void allChecked(boolean state, Object[] items) {
		IStructuredContentProvider cp = (IStructuredContentProvider)getContentProvider();
		for (int i = 0; i < items.length; i++) {
			setChecked(items [i], state);
			Object[] children = cp.getElements(items[i]);
			allChecked(state, children);
		}
		
	}
	public void allChecked(boolean state) {
		IStructuredContentProvider cp = (IStructuredContentProvider)getContentProvider();
		Object[] elements = cp.getElements(getInput());
		
		allChecked(state, elements);
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