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
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.componentpackage;

import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage;

public class ComponentPackageRule extends AbstractGenericRule<ComponentPackage> {

	@Override
	public void apply(ComponentPackage cp, IContext context)
			throws Exception {
		// create UML Package for the hardware component
		Package umlPackage = UMLFactory.eINSTANCE.createPackage();

		// Set Name
		umlPackage.setName(cp.getName());

		// get container
		Object container = context.get(cp.eContainer());
		
		if (container instanceof Package) {
			Package umlContainer = (Package) container;
			umlContainer.getPackagedElements().add(umlPackage);
		}
		
		// put the created package in Transposer context
		context.put(cp, umlPackage);
	}

	@Override
	public boolean isApplicableOn(ComponentPackage element) {
		return element instanceof ComponentPackage;
	}
}
