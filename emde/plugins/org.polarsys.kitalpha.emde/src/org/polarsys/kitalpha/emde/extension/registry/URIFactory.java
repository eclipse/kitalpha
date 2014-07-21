/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.extension.registry;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.notify.AdapterFactory;

/**
 * @author S0008900
 * 
 */
public class URIFactory {

	private final String nsURI;

	private final String adapterFactoryName;

	private final IConfigurationElement element;

	private AdapterFactory adapterFactory;

	public URIFactory(String nsURI, String factory, IConfigurationElement element) {
		Assert.isNotNull(nsURI);
		Assert.isLegal(nsURI.trim().length() > 0);
		this.nsURI = nsURI.trim();
		Assert.isNotNull(factory);
		Assert.isLegal(factory.trim().length() > 0);
		this.adapterFactoryName = factory.trim();
		Assert.isNotNull(element);
		Assert.isLegal(element.isValid());
		this.element = element;
	}

	public String getNsURI() {
		return nsURI;
	}

	public String getAdapterFactoryName() {
		return adapterFactoryName;
	}

	public IConfigurationElement getIConfigurationElement() {
		return element;
	}

	public AdapterFactory getAdapterFactory() throws CoreException {
		if (adapterFactory == null && element.isValid()) {
			adapterFactory = (AdapterFactory) element.createExecutableExtension(ItemProviderAdapterFactoriesRegistryProvider.ATT_CLASS);
		}
		return adapterFactory;
	}

}
