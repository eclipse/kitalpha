/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.type;

import org.eclipse.egf.model.fcore.Activity;

/**
 * @author Boubekeur Zendagui
 */

public class ViewpointGenerationEndEvent extends GenerationEndEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -546575290268252107L;
	
	public ViewpointGenerationEndEvent(Activity source) {
		super(source);
	}

}
