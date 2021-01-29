/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.m2t.componentsample.to.html.refineries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;
import componentSampleAllocation.ComponentModelType;
import componentSampleAllocation.ComponentSampleHardware;
import componentSampleAllocation.ComponentSampleRoot;
import componentSampleAllocation.ComponentSampleSoftware;
import componentSampleAllocation.ComponentType;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentSampleRefinery implements IRefinery {

	public ComponentSampleRefinery() {
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
	public Root refineModelElements(Root allocRoot_p,
			Map<String, Parameter> refineryParams_p) {
		Set<ComponentSampleSoftware> softwares = new HashSet<ComponentSampleSoftware>();
		Set<ComponentSampleHardware> hardwares = new HashSet<ComponentSampleHardware>();
		ComponentModelType modelType = null;
		
		ComponentSampleRoot root = (ComponentSampleRoot)allocRoot_p;
		ComponentSampleAllocVisitor v = new ComponentSampleAllocVisitor();
		
		List<EObject> allContents = getAllContents(root);
		
		for (EObject eObject : allContents) {
			if (eObject instanceof ComponentModelType)
				modelType = (ComponentModelType) eObject;
			//Create used, uses, contains, container components...
			ComponentType type = v.doSwitch(eObject);
			
			if (type instanceof ComponentSampleHardware)
				hardwares.add((ComponentSampleHardware) type);
			else
				softwares.add((ComponentSampleSoftware) type);
		}

		addComponentTypesToModelType(softwares, hardwares, modelType);
		return root;
	}
	
	
	private void addComponentTypesToModelType(
			Set<ComponentSampleSoftware> softwares,
			Set<ComponentSampleHardware> hardwares, ComponentModelType modelType) {

		if (modelType == null)
			throw new RuntimeException("Error: No model type found in the allocation model");
		
		if (softwares != null && !softwares.isEmpty()){
			for (ComponentSampleSoftware componentSampleSoftware : softwares) {
				if (componentSampleSoftware != null)
					modelType.getSoftwarecomponents().add(componentSampleSoftware);
			}
		}
		
		if (hardwares != null && !hardwares.isEmpty()){
			for (ComponentSampleHardware componentSampleHardware : hardwares) {
				if (componentSampleHardware != null)
					modelType.getHardwareComponents().add(componentSampleHardware);
			}
		}
	}

	private List<EObject> getAllContents(ComponentSampleRoot root){
		Iterator<EObject> it = root.eAllContents();
		List<EObject> result = new ArrayList<EObject>();
		while(it.hasNext()){
			result.add(it.next());
		}
		
		return result;
	}
}
