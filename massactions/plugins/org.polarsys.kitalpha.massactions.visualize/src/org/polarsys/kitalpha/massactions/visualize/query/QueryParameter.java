/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.visualize.query;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

public class QueryParameter {

	// must correspond to a column name
	private String name;
	
	private Object value;
	
	// for now take the textual value
	private Set<String> validTypes;

	public QueryParameter(){
		validTypes = new HashSet<>();
		name = "";
		value = "";
	}
			
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public boolean isValidFor(Object value){
	
		String type;
		
		if(value instanceof EObject){
			type = ((EObject) value).eClass().getInstanceTypeName();
		}
		else{
			type = value.getClass().getName();
		}
		
		return validTypes.contains(type);		
	}

	
	public Set<String> getValidTypes() {
		return validTypes;
	}
		
}
