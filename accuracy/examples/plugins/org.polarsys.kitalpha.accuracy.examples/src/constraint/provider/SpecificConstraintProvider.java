/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


/**
 * 
 */
package constraint.provider;

import java.net.URL;
import java.util.ResourceBundle;

import org.osgi.framework.Bundle;

import org.polarsys.kitalpha.validation.ocl.provider.generic.GenericOCLConstraintProvider;

import constraint.provider.startup.Activator;

/**
 * @author Franco Bergomi
 */
public class SpecificConstraintProvider extends GenericOCLConstraintProvider {

	private static String CONSTRAINTS_CONFIGURATION_FILE = "OwnConstraints.Configuration.constraints"; //$NON-NLS-1$

	/**
	 * @see org.polarsys.kitalpha.validation.ocl.provider.generic.GenericOCLConstraintProvider#getConfigurationFileResourceBundle()
	 */
	@Override
	public ResourceBundle getConfigurationFileResourceBundle() {
		return ResourceBundle.getBundle(CONSTRAINTS_CONFIGURATION_FILE);
	}

	/**
	 * @see org.polarsys.kitalpha.validation.ocl.provider.generic.GenericOCLConstraintProvider#getContributorBundle()
	 */
	@Override
	public Bundle getContributorBundle() {
		return Activator.getDefault().getBundle();
	}

	/**
	 * @see org.polarsys.kitalpha.validation.ocl.provider.generic.GenericOCLConstraintProvider#getUrlFromPath(java.lang.String)
	 */
	@Override
	public URL getUrlFromPath(String oclFilePath) {
		return Activator.getDefault().getBundle().getEntry(oclFilePath);
	}
}
