/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRuleHandler;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.SelectionListener2;

/**
 * @author Thomas Guiu
 * 
 */
public class RelatedRulesDialog extends TitleAreaDialog {

	private ListViewer viewer;
	private Button addBtn;
	private Button deleteBtn;
	private Button upBtn;
	private Button downBtn;
	private final java.util.List<Rule> rules;
	private final IRuleHandler handler;

	public RelatedRulesDialog(Shell parentShell, IRuleHandler handler, Rule[] values) {
		super(parentShell);
		this.handler = handler;
		rules = new ArrayList<Rule>();
		for (Rule r : values) {
			rules.add(r);
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// top level composite
		Composite parentComposite = (Composite) super.createDialogArea(parent);

		initializeDialogUnits(parentComposite);

		// creates dialog area composite
		Composite contents = createComposite(parentComposite);

		// creates and lay outs dialog area widgets
		createList(contents);
		createButtons(contents);

		init();

		Dialog.applyDialogFont(parentComposite);

		return contents;
	}

	private void init() {

		viewer.setInput(rules);
		viewer.setSelection(new StructuredSelection());
	}

	private void createButtons(Composite contents) {

		Composite bar = new Composite(contents, SWT.NONE);
		bar.setLayoutData(new GridData(GridData.FILL_VERTICAL));
		bar.setLayout(new GridLayout());

		addBtn = new Button(bar, SWT.PUSH);
		addBtn.setToolTipText(Messages.RelatedRulesDialog_add_tooltip);
		addBtn.setImage(Activator.getDefault().getImage(AFImages.ADD));
		addBtn.setLayoutData(new GridData());
		addBtn.addSelectionListener(new SelectionListener2() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				RulesDialog dialog = new RulesDialog(getShell(), handler.getElements());
				if (dialog.open() == Window.OK) {
					Rule rule = (Rule) dialog.getResult();
					rules.add(rule);
					viewer.refresh();
				}
			}
		});

		deleteBtn = new Button(bar, SWT.PUSH);
		deleteBtn.setToolTipText(Messages.RelatedRulesDialog_delete_tooltip);
		deleteBtn.setImage(Activator.getDefault().getImage(AFImages.DELETE));
		deleteBtn.setLayoutData(new GridData());
		deleteBtn.addSelectionListener(new SelectionListener2() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (Object obj : ((IStructuredSelection) viewer.getSelection()).toArray()) {
					rules.remove(obj);
				}
				viewer.refresh();
			}
		});

		upBtn = new Button(bar, SWT.PUSH);
		upBtn.setToolTipText(Messages.RelatedRulesDialog_up_tooltip);
		upBtn.setImage(Activator.getDefault().getImage(AFImages.UP));
		upBtn.setLayoutData(new GridData());
		upBtn.addSelectionListener(new SelectionListener2() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				java.util.List<Object> selected = Arrays.asList(((IStructuredSelection) viewer.getSelection()).toArray());
				for (int n = 1; n < rules.size(); n++) {
					Rule rule = rules.get(n);
					if (selected.contains(rule)) {
						Rule previous = rules.get(n - 1);
						rules.set(n - 1, rule);
						rules.set(n, previous);
					}
				}
				viewer.refresh();
				updateButtons();
			}
		});

		downBtn = new Button(bar, SWT.PUSH);
		downBtn.setToolTipText(Messages.RelatedRulesDialog_down_tooltip);
		downBtn.setImage(Activator.getDefault().getImage(AFImages.DOWN));
		downBtn.setLayoutData(new GridData());
		downBtn.addSelectionListener(new SelectionListener2() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				java.util.List<Object> selected = Arrays.asList(((IStructuredSelection) viewer.getSelection()).toArray());
				for (int n = rules.size() - 2; n >= 0; n--) {
					Rule rule = rules.get(n);
					if (selected.contains(rule)) {
						Rule previous = rules.get(n + 1);
						rules.set(n + 1, rule);
						rules.set(n, previous);
					}
				}
				viewer.refresh();
				updateButtons();
			}
		});

	}

	private void createList(Composite parent) {
		viewer = new ListViewer(parent);
		viewer.getList().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setContentProvider(new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			@Override
			public void dispose() {
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
				Rule rule = (Rule) element;
				return rule.getId() + "  [" + rule.getImplementation() + "]";
			}
		});
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				updateButtons();
			}

		});
	}

	private Composite createComposite(Composite parentComposite) {
		// creates a composite with standard margins and spacing
		Composite contents = new Composite(parentComposite, SWT.NONE);

		contents.setLayout(new GridLayout(2, false));
		contents.setLayoutData(new GridData(GridData.FILL_BOTH));

		setTitle(Messages.RelatedRulesDialog_title);
		setMessage(Messages.RelatedRulesDialog_description);
		return contents;
	}

	public Rule[] getResult() {
		return rules.toArray(new Rule[rules.size()]);
	}

	private void updateButtons() {
		IStructuredSelection sel = (IStructuredSelection) viewer.getSelection();
		deleteBtn.setEnabled(!sel.isEmpty());
		List list = viewer.getList();
		if (sel.isEmpty()) {
			upBtn.setEnabled(false);
			downBtn.setEnabled(false);
		} else {
			int[] selectionIndices = list.getSelectionIndices();
			int min = min(selectionIndices);
			int max = max(selectionIndices);
			upBtn.setEnabled(min > 0);
			downBtn.setEnabled(max < (list.getItemCount() - 1));
		}
	}

	private int max(int[] selectionIndices) {
		int result = -1;
		for (int n : selectionIndices) {
			if (n > result) {
				result = n;
			}
		}
		return result;
	}

	private int min(int[] selectionIndices) {
		int result = -1;
		for (int n : selectionIndices) {
			if (n < result || result < 0) {
				result = n;
			}
		}
		return result;
	}

}
