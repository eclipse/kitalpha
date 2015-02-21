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
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;

/**
 * @author Faycal Abka
 */

public class DataClassesPage extends WizardPage{
	private Collection<Class> classes;
	final Collection<Class> selectedClass = new HashSet<Class>(1);
	
	private ListViewer listViewer;
	private Button diagramOption;
	private Button diagramExtensionOption;
	
	private boolean isDiagramExtension = false;
	
	protected DataClassesPage(String pageName) {
		super(pageName);
	}
	
	protected DataClassesPage(String pageName, Collection<Class> classes){
		this(pageName);
		this.classes = classes;
		setTitle(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		Composite listComposite = new Composite(parent, SWT.None);
		GridLayout layout = new GridLayout(1, true);
		listComposite.setLayout(layout);
		
		// Radio Buttons to choose between diagram or diagram extension
		Composite diagramRadioButtonComposite = new Composite(listComposite, SWT.NONE);
	    diagramRadioButtonComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
	    diagramOption = new Button(diagramRadioButtonComposite, SWT.RADIO);
	    diagramExtensionOption = new Button(diagramRadioButtonComposite, SWT.RADIO);
		diagramOption.setText("New diagram");
		diagramExtensionOption.setText("New diagram extension");
		diagramOption.setSelection(true);
		diagramOption.addSelectionListener(new DiagramSelectionButtonListener());
		diagramExtensionOption.addSelectionListener(new DiagramSelectionButtonListener());
		
//		Button extensionDiagramcheckbox = new Button(listComposite, SWT.CHECK);
//		extensionDiagramcheckbox.setText("Create Diagram Extension");
//		extensionDiagramcheckbox.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//		extensionDiagramcheckbox.addSelectionListener(new DiagramSelectionButtonListener());
		
		//List viewer displaying available classes
		Label label = new Label(listComposite, SWT.NONE);
		label.setText("Candidates viewpoint classes:");
		listViewer = new ListViewer(listComposite, SWT.BORDER | SWT.V_SCROLL);
		listViewer.getList().setLayoutData(new GridData(GridData.FILL_BOTH));
		listViewer.setComparator(new ViewerComparator());
		listViewer.setLabelProvider(new LabelProvider(){
			public Image getImage(Object element){
				return null;
			}
			
			public String getText(Object element){
				return ((Class)element).getName();
			}
		});
		listViewer.addSelectionChangedListener(new ISelectionChangedListener() 
		{
			@Override
			public void selectionChanged(SelectionChangedEvent event) 
			{
				//TODO when give to the user ability to select several classes
				selectedClass.clear();
				Class tmp = (Class) ((IStructuredSelection)event.getSelection()).getFirstElement();
				selectedClass.add(tmp);
			}
		});
		listViewer.setContentProvider(new IStructuredContentProvider() {
			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput){}
			
			@Override
			public void dispose() {}
			
			@SuppressWarnings("unchecked")
			@Override
			public Object[] getElements(Object inputElement){
				return ((Collection<Class>)inputElement).toArray();
			}
		});
		
		listViewer.setInput(classes);
		if (listViewer.getList().getItems().length > 0)
			listViewer.setSelection(new StructuredSelection(listViewer.getElementAt(0)), true);
		
		setControl(parent);
		setVisible(true);
	}
	
	public Collection<Class> getSelectedClass()  {
		return selectedClass;
	}
	
	public boolean isUserSelectedDomainContext() {
		return !selectedClass.isEmpty();
	}
	
	private void updateIsDiagramExtension(boolean isExtension){
		this.isDiagramExtension = isExtension;
	}
	
	public void dispose() {
		getSelectedClass().clear();
	}
	
	public boolean isDiagramExtension(){
		return this.isDiagramExtension;
	}

	/**
	 * @author Boubekeur Zendagui
	 */
	class DiagramSelectionButtonListener implements SelectionListener{
		@Override
		public void widgetSelected(SelectionEvent e) {
			Button button = (Button)e.widget;
			boolean extensionActivated = diagramExtensionOption.getSelection();
			updateIsDiagramExtension(extensionActivated);
			if (extensionActivated)
			{
				Collection<Class> emdeExtensionClasses = DataClassesPageHelper.getEmdeExtensionClasses(classes);
				DataClassesPageHelper.updateListViewerContent(listViewer, emdeExtensionClasses);
			}
			else
			{
				DataClassesPageHelper.updateListViewerContent(listViewer, classes);
			}
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {}
	}
}
