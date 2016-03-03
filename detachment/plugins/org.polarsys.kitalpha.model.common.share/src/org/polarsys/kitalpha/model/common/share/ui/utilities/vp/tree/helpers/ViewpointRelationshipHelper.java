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
package org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.helpers;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.resourcereuse.model.Resource;


/**
 * @author Faycal Abka
 */
public class ViewpointRelationshipHelper {
	
	private static String PLATFORM_PLUGIN = "platform:/plugin";
	
	/**
	 * Build the relationships between viewpoints given in resources
	 * @param resources represents the viewpoints (Resource reuse)
	 * @return Map of each NSURI to collection of NSURI which is depends
	 */
	public static Map<String, Collection<String>> getUsedRelationship(Resource[] resources){
		return discouverUsedRelationShips(resources);
	}
	
	
	public static Collection<EList<EPackage>> collectAllViewpointsEPackages(Resource[] resources){
		Collection<EList<EPackage>> viewpointsEPackages = new HashSet<EList<EPackage>>();
		
		for (Resource resource : resources) {
			String ePath = resource.getPath();
			Viewpoint currentViewpoints = getViewpointRootEObject(ePath);
			EList<EPackage> ePackages = currentViewpoints.getMetamodel().getModels();
			
			viewpointsEPackages.add(ePackages);
		}
		
		return viewpointsEPackages;
	}
	
	
	public static Map<String, Collection<String>> discouverUsedRelationShips(Resource [] resources){
		
		Map<String, Collection<String>> relationshipResult = new HashMap<String, Collection<String>>();
		
		Collection<EList<EPackage>> ePackageList = collectAllViewpointsEPackages(resources);
		
		for (EList<EPackage> eList : ePackageList) {
			for (EPackage ePackage : eList) {
				discoverDependeciesOfEPackage(ePackage, ePackageList, relationshipResult, false);
			}
		}
		
		return relationshipResult;
	}

	/**
	 * TODO documentation
	 * @param ePackage
	 * @param allViewpointEpackages
	 * @param dependencies
	 * @param deepDependencies
	 */
	public static void discoverDependeciesOfEPackage(EPackage ePackage, Collection<EList<EPackage>> allViewpointEpackages, Map<String, Collection<String>> dependencies, boolean deepDependencies){
		
		
		if (ePackage != null){
			EList<EClassifier> ePackageEClassifiers = ePackage.getEClassifiers();
			
			for (EClassifier eClassifier : ePackageEClassifiers) {
				if (eClassifier instanceof EClass){
					EClass eClass = (EClass)eClassifier;
					discoverEClassDependencies(eClass, allViewpointEpackages, dependencies, deepDependencies);
				}
			}
		}		
	}
	
	


	public static void discoverEClassDependencies(EClass eClass,
			Collection<EList<EPackage>> allViewpointEpackages,
			Map<String, Collection<String>> dependencies,
			boolean deepDependencies) {
		
		String nsUri;
		
		nsUri = eClass.getEPackage().getNsURI();

		
		if (!dependencies.keySet().contains(nsUri) && ePackageIsIn(nsUri, allViewpointEpackages))
			dependencies.put(nsUri, new HashSet<String>());
		
		EList<EClass> superTypes = eClass.getESuperTypes();
		if(superTypes != null && !superTypes.isEmpty()){
			for(EClass type: superTypes){
				
				EPackage ePackage = type.getEPackage();
				String nsUri2 = ePackage != null? ePackage.getNsURI(): null;

				if (nsUri2 != null && !nsUri.equals(nsUri2) && ePackageIsIn(nsUri2, allViewpointEpackages))
					dependencies.get(nsUri).add(nsUri2);
			}						
		}
		
		// visit attributes
		EList<EAttribute> attributes = eClass.getEAllAttributes();
		if(attributes != null && !attributes.isEmpty()){
			for(EAttribute attr: attributes){
				if(attr.isDerived() || attr.isVolatile() || attr.isTransient())
					continue;
				EClassifier type = attr.getEType();

				String nsUri2 = type.getEPackage().getNsURI();
				if (!nsUri.equals(nsUri2) && ePackageIsIn(nsUri2, allViewpointEpackages))
					dependencies.get(nsUri).add(nsUri2);
			}
		}
		
		
		// visit references
		EList<EReference> refs = eClass.getEAllReferences();
		if(refs != null && !refs.isEmpty()){
			for(EReference ref: refs){
				if(ref.isDerived() || ref.isVolatile() || ref.isTransient())
					continue;

				EClassifier type = ref.getEType();

				EPackage ePackage = type.getEPackage();
				String nsUri2 = ePackage != null? ePackage.getNsURI():null;

				if (nsUri2 != null && !nsUri.equals(nsUri2) && ePackageIsIn(nsUri2, allViewpointEpackages))
					dependencies.get(nsUri).add(nsUri2);
			}
		}

		// visit annotations
		EList<EAnnotation> annotations = eClass.getEAnnotations();
		if(annotations != null && !annotations.isEmpty()){
			for(EAnnotation ann: annotations){
				EMap<String, String> details = ann.getDetails();
				for(String key: details.keySet()){

					String value = details.get(key);					
					if (!nsUri.equals(value) && ePackageIsIn(value, allViewpointEpackages))
						dependencies.get(nsUri).add(value);
				}
			}
		}
		
	}


	private static boolean ePackageIsIn(String nsUri2,
			Collection<EList<EPackage>> allViewpointEpackages) {
		
		for (EList<EPackage> eList : allViewpointEpackages) {
			for (EPackage ePackage : eList) {
				String nsUri = ePackage.getNsURI();
				
				if (nsUri != null && nsUri.equals(nsUri2))
					return true;
			}
		}
		return false;
	}

	/**
	 * Returns the root EObject of viewpoint
	 * @param path URI of the root EObject
	 * @return EObject of the viewpoint or null
	 */
	private static Viewpoint getViewpointRootEObject(String path){
		
		if (checkString(path)){
			URI uri = createPlatformPluginURI(path, false);
			ResourceSet resourceSet = new ResourceSetImpl();
			
			return (Viewpoint) resourceSet.getEObject(uri, true);
			
		}
		return null;
	}
	
	private static boolean checkString(String s){
		return s != null && !s.equals("");
	}
	
	
	public static boolean detectCycle(Map<String, Collection<String>> relationships){
		boolean isCycleDetected = false;

		EXTERNAL_FOR_LOOP:
			for (String  uri: relationships.keySet()) {
				Collection<String> tmp = relationships.get(uri);

				Iterator<String> it = tmp.iterator();

				while (it.hasNext()){
					String uri2 = it.next();

					if (relationships.keySet().contains(uri2)){

						Collection<String> tmp2 = relationships.get(uri2);

						if (tmp2.contains(uri)){
							isCycleDetected = true;
							break EXTERNAL_FOR_LOOP;
						}
					}
				}
			}
		
		return isCycleDetected;
	}
	
	//Fix for URI creation with fragment
	/**
	 * 
	 * @param pathName (format: /plugin-id/path)
	 * @param encode
	 * @return
	 */
	public static URI createPlatformPluginURI(String pathName, boolean encode){
		if (pathName == null || pathName.isEmpty()){
			throw new IllegalArgumentException("Could not create URI with null or empty path");
		}
		
		return URI.createURI(PLATFORM_PLUGIN + pathName);
	}
}
