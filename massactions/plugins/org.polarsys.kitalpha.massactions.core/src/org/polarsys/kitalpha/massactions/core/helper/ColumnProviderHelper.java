/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.helper;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage.Literals;

/**
 * A column provider helper, providing some utility methods.
 * 
 * @author Sandu Postaru
 *
 */
public class ColumnProviderHelper {

  private ColumnProviderHelper() {
    // Exists only to defeat instantiation.
  }

  public static boolean isDateType(EStructuralFeature feature) {
    // there is no EDate object, instance of is not possible
    return feature.getEType().getName().equals(Literals.EDATE.getName());
  }

  public static boolean isEnumType(EStructuralFeature feature) {
    return (feature.getEType() instanceof EEnum);
  }

  public static boolean isReferenceType(EStructuralFeature feature) {
    return (feature instanceof EReference);
  }
}
