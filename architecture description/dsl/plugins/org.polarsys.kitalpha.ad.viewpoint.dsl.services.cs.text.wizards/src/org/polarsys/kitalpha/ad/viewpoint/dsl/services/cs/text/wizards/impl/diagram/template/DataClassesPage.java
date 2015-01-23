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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;

/**
 * 
 * @author Faycal Abka
 *
 */
public class DataClassesPage extends WizardPage{
	
	Collection<Class> classes;
	final Collection<Class> selectedClass = new HashSet<Class>(1);;
	
	protected DataClassesPage(String pageName) {
		super(pageName);
	}
	
	protected DataClassesPage(String pageName, Collection<Class> classes){
		this(pageName);
		this.classes = classes;
		setDescription("Select The Diagram Domain Class");
	}

	@Override
	public void createControl(Composite parent) {
		
		ListViewer listViewer = new ListViewer(parent, SWT.BORDER);
		
		parent.setLayout(new FillLayout());
		
		setControl(parent);
		
		listViewer.setLabelProvider(new LabelProvider(){
			
			public Image getImage(Object element){
				return null;
			}
			
			public String getText(Object element){
				return ((Class)element).getName();
			}
			
			
		});
		
		
		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				//TODO when give to the user ability to select several classes
				selectedClass.clear();
				Class tmp = (Class) ((IStructuredSelection)event.getSelection()).getFirstElement();
				selectedClass.add(tmp);
			}
		});
		
		listViewer.setContentProvider(new IStructuredContentProvider() {
			
			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				
			}
			
			@Override
			public void dispose() {
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public Object[] getElements(Object inputElement) {
				return ((Collection<Class>)inputElement).toArray();
			}
		});
		
		setVisible(true);
		listViewer.setInput(classes);
	}
	
	
	public Collection<Class> getSelectedClass() {
		return selectedClass;
	}
	
	public boolean isUserSelectedDomainContext(){
		return !selectedClass.isEmpty();
	}

}
