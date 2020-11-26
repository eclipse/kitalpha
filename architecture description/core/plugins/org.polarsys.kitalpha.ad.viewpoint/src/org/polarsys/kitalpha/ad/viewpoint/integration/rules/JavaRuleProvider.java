/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.integration.rules;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.core.PDECore;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor;

/**
 * @author Thomas Guiu
 * 
 */
public class JavaRuleProvider implements RuleProvider {
	private static final String EXTENSION_POINT_ID = "org.polarsys.kitalpha.ad.viewpoint.javarules";
	public static final String ID = "Java";
	private static final String CLASS = "class";

	private JavaRule getRule(String id) {
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement elt : configurationElements) {
			try {
				if (id.equals(elt.getAttribute(CLASS))){
					return (JavaRule) elt.createExecutableExtension(CLASS);
				}
			} catch (CoreException e) {
				AD_Log.getDefault().logError("Cannot create rule", e);
			}
		}
		return null;
	}

	@Override
	public ElementDescriptor[] getAvailableImplementations() {
		Set<String> names = new HashSet<String>();
		Set<String> implementations = new HashSet<String>();
		List<ElementDescriptor> result = new ArrayList<ElementDescriptor>();
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement elt : configurationElements) {
			String name = elt.getAttribute("name");
			String implementation = elt.getAttribute(CLASS);
			if (name == null || implementation == null) {
				AD_Log.getDefault().logWarning("This javaRule contains null values (name:" + name + " class:" + implementation + ")");
				continue;
			}
			if (names.contains(name) || implementations.contains(implementation)) {
				AD_Log.getDefault().logWarning("A javaRule already exists with this name or class (name:" + name + " class:" + implementation + ")");
				continue;
			}
			names.add(name);
			implementations.add(implementation);
			result.add(new ElementDescriptor(name, implementation, elt.getContributor().getName()));
		}
		return result.toArray(new ElementDescriptor[result.size()]);
	}

	@Override
	public String getType() {
		return ID;
	}

	@Override
	public void execute(Rule rule, ModelAccessor properties, Object[] selection) {
		JavaRule jRule = getRule(rule.getImplementation());
		if (jRule == null){
			AD_Log.getDefault().logWarning("Cannot find rule: " + rule.getImplementation());
		} else {
			jRule.run(properties, selection);
		}
	}

	@Override
	public boolean canExecute(Rule rule, ModelAccessor properties, Object[] selection) {
		String getImplementation = rule.getImplementation();
		if (getImplementation == null){
			return false;
		}
		JavaRule jRule = getRule(getImplementation);
		if (jRule == null) {
			AD_Log.getDefault().logWarning("Cannot find rule: " + getImplementation);
			return false;
		}
		return jRule.canRun(properties, selection);

	}

	@Override
	public boolean hasProvider(Bundle bundle) {
		IPluginModelBase model = PDECore.getDefault().getModelManager().findModel(bundle.getSymbolicName());
		if (model == null){
			return false;// occurs when a workspace vp is closed while active
		}
		for (IPluginExtension extension : model.getExtensions().getExtensions()) {
			if (EXTENSION_POINT_ID.equals(extension.getPoint())){
				return true;
			}
		}
		return false;
	}

}
