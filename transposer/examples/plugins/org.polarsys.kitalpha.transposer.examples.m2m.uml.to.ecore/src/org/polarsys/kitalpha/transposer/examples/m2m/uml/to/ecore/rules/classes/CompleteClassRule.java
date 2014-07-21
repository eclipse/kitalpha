/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;
import org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.util.ValueHelper;

/**
 * Class rule
 * 
 * @author Guillaume Gebhart
 * 
 */
public class CompleteClassRule extends AbstractGenericRule<Class> {

	/**
	 * Allows to create Ecore "EClass" Object
	 * 
	 * @see org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule#create(java.lang.Object,
	 *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
	 */
	@Override
	protected Object create(Class element_p, IContext context_p)
			throws Exception {

		// create the ECore EClass
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		
		// updates its structural attributes
		//set its name
		eClass.setName(element_p.getName());
		
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
	 * Set the containment reference
	 * 
	 * @param element_p :
	 *            UML Class
	 * 
	 * @param eClass_p :
	 *            ECore EClass
	 * 
	 * @param context_p :
	 *            current context
	 */
	protected void setContainment(Class element_p, EClass eClass_p,
			IContext context_p) {
		
		//get its container transformed
		Object container_obj = ContextHelper.getMainTarget(context_p, element_p
				.eContainer());
		
		EPackage container = (EPackage)container_obj;
		
		//add the new EClass in its container(EPackage)
		container.getEClassifiers().add(eClass_p);
		
	}

	/**
	 * Creates and sets EClass attributes
	 * 
	 * @param class_p :
	 *            ECore Object
	 * @param property_p :
	 *            UML property
	 * @param context_p :
	 *            current context
	 */
	protected void createAttributes(EClass class_p, Property property_p,
			IContext context_p) {
		
		//create a new EAttribute
		EAttribute att = EcoreFactory.eINSTANCE.createEAttribute();
		
		//set its name
		att.setName(property_p.getName());
		
		//set its EType
		ValueHelper.setType(att, property_p, context_p);
		
		//add the new EAttribute in the EClass
		class_p.getEStructuralFeatures().add(att);

	}

	/**
	 * Allows to updates EClass Structural references
	 * 
	 * @see org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule#update(java.lang.Object,
	 *      java.lang.Object,
	 *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
	 */
	@Override
	protected void update(Object object_p, Class element_p, IContext context_p)
			throws Exception {

			EClass eClass = (EClass)object_p;
			
			//Update ESuperType Reference
			
			//remove all eSuper Type
			eClass.getESuperTypes().clear();
			
			//get eSuper UML Class
			List<Class> esupers = element_p.getSuperClasses();
			
			for (Object esuper : esupers){
				
				if (esuper != null) {
					//get the ECORE equivalent to the UML Class
					Object ecoreEquiv = ContextHelper.getMainTarget(context_p, esuper);
					
					if(ecoreEquiv !=null)
						
						//add ecore equivalent to ESuper Type reference
						eClass.getESuperTypes().add((EClass)ecoreEquiv);
				}
				
			}
		
	}

	/**
	 * Allows to define precedence premises
	 * 
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule#getPremises(java.lang.Object)
	 */
	public List<IPremise> getPremises(Class element_p) {
	 List<IPremise> premises = new ArrayList<IPremise>();
	 IPremise premise = null;
	 
		// its container have to created before itself
		Object value = element_p.getOwner();
		if(null != value){
			premise = createContainmentPremise(value);
			premises.add(premise);
		}
		
		//super classes have to created before itself
		value = element_p.getSuperClasses();

		if (value instanceof List) {
			List<Object> objects = Arrays.asList(value);
			for (Object v : objects)
				premise = createPrecedencePremise(v, "esuper"); //$NON-NLS-1$
				premises.add(premise);
		}
		return premises;
	}
}
