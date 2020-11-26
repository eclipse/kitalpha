/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.extended.rules.classes;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * 
 * Rule for UML Class with one attribute
 * 
 * @author Guillaume Gebhart
 * 
 */
public class CompleteClassRule
		extends
		org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.classes.CompleteClassRule {

	/**
	 * @see org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule#create(java.lang.Object,
	 *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
	 */
	@Override
	protected Object create(Class element_p, IContext context_p)
			throws Exception {
		
		// create the ECore EClass
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		
		//set its name
		eClass.setName("data_" + element_p.getName()); //$NON-NLS-1$
		
		//set isAbstract Attribute
		eClass.setAbstract(element_p.isAbstract());
		
		// Creates its EAttributes
		for (Property property : element_p.getAllAttributes())
			createAttributes(eClass, property, context_p);

		// set containment
		setContainment(element_p, eClass, context_p);
		
		return eClass;
	}

	/**
	 * This rule is applicable , if the UML Class contains one attribute.
	 * 
	 * @see org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.generic.AbstractGenericRule#isApplicableOn(org.eclipse.uml2.uml.Element)
	 */
	public boolean isApplicableOn(Class element_p) {
		boolean result = false;
		
		//get All Attributes
		List<Property> atts = element_p.getAllAttributes();
		
		if (atts != null)
			//true if the class contains one attribute only
			result = (atts.size() == 1);

		return result;
	}

}
