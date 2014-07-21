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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.osgi.util.NLS;
import org.polarsys.kitalpha.emde.extension.i18n.Messages;
import org.polarsys.kitalpha.emde.extension.utils.Log;

public class ItemProviderAdapterFactoriesRegistryProvider extends RegistryProvider {

	private static ItemProviderAdapterFactoriesRegistryProvider registryReader;
	public static final String EXTENSION_POINT = "itemProviderAdapterFactories"; //$NON-NLS-1$
	public static final String TAG = "factory"; //$NON-NLS-1$
	public static final String ATT_URI = "uri"; //$NON-NLS-1$
	public static final String ATT_CLASS = "class"; //$NON-NLS-1$
	public static final String ATT_SUPPORTED_TYPES = "supportedTypes"; //$NON-NLS-1$  
	private final Map<String, URIFactory> URIFactories = new HashMap<String, URIFactory>();

	private ItemProviderAdapterFactoriesRegistryProvider() {
		super(EMFEditPlugin.INSTANCE.getSymbolicName(), EXTENSION_POINT);
		loadRegistry();
	}

	public static String getName() {
		return EMFEditPlugin.INSTANCE.getSymbolicName() + "-" + EXTENSION_POINT; //$NON-NLS-1$
	}

	public static ItemProviderAdapterFactoriesRegistryProvider getURIsReader() {
		if (registryReader == null) {
			registryReader = new ItemProviderAdapterFactoriesRegistryProvider();
		}

		return registryReader;
	}

	private void loadRegistry() {
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		readRegistry(extensionRegistry);
	}

	/**
	 * Processes one configuration element or child element.
	 */
	@Override
	protected boolean readElement(IConfigurationElement element) {
		if (element.getName().equals(TAG)) {
			readTagAttributeElement(element);

			return true;
		}

		return false;
	}

	/**
	 * Processes TAG attributes.
	 */
	private void readTagAttributeElement(IConfigurationElement element) {
		String uri = element.getAttribute(ATT_URI);
		String clazz = element.getAttribute(ATT_CLASS);
		String supportedTypes = element.getAttribute(ATT_SUPPORTED_TYPES);

		if ((uri == null) || (uri.trim().length() == 0) || (clazz == null) || (clazz.trim().length() == 0) || (supportedTypes == null) || (supportedTypes.trim().length() == 0)) {
			return;
		}

		uri = uri.trim();
		clazz = clazz.trim();
		supportedTypes = supportedTypes.trim();

		// Looking for IEditingDomainItemProvider types
		boolean found = false;

		for (StringTokenizer stringTokenizer = new StringTokenizer(supportedTypes); stringTokenizer.hasMoreTokens();) {
			if (org.eclipse.emf.edit.provider.IEditingDomainItemProvider.class.getName().equals(stringTokenizer.nextToken())) {
				found = true;
			}
		}

		if (found == false) {
			return;
		}

		URIFactory factory = URIFactories.get(uri);

		if (factory != null) {
			String msg = NLS.bind(Messages.ImplementationRegistryProvider_invalidKey, new String[] { uri, element.getDeclaringExtension().getNamespaceIdentifier(), factory.getIConfigurationElement().getDeclaringExtension().getNamespaceIdentifier() });
			Log.getDefault().logWarning(msg);
			return;
		}

		URIFactories.put(uri, new URIFactory(uri, clazz, element));
	}

	protected Map<String, URIFactory> getURIFactories() {
		return URIFactories;
	}

	public static Map<String, URIFactory> getItemProviderAdapterFactories() {
		return getURIsReader().getURIFactories();
	}

	public static URIFactory getURIFactoryFromNsURI(String uri) {
		if ((uri == null) || (uri.trim().length() == 0)) {
			return null;
		}

		return getURIsReader().getURIFactories().get(uri.trim());
	}

	public static URIFactory getURIFactoryFromAdapterFactoryName(String clazz) {
		if ((clazz == null) || (clazz.trim().length() == 0)) {
			return null;
		}

		clazz = clazz.trim();

		for (URIFactory factory : getURIsReader().getURIFactories().values()) {
			if (clazz.equals(factory.getAdapterFactoryName())) {
				return factory;
			}
		}

		return null;
	}

	/**
	 * @see org.eclipse.emf.facilities.extensions.AbstractExtensionManager#addExtension(org.eclipse.core.runtime.IExtension)
	 */
	@Override
	protected void addExtension(IExtension extension) {
		for (IConfigurationElement element : extension.getConfigurationElements()) {
			readTagAttributeElement(element);
		}
	}

	/**
	 * @see org.eclipse.emf.facilities.extensions.AbstractExtensionManager#removeExtension(org.eclipse.core.runtime.IExtension)
	 */
	@Override
	protected void removeExtension(IExtension extension) {
		for (IConfigurationElement element : extension.getConfigurationElements()) {
			for (Iterator<Map.Entry<String, URIFactory>> it = getURIsReader().getURIFactories().entrySet().iterator(); it.hasNext();) {
				Map.Entry<String, URIFactory> entry = it.next();

				if (entry.getValue().getIConfigurationElement() == element) {
					it.remove();

					break;
				}
			}
		}
	}
}
