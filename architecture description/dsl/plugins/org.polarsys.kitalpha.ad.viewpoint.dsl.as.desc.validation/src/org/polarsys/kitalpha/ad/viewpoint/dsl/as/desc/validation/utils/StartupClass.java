/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
