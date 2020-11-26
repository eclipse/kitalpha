/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.listener;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.AbstractGenerationEvent;

/**
 * @author Boubekeur Zendagui
 */

public interface IGenerationListener {

	/**
	 * This methods is fired when the generation begin.
	 * The events are to create and fire by programmers.
	 */
	void generationBegin(AbstractGenerationEvent event);
	
	/**
	 * This methods is fired after the generation ends.
	 * The events are to create and fire by programmers.
	 */
	void generationEnd(AbstractGenerationEvent event);
	
}
