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
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.AbstractGenerationEvent;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.EGenerarationEventKind;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationBeginEvent extends AbstractGenerationEvent {

	/**
	 * Generated Serial ID
	 */
	private static final long serialVersionUID = -6071269713563141000L;
	
	
	public GenerationBeginEvent(Activity source) {
		super(source);
		setKind(EGenerarationEventKind.BEGIN);
	}

}
