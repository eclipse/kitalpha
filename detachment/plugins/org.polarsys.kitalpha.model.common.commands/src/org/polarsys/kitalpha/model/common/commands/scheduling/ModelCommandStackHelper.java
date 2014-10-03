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
 */
public class ModelCommandStackHelper {
	
	public static Collection<RegistryActionElement> sortActions(Collection<RegistryActionElement> actionElts){
		
		List<RegistryActionElement> sortedActionElts = new ArrayList<RegistryActionElement>();
		
		sortedActionElts.addAll(actionElts);
		
		Collections.sort(sortedActionElts);
		
		return sortedActionElts;
	}

}
