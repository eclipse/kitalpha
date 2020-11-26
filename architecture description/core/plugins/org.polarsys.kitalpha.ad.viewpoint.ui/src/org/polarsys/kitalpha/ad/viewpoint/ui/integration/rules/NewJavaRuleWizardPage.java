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

package org.polarsys.kitalpha.ad.viewpoint.ui.integration.rules;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.NewElementWizardPage;

/**
 * @author Thomas Guiu
 * 
 */
public class NewJavaRuleWizardPage extends NewElementWizardPage {

	private static final String PAGE_NAME = "NewClassWizardPage"; //$NON-NLS-1$

	/**
	 * Creates a new <code>NewClassWizardPage</code>
	 */
	public NewJavaRuleWizardPage() {
		super(true, PAGE_NAME);
		setTitle(Messages.NewJavaRuleWizardPage_title);
		setDescription(Messages.NewJavaRuleWizardPage_description);
	}

	@Override
	public String getElementLabel() {
		return Messages.JavaRuleWizard_rule_label;
	}

	// -------- Initialization ---------

	/*
	 * @see WizardPage#createControl
	 */
	@Override
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

		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);

		createSeparator(composite, nColumns);

		createTypeNameControls(composite, nColumns);

		createSuperInterfacesControls(composite, nColumns);
		addSuperInterface("org.polarsys.kitalpha.ad.viewpoint.integration.rules.JavaRule");

		createCommentControls(composite, nColumns);
		setAddComments(true, true);
		enableCommentControl(true);

		setControl(composite);

		Dialog.applyDialogFont(composite);
	}

}
