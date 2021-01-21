/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpdiagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpconf.ConfigurationHelper;


/**
 * Extracted from {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.extension} to fit with textual viewpoint dsl.
 * 
 * @author Amine Lajmi
 *
 */
public class ExtensionManager {
	
	private static final String diagram_filter_extension_point = "org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.diagramfilter"; //$NON-NLS-N$

	public static List<String> getDiagramFilters(EObject eObject){			
		// Load available extension for a given TargetApplication
		String modelTargetApplication = ConfigurationHelper.getTargetApplication(eObject);
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(diagram_filter_extension_point);	
		List<String> result = new ArrayList<>();
		if (config.length != 0) {
			for (IConfigurationElement iConfigurationElement : config) {
				if (iConfigurationElement.getName().equals("Filter")) {
					String tApplication = iConfigurationElement.getAttribute("TargetApplication");
					if (tApplication.trim().equalsIgnoreCase(modelTargetApplication.trim())) {
						result.add(iConfigurationElement.getAttribute("ModelFileExtension"));
					}
				}
			}
		}	
		return result;
	}

	private ExtensionManager() {
		super();
	}
	
}
