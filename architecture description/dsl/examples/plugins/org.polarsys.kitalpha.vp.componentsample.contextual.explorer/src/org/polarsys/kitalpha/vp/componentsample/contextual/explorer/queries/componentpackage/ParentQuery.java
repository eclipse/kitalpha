/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
// Generated on 02.10.2015 at 04:26:45 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsample.contextual.explorer.queries.componentpackage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParentQuery implements IQuery {

	/**
	* <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	* Default constructor
	* @generated
	*/
	public ParentQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object_p: The model element for which the Contextual Explorer extension is generated
	* @return List of object to display in the parent category
	* @generated
	*/
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		EObject eObject = (EObject) object_p;
		result.add(eObject.eContainer());
		return result;
	}

}
