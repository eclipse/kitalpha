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
package org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MDERichTextHelper {
	
	private MDERichTextHelper(){
		
	}

	/**
	 * Get project where the resource of the eObject is holded
	 * @param eObject
	 * @return the project or null
	 */
	public static IProject getProject(EObject eObject) {
		IProject result = null;
		Resource resource;
		if ((null == eObject) || ((resource = eObject.eResource()) == null)) {
			return result;
		}
		IFile res = WorkspaceSynchronizer.getFile(resource);
		if (res != null) {
			result = res.getProject();
		}
		return result;
	}
	
	/**
	 * Get String of the path of the project where the eObject is holded
	 * @param eObject
	 * @return A string which represents the path of the project or null
	 */
	public static String getProjectPath(EObject eObject){
		IProject project = getProject(eObject);
		return project != null? project.getLocation().toPortableString() : null;
	}
	
	/**
	 * Get the label provider of the element
	 * @param element
	 * @return label provider or null
	 */
	public static AdapterFactoryLabelProvider getLabelProvider(EObject element){
		AdapterFactoryEditingDomain adapterFactory = getAdapterFactory(element);
		if (adapterFactory != null){
			return new AdapterFactoryLabelProvider(adapterFactory.getAdapterFactory());
		}
		return null;
	}
	
	/**
	 * Get the content provider of the element
	 * @param element
	 * @return content provider or null
	 */
	public static AdapterFactoryContentProvider getContentProvider(EObject element){
		AdapterFactoryEditingDomain adapterFactory = getAdapterFactory(element);
		if (adapterFactory != null){
			return new AdapterFactoryContentProvider(adapterFactory.getAdapterFactory());
		}
		return null;
	}
	
	/**
	 * Return the editing domain of the element
	 * @param element
	 * @return editing domain attached to the element or null
	 */
	public static AdapterFactoryEditingDomain getAdapterFactory(EObject element){
		return (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(element);
	}
	
	/**
	 * Get the name of the element
	 * @param element
	 * @return the name of the element or null
	 */
	public static String getName(EObject element){
		AdapterFactoryEditingDomain editingDomain = getAdapterFactory(element);
		if (editingDomain != null){
			IItemLabelProvider provider = (IItemLabelProvider) editingDomain.getAdapterFactory().adapt(element, IItemLabelProvider.class);
		      if (null != provider) {
		        return provider.getText(element);
		      }
		}
		return null;
	}
	
	/**
	 * Get the name of the object referenced by the fragment within the first resource of the resourceSet managed by
	 * the editing domain
	 * @param ed editing domain
	 * @param fragment of the element to retrieve the name
	 * @return the name of the object or null
	 */
	public static String getName(EditingDomain ed, String fragment){
		EList<Resource> resources = ed.getResourceSet().getResources();
		
		for (Resource resource : resources) {
			EObject eObject = resource.getEObject(fragment);
			if (eObject != null){
				return getName(eObject);
			}
		}
		return null;
	}

}
