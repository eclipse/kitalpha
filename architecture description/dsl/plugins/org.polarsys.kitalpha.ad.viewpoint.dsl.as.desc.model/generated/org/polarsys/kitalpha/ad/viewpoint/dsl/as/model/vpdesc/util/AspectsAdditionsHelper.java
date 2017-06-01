/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

/**
 * @generated NOT
 */

public class AspectsAdditionsHelper {

	/**
	 * @generated NOT
	 */
	public static boolean canAddMoreAspect(EObjectContainmentEList<Aspect> vpAspects, 
			Aspect aspect){
		EClass aClazz = aspect.eClass();
		for (EObject eObject : vpAspects){
			if (aClazz == eObject.eClass()){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @generated NOT
	 */
	public static boolean canAddMoreAspects(EObjectContainmentEList<Aspect> vpAspects, 
										Collection<? extends Aspect> aspects){
		for (EObject aspectToAdd : aspects) {
			EClass aClazz = aspectToAdd.eClass();
			for (EObject vpAspect : vpAspects) {
				if (aClazz == vpAspect.eClass())
					return false;
			}
		}
		return true;
	}
	
	/**
	 * @generated NOT
	 */
	public static boolean canAddMoreAspect(Viewpoint vp, 
			Aspect aspect){
		EClass aClazz = aspect.eClass();
		for (EObject eObject : vp.getVP_Aspects()){
			if (aClazz == eObject.eClass()){
				return false;
			}
		}
		return true;
	}

	/**
	 * @generated NOT
	 */
	public static boolean canAddMoreAspects(Viewpoint vp, 
			Collection<? extends Aspect> aspects){
		for (Aspect aspectToAdd : aspects) {
			EClass aClazz = aspectToAdd.eClass();
			for (Aspect vpAspect : vp.getVP_Aspects()) {
				if (aClazz == vpAspect.eClass())
					return false;
			}
		}
		return true;
	}
	
}
