/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.dialogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.model.edit.helpers.ParentHelper;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * @author Thomas Guiu
 * 
 */
public class LoadViewpointModelDialog extends TitleAreaDialog {

	private ListViewer viewer;
	private List<Resource> result = new ArrayList<Resource>();
	private Viewpoint viewpoint;

	public LoadViewpointModelDialog(Shell shell, Viewpoint viewpoint) {
		super(shell);
		this.viewpoint = viewpoint;

	}

	protected Control createDialogArea(Composite parent) {
		// top level composite
		Composite parentComposite = (Composite) super.createDialogArea(parent);

		initializeDialogUnits(parentComposite);

		// creates dialog area composite
		Composite contents = createComposite(parentComposite);

		// creates and lay outs dialog area widgets
		createWidgets(contents);

		init();

		Dialog.applyDialogFont(parentComposite);

		return contents;
	}

	public void init() {
		
		viewer.setInput(ParentHelper.getCandidateResources(viewpoint));
	}

	private void createWidgets(Composite parent) {
		viewer = new ListViewer(parent);
		viewer.getList().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				getButton(IDialogConstants.OK_ID).setEnabled(!event.getSelection().isEmpty());
			}
		});
		viewer.setSorter(new ViewerSorter());
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				okPressed();
			}
		});
		viewer.setContentProvider(new IStructuredContentProvider() {

			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			public void dispose() {
			}

			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof Collection) {
					return ((Collection<?>) inputElement).toArray();
				}
				return new Object[0];
			}
		});
		viewer.setLabelProvider(new LabelProvider() {

			@Override
			public String getText(Object element) {
				Resource vp = (Resource) element;
				return vp.getName() + "  [" + vp.getProviderSymbolicName() + "]";
			}
		});
	}

	protected void createButtonsForButtonBar(Composite parent) {
		// create OK and Cancel buttons by default
		createButton(parent, IDialogConstants.OK_ID, Messages.Dialog_Add_label, true).setEnabled(false);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	private Composite createComposite(Composite parentComposite) {
		// creates a composite with standard margins and spacing
		Composite contents = new Composite(parentComposite, SWT.NONE);

		contents.setLayout(new GridLayout(1, false));
		contents.setLayoutData(new GridData(GridData.FILL_BOTH));

		setTitle(Messages.LoadAFModelDialog_title);
		setMessage(Messages.LoadAFModelDialog_description);
		return contents;
	}

	@Override
	protected void okPressed() {
		IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
		for (Object obj : ss.toArray()) {
			result.add((Resource) obj);
		}
		super.okPressed();
	}

	public List<Resource> getResult() {
		return result;
	}

}
