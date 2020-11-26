/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.internal.path.variables;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.polarsys.kitalpha.composer.api.path.variables.IComposerVariable;
import org.polarsys.kitalpha.composer.internal.path.variables.common.ModelDir;
import org.polarsys.kitalpha.composer.internal.path.variables.common.ProjectDir;

/**
 * @author Guillaume Gebhart
 *
 */
public class ComposerVariablesRegistry {

	public static final ComposerVariablesRegistry INSTANCE = new ComposerVariablesRegistry();
	
	private Map<String,IComposerVariable> variables;
	
	private ComposerVariablesRegistry(){
		variables = new HashMap<String, IComposerVariable>();
		insertDefaultVariables();
	}

	private void insertDefaultVariables() {
		addNewVariable(new ModelDir());
		addNewVariable(new ProjectDir());
		
		
	}
	
	public void addNewVariable(IComposerVariable variable) {
		variables.put(variable.getName(),variable);
	}

	public IComposerVariable getVariable(String variable) {
		return variables.get(variable);
	}
	
	public Set<String> getVariables(){
		return variables.keySet();
	}
	
}
