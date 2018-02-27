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
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRuleHandler;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.JavaRuleProvider;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;

/**
 * @author Thomas Guiu
 * 
 */
public class NewJavaRuleCreationWizard extends NewRuleCreationWizard {

	public NewJavaRuleCreationWizard(IRuleHandler handler) {
		super(handler);
		setDefaultPageImageDescriptor(JavaPluginImages.DESC_WIZBAN_NEWCLASS);
		setWindowTitle(Messages.NewJavaRuleCreationWizard_title);
		requiredDependencies.add("org.polarsys.kitalpha.ad.viewpoint");
		fPage = new NewJavaRuleWizardPage();
	}

	@Override
	protected void manageManifestFile(IPluginModelBase model) throws CoreException {
		IPluginModelFactory factory = model.getPluginFactory();

		// 2 - Add extension point declaration
		IPluginExtension extension = factory.createExtension();
		extension.setPoint("org.polarsys.kitalpha.ad.viewpoint.javarules");
		model.getExtensions().add(extension);
		IPluginElement element = factory.createElement(extension);

		element.setName("JavaRule");
		element.setAttribute("name", getElementName());
		element.setAttribute("class", getFullClassname());
		extension.add(element);

	}

	protected String getType() {
		return JavaRuleProvider.ID;
	}

	@Override
	protected String getRuleImplementation() {
		return getFullClassname();
	}

}
