/**
 * Copyright (c) 2009, 2018 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */

package org.polarsys.kitalpha.ad.viewpoint.emfvalidation.rules;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;
import org.eclipse.jdt.internal.ui.dialogs.TextFieldNavigationHandler;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IListAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IStringButtonAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.ListDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.ad.viewpoint.emfvalidation.rules.dialogs.EcoreLabelProvider;
import org.polarsys.kitalpha.ad.viewpoint.emfvalidation.rules.dialogs.PackagesDialog;
import org.polarsys.kitalpha.ad.viewpoint.emfvalidation.rules.dialogs.TargetsDialog;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.NewElementWizardPage;

/**
 * @author Thomas Guiu
 * 
 */
public class NewEmfRuleWizardPage extends NewElementWizardPage {

	protected static final String DESCRIPTION = "description";
	protected static final String MESSAGE = "message";
	protected static final String PACKAGES = "packages";
	protected static final String TARGETS = "targets";

	private static final String PAGE_NAME = "NewClassWizardPage"; //$NON-NLS-1$

	protected StringDialogField fMessageDialogField;
	protected IStatus fMessageStatus = Status.OK_STATUS;

	protected StringDialogField fDescriptionDialogField;
	protected IStatus fDescriptionStatus = Status.OK_STATUS;

	protected ListDialogField fPackageDialogField;
	protected IStatus fPackageStatus = Status.OK_STATUS;

	protected ListDialogField fTargetDialogField;
	protected IStatus fTargetStatus = Status.OK_STATUS;

	/**
	 * Creates a new <code>NewClassWizardPage</code>
	 */
	public NewEmfRuleWizardPage() {
		super(true, PAGE_NAME);

		setTitle(Messages.NewEmfRuleWizardPage_title);
		setDescription(Messages.NewEmfRuleWizardPage_description);

		fMessageDialogField = new AdvTextBoxDialogField();
		fMessageDialogField.setDialogFieldListener(new IDialogFieldListener() {

			public void dialogFieldChanged(DialogField field) {
				handleFieldChanged(MESSAGE);
			}
		});
		fMessageDialogField.setLabelText(Messages.NewEmfRuleWizardPage_Message_label);

		fDescriptionDialogField = new AdvTextBoxDialogField();
		fDescriptionDialogField.setDialogFieldListener(new IDialogFieldListener() {

			public void dialogFieldChanged(DialogField field) {
				handleFieldChanged(DESCRIPTION);
			}
		});
		fDescriptionDialogField.setLabelText(Messages.NewEmfRuleWizardPage_Description_label);

		TypeFieldsAdapter adapter = new TypeFieldsAdapter();
		String[] addButtons = new String[] { Messages.NewEmfRuleWizardPage_add_button,
		/* 1 */null, Messages.NewEmfRuleWizardPage_remove_label };
		fPackageDialogField = new ListDialogField(adapter, addButtons, new EcoreLabelProvider());
		fPackageDialogField.setDialogFieldListener(adapter);
		fPackageDialogField.setTableColumns(new ListDialogField.ColumnsDescription(1, false));
		fPackageDialogField.setLabelText(Messages.NewEmfRuleWizardPage_packages_label);
		fPackageDialogField.setRemoveButtonIndex(2);

		fTargetDialogField = new ListDialogField(adapter, addButtons, new EcoreLabelProvider());
		fTargetDialogField.setDialogFieldListener(adapter);
		fTargetDialogField.setTableColumns(new ListDialogField.ColumnsDescription(1, false));
		fTargetDialogField.setLabelText(Messages.NewEmfRuleWizardPage_target_label);
		fTargetDialogField.setRemoveButtonIndex(2);

	}

	@Override
	public String getElementLabel() {
		return Messages.JavaRuleWizard_rule_label;
	}

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

		createSeparator(composite, nColumns);

		// packages & targets
		createPackagesControls(composite, nColumns);
		createTargetsControls(composite, nColumns);

		createSeparator(composite, nColumns);

		// message & description
		createMessageControls(composite, nColumns);
		createDescriptionControls(composite, nColumns);

		createSeparator(composite, nColumns);

		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);

		createTypeNameControls(composite, nColumns);
		setSuperClass("org.eclipse.emf.validation.AbstractModelConstraint", false);

		createSeparator(composite, nColumns);

		createCommentControls(composite, nColumns);
		setAddComments(true, true);
		enableCommentControl(true);

		setControl(composite);

		Dialog.applyDialogFont(composite);
	}

	@Override
	protected void collectStatus(List<IStatus> allStatus) {
		fElementNameStatus = elementNameChanged();
		fMessageStatus = messageChanged();
		fPackageStatus = packagesChanged();

		super.collectStatus(allStatus);
		allStatus.add(fMessageStatus);
		allStatus.add(fDescriptionStatus);
		allStatus.add(fPackageStatus);
	}

	@Override
	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		if (fieldName == MESSAGE) {
			fMessageStatus = messageChanged();
		} else if (fieldName == PACKAGES) {
			fPackageStatus = packagesChanged();
		} else if (fieldName == DESCRIPTION) {
			fDescriptionStatus = Status.OK_STATUS;
		}
		doStatusUpdate();
	}

	protected IStatus messageChanged() {
		StatusInfo status = new StatusInfo();
		String text = fMessageDialogField.getText();
		if (text == null || "".equals(text))
			status.setError(Messages.NewCreationWizardPage_error3);
		return status;
	}

	protected IStatus packagesChanged() {
		StatusInfo status = new StatusInfo();
		List elements = fPackageDialogField.getElements();
		if (elements == null || elements.isEmpty())
			status.setError(Messages.NewCreationWizardPage_error4);
		return status;
	}

	protected void createPackagesControls(Composite composite, int nColumns) {
		fPackageDialogField.doFillIntoGrid(composite, nColumns);
	}

	protected void createTargetsControls(Composite composite, int nColumns) {
		fTargetDialogField.doFillIntoGrid(composite, nColumns);
	}

	protected void createMessageControls(Composite composite, int nColumns) {
		fMessageDialogField.doFillIntoGrid(composite, nColumns - 1);
		DialogField.createEmptySpace(composite);
		Text text = fMessageDialogField.getTextControl(null);
		LayoutUtil.setWidthHint(text, getMaxFieldWidth());
		LayoutUtil.setHeightHint(text, convertHeightInCharsToPixels(2));
		TextFieldNavigationHandler.install(text);
	}

	protected void createDescriptionControls(Composite composite, int nColumns) {
		fDescriptionDialogField.doFillIntoGrid(composite, nColumns - 1);
		DialogField.createEmptySpace(composite);
		Text text = fDescriptionDialogField.getTextControl(null);
		LayoutUtil.setWidthHint(text, getMaxFieldWidth());
		LayoutUtil.setHeightHint(text, convertHeightInCharsToPixels(6));
		TextFieldNavigationHandler.install(text);
	}

	public String getMessage() {
		return fMessageDialogField.getText();
	}

	public String getDescription() {
		return fDescriptionDialogField.getText();
	}

	public EPackage[] getPackages() {
		List elements = fPackageDialogField.getElements();
		return (EPackage[]) elements.toArray(new EPackage[elements.size()]);
	}

	public EClassifier[] getTargets() {
		List elements = fTargetDialogField.getElements();
		return (EClassifier[]) elements.toArray(new EClassifier[elements.size()]);
	}

	private class TypeFieldsAdapter implements IStringButtonAdapter, IDialogFieldListener, IListAdapter, SelectionListener {
		// -------- IStringButtonAdapter
		public void changeControlPressed(DialogField field) {
			//nothing to do
		}

		// -------- IListAdapter
		public void customButtonPressed(ListDialogField field, int index) {
			if (field == fPackageDialogField) {
				if (index == 0) {
					PackagesDialog dialog = new PackagesDialog(getShell());
					if (dialog.open() == Window.OK) {
						for (EPackage result : dialog.getResults()) {
							fPackageDialogField.addElement(result);
						}
						handleFieldChanged(PACKAGES);
					}
				}
			} else if (field == fTargetDialogField && index == 0) {
				List elements = fPackageDialogField.getElements();
				EPackage[] packages = (EPackage[]) elements.toArray(new EPackage[elements.size()]);
				TargetsDialog dialog = new TargetsDialog(getShell(), packages);
				if (dialog.open() == Window.OK) {
					for (EClassifier result : dialog.getResults()) {
						fTargetDialogField.addElement(result);
					}
					handleFieldChanged(TARGETS);
				}
			}
		}

		public void selectionChanged(ListDialogField field) {
			//nothing to do
		}

		public void dialogFieldChanged(DialogField field) {
			//nothing to do
		}

		public void doubleClicked(ListDialogField field) {
			//nothing to do
		}

		public void widgetSelected(SelectionEvent e) {
			//nothing to do
		}

		public void widgetDefaultSelected(SelectionEvent e) {
			//nothing to do
		}
	}

}
