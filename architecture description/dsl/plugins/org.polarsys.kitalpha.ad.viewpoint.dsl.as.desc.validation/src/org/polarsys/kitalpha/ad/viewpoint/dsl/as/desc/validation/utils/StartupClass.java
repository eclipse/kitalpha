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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.utils;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.VPElementValidatorsManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * @author Boubekeur Zendagui
 */

public class StartupClass implements IStartup {

	@Override
	public void earlyStartup() {
		// Register the EValidator
		EValidator.Registry.INSTANCE.put(VpdescPackage.eINSTANCE, new EVpSpecValidatorAdapter());
		try 
		{
			VPElementValidatorsManager.initValidators();
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}
	}
}
