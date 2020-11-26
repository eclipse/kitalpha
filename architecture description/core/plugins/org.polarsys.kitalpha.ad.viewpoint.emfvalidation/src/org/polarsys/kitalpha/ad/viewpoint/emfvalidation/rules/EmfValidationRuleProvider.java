/**
 * Copyright (c) 2009, 2020 Thales Corporate Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */

package org.polarsys.kitalpha.ad.viewpoint.emfvalidation.rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.ConstraintFactory;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.core.PDECore;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.ElementDescriptor;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.RuleProvider;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor;

/**
 * @author Thomas Guiu
 * 
 */
public class EmfValidationRuleProvider implements RuleProvider {
	private static final String EXTENSION_POINT_ID = "org.eclipse.emf.validation.constraintProviders";
	public static final String ID = "EMF validation";

	@Override
	public ElementDescriptor[] getAvailableImplementations() {
		Set<String> names = new HashSet<String>();
		Set<String> implementations = new HashSet<String>();
		List<ElementDescriptor> result = new ArrayList<ElementDescriptor>();
		ModelValidationService.getInstance().loadXmlConstraintDeclarations();
		Collection<IConstraintDescriptor> allDescriptors = ConstraintRegistry.getInstance().getAllDescriptors();

		for (IConstraintDescriptor desc : allDescriptors) {
			String name = desc.getName();
			String implementation = desc.getId();

			if (name == null || implementation == null) {
				Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.getSymbolicName(), "An emf constraint has null properties (name:" + name + " id:" + implementation + ")"));
				continue;
			}
			if (names.contains(name) || implementations.contains(implementation)) {
				Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.getSymbolicName(), "An emf constraint already exists with this name or id (name:" + name + " id:" + implementation + ")"));
				continue;
			}
			names.add(name);
			implementations.add(implementation);
			result.add(new ElementDescriptor(name, implementation, desc.getPluginId()));
		}
		return result.toArray(new ElementDescriptor[result.size()]);
	}

	@Override
	public String getType() {
		return ID;
	}

	@Override
	public boolean canExecute(Rule rule, ModelAccessor properties, Object[] selection) {
		if (!checkSelection(selection)){
			return false;
		}
		BasicDiagnostic diagnostic = createDiagnostic(rule);
		IConstraintDescriptor descriptor = getConstraintDescriptor(rule);
		if (descriptor == null) {
			diagnostic.add(new BasicDiagnostic(Diagnostic.WARNING, Activator.getSymbolicName(), 0, "Cannot find rule: " + rule.getImplementation(), null));
			Activator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));
			return false;
		}
		return true;
	}

	protected boolean checkSelection(Object[] selection) {
		for (Object obj : selection) {
			if (obj instanceof IAdaptable){
				obj = ((IAdaptable) obj).getAdapter(EObject.class);
			}

			if (!(obj instanceof EObject)){
				return false;
			}
		}
		return true;
	}

	@Override
	public void execute(Rule rule, ModelAccessor properties, Object[] selection) {
		BasicDiagnostic diagnostic = createDiagnostic(rule);
		IConstraintDescriptor descriptor = getConstraintDescriptor(rule);
		if (descriptor == null) {
			diagnostic.add(new BasicDiagnostic(Diagnostic.WARNING, Activator.getSymbolicName(), 0, "Cannot find rule: " + rule.getImplementation(), null));
		} else {
			final IModelConstraint newConstraint = ConstraintFactory.getInstance().newConstraint(descriptor);
			for (Object target : selection) {
				ValidationContext ctx3 = new ValidationContext();
				ctx3.setConstraint(newConstraint);
				if (target instanceof EObject){
					ctx3.setTarget((EObject) target);
				}
				IStatus validate = newConstraint.validate(ctx3);
				diagnostic.add(new BasicDiagnostic(validate.getSeverity(), validate.getPlugin(), validate.getCode(), validate.getMessage(), null));
			}
		}
		Activator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));

	}

	private BasicDiagnostic createDiagnostic(Rule rule) {
		String name = "Diagnostic of " + rule.getImplementation() + " element";
		return new BasicDiagnostic(Activator.getSymbolicName(), 0, name, null);
	}

	private IConstraintDescriptor getConstraintDescriptor(Rule rule) {
		// ensure the descriptors are loaded
		ModelValidationService.getInstance().loadXmlConstraintDeclarations();

		ConstraintRegistry instance = ConstraintRegistry.getInstance();
		return instance.getDescriptor(rule.getImplementation());
	}

	@Override
	public boolean hasProvider(Bundle bundle) {
		IPluginModelBase model = PDECore.getDefault().getModelManager().findModel(bundle.getSymbolicName());
		if (model == null){
			return false; // occurs when a workspace vp is closed while active
		}
		for (IPluginExtension extension : model.getExtensions().getExtensions()) {
			if (EXTENSION_POINT_ID.equals(extension.getPoint())){
				return true;
			}
		}
		return false;
	}

}
