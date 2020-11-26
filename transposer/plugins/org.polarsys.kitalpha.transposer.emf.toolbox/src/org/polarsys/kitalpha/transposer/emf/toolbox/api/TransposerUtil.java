/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.emf.toolbox.api;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * @author Guillaume Gebhart
 *
 */
public class TransposerUtil {
/**
 * Create an EObject of the EClass specified
 * @param nsUri : the nsUri of the meta model
 * @param name : the name of the EClass created 
 * @return the EObject
 */
  public static EObject createObject(String nsUri, String name){
    EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsUri);
    EClass eClass = (EClass) ePackage.getEClassifier(name);
    return ePackage.getEFactoryInstance().create(eClass);
  }
  
}
