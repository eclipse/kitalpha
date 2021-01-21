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

package org.polarsys.kitalpha.ad.viewpoint.coredomain.model.edit.helpers;

import java.util.Set;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.polarsys.kitalpha.ad.common.AD_Log;

/**
 * @author Thomas Guiu
 * 
 */
public class AbstractHelper {

	protected final String pathToExclude;
	protected final String project;

	public AbstractHelper(EObject target) {
		URI uri = target.eResource().getURI();
		pathToExclude = new Path(uri.path()).removeFirstSegments(1).toPortableString();
		project = uri.segment(1);
	}

	protected void fillScope(IPluginModelBase model, Set<String> bundleScope) {
	
		BundleDescription description = model.getBundleDescription();
		String symbolicName = description.getSymbolicName();
		if (bundleScope.contains(symbolicName)){
			return;
		}
	
		bundleScope.add(symbolicName);
		for (BundleSpecification req : description.getRequiredBundles()) {
			if (req.getSupplier() == null) {
				AD_Log.getDefault().logWarning(NLS.bind("Cannot find supplier for ''{0}''", req.hashCode()));
				continue;
			}
			IPluginModelBase reqModel = PluginRegistry.findModel(req.getSupplier().getSupplier());
			fillScope(reqModel, bundleScope);
		}
	}

	public String getProject() {
		return project;
	}

}