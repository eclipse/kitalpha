/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.GenmodelProviderImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;

/**
 * @author Boubekeur Zendagui
 */
public class PrepareEMFGeneratedProjectNamesTask extends TaskProductionAdapter{
	/** Task contracts **/
	private static final String MODEL_PLUGIN_NAME_CONTRACT  = "model.projet.name"; //$NON-NLS-1$
	private static final String EDIT_PLUGIN_NAME_CONTRACT   = "edit.projet.name";  //$NON-NLS-1$
	private static final String EDITOR_PLUGIN_NAME_CONTRACT = "editor.projet.name";//$NON-NLS-1$
	private static final String TESTS_PLUGIN_NAME_CONTRACT  = "tests.projet.name"; //$NON-NLS-1$
	
	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		super.doExecute(productionContext, monitor);
		final GenmodelProviderImpl genmodelProvider = ViewpointResourceProviderRegistry.getInstance().getGenmodelProvider();
		if (genmodelProvider != null)
		{
			try {
				productionContext.setOutputValue(MODEL_PLUGIN_NAME_CONTRACT, genmodelProvider.getModelPluginName());
				productionContext.setOutputValue(EDIT_PLUGIN_NAME_CONTRACT, genmodelProvider.getEditPluginName());
				productionContext.setOutputValue(EDITOR_PLUGIN_NAME_CONTRACT, genmodelProvider.getEditorPluginName());
				productionContext.setOutputValue(TESTS_PLUGIN_NAME_CONTRACT, genmodelProvider.getTestPluginName());
			} catch (ViewpointResourceException e) {
				throw new InvocationException(e);
			}
		}
	}
}
