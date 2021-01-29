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
package org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.umlclass;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSampleFactory;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CompleteClassRule extends AbstractGenericRule<Class> {

	@Override
	public List<IPremise> getPremises(Class element_p) {
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
	protected Object create(Class element_p, IContext context_p)
			throws Exception {
		// create the ECore EClass
		HardwareComponent component = ComponentSampleFactory.eINSTANCE.createHardwareComponent();

		// set containment
		setContainment(element_p, component, context_p);

		return component;
	}

	private void setContainment(Class element_p, HardwareComponent component,
			IContext context_p) {

		//get its container transformed
		Object container_obj = ContextHelper.getMainTarget(context_p, element_p
				.eContainer());
		
		if (container_obj instanceof HardwareComponent){
			HardwareComponent ac = (HardwareComponent)container_obj;
			ac.getAbstractComponent().add(component);
		}
		
		if (container_obj instanceof ComponentPackage){
			ComponentPackage cp = (ComponentPackage)container_obj;
			cp.getComponents().add(component);
		}
		
	}

	@Override
	protected void update(Object object_p, Class element_p, IContext context_p)
			throws Exception {
		
		HardwareComponent component = (HardwareComponent)object_p;
		
		//Update Name
		String name = element_p.getName();
		component.setName(name);
		
	}

}
