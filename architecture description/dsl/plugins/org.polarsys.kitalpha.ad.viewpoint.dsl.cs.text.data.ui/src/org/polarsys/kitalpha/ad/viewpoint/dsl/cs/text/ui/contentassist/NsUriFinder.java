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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreDomainViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helper.URIConverterHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

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
		
		if (vp.getUseAnyEMFResource() != null && !vp.getUseAnyEMFResource().isEmpty())
			uris.addAll(getWSAndFSResource(vp));
		
		uris.addAll(getUsedViewpointEPackages(vp));
		
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
	
	
	private static Collection<String> getUsedViewpointEPackages(Viewpoint vp){
		EList<Viewpoint> viewpoints = vp.getUseViewpoint();
		
		Collection<String> platformURIs = new HashSet<String>();
		
		for (Viewpoint viewpoint : viewpoints) {	
			String vpProjectName = ResourceHelper.getProjectName(viewpoint);	

			//FIXME: get this id form configuation aspect 	
			String resource_id = vpProjectName.substring(0, vpProjectName.lastIndexOf("."));	

			org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint coreDomainViewpoint = CoreDomainViewpointHelper.getCoreDomainViewpoint(resource_id, null);
			
			if (coreDomainViewpoint == null){	
				throw new RuntimeException("Could not find the viewpoint resource for the project: " + vpProjectName);
			} else {
				EList<EPackage> packages = coreDomainViewpoint.getMetamodel().getModels();	
				platformURIs.addAll(getPlatformURIsOfPackages(packages));
			}
		}
		return platformURIs;
	}
		
		
		private static Collection<String> getPlatformURIsOfPackages(EList<EPackage> packages) {	

			Collection<String> platformsUri = new HashSet<String>();
			for (EPackage ePackage : packages) {
				String nsuri = ePackage.getNsURI();
				
				URI uri = URI.createURI(nsuri);
				URI p_uri = URIConverterHelper.getPlatformURI(uri);
				
				if (p_uri != null && !p_uri.isEmpty()){
					platformsUri.add(p_uri.toString());
				} else {
					Resource ePackageResource = ePackage.eResource();
					if (ePackageResource != null){
						URI resource_uri = ePackageResource.getURI();
						
						if (resource_uri != null && !resource_uri.isEmpty())
							platformsUri.add(resource_uri.toString());
					} else {
						platformsUri.add(nsuri);
					}
				}
					
			}
			
			return platformsUri;
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
