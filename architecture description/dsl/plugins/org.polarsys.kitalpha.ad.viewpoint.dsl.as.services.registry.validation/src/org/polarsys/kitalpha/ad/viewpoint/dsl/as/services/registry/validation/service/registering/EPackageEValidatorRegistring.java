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
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.services.registry.validation.service.registering;

import java.net.DatagramPacket;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.utils.EVpSpecValidatorAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage;

/**
 * Temporary class in aim to register models aspect in EValidator registry
 * 
 * 
 * @author Faycal ABKA
 * 
 */


//feature: 
public class EPackageEValidatorRegistring implements IStartup {

	@Override
	public void earlyStartup() {

		// build aspect
		EValidator.Registry.INSTANCE.put(VpbuildPackage.eINSTANCE,
				new EVpSpecValidatorAdapter());

		// diagram aspect
		EValidator.Registry.INSTANCE.put(VpdiagramPackage.eINSTANCE,
				new EVpSpecValidatorAdapter());
		EValidator.Registry.INSTANCE.put(DiagramPackage.eINSTANCE,
				new EVpSpecValidatorAdapter());

		// services
		EValidator.Registry.INSTANCE.put(VpservicesPackage.eINSTANCE,
				new EVpSpecValidatorAdapter());

		// ui
		EValidator.Registry.INSTANCE.put(VpuiPackage.eINSTANCE,
				new EVpSpecValidatorAdapter());

		// conf
		EValidator.Registry.INSTANCE.put(VpconfPackage.eINSTANCE,
				new EVpSpecValidatorAdapter());
		
		//cs data
		EValidator.Registry.INSTANCE.put(DataPackage.eINSTANCE,
				new EVpSpecValidatorAdapter());
		
	}

}
