/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.detachment.ui.contrib.viewpoints.pages;

import java.util.Iterator;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.common.share.ui.utilities.ExtensionTreeViewer;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.providers.ViewpointTreeLabelProvider;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.providers.ViewpointTreeProvider;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeContainer;
import org.polarsys.kitalpha.model.detachment.ui.contrib.viewpoints.Messages;
import org.polarsys.kitalpha.model.detachment.ui.page.AbstractDetachmentFormPage;

/**
 * @author Faycal Abka
 */
public class ViewpointsHierarchyPage extends AbstractDetachmentFormPage {

	private ExtensionTreeViewer treeViewer;
	
	private Button selectAllButton;
	private Button deSelectAllButton;
	
	
	public ViewpointsHierarchyPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}
	
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		final FormToolkit tk = managedForm.getToolkit();
		final ScrolledForm scrolledForm = managedForm.getForm();
		scrolledForm.setText(Messages.VIEWPOINTS_HIERARCHY);		
		scrolledForm.setExpandHorizontal(true);

		Composite composite = scrolledForm.getBody();
		composite.setLayout(new FillLayout());

		Section section = tk.createSection(composite, Section.TITLE_BAR |  Section.DESCRIPTION);
		
		section.setText(Messages.VIEWPOINTS_HIERARCHY);
		section.setDescription(Messages.VIEWPOINTS_HIERARCHY_DESC);
		Composite sectionClient = tk.createComposite(section);
		GridLayoutFactory.fillDefaults().margins(10,5).numColumns(1).applyTo(sectionClient);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(sectionClient);
				
		
		
		GridLayoutFactory.fillDefaults().applyTo(sectionClient);
		
		treeViewer = new ExtensionTreeViewer(sectionClient, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = true;
		treeViewer.getControl().setLayoutData(gd);
		
		GridDataFactory.fillDefaults().grab(true, true).applyTo(treeViewer.getControl());
		
		treeViewer.setContentProvider(new ViewpointTreeProvider());
		treeViewer.setLabelProvider(new ViewpointTreeLabelProvider());
		treeViewer.setComparator(new ViewerComparator());
		
		createButtonGroup(sectionClient);
		section.setClient(sectionClient);
		
		
		RegistryElement regElt = null;
		
		try {
			regElt = getScrutinyAnalysis().getRegistryElement(getFinderID());	
		} catch (ModelScrutinyException e) {
			e.printStackTrace();
		}
		
		treeViewer.setInput(null);
		
		if (regElt != null){
			Iterator<IScrutinize> it = regElt.getFinders().iterator();
			while (it.hasNext()){
				IScrutinize<ViewpointTreeContainer, Object> next = it.next();
				treeViewer.setInput(next.getAnalysisResult());
			}
			treeViewer.expandAll();
			treeViewer.setAllChecked(true);
		}
		
		
		
	}
	
	
	private void createButtonGroup(Composite parent) {
		Composite buttonGroup = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(buttonGroup);
		selectAllButton = new Button(buttonGroup, SWT.PUSH);
		selectAllButton.setText(Messages.SELECT_ALL_LABEL);
		selectAllButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				treeViewer.allChecked(true);
			}
		});

		deSelectAllButton = new Button(buttonGroup, SWT.PUSH);
		deSelectAllButton.setText(Messages.DESELECT_ALL_LABEL);
		deSelectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				treeViewer.allChecked(false);
			}
			
		});
	}
	
}
