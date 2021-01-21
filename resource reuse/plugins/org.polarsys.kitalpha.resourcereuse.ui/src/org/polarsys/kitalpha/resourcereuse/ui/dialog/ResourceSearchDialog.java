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
package org.polarsys.kitalpha.resourcereuse.ui.dialog;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;
import org.polarsys.kitalpha.resourcereuse.ui.Activator;
import org.polarsys.kitalpha.resourcereuse.ui.Messages;
import org.polarsys.kitalpha.resourcereuse.ui.ResourceReuseImages;

/**
 * @author Thomas Guiu
 * 
 */
public class ResourceSearchDialog extends Dialog {

	private final SearchCriteria criteria;
	private Text idText;
	private Text nameText;
	private Text versionText;
	private Text domainText;
	private final List<StringValue> tags = new ArrayList<StringValue>();
	private final List<StringValue> userConcerns = new ArrayList<StringValue>();
	private final List<StringValue> usedConcerns = new ArrayList<StringValue>();
	private final List<StringValue> involvedInConcerns = new ArrayList<StringValue>();

	public ResourceSearchDialog(Shell parentShell, SearchCriteria criteria) {
		super(parentShell);
		this.criteria = criteria;
		if (criteria == null) {
			throw new NullPointerException();
		}
		setShellStyle(getShellStyle() | SWT.MAX | SWT.RESIZE);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// create a composite with standard margins and spacing
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);

		composite.setLayout(layout);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.minimumHeight = 450;
		layoutData.minimumWidth = 550;
		composite.setLayoutData(layoutData);
		createResourceCriteriaComposite(composite);
		createConcernCriteriaComposite(composite);
		applyDialogFont(composite);
		composite.pack();
		getShell().setText(Messages.Search_dialog_title);
		return composite;
	}

	private void createConcernCriteriaComposite(Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		group.setText(Messages.Concern_group_Label);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.makeColumnsEqualWidth = true;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_BOTH));

		userConcerns.addAll(StringValue.toStringValueList(criteria.getUserInConcerns()));
		usedConcerns.addAll(StringValue.toStringValueList(criteria.getUsedInConcerns()));
		involvedInConcerns.addAll(StringValue.toStringValueList(criteria.getConcerns()));
		createTableComposite(group, userConcerns, "concern", Messages.Concern_userTable_Label, Messages.Concern_Field__AddButton_Label, Messages.Concern_Field__DeleteButton_Label);
		createTableComposite(group, usedConcerns, "concern", Messages.Concern_usedTable_Label, Messages.Concern_Field__AddButton_Label, Messages.Concern_Field__DeleteButton_Label);
		createTableComposite(group, involvedInConcerns, "concern", Messages.Concern_bothTable_Label, Messages.Concern_Field__AddButton_Label, Messages.Concern_Field__DeleteButton_Label);

	}

	private void createResourceCriteriaComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite fields = new Composite(composite, SWT.NONE);
		layout = new GridLayout();
		layout.numColumns = 2;
		fields.setLayout(layout);
		fields.setLayoutData(new GridData(GridData.FILL_BOTH));

		// dummy label
		Label label = new Label(fields, SWT.None);
		GridData layoutData = new GridData();
		layoutData.horizontalSpan = 2;
		label.setLayoutData(layoutData);

		label = new Label(fields, SWT.None);
		label.setText(Messages.id_Field_Label + ':');
		label.setLayoutData(new GridData());
		idText = new Text(fields, SWT.BORDER);
		idText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		idText.setText(toString(criteria.getId()));

		label = new Label(fields, SWT.None);
		label.setText(Messages.name_Field_Label + ':');
		label.setLayoutData(new GridData());
		nameText = new Text(fields, SWT.BORDER);
		nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		nameText.setText(toString(criteria.getName()));

		label = new Label(fields, SWT.None);
		label.setText(Messages.version_Field_Label + ':');
		label.setLayoutData(new GridData());
		versionText = new Text(fields, SWT.BORDER);
		versionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		versionText.setText(toString(criteria.getVersion()));

		label = new Label(fields, SWT.None);
		label.setText(Messages.domain_Field_Label + ':');
		label.setLayoutData(new GridData());
		domainText = new Text(fields, SWT.BORDER);
		domainText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		domainText.setText(toString(criteria.getDomain()));

		tags.addAll(StringValue.toStringValueList(criteria.getTags()));
		createTableComposite(composite, tags, "newTag", Messages.tags_Field_Label + ':', Messages.tags_Field__AddButton_Label, Messages.tags_Field__DeleteButton_Label);
	}

	protected void createTableComposite(Composite parent, final List<StringValue> data, final String defaultValue, String tableLabel, String addLabel, String deleteLabel) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label label = new Label(composite, SWT.NONE);
		label.setText(tableLabel);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		label.setLayoutData(gd);
		final TableViewer viewer = new TableViewer(composite);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setColumnProperties(new String[] { "name" });
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setLabelProvider(new LabelProvider());

		viewer.setCellEditors(new CellEditor[] { new TextCellEditor(viewer.getTable()) });
		viewer.setCellModifier(new ICellModifier() {

			@Override
			public void modify(Object element, String property, Object value) {
				StringValue tag = (StringValue) ((TableItem) element).getData();
				tag.value = value.toString();
				viewer.refresh();
			}

			@Override
			public Object getValue(Object element, String property) {
				StringValue tag = (StringValue) element;
				return tag.value;
			}

			@Override
			public boolean canModify(Object element, String property) {
				return true;
			}
		});

		viewer.setInput(data);

		Composite btnComposite = new Composite(composite, SWT.NONE);
		layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		btnComposite.setLayout(layout);
		btnComposite.setLayoutData(new GridData(GridData.FILL_VERTICAL));

		Button addButton = new Button(btnComposite, SWT.PUSH);
		addButton.setLayoutData(new GridData());
		addButton.setImage(Activator.getDefault().getImage(ResourceReuseImages.IMG_ADD_OBJ));
		addButton.setToolTipText(addLabel);
		addButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				data.add(new StringValue(defaultValue));
				viewer.refresh();
			} 

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {// NOSONAR
			}

		});

		final Button deleteButton = new Button(btnComposite, SWT.PUSH);
		deleteButton.setLayoutData(new GridData());
		deleteButton.setImage(Activator.getDefault().getImage(ResourceReuseImages.IMG_DELETE_OBJ));
		deleteButton.setToolTipText(deleteLabel);
		deleteButton.setEnabled(false);
		deleteButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				for (Object obj : selection.toArray()) {
					data.remove(obj);
				}
				viewer.refresh();
				deleteButton.setEnabled(false);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) { // NOSONAR
			}

		});

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				deleteButton.setEnabled(!event.getSelection().isEmpty());
			}
		});

	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// create OK and Cancel buttons by default
		createButton(parent, IDialogConstants.OK_ID, Messages.Search_Button_Label, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected void okPressed() {
		criteria.setId(idText.getText());
		criteria.setName(nameText.getText());
		criteria.setVersion(versionText.getText());
		criteria.setDomain(domainText.getText());

		criteria.getTags().clear();
		criteria.getTags().addAll(StringValue.toStringList(tags));
		criteria.getConcerns().clear();
		criteria.getConcerns().addAll(StringValue.toStringList(involvedInConcerns));
		criteria.getUsedInConcerns().clear();
		criteria.getUsedInConcerns().addAll(StringValue.toStringList(usedConcerns));
		criteria.getUserInConcerns().clear();
		criteria.getUserInConcerns().addAll(StringValue.toStringList(userConcerns));

		super.okPressed();

	}

	private String toString(String value) {
		return value == null ? "" : value;
	}
}
