/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.m2t.componentsample.to.html.strategies;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent;

import componentSampleAllocation.ComponentModelType;
import componentSampleAllocation.ComponentSampleAllocationFactory;
import componentSampleAllocation.ComponentSampleFile;
import componentSampleAllocation.ComponentSampleHardware;
import componentSampleAllocation.ComponentSampleRoot;
import componentSampleAllocation.ComponentSampleSoftware;

/**
 * 
 * @author Faycal Abka
 *
 */
public class OneFileStrategy implements IStrategy {

	public OneFileStrategy() {
	}

	@Override
	public Map<String, Parameter> getParameters() {
		return null;
	}

	@Override
	public Map<String, ParameterError> validateParameters(
			Map<String, Parameter> valuedParameters_p) {
		return null;
	}

	@Override
	public Root allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p){
		
		ComponentSampleRoot root = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleRoot();
		
		//Create componentModelType
		ComponentSampleFile file = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleFile();
		file.setName("index.html");
		file.setPath("/");
		
		Iterator<EObject> it = modelRoot_p.eAllContents();
		
		if (modelRoot_p instanceof ComponentModel){
			ComponentModelType type = ComponentSampleAllocationFactory.eINSTANCE.createComponentModelType();
			type.setReferencedElement(modelRoot_p);
			file.getOwnedTypes().add(type);
		}

		while (it.hasNext()){
			EObject next = it.next();
			
			if (next instanceof SoftwareComponent){

				ComponentSampleSoftware software = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleSoftware();
				software.setReferencedElement(next);

				file.getOwnedTypes().add(software);
			}
			
			if (next instanceof HardwareComponent){
				
				ComponentSampleHardware hardware = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleHardware();
				hardware.setReferencedElement(next);
				
				file.getOwnedTypes().add(hardware);
			}
		}

		root.getOwnedFiles().add(file);
		return root;
	}

	@Override
	public Root allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p,
			List<EObject> modelElementsToGenerate_p) {
		
		ComponentSampleRoot root = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleRoot();
		
		//Create componentModelType
		ComponentSampleFile file = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleFile();
		file.setName("index.html");
		file.setPath("/");
		
		for (EObject eObject : modelElementsToGenerate_p) {
			if (eObject instanceof ComponentModel){
				ComponentModelType type = ComponentSampleAllocationFactory.eINSTANCE.createComponentModelType();
				type.setReferencedElement(eObject);
				file.getOwnedTypes().add(type);
				break;
			}
		}
		
		root.getOwnedFiles().add(file);
		return root;
	}

}
