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
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.sw;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent;

/**
 * Transform software component to UML component
 * @author Guillaume Gebhart
 *
 */
public class SoftwareComponentRule extends AbstractGenericRule<SoftwareComponent> {
	
	public SoftwareComponentRule(){
		
	}
	
	@Override
	public void apply(SoftwareComponent sc, IContext context)
			throws Exception {
		// create UML component for software component
		Component umlComponent = UMLFactory.eINSTANCE.createComponent();

		// Set Name
		umlComponent.setName(sc.getName());

		// get container of software component from Transposer context
		Object container = context.get(sc.eContainer());
		
		if (container instanceof org.eclipse.uml2.uml.Class){
			org.eclipse.uml2.uml.Class umlClassContainer = (org.eclipse.uml2.uml.Class)container;
			umlClassContainer.createNestedClassifier(umlComponent.getName(), umlComponent.eClass());
			Component component = (Component) umlClassContainer.getNestedClassifier(umlComponent.getName());
			context.put(sc, component);
		}

		if (container instanceof Package) {
			Package umlContainer = (Package) container;
			umlContainer.getPackagedElements().add(umlComponent);
			context.put(sc, umlComponent);
		}
	}
	
	@Override
	public boolean isApplicableOn(SoftwareComponent element) {
		return element instanceof SoftwareComponent;
	}

}
