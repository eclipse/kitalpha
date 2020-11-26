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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.data.LauncherExtension;

/**
 * @author Boubekeur Zendagui
 */

public class ExtensionSelectionMainPage extends WizardPage {

	private List<LauncherExtension> availableExtensions;
	private Table availableExtensionsTable;
	private Text extensionsDescriptionText;
	private Button selectlAllButton;
	
	/**
	 * Page default constructor. 
	 * @param availableExtensions: The available extension in the target platform.
	 * This list will be displayed 
	 */
	protected ExtensionSelectionMainPage(List<LauncherExtension> availableExtensions) {
		super(Messages.ExtensionSelection_MainPage_Name, Messages.ExtensionSelection_MainPage_Title, null);
		this.availableExtensions = availableExtensions;
	}

	public void createControl(Composite parent) {
		SashForm sashForm = new SashForm(parent, SWT.VERTICAL | SWT.SMOOTH);
		sashForm.setVisible(true);
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		createTopCompositeControls(sashForm);
		setControl(sashForm);
	}
	
	private void createTopCompositeControls(Composite parent){
		if (!availableExtensions.isEmpty()) 
		{
			createExtensionTable(parent);
			populateExtensionsInTabe();
			createDescriptionWidgets(parent);
		}
		else
		{
			cerateNoExtentionComposite(parent);
		}
	}
	
	private void cerateNoExtentionComposite(Composite parent){
		Composite noExtensionComposite = new Composite(parent, SWT.NONE);
		noExtensionComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout noExtensionGL = new GridLayout();
		noExtensionComposite.setLayout(noExtensionGL);
		Label label = new Label(noExtensionComposite, SWT.NONE);
		label.setText("No extensions are available");
	    label.setAlignment(SWT.CENTER);
	    label.setLayoutData( new GridData( SWT.CENTER, SWT.CENTER, true, true) );
	}
	
	/**
	 * This create the table widget wherein the extension will be listed.
	 * @param parent
	 */
	private Composite createExtensionTable(Composite parent) {
		Composite extensionListComposite = new Composite(parent, SWT.NONE);
		extensionListComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout extensionListGL = new GridLayout();
		extensionListComposite.setLayout(extensionListGL);
		
		Label availableExtensionsLabel = new Label(extensionListComposite, SWT.NORMAL);
		availableExtensionsLabel.setText(Messages.ExtensionSelection_MainPage_Label_Available);
		availableExtensionsLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		availableExtensionsLabel.setEnabled(true);
		
		availableExtensionsTable = new Table(extensionListComposite, SWT.CHECK | SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL);
		availableExtensionsTable.setLinesVisible (true);
		availableExtensionsTable.setHeaderVisible (true);
		availableExtensionsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		availableExtensionsTable.setEnabled(true);
		availableExtensionsTable.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (availableExtensionsTable.getSelectionCount() > 0)
				{
					TableItem selection = availableExtensionsTable.getSelection()[0];
					Object object = selection.getData();
					if (object != null)
					{
						LauncherExtension launcherExtension = (LauncherExtension) object;
						// Display Extension description in the description area
						String desc = launcherExtension.extensionDescriptionAttributeValue;
						if (desc != null && extensionsDescriptionText != null)
							extensionsDescriptionText.setText(desc);
					}
				}
				
				if (e.detail == SWT.CHECK)
				{
					Widget widget = e.item;

					TableItem tableItem = (TableItem)widget;
					availableExtensionsTable.setSelection(tableItem);
					synchronizeTableItemWithExtension(tableItem);
				}
			}
		});

		selectlAllButton = new Button(extensionListComposite, SWT.CHECK);
		selectlAllButton.setText("Unselect all");
		selectlAllButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		selectlAllButton.setSelection(true);
		selectlAllButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				final boolean checkState = selectlAllButton.getSelection();
				changeExtensionState(checkState);
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				// Do nothing
			}
		});
		
		return extensionListComposite;
	}
	

	/**
	 * This methods changes the state of all displayed extensions. If user
	 * activate "Select all" so all extension turned on and if he activate 
	 * "Unselect all" all extensions are turned off.  
	 * @param tableItems
	 */
	private void changeExtensionState(boolean state){
		if (selectlAllButton.getSelection())
			selectlAllButton.setText("Unselect all"); 
		else
			selectlAllButton.setText("Select all");
		
		TableItem[] tableItems = availableExtensionsTable.getItems();
		for (TableItem tableItem : tableItems) 
		{
			tableItem.setChecked(state);
			synchronizeTableItemWithExtension(tableItem);
		}
	}
	
	/**
	 * This method synchronize one TableItem with it LauncherExtension. 
	 * LauncherExtension of a TableItem is stored in it Data property.
	 * @param tableItem
	 */
	private void synchronizeTableItemWithExtension(TableItem tableItem){
		Object data = tableItem.getData();
		if (data != null)
		{
			LauncherExtension launcherExtension = (LauncherExtension) data;
			
			for (LauncherExtension iLauncherExtension : availableExtensions) 
			{
				if (iLauncherExtension.equals(launcherExtension) && 
						(iLauncherExtension.isActive() != tableItem.getChecked()))
				{
					iLauncherExtension.setActive(tableItem.getChecked());
					break;
				}
			}
		}
		
	}
	
	/**
	 * This method loop over the available extension list and add all extensions 
	 * in the table widget
	 */
	private void populateExtensionsInTabe(){
		boolean generateCategoryColumn = false;
		for (LauncherExtension iLauncherExtension : availableExtensions) 
		{
			if (iLauncherExtension.extensionCategoryAttributeValue.trim().length() > 0)
			{
				generateCategoryColumn = true;
				break;
			}
		}
		// Create Columns
		String[] titles = {Messages.ExtensionSelection_MainPage_Column1, 
							Messages.ExtensionSelection_MainPage_Column2, 
							Messages.ExtensionSelection_MainPage_Column3};
		int columncount = (generateCategoryColumn ? 3 : 2);
		
		for (int i = 0; i < columncount; i++) 
		{
			TableColumn column = new TableColumn(availableExtensionsTable, SWT.NONE, i);
			column.setText(titles[i]);
			column.setMoveable(i == 0 ? false : true);
			
			int alterWidth = i == 1 ? 190: 140;
			column.setWidth(i == 0 ? 20 : alterWidth);
		}
		
		// Create table lines
		for (LauncherExtension taguableExtension : availableExtensions) 
		{
			addOneExtensionInTable(taguableExtension);
		}
	}
	
	/**
	 * This method add one extension in the table widget
	 * @param extension
	 */
	private void addOneExtensionInTable(LauncherExtension extension){
		TableItem item = new TableItem (availableExtensionsTable, SWT.NONE);
		item.setData(extension);
		item.setText (1, extension.extensionNameAttributeValue);
		item.setText (2, extension.extensionCategoryAttributeValue);
		item.setChecked(true);
	}
	
	/**
	 * This create the extension Description widgets. This area is created 
	 * if at least one extension has a description. If all extensions have'nt 
	 * description this area will not be created
	 * @param parent
	 */
	private void createDescriptionWidgets(Composite parent) {
		boolean createWidgets = false;
		// Loop over extension and check if there is description 
		for (LauncherExtension iLauncherExtension : availableExtensions) 
			if (iLauncherExtension.extensionDescriptionAttributeValue.trim().length() > 0)
			{
				createWidgets = true;
				break;
			}

		if (createWidgets)
		{
			Composite descriptionComposite = new Composite(parent, SWT.NONE);
			descriptionComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
			GridLayout extensionListGL = new GridLayout();
			descriptionComposite.setLayout(extensionListGL);
			
			Label extensionsDescriptionLabel = new Label(descriptionComposite, SWT.NORMAL);
			extensionsDescriptionLabel.setText(Messages.ExtensionSelection_MainPage_Label_Description);
			extensionsDescriptionLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			extensionsDescriptionLabel.setEnabled(true);

			extensionsDescriptionText = new Text(descriptionComposite, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
			extensionsDescriptionText.setEditable(false);
			GridData gd = new GridData(GridData.FILL_BOTH);
			extensionsDescriptionText.setLayoutData(gd);
			extensionsDescriptionText.setEnabled(true);
		}
	}

	public List<LauncherExtension> getAvailableExtensions() {
		if (availableExtensions != null)
		{
			return availableExtensions;
		}
		else
		{
			return new ArrayList<LauncherExtension>();
		}
	}

}
