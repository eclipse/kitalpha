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

package org.polarsys.kitalpha.ad.viewpoint.ui.integration.services;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;
import org.eclipse.jdt.internal.ui.dialogs.TextFieldNavigationHandler;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.NewElementWizardPage;

/**
 * @author Thomas Guiu
 * 
 */
public class NewServiceWizardPage extends NewElementWizardPage {

	private final static String PAGE_NAME = "NewClassWizardPage"; //$NON-NLS-1$

	private final static String SETTINGS_CREATEMAIN = "create_main"; //$NON-NLS-1$
	private final static String SETTINGS_CREATECONSTR = "create_constructor"; //$NON-NLS-1$
	private final static String SETTINGS_CREATEUNIMPLEMENTED = "create_unimplemented"; //$NON-NLS-1$

	protected final static String SERVICE_TYPE = "service.type";

	protected StringDialogField fServiceTypeDialogField;
	protected IStatus fServiceTypeStatus;

	/**
	 * Creates a new <code>NewClassWizardPage</code>
	 */
	public NewServiceWizardPage() {
		super(true, PAGE_NAME);
		setTitle(Messages.NewServiceWizardPage_title);
		setDescription(Messages.NewServiceWizardPage_description);
		fServiceTypeDialogField = new StringDialogField();
		fServiceTypeDialogField.setDialogFieldListener(new IDialogFieldListener() {

			public void dialogFieldChanged(DialogField field) {
				handleFieldChanged(SERVICE_TYPE);
			}
		});
		fServiceTypeDialogField.setLabelText(Messages.ServiceWizard_type_label);

	}

	protected void createTypeControls(Composite composite, int nColumns) {
		fServiceTypeDialogField.doFillIntoGrid(composite, nColumns - 1);
		DialogField.createEmptySpace(composite);
		Text text = fServiceTypeDialogField.getTextControl(null);
		LayoutUtil.setWidthHint(text, getMaxFieldWidth());
		TextFieldNavigationHandler.install(text);
	}

	// -------- Initialization ---------

	public String getElementLabel() {
		return Messages.ServiceWizard_name_label;
	}

	public String getServiceType() {
		return fServiceTypeDialogField.getText();
	}

	protected void collectStatus(List<IStatus> allStatus) {
		super.collectStatus(allStatus);
		allStatus.add(fServiceTypeStatus);
	}

	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		if (fieldName == SERVICE_TYPE) {
			fServiceTypeStatus = serviceTypeChanged();
		}
		doStatusUpdate();

	}

	protected IStatus serviceTypeChanged() {
		StatusInfo status = new StatusInfo();
		String text = fServiceTypeDialogField.getText();
		if (text == null || "".equals(text))
			status.setError(Messages.NewCreationWizardPage_error2);
		return status;
	}

	/*
	 * @see WizardPage#createControl
	 */
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 4;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		// pick & choose the wanted UI components
		createElementNameControls(composite, nColumns);
		createTypeControls(composite, nColumns);

		createSeparator(composite, nColumns);

		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);

		createSeparator(composite, nColumns);

		createTypeNameControls(composite, nColumns);

		createSuperInterfacesControls(composite, nColumns);
		addSuperInterface("org.polarsys.kitalpha.af.integration.ServiceImplementation");

		createCommentControls(composite, nColumns);
		setAddComments(true, true);
		enableCommentControl(true);

		setControl(composite);

		Dialog.applyDialogFont(composite);
	}

}
