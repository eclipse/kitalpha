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
package org.polarsys.kitalpha.model.actions.registry;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.model.actions.Messages;

/**
 * @author Faycal Abka
 */
public class RegistryHelper {
private static Logger LOGGER = Logger.getLogger(RegistryHelper.class);
	
	/**
	 * Get all extensions for the given extension points
	 * @param extensionPoint
	 * @return All extensions of the extensionPoint
	 */
	public static IExtension[] getAllExtensionsFor(String extensionPoint) {
		IExtensionRegistry regisry = Platform.getExtensionRegistry();
	
		IExtensionPoint extension = regisry.getExtensionPoint(extensionPoint);
		
		if (extension == null){
			RuntimeException e = new RuntimeException(Messages.MODEL_ACTION_EXTENSION_CANT_GET);
			LOGGER.error(Messages.MODEL_ACTION_EXTENSION_CANT_GET, e);
			throw e;
		}
		
		IExtension extensions[] = extension.getExtensions();
		
		if (extensions.length == 0)
			return null;
		return extensions;
	}
}
