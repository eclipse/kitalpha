/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.transformation.emf.util;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author GEBHART Guillaume
 * 
 */
public class EcoreIdentifierUtil {

  public static final String SEP = "::"; //$NON-NLS-1$ 

  /**
   * @param element_p
   * @return
   */
  public static String getIdentifier(ENamedElement element_p) {
    if (element_p instanceof EPackage) {
      return getEPackageIdentifier((EPackage) element_p);
    } else if (element_p instanceof EClassifier) {
      return getEClassifierIdentifier((EClassifier) element_p);
    } else if (element_p instanceof EStructuralFeature) {
      return getFeatureIdentifier((EStructuralFeature) element_p);
    } else if (element_p instanceof EEnumLiteral) {
      return getLiteralIdentifier((EEnumLiteral) element_p);
    }
    if (element_p == null)
	 {
		return ""; //$NON-NLS-1$ 
	}

    return element_p.getName();
  }

  /**
   * @param ref_p
   * @return
   */
  private static String getFeatureIdentifier(EStructuralFeature feature_p) {
    if (feature_p == null)
	 {
		return ""; //$NON-NLS-1$
	}
    return getEClassifierIdentifier(feature_p.getEContainingClass()) + SEP + feature_p.getName();
  }

  /**
   * @param ref_p
   * @return
   */
  private static String getLiteralIdentifier(EEnumLiteral lit_p) {
    if (lit_p == null)
	 {
		return ""; //$NON-NLS-1$
	}
    return getEClassifierIdentifier(lit_p.getEEnum()) + SEP + lit_p.getName();
  }

  /**
   * @param ref_p
   * @return
   */
  private static String getEClassifierIdentifier(EClassifier classifier_p) {
    if (classifier_p == null)
	 {
		return ""; //$NON-NLS-1$
	}
    return getEPackageIdentifier(classifier_p.getEPackage()) + SEP + classifier_p.getName();
  }

  /**
   * @param ref_p
   * @return
   */
  private static String getEPackageIdentifier(EPackage package_p) {
    if (package_p == null) {
		return ""; //$NON-NLS-1$
	} else if (package_p.getESuperPackage() != null) {
		return getEPackageIdentifier(package_p.getESuperPackage()) + SEP + package_p.getName();
	}
    return package_p.getName();
  }
}
