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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.operation.GenchainGenerationOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.operation.GenchainRunOperation;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationchainModelGeneratorTask extends TaskProductionAdapter {

	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String lvpsProjectName = productionContext.getInputValue(ROOT_PROJECT_NAME, String.class);
		String lvpsShortName = productionContext.getInputValue(SHORT_NAME, String.class);
		String modelFolder = productionContext.getInputValue(MODEL_FOLDER, String.class);
		
		// Create generation chain resource
		GenchainGenerationOperation generationOperation = new GenchainGenerationOperation(lvpsProjectName, lvpsShortName, modelFolder);
		GenchainRunOperation runOperation = new GenchainRunOperation(lvpsProjectName, lvpsShortName, modelFolder);
		try {
			generationOperation.run(monitor);
			runOperation.run(monitor);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
