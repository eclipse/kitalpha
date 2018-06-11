/**
 * Copyright (c) 2015, 2018 Thales Global Services.
 * All rights reserved.
 */
package org.polarsys.kitalpha.composer.api.path.decoders;

import org.polarsys.kitalpha.composer.api.path.variables.ComposerVariableInterpreter;

/**
 * @author Guillaume Gebhart
 *
 */
public class ComposerVariablePathDecoder implements IVariableDecoder{

	
	/**
	 * Compute Path including ComposerVariable.
	 * @param path
	 * @param object
	 * @return {@link String}
	 */
	@Override
	public String decodePath(final String path, final Object object){
		String value = "";
		
		final Object result = ComposerVariableInterpreter.INSTANCE.execute(path, object);
		if(result !=  null){
			if(result instanceof String){
				value = (String) result;
			}
		}
		
		return value;
	}
	
}
