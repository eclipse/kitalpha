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


package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.packages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Package;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;
import org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.generic.AbstractGenericRule;

/**
 * 
 * UML Package rule
 * 
 * @author Guillaume Gebhart
 * 
 */
public class CompletePackageRule extends AbstractGenericRule<Package> {

	/**
	 * Allows to create Ecore "EPackage" Object
	 * 
	 * @see org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule#create(java.lang.Object,
	 *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
	 */
	@Override
	protected Object create(Package element_p, IContext context_p)
			throws Exception {

		// create the ECore EPackage
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();

		// updates its structural attributes
		//set its name
		ePackage.setName(element_p.getName());

		// set containment
		setContainment(element_p, ePackage, context_p);

		return ePackage;
	}

	/**
	 * Set the containment reference
	 * 
	 * @param element_p :
	 *            UML Package
	 * 
	 * @param eClass_p :
	 *            ECore EPackage
	 * 
	 * @param context_p :
	 *            current context
	 */
	private void setContainment(Package element_p, EPackage package_p,
			IContext context_p) {
		Object container_obj = ContextHelper.getMainTarget(context_p, element_p
				.eContainer());
		if (container_obj == null) {
			ResourceSet res = (ResourceSet) context_p.get(ResourceUtil.TRANSPOSER_RESOURCE_SET); //get the EMF ResourceSet
			Resource resource = res.getResources().get(0); // get the first
															// resource
			resource.getContents().add(package_p);
		} else {
			EObject container = (EObject) container_obj;
			
			if(container instanceof EPackage){ 
				//set the new EPackage in its EPackage container
				((EPackage)container).getESubpackages().add(package_p); 
			}
		}
	}

	/**
	 * Allows to updates EPackage Structural references
	 * 
	 * @see org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule#update(java.lang.Object,
	 *      java.lang.Object,
	 *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
	 */
	@Override
	protected void update(Object object_p, Package element_p, IContext context_p)
			throws Exception {
		// Nothing
	}

	/**
	 * Allows to define precedence premises
	 * 
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule#getPremises(java.lang.Object)
	 */
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

}
