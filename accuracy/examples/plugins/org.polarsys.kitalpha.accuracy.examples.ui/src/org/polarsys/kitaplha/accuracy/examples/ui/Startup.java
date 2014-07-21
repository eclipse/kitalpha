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


package org.polarsys.kitaplha.accuracy.examples.ui;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipse.ui.IStartup;

import org.polarsys.kitalpha.validation.ocl.provider.generic.EValidatorAdapter;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintProviderService;

import constraint.provider.SpecificConstraintProvider;
import constraint.provider.java.JavaSpecificConstraintProvider;

public class Startup implements IStartup {

	/**
	 * Initializes me.
	 */
	public Startup() {
		super();
	}

	/**
	 * Install the validator.
	 */
	public void earlyStartup() {
		//
		// force the registration of the meta model.
		
		// Correction [#3540] Error " Unable to find Package" in Example
//		EXTLibraryPackage.eINSTANCE.getClass();
		EPackage.Registry.INSTANCE.put(EXTLibraryPackage.eINSTANCE.getNsURI(), EXTLibraryPackage.eINSTANCE);

		/*
		 * register all Packages to the SAME Validation Adapter
		 */
		EValidatorAdapter evaInst = new EValidatorAdapter();
		EValidator.Registry.INSTANCE.put(EXTLibraryPackage.eINSTANCE, evaInst);

		GenericConstraintProviderService.getInstance().registerProvider(
				new SpecificConstraintProvider());
		GenericConstraintProviderService.getInstance().registerProvider(
				new JavaSpecificConstraintProvider());
	}

}
