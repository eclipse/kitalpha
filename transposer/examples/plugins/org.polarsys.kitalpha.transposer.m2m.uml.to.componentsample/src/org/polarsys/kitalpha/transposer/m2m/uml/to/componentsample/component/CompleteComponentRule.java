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
package org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.component;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Component;
import org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSampleFactory;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CompleteComponentRule extends AbstractGenericRule<Component> {

	@Override
	public List<IPremise> getPremises(Component element_p) {
		List<IPremise> premises = new ArrayList<IPremise>();
		IPremise premise = null;

		// its container have to created before itself
		Object value = element_p.getOwner();
		if(null != value){
			premise = createContainmentPremise(value);
			premises.add(premise);
		}

		return premises;
	}

	@Override
	protected Object create(Component element_p, IContext context_p)
			throws Exception {
		// create the ECore EClass
		SoftwareComponent softwareComponent = ComponentSampleFactory.eINSTANCE.createSoftwareComponent();

		// set containment
		setContainment(element_p, softwareComponent, context_p);

		return softwareComponent;
	}

	private void setContainment(Component element_p,
			SoftwareComponent softwareComponent, IContext context_p) {
		
		//get its container transformed
		Object container_obj = ContextHelper.getMainTarget(context_p, element_p
				.eContainer());

		if (container_obj instanceof HardwareComponent){
			HardwareComponent container = (HardwareComponent)container_obj;
			container.getAbstractComponent().add(softwareComponent);
		}
		
		if (container_obj instanceof ComponentPackage){
			ComponentPackage container = (ComponentPackage)container_obj;
			container.getComponents().add(softwareComponent);
		}
		
		
	}

	@Override
	protected void update(Object object_p, Component element_p,
			IContext context_p) throws Exception {
		
		SoftwareComponent component = (SoftwareComponent)object_p;
		
		//Update Name
	
		String name = element_p.getName();
		component.setName(name);
		
	}

}
