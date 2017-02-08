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
package org.polarsys.kitalpha.model.common.ui.contrib.modelresource.page;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.Scrutineer;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResource;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResources;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.ModelResourceState;
import org.polarsys.kitalpha.model.common.ui.contrib.modelresource.provider.ResourceCheckboxProvider;
import org.polarsys.kitalpha.model.detachment.ui.page.AbstractDetachmentFormPage;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ModelResourcePage extends AbstractDetachmentFormPage {
	
	
	private static final Color platformColor = new Color(PlatformUI.getWorkbench().getDisplay(), 0, 0, 255);
	private static final Color workspaceColor = new Color(PlatformUI.getWorkbench().getDisplay(), 0, 0, 0);
	private static final Color unknownItemColor = new Color(PlatformUI.getWorkbench().getDisplay(), 255, 0, 0);
	
	public ModelResourcePage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		
		final FormToolkit tk = managedForm.getToolkit();
		final ScrolledForm scrolledForm = managedForm.getForm();
		scrolledForm.setText("Model Resources");	
		scrolledForm.setExpandHorizontal(true);

		Composite composite = scrolledForm.getBody();
		
		composite.setLayout(new GridLayout(2, true));
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		
		
		composite.setLayoutData(gridData);
		
		CheckboxTableViewer knownResourceCheckboxTable = createCheckboxTableViewer(tk, composite, "Known Resources", "List of resolved resources used by the model.\nDeselect resources to delete"); 
		
		CheckboxTableViewer unkwonResourceCheckboxTable = createCheckboxTableViewer(tk, composite, "Unknown Resources", "List of unresolved resources used by the model.\nDeselect resources to delete");
		
		ResourceCheckboxProvider knownResourceProvider 	= new ResourceCheckboxProvider(ModelResourceState.KnownResource);
		ResourceCheckboxProvider unknownResourceProvider = new ResourceCheckboxProvider(ModelResourceState.UnknownResource);
		
		knownResourceCheckboxTable.setContentProvider(knownResourceProvider);
		knownResourceCheckboxTable.setLabelProvider(knownResourceProvider);
		
		unkwonResourceCheckboxTable.setContentProvider(unknownResourceProvider);
		unkwonResourceCheckboxTable.setLabelProvider(unknownResourceProvider);
		
		
		installComparator(knownResourceCheckboxTable);
		installComparator(unkwonResourceCheckboxTable);
		
		installListeners(knownResourceCheckboxTable);
		installListeners(unkwonResourceCheckboxTable);
		
		
		try {
			RegistryElement regElt = Scrutineer.getRegistryElement(getFinderID());
			
			Iterator<IScrutinize> it = regElt.getFinders().iterator();
			
			while (it.hasNext()){
				IScrutinize scrutinize = it.next();
				
				IModelResources _modelResources = (IModelResources) scrutinize.getAnalysisResult();
				knownResourceCheckboxTable.setInput(_modelResources);
				unkwonResourceCheckboxTable.setInput(_modelResources);
				
				knownResourceCheckboxTable.setAllChecked(true);
				unkwonResourceCheckboxTable.setAllChecked(true);
			}
			
		} catch (ModelScrutinyException e) {
			e.printStackTrace();
		}
		
		colorBackgroundCells(knownResourceCheckboxTable, platformColor, workspaceColor, unknownItemColor);
		colorBackgroundCells(unkwonResourceCheckboxTable, platformColor, workspaceColor, unknownItemColor);
	}
	
	
	private void installListeners(CheckboxTableViewer checkboxTableViewer) {
		checkboxTableViewer.addCheckStateListener(new ICheckStateListener() {
			
			@SuppressWarnings("rawtypes")
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				String checkedURI = event.getElement().toString();
				URI uri = URI.createURI(checkedURI);
				boolean isCandidate = !event.getChecked();
				
				try {
					RegistryElement regElt = Scrutineer.getRegistryElement(getFinderID());
					
					Iterator<IScrutinize> it = regElt.getFinders().iterator();
					
					while (it.hasNext()){
						IScrutinize scrutinize = it.next();
						IModelResources _modelResources = (IModelResources) scrutinize.getAnalysisResult();
						
						IModelResource modelResource = _modelResources.getModelResource(uri);
						
						//FIXME delete if when getModelResource throws exception
						if (modelResource != null){
							modelResource.setAsCandidate(isCandidate);
						}
					}
				} catch (ModelScrutinyException e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	private void installComparator(CheckboxTableViewer table){
		table.setComparator(new ModelResourceViewerComparator());
	}
	
	
	private void colorBackgroundCells(CheckboxTableViewer table, Color platformColor, Color workspaceColor, Color unknwonItemColor){
		TableItem items[] = table.getTable().getItems();
		
		for (TableItem tableItem : items) {
			//Assume table item contains Strings
			String tmp = ((String)tableItem.getText());
			URI uri = URI.createURI(tmp);
			
			if (uri.isPlatformPlugin()){
				tableItem.setForeground(platformColor);
			} else {
				if (uri.isPlatformResource()){
					tableItem.setForeground(workspaceColor);
				} else {
					tableItem.setForeground(unknwonItemColor);
				}
			}
		}
	}
	
	
	private CheckboxTableViewer createCheckboxTableViewer(FormToolkit tk, Composite parent, 
			String sectionTitle, String description){
		
		final CheckboxTableViewer tableViewer;
		
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		
		Composite innerComposite = new Composite(parent, SWT.NONE);
		
		GridLayout innerGridData = new GridLayout(2, false);
		innerComposite.setLayout(innerGridData);
		
		innerComposite.setLayoutData(gridData);
		
		Section section = tk.createSection(innerComposite, Section.TITLE_BAR | Section.DESCRIPTION | Section.EXPANDED);
		section.setDescription(description);
		
		GridData sectionGridData = new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL);
		section.setLayoutData(sectionGridData);

		tk.paintBordersFor(section);
		section.setText(sectionTitle);
		
		Composite buttonsComposite = tk.createComposite(innerComposite, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_VERTICAL);
		buttonsComposite.setLayoutData(gd);
		
		GridLayout buttonsLayout = new GridLayout();
		buttonsLayout.marginWidth = buttonsLayout.marginHeight = 0;
		
		buttonsComposite.setLayout(buttonsLayout);
		Button selectAll = tk.createButton(buttonsComposite, "Select All", SWT.BUTTON1);
		Button deselectAll = tk.createButton(buttonsComposite, "Deselect All", SWT.BUTTON1);
		
		selectAll.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		deselectAll.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		
		tableViewer = CheckboxTableViewer.newCheckList(section, SWT.BORDER);
		tableViewer.getTable().setLayoutData(gridData);
		tk.paintBordersFor(tableViewer.getTable());
		section.setClient(tableViewer.getTable());
		
		selectAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.setAllChecked(true);
			}
		});
		
		deselectAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.setAllChecked(false);
			}
		});

		return tableViewer;
	}
	
	
	//Comparator
	private static class ModelResourceViewerComparator extends ViewerComparator {
		
		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
	    	
	        String name1 = getLabel(viewer, e1);
	        String name2 = getLabel(viewer, e2);
	        
	        if (name1.startsWith("platform:/resource") && name2.startsWith("platform:/plugin"))
	        	return 0;
	        
	        if (name1.startsWith("platform:/plugin") && name2.startsWith("platform:/resource"))
	        	return 1;

	        return -1;
	    }
		
		
		/**
		 * from ViewerComparator{@link #getLabel(Viewer, Object)}
		 * @param viewer
		 * @param e1
		 * @return
		 */
		private String getLabel(Viewer viewer, Object e1) {
			String name1;
			if (viewer == null || !(viewer instanceof ContentViewer)) {
				name1 = e1.toString();
			} else {
				IBaseLabelProvider prov = ((ContentViewer) viewer)
						.getLabelProvider();
				if (prov instanceof ILabelProvider) {
					ILabelProvider lprov = (ILabelProvider) prov;
					name1 = lprov.getText(e1);
				} else {
					name1 = e1.toString();
				}
			}
			if (name1 == null) {
				name1 = "";//$NON-NLS-1$
			}
			return name1;
		}
	}
}
		
