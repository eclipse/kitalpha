/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.egf.utils;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.emde.extension.preferences.EmdePreferences;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * @author Thomas Guiu
 * 
 */
public class EmdePreconditionHelper {

	public static boolean hasEmdeFeatures(EClass eclass) {
		if (EmdePreferences.getInstancePreferences().getBoolean(EmdePreferences.FORCE_GENERATION_KEY, false))
			return true;
		EClass extensibleElement = EmdePackage.eINSTANCE.getExtensibleElement();
		String nsURI = extensibleElement.getEPackage().getNsURI();
		for (EClass cls : eclass.getEAllSuperTypes()) {
			if (nsURI.equals(cls.getEPackage().getNsURI()) && extensibleElement.getName().equals(cls.getName())) {
				return true;
			}
		}

		return false;
	}

	public static boolean hasEmdeFeatures(EPackage ecorePackage) {
		for (EClassifier classifier : ecorePackage.getEClassifiers()) {
			if (classifier instanceof EClass && hasEmdeFeatures((EClass) classifier))
				return true;
		}
		return false;
	}

	public static boolean hasEmdeFeatures(GenModel model) {
		for (GenPackage gen : model.getGenPackages()) {
			if (hasEmdeFeatures(gen.getEcorePackage()))
				return true;
		}
		return false;
	}
}
