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
package org.polarsys.kitalpha.model.detachment.ui.registry;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.forms.editor.FormEditor;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.model.detachment.ui.Messages;

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
			RuntimeException e = new RuntimeException(Messages.UR_EXTENSION_CANT_GET);
			LOGGER.error(Messages.UR_EXTENSION_CANT_GET, e);
			throw e;
		}
		
		IExtension extensions[] = extension.getExtensions();
		
		if (extensions.length == 0)
			return null;
		return extensions;
	}
	
	
	public static Object newFormPageInstanceWithParameters(String pluginId, String classPath, IEditorPart editor, String id, String title)
			throws RuntimeException {
		
		if (classPath == null || classPath.isEmpty())
		{
			throw new RuntimeException("Fatal Error: Bad formalism of Form Page Contribution (class = " + classPath + ")");
		}
		
		if (editor == null)
		{
			throw new RuntimeException("Fatal Error: Editor Is Not Created Yet");
		}
		
		if (id == null || id.isEmpty())
		{
			throw new RuntimeException("Fatal Error: Bad formalism of Form Page Contribution (id = " + id + ")");
		}
		
		if (title == null || title.isEmpty())
		{
			throw new RuntimeException("Fatal Error: Bad formalism of Form Page Contribution (title = " + title + ")");
		}
		
		
		Object result = null;
		try {
			Bundle contributor = Platform.getBundle(pluginId);
			
			//TODO handle when bundle/class not found by thrown an exception
			if (contributor != null){
				Class<?> clazz = contributor.loadClass(classPath);
				Constructor<?> constructor = clazz.getConstructor(FormEditor.class, String.class, String.class);
				result = constructor.newInstance(editor, id, title);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		} catch (InstantiationException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		}
		
		return result;
	}
}
