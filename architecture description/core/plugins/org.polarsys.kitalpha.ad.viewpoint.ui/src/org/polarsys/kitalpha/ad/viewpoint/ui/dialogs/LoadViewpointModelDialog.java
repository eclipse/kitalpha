/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.dialogs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.model.edit.helpers.ParentHelper;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class LoadViewpointModelDialog extends TitleAreaDialog {

	private ListViewer viewer;
	private List<Resource> result = new ArrayList<>();
	private Viewpoint viewpoint;

	public LoadViewpointModelDialog(Shell shell, Viewpoint viewpoint) {
		super(shell);
		this.viewpoint = viewpoint;

	}

	@Override
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
		viewer.addSelectionChangedListener(event -> getButton(IDialogConstants.OK_ID).setEnabled(!event.getSelection().isEmpty()));
		viewer.setSorter(new ViewerSorter());
		viewer.addDoubleClickListener(event -> okPressed());
		viewer.setContentProvider(new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				//nothing to do
			}

			@Override
			public void dispose() {
				//nothing to do
			}

			@Override
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
				if (vp.getName() == null){
					return "No name  [" + vp.getProviderSymbolicName() + "]";
				}
				return vp.getName() + "  [" + vp.getProviderSymbolicName() + "]";
			}
		});
	}

	@Override
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
