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
package org.polarsys.kitalpha.composer.api.library;

import java.util.List;
import java.util.Map;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Guillaume Gebhart
 * This helper allows to use Libraries selection in a refinery
 */
public class LibraryRuntimeHelper {

	public static LibraryRuntimeHelper INSTANCE = new LibraryRuntimeHelper();
	private List<Resource> selected;
	private Object missing;
	private Map<String, Parameter> strategyParameters;
	
	/**
	 * @return the strategyParameters
	 */
	public Map<String, Parameter> getStrategyParameters() {
		return strategyParameters;
	}

	private  LibraryRuntimeHelper(){
	}

	/**
	 * @param selected the selected to set
	 */
	public void setLibraries(List<Resource> selected) {
		this.selected = selected;
	}

	/**
	 * @return the selected
	 */
	public List<Resource> getLibraries() {
		return selected;
	}

	/**
	 * @param path the path to set
	 */
	public void setMissing(String path) {
		this.missing = path;
	}

	public void setMissing(IStrategy strategy,Map<String, Parameter> parameters) {
		this.missing = strategy;
		this.strategyParameters = parameters;
	}
	
	/**
	 * Return 
	 * @return the path
	 */
	public Object getMissing() {
		return missing;
	}
}
