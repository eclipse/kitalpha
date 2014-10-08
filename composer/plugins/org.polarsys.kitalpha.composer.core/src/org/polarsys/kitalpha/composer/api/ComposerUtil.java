/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;

/**
 * Utility method for composer.
 * 
 * @author Yann Mortier
 */
public final class ComposerUtil {

	/**
	 * Avoid instantiation.
	 * 
	 */
	private ComposerUtil() {
		// empty.
	}

	/**
	 * Gets the Java IO {@link File} corresponding to the given {@link IPath}.
	 * 
	 * @param path
	 * @return the Java IO {@link File} corresponding to the given {@link IPath}.
	 */
	public static File pathToFile(IPath path) {
		IResource resource = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(path);
		if (resource != null) {
			return resource.getLocation().toFile();
		}
		return null;
	}
	
	/**
	 * Returns a map having {@link String}s has key and value.
	 * 
	 * @param map the original map.
	 * @return a map having {@link String}s has key and value.
	 */
	public static Map<String, String> cast(Map<?, ?> map) {
		Map<String, String> result = new HashMap<String, String>();
		for (Entry<?, ?> entry : map.entrySet()) {
			if (entry.getKey() instanceof String && entry.getValue() instanceof String) {
				result.put((String) entry.getKey(), (String) entry.getValue());
			}
		}
		return result;
	}
	
	/**
	 * Returns a List having {@link String}s as content.
	 * 
	 * @param list the original list.
	 * @return a list having {@link String}s as content.
	 */
	public static List<String> cast(List<?> list) {
		List<String> result = new ArrayList<String>();
		for (Object obj : list) {
			if (obj instanceof String) {
				result.add((String)obj);
			}
		}
		return result;
	}

}
