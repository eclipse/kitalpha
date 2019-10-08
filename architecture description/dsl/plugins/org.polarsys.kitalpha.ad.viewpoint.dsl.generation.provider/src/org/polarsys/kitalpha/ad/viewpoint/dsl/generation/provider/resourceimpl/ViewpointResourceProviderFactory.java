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

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.internal.ViewpointCoreResourceLocator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resource.AbstractCoreResourceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resource.IViewpointResourceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.types.ResourceFileInformation;

/**
 * @author Boubekeur Zendagui
 */

public class ViewpointResourceProviderFactory {
	
	/**
	 * Singleton variable
	 */
	private final static ViewpointResourceProviderFactory instance_ = new ViewpointResourceProviderFactory();

	/**
	 *
	 * Default constructor
	 */
	private ViewpointResourceProviderFactory() {
		// TODO: This is an auto generated constructor stub  
	}

	/**
	 *
	 *@return instance_
	 */
	public static ViewpointResourceProviderFactory getInstance() {
		return instance_;
	}
	
	
	/**
	 * Create a ECore resource provider based on the resource information 
	 * defined in the information ({@link ResourceFileInformation}) parameter 
	 * @return EcoreProviderImpl that provides the ECore that resource 
	 * is described by the information ({@link ResourceFileInformation})
	 * @throws ViewpointResourceException 
	 */
	final public EcoreProviderImpl createEcoreProvider(ResourceFileInformation information) 
										throws ViewpointResourceException{
		EcoreProviderImpl ecoreProvider = 
			(EcoreProviderImpl ) create(EcoreProviderImpl.class, information);
		return ecoreProvider;
	}
	
	/**
	 * Create a GenModel resource provider based on the resource information 
	 * defined in the information ({@link ResourceFileInformation}) parameter
	 * @return GenmodelProviderImpl that provides the GenModel that resource 
	 * is described by the information ({@link ResourceFileInformation})
	 * @throws ViewpointResourceException 
	 */
	final public GenmodelProviderImpl createGenmodelProvider(ResourceFileInformation information)
										throws ViewpointResourceException{
		GenmodelProviderImpl genmodelProvider = 
			(GenmodelProviderImpl) create(GenmodelProviderImpl.class, information);
		
		return genmodelProvider;
	}
	
	/**
	 * Create a genChain resource provider based on the resource information 
	 * defined in the information ({@link ResourceFileInformation}) parameter
	 * @return GenchainProviderImpl that provides the GenModel that resource 
	 * is described by the information ({@link ResourceFileInformation})
	 * @throws ViewpointResourceException
	 */
	
	final public GenerationchainProviderImpl createGenchainProvider(ResourceFileInformation information)
										throws ViewpointResourceException{	
		GenerationchainProviderImpl genchainProvider = 
			(GenerationchainProviderImpl) create(GenerationchainProviderImpl.class, information);
		return genchainProvider;
	}

	
	/**
	 * Generic factory method. It allows to create an adapter instance of 
	 * AbstractCoreResourceProvider ({@link AbstractCoreResourceProvider})
	 * @param clazz the adapter we need to create an instance and set it
	 * ResourceFileInformation 
	 * @param information information about to resource the created provider 
	 * will provides
	 * @return an ICoreResourceProvider
	 * @throws ViewpointResourceException 
	 */
	final public IViewpointResourceProvider create(Class<? extends AbstractCoreResourceProvider> clazz,
												   ResourceFileInformation information) throws ViewpointResourceException{
		IViewpointResourceProvider provider = null;
		if ( ! ViewpointCoreResourceLocator.checkResourceFileExistence(information))
		{
			throw new ViewpointResourceException(information, ViewpointResourceException.NO_EXISTENT_ON_LOAD);
		}
		
		if (clazz.equals(GenmodelProviderImpl.class))
			provider = new GenmodelProviderImpl();
		else if (clazz.equals(GenerationchainProviderImpl.class))
			provider = new GenerationchainProviderImpl();
		else if (clazz.equals(EcoreProviderImpl.class))
			provider = new EcoreProviderImpl();
		else 
			provider = createCustumProvider(clazz, information);
		
		if (provider != null)
			provider.setResourceFileInformations(information);
		
		return provider;
	}
	
	/**
	 * This method is to be implemented by the derived classes. It allows this 
	 * factory to manage custom providers
	 * @param clazz
	 * @param information
	 * @return
	 */
	public IViewpointResourceProvider createCustumProvider(Class<? extends AbstractCoreResourceProvider> clazz,
														ResourceFileInformation information){
		return null;
	}

}
