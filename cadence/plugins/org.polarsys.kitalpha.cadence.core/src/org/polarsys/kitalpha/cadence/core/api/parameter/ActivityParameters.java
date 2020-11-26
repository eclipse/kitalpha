/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.core.api.parameter;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class ActivityParameters {
	
	private Map<String, GenericParameter<?>> parameters;

	public ActivityParameters() {
		this.parameters = new LinkedHashMap<String, GenericParameter<?>>();
	}
	
	public void addParameter(GenericParameter<?> parameter) {
		this.parameters.put(parameter.getName(), parameter);
	}
	
	public void removeParameter(String idParameter) {
		this.parameters.remove(idParameter);
	}
	
	public GenericParameter<?> getParameter(String idParameter) {
		return this.parameters.get(idParameter);
	}

	public Collection<GenericParameter<?>> getParameters() {
		return parameters.values();
	}
	
	public Set<String> getParametersID() {
		return this.parameters.keySet();
	}
	
}
