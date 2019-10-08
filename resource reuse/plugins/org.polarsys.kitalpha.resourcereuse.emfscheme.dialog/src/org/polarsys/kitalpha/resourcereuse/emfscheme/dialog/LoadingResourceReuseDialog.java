/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.dialog;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.services.GeneralServices;
import org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.services.GeneralServices.StringValue;
import org.polarsys.kitalpha.resourcereuse.emfscheme.utils.context.ModelReuseContext;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;
import org.polarsys.kitalpha.resourcereuse.ui.Activator;
import org.polarsys.kitalpha.resourcereuse.ui.Messages;
import org.polarsys.kitalpha.resourcereuse.ui.ResourceReuseImages;

/**
 * Dialog which permits you to load a resource stored in the resource reuse
 * library. Filters are used for specify criteria. Criteria is used for find and
 * load a specific resource. This resource is used for build a model using tools
 * provided by the loaded resource.
 * 
 * @author Xavier DECOOL
 * 
 */
public class LoadingResourceReuseDialog extends Dialog {

	// tools used for my dialog
	EObject selection;
	Text idText;
	SearchCriteria criteria = new SearchCriteria();
	String wordTyped = "";
	protected Table resultsTable;
	boolean addButtonPressed = false;

	// my texts
	Text nameText;
	Text domainText;
	Text versionText;
	String uriText;
	private final java.util.List<StringValue> tags = new ArrayList<>();

	private boolean okEnabled = false;

	// constructor
	public LoadingResourceReuseDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE);

	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.Messages.firstPageTittle);
		shell.setImage(GeneralServices.getParentImage());
		shell.setMinimumSize(800, 600);
	}

	@Override
	protected Control createDialogArea(Composite parent) {

		Composite main = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		layout.numColumns = 2;
		layout.marginHeight = 5;
		layout.marginWidth = 5;

		main.setLayout(layout);

		// layout data settings
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.minimumHeight = 300;
		layoutData.minimumWidth = 100;
		main.setLayoutData(layoutData);

		createFilterGroup(main);
		createResultsGroup(main);
		setUpListeners();
		return super.createDialogArea(parent);
	}

	private void setUpListeners() {
		// ID
		idText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (idText.getCharCount() != 0) {
					criteria.setId(idText.getText(0, idText.getCharCount())
							+ ".*");
				} else {
					criteria.setId(".*");
				}
				GeneralServices.refreshResultsAccordingToCriteria(criteria,
						resultsTable, getParentShell());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// nothing to do
			}
		});

		// Name
		nameText.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				/*
				 * survey of nameText. If nameText is set, that refresh result
				 * Table. That set criteria name <what_i've_typed>+.* for make
				 * criteria able to retrieve resource Example : Aimed resource
				 * is named EclipseModel If we type Ecli in the nameText zone,
				 * criteria will be set to Ecli.* and it's ok for retrieve the
				 * resource named EclipseModel (.* regex is implemented)
				 */
				if (nameText.getCharCount() != 0) {
					criteria.setName(nameText.getText(0,
							nameText.getCharCount())
							+ ".*");
				} else {
					criteria.setName("");
				}
				GeneralServices.refreshResultsAccordingToCriteria(criteria,
						resultsTable, getParentShell());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// nothing to do
			}
		});

		// Domain
		domainText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (domainText.getCharCount() != 0) {
					criteria.setDomain(domainText.getText(0,
							domainText.getCharCount())
							+ ".*");
				} else {
					criteria.setDomain("");
				}
				GeneralServices.refreshResultsAccordingToCriteria(criteria,
						resultsTable, getParentShell());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// nothing to do
			}
		});

		// Version
		versionText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (versionText.getCharCount() != 0) {
					criteria.setVersion(versionText.getText(0,
							versionText.getCharCount()));
				} else {
					criteria.setVersion("");
				}
				GeneralServices.refreshResultsAccordingToCriteria(criteria,
						resultsTable, getParentShell());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// nothing to do
			}
		});

		resultsTable.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				TableItem[] resultSelection = resultsTable.getSelection();
				if (resultSelection.length >= 1) {
					updateOKState(true);
				} else {
					updateOKState(false);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing to do
			}
		});
		
		resultsTable.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent e) {
				//nothing to do
			}
			
			@Override
			public void mouseDown(MouseEvent e) {
				//nothing to do
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				//if i double click on a resource, i "virtually" press OK with my selection
				okPressed();
			}
		});

	}


	/**
	 * Setter of selected Object, used for retrieve selected resource set where
	 * resource need to be load
	 * 
	 * @param selection
	 *            : The selected Object
	 */
	public void setSelection(EObject selection) {
		this.selection = selection;
	}

	/**
	 * Update the statement of dialog's OK button
	 * 
	 * @param state
	 *            : true if a resource is selected, false otherwise
	 */
	protected void updateOKState(boolean state) {
		Button okButton = getButton(IDialogConstants.OK_ID);
		if (okButton != null && !okButton.isDisposed() && state != okEnabled) {
			okButton.setEnabled(state);
			okEnabled = state;
		}
	}

	/**
	 * Override of Dialog's okPressed() method. Retrieving of resource set and
	 * load of founded resource in it
	 */
	@Override
	protected void okPressed() {
		
		ModelReuseContext context = ModelReuseContext.INSTANCE;
		final Session session = SessionManager.INSTANCE.getSession(selection);
		
		context.setSession(session);
		context.resetCriterias();

		for (TableItem currentItem : resultsTable.getSelection()) {
			SearchCriteria settedCriteria = (SearchCriteria) currentItem
					.getData();
			context.addCriteria(settedCriteria);
		}
		super.okPressed();
	}

	/**
	 * Creation of filter group used for retrieve and refresh resources in the
	 * result group using criterias.
	 * 
	 * @param parent
	 *            : Composite where is stored the filters group
	 */
	private void createFilterGroup(Composite parent) {
		// Creating my filter group
		Group filterGroup = new Group(parent, SWT.FILL);
		GridData layoutData = new GridData(GridData.FILL_BOTH);

		// layout of filter group
		GridLayout layoutFilterGroup = new GridLayout();
		layoutFilterGroup.numColumns = 2;
		filterGroup
				.setText(org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.Messages.filtersPartLabel);
		filterGroup.setLayout(layoutFilterGroup);
		layoutData.minimumHeight = 400;
		filterGroup.setLayoutData(layoutData);

		// layout of my filter's composite
		Composite filter = new Composite(filterGroup, SWT.NONE);
		GridLayout filterCompositeLayout = new GridLayout();
		filterCompositeLayout.numColumns = 1;
		filter.setLayout(filterCompositeLayout);
		filter.setLayoutData(new GridData(GridData.FILL_BOTH));
		buildFiltersContents(filterGroup, filter);

	}

	/**
	 * Method used for build filters Texts. Texts are used to specify criterias
	 * which permit to retrieve resources
	 * 
	 * @param filterGroup
	 *            : Group where will be store Texts
	 * @param filter
	 *            : Composite parent of filters
	 */
	private void buildFiltersContents(Group filterGroup, Composite filter) {

		// creation of id Text
		Label idLabel = new Label(filter, SWT.None);
		idLabel.setText(org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.Messages.idFilterLabel);
		idLabel.setLayoutData(new GridData());

		idText = new Text(filter, SWT.BORDER);
		idText.setText(".*");
		idText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// creation of Name Text
		Label nameLabel = new Label(filter, SWT.None);
		nameLabel
				.setText(org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.Messages.nameFilterLabel);
		nameLabel.setLayoutData(new GridData());

		nameText = new Text(filter, SWT.BORDER);
		nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// creation of Domain Text
		Label domainLabel = new Label(filter, SWT.None);
		domainLabel
				.setText(org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.Messages.domainFilterLabel);
		domainLabel.setLayoutData(new GridData());

		domainText = new Text(filter, SWT.BORDER);
		domainText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// creation of Version Text
		Label versionLabel = new Label(filter, SWT.None);
		versionLabel
				.setText(org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.Messages.versionFilterLabel);
		versionLabel.setLayoutData(new GridData());

		versionText = new Text(filter, SWT.BORDER);
		versionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		tags.addAll(GeneralServices.toStringValueList(criteria.getTags()));

		// Tags Table creation
		createTagsTableComposite(filter, tags, "newTag",
				Messages.tags_Field_Label + ':',
				Messages.tags_Field__AddButton_Label,
				Messages.tags_Field__DeleteButton_Label);
	}

	/**
	 * Method used for create Tags part of filters
	 * 
	 * @param parent
	 *            : Composite parent
	 * @param data
	 *            : List of tags which need to be fill
	 * @param defaultValue
	 *            : The default value used when you create a new tag
	 * @param tableLabel
	 *            : Label of the table
	 * @param addLabel
	 *            : Label of add button tool tips
	 * @param deleteLabel
	 *            : Label of delete button tool tips
	 */
	protected void createTagsTableComposite(Composite parent,
			final java.util.List<StringValue> data, final String defaultValue,
			String tableLabel, String addLabel, String deleteLabel) {
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

		// Table creation
		final TableViewer viewer = new TableViewer(composite);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setColumnProperties(new String[] { "name" });
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setLabelProvider(new LabelProvider());

		viewer.setCellEditors(new CellEditor[] { new TextCellEditor(viewer
				.getTable()) });

		// Cell listener for evaluate new tags' settings
		viewer.setCellModifier(new ICellModifier() {
			
			@Override
			public void modify(Object element, String property, Object value) {
				
				TableItem tableItem = (TableItem) element;
				StringValue tag = (StringValue) tableItem.getData();
				tag.setValue(value.toString());
				// if my criteria doesn't contain this value
				if (!criteria.getTags().contains(tag.getValue())) {
					// i test if my criteria's tags fits with one or more model(s)
					if(addButtonPressed){
						criteria.getTags().add(tag.getValue());
						addButtonPressed = false;
					}
					// else i'm on the case that i'm modifying an existing tag
					else{
						criteria.getTags().remove(tableItem.getText());
						criteria.getTags().add(tag.getValue());
					}
					boolean currentTagFitWithModels = GeneralServices
							.checkIfCurrentTagFitsWithModels(tag.getValue(),
									getParentShell());
					if (currentTagFitWithModels) {
						//i refresh
						GeneralServices.refreshResultsAccordingToCriteria(
								criteria, resultsTable, getParentShell());
					}
					// if not
					else {
						// i remove this tag
						data.clear();
						criteria.getTags().remove(tag.getValue());
						List<StringValue> stringValueList = GeneralServices
								.toStringValueList(criteria.getTags());
						data.addAll(stringValueList);
						// if it's not the last tag i reload search criteria
						// with existing tags
						if (!data.isEmpty()) {
							GeneralServices.refreshResultsAccordingToCriteria(
									criteria, resultsTable, getParentShell());
						} else {
							SearchCriteria temp = new SearchCriteria();
							temp.setId(".*");
							GeneralServices.refreshResultsAccordingToCriteria(
									temp, resultsTable, getParentShell());
						}
					}
				}
				// current tag already exists (only if i click on add button)
				else if (addButtonPressed){
					GeneralServices.constructDialogForExistingTag(tag.getValue(), getParentShell());
					criteria.getTags().add(tag.getValue());
					addButtonPressed = false;
					GeneralServices.refreshResultsAccordingToCriteria(criteria, resultsTable, getParentShell());
				}
				viewer.refresh();
			}

			@Override
			public Object getValue(Object element, String property) {
				StringValue tag = (StringValue) element;
				return tag.getValue();
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

		// add button creation
		Button addButton = new Button(btnComposite, SWT.PUSH);
		addButton.setLayoutData(new GridData());
		addButton.setImage(Activator.getDefault().getImage(
				ResourceReuseImages.IMG_ADD_OBJ));
		addButton.setToolTipText(addLabel);

		// Add listener on add button
		addButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				data.add(new StringValue(defaultValue));
				addButtonPressed = true;
				viewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// unused
			}
		});

		// Delete button creation
		final Button deleteButton = new Button(btnComposite, SWT.PUSH);
		deleteButton.setLayoutData(new GridData());
		deleteButton.setImage(Activator.getDefault().getImage(
				ResourceReuseImages.IMG_DELETE_OBJ));
		deleteButton.setToolTipText(deleteLabel);
		deleteButton.setEnabled(false);

		// Add listener on delete button
		deleteButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection currentSelection = (IStructuredSelection) viewer
						.getSelection();
				Object[] array = currentSelection.toArray();
				for (Object obj : array) {
					data.remove(obj);
					String tagsToRemove = obj.toString();
					criteria.getTags().remove(tagsToRemove);
				}
				viewer.refresh();
				deleteButton.setEnabled(false);
				GeneralServices.refreshResultsAccordingToCriteria(criteria,
						resultsTable, getParentShell());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing to select by default
			}
		});
		// Selection changed listener used for unable delete button if tags are
		// empty
		// in the TableViwer
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				deleteButton.setEnabled(!event.getSelection().isEmpty());
			}
		});
	}

	/**
	 * Creation of results group used for select resource to load according to
	 * criterias.
	 * 
	 * @param parent
	 *            : Composite where is stored the results group
	 */
	private void createResultsGroup(Composite parent) {

		// Creating my result group
		Group resultGroup = new Group(parent, SWT.FILL);
		GridData layoutDataResult = new GridData(GridData.FILL_BOTH);
		resultGroup
				.setText(org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.Messages.resultsLabel);

		// layout of result group
		GridLayout layoutResultGroup = new GridLayout();
		layoutResultGroup.numColumns = 1;
		resultGroup.setLayout(layoutResultGroup);
		resultGroup.setLayoutData(layoutDataResult);

		// Creation of resultTable containing resources to load
		resultsTable = new Table(resultGroup, SWT.MULTI | SWT.BORDER
				| SWT.V_SCROLL | SWT.H_SCROLL);
		GridData resultListLayoutData = new GridData(GridData.FILL_BOTH);
		resultListLayoutData.heightHint = 12 * resultsTable.getItemHeight();
		resultsTable.setLayoutData(resultListLayoutData);

		criteria = new SearchCriteria();
		criteria.setId(idText.getText());
		GeneralServices.refreshResultsAccordingToCriteria(criteria,
				resultsTable, getParentShell());
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control temp = super.createButtonBar(parent);
		getButton(IDialogConstants.OK_ID).setEnabled(false);
		return temp;
	}
}
