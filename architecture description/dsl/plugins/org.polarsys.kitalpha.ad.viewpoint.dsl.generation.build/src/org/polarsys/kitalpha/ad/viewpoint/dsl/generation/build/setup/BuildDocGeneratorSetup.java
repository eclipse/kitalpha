/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.setup;

import org.eclipse.xtext.ISetup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.module.BuildDocGeneratorModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class BuildDocGeneratorSetup implements ISetup {

	private Injector injector;
	
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new BuildDocGeneratorModule());
	}

	public void setInjector(Injector injector) {
		this.injector = injector;
	}

	public Injector getInjector() {
		return injector;
	}
}
