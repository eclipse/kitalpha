/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
