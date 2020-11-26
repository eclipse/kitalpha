/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Properties;

import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.jdt.launching.environments.IExecutionEnvironmentsManager;

/**
 * @author Boubekeur Zendagui
 */

public class RequiredExecutionEnvironmentHelper {

	/**
	 * @return all available Execution Environments
	 */
	public static Collection<String> getAvailableExecutionEnvironement(){
		Collection<String> avaulableJRE = new ArrayList<String>();
		final IExecutionEnvironmentsManager executionEnvironmentsManager = JavaRuntime.getExecutionEnvironmentsManager();
		for (IExecutionEnvironment executionEnvironment : executionEnvironmentsManager.getExecutionEnvironments()) 
		{
			Properties profileProperties = executionEnvironment.getProfileProperties();
			Enumeration<Object> properties = profileProperties.keys();
			while (properties.hasMoreElements()) 
			{
				String key = (String) properties.nextElement();
				if (key.equals("osgi.java.profile.name")) //$NON-NLS-1$
				{
					String jre = (String) profileProperties.get(key);
					avaulableJRE.add(jre);
				}
			}
		}
		return avaulableJRE;
	}
}
