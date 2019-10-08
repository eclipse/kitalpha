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

import java.util.Hashtable;
import java.util.Map;

import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.ValueNotFoundException;
import org.polarsys.kitalpha.ad.viewpoint.predicate.internal.engine.impl.IContext;

/**
 * Abstract read-only context.
 * A context is key/value structure. This context allows to contributed predicates and actions
 * to access and reuse data to perform their behavior.
 * 
 * Each client of predicate API must implements its own context. 
 * 
 * @author Faycal Abka
 *
 */
public abstract class Context implements IContext {
	
	public static final Context EMPTY_CONTEXT = new Context() {
		
		@Override
		protected void initializeContext() {
			//Nothing to do
		}

	};
	
	private final Map<String, Object> environment = new Hashtable<>();
	
	/**
	 * Constructor
	 */
	protected Context() {
		initializeContext();
	}
	
	
	@Override
	public Object getValue(String name) throws ValueNotFoundException {
		if (environment.containsKey(name)){
			return environment.get(name);
		}
		throw new ValueNotFoundException("the name: " + name + " does not exist in the context");
	}
	
	/**
	 * Adding a naming value to the context
	 * @param name which be linked to the value
	 * @param value
	 */
	protected final void add(String name, Object value){
		environment.put(name, value);		
	}
	
	/**
	 * A client must implements this method.
	 * <br/>
	 * To add new key/value to the context, use final method <link>org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context.add(String, Object)</link>
	 */
	protected abstract void initializeContext();
}
