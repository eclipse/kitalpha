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
package org.polarsys.kitalpha.m2t.componentsample.to.html.refineries;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;
import org.polarsys.kitalpha.m2t.componentsample.to.html.helper.ComputeLinkHelper;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent;

import componentSampleAllocation.ComponentSampleAllocationFactory;
import componentSampleAllocation.ComponentSampleHardware;
import componentSampleAllocation.ComponentSampleSoftware;
import componentSampleAllocation.ComponentType;
import componentSampleAllocation.ContainedBy;
import componentSampleAllocation.Contains;
import componentSampleAllocation.UsedBy;
import componentSampleAllocation.Uses;
import componentSampleAllocation.util.ComponentSampleAllocationSwitch;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentSampleAllocVisitor extends ComponentSampleAllocationSwitch<ComponentType>{
	
	
	@Override
	public ComponentType caseComponentSampleHardware(ComponentSampleHardware hardware){
		
		Root root = (Root) EcoreUtil.getRootContainer(hardware);
		boolean isSingleStrategy = root.getOwnedFiles().size() == 1;
		
		HardwareComponent hwc = (HardwareComponent)hardware.getReferencedElement();
		
		//Contains
		EList<AbstractComponent> contains = hwc.getAbstractComponent();
		
		for (AbstractComponent component : contains) {
			Contains containsCps = ComponentSampleAllocationFactory.eINSTANCE.createContains();
			
			containsCps.setComponentName(component.getName());
			
			if (isSingleStrategy)
				containsCps.setLink(ComputeLinkHelper.computeSingleLink(component));
			else
				containsCps.setLink(ComputeLinkHelper.computeLink(component));
			
			hardware.getContainsComponents().add(containsCps);
		}
		
		//Contained by
		EObject eContainer = hwc.eContainer();
		
		if (eContainer instanceof HardwareComponent){
			ContainedBy containedBy = ComponentSampleAllocationFactory.eINSTANCE.createContainedBy();
			HardwareComponent hc = (HardwareComponent)eContainer;
			containedBy.setComponentName(hc.getName());
			
			if (isSingleStrategy)
				containedBy.setLink(ComputeLinkHelper.computeSingleLink(hc));
			else
				containedBy.setLink(ComputeLinkHelper.computeLink(hc));
			hardware.setContainedByComponent(containedBy);
		}
		
		
		
		//Uses
		EList<AbstractComponent> uses = hwc.getUse();
		
		for (AbstractComponent use : uses) {
			Uses theUsedComponent = ComponentSampleAllocationFactory.eINSTANCE.createUses();
			theUsedComponent.setComponentName(use.getName());
			theUsedComponent.setLink(ComputeLinkHelper.computeLink(use));
			
			hardware.getUsedComponents().add(theUsedComponent);
		}
		
		//used by
		ECrossReferenceAdapter crossRef = getCrossReferencer(hwc.eResource());
		
		for(Setting setting: crossRef.getInverseReferences(hwc)){
			EObject obj = setting.getEObject();
			
			if (obj instanceof AbstractComponent){
				AbstractComponent ac = (AbstractComponent)obj;

				if (ac.getUse().contains(hwc)){
					UsedBy usedBy = ComponentSampleAllocationFactory.eINSTANCE.createUsedBy();

					usedBy.setComponentName(ac.getName());
					usedBy.setLink(ComputeLinkHelper.computeLink(ac));
					hardware.getUsedByComponent().add(usedBy);
				}
			}
		}
		
		return hardware;
	}
	
	

	@Override
	public ComponentType caseComponentSampleSoftware(ComponentSampleSoftware software){
		
		SoftwareComponent swc = (SoftwareComponent)software.getReferencedElement();
		
		Root root = (Root) EcoreUtil.getRootContainer(software);
		boolean isSingleStrategy = root.getOwnedFiles().size() == 1;
		
		//Contained by
		EObject eContainer = swc.eContainer();
		ContainedBy containedBy = ComponentSampleAllocationFactory.eINSTANCE.createContainedBy();
		

		if (eContainer instanceof HardwareComponent){
			//by hardware component
			HardwareComponent hc = (HardwareComponent)eContainer;
			containedBy.setComponentName(hc.getName());
			
			if (isSingleStrategy)
				containedBy.setLink(ComputeLinkHelper.computeSingleLink(hc));
			else
				containedBy.setLink(ComputeLinkHelper.computeLink(hc));
			software.setContainedByComponent(containedBy);
		}
		
		
		//Uses
		EList<AbstractComponent> uses = swc.getUse();
		
		for (AbstractComponent use : uses) {
			Uses theUsedComponent = ComponentSampleAllocationFactory.eINSTANCE.createUses();
			theUsedComponent.setComponentName(use.getName());
			theUsedComponent.setLink(ComputeLinkHelper.computeLink(use));
			
			software.getUsedComponents().add(theUsedComponent);
		}
		
		//Used by
		ECrossReferenceAdapter crossRef = getCrossReferencer(swc.eResource());

		for(Setting setting: crossRef.getInverseReferences(swc)){
			EObject obj = setting.getEObject();

			if (obj instanceof AbstractComponent){
				AbstractComponent ac = (AbstractComponent)obj;

				if (ac.getUse().contains(swc)){
					UsedBy usedBy = ComponentSampleAllocationFactory.eINSTANCE.createUsedBy();

					usedBy.setComponentName(ac.getName());
					usedBy.setLink(ComputeLinkHelper.computeLink(ac));
					software.getUsedByComponent().add(usedBy);
				}
			}
		}

		return software;
	}

	
	private ECrossReferenceAdapter installCrossReferencer(Resource resource){
		ECrossReferenceAdapter crossRef = new ECrossReferenceAdapter();
		
		EList<Resource> resources = resource.getResourceSet().getResources();
		
		for (Resource resource2 : resources) {
			resource2.eAdapters().add(crossRef);
		}
		
		return crossRef;
	}
	
	private ECrossReferenceAdapter getCrossReferencer(Resource resource){
		
		EList<Adapter> adapters = resource.eAdapters();
		
		for (Adapter adapter : adapters) {
			if (adapter instanceof ECrossReferenceAdapter){
				return (ECrossReferenceAdapter)adapter;
			}
		}
		
		return installCrossReferencer(resource);
	}
	
}
