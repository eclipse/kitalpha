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
package org.polarsys.kitalpha.model.common.commands.runner;

import java.util.Deque;
import java.util.EnumSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.commands.registry.WorkflowType;
import org.polarsys.kitalpha.model.common.commands.scheduling.ModelCommandStackBuilder;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;

/**
 * @author Faycal Abka
 */
public class ModelCommandRunner implements IModelCommandRunner {
	
	private final ModelCommandStackBuilder actionsStack = new ModelCommandStackBuilder();

	@Override
	public void run(ModelScrutinyRegistry analysis, Resource resource, EnumSet<WorkflowType> workflows, IProgressMonitor monitor) throws ModelCommandException {
		
		
		actionsStack.buildModelActionStack();
		Deque<ModelCommand> stack = actionsStack.getModelActionStack();
		
		int nbActions = stack.size();
		
		SubMonitor subMonitor = SubMonitor.convert(monitor, nbActions*100);
		
		while (!stack.isEmpty()){
			ModelCommand action = stack.pop();
			
			WorkflowType actionWorkflow = action.getWokflowType();
			
			if (workflows.contains(actionWorkflow)) {
				action.exec(analysis, resource, subMonitor.newChild(100));
			}
		}
	}

}
