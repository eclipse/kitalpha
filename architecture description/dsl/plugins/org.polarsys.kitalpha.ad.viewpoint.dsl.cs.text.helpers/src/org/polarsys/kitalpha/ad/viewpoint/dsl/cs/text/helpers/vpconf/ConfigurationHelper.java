/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpconf;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication;

/**
 * Reworked from
 * {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper}
 * to fit with textual viewpoint dsl.
 * 
 * @author Amine Lajmi
 * 
 */
public class ConfigurationHelper {

	/**
	 * 
	 * @param object any configuration model element
	 * @return the Configuration element
	 */
	public static Configuration getViewpointConfiguration(EObject object) {
		if (object instanceof Configuration) {
			return (Configuration) object;
		} else {
			if (object.eContainer() != null) {
				return getViewpointConfiguration(object.eContainer());
			} else {
				throw new RuntimeException("Could no find configuration root starting from " + object.eResource().getURI().toString());
			}
		}
	}

	/**
	 * 
	 * @param object any configuration model element
	 * @return the Target Application specified in the configuration element
	 */
	public static String getTargetApplication(EObject object) {
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null) {
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
				if (configurationElement instanceof TargetApplication) {
					TargetApplication targetApplication = (TargetApplication) configurationElement;
					return targetApplication.getType();
				}
		}
		return null;
	}

	/**
	 * 
	 * @param object any configuration model element
	 * @return The Root Project Name specified in the configuration element
	 */
	public static String getRootProjectName(EObject object) {
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null) {
			for (ConfigurationElement configurationElement : configuration.getVpConfigurationElements())
				if (configurationElement instanceof GenerationConfiguration) {
					GenerationConfiguration generationConfiguration = (GenerationConfiguration) configurationElement;
					return generationConfiguration.getProjectName();
				}
		}
		return null;
	}

	/**
	 * 
	 * @param object any configuration model element
	 * @return The Root Ns URI specified in the configuration element
	 */
	public static String getRootNsURI(EObject object) {
		Configuration configuration = getViewpointConfiguration(object);
		if (configuration != null) {
			for (ConfigurationElement configurationElement : configuration
					.getVpConfigurationElements())
				if (configurationElement instanceof GenerationConfiguration) {
					GenerationConfiguration generationConfiguration = (GenerationConfiguration) configurationElement;
					return generationConfiguration.getNsuri();
				}
		}
		return null;
	}
}
