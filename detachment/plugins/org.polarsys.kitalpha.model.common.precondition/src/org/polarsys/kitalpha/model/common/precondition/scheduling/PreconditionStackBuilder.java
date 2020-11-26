/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.precondition.scheduling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.polarsys.kitalpha.model.common.precondition.interfaces.IPrecondition;
import org.polarsys.kitalpha.model.common.precondition.registry.PreconditionRegistry;
import org.polarsys.kitalpha.model.common.precondition.registry.PreconditionRegistry.RegistryPreconditionElement;


@SuppressWarnings("rawtypes")
public class PreconditionStackBuilder {
	
	private Deque<IPrecondition> preconditionsStack;
	
	public PreconditionStackBuilder(){
		this.preconditionsStack = new LinkedList<IPrecondition>();
	}

	public Deque<IPrecondition> getPreconditionsStack() {
		return preconditionsStack;
	}
	
	public void buildPreconditionsStack(){
		Set<RegistryPreconditionElement> registry = PreconditionRegistry.INSTANCE.initRegistry();
		
		List<RegistryPreconditionElement> sortedPreconditions = new ArrayList<PreconditionRegistry.RegistryPreconditionElement>();
		
		sortedPreconditions.addAll(registry);
		
		Collections.sort(sortedPreconditions);
		
		for (RegistryPreconditionElement registryPreconditionElement : sortedPreconditions) {
			preconditionsStack.push(registryPreconditionElement.getPrecondition());
		}
		
	}

}
