/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.action;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.commands.registry.WorkflowType;

/**
 * @author Faycal Abka
 */
public abstract class ModelCommand implements IModelCommand {

	
	protected String modelAnalysisID;
	protected WorkflowType workflow;
	
	public void setModelAnalysisID(String id) {
		this.modelAnalysisID = id;
	}

	public String getModelAnalysisID() {
		return this.modelAnalysisID;
	}
	
	public void SetWorkflow(WorkflowType workflow){
		this.workflow = workflow;
	}
	
	public WorkflowType getWokflowType(){
		return this.workflow;
	}

	public abstract void exec(Resource resource, IProgressMonitor monitor)
			throws ModelCommandException;

}
