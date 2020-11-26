/*******************************************************************************
 * Copyright (c) 2019, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.preference.helper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.polarsys.kitalpha.doc.gen.business.core.preference.Activator;

/**
 * @author Arnaud Dieumegard
 */
public class DocgenProjectPreferencesHelper {
	
	/** The singleton instance */
	private static DocgenProjectPreferencesHelper INSTANCE = null;
	
	/** The current project */
	private static IScopeContext currentScope;

	/** The current resource preference node name */
	private static String currentResourceNodeName;
	
	private DocgenProjectPreferencesHelper () {}
	
	private void initScope(Object resource) {
		IProject project = getRelatedProject(resource);
		if (project == null) {
			currentScope = InstanceScope.INSTANCE;
		} else {
			currentScope = new ProjectScope(project);
		}
	}

	/**
	 * @param resource The resource for which the preference shall be saved. It shall either 
	 * be an {@link org.eclipse.emf.ecore.EObject} or a {@link org.eclipse.core.resources.IResource}
	 * @return the instance of DocgenProjectPreferencesHelper
	 * @throws IllegalArgumentException if resource parameter is not one of the supported types
	 */
	public static DocgenProjectPreferencesHelper getInstance(Object resource) {
		if (INSTANCE == null) {
			INSTANCE = new DocgenProjectPreferencesHelper();
		}
		INSTANCE.initScope(resource);
		
		if (resource instanceof IResource) {
			INSTANCE.setCurrentResourceNodeName(((IResource) resource).getFullPath().toString());
		} else {
			if (resource instanceof EObject) {
				URI uri = ((EObject) resource).eResource().getURI();
				INSTANCE.setCurrentResourceNodeName(uri.toFileString());
			} else {
				INSTANCE.setCurrentResourceNodeName(DocgenPreferenceConstant.DOCGEN_PROJECT__DEFAULT_RESOURCE_NODE);
			}
		}
		return INSTANCE;
	}

	/**
	 * Get the Output Path preference value
	 * @param defaultValue The default value to be returned if not existing
	 * @return The Output Path preference value for the current resource 
	 */
	public String getOutputLocationPreference (String defaultValue) {
		// Get project-specific preferences node
		Preferences docgenProjectNode = currentScope.getNode(DocgenPreferenceConstant.DOCGEN_PROJECT__PREFERENCE_NODE);
		Preferences resourceNode = docgenProjectNode.node(currentResourceNodeName);

		// Get OutputLocation Preference
		return resourceNode.get(DocgenPreferenceConstant.DOCGEN_PROJECT__OUTPUT_PATH, defaultValue);
	}
	
	/**
	 * Set the Output Path preference value
	 * @param value The new value
	 */
	public void setOutputLocationPreference (String value) {
		// Get project-specific preferences node
		Preferences docgenProjectNode = currentScope.getNode(DocgenPreferenceConstant.DOCGEN_PROJECT__PREFERENCE_NODE);		
		Preferences resourceNode = docgenProjectNode.node(currentResourceNodeName);
		
		// Get OutputLocation Preference
		resourceNode.put(DocgenPreferenceConstant.DOCGEN_PROJECT__OUTPUT_PATH, value);
		
		// Save preferences
		try {
			docgenProjectNode.flush();
		} catch (BackingStoreException e) {
			Activator.logError(e.getMessage(), e);
		}
	}

	private void setCurrentResourceNodeName (String fullPath) {
		String currentResourcePath = fullPath;
		if (currentResourcePath.charAt(0) == IPath.SEPARATOR) {
			currentResourcePath = currentResourcePath.substring(1);
		}
		currentResourceNodeName = currentResourcePath.replaceAll(String.valueOf(IPath.SEPARATOR), ".");
	}
	
	private static IProject getRelatedProject (Object element) {
		if (element instanceof IResource) {
			return ((IResource) element).getProject();
		} else {
			if (element instanceof EObject) {
				URI uri = ((EObject) element).eResource().getURI();
				IPath path = new Path(uri.toFileString());
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
				return file.getProject();
			}
		}
		return null;
	}
}
