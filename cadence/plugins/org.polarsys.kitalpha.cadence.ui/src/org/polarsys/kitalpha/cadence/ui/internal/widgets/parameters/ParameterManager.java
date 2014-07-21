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

/**
 * 
 */
package org.polarsys.kitalpha.cadence.ui.internal.widgets.parameters;

import java.util.Map;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.cadence.ui.api.dialog.IParameterManager;
import org.polarsys.kitalpha.cadence.ui.internal.CadenceHelper;



/**
 * @author Guillaume Gebhart
 *
 */
public class ParameterManager implements IParameterManager{

	
	public String validParameter(Object parameter_p, Object container_p, Map<String,String> parameters_p){
String result = "";
		
		GenericParameter<?> param = (GenericParameter<?>)parameter_p;
		String name = param.getName();
		
		
		
		Map<String, ParameterError<?>> map = validAllParamaters(container_p,  parameters_p);
		if(map!= null){
			ParameterError<?> error = map.get(name);
			if(error != null){
				result = formatter(name, error);
			}
		}
		return  result;
	}
	
	
	
	
	private String formatter(String name, ParameterError<?> error) {
		String result = name +":" + error.getReason();
		return result;
	}


	public Map<String, ParameterError<?>> validAllParamaters(Object element_p, Map<String,String> map){
		Map<String, ParameterError<?>> result = null;
		
		IActivity activitySelected = (IActivity)element_p;

		
			result = activitySelected
			.validateParameters(CadenceHelper
					.constructMapFromString(map,
							activitySelected));
		
			// if parameters is NOK

	         
		return result;
	}
	


	public String getName(Object o){
		String string = null;
		if (o instanceof GenericParameter<?>) {
			GenericParameter<?> parameter = (GenericParameter<?>)o;
			string = parameter.getName();
		}
		return string;
	}
	
	public String getDescription(Object o){
		String string = null;
		
		if (o instanceof GenericParameter<?>) {
			GenericParameter<?> parameter = (GenericParameter<?>)o;
			string = parameter.getDescription();
		}
		return string;
	}
}
