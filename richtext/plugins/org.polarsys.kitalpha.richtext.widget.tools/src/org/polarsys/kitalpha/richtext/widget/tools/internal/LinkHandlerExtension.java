/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.internal;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.richtext.widget.tools.intf.LinkHandler;

/**
 * 
 * @author Faycal Abka
 *
 */
public class LinkHandlerExtension {
	
	private static final String EXTENSION_ID = "org.polarsys.kitalpha.richtext.widget.tools.linkHandler"; //$NON-NLS-1$
	
	private static final String HANDLER_ATTR = "handler"; //$NON-NLS-1$
	private static final String TYPE_ATTR = "type";
	
	public static Collection<LinkHandler> getHandlers(){
		Collection<LinkHandler> result = new HashSet<>();
		
		IConfigurationElement[] contributions = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		
		if (contributions != null && contributions.length > 0) {
			
			for (IConfigurationElement c : contributions) {
				try {
					result.add((LinkHandler) c.createExecutableExtension(HANDLER_ATTR));
				} catch (CoreException e) {
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
		
		return result;
	}
	
	public static LinkHandler getHandlerFor(String type){
		
		IConfigurationElement[] contributions = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		
		if (contributions != null && contributions.length > 0) {
			
			for (IConfigurationElement c : contributions) {
				try {
					String currentType = c.getAttribute(TYPE_ATTR);
					if (type != null && type.equalsIgnoreCase(currentType)) {
						return (LinkHandler) c.createExecutableExtension(HANDLER_ATTR);
					}
				} catch (CoreException e) {
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
		
		return null;
	}

}
