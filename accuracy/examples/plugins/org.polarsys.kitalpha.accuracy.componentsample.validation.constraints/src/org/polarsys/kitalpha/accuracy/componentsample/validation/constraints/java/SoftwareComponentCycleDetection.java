/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.accuracy.componentsample.validation.constraints.java;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.validation.java.provider.generic.IJavaConstraint;

/**
 * 
 * @author Faycal Abka
 *
 */
public class SoftwareComponentCycleDetection implements IJavaConstraint<ComponentModel> {

	public SoftwareComponentCycleDetection() {
	}

	@Override
	public boolean isValid(ComponentModel cm) {
		return detectCycle(cm);
	}

	@Override
	public Class<ComponentModel> getTargetType() {
		return ComponentModel.class;
	}
	
	private Collection<SoftwareComponent> collectAllSoftwareComponents(ComponentModel cm){
		
		Collection<SoftwareComponent> result = new HashSet<SoftwareComponent>();
		
		TreeIterator<EObject> it = cm.eAllContents();
		
		while (it.hasNext()){
			EObject eObject = it.next();
			if (eObject instanceof SoftwareComponent){
				result.add((SoftwareComponent)eObject);
			}
		}
		
		return result;
	}
	
	
	private boolean detectCycle(ComponentModel cm){
		
		boolean isCycle = true;
		
		Collection<SoftwareComponent> allSoftwareComponents = collectAllSoftwareComponents(cm);
		
			for (SoftwareComponent  sc: allSoftwareComponents) {
				Collection<AbstractComponent> tmp = sc.getUse();
				
				for (AbstractComponent abstractComponent : tmp) {
					if (abstractComponent instanceof SoftwareComponent){
						if (tmp.contains(sc))
						 {
							return false; //cycle detected
						}
						
						return detectSCCycle(sc, abstractComponent);
					}
				}
			}
		return isCycle;
	}

	private boolean detectSCCycle(SoftwareComponent sc,
			AbstractComponent abstractComponent) {
		
		if (abstractComponent.getUse().contains(sc)) {
			return false;
		}
		
		EList<AbstractComponent> usedCps = abstractComponent.getUse();
		
		boolean cycle = true;
		for (AbstractComponent abstractComponent2 : usedCps) {
			cycle &= detectSCCycle(sc, abstractComponent2);
		}
		
		if (!cycle) {
			return cycle;
		}
		
		return cycle;
	}

	private boolean searchCycleOf(SoftwareComponent sc,
			Collection<AbstractComponent> tmp2) {
		
		for (AbstractComponent abstractComponent : tmp2) {
			
			Collection<AbstractComponent> tmp3 = abstractComponent.getUse();
			
			if (abstractComponent instanceof SoftwareComponent){
				if (tmp3.contains(sc)) {
					return false;
				}

				searchCycleOf((SoftwareComponent) abstractComponent, tmp3);
			}
			
		}
		
		return true;
	}

}
