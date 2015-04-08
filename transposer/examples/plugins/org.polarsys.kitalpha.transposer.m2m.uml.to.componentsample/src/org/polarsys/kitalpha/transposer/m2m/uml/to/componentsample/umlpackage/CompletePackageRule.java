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
package org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.umlpackage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Package;
import org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSampleFactory;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CompletePackageRule extends AbstractGenericRule<Package> {

	@Override
	public List<IPremise> getPremises(Package element_p) {
		
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
	protected Object create(Package element_p, IContext context_p)
			throws Exception {
		
		ComponentPackage componentPackage = ComponentSampleFactory.eINSTANCE.createComponentPackage();
		
		setContainment(element_p, componentPackage, context_p);

		return componentPackage;
	}

	private void setContainment(Package element_p,
			ComponentPackage componentPackage, IContext context_p) {

		Object container_obj = ContextHelper.getMainTarget(context_p, element_p.eContainer());

		ComponentModel cm = (ComponentModel)container_obj;
		cm.getPackages().add(componentPackage);

	}

	@Override
	protected void update(Object object_p, Package element_p, IContext context_p)
			throws Exception {
		
		ComponentPackage componentPackage = (ComponentPackage)object_p;
		
		//update the name
		String name = element_p.getName();
		componentPackage.setName(name);
		
	}

}
