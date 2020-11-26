/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
