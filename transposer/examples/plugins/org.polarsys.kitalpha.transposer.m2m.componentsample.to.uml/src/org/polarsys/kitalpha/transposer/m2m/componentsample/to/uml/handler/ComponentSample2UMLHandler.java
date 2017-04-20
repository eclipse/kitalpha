/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.transposer.api.TransposerConfiguration;
import org.polarsys.kitalpha.transposer.api.TransposerLauncher;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentSample2UMLHandler extends AbstractHandler {
	
	
	private static final String LOAD_ACTIVITY = "org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.initTransformation";
	private static final String SAVE_ACTIVITY = "org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.PostTransformation";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		Object firstElement = ((StructuredSelection)selection).getFirstElement();
		if (firstElement instanceof GraphicalEditPart){
			firstElement = ((GraphicalEditPart)firstElement).resolveSemanticElement();
		}
		if (firstElement instanceof DSemanticDecorator){
			EObject target = ((DSemanticDecorator)firstElement).getTarget();
			
			if (target instanceof ComponentElement) {
				TransposerConfiguration configuration = initializeTransposerConfiguration((ComponentElement) target);
				TransposerLauncher.launch(target, 
						"org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.purpose",
						"org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.mapping", 
						configuration, null, new NullProgressMonitor());
			} else {
				final String message = "The Transformation is only available from Component Sample elements";
				MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
						"Transposer Launching", message);
			}
		}
		
		return null;
	}
	
	protected TransposerConfiguration initializeTransposerConfiguration(ComponentElement componentElement) {
		TransposerConfiguration configuration = new TransposerConfiguration();
		
		WorkflowActivityParameter preAnalysisActivities = new WorkflowActivityParameter();
		
		preAnalysisActivities.addActivity(LOAD_ACTIVITY); 
		
		WorkflowActivityParameter postRuleExecutionActivities = new WorkflowActivityParameter();
		
		postRuleExecutionActivities.addActivity(SAVE_ACTIVITY);
		
		configuration.setPreAnalysisActivities(preAnalysisActivities);
		configuration.setPostExecutionActivities(postRuleExecutionActivities);
		
		return configuration;
	}

}
