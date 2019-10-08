/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.precondition.condition;

import java.util.Collection;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.SiriusHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.precondition.IViewpointGenerationPrecondition;

/**
 * @author Boubekeur Zendagui
 */
public class ViewpointInUsePrecondition implements IViewpointGenerationPrecondition {

	public ViewpointInUsePrecondition() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.precondition.IViewpointGenerationPrecondition#canGenerate(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint)
	 */
	@Override
	public boolean canGenerate(Viewpoint viewpoint) {
		final String afViewpointID = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		
		Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
		for (Session session : sessions) 
		{
			boolean isInUse = isViewpointInUseIn(session, afViewpointID);
			if (isInUse)
			{
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Check if the viewpoint is used in a given {@link Session} or not.
	 * @param session an opened {@link Session}
	 * @param id the ID of the AF Viewpoint
	 * @return True if the viewpoint is in use, False otherwise.
	 */
	private boolean isViewpointInUseIn(Session session, String id){
		if (session != null)
		{
			ViewpointManager viewpointManager = SiriusHelper.getViewpointManager(session);
			return viewpointManager.isUsed(id);
		}
		return false;
	}
}
