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
package org.polarsys.kitalpha.emde.diagram.services;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <p> 
 * This class contains all services that was originally written with Acceleo 2
 * </p>
 * 
 * These are some indications to read methods names
 * <ul>
 * <li> <b><code>SFE</code></b> : Source Finder Expression </p> </li>
 * <li> <b><code>SCE</code></b> : Semantic Candidate Expression </p> </li>
 * <li> <b><code>PE</code></b> : Precondition Expression </p> </li>
 * </ul>
 * 
 * @author Boubekeur Zendagui
 * 
 */
public class ExpressionServices {

	/**
	 * 
	 * @param context
	 * @return
	 */
	public EObject SFE_ExtensionLink(EStringToStringMapEntryImpl context){
		final EObject rootContainer = context.eContainer().eContainer();
		return rootContainer instanceof EClass ? rootContainer : null;
	}
	
	/**
	 * 
	 * @param ePackage
	 * @return
	 */
	public Collection<EObject> SCE_ExtensibleElement(EPackage ePackage){
		Collection<EObject> result = new HashSet<EObject>();
		final EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
		for (EClassifier eClassifier : eClassifiers) 
		{
			if (eClassifier instanceof EClass && ExtensibilityService.isInstanceOf((EClass) eClassifier, EmdePackage.Literals.ELEMENT_EXTENSION))
			{
				result.add(eClassifier);
			}
		}
		
		return result;
	}
	
//	[not eResource().toString().nContains(diagram.eGet('target').eResource().toString())/]
	
	public boolean PE_ExtensibleElement(EClass eClass, DSemanticDiagram diagram){
		EPackage ePackage = eClass.getEPackage();
		final String diagramTargetResourceString = diagram.getTarget().eResource().toString();
		final String ePackageResourceString = ePackage.eResource().toString();
		return ! ePackageResourceString.contains(diagramTargetResourceString);
	}
}
