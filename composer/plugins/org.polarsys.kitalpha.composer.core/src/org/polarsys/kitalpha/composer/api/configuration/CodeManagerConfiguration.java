/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api.configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.polarsys.kitalpha.composer.api.CodeManagerCadenceLaunchConfiguration;
import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.extension.points.IGenerator;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;

/**
 * @author Yann Mortier
 */
public class CodeManagerConfiguration {

	private CodeManagerCadenceLaunchConfiguration codeManagerCadenceLaunchConfiguration;

	//
	// Only one of these four
	//

	private ICodeManagerInput input;

	private Map<String, Parameter> strategyParameters;

	private IStrategy strategy;

	private Map<String, Parameter> refineryParameters;

	private IRefinery refinery;

	private Map<String, Parameter> generatorParameters;
	
	private List<org.polarsys.kitalpha.resourcereuse.model.Resource> libraries;
	
	private String noFound;

	private IGenerator generator;

	private boolean saveAllocationModel;

	private IPath destinationFolder;
	

	public CodeManagerConfiguration() {
		this.codeManagerCadenceLaunchConfiguration = new CodeManagerCadenceLaunchConfiguration();
		this.strategyParameters = new HashMap<String, Parameter>();
		this.refineryParameters = new HashMap<String, Parameter>();
		this.strategyParameters = new HashMap<String, Parameter>();
		this.generatorParameters = new HashMap<String, Parameter>();
		this.saveAllocationModel = false;
	}

	public void setResourceSet(ResourceSet resourceSet) {
		this.input = CodeManagerInputFactory.create(resourceSet);
	}

	public void setResource(Resource resource) {
		this.input = CodeManagerInputFactory.create(resource);
	}

	public void setObjects(List<EObject> objects) {
		this.input = CodeManagerInputFactory.create(objects);
	}

	public void setRoot(EObject eObject) {
		this.input = CodeManagerInputFactory.create(eObject);
	}

	public ICodeManagerInput getInput() {
		return input;
	}
	
	public void setInput(ICodeManagerInput input) {
		this.input = input;
	}

	/**
	 * @return the codeManagerCadenceLaunchConfiguration
	 */
	public CodeManagerCadenceLaunchConfiguration getCodeManagerCadenceLaunchConfiguration() {
		return codeManagerCadenceLaunchConfiguration;
	}

	/**
	 * @param codeManagerCadenceLaunchConfiguration
	 *            the codeManagerCadenceLaunchConfiguration to set
	 */
	public void setCodeManagerCadenceLaunchConfiguration(
			CodeManagerCadenceLaunchConfiguration codeManagerCadenceLaunchConfiguration) {
		this.codeManagerCadenceLaunchConfiguration = codeManagerCadenceLaunchConfiguration;
	}

	/**
	 * @return the strategyParameters
	 */
	public Map<String, Parameter> getStrategyParameters() {
		return strategyParameters;
	}

	/**
	 * @param strategyParameters
	 *            the strategyParameters to set
	 */
	public void setStrategyParameters(Map<String, Parameter> strategyParameters) {
		this.strategyParameters = strategyParameters;
	}

	/**
	 * @return the strategy
	 */
	public IStrategy getStrategy() {
		return strategy;
	}

	/**
	 * @param strategy
	 *            the strategy to set
	 */
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * @return the refineryParameters
	 */
	public Map<String, Parameter> getRefineryParameters() {
		return refineryParameters;
	}

	/**
	 * @param refineryParameters
	 *            the refineryParameters to set
	 */
	public void setRefineryParameters(Map<String, Parameter> refineryParameters) {
		this.refineryParameters = refineryParameters;
	}

	/**
	 * @return the refinery
	 */
	public IRefinery getRefinery() {
		return refinery;
	}

	/**
	 * @param refinery
	 *            the refinery to set
	 */
	public void setRefinery(IRefinery refinery) {
		this.refinery = refinery;
	}

	/**
	 * @return the generatorParameters
	 */
	public Map<String, Parameter> getGeneratorParameters() {
		return generatorParameters;
	}

	/**
	 * @param generatorParameters
	 *            the generatorParameters to set
	 */
	public void setGeneratorParameters(
			Map<String, Parameter> generatorParameters) {
		this.generatorParameters = generatorParameters;
	}

	/**
	 * @return the generator
	 */
	public IGenerator getGenerator() {
		return generator;
	}

	/**
	 * @param generator
	 *            the generator to set
	 */
	public void setGenerator(IGenerator generator) {
		this.generator = generator;
	}

	/**
	 * @return the saveAllocationModel
	 */
	public boolean isSaveAllocationModel() {
		return saveAllocationModel;
	}

	/**
	 * @param saveAllocationModel
	 *            the saveAllocationModel to set
	 */
	public void setSaveAllocationModel(boolean saveAllocationModel) {
		this.saveAllocationModel = saveAllocationModel;
	}

	/**
	 * @return the destinationFolder
	 */
	public IPath getDestinationFolder() {
		return destinationFolder;
	}

	
	/**
	 * @param destinationFolder
	 *            the destinationFolder to set
	 */
	public void setDestinationFolder(IPath destinationFolder) {
		this.destinationFolder = destinationFolder;
	}

	
	
	/**
	 * @return the resources used
	 */
	public List<org.polarsys.kitalpha.resourcereuse.model.Resource> getLibraries() {
		return libraries;
	}

	/**
	 * @param libraries
	 * 			the libraries used in the configuration
	 */
	public void setLibraries(List<org.polarsys.kitalpha.resourcereuse.model.Resource> libraries) {
		this.libraries = libraries;
	}

	/**
	 * @return the path used for the empty libraries
	 * (if empty , we use the Strategy)
	 */
	public String getNoFound() {
		return noFound;
	}
	
	/**
	 * @param noFound
	 * 			the path used 	 
	 */
	public void setNoFound(String noFound) {
		this.noFound = noFound;
	}
	
}
