package org.polarsys.kitalpha.explorer.contextual.examples.ecore.helper;

import java.util.ArrayList;
/******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

/**
 * @author Boubekeur Zendagui
 */
public class EClassReferencesHelper {

	/**
	 * Return all EClasses of an EPackage and it sub-EPackages
	 * @param ePackage an EPackage
	 * @return a list of EClasses
	 */
	public static List<EClass> getAllEClasses(EPackage ePackage){
		List<EClass> result = new ArrayList<EClass>();
		EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
		for (EClassifier eClassifier : eClassifiers) 
		{
			if (eClassifier instanceof EClass)
			{
				result.add((EClass) eClassifier);
			}
		}
		
		EList<EPackage> eSubpackages = ePackage.getESubpackages();
		for (EPackage subEPackage : eSubpackages) 
		{
			List<EClass> allEClasses = getAllEClasses(subEPackage);
			if (allEClasses != null && allEClasses.isEmpty() == false)
			{
				result.addAll(allEClasses);
			}
		}
		
		return result;
	}
}
