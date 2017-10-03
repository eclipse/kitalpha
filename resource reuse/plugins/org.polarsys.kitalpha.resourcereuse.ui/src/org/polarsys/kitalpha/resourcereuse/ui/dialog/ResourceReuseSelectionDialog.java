/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.ui.dialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;
import org.polarsys.kitalpha.resourcereuse.ui.Activator;
import org.polarsys.kitalpha.resourcereuse.ui.Messages;
import org.polarsys.kitalpha.resourcereuse.ui.ResourceReuseImages;

/**
 * @author Thomas Guiu
 * 
 */
public class ResourceReuseSelectionDialog extends TitleAreaDialog {

	private static final String DEFAULT_MESSAGE = "Setup criteria to match a resource";
	private final SearchCriteria criteria = new SearchCriteria();
	private Text idText;
	private Text nameText;
	private Text versionText;
	private Text domainText;
	private Label detailsLabel;
	private final List<StringValue> tags = new ArrayList<StringValue>();
	private final ResourceHelper helper;
	private TableViewer matchingResourceViewer;
	private Label matchingResourceLabel;

	public ResourceReuseSelectionDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		helper = ResourceReuse.createHelper(); 
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Select resource");
		shell.setImage(Activator.getDefault().getImage(ResourceReuseImages.IMG_SEARCH_OBJ));
		shell.setMinimumSize(1000, 800);
	}

	private void updateMatchingResources() {
		criteria.setId(idText.getText());
		criteria.setName(nameText.getText());
		criteria.setVersion(versionText.getText());
		criteria.setDomain(domainText.getText());
		criteria.getTags().clear();
		for (StringValue sv : tags)
			criteria.getTags().add(sv.value);
		
		Resource[] resources = null;
		setErrorMessage(null);
		setMessage(DEFAULT_MESSAGE);
		try {
			resources = helper.getResources(criteria);
		} catch (IllegalArgumentException e) {
			setErrorMessage(e.getMessage());
		}
		
		matchingResourceViewer.setInput(resources);
		matchingResourceLabel.setText("Matching resources ("+(resources == null? 0:resources.length)+"):");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// create a composite with standard margins and spacing
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);

		composite.setLayout(layout);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		composite.setLayoutData(layoutData);

		Composite subComposite = new Composite(composite, SWT.NONE);
		GridLayout subLayout = new GridLayout();
		subComposite.setLayout(subLayout);
		GridData subLayoutData = new GridData(GridData.FILL_BOTH);
		subLayoutData.minimumWidth = 550;
		subComposite.setLayoutData(subLayoutData);
		
		createCriteriaComposite(subComposite);
		createMatchingComposite(composite);
		createDetailComposite(subComposite);
		applyDialogFont(composite);
		composite.pack();
		
		setMessage(DEFAULT_MESSAGE);
		setTitle("Load Model Reusue resource");
		return composite;
	}

	private void createDetailComposite(Composite composite) {
		Group grp = createGroup(composite, "Details");
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		grp.setLayout(layout);
		detailsLabel = new Label(grp, SWT.NONE );
		detailsLabel.setLayoutData(new GridData(GridData.FILL_BOTH) );
		detailsLabel.setText("");
	}

	private void createMatchingComposite(Composite composite) {
		Composite grp = new Composite(composite, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		grp.setLayout(layout);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		grp.setLayoutData(layoutData);

		matchingResourceLabel = new Label(grp, SWT.None);
		matchingResourceLabel.setText("Matching resources:");
		matchingResourceLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL) );
		matchingResourceViewer = new TableViewer(grp);
		matchingResourceViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		matchingResourceViewer.setColumnProperties(new String[] { "name" });
		matchingResourceViewer.setContentProvider(ArrayContentProvider.getInstance());
		matchingResourceViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Resource)
					return ((Resource)element).getName();
				return super.getText(element);
			}
		});
		
		matchingResourceViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection)event.getSelection();
				Object element = selection.getFirstElement();
				String label = "";
				if (element instanceof Resource) {
					Resource r = (Resource)element;
					label = "\n id=" + r.getId() + "\n name=" + r.getName() + "\n version=" + r.getVersion() + "\n domain=" + r.getDomain() + "\n provider symbolic name="+ r.getProviderSymbolicName();
					label += "\n provider location = " + r.getProviderLocation() + "\n path=" + r.getPath() + "\n metada path = ?"+  "\n tags=" + Arrays.toString(r.getTags().toArray());
					 
				}
				detailsLabel.setText(label);
			}
		});
	}

	private void createCriteriaComposite(Composite parent) {
		Group composite = createGroup(parent, "Criteria");
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite fields = new Composite(composite, SWT.NONE);
		layout = new GridLayout();
		layout.numColumns = 2;
		fields.setLayout(layout);
		fields.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

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
		ModifyListener listener = new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				updateMatchingResources();
			}
		};
		idText.addModifyListener(listener);

		label = new Label(fields, SWT.None);
		label.setText(Messages.name_Field_Label + ':');
		label.setLayoutData(new GridData());
		nameText = new Text(fields, SWT.BORDER);
		nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		nameText.setText(toString(criteria.getName()));
		nameText.addModifyListener(listener);

		label = new Label(fields, SWT.None);
		label.setText(Messages.version_Field_Label + ':');
		label.setLayoutData(new GridData());
		versionText = new Text(fields, SWT.BORDER);
		versionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		versionText.setText(toString(criteria.getVersion()));
		versionText.addModifyListener(listener);

		label = new Label(fields, SWT.None);
		label.setText(Messages.domain_Field_Label + ':');
		label.setLayoutData(new GridData());
		domainText = new Text(fields, SWT.BORDER);
		domainText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		domainText.setText(toString(criteria.getDomain()));
		domainText.addModifyListener(listener);

		tags.addAll(StringValue.toStringValueList(criteria.getTags()));
		createTableComposite(composite, tags, "newTag", Messages.tags_Field_Label + ':', Messages.tags_Field__AddButton_Label, Messages.tags_Field__DeleteButton_Label);

	}


	protected void createTableComposite(Composite parent, final List<StringValue> data, final String defaultValue, String tableLabel, String addLabel, String deleteLabel) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = 2;
		layout.marginWidth = 2;
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
				updateMatchingResources();
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
				for (Object obj : selection.toArray())
					data.remove(obj);
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
				updateMatchingResources();
			}
		});

	}

	private Group createGroup(Composite composite, String label) {
		Group group = new Group (composite, SWT.NONE);
		group.setText(label);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.minimumHeight = 90;
		group.setLayoutData(layoutData);
		return group;
	}
	private String toString(String value) {
		return value == null ? "" : value;
	}

	public SearchCriteria getCriteria() {
		return criteria;
	}

}
