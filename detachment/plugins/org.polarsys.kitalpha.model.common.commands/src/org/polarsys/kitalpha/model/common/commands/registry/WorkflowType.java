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
package org.polarsys.kitalpha.model.common.commands.registry;

import org.polarsys.kitalpha.model.common.commands.Messages;

/**
 * 
 * @author Faycal Abka
 *
 */
public enum WorkflowType {
	ALL,			//The command will be executed in all workflows
	DETACHMENT;		//The command will be executed in the Detachment Workflow
	
	public static WorkflowType getWorkflowEnumItemFromString(String item_str){
		if (item_str.equals(WorkflowType.ALL.toString())){
			return WorkflowType.ALL;
		}
		
		if (item_str.equals(WorkflowType.DETACHMENT.toString())){
			return WorkflowType.DETACHMENT;
		}
		
		throw new RuntimeException(Messages.bind(Messages.UNKNOWN_WORKFLOW_ERROR, item_str));
	}
}
