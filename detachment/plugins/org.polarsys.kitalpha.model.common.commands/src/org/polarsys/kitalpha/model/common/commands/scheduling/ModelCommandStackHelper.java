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
package org.polarsys.kitalpha.model.common.commands.scheduling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.polarsys.kitalpha.model.common.commands.registry.ModelCommandRegistry.RegistryActionElement;

/**
 * @author Faycal Abka
 *         Zendagui Boubekeur
 */
public class ModelCommandStackHelper {
	
	public static Collection<RegistryActionElement> sortActions(Collection<RegistryActionElement> actionElts){
		List<RegistryActionElement> sortedActionElts = new ArrayList<RegistryActionElement>();
		sortedActionElts.addAll(actionElts);
		Collections.sort(sortedActionElts);
		return sortedActionElts;
	}

	
	/**
	 * Sort collection.
	 * {@link Collections#sort(List)} result is wrong when Java version is 1.7.0_60
	 * @param actionElts : The collection to sort.
	 * @return sorted Collection.
	 */
	public static Collection<RegistryActionElement> sortActions2(Collection<RegistryActionElement> actionElts){
		List<RegistryActionElement> ascdList = new ArrayList<RegistryActionElement>();
		// Ascending sorting of the Collection according to priority
		for (RegistryActionElement element : actionElts) 
		{
			if (ascdList.isEmpty())
			{
				ascdList.add(element);
				continue;
			}
			
			int insertIndex = -1;
			for (int i = 0; i < ascdList.size(); i++) 
			{
				if (element.getPriority() < ascdList.get(i).getPriority())
				{
					insertIndex = i;
					break;
				}
			}
			
			if (insertIndex > -1)
				ascdList.add(insertIndex, element);
			else
				ascdList.add(element);
		}
		
		// Inverse Sort
		List<RegistryActionElement> result = new ArrayList<RegistryActionElement>();
		for (int i = ascdList.size() - 1; i >=0; i--) 
		{
			result.add(ascdList.get(i));
		}
		
		return result;
	}
}
