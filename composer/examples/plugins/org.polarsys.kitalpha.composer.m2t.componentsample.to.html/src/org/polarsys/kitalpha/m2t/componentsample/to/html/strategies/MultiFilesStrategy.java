/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
import org.polarsys.kitalpha.composer.metamodel.allocation.base.File;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent;
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
public class MultiFilesStrategy implements IStrategy {

	public MultiFilesStrategy() {
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
		
		ComponentSampleRoot root = 
				ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleRoot();
		
		//Create componentModelType
		File modelFile = createFile(modelRoot_p);
		root.getOwnedFiles().add(modelFile);
		
		Iterator<EObject> it = modelRoot_p.eAllContents();
		
		while (it.hasNext()){
			EObject currentChild = it.next();
			//Create file for each Software/Hardware component
			File file = createFile(currentChild);
			if (file != null)
				root.getOwnedFiles().add(file);
		}
		return root;
	}


	@Override
	public Root allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p,
			List<EObject> modelElementsToGenerate_p) {
		
		ComponentSampleRoot root = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleRoot();
		
		for (EObject current : modelElementsToGenerate_p){
			File file = createFile(current);
			if (file != null)
				root.getOwnedFiles().add(file);
		}
		
		return root;
	}
	
	
	private File createFile(EObject currentChild) {
		
		ComponentSampleFile file = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleFile();
		
		if (currentChild instanceof ComponentModel){
			
			
			ComponentModelType model = ComponentSampleAllocationFactory.eINSTANCE.createComponentModelType();
			model.setReferencedElement(currentChild);
			
			file.setPath("/");
			file.setName("index.html");
			
			file.getOwnedTypes().add(model);
			
			return file;
		}
		
		if (currentChild instanceof HardwareComponent){
			
			HardwareComponent hwc = (HardwareComponent)currentChild;
			
			ComponentSampleHardware hardware = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleHardware();
			hardware.setReferencedElement(currentChild);
			
			file.setName(hwc.getName() + ".html");
			computePath(file, hwc);
			
			file.getOwnedTypes().add(hardware);
			
			return file;
		}

		if (currentChild instanceof SoftwareComponent){

			SoftwareComponent swc = (SoftwareComponent)currentChild;

			ComponentSampleSoftware software = ComponentSampleAllocationFactory.eINSTANCE.createComponentSampleSoftware();
			software.setReferencedElement(currentChild);

			file.setName(swc.getName() + ".html");
			computePath(file, swc);
			
			file.getOwnedTypes().add(software);

			return file;
		}
		
		return null;
	}

	private void computePath(ComponentSampleFile file, AbstractComponent hwc) {	
			file.setPath("/");
	}
}
