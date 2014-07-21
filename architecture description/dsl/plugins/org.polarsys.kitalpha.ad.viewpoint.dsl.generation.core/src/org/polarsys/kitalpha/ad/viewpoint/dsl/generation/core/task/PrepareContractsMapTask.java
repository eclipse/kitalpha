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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.task;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;

/**
 * @author Boubekeur Zendagui
 */

public class PrepareContractsMapTask extends TaskProductionAdapter {

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		EMFDomain lvpsModel = productionContext.getInputValue(VPDESC_MODEL, EMFDomain.class);
		String lvpsProjectName = productionContext.getInputValue(ROOT_PROJECT_NAME, String.class);
		String lvpsShortName = productionContext.getInputValue(SHORT_NAME, String.class);
		String vpName = productionContext.getInputValue(NAME, String.class);
		String vpID = productionContext.getInputValue("vpID", String.class);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("vpdesc.model", lvpsModel);
		result.put("root.project.name", lvpsProjectName);
		result.put("short.name", lvpsShortName);
		result.put("name", vpName);
		result.put("vpID", vpID);
		productionContext.setOutputValue("constracts.map", result);
	}

}
