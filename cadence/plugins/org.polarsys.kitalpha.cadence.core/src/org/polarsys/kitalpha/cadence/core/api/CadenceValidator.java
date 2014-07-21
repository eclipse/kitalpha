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
package org.polarsys.kitalpha.cadence.core.api;

import java.util.Map;
import java.util.Set;

import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;


/**
 * @author Guillaume Gebhart
 *
 */
public class CadenceValidator {
	

	
	public static String cadenceErrorsTrace(Map<String, ParameterError<?>> parametersMap){
		String line = getParameterErrorsTrace(parametersMap);
		
		line = line.replaceFirst(":", ":\n"); //$NON-NLS-1$ //$NON-NLS-2$
		line = line.replaceAll(",","\n"); //$NON-NLS-1$ //$NON-NLS-2$
		
		return line;
		}
	
	
	public static String getParameterErrorsTrace(Map<String, ParameterError<?>> parametersMap){
		String result ="bad value for: "; //$NON-NLS-1$
		Set<String> keys = parametersMap.keySet();
		for(String key : keys)
			result+= key+ "->"+parametersMap.get(key).getReason()+","; //$NON-NLS-1$ //$NON-NLS-2$
		
		int end = result.lastIndexOf(","); //$NON-NLS-1$
		return result.substring(0,end);
		}
}
