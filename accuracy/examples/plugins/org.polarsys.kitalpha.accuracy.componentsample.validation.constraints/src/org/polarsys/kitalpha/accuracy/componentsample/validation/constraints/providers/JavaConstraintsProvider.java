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
package org.polarsys.kitalpha.accuracy.componentsample.validation.constraints.providers;

import java.net.URL;
import java.util.ResourceBundle;

import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.accuracy.componentsample.validation.constraints.constants.IConstants;
import org.polarsys.kitalpha.accuracy.componentsample.validation.constraints.internal.Activator;
import org.polarsys.kitalpha.validation.java.provider.generic.GenericJavaConstraintProvider;

/**
 * 
 * @author Faycal Abka
 *
 */
public class JavaConstraintsProvider extends GenericJavaConstraintProvider {

	@Override
	public ResourceBundle getConfigurationFileResourceBundle() {
		return ResourceBundle.getBundle(IConstants.CONSTRAINTS_CONFIG_FILE);
	}

	@Override
	public Bundle getContributorBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	public URL getUrlFromPath(String filePath) {
		return Activator.getDefault().getBundle().getEntry(filePath);
	}

}
