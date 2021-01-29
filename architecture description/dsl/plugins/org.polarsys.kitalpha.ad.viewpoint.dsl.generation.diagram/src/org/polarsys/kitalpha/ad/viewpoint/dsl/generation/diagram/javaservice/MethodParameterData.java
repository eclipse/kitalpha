/*******************************************************************************
 * Copyright (c) 2014-2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice;

/**
 * @author Boubekeur Zendagui
 */

public class MethodParameterData {

	private String name;
	private String type;
	private String documentation;
	
	public MethodParameterData(String name, String type, String documentation) {
		this.name = name;
		this.type = type;
		this.documentation = documentation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof MethodParameterData)
		{
			MethodParameterData foreignParameterData = (MethodParameterData) arg0;
			return this.type.equals(foreignParameterData.getType());
		}
		
		return super.equals(arg0);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
