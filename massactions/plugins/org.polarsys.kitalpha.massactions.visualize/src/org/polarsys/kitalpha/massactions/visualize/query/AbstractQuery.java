/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.visualize.query;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractQuery implements IQuery {

	protected EObject target;
	protected List<QueryParameter> parameters;
	protected String name;

	public void setTarget(EObject target) {
		this.target = target;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isValidFor(List<Object> values) {

		EPackage.Registry.INSTANCE.getEPackage("").getEClassifier("className or X");
		
		if (parameters.size() != values.size()) {
			return false;
		}

		for (int i = 0; i < parameters.size(); i++) {
			QueryParameter parameter = parameters.get(i);
			Object value = values.get(i);

			if (!parameter.isValidFor(value)) {
				return false;
			}
		}

		return true;
	}

	public boolean isValidFor(Object... values) {
		return isValidFor(Arrays.asList(values));
	}

	public void setParameterValues(List<Object> values) {
		for (int i = 0; i < values.size(); i++) {
			QueryParameter parameter = parameters.get(i);
			Object value = values.get(i);

			parameter.setValue(value);
		}
	}

	public void setParameterValues(Object... values) {
		setParameterValues(Arrays.asList(values));
	}
	
	public void setParameters(List<QueryParameter> parameters) {
		this.parameters = parameters;
	}

	public void setParameters(QueryParameter... parameters) {
		this.parameters = Arrays.asList(parameters);
	}

}
