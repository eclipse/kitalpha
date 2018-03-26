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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.pde.core.plugin.IPluginParent;
import org.eclipse.pde.internal.core.PDECore;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRuleHandler;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.integration.rules.NewRuleCreationWizard;

/**
 * @author Thomas Guiu
 * 
 */
public class NewEmfValidationRuleCreationWizard extends NewRuleCreationWizard {

	public NewEmfValidationRuleCreationWizard(IRuleHandler handler) {
		super(handler);
		setDefaultPageImageDescriptor(JavaPluginImages.DESC_WIZBAN_NEWCLASS);
		setWindowTitle(Messages.NewEmfRuleCreationWizard_title);
		requiredDependencies.add("com.thalesgroup.mde.af");
		requiredDependencies.add("org.eclipse.emf.validation");
		fPage = new NewEmfRuleWizardPage();
	}

	private NewEmfRuleWizardPage getPage() {
		return (NewEmfRuleWizardPage) fPage;
	}

	@Override
	protected void manageManifestFile(IPluginModelBase model) throws CoreException {
		IPluginModelFactory factory = model.getPluginFactory();

		// 2 - Add extension point declaration
		IPluginExtension extension = factory.createExtension();
		extension.setPoint("org.eclipse.emf.validation.constraintProviders");
		model.getExtensions().add(extension);
		IPluginElement constraintProviderElt = createElement(factory, extension, "constraintProvider");

		for (EPackage pack : getPage().getPackages()) {
			IPluginElement packageElt = createElement(factory, constraintProviderElt, "package");
			packageElt.setAttribute("namespaceUri", pack.getNsURI());
		}

		IPluginElement constraintsElt = createElement(factory, constraintProviderElt, "constraints");
		constraintsElt.setAttribute("categories", "melody.advance/co.validation.rules/naming");

		IPluginElement constraintElt = createElement(factory, constraintsElt, "constraint");
		constraintElt.setAttribute("class", getFullClassname());
		constraintElt.setAttribute("id", getFullClassname());
		constraintElt.setAttribute("lang", "Java");
		constraintElt.setAttribute("mode", "Batch");
		constraintElt.setAttribute("name", getElementName());
		constraintElt.setAttribute("severity", "WARNING");
		constraintElt.setAttribute("statusCode", "1");

		IPluginElement messageElt = createElement(factory, constraintElt, "message");
		messageElt.setText(getPage().getMessage());

		IPluginElement descriptionElt = createElement(factory, constraintElt, "description");
		descriptionElt.setText(getPage().getDescription());

		for (EClassifier cls : getPage().getTargets()) {
			IPluginElement targetElt = createElement(factory, constraintElt, "target");
			targetElt.setAttribute("class", cls.getName());
		}

	}

	public IPluginElement createElement(IPluginModelFactory factory, IPluginObject parent, String name) throws CoreException {
		IPluginElement elt = factory.createElement(parent);
		elt.setName(name);
		if (parent instanceof IPluginParent){
			((IPluginParent) parent).add(elt);
		}
		return elt;
	}

	@Override
	protected IDialogSettings getDialogSettingSection() {
		return getDialogSettings().getSection(Activator.RULE_PROVIDER_WIZARD_SECTION);
	}

	@Override
	protected String getRuleImplementation() {
		IProject project = fPage.getJavaProject().getProject();
		IPluginModelBase findModel = PDECore.getDefault().getModelManager().findModel(project);
		return findModel.getBundleDescription().getSymbolicName() + '.' + getFullClassname();
	}

	protected String getType() {
		return EmfValidationRuleProvider.ID;
	}

}
