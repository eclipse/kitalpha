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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl;

import org.eclipse.egf.portfolio.genchain.generationChain.EmfGeneration;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resource.AbstractCoreResourceProvider;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationchainProviderImpl extends AbstractCoreResourceProvider{
	
	/**
	 * @return The generated Genneration Chain
	 * @throws ViewpointResourceException
	 */
	public GenerationChain getGenerationChain() throws ViewpointResourceException{
		GenerationChain generationChain = null;
		
		EObject rootElement = getRootElement();
		if (rootElement != null)
			generationChain = (GenerationChain) rootElement;
		
		return generationChain;
	}
	
	public String getFeatureName() throws ViewpointResourceException{
		GenerationChain generationchain = getGenerationChain();
		return generationchain.getFactoryComponentName() + ".feature";
	}
	
	public String getModelProjectName() throws ViewpointResourceException{
		String modelpluginName = "";
		GenerationChain generationchain = getGenerationChain();

		for (GenerationElement iGenerationElement : generationchain.getElements()) 
		{
			if (iGenerationElement instanceof GenerationChain )
			{
				GenerationChain subGenerationChain = (GenerationChain) iGenerationElement;
				for (GenerationElement iSubGenerationElement : subGenerationChain.getElements()) 
				{
					if (iSubGenerationElement instanceof EmfGeneration )
					{
						EmfGeneration emfGeneration = (EmfGeneration) iSubGenerationElement;
						final String genModelPath = emfGeneration.getModelPath().trim();
						final String regModelPath = getGeneratedEcorePath().trim();
						if (genModelPath.equals(regModelPath))
						{
							modelpluginName = emfGeneration.getPluginName();
							break;
						}
						
					}
				}
				
				if (modelpluginName.trim().length() > 0 )
					break;
			}
		}
		
		return modelpluginName;
	}
	
	private String getGeneratedEcorePath() throws ViewpointResourceException{
		String result = "";
		ViewpointResourceProviderRegistry handler = getHandler();
		if (handler != null)
		{
			EcoreProviderImpl ecoreProvider = handler.getEcoreProvider();
			if (ecoreProvider == null)
				throw new ViewpointResourceException(getResourceFileInformations(), 0);
			
			result = ecoreProvider.getResourceFileInformations().getStringPath();
		}
		
		return result;
	}
	
}
