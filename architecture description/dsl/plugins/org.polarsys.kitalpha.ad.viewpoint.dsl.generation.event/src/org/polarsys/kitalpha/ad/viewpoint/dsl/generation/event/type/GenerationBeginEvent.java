/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
