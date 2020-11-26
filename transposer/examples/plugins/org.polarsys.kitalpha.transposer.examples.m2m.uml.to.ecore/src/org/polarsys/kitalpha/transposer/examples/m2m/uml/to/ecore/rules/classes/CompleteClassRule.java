/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.classes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.util.ValueHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

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
	protected Object create(Class element, IContext context)
			throws Exception {

		// create the ECore EClass
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		
		// updates its structural attributes
		//set its name
		eClass.setName(element.getName());
		
		//set isAbstract Attribute
		eClass.setAbstract(element.isAbstract());

		// Creates its EAttributes
		for (Property property : element.getAllAttributes())
			createAttributes(eClass, property, context);

		// set containment
		setContainment(element, eClass, context);

		return eClass;
	}

	/**
	 * Set the containment reference
	 * 
	 * @param element :
	 *            UML Class
	 * 
	 * @param eClass :
	 *            ECore EClass
	 * 
	 * @param context :
	 *            current context
	 */
	protected void setContainment(Class element, EClass eClass,
			IContext context) {
		
		//get its container transformed
		Object containerObj = ContextHelper.getMainTarget(context, element
				.eContainer());
		
		EPackage container = (EPackage)containerObj;
		
		//add the new EClass in its container(EPackage)
		container.getEClassifiers().add(eClass);
		
	}

	/**
	 * Creates and sets EClass attributes
	 * 
	 * @param clazz :
	 *            ECore Object
	 * @param property :
	 *            UML property
	 * @param context :
	 *            current context
	 */
	protected void createAttributes(EClass clazz, Property property,
			IContext context) {
		
		//create a new EAttribute
		EAttribute att = EcoreFactory.eINSTANCE.createEAttribute();
		
		//set its name
		att.setName(property.getName());
		
		//set its EType
		ValueHelper.setType(att, property, context);
		
		//add the new EAttribute in the EClass
		clazz.getEStructuralFeatures().add(att);

	}

	/**
	 * Allows to updates EClass Structural references
	 * 
	 * @see org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule#update(java.lang.Object,
	 *      java.lang.Object,
	 *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
	 */
	@Override
	protected void update(Object object, Class element, IContext context)
			throws Exception {

			EClass eClass = (EClass)object;
			
			//Update ESuperType Reference
			
			//remove all eSuper Type
			eClass.getESuperTypes().clear();
			
			//get eSuper UML Class
			List<Class> esupers = element.getSuperClasses();
			
			for (Object esuper : esupers){
				
				if (esuper != null) {
					//get the ECORE equivalent to the UML Class
					Object ecoreEquiv = ContextHelper.getMainTarget(context, esuper);
					
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
	public List<IPremise> getPremises(Class element) {
		List<IPremise> premises = new ArrayList<IPremise>();
		IPremise premise = null;

		// its container have to created before itself
		Object value = element.getOwner();
		if(null != value){
			premise = createContainmentPremise(value);
			premises.add(premise);
		}

		//super classes have to created before itself
		List<Class> objects = element.getSuperClasses();

		for (Object v : objects) {
			premise = createPrecedencePremise(v, "esuper"); //$NON-NLS-1$
			premises.add(premise);
		}
		
		return premises;
	}
}
