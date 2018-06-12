/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
