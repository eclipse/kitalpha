/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Faycal Abka
 */
public class FinderAFViewpointHelper {
	
	public static String getEPackageNsURI_of(EObject eObject){
		return eObject.eClass().getEPackage().getNsURI();
	}
	
	public static Set<String> filterURISet(Set<String> toFilter, Map<String, Collection<String>> vpRelationsShip){
		Set<String> filtredSet = new HashSet<String>();
		Set<String> mapKeys = vpRelationsShip.keySet();
		
		for (String uri : toFilter) {
			if (mapKeys.contains(uri)){
				filtredSet.add(uri);
			}
		}
		
		return filtredSet;
	}
	
	public static Map<String, Collection<String>> filterURIMap(Map<String, Collection<String>> toFilter, Set<String> usedURI){
		Map<String, Collection<String>> filtredMap = new HashMap<String, Collection<String>>();
		Set<String> mapKeys = toFilter.keySet();
		
		for (String uri : usedURI) {
			if (mapKeys.contains(uri)){
				filtredMap.put(uri, toFilter.get(uri));
			}
		}
		
		//Clean not used uri from filtred Map
		Collection<Collection<String>> values = filtredMap.values();
		
		for (Collection<String> collection : values) {
			Iterator<String> it = collection.iterator();
			
			while (it.hasNext()){
				String uri = it.next();
				if (!usedURI.contains(uri)){
					it.remove();
				}
			}
			
		}
		
		return filtredMap;
	}
}