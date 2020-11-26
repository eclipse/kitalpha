/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.common.ContextualExplorerTaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.util.ClassUtils;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;

/**
 * @author Boubekeur Zendagui
 */
public class InitContextualExplorerGeneratorData extends ContextualExplorerTaskProductionAdapter {

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		
		// Contracts values
		String rootProjectName = productionContext.getInputValue(ROOT_PROJECT_NAME, String.class);
		String pluginNameSufix = productionContext.getInputValue(PLUGIN_NAME_SUFIX, String.class);
		
		try {
			ClassUtils.INSTANCE.load();
			ClassUtils.INSTANCE.setProjectName(rootProjectName + "." + pluginNameSufix);
		} catch (ViewpointResourceException e) {
			throw new InvocationException(e);
		}
	}
}
