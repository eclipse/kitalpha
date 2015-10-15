/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.conf.DiagramGenerationConfigurationHelper;

/**
 * @author Boubekeur Zendagui
 */
public final class VSMGenerationUtil {
	
	public static boolean canExecuteTask(ITaskProductionContext productionContext) throws InvocationException{
		EMFDomain domain = productionContext.getInputValue("vpdesc.model", EMFDomain.class);
		String projectName = productionContext.getInputValue("design.project.name", String.class);
		
		if (checkResourcesExistance(projectName))
			return precondition(domain);
		else
			return true;
	}
	
	private static boolean checkResourcesExistance(String projectName){
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		return project.exists();
	}
	
	private static boolean precondition(EMFDomain domain ) throws InvocationException{
		if (domain != null)
		{
			EObject root = (EObject) domain.getContent().get(0);
			if (root != null)
			{
				boolean generateVSM = DiagramGenerationConfigurationHelper.generateVSM(root);
				return generateVSM;
			}
		}
		
		return true;
	}
}
