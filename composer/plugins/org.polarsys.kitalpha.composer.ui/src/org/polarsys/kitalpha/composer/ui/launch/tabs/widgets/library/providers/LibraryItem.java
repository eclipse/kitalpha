/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library.providers;

import java.util.Collection;
import java.util.HashMap;

import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Guillaume Gebhart
 *
 */
public class LibraryItem {

	
	public LibraryItem(Resource resource, boolean isValid){
		item = resource;
		errors = new HashMap<Resource,String>();
	}

	Resource item;
	/**
	 * @return the item
	 */
	public Resource getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(Resource item) {
		this.item = item;
	}
	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return errors.isEmpty();
	}
	
	boolean valid; 
	HashMap<Resource,String> errors;

	
	public void addErrorsMsg(Resource key, String message){
		errors.put(key,message);
	}
	
	public void clearErrorsMsg(){
		errors.clear();
	}
	
	public boolean isConflictWith(Resource key){
		return errors.containsKey(key);
	}
	
	public void removeWith(Resource key){
		errors.remove(key);
	}
	
	public Collection<String> getErrorsMsg(){
		return errors.values();
	}
}
