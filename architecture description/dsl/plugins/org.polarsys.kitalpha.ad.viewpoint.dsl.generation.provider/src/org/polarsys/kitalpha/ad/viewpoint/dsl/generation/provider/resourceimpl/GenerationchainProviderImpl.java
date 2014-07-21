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
						final String gen_modelPath = emfGeneration.getModelPath().trim();
						final String reg_modelPath = getGeneratedEcorePath().trim();
						if (gen_modelPath.equals(reg_modelPath))
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
