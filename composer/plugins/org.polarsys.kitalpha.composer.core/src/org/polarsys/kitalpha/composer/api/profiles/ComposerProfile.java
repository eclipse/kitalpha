/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api.profiles;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes a generation plan for composer.
 * 
 * @author Yann Mortier
 */
public class ComposerProfile {

	/**
	 * The unique identifier of the generation plan.
	 */
	private String id;

	/**
	 * The name of the generation plan.
	 */
	private String name;

	/**
	 * the allocation binding NsURI.
	 */
	private String allocationBinding;
	private String allocationBindingId;
	/**
	 * The strategy.
	 */
	private ParameterizedProfileElement strategy;

	/**
	 * The refinery.
	 */
	private ParameterizedProfileElement refinery;

	/**
	 * The generator.
	 */
	private ParameterizedProfileElement generator;

	/**
	 * List of all activities to execute before the strategy.
	 */
	private List<ParameterizedProfileElement> beforeStrategyActivities = new ArrayList<ParameterizedProfileElement>();

	/**
	 * List of all activities to execute before the refinery.
	 */
	private List<ParameterizedProfileElement> beforeRefineryActivities = new ArrayList<ParameterizedProfileElement>();

	/**
	 * List of all activities to execute before the generator.
	 */
	private List<ParameterizedProfileElement> beforeGeneratorActivities = new ArrayList<ParameterizedProfileElement>();

	/**
	 * List of all activities to execute after the generator.
	 */
	private List<ParameterizedProfileElement> afterGeneratorActivities = new ArrayList<ParameterizedProfileElement>();

	/**
	 * Returns the unique identifier of the generation plan.
	 * 
	 * @return the unique identifier of the generation plan.
	 */

	/**
	 * List of the selected libraries
	 */
	private List<String> libraries;

	public String getId() {
		return id;
	}

	/**
	 * Defines the unique identifier of the generation plan.
	 * 
	 * @param id
	 *            the unique identifier of the generation plan.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns the name of this generation plan.
	 * 
	 * @return the name of this generation plan.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of this generation plan.
	 * 
	 * @param name
	 *            the name of this generation plan.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the allocation NsURI (binding) of this generation plan.
	 * 
	 * @return the allocation NsURI (binding) of this generation plan.
	 */
	public String getAllocationBinding() {
		return allocationBinding;
	}

	/**
	 * Sets the allocation NsURI (binding) of this generation plan.
	 * 
	 * @param allocationBinding
	 *            the allocation NsURI (binding) of this generation plan.
	 */
	public void setAllocationBinding(String allocationBinding) {
		this.allocationBinding = allocationBinding;
	}

	/**
	 * @return the allocationBindingId
	 */
	public String getAllocationBindingId() {
		return allocationBindingId;
	}

	/**
	 * @param allocationBindingId the allocationBindingId to set
	 */
	public void setAllocationBindingId(String allocationBindingId) {
		this.allocationBindingId = allocationBindingId;
	}

	/**
	 * Returns the strategy to execute.
	 * 
	 * @return the strategy to execute.
	 */
	public ParameterizedProfileElement getStrategy() {
		return strategy;
	}

	/**
	 * Sets the strategy to execute.
	 * 
	 * @param strategy
	 *            the strategy to execute.
	 */
	public void setStrategy(ParameterizedProfileElement strategy) {
		this.strategy = strategy;
	}

	/**
	 * Returns the refinery to execute.
	 * 
	 * @return the refinery to execute.
	 */
	public ParameterizedProfileElement getRefinery() {
		return refinery;
	}

	/**
	 * Sets the refinery to execute.
	 * 
	 * @param refinery
	 *            the refinery to execute.
	 */
	public void setRefinery(ParameterizedProfileElement refinery) {
		this.refinery = refinery;
	}

	/**
	 * Returns the generator to execute.
	 * 
	 * @return the generator to execute.
	 */
	public ParameterizedProfileElement getGenerator() {
		return generator;
	}

	/**
	 * Sets the generator to execute.
	 * 
	 * @param generator
	 *            the generator to execute.
	 */
	public void setGenerator(ParameterizedProfileElement generator) {
		this.generator = generator;
	}

	/**
	 * Returns the activities to execute before the strategy. The returned list
	 * is modifiable.
	 * 
	 * @return the activities to execute before the strategy.
	 */
	public List<ParameterizedProfileElement> getBeforeStrategyActivities() {
		return beforeStrategyActivities;
	}

	/**
	 * Returns the activities to execute before the refinery. The returned list
	 * is modifiable.
	 * 
	 * @return the activities to execute before the refinery.
	 */
	public List<ParameterizedProfileElement> getBeforeRefineryActivities() {
		return beforeRefineryActivities;
	}

	/**
	 * Returns the activities to execute before the generator. The returned list
	 * is modifiable.
	 * 
	 * @return the activities to execute before the generator.
	 */
	public List<ParameterizedProfileElement> getBeforeGeneratorActivities() {
		return beforeGeneratorActivities;
	}

	/**
	 * Returns the activities to execute after the generator. The returned list
	 * is modifiable.
	 * 
	 * @return the activities to execute after the generator.
	 */
	public List<ParameterizedProfileElement> getAfterGeneratorActivities() {
		return afterGeneratorActivities;
	}

	/**
	 * Set the libaries used in the profile
	 * 
	 * @param libraries
	 */
	public void setLibraries(List<String> libraries) {
		this.libraries = libraries;

	}

	/**
	 * Returns the libraries used in the profile
	 * 
	 * @return the libraries list
	 */
	public List<String> getLibraries() {
		return libraries;
	}
}
