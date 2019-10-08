/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.services;

import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.ContextProvider;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ViewpointContextProvider implements ContextProvider {
	
	protected final ViewpointManager viewpointManager;
	
	
	public ViewpointContextProvider(ViewpointManager viewpointManager) {
		this.viewpointManager = viewpointManager;
	}
	

	@Override
	public Context getContext() {
		return new AbstractViewpointContext() {
			@Override
			protected void initializeContext() {
				initializeContext(getViewpointManager());
			}
		};
	}
	
	protected ViewpointManager getViewpointManager() {
		return this.viewpointManager;
	}
	
}
