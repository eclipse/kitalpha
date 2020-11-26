/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
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
