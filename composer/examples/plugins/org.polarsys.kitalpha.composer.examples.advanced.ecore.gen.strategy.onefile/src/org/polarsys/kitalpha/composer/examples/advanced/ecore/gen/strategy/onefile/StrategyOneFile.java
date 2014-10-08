/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.strategy.onefile;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;

import ecoreadvancedalloc.Declaration;
import ecoreadvancedalloc.EcoreFile;
import ecoreadvancedalloc.EcoreRoot;
import ecoreadvancedalloc.EcoreadvancedallocFactory;

public class StrategyOneFile implements IStrategy {

	public StrategyOneFile() {
		// TODO Auto-generated constructor stub
	}

	public EcoreRoot allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p) {
		
		EcoreRoot result = EcoreadvancedallocFactory.eINSTANCE.createEcoreRoot();
		
		 EcoreFile file = EcoreadvancedallocFactory.eINSTANCE.createEcoreFile();
	        file.setName("Index.html");
	        file.setPath("/");
	        
	        Iterator<EObject> children = modelRoot_p.eAllContents();
	        while (children.hasNext()) {
	            EObject currentChild = children.next();
	            if (EcorePackage.eINSTANCE.getEClass().isInstance(currentChild)) {
	                file.getOwnedTypes().add(this.createDeclaration((EClass) currentChild));
	            }
	        }
	        
	        result.getOwnedFiles().add(file);

	        return result;
		
	}

	public EcoreRoot allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p,
			List<EObject> modelElementsToGenerate_p) {
		EcoreRoot result = EcoreadvancedallocFactory.eINSTANCE.createEcoreRoot();
		
		 EcoreFile file = EcoreadvancedallocFactory.eINSTANCE.createEcoreFile();
	        file.setName("Index.html");
	        file.setPath("/");
	        
	        for (EObject eObject : modelElementsToGenerate_p) {
	            if (EcorePackage.eINSTANCE.getEClass().isInstance(eObject)) {
	                file.getOwnedTypes().add(this.createDeclaration((EClass) eObject));
	            }
	        }
	        
	        result.getOwnedFiles().add(file);

	        return result;
	}

	public Map<String, Parameter> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, ParameterError> validateParameters(
			Map<String, Parameter> valuedParameters_p) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
     * Create a declaration for the given class.
     * 
     * @param eClass
     *            the class.
     * @return the created file.
     */
    private Declaration createDeclaration(EClass eClass) {
    	Declaration declaration = EcoreadvancedallocFactory.eINSTANCE.createDeclaration();
        declaration.setReferencedElement(eClass);
        return declaration;
    }

}
