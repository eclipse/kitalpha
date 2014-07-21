/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.ui.pages;


import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.polarsys.kitalpha.ad.services.detachment.core.services.IDetachmentService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback.FeedbackLevel;
import org.polarsys.kitalpha.ad.services.detachment.ui.messages.Messages;
import org.polarsys.kitalpha.ad.services.detachment.ui.pages.providers.FinderResultContentProvider;


/**
 * Wizard page where are depicated unknown references
 * 
 * @author Mathieu Helleboid
 * @author Faycal Abka
 *
 */
@SuppressWarnings("unused")
public class DetachmentUndefinedReferencesPage extends WizardPage {
	
	private Table 	table;
	private TableViewer tableViewer;
	private FinderResultContentProvider contentProvider;
	private Button removeUndefRef;
	private IFeedback messages;
	
	public DetachmentUndefinedReferencesPage(IFeedback messages){
		super(Messages.EMPTY_STRING);
		
		this.messages = messages;
		
		setTitle(Messages.WIZARD_PAGE_UR_TITLE);
		setDescription(Messages.WIZARD_PAGE_UR_DESCRIPTION);
		
		setPageComplete(true);
	}
	

	/**
	 * Content of the wizard page
	 */
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		
		setControl(container);
		container.setLayout(new GridLayout(3, false));
		
		//table where undefined references will be displayed
		tableViewer = new TableViewer(container, SWT.BORDER | SWT.FULL_SELECTION);
		table 		= tableViewer.getTable();
		
		GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd_table.heightHint = 140;
		table.setLayoutData(gd_table);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		contentProvider = new FinderResultContentProvider();
		tableViewer.setContentProvider(contentProvider);
		tableViewer.setLabelProvider(contentProvider);
		
		//Checkbox button
		removeUndefRef = new Button(container, SWT.CHECK);
		removeUndefRef.setText("Remove unknown references");
		removeUndefRef.setSelection(true);
		
		tableViewer.setInput(messages);

	}
	
	@Override
	public boolean canFlipToNextPage(){
		return true;
	}
	
	public boolean getRemoveUndefRefSelection(){
		if (removeUndefRef != null)
			return removeUndefRef.getSelection();
		
		//remove undefined reference anyway
		return true;
	}
}
