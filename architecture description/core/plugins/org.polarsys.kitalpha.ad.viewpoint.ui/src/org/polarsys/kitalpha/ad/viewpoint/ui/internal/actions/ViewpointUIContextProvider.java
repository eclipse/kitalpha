/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.ui.internal.actions;

import org.polarsys.kitalpha.ad.services.AbstractViewpointContext;
import org.polarsys.kitalpha.ad.services.ViewpointContextProvider;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;

public class ViewpointUIContextProvider extends ViewpointContextProvider  {

	private final String id; //Viewpoint ID
	
	public ViewpointUIContextProvider(final String id, ViewpointManager vpManager) {
		super(vpManager);
		this.id = id;
	}
	
	public Context getViewpointManagerContext(){
		return new AbstractViewpointContext() {
			
			@Override
			protected void initializeContext() {
				initializeContext(getViewpointManager());
				add("VIEWPOINT.AD", id); //$NON-NLS-1$
			}
		};
	}

}
