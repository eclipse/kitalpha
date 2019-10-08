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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.services.validation;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.utils.EVpSpecValidatorAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage;

public class ServiceValidationStartup implements IStartup {

	@Override
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(VpservicesPackage.eINSTANCE, new EVpSpecValidatorAdapter());
	}

}
