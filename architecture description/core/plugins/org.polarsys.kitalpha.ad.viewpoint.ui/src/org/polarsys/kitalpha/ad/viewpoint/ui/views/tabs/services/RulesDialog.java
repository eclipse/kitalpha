/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.services;

import java.util.List;

import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;

/**
 * @author Thomas Guiu
 * 
 */
public class RulesDialog extends TrayDialog {
	private ComboViewer viewer;
	private final List<ViewpointElement> values;

	private ISelection selection;

	protected RulesDialog(Shell shell, List<ViewpointElement> list) {
		super(shell);
		// TODO Auto-generated constructor stub
		this.values = list;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite parentComposite = (Composite) super.createDialogArea(parent);
		Composite contents = createComposite(parentComposite);

		viewer = new ComboViewer(contents, SWT.READ_ONLY);
		viewer.setSorter(new ViewerSorter());
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selection = event.getSelection();
			}
		});
		viewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				okPressed();
			}
		});
		viewer.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new LabelProvider() {

			@Override
			public String getText(Object element) {
				return ((ViewpointElement) element).getId();
			}
		});
		viewer.setInput(values);

		return contents;
	}

	private Composite createComposite(Composite parentComposite) {
		// creates a composite with standard margins and spacing
		Composite contents = new Composite(parentComposite, SWT.NONE);

		contents.setLayout(new GridLayout(2, false));
		contents.setLayoutData(new GridData(GridData.FILL_BOTH));

		return contents;
	}

	public ViewpointElement getResult() {
		return (ViewpointElement) ((IStructuredSelection) selection).getFirstElement();
	}
}
