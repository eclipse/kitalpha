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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
//import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.data.EMDEGenerationElementConfiguration;
//import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.data.EMFGenerationElementConfiguration;
//import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.global.GenerationConfigurationRegistry;
 
/**
 * @author Boubekeur Zendagui
 */

public class DataConfigurationRegistrationTask extends TaskProductionAdapter {

//	public static EMFGenerationElementConfiguration EMF__GENERATION_ELEMENT = new EMFGenerationElementConfiguration();
//	public static EMDEGenerationElementConfiguration EMDE__GENERATION_ELEMENT = new EMDEGenerationElementConfiguration();
	
	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
//		final boolean register = productionContext.getInputValue("register", Boolean.class);
		
//		if (register)
//		{
//			GenerationConfigurationRegistry.register(EMF__GENERATION_ELEMENT);
//			GenerationConfigurationRegistry.register(EMDE__GENERATION_ELEMENT);
//		}
//		else
//		{
//			GenerationConfigurationRegistry.unregister(EMF__GENERATION_ELEMENT);
//			GenerationConfigurationRegistry.unregister(EMDE__GENERATION_ELEMENT);
//		}
	}
}
