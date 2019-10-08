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

public class GenerationEndEvent extends AbstractGenerationEvent {

	/**
	 * Generated Serial ID
	 */
	private static final long serialVersionUID = -3642457748469212168L;
	
	
	public GenerationEndEvent(Activity source) {
		super(source);
		setKind(EGenerarationEventKind.END);
	}
	

}
