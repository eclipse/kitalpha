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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.manager;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.AbstractGenerationEvent;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.listener.IGenerationListener;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationEventManager {
	
	/**
	 * Singleton variable
	 */
	private final static GenerationEventManager instance_ = new GenerationEventManager();
	
	/**
	 * 
	 */
	private List<IGenerationListener> _listeners = new ArrayList<IGenerationListener>();

	/**
	 *
	 * Default constructor
	 */
	private GenerationEventManager() {
	}

	/**
	 *
	 *@return instance_
	 */
	public static GenerationEventManager getInstance() {
		return instance_;
	}
	
	/**
	 * 
	 * @param listener
	 */
	public synchronized void addGenerationListener(IGenerationListener listener){
		if (!_listeners.contains(listener))
		{
			_listeners.add(listener);
		}
	}
	
	/**
	 * 
	 * @param listener
	 */
	public synchronized void removeGenerationListener(IGenerationListener listener){
		if (_listeners.contains(listener))
		{
			_listeners.remove(listener);
		}
	}

	public synchronized void removeAllGenerationListener(){
		_listeners.clear();
	}

	/**
	 * 
	 * @param event
	 */
	public synchronized void notifyGenerationListener(AbstractGenerationEvent event){
		for (IGenerationListener listener : _listeners) 
		{
			switch (event.getKind()) {
			case BEGIN:
				listener.generationBegin(event);
				break;
			case END:
				listener.generationEnd(event);
				break;
			}
		}
	}
	
}
