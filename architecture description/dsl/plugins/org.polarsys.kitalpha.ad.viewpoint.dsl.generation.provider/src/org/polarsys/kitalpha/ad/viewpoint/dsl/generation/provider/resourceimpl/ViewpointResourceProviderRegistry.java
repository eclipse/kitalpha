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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceProviderException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.internal.ViewpointCoreResourceLocator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.types.ResourceFileInformation;


/**
 * @author Boubekeur Zendagui
 */

public class ViewpointResourceProviderRegistry {
	
	/**
	 * Singleton variable
	 */
	private final static ViewpointResourceProviderRegistry instance_ = new ViewpointResourceProviderRegistry();

	/**
	 * The associated viewpoint.
	 */
	private Viewpoint viewpoint_;
	
	/**
	 * Generated ECore resource provider 
	 */
	private EcoreProviderImpl ecoreProvider_;
	
	/**
	 * Generated GenModel resource provider 
	 */
	private GenmodelProviderImpl genmodelProvider_;
	
	/**
	 * Generated GenChain resource provider 
	 */
	private GenerationchainProviderImpl genchainProvider_;
	
	/**
	 *
	 * Default constructor
	 */
	private ViewpointResourceProviderRegistry() {
		// TODO: This is an auto generated constructor stub  
	}

	/**
	 *
	 *@return instance_
	 */
	public static ViewpointResourceProviderRegistry getInstance() {
		return instance_;
	}
	
	public void unload(){
		this.viewpoint_ = null;
		this.ecoreProvider_ = null;
		this.genchainProvider_ = null;
		this.genmodelProvider_ = null;
	}
	
	/**
	 * This allows to set the Viewpoint for witch provider will be initialized
	 * @param viewpoint VpDsl Viewpoint ({@link Viewpoint})EObject used to 
	 * generate the viewpoint product 
	 * @throws ViewpointResourceProviderException 
	 */
	public void setViewpoint(Viewpoint viewpoint) throws ViewpointResourceProviderException {
		/**
		 * The Viewpoint object is mandatory for the creation of a
		 * ViewpointCoreResourceProvider  
		 */
		if (viewpoint != null)
			viewpoint_ = viewpoint;
		else
			throw new ViewpointResourceProviderException(ViewpointResourceProviderException.IS_NULL);

		final boolean isECoreInitialized = initializeEcoreProviders();
		final boolean isGenchainInitialized = initializeGenchainProviders();
		final boolean isGenmodelInitialized = initializeGenmodelProviders();
		// Are All core resource available ?
		final boolean isViewpointCoreResourcesAvailable = isECoreInitialized && 
															isGenmodelInitialized && 
															isGenchainInitialized;
		/**
		 * If the Core Resource are not available, throw an exception. This 
		 * exception will be managed by the routine that try to create a 
		 * ViewpointCoreResourceProvider
		 */
		if (! isViewpointCoreResourcesAvailable)
		{
			throw new ViewpointResourceProviderException(
					ViewpointResourceProviderException.NO_CORE_RESOURCE_AVAILABLE);
		}
	}
	
	/**
	 * This method refresh Provider. 
	 * If a provider is not created yet, it initialize it.
	 * If a provider is already created, it refresh it.
	 */
	public void refresh(){
		try 
		{
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}
		if (ecoreProvider_ == null)
			initializeEcoreProviders();
		else
			ecoreProvider_.refresh();
		
		if (genchainProvider_ == null)
			initializeGenchainProviders();
		else
			genchainProvider_.refresh();
		
		initializeGenmodelProviders();
	}
	
	/**
	 * This allows to initialize ECore Provider ({@link EcoreProviderImpl}). 
	 * @return True if the provider is well initialized, False else.
	 */
	public boolean initializeEcoreProviders(){
		try {
			ResourceFileInformation information = ViewpointCoreResourceLocator.getECoreFileInformation(viewpoint_);
			if (information != null)
			{
				EcoreProviderImpl provider = ViewpointResourceProviderFactory.getInstance().createEcoreProvider(information);
				if (provider != null)
				{
					ecoreProvider_ = provider;
					ecoreProvider_.setHandler(this);
					return true;
				}
				else
					return false;
			}
			
		} catch (ViewpointResourceException e) {
			return false;
		}
		return false;
	}
	
	/**
	 * This allows to initialize GenModel Provider ({@link GenmodelProviderImpl}). 
	 * @return True if the provider is well initialized, False else.
	 */
	public boolean initializeGenmodelProviders(){
		try {
			ResourceFileInformation information = ViewpointCoreResourceLocator.getGenmodelFileInformation(viewpoint_);
			if (information != null)
			{
				GenmodelProviderImpl provider = ViewpointResourceProviderFactory.getInstance().createGenmodelProvider(information);
				if (provider != null)
				{
					genmodelProvider_ = provider;
					genmodelProvider_.setHandler(this);
					return true;
				}
				else
					return false;
			}
			
		} catch (ViewpointResourceException e) {
			return false;
		}
		return false;
	}
	
	/**
	 * This allows to initialize GenChain Provider ({@link GenerationchainProviderImpl}). 
	 * @return True if the provider is well initialized, False else.
	 */
	public boolean initializeGenchainProviders(){
		try {
			ResourceFileInformation information = ViewpointCoreResourceLocator.getGenchainFileInformation(viewpoint_);
			if (information != null)
			{
				GenerationchainProviderImpl provider = ViewpointResourceProviderFactory.getInstance().createGenchainProvider(information);
				if (provider != null)
				{
					genchainProvider_ = provider;
					genchainProvider_.setHandler(this);
					return true;
				}
				return false;
			}
			
		} catch (ViewpointResourceException e) {
			return false;
		}
		return false;
	}
	
	/**
	 * @return True is ECore Provider has been initialized, False else.
	 */
	public boolean isECoreProviderInitialized(){
		return ecoreProvider_ != null;
	}
	
	/**
	 * @return True is Genmodel Provider has been initialized, False else.
	 */
	public boolean isGenmodelProviderInitialized(){
		return genmodelProvider_ != null;
	}
	
	/**
	 * @return True is Genchain Provider has been initialized, False else.
	 */
	public boolean isGenchainProviderInitialized(){
		return genchainProvider_ != null;
	}
	
	/**
	 * 
	 * @return
	 */
	public Viewpoint getViewpoint(){
		return viewpoint_;
	}
	
	/**
	 * 
	 * @return
	 */
	public EcoreProviderImpl getEcoreProvider() {
		return ecoreProvider_;
	}

	/**
	 * 
	 * @return
	 */
	public GenmodelProviderImpl getGenmodelProvider() {
		return genmodelProvider_;
	}

	/**
	 * 
	 * @return
	 */
	public GenerationchainProviderImpl getGenchainProvider() {
		return genchainProvider_;
	}
}
