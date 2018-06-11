/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.emde.ui.actions;

import java.util.Collection;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * @author Thomas Guiu
 * 
 */
public class ValidationPropertyTester extends PropertyTester {

	public ValidationPropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		for (Object obj : (Collection<?>)receiver)
		{
			if (!(obj instanceof EPackage)) {
				return false;
			}
			if (hasEmdeFeatures((EPackage)obj )) {
				return true;
			}
		}	
		return false;
	}

	public static boolean hasEmdeFeatures(EClass eclass) {
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
			if (classifier instanceof EClass && hasEmdeFeatures((EClass) classifier)) {
				return true;
			}
		}
		return false;
	}

}
