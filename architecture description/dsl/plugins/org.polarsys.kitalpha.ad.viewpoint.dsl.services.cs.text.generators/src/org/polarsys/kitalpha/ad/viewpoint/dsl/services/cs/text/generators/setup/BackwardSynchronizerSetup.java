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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.setup;

import org.eclipse.xtext.ISetup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.module.GeneratorsModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class BackwardSynchronizerSetup implements ISetup {

	private Injector injector;

	public BackwardSynchronizerSetup() {
	}
	
	public void setInjector(Injector injector) {
		this.injector = injector;
	}

	public Injector getInjector() {
		return injector;
	}
	
	public Injector createInjectorAndDoEMFRegistration() {
		 return Guice.createInjector(new GeneratorsModule());
	}

}
