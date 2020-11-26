/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;

import com.google.common.collect.Lists;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdslWizardsUtil {
	
	public static final String COPYRIGHT_KITALPHA = "PolarSys";

	public static final String GENERATOR_SPECILIZATION_EXTENSION_ID = "org.polarsys.kitalpha.ad.ta.definition"; //$NON-NLS-1$
	
	public static final String GENERATOR_SPECILIZATION_EXTENSION_POINT_NAME = "definition";
	
	public static final String GENERATOR_SPECILIZATION_EXTENSION_POINT_ATTRIBUTE = "name";
	
	public AfdslWizardsUtil() {}

	public static String getCurrentUserName() {
		return System.getProperty("user.name");
	}

	public static String getCurrentDate() {	
		return DateFormat.getDateInstance(DateFormat.SHORT).format(new java.util.Date());
	}
	
	public static String getCurrentYear(){
		return String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public static List<String> getSupportedModelingEnvironment(){
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(GENERATOR_SPECILIZATION_EXTENSION_ID);
		List<String> targets = Lists.newArrayList();
		if (config.length != 0){
			for (IConfigurationElement iConfigurationElement : config) {
				if (iConfigurationElement.getName().equals(GENERATOR_SPECILIZATION_EXTENSION_POINT_NAME)){
					targets.add(iConfigurationElement.getAttribute(GENERATOR_SPECILIZATION_EXTENSION_POINT_ATTRIBUTE));
				}
			}
		}
		return targets;
	}
	
	/**
	 * Copied from {@link org.polarsys.kitalpha.ad.common.utils.URIFix}
	 */
	public static class URIFix {

		public static URI createPlatformPluginURI(String path, boolean encode) {
			return createURI("platform:/plugin/", path);
		}

		public static URI createPlatformResourceURI(String path, boolean encode) {
			return createURI("platform:/resource/", path);
		}

		private static URI createURI(String prefix, String path) {
			String uri = prefix;
			if (path.startsWith("/")) {
				uri += path.substring(1);
			}
			else {
				uri += path;
			}
			return URI.createURI(uri);
		}
	}
}
