/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces;

/**
 * Responsible to provide a context for the engine.
 * A client must implement this interface
 * 
 * @author Faycal Abka
 *
 */
public interface ContextProvider {
	
	/**
	 * @return the context for the engine
	 */
	Context getContext();

}
