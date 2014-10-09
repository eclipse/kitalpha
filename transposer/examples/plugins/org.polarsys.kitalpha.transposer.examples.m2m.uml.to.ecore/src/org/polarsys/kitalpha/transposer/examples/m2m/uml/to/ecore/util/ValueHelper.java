/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

/**
 * This class provides facilities to handle values
 * 
 * @author Guillaume Gebhart
 * 
 */
public class ValueHelper {

	/**
	 * Set the Type of Attribute Element
	 * 
	 * @param att_p :
	 *            The ECore Attribute
	 * 
	 * @param property_p :
	 *            The UML Property
	 * 
	 * @param context_p :
	 *            The current context
	 */
	public static void setType(EAttribute att_p, Property property_p,
			IContext context_p) {
		EObject UMLtype = property_p.getType();
		Object dataT = null;
		
		if (UMLtype instanceof PrimitiveType) { // if type is a UML Primitive
												// Type
			PrimitiveType primitive = (PrimitiveType) UMLtype;
			
			//return is equivalent to ECORE
			dataT = MappingUtil.getEquivalentPrimitiveTypes(primitive);

		} else { // if type is a model Element already transformed
			dataT = ContextHelper.getMainTarget(context_p, UMLtype);

		}
		if (dataT != null)
			att_p.setEType((EClassifier)dataT);
		
			
	}

}
