/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.api.path.variables;

import java.io.File;
import java.util.Set;

import org.polarsys.kitalpha.composer.Activator;
import org.polarsys.kitalpha.composer.internal.path.variables.ComposerVariablesRegistry;


/**
 * @author Guillaume Gebhart
 *
 */
public class ComposerVariableInterpreter {
	private static final String DEB = "$"; //$NON-NLS-1$
	public static final ComposerVariableInterpreter INSTANCE = new ComposerVariableInterpreter();
	private static final String PARENT ="../"; //$NON-NLS-1$
	private  ComposerVariablesRegistry registry = ComposerVariablesRegistry.INSTANCE;
	
	public Object execute(String value, Object obj){
		Object result = null;
		IComposerVariable var = containsVariables(value);
		if(var != null){
			Object substitution = var.execute(obj);
			String regex = DEB + var.getName();
			if(value.startsWith(PARENT)){
				File f = new File((String)substitution);
				substitution = f.getParentFile().getAbsolutePath();
				regex = PARENT + regex;
			}
			
			result = value.replace(regex, (String)substitution);
		}else{
			result = value;
		}
		return result;
	}
	
	
	/**
	 * Tests if the path use the predefined variables.
	 * if no variable found in the path then the value returned is null
	 * if a variable is used but not registered a RuntimeException is throw
	 * @param path
	 * @return the index of the variable
	 */
	private IComposerVariable containsVariables(final String path){
		IComposerVariable var = null;
		try {
			if(path != null && (!path.equals("")) && path.contains(DEB)){
				String var_name = extract(path);
				if(var_name != null && !var_name.equals("")){
					var = registry.getVariable(var_name);
					if(var == null){
							throw new Exception("The generation path use an invalid variable."); //$NON-NLS-1$
					}
				}else{
					throw new Exception("The generation path use an invalid variable."); //$NON-NLS-2$
				}
				
			}
		} catch (Exception e) {
			Activator.getDefault().error("Error while generating code",
					e);
		}
		return var;	
	}

/**
 * Allows to extract the variable from string chain
 * @param path
 * @return
 */
	private String extract(String path) {
		String var = "";
		Set<String> keys = registry.getVariables();
		for(String key : keys){
			if(path.contains(key))
				var = key;
				
		}
		return var;
	}
	
	public void addNewVariable(IComposerVariable variable) {
		registry.addNewVariable(variable);
	}
}
