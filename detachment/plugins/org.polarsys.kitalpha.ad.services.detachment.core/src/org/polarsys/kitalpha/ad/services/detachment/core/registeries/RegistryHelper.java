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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.ad.services.detachment.core.Messages;
import org.polarsys.kitalpha.ad.services.detachment.core.log.LoggerService;

/**
 * A set of helpers for managing detachment registries
 * 
 * @author Faycal Abka
 */
public class RegistryHelper {
	
	
	/**
	 * Get all extensions for the given extension points
	 * @param extensionPoint
	 * @return All extensions of the extensionPoint
	 */
	public static IExtension[] getAllExtensionsFor(String extensionPoint) {
		IExtensionRegistry regisry = Platform.getExtensionRegistry();
	
		IExtensionPoint extension = regisry.getExtensionPoint(extensionPoint);
		
		if (extension == null){
			RuntimeException e = new RuntimeException(Messages.bind(Messages.UR_EXTENSION_CANT_GET, extensionPoint));
			LoggerService.error(e.getMessage(), e);
			throw e;
		}
		
		IExtension extensions[] = extension.getExtensions();
		
		if (extensions.length == 0)
			return null;
		return extensions;
	}
	
	/**
	 * Check if clazz is not in the registry
	 * @param registry where check
	 * @param clazz the class to check
	 * @return true if clazz is not in registry
	 */
	public static boolean checkIfClassIsNotIn(Collection<Object> registry, Class<?> clazz){
		Iterator<Object> it = registry.iterator();
		
		while (it.hasNext()){
			Class<?> regClazz = it.next().getClass();
			if (regClazz == clazz) 
				return false;
		}
		
		return true;
	}
}
