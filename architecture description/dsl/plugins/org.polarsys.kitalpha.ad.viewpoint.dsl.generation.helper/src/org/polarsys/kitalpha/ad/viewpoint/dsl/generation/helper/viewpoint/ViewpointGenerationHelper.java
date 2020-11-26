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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.viewpoint;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.core.producer.MissingExtensionException;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.IContractProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.egf.ContractHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.egf.InvokeActivityHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.manager.GeneratorLuncherManager;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class ViewpointGenerationHelper implements IContractProvider{
	
	/**
	 * This method allows to launch generation of a given viewpoint. 
	 * Note that viewpoint generation can't be done in parallel mode. This 
	 * means that one and only one viewpoint can be generated at one time. 
	 * @param viewpoint the VpDsl viewpoint to generate
	 * @param monitor
	 * @return True if generation is done with success, false else.
	 */
	public synchronized boolean generateViewpoint(Viewpoint viewpoint, 
												  IProgressMonitor monitor){
		return generateViewpoint(viewpoint, false, monitor);
	}
	
	/**
	 * 
	 * @param viewpoint the VpDsl viewpoint to generate
	 * @param selection
	 * @param monitor
	 * @return True if generation is done with success, false else.
	 */
	public synchronized boolean generateViewpoint(Viewpoint viewpoint,
												  boolean selection,
												  IProgressMonitor monitor){
		
		final URI DefaultLuncherUri = GeneratorLuncherManager.DEFAULT_LAUNCHER_URI;
		URI modelURI = EcoreUtil.getURI(viewpoint).trimFragment();
		String projectName = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		Activity vpGeneratorLauncher = InvokeActivityHelper.getActivity(DefaultLuncherUri); //$NON-NLS-1$
		try {
			execute(vpGeneratorLauncher, projectName, modelURI, false, selection, monitor);
			return true;
		}catch (Exception e){
			return false;
		}
	}
 
	/**
	 * @param dslVPGEneratorLauncher The activity to run.
	 * @param projectName the root project name 
	 * @param uri the vpspec model URI
	 * @param build to know if the viewpoint have to be builded or not
	 * @param selectExtensions to know if the selection UI have to be displayed or not
	 * @throws CoreException 
	 * @throws InvocationException 
	 * @throws MissingExtensionException 
	 */
	public synchronized void execute(Activity dslVPGEneratorLauncher, 
									 String projectName, 
									 URI uri, 
									 boolean build, 
									 boolean selectExtensions,
									 IProgressMonitor monitor){
		if (dslVPGEneratorLauncher instanceof FactoryComponent) 
		{
			// Prepare the factory component.
			FactoryComponent factoryComponent = (FactoryComponent) dslVPGEneratorLauncher;
			ContractHelper.setStringContract(factoryComponent, ROOT_PROJECT_NAME, projectName); //$NON-NLS-1$
			ContractHelper.setDomain(factoryComponent, VPDESC_MODEL, uri);//$NON-NLS-1$
			ContractHelper.setBooleanContract(factoryComponent, BUILD_VIEWPOINT, build); //$NON-NLS-1$
			ContractHelper.setBooleanContract(factoryComponent, USER_SELECTION, selectExtensions); //$NON-NLS-1$
			
			// Lunch the factory component
			boolean result = InvokeActivityHelper.validateAndInvoke(factoryComponent, projectName + Messages.Viewpoint_Generation);

			// Check if the factory component execution is well done
			if (! result)
				throw new RuntimeException(Messages.Viewpoint_Generation_Excecution_Problem);
		}
	}
}
