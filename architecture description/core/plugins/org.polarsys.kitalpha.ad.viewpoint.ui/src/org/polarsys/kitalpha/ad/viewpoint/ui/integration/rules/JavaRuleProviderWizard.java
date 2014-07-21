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

	public String getType() {
		return JavaRuleProvider.ID;
	}

	public void openWizard(Shell shell, IRuleHandler handler, IProject project) {

		NewElementCreationWizard wizard = new NewJavaRuleCreationWizard(handler);
		wizard.init(PlatformUI.getWorkbench(), new StructuredSelection(new Object[] { project }));
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.open();
	}

}
