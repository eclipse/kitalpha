/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author Boubekeur Zendagui
 */

public class PlatformEClassesManager {
	
	public static final PlatformEClassesManager INSTANCE = new PlatformEClassesManager();
	
	protected ResourceSet rs = new ResourceSetImpl();
	
	// Contains all Resources for each registered NsUri. Resources are created when needed
	protected Map<URI, Resource> NsUriToResource = new HashMap<URI, Resource>();
	
	public EEnum getEEnumWithPlatformURI(EEnum eenum){
		URI resourceURI = eenum.eResource().getURI();
		Resource resource = null;
		// If the URI is a Platform URI --> Don't do anything 
		if (resourceURI.isPlatform())
		{
			return eenum;
		}else
		{
			NsURIToPlatformResource(resourceURI);
			resource = getPlatformResourceOfNsURI(resourceURI);
		}
		
		EPackage platfpormEPackage = (EPackage)resource.getContents().get(0);
		EPackage referencedEPackage = eenum.getEPackage();
		
		if (platfpormEPackage.getName().equalsIgnoreCase(referencedEPackage.getName()))
		{
			return (EEnum) platfpormEPackage.getEClassifier(eenum.getName());
		}else
		{
			for (EPackage iEPackage : platfpormEPackage.getESubpackages()) 
			{
				if (iEPackage.getName().equalsIgnoreCase(referencedEPackage.getName()))
				{
					return (EEnum) iEPackage.getEClassifier(eenum.getName());
				}
			}
		}
		
		return eenum;
	}
	
	public EClass getEClassesWithPlatformURI(EClass clazz){
		URI resourceURI = clazz.eResource().getURI();
		Resource resource = null;
		// If the URI is a Platform URI --> Don't do anything 
		if (resourceURI.isPlatform())
		{
			return clazz;
		}else
		{
			NsURIToPlatformResource(resourceURI);
			resource = getPlatformResourceOfNsURI(resourceURI);
		}
		
		EPackage platfpormEPackage = (EPackage)resource.getContents().get(0);
		EPackage referencedEPackage = clazz.getEPackage();
		
		if (platfpormEPackage.getName().equalsIgnoreCase(referencedEPackage.getName()))
		{
			return (EClass) platfpormEPackage.getEClassifier(clazz.getName());
		}else
		{
			for (EPackage iEPackage : platfpormEPackage.getESubpackages()) 
			{
				if (iEPackage.getName().equalsIgnoreCase(referencedEPackage.getName()))
				{
					return (EClass) iEPackage.getEClassifier(clazz.getName());
				}
			}
		}
		
		return clazz;
	}
	
	public Resource getPlatformResourceOfNsURI(URI uri){
		Resource result = null;
		if (NsUriToResource.containsKey(uri))
		{
			result = NsUriToResource.get(uri);
		}
		else
		{
			NsURIToPlatformResource(uri);
			for (Map.Entry<URI, Resource> currentResource : NsUriToResource.entrySet()) {
				if (currentResource.getKey().equals(uri)) {
					result =  currentResource.getValue();
				}
			}
		}
		return result;
	}
	
	
	public void NsURIToPlatformResource(URI nsURI){
		URI genmodelURI = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(nsURI.toString());
		ResourceSet set = new ResourceSetImpl();
		Resource r = set.createResource(genmodelURI);
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (GenPackage genPackage : ((GenModel)r.getContents().get(0)).getGenPackages()) 
		{
			URI packNsURI  = URI.createURI(genPackage.getEcorePackage().getNsURI());
			URI platformUri = genPackage.getEcorePackage().eResource().getURI();
			if (NsUriToResource.containsKey(packNsURI)) {
				break;
			}
		
			Resource platResource = set.createResource(platformUri);
			try {
				platResource.load(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
			NsUriToResource.put(packNsURI, platResource);
		}
	}

}
