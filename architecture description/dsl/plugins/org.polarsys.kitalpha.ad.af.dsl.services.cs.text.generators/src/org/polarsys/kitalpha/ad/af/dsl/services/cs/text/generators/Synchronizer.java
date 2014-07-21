/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class Synchronizer {

	public static final String AFDESC_EXTENSION = "afdesc";
	
	public Synchronizer() {}
	
	public boolean doSynchronize(IFile file) {	
		boolean result = false;
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
		Resource textResource = resourceSet.getResource(uri, true);
		if (textResource!=null) {
			EObject textRoot = textResource.getContents().get(0);
			EcoreUtil.resolveAll(textRoot);
			EObject clone = EcoreUtil2.clone(textRoot);
			IPath emfResourcePath = file.getFullPath().removeFileExtension().addFileExtension(AFDESC_EXTENSION);
			URI emfURI = URI.createPlatformResourceURI(emfResourcePath.toString(), true);
			Resource emfResource = resourceSet.createResource(emfURI);		
			emfResource.getContents().add(0, clone);
			try {
				final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
				saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
				emfResource.save(saveOptions);
				result = true;
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}	
		resourceSet.eSetDeliver(false);
		resourceSet.getResources().clear();
		resourceSet.eAdapters().clear();
		return result;
	}
}
