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
package org.polarsys.kitalpha.ad.services.internal.actions;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Action;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;

/**
 * This is transition is used to emulate the viewpoint manager action via
 * predicate extension 
 * 
 * @author Faycal Abka
 *
 */
public class EmptyTransitionAction implements Action {

	public EmptyTransitionAction() {
	}

	@Override
	public void run(Context e) {
		//Do nothing
	}

}
