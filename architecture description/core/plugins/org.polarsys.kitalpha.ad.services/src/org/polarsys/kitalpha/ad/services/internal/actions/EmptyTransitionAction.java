/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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

	@Override
	public void run(Context e) {
		//Do nothing
	}

}
