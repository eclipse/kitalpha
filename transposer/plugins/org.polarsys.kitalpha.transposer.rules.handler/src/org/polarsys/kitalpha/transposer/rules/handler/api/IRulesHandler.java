/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.api;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.purposes.NonExistingPurposeException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.ComputePremisesException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;

/**
 * IRulesHandler objects are responsible for rule discovery and rule inference.
 * @author Guillaume GEBHART
 * 
 */
public interface IRulesHandler {

	/**
	 * Sets a default context.
	 * @param defaultContext_p the context
	 */
	void setContext(IContext defaultContext_p);

	/**
	 * Returns the current context.
	 * @return IContext
	 */
	IContext getContext();

	/**
	 * Initializes the rule handler for the given purpose.
	 * @param purpose_p the mapping purpose selected
	 * @param mappingID_p the mapping id selected
	 * 
	 */
	void init(String purpose_p, String mappingID_p) throws NonExistingPurposeException;
	/**
	 * Disposes the RuleHandler object.
	 */
	void dispose();

	/**
	 * Returns the possibity in the current context.
	 * 
	 * @param <T> common ancestor of all Metaclasses
	 * @param object_p object on which the found rule must be applicable
	 * @throws MappingPossibilityResolutionException
	 */
	MappingPossibility getApplicablePossibility(Object object_p) throws MappingPossibilityResolutionException;

	/**
	 * Returns the premises declared by the applicable rule on the given object for the given purpose.
	 * 
	 * @param object_p object on which the found rule must be applied

	 * 
	 * @throws ComputePremisesException
	 */
	List<IPremise> getPremises(Object object_p) throws ComputePremisesException;

	boolean apply(Object object_p, boolean complete_p, IProgressMonitor monitor_p) throws RuleExecutionException;
	/**
	 * Returns the mapping purpose.
	 * @return String
	 */
	String getPurpose();
	/**
	 * Returns the DomainHelper of the selected mapping.
	 * @return IDomainHelper
	 */
	IDomainHelper getDomainHelper();

	/**
	 * Validate the registered mappings.
	 * 
	 */
	//@return true if there is no detected issues with contributed mappings.
	void validatePurpose();
}