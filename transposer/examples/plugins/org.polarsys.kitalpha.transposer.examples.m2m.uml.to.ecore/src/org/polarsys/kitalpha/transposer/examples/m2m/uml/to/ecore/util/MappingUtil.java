/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.uml2.uml.PrimitiveType;

/**
 * This class defines the UML => ECORE Mapping.
 * 
 * @author Guillaume Gebhart
 * 
 */
public class MappingUtil {

	private static Map<String, EDataType> primitives = new HashMap<String, EDataType>();

	static {
		
		primitives.put("boolean", EcorePackage.Literals.EBOOLEAN); //$NON-NLS-1$
		primitives.put("string", EcorePackage.Literals.ESTRING); //$NON-NLS-1$
		primitives.put("integer", EcorePackage.Literals.EINT); //$NON-NLS-1$

	}

	
	/**
	 * Get the mapping from UML primitive type to Ecore primitive 
	 * UML			ECORE
	 * boolean => EBoolean
	 * string  => EString
	 * integer => EInt
	 * 
	 * @param data_p :
	 *            UML primitive type
	 * @return the equivalent ECore primitive type
	 */
	public static EDataType getEquivalentPrimitiveTypes(
			PrimitiveType primitive_p) {
		return primitives.get(primitive_p.getName().toLowerCase());

	}

}
