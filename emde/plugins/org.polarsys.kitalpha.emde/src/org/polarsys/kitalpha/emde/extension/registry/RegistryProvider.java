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

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionDelta;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IRegistryChangeEvent;
import org.eclipse.core.runtime.IRegistryChangeListener;
import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.emde.extension.utils.Log;

/**
 * Template implementation of a registry reader that creates objects
 * representing registry contents. Typically, an extension contains one element,
 * but this reader handles multiple elements per extension.
 * 
 * To start reading the extensions from the registry for an extension point,
 * call the method <code>readRegistry</code>.
 * 
 * To read children of an IConfigurationElement, call the method
 * <code>readElementChildren</code> from your implementation of the method
 * <code>readElement</code>, as it will not be done by default.
 */
public abstract class RegistryProvider implements IRegistryChangeListener {

	private static final String TAG_DESCRIPTION = "description"; //$NON-NLS-1$

	private static final Map<String, IExtension[]> extensionPoints = Collections.synchronizedMap(new Hashtable<String, IExtension[]>());

	private final String pluginID;

	private final String extensionPointName;

	private final String extensionPointID;

	private static final Comparator<IExtension> comparer = new Comparator<IExtension>() {
		public int compare(IExtension i1, IExtension i2) {
			String s1 = i1.getNamespaceIdentifier();
			String s2 = i2.getNamespaceIdentifier();
			return s1.compareToIgnoreCase(s2);
		}
	};

	/**
	 * The constructor.
	 */
	protected RegistryProvider(String pluginID, String extensionPointName) {
		Assert.isNotNull(extensionPointName, "extensionPointName cannot be null"); //$NON-NLS-1$
		Assert.isLegal(extensionPointName.trim().length() > 0, "extensionPointName cannot be empty"); //$NON-NLS-1$    
		Assert.isNotNull(pluginID, "pluginID cannot be null"); //$NON-NLS-1$
		Assert.isLegal(pluginID.trim().length() > 0, "pluginID cannot be empty"); //$NON-NLS-1$
		this.extensionPointName = extensionPointName;
		this.pluginID = pluginID;
		this.extensionPointID = pluginID + "-" + extensionPointName; //$NON-NLS-1$
		Platform.getExtensionRegistry().addRegistryChangeListener(this);
	}

	public static Map<String, IExtension[]> getExtensionPoints() {
		return extensionPoints;
	}

	/**
	 * Disposes this manager.
	 */
	public void dispose() {
		Platform.getExtensionRegistry().removeRegistryChangeListener(this);
	}

	/**
	 * Adds the given extension to this manager.
	 * 
	 * @param extension
	 *            a registered extension
	 */
	protected abstract void addExtension(IExtension extension);

	/**
	 * Removes the given extension from this manager.
	 * 
	 * @param extension
	 *            a unregistered extension
	 */
	protected abstract void removeExtension(IExtension extension);

	/**
	 * @see org.eclipse.core.runtime.IRegistryChangeListener#registryChanged(org.eclipse.core.runtime.IRegistryChangeEvent)
	 */
	public void registryChanged(IRegistryChangeEvent event) {
		if (!Platform.isRunning()) {
			return;
		}
		// Retrieve any changes relating to the extension point id dealed by
		// this manager
		IExtensionDelta[] delta = event.getExtensionDeltas(pluginID);
		for (int i = 0; i < delta.length; i++) {
			switch (delta[i].getKind()) {
			case IExtensionDelta.ADDED:
				addExtension(delta[i].getExtension());
				break;
			case IExtensionDelta.REMOVED:
				removeExtension(delta[i].getExtension());
				break;
			default:
				break;
			}
		}
	}

	/**
	 * This method extracts description as a subelement of the given element.
	 * 
	 * @return description string if defined, or empty string if not.
	 */
	protected String getDescription(IConfigurationElement config) {
		IConfigurationElement[] children = config.getChildren(TAG_DESCRIPTION);
		if (children.length >= 1) {
			return children[0].getValue();
		}
		return "";//$NON-NLS-1$
	}

	/**
	 * Logs the error in the workbench log using the provided text and the
	 * information in the configuration element.
	 */
	protected void logError(IConfigurationElement element, String text) {
		IExtension extension = element.getDeclaringExtension();
		String pluginId = extension.getNamespaceIdentifier();
		StringBuffer buf = new StringBuffer();
		buf.append("Plugin '" //$NON-NLS-1$ 
				+ pluginId + "', extension '" //$NON-NLS-1$
				+ extension.getExtensionPointUniqueIdentifier() + "'" //$NON-NLS-1$
		);
		buf.append("\n" + text);//$NON-NLS-1$
		Log.getDefault().logInfo(buf.toString());
	}

	/**
	 * Logs a very common registry error when a required attribute is missing.
	 */
	protected void logMissingAttribute(IConfigurationElement element, String attributeName) {
		logError(element, "Required attribute '" + attributeName + "' not defined");//$NON-NLS-2$//$NON-NLS-1$
	}

	/**
	 * Logs a very common registry error when a required child is missing.
	 */
	protected void logMissingElement(IConfigurationElement element, String elementName) {
		logError(element, "Required sub element '" + elementName + "' not defined");//$NON-NLS-2$//$NON-NLS-1$
	}

	/**
	 * Logs a registry error when the configuration element is unknown.
	 */
	protected void logUnknownElement(IConfigurationElement element) {
		logError(element, "Unknown extension tag found: '" + element.getName() + "'");//$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Apply a reproducable order to the list of extensions provided, such that
	 * the order will not change as extensions are added or removed.
	 */
	protected IExtension[] orderExtensions(IExtension[] extensions) {
		// By default, the order is based on plugin id sorted
		// in ascending order. The order for a plugin providing
		// more than one extension for an extension point is
		// dependent in the order listed in the XML file.
		IExtension[] sortedExtension = new IExtension[extensions.length];
		System.arraycopy(extensions, 0, sortedExtension, 0, extensions.length);
		Collections.sort(Arrays.asList(sortedExtension), comparer);
		return sortedExtension;
	}

	/**
	 * Implement this method to read element's attributes. If children should
	 * also be read, then implementor is responsible for calling
	 * <code>readElementChildren</code>. Implementor is also responsible for
	 * logging missing attributes.
	 * 
	 * @return true if element was recognized, false if not.
	 */
	protected abstract boolean readElement(IConfigurationElement element);

	/**
	 * Read the element's children. This is called by the subclass' readElement
	 * method when it wants to read the children of the element.
	 */
	protected void readElementChildren(IConfigurationElement element) {
		readElements(element.getChildren());
	}

	/**
	 * Read each element one at a time by calling the subclass implementation of
	 * <code>readElement</code>.
	 * 
	 * Logs an error if the element was not recognized.
	 */
	protected void readElements(IConfigurationElement[] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (!readElement(elements[i])) {
				logUnknownElement(elements[i]);
			}
		}
	}

	/**
	 * Read one extension by looping through its configuration elements.
	 */
	protected void readExtension(IExtension extension) {
		readElements(extension.getConfigurationElements());
	}

	/**
	 * Start the registry reading process using the supplied plugin ID and
	 * extension point.
	 */
	protected void readRegistry(IExtensionRegistry registry) {
		IExtension[] extensions = extensionPoints.get(extensionPointID);
		if (extensions == null) {
			IExtensionPoint point = registry.getExtensionPoint(pluginID, extensionPointName);
			if (point == null) {
				return;
			}
			extensions = point.getExtensions();
			extensions = orderExtensions(extensions);
			extensionPoints.put(extensionPointID, extensions);
		}
		for (int i = 0; i < extensions.length; i++) {
			readExtension(extensions[i]);
		}
	}

}
