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

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreDomainViewpointHelper;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class NsUriFinder {

	@Deprecated
	public static Set<String> getNsUriFromEPackageRegistry(){
		
		Registry registry = EPackageRegistryImpl.INSTANCE;
		return registry.keySet();
	}
	
	
	public static Set<String> getViewpointEPackagesNSURI(EObject model){
		Set<String> nsuris = new HashSet<String>();
		Collection<EPackage> usedEPackages = getUsedEPackages(model);
		Collection<String> usedEMFResources = getUsedEMFResources(model);
		for (EPackage ePacakge : usedEPackages) {
			nsuris.add(ePacakge.getNsURI());
		}
		
		nsuris.addAll(usedEMFResources);
		
		return nsuris;
		
	}
	
	private static Collection<String> getUsedEMFResources(EObject model) {
		Viewpoint viewpoint = getRootViewpoint(model);
		
		ViewpointResources vr = viewpoint.getViewpointResources();
		
		if (vr != null){
			EList<AbstractResource> usedResources = vr.getUseResource();
			
			if (!usedResources.isEmpty()){
				Collection<String> emfUsedUri = getEMFUsedURI(usedResources);
				return emfUsedUri;
			}
		}
		
		return Collections.emptyList();
	}


	private static Collection<String> getEMFUsedURI(
			EList<AbstractResource> usedResources) {
		
		Collection<String> uris = new HashSet<String>();
		
		for (AbstractResource abstractResource : usedResources) {
			if (abstractResource instanceof EMFResource){
				String uri = ((EMFResource)abstractResource).getUri();
				if (!uri.endsWith(".odesign"))
					uris.add(uri);
			}
		}
		return uris;
	}


	private static List<EPackage> getUsedEPackages(EObject model){
		
		Viewpoint viewpoint = getRootViewpoint(model);
		
		return CoreDomainViewpointHelper.getViewpointAccessibleEPackage(viewpoint);
	}


	//FIXME put these 2 methods in an abstract class in common plugin to be shared by Data
	//		NsUriFinder too (they are duplicated!)
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
	
	private static Viewpoint getRootViewpoint(EObject model){
		
		String projectName = EcoreUtil.getURI(model).segment(1);
		Resource standaloneResource = ResourceHelper.loadStandaloneResource(projectName);
		Viewpoint viewpoint = getCurrentViewpoint(standaloneResource);
		
		return viewpoint;
	}
}
