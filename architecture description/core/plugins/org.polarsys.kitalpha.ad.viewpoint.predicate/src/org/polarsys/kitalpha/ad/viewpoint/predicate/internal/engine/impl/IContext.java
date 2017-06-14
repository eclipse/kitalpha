/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.internal.engine.impl;

import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.ValueNotFoundException;

/**
 * internal interface which specify read-only context.
 * A context is key/value structure. This context allows to contributed predicates and actions
 * to access and reuse data to perform their behavior.
 * 
 * 
 * @author Faycal Abka
 *
 */
public interface IContext {
	
	/**
	 * Retun the value associated with the name.
	 * @param name of the value
	 * @return the value
	 * @throws ValueNotFoundException if the value does't exist (i.e., not associated with the name)
	 */
	public Object getValue(String name) throws ValueNotFoundException;
}
