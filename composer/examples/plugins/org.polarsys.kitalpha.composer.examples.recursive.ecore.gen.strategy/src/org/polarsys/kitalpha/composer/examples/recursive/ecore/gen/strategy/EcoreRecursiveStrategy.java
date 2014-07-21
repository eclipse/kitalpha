/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.examples.recursive.ecore.gen.strategy;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

import ecorerecursivealloc.EcoreAllocFile;
import ecorerecursivealloc.EcoreAllocRoot;
import ecorerecursivealloc.EcoreAllocType;
import ecorerecursivealloc.EcorerecursiveallocFactory;

public class EcoreRecursiveStrategy implements IStrategy {

	public EcoreRecursiveStrategy() {
		// TODO Auto-generated constructor stub
	}

	public EcoreAllocRoot allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p) {
		
		EcoreAllocRoot result = EcorerecursiveallocFactory.eINSTANCE.createEcoreAllocRoot();
        
        EcoreAllocFile file = EcorerecursiveallocFactory.eINSTANCE.createEcoreAllocFile();
        file.setName("Index.html");
        file.setPath("/");
        
        Iterator<EObject> children = modelRoot_p.eAllContents();
        while (children.hasNext()) {
            EObject currentChild = children.next();
            EcoreAllocType type = EcorerecursiveallocFactory.eINSTANCE.createEcoreAllocType();
            type.setReferencedElement(currentChild);
            
            file.getOwnedTypes().add(type);
        }
        
        result.getOwnedFiles().add(file);

        return result;
		
	}

	public Root allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p,
			List<EObject> modelElementsToGenerate_p) {
		
		EcoreAllocRoot result = EcorerecursiveallocFactory.eINSTANCE.createEcoreAllocRoot();
        
        EcoreAllocFile file = EcorerecursiveallocFactory.eINSTANCE.createEcoreAllocFile();
        file.setName("Index.html");
        file.setPath("/");
        
        for (EObject eObject : modelElementsToGenerate_p) {
            EcoreAllocType type = EcorerecursiveallocFactory.eINSTANCE.createEcoreAllocType();
            type.setReferencedElement(eObject);
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

}
