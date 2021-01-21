/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.scheduling;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.registry.ModelCommandRegistry;
import org.polarsys.kitalpha.model.common.commands.registry.ModelCommandRegistry.RegistryActionElement;

/**
 * @author Faycal Abka
 */
public class ModelCommandStackBuilder {
	private Deque<ModelCommand> actionsStack;
	
	public ModelCommandStackBuilder(){
		this.actionsStack = new LinkedList<ModelCommand>();
	}
	
	public Deque<ModelCommand> getModelActionStack(){
		return actionsStack;
	}
	
	public void buildModelActionStack(){
		Map<String, RegistryActionElement> actionsRegistry = ModelCommandRegistry.INSTANCE.initRegistry();
		
		Collection<RegistryActionElement> sortedActionsElt = ModelCommandStackHelper.sortActions2(actionsRegistry.values());
		
		for (RegistryActionElement registryActionElement : sortedActionsElt) {
			actionsStack.push(registryActionElement.getAction());
		}
	}
}
