/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice;

/**
 * @author Boubekeur Zendagui
 */

public class MethodParameterData {

	private String _name;
	private String _type;
	private String _documentation;
	
	public MethodParameterData(String name, String type, String documentation) {
		_name = name;
		_type = type;
		_documentation = documentation;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		this._type = type;
	}

	public String getDocumentation() {
		return _documentation;
	}

	public void setDocumentation(String documentation) {
		this._documentation = documentation;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof MethodParameterData)
		{
			MethodParameterData foreignParameterData = (MethodParameterData) arg0;
			if (this._type == foreignParameterData.getType())
				return true;
			else
				return false;
		}
		
		return super.equals(arg0);
	}
}
