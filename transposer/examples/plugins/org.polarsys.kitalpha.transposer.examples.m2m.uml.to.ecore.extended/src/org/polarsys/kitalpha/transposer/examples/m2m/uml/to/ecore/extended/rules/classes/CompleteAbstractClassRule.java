package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.extended.rules.classes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

import org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.classes.CompleteClassRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class CompleteAbstractClassRule extends CompleteClassRule {
	
	/**
	 * @see org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule#create(java.lang.Object,
	 *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
	 */
	protected Object create(Class element_p, IContext context_p)
			throws Exception {

		// create the ECore EClass
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		
		//set its name
		eClass.setName("abstract_" + eClass.getName()); //$NON-NLS-1$
		
		//set the abstract attribute
		eClass.setAbstract(true);
		
		// Creates its EAttributes
		for (Property property : element_p.getAllAttributes())
			createAttributes(eClass, property, context_p);

		// set containment
		setContainment(element_p, eClass, context_p);
		
		return eClass;
	}

	/**
	 * This rule is applicable , if the UML Class is abstract.
	 * 
	 * @see org.polarsys.kitalpha.transposer.transformation.uml.to.ecore.rules.generic.AbstractGenericRule#isApplicableOn(org.eclipse.uml2.uml.Element)
	 */
	public boolean isApplicableOn(Class element_p) {
		return element_p.isAbstract();
	}


}
