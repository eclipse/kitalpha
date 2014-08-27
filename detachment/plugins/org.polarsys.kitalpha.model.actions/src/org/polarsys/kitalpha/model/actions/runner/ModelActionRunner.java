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
package org.polarsys.kitalpha.model.actions.runner;

import java.util.Deque;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.actions.action.ModelAction;
import org.polarsys.kitalpha.model.actions.exception.ModelActionException;
import org.polarsys.kitalpha.model.actions.scheduling.ModelActionStackBuilder;

/**
 * @author Faycal Abka
 */
public class ModelActionRunner implements IModelActionRunner {
	
	private final ModelActionStackBuilder actionsStack = new ModelActionStackBuilder();

	@Override
	public void run(Resource resource, IProgressMonitor monitor) throws ModelActionException {
		
		
		actionsStack.buildModelActionStack();
		Deque<ModelAction> stack = actionsStack.getModelActionStack();
		
		int nbActions = stack.size();
		
		SubMonitor subMonitor = SubMonitor.convert(monitor, nbActions*100);
		
		while (!stack.isEmpty()){
			ModelAction action = stack.pop();
			action.exec(resource, subMonitor.newChild(100));
		}
	}

}
