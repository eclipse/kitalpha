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
package org.polarsys.kitalpha.emde.extension.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;

/**
 * Copied from org.eclipse.egf.common.helper.EMFHelper
 * 
 */
public class EMFHelper {

	public static EClassifier solveAgainstStaticPackage(EClassifier eClassifier) {
		if (eClassifier == null) {
			return null;
		}
		EPackage ePackage = getStaticPackage(getRootPackage(eClassifier.getEPackage()));
		if (ePackage != null && ePackage.eResource() != null) {
			URI uri = EcoreUtil.getURI(eClassifier);
			if (uri == null) {
				return eClassifier;
			}
			EObject eObject = ePackage.eResource().getEObject(uri.fragment());
			if (eObject == null) {
				return eClassifier;
			}
			EClassifier solvedEClassifier = eObject instanceof EClassifier ? (EClassifier) eObject : eObject.eClass();
			if (solvedEClassifier != null) {
				return solvedEClassifier;
			}
		} else {
			Log.getDefault().logWarning(NLS.bind("Unable to solve EClassifier {0} against its static EPackage", eClassifier)); //$NON-NLS-1$
		}
		return eClassifier;
	}

	public static EPackage getRootPackage(EPackage ePackage) {
		if (ePackage == null) {
			return null;
		}
		EPackage result = null;
		EPackage rootPackage = ePackage;
		while (rootPackage != null) {
			result = rootPackage;
			rootPackage = result.getESuperPackage();
		}
		if (result == null) {
			Log.getDefault().logWarning(NLS.bind("Unable to solve a Root EPackage for {0}", ePackage)); //$NON-NLS-1$
		}
		return result;
	}

	public static EPackage getStaticPackage(EPackage ePackage) {
		if (ePackage == null) {
			return null;
		}
		EPackage ePackageStatic = null;
		// Get the equivalent from the Global EPackage registry.
		Object staticPackage = null;
		if (ePackage.getNsURI() != null) {
			staticPackage = EPackage.Registry.INSTANCE.get(ePackage.getNsURI());
		}
		if (staticPackage != null) {
			if (staticPackage instanceof EPackage) {
				ePackageStatic = (EPackage) staticPackage;
			} else if (staticPackage instanceof EPackage.Descriptor) {
				ePackageStatic = ((EPackage.Descriptor) staticPackage).getEPackage();
			}
		} else {
			ePackageStatic = ePackage;
		}
		return ePackageStatic;
	}
}
