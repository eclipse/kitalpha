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
package org.polarsys.kitalpha.model.common.commands.runner;

import java.util.Deque;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.commands.scheduling.ModelCommandStackBuilder;

/**
 * @author Faycal Abka
 */
public class ModelCommandRunner implements IModelCommandRunner {
	
	private final ModelCommandStackBuilder actionsStack = new ModelCommandStackBuilder();

	@Override
	public void run(Resource resource, IProgressMonitor monitor) throws ModelCommandException {
		
		
		actionsStack.buildModelActionStack();
		Deque<ModelCommand> stack = actionsStack.getModelActionStack();
		
		int nbActions = stack.size();
		
		SubMonitor subMonitor = SubMonitor.convert(monitor, nbActions*100);
		
		while (!stack.isEmpty()){
			ModelCommand action = stack.pop();
			action.exec(resource, subMonitor.newChild(100));
		}
	}

}
