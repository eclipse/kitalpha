/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.ui.integration.rules;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRuleHandler;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.NewElementCreationWizard;
import org.polarsys.kitalpha.ad.viewpoint.utils.ElementHelper;

public abstract class NewRuleCreationWizard extends NewElementCreationWizard {

	protected final IRuleHandler handler;

	public NewRuleCreationWizard(IRuleHandler handler) {
		this.handler = handler;
	}

	@Override
	protected void postFinishPage(final IProgressMonitor monitor) throws InterruptedException, CoreException {
		super.postFinishPage(monitor);
		String id = ElementHelper.computeNewId(handler, getElementName().toLowerCase().replaceAll("\\s", "\\."));
		handler.createRule(id, getType(), getRuleImplementation());
	}

	protected abstract String getRuleImplementation();

	protected abstract String getType();

	@Override
	protected IDialogSettings getDialogSettingSection() {
		return getDialogSettings().getSection(Activator.RULE_PROVIDER_WIZARD_SECTION);
	}

}