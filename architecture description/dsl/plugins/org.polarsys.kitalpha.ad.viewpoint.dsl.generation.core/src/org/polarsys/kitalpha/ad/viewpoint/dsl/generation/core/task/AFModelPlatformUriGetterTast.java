/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;

/**
 * @author Boubekeur Zendagui
 */

public class AFModelPlatformUriGetterTast extends TaskProductionAdapter {

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		String rootProjectName = productionContext.getInputValue(ROOT_PROJECT_NAME, String.class);
		String shortname = productionContext.getInputValue(SHORT_NAME, String.class);
		
		productionContext.setOutputValue("af.model.platform.uri", "platform:/resource/"+rootProjectName+".af/model/"+shortname+".vp");
	}
}
