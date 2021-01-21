/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
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
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util.ECoreResourceManager;

/**
 * @author Boubekeur Zendagui
 *
 */
public class PrepareURIsTask extends TaskProductionAdapter{
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter#doExecute(org.eclipse.egf.ftask.producer.context.ITaskProductionContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		URI ecoreURI = ECoreResourceManager.INSTANCE.getECoreFileInformation().getEcorePlatformResourceURI();
		productionContext.setOutputValue("ecore.uri", ecoreURI);
		URI genchainURI = ecoreURI.trimFileExtension().appendFileExtension("generationchain");
		productionContext.setOutputValue("genchain.uri", genchainURI);
	}
}
