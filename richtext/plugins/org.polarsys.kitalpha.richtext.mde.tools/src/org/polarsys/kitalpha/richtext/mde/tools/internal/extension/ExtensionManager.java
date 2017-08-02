/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.mde.tools.internal.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.richtext.mde.tools.internal.Activator;
import org.polarsys.kitalpha.richtext.mde.tools.links.handlers.OpenModelElementStrategy;
import org.polarsys.kitalpha.richtext.mde.tools.managers.LinkChooserStrategy;
import org.polarsys.kitalpha.richtext.mde.tools.managers.OpenStrategy;

public class ExtensionManager {
	
	private static final String EXTENSION_ID = "org.polarsys.kitalpha.richtext.mde.tools.link.openStrategy"; //$NON-NLS-1$
	private static final String EXTENSION_MODEL_ELEMENT_ID = "org.polarsys.kitalpha.richtext.mde.tools.link.openModelStrategy";
	private static final String SCHEME_ATTR = "scheme"; //$NON-NLS-1$
	private static final String OPEN_LINK_STRATEGY_ATTR = "openLinkStrategy"; //$NON-NLS-1$
	private static final String LINK_CHOOSER_STRATEGY_ATTR = "linkChooserStrategy"; //$NON-NLS-1$
	private static final String EXPLORER_ID_ATTR = "explorerId"; //$NON-NLS-1$
	private static final String CLASS_ATTR = "class";
	
	
	/**
	 * Return the first Open Strategy with scheme equals to target
	 * @param target
	 * @return
	 */
	public static OpenStrategy getStrategy(String target) {
		IConfigurationElement[] conf = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		
		if (conf != null && conf.length > 0) {
			for (IConfigurationElement c : conf) {
				try {
					
					String scheme = c.getAttribute(SCHEME_ATTR);
					if (scheme.equalsIgnoreCase(target)) {
						String clazzFQN = c.getAttribute(OPEN_LINK_STRATEGY_ATTR);
						if (clazzFQN != null && !clazzFQN.isEmpty()){
							return (OpenStrategy)c.createExecutableExtension(OPEN_LINK_STRATEGY_ATTR);
						}
					}
				} catch (CoreException e) {
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
		
		return null;
	}
	
	public static LinkChooserStrategy getLinkChooserStrategy(String target) {
		IConfigurationElement[] conf = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		
		if (conf != null && conf.length > 0) {
			for (IConfigurationElement c : conf) {
				try {

					String scheme = c.getAttribute(SCHEME_ATTR);
					if (scheme.equalsIgnoreCase(target)) {
						String clazzFQN = c.getAttribute(LINK_CHOOSER_STRATEGY_ATTR);
						if (clazzFQN != null && !clazzFQN.isEmpty()){
							return (LinkChooserStrategy)c.createExecutableExtension(LINK_CHOOSER_STRATEGY_ATTR);
						}
					}
					
				} catch (CoreException e) {
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
		return null;
	}

	public static String getExplorerID() {
		IConfigurationElement[] conf = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		if (conf != null && conf.length > 0) {
			for (IConfigurationElement c : conf) {
				return c.getAttribute(EXPLORER_ID_ATTR);
			}
		}
		return null;
	}

	public static OpenModelElementStrategy getModelElementStrategy(String target) {
		IConfigurationElement[] conf = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_MODEL_ELEMENT_ID);

		if (conf != null && conf.length > 0) {
			for (IConfigurationElement c : conf) {
				try {
					return (OpenModelElementStrategy)c.createExecutableExtension(CLASS_ATTR);
				} catch (CoreException e) {
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
		return null;
	}
}
