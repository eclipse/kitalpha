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
package org.polarsys.kitalpha.richtext.widget.internal.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditor;
import org.polarsys.kitalpha.richtext.widget.internal.Activator;
import org.polarsys.kitalpha.richtext.widget.propertysheet.MDERichTextPropertySheetProvider;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MDERichTextExtensionManager {

	private static final String EXTENSION_ID = "org.polarsys.kitalpha.richtext.widget.propertySheetPageDelegate";
	private static final String CONTRIBUTOR_ID_ATTR = "contributorId";
	private static final String DELEGATE_PROVIDER_ATTR = "delegateProvider";

	private final IConfigurationElement firstConfigurationElement;
	private final MDERichTextEditor contributor;

	public MDERichTextExtensionManager(MDERichTextEditor contributor) {
		IConfigurationElement[] conf = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		if (conf != null && conf.length > 0){
			this.firstConfigurationElement = conf[0];
		} else {
			this.firstConfigurationElement = null;
		}
		this.contributor = contributor;
	}

	/**
	 * @return the first found contributor id 
	 */
	public String getContributorId(){
		return firstConfigurationElement != null? 
				firstConfigurationElement.getAttribute(CONTRIBUTOR_ID_ATTR): null;
	}

	public TabbedPropertySheetPage getDelegate(){
		try {
			MDERichTextPropertySheetProvider provider = firstConfigurationElement != null? 
					(MDERichTextPropertySheetProvider)firstConfigurationElement.createExecutableExtension(DELEGATE_PROVIDER_ATTR) : null;
			if (provider != null){
				return provider.getTabbedPropertySheetPageDelegate(contributor);
			}
		} catch (CoreException e) {
			Status status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
		return null;
	}
}
