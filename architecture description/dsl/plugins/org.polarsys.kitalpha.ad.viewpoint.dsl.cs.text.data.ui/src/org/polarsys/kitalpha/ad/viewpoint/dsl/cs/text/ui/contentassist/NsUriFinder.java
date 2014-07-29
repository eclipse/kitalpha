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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
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
		
		for (EPackage ePacakge : usedEPackages) {
			nsuris.add(ePacakge.getNsURI());
		}
		
		return nsuris;
		
	}
	
	private static List<EPackage> getUsedEPackages(EObject model){
		
		String projectName = EcoreUtil.getURI(model).segment(1);
		Resource standaloneResource = ResourceHelper.loadStandaloneResource(projectName);
		Viewpoint viewpoint = getCurrentViewpoint(standaloneResource);
		
		return CoreDomainViewpointHelper.getViewpointAccessibleEPackage(viewpoint);
	}


	private static Viewpoint getCurrentViewpoint(Resource standaloneResource) {
		
		TreeIterator<EObject> it = standaloneResource.getAllContents();
		
		while (it.hasNext()){
			EObject v = it.next();
			if (v instanceof Viewpoint)
				return (Viewpoint)v;
		}
		return null;
	}
}
