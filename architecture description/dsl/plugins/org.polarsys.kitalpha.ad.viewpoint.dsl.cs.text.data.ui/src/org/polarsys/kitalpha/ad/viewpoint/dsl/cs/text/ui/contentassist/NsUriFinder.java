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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry.DataWorkspaceEPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreDomainViewpointHelper;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class NsUriFinder {

	public static Set<String> getViewpointEPackagesNSURI(EObject model, IExternalContentProvider externalProvider){
		String projectName = ResourceHelper.getProjectName(model);
		Viewpoint vp = getRootViewpoint(model, projectName, externalProvider);
		Set<String> uris = new HashSet<String>();

		uris = getUsedModel(vp);

		return uris;
	}


	private static Set<String> getUsedModel(Viewpoint vp) {
		Set<String> uris = new HashSet<String>();
		
		if (vp.getUseAnyEMFResource() != null && !vp.getUseAnyEMFResource().isEmpty())
			 uris.addAll(vp.getUseAnyEMFResource());
		uris.addAll(getWSAndFSResource(vp));
		
		return uris;
	}

	
	private static Collection<? extends String> getWSAndFSResource(Viewpoint vp) {
		Collection<String> uris = new HashSet<String>();
		
		for (String uri : vp.getUseFSResource()) {
			if (uri.endsWith(".ecore"))
				uris.add(uri);
		}
		
		 for (String uri : vp.getUseWorkspaceResource()) {
			 if (uri.endsWith(".ecore"))
				 uris.add(uri);
		 }
		 return uris;
	}
	
	private static Viewpoint getRootViewpoint(EObject model, String projectName, IExternalContentProvider externalProvider){
		
		ResourceSet fakeResourceSet = new ResourceSetImpl();
		XtextResource resource;
		
		ResourceHelper.loadPrimaryResource(projectName, fakeResourceSet);
		URI uri = ResourceHelper.getPrimaryResourceURI(projectName);
		
		resource = (XtextResource) fakeResourceSet.getResource(uri, false);
		String text = externalProvider.getActualContentProvider().getContent(uri);
		
		if (text != null && !text.isEmpty() && resource != null)
			try {
				resource.reparse(text);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		Viewpoint viewpoint = getCurrentViewpoint(resource);
		
		return viewpoint;
	}
	
	//FIXME put these 2 methods in an abstract class in common plugin to be shared by Data 
	//NsUriFinder too (they are duplicated!)
	private static Viewpoint getCurrentViewpoint(Resource standaloneResource) {
		if (standaloneResource != null){
			TreeIterator<EObject> it = standaloneResource.getAllContents();
			while (it.hasNext()){
				EObject v = it.next();
				if (v instanceof Viewpoint)
					return (Viewpoint)v;
			}
		}
		return null;
	}
}
