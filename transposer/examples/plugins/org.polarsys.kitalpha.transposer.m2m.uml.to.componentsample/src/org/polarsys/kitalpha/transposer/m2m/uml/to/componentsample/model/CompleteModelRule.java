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
package org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Model;
import org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.constants.IConstants;
import org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSampleFactory;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CompleteModelRule extends AbstractGenericRule<Model> {

	@Override
	public List<IPremise> getPremises(Model element_p) {
		List<IPremise> premises = new ArrayList<IPremise>();
		return premises;
	}

	@Override
	protected Object create(Model element_p, IContext context_p)
			throws Exception {
		// create the ECore EClass
		ComponentModel componentModel = ComponentSampleFactory.eINSTANCE.createComponentModel();

		// set containment
		//get its container transformed
		setContainment(componentModel, context_p);
		
		return componentModel;
	}

	private void setContainment(ComponentModel componentModel,
			IContext context_p) {

		//get its container transformed
		Resource resource = (Resource)context_p.get(IConstants.COMPONENTSIMPLE_RESOURCE);
		// we add root element into the resource
		resource.getContents().add(componentModel);


	}

	@Override
	protected void update(Object object_p, Model element_p, IContext context_p)
			throws Exception {
		
		ComponentModel componentModel = (ComponentModel)object_p;
		componentModel.setName(element_p.getName());
		
	}

}
