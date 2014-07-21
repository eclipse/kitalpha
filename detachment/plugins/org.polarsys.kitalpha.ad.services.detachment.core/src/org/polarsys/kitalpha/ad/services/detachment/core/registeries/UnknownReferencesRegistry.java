/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.core.registeries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.polarsys.kitalpha.ad.services.detachment.core.Messages;
import org.polarsys.kitalpha.ad.services.detachment.core.log.LoggerService;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IUnknownReferencesService;

/**
 * Registry that handle contribution for the detection and cleaning of 
 * unknown references
 * 
 * @author Faycal Abka
 */


public class UnknownReferencesRegistry {
	
	private Collection<Object> unknownReferencesRegistry;
	
	private static final UnknownReferencesRegistry INSTANCE = new UnknownReferencesRegistry();
	
	
	private UnknownReferencesRegistry(){
		this.unknownReferencesRegistry = new ArrayList<Object>();
	}


	public static UnknownReferencesRegistry getInstance() {
		return INSTANCE;
	}


	public Collection<Object> getUnknownReferencesRegistry() {
		return unknownReferencesRegistry;
	}
	
	/**
	 * Instantiates all contribution classes and stores them in the registry
	 */
	public void initRegistry(){
		
		registryDispose();
		
		IExtension extensions[] = RegistryHelper.getAllExtensionsFor(DetachmentRegistriesConst.EXTENSION_POINT);
		
		for (IExtension iExtension : extensions) {
			for(IConfigurationElement config: iExtension.getConfigurationElements()){
				try {
					final Object o = config.createExecutableExtension(DetachmentRegistriesConst.CLASS_ATTRIBUTE);
					
					if (o instanceof IUnknownReferencesService){
						if (RegistryHelper.checkIfClassIsNotIn(getUnknownReferencesRegistry(), o.getClass())){
							getInstance().getUnknownReferencesRegistry().add(o);
						} else {
							LoggerService.warning(Messages.bind(Messages.UR_CONTRIBUTE_SEVERAL_SAME_CLASS, o.getClass().getName()), null);
						}
					}
				} catch (CoreException e) {
					LoggerService.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}
	}
	
	
	//Clean the registry before loading extensions
	private void registryDispose(){
		dispose();
		getInstance().getUnknownReferencesRegistry().clear();
		
	}
	
	
	/**
	 * Clear the registry
	 */
	@SuppressWarnings("rawtypes")
	public void dispose(){
		
		Iterator<Object> it = getUnknownReferencesRegistry().iterator();
		
		while(it.hasNext())
			((IUnknownReferencesService)it.next()).dispose();
		
		getUnknownReferencesRegistry().clear();
	}

}
