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

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRuleHandler;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.JavaRuleProvider;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.NewElementCreationWizard;


/**
 * @author Thomas Guiu
 * 
 */
public class JavaRuleProviderWizard implements RuleProviderWizard {

	@Override
	public String getType() {
		return JavaRuleProvider.ID;
	}

	@Override
	public void openWizard(Shell shell, IRuleHandler handler, IProject project) {

		NewElementCreationWizard wizard = new NewJavaRuleCreationWizard(handler);
		wizard.init(PlatformUI.getWorkbench(), new StructuredSelection(new Object[] { project }));
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.open();
	}

}
