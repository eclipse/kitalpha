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
package org.polarsys.kitalpha.emde.extension;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.osgi.util.NLS;
import org.polarsys.kitalpha.emde.extension.i18n.Messages;
import org.polarsys.kitalpha.emde.extension.registry.ItemProviderAdapterFactoriesRegistryProvider;
import org.polarsys.kitalpha.emde.extension.registry.URIFactory;
import org.polarsys.kitalpha.emde.extension.utils.Log;

import com.ibm.icu.text.Collator;

/**
 * @author Xavier Maysonnave
 * 
 */
public abstract class Model<T extends Model<T>> implements Comparable<T> {

	static final String SEPARATOR = "<-|-|->"; //$NON-NLS-1$  

	private static final Collator collator = Collator.getInstance();

	private EPackage ePackage;

	private final String nsURI;

	private final URIFactory uriFactory;

	public Model(String name, URIFactory uriFactory) {
		Assert.isNotNull(name);
		Assert.isLegal(name.trim().length() > 0);
		nsURI = name.trim();
		Assert.isNotNull(uriFactory);
		this.uriFactory = uriFactory;
	}

	public EPackage getEPackage() {
		if (ePackage != null) {
			return ePackage;
		}
		if (getName() != null) {
			ePackage = EPackage.Registry.INSTANCE.getEPackage(getName());
		}
		return ePackage;
	}

	/**
	 * Obtains my path, which is my fully-qualified slash-separated ID that is
	 * unique within the global namespace.
	 * 
	 * @return my unique path
	 */
	public abstract String getPath();

	public String getName() {
		return nsURI;
	}

	public URIFactory getURIFactory() {
		return uriFactory;
	}

	public AdapterFactory getAdapterFactory() {
		try {
			return uriFactory.getAdapterFactory();
		} catch (CoreException ce) {
			String msg = NLS.bind(Messages.ImplementationRegistryProvider_invalidClass, new String[] { ItemProviderAdapterFactoriesRegistryProvider.getName(), uriFactory.getAdapterFactoryName(), AdapterFactory.class.getName() });
			Log.getDefault().logError(msg, ce);
		}
		return null;
	}

	public int compareTo(T other_p) {
		return collator.compare(getName(), other_p.getName());
	}

	/**
	 * Obtains my qualified name.
	 * 
	 * @return my qualified name
	 */
	public abstract String getQualifiedName();

}
