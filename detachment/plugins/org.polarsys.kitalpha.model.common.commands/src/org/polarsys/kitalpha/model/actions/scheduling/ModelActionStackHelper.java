/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.actions.scheduling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.polarsys.kitalpha.model.actions.registry.ModelActionRegistry.RegistryActionElement;

/**
 * @author Faycal Abka
 */
public class ModelActionStackHelper {
	
	public static Collection<RegistryActionElement> sortActions(Collection<RegistryActionElement> actionElts){
		
		List<RegistryActionElement> sortedActionElts = new ArrayList<RegistryActionElement>();
		
		sortedActionElts.addAll(actionElts);
		
		Collections.sort(sortedActionElts);
		
		return sortedActionElts;
	}

}
