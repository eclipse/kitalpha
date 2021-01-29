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
package org.polarsys.kitalpha.model.common.commands.action;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.commands.registry.WorkflowType;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;

/**
 * @author Faycal Abka
 */
public abstract class ModelCommand implements IModelCommand {

	
	protected String modelAnalysisID;
	protected WorkflowType workflow;
	
	@Override
	public void setModelAnalysisID(String id) {
		this.modelAnalysisID = id;
	}

	@Override
	public String getModelAnalysisID() {
		return this.modelAnalysisID;
	}
	
	@Override
	public void SetWorkflow(WorkflowType workflow){
		this.workflow = workflow;
	}
	
	@Override
	public WorkflowType getWokflowType(){
		return this.workflow;
	}

	@Override
	public abstract void exec(ModelScrutinyRegistry analysis, Resource resource, IProgressMonitor monitor)
			throws ModelCommandException;

}
