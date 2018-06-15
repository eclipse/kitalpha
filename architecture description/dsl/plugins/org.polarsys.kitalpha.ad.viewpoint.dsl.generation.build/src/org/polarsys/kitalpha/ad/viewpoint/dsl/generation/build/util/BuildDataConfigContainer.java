/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.tasks.GeneratorConstants;

/**
 * Container of all data configuration of viewpoint build
 * 
 * @author Faycal
 *
 * @param <T> type
 */
public class BuildDataConfigContainer<T> {
	
	/**
	 * key: type of property configuration {@link GeneratorConstants}
	 * value: Map/List from aspect build model. they are computed by {@link BuildVPConfigurationHelper}
	 */
	private Map<String, Map<T, T>> configMaps 	= null;
	private Map<String, List<T>>   configLists	= null;
	
	private boolean canManageSourceFolders = false;
	private boolean canManageCronTriggers  = false;
	private boolean canManageSCMTriggers   = false;
	private boolean canManageUsers			= false;
	private boolean canManageHudsonProperties = false;
	private boolean canManageGenerationLocation = false;
	
	
	public BuildDataConfigContainer(){
		this.configMaps = new HashMap<String, Map<T,T>>();
		this.configLists = new HashMap<String, List<T>>();
	}
	
	
	public void addMap(String id, Map<T, T> newMap){
		if (newMap != null && !newMap.isEmpty() && id != null && configMaps != null){
			configMaps.put(id, newMap);
			
			if (id.equals(GeneratorConstants.USERS)){
				this.canManageUsers = true;
			}
			if (id.equals(GeneratorConstants.HUDSON_PROPERTIES)){
				this.canManageHudsonProperties = true;
			}
			if (id.equals(GeneratorConstants.GENERATION_LOCATION)){
				this.canManageGenerationLocation = true;
			}
		}
	}
	
	public Map<T, T> getMap(String id){
		if (id != null){
			if (id.equals(GeneratorConstants.USERS) && canManageUsers) {
				return this.configMaps.get(id);
			}
			if (id.equals(GeneratorConstants.HUDSON_PROPERTIES) && canManageHudsonProperties) {
				return this.configMaps.get(id);
			}
			if (id.equals(GeneratorConstants.GENERATION_LOCATION) && canManageGenerationLocation) {
				return this.configMaps.get(id);
			}
		}
		return null;
	}
	
	public void addList(String id, List<T> newList){
		if (newList != null && !newList.isEmpty() && id != null && configLists != null){
			configLists.put(id, newList);
			
			if (id.equals(GeneratorConstants.SOURCE_FOLDERS)){
				this.canManageSourceFolders = true;
			}
			if (id.equals(GeneratorConstants.CRON_TRIGGERS)){
				this.canManageCronTriggers = true;
			}
			if (id.equals(GeneratorConstants.SCM_TRIGGERS)){
				this.canManageSCMTriggers = true;
			}
		}
	}
	
	public List<T> getList(String id){
		if (id != null){
			if (id.equals(GeneratorConstants.SOURCE_FOLDERS) && canManageSourceFolders) {
				return this.configLists.get(id);
			}
			if (id.equals(GeneratorConstants.CRON_TRIGGERS) && canManageCronTriggers) {
				return this.configLists.get(id);
			}
			if (id.equals(GeneratorConstants.SCM_TRIGGERS) && canManageSCMTriggers) {
				return this.configLists.get(id);
			}
		}
		return null;
	}

	public Map<String, Map<T, T>> getConfigMaps() {
		return configMaps;
	}


	public void setConfigMaps(Map<String, Map<T, T>> configMaps) {
		this.configMaps = configMaps;
	}


	public Map<String, List<T>> getConfigLists() {
		return configLists;
	}


	public void setConfigLists(Map<String, List<T>> configLists) {
		this.configLists = configLists;
	}


	public boolean iscanManageSourceFolders() {
		return canManageSourceFolders;
	}


	public boolean iscanManageCronTriggers() {
		return canManageCronTriggers;
	}


	public boolean iscanManageSCMTriggers() {
		return canManageSCMTriggers;
	}


	public boolean iscanManageUsers() {
		return canManageUsers;
	}


	public boolean iscanManageHudsonProperties() {
		return canManageHudsonProperties;
	}


	public boolean iscanManageGenerationLocation() {
		return canManageGenerationLocation;
	}
}
