/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import org.polarsys.kitalpha.composer.api.library.LibraryReuseHelper;
import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.launch.ICodeManagerLaunchConfigurationConstants;
import org.polarsys.kitalpha.composer.ui.launch.tabs.LibraryTab;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.AtomicWidget;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library.providers.LibraryContentProvider;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library.providers.LibraryItem;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library.providers.LibraryValidityColumnLabelProvider;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Guillaume Gebhart
 *
 */
public class LibraryWidget {

	private Viewer viewer;
	private Text validation;
	private LibraryTab tab;
	AtomicWidget cw;
	private Text descriptionArea;
    
	private List<LibraryItem> checkedList;
	public LibraryWidget(LibraryTab tab_p){
		this.tab=tab_p;
	}
	
	
	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#createContents(org.eclipse.swt.widgets.Composite)
	 */
	public void createContents(Composite parent) {
		 createWidget(parent, "Select the wanted libraries");
		 attachListeners();
		 initialize();
	}

	private void attachListeners() {
		((CheckboxTableViewer)viewer).addCheckStateListener(new ICheckStateListener() {
			
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				
				LibraryItem r = (LibraryItem)event.getElement();
				if (event.getChecked()) {
	
					ConflictValidator.getInstance().isConflict(getCheckList(),r);
					getCheckList().add(r);
									
				}else {
					
					r.clearErrorsMsg();
					getCheckList().remove(r);
					ConflictValidator.getInstance().isConflictReverse(r,getCheckList());					
				}
				
		
				if(updateMessages() == "OK"){
					tab.update();
					
				}else{
					tab.noUpdate();
				}
				viewer.refresh();
			}
		});
		
	}


	private String updateMessages() {
		String msg = "";
		validation.setText(msg);
		for(LibraryItem i : (LibraryItem[])viewer.getInput()) {
			for(String s : i.getErrorsMsg()){
				msg = msg + s + "\n";
			}
		}
		msg = msg == ""? "OK" : msg;
		validation.setText(msg);
		return msg;
	}
	
	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#initialize()
	 */
	public void initialize() {
		checkedList = new ArrayList<LibraryItem>();
		Resource[] res = LibraryReuseHelper.INSTANCE.getLibraries();
		LibraryItem[] items = new LibraryItem[res.length];
		for(int i =0; i<res.length;i++) {
			items[i] = new LibraryItem(res[i],true);
		}
		viewer.setInput(items);
		
	}


	
public Viewer createWidget(Composite parent_p, String name_p){
		
		Group groupL = new Group(parent_p, SWT.NONE);
		groupL.setText(name_p);
		groupL.setLayout(new GridLayout(1, true));
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		
		groupL.setLayoutData(gd);

		 viewer = createTable(groupL);
		 validation = ConflictValidator.getInstance().getWidget(parent_p);

		return viewer;
	}


private Viewer createTable(final Composite container) {
	GridData gd = new GridData(GridData.FILL_BOTH);
	gd.heightHint = 80;
    
    CheckboxTableViewer tableViewer = CheckboxTableViewer.newCheckList(container, SWT.CHECK | SWT.BORDER | SWT.MULTI | SWT.SINGLE);
    final Table table = tableViewer.getTable();
	table.setLayoutData(gd);
    table.setFont(container.getFont());
    tableViewer.setContentProvider(new LibraryContentProvider());
	tableViewer.setLabelProvider(new LibraryValidityColumnLabelProvider());
    tableViewer.setUseHashlookup(true);
	tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = viewer.getSelection();
				
				if (selection instanceof IStructuredSelection) {
					if(!selection.isEmpty()){
					Object o = ((IStructuredSelection) selection).getFirstElement();
						
					LibraryItem item = (LibraryItem)o;
					
					Resource res = item.getItem();
						
						String string = res.getDescription() == null ? "Library "
								+ res.getName()
								: res.getDescription();
								descriptionArea.setText(string);
					}
				}
			}
		});
		
		
		Group internalGroup = new Group(container, SWT.NONE);
		internalGroup.setText("Selected library");
		
		internalGroup.setLayout(new GridLayout(2, false));
		gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		internalGroup.setLayoutData(gd);
		
		Label label = new Label(internalGroup, SWT.NONE);
		label.setText("Description");
		descriptionArea = new Text(internalGroup,SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
		descriptionArea.setEditable(false);
		gd.grabExcessVerticalSpace = true;
		gd.heightHint = 50;
		
		descriptionArea.setLayoutData(gd);
		
		return tableViewer;
	}


public final Viewer getViewer() {
	return viewer;
}

public void performApply(ILaunchConfigurationWorkingCopy configuration){
	
	List<String> selected = convertCheckedListToString();
	if(selected !=null){
		configuration.setAttribute(ICodeManagerLaunchConfigurationConstants.SELECTED_LIBRARIES, selected);
	}
}

private List<String> convertCheckedListToString() {
	List<String> selected = new ArrayList<String>();
	List<Resource> l = getModelResourceList(getCheckList());
	for(Resource r : l){
		selected.add(r.getId());
	}
	return selected;
}


private List<Resource> getModelResourceList(List<LibraryItem> list_p) {
	List<Resource> result = new ArrayList<Resource>();
	for(LibraryItem i : list_p) {
		result.add(i.getItem());
	}
	return result;
}


private List<Resource> getResourceList(List<String> list_p){
	return LibraryReuseHelper.INSTANCE.getResourcesFromIds(list_p);
	
}

private void setCheckList(List<LibraryItem> resources) {
	checkedList = resources;

}

private List<LibraryItem> getCheckList(){
	return checkedList;
}

@SuppressWarnings("unchecked")
public void initializeFrom(ILaunchConfiguration configuration) {
	try {
		List<String> values = configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.SELECTED_LIBRARIES,
				new ArrayList<String>());
		
			if(values != null){
			List<Resource> resources = getResourceList(values); // get Resource from string Id
			setCheckList(getLibraryItemFromResource(resources)); // get Library Item from resource
			updateCheckList();	
			}
			descriptionArea.setText("");
	} catch (CoreException e) {
	
		Activator.getDefault().getLog().log(e.getStatus());
	}
}


private List<LibraryItem> getLibraryItemFromResource(List<Resource> resources) {
	List<LibraryItem> list = new ArrayList<LibraryItem>();
	LibraryItem[] items = (LibraryItem[])viewer.getInput();
	for(LibraryItem i : items){
		Resource r = i.getItem();
		for(Resource res : resources){
			if(r.getId().equals(res.getId())) {
				list.add(i);
			}
		}
	}
	return list;
}


private void updateCheckList() {
	Table table = (Table)viewer.getControl();
	List<LibraryItem> list = getCheckList();
	for(TableItem item : table.getItems()){
		LibraryItem libItem =  (LibraryItem)item.getData();
		
		if(list.contains(libItem)){
			item.setChecked(true);
		}else{
			item.setChecked(false);
		}
		
		viewer.refresh();
	}
}
}
