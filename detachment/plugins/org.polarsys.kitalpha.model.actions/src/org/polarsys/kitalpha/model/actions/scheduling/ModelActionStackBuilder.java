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
package org.polarsys.kitalpha.model.actions.scheduling;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import org.polarsys.kitalpha.model.actions.action.ModelAction;
import org.polarsys.kitalpha.model.actions.registry.ModelActionRegistry;
import org.polarsys.kitalpha.model.actions.registry.ModelActionRegistry.RegistryActionElement;

/**
 * @author Faycal Abka
 */
public class ModelActionStackBuilder {
	private Deque<ModelAction> actionsStack;
	
	public ModelActionStackBuilder(){
		this.actionsStack = new LinkedList<ModelAction>();
	}
	
	public Deque<ModelAction> getModelActionStack(){
		return actionsStack;
	}
	
	public void buildModelActionStack(){
		Map<String, RegistryActionElement> actionsRegistry = ModelActionRegistry.INSTANCE.initRegistry();
		
		Collection<RegistryActionElement> sortedActionsElt = ModelActionStackHelper.sortActions(actionsRegistry.values());
		
		for (RegistryActionElement registryActionElement : sortedActionsElt) {
			actionsStack.push(registryActionElement.getAction());
		}
	}
}
