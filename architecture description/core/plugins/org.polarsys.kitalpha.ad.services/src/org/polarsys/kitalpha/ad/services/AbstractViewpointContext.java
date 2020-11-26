/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.services;

import java.util.function.Function;

import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;

/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class AbstractViewpointContext extends Context {
	
	public static final String IS_ACTIVE = "isActive";
	public static final String IS_FILTERED = "isFiltered";
	public static final String IS_INACTIVE = "isInactive";
	public static final String IS_REFERENCED = "isReferenced";
	public static final String IS_USED = "isUsed";
	
	protected void initializeContext(ViewpointManager viewpointManager) {
		final Function<String, Boolean> isActive = viewpointManager::isActive;
		final Function<String, Boolean> isFiltered = viewpointManager::isFiltered;
		final Function<String, Boolean> isInactive = viewpointManager::isInactive;
		final Function<String, Boolean> isReferenced = viewpointManager::isReferenced;
		final Function<String, Boolean> isUsed = viewpointManager::isUsed;
		
		add(IS_ACTIVE, isActive);
		add(IS_FILTERED, isFiltered);
		add(IS_INACTIVE, isInactive);
		add(IS_REFERENCED, isReferenced);
		add(IS_USED, isUsed);
	}
	
}
