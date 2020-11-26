/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.strategy;

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

public class StrategyManyFile implements IStrategy {

	public StrategyManyFile() {
		// TODO Auto-generated constructor stub
	}

	public EcoreRoot allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p) {
		
		EcoreRoot result = EcoreadvancedallocFactory.eINSTANCE.createEcoreRoot();

        Iterator<EObject> children = modelRoot_p.eAllContents();
        while (children.hasNext()) {
            EObject currentChild = children.next();
            if (EcorePackage.eINSTANCE.getEClass().isInstance(currentChild)) {
                result.getOwnedFiles().add(this.createFile((EClass) currentChild));
            }
        }
        return result;
		
	}

	public EcoreRoot allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p,
			List<EObject> modelElementsToGenerate_p) {
		
		EcoreRoot result = EcoreadvancedallocFactory.eINSTANCE.createEcoreRoot();

		 for (EObject eObject : modelElementsToGenerate_p) {
            if (EcorePackage.eINSTANCE.getEClass().isInstance(eObject)) {
                result.getOwnedFiles().add(this.createFile((EClass) eObject));
            }
        }
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
     * Creates a file for the given class.
     * 
     * @param eClass
     *            the class.
     * @return the created file.
     */
    private EcoreFile createFile(EClass eClass) {
        Declaration declaration = EcoreadvancedallocFactory.eINSTANCE.createDeclaration();
        declaration.setReferencedElement(eClass);
        EcoreFile file = EcoreadvancedallocFactory.eINSTANCE.createEcoreFile();
        file.setName(eClass.getName() + ".html");
        file.setPath("/");
        file.getOwnedTypes().add(declaration);
        return file;
    }

}
