/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Read only helper. All operations must be only getter methods.
 * 
 * @author Faycal Abka
 *
 */
public class EPackageHelper {
	
	private final EPackage ePackage;
	
	public EPackageHelper(final EPackage ePackage){
		assert ePackage != null;
		this.ePackage = ePackage;
	}
	
	public EPackage getEPackage(){
		return this.ePackage;
	}
	
	/**
	 * look up for the EClass which name matches name parameter
	 * @param name 
	 * @return eClass with name in ePackage or null
	 */
	public EClass getEClass(String name){
		if (name != null && !name.isEmpty()){
			EClassifier eClassifier = getEPackage().getEClassifier(name);
			if (eClassifier instanceof EClass){
				return (EClass)eClassifier;
			}
		}
		return null;
	}
	
	/**
	 * look up for the EReference which name matches eReferenceName parameter un the EClass eClass
	 * @param name 
	 * @return eReference with name in eClass or null
	 */
	public EReference getEReference(EClass eClass, String eReferenceName){
		if (eClass != null && eReferenceName != null && !eReferenceName.isEmpty()){
			EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(eReferenceName);
			if (eStructuralFeature instanceof EReference){
				return (EReference)eStructuralFeature;
			}
		}
		return null;
	}
	
	/**
	 * look up for the EReference which name matches eReferenceName parameter un the EClass which matches with eClassName
	 * @param name 
	 * @return eReference with name in eClassName classifier or null
	 */
	public EReference getEReference(String eClassName, String eReferenceName){
		return getEReference(getEClass(eClassName), eReferenceName);
	}

}
