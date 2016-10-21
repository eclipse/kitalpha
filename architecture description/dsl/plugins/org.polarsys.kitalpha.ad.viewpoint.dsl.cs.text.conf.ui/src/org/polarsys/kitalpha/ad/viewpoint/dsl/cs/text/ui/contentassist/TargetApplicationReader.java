/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import com.google.common.collect.Lists;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class TargetApplicationReader {
	
	public static final String GENERATOR_SPECILIZATION_EXTENSION_ID = "org.polarsys.kitalpha.ad.ta.definition"; //$NON-NLS-1$

	public TargetApplicationReader() {
	}
	
	public static List<String> getSupportedModelingEnvironment(){
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(GENERATOR_SPECILIZATION_EXTENSION_ID);
		List<String> targets = Lists.newArrayList();
		if (config.length != 0){
			for (IConfigurationElement iConfigurationElement : config) {
				if (iConfigurationElement.getName().equals("definition")){
					targets.add(iConfigurationElement.getAttribute("name"));
				}
			}
		}
		return targets;
	}
}
