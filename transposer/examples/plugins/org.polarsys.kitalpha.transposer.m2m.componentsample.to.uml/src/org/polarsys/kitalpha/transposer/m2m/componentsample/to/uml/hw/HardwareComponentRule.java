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
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.hw;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;

/**
 * 
 * @author Faycal Abka
 *
 */
public class HardwareComponentRule extends AbstractGenericRule<HardwareComponent> {

	@Override
	public void apply(HardwareComponent hc, IContext context)
			throws Exception {
		// create UML Package for the hardware component
		org.eclipse.uml2.uml.Class umlClass = UMLFactory.eINSTANCE.createClass();

		// Set Name
		umlClass.setName(hc.getName());

		// get container
		Object container = context.get(hc.eContainer());
		
		if (container instanceof Class){
			Class umlContainer = (Class)container;
			umlContainer.createNestedClassifier(umlClass.getName(), umlClass.eClass());
			Class clazz = (Class) umlContainer.getNestedClassifier(umlClass.getName());
			context.put(hc, clazz);
		}

		if (container instanceof Package) {
			Package umlContainer = (Package) container;
			umlContainer.getPackagedElements().add(umlClass);
			// put the created package in Transposer context
			context.put(hc, umlClass);
		}

		

	}

	@Override
	public boolean isApplicableOn(HardwareComponent element) {
		return element instanceof HardwareComponent;
	}
}
