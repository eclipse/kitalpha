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

package org.polarsys.kitalpha.ad.viewpoint.ui.integration.services;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IServiceHandler;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.NewElementCreationWizard;
import org.polarsys.kitalpha.ad.viewpoint.utils.ElementHelper;

/**
 * @author Thomas Guiu
 * 
 */
public class NewServiceCreationWizard extends NewElementCreationWizard {

	protected final IServiceHandler handler;

	public NewServiceCreationWizard(IServiceHandler handler) {
		this.handler = handler;
		setDefaultPageImageDescriptor(JavaPluginImages.DESC_WIZBAN_NEWCLASS);
		setWindowTitle(Messages.NewServiceCreationWizard_title);
		requiredDependencies.add("org.polarsys.kitalpha.ad.viewpoint");
		fPage = new NewServiceWizardPage();
	}

	@Override
	protected void postFinishPage(final IProgressMonitor monitor) throws InterruptedException, CoreException {
		super.postFinishPage(monitor);
		String id = ElementHelper.computeNewId(handler, getElementName().toLowerCase().replaceAll("\\s", "\\."));
		handler.createService(id, "New Service", getServiceType(), new ArrayList<Rule>());
	}

	@Override
	protected void manageManifestFile(IPluginModelBase model) throws CoreException {
		IPluginModelFactory factory = model.getPluginFactory();

		IPluginExtension extension = factory.createExtension();
		extension.setPoint("org.polarsys.kitalpha.ad.viewpoint.implementation.services");
		model.getExtensions().add(extension);
		IPluginElement element = factory.createElement(extension);

		element.setName("Implementation");
		element.setAttribute("label", getElementName());
		element.setAttribute("type", getServiceType());
		element.setAttribute("class", getFullClassname());
		extension.add(element);

	}

	@Override
	protected IDialogSettings getDialogSettingSection() {
		return getDialogSettings().getSection(Activator.SERVICE_PROVIDER_WIZARD_SECTION);
	}

	protected String getServiceType() {
		return ((NewServiceWizardPage) fPage).getServiceType();
	}

}
